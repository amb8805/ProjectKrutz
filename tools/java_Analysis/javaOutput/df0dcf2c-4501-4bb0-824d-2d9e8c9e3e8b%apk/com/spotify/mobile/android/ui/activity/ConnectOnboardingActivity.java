package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils.TruncateAt;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.service.connections.b;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.z;
import java.util.ArrayList;
import java.util.List;

public class ConnectOnboardingActivity extends BaseFragmentActivity
  implements com.spotify.mobile.android.service.connections.g
{
  private DialogLayout n;
  private ImageView o;
  private TextView p;
  private b q;
  private boolean r = false;
  private boolean s = false;
  private dt t;
  private ConnectDevice u;
  private ClientEvent.SubEvent v = ClientEvent.SubEvent.a;
  private a w = (a)c.a(a.class);
  private long x;
  private int y;

  public ConnectOnboardingActivity()
  {
  }

  public static Intent a(Context paramContext, ArrayList<ConnectDevice> paramArrayList)
  {
    cc.a(paramContext);
    cc.a(paramArrayList);
    Intent localIntent = new Intent(paramContext, ConnectOnboardingActivity.class);
    localIntent.putParcelableArrayListExtra("hardware_devices", paramArrayList);
    return localIntent;
  }

  private void a(ConnectDevice paramConnectDevice)
  {
    this.u = paramConnectDevice;
    this.p.setText(this.u.b());
    switch (ConnectOnboardingActivity.4.a[this.u.j().ordinal()])
    {
    default:
      this.o.setImageResource(2130837993);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      z.b(cw.b(this));
      return;
      this.o.setImageResource(2130837990);
      continue;
      this.o.setImageResource(2130837994);
      continue;
      this.o.setImageResource(2130837992);
      continue;
      this.o.setImageResource(2130837995);
      continue;
      this.o.setImageResource(2130837991);
    }
  }

  public final void a()
  {
    this.r = true;
    this.q.a();
    this.q.a(new ConnectOnboardingActivity.3(this));
  }

  public final void b()
  {
    this.r = false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.n = new DialogLayout(this);
    setContentView(this.n);
    this.t = dv.a(this, ViewUri.aK);
    this.n.a(2131689745, new ConnectOnboardingActivity.1(this));
    this.n.b(2131689746, new ConnectOnboardingActivity.2(this));
    LinearLayout localLinearLayout = new LinearLayout(this);
    localLinearLayout.setOrientation(1);
    this.o = new ImageView(this);
    int i = getResources().getDimensionPixelSize(2131427398);
    int j = getResources().getDimensionPixelSize(2131427399);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(i, -2);
    localLayoutParams1.gravity = 1;
    localLayoutParams1.setMargins(0, j, 0, 0);
    TextView localTextView1 = new TextView(this);
    localTextView1.setText(getResources().getString(2131689748) + "\n" + getResources().getString(2131689747));
    localTextView1.setGravity(1);
    com.spotify.android.paste.widget.g.b(this, localTextView1, 2130772392);
    this.p = new TextView(this);
    this.p.setSingleLine(true);
    this.p.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    this.p.setMarqueeRepeatLimit(-1);
    this.p.setGravity(1);
    this.p.setHorizontallyScrolling(true);
    this.p.setFocusableInTouchMode(true);
    this.p.setFocusable(true);
    com.spotify.android.paste.widget.g.b(this, this.p, 2130772386);
    TextView localTextView2 = new TextView(this);
    localTextView2.setText(2131689744);
    localTextView2.setGravity(1);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams2.setMargins(0, j, 0, j);
    com.spotify.android.paste.widget.g.b(this, localTextView2, 2130772386);
    localLinearLayout.addView(this.o, localLayoutParams1);
    localLinearLayout.addView(localTextView1);
    localLinearLayout.addView(this.p);
    localLinearLayout.addView(localTextView2, localLayoutParams2);
    this.n.a(localLinearLayout);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
  }

  protected void onPause()
  {
    super.onPause();
    this.s = false;
    setResult(-1);
    this.t.b();
    if (this.u != null)
    {
      long l = SystemClock.elapsedRealtime() - this.x;
      int i = getResources().getConfiguration().orientation;
      boolean bool = false;
      if (2 == i)
        bool = true;
      ClientEvent localClientEvent = ClientEvent.a("gaia-onboarding", this.v, null, null);
      localClientEvent.a("popup-duration", String.valueOf(l));
      localClientEvent.a("landscape-orientation", String.valueOf(bool));
      localClientEvent.a("device-count", String.valueOf(this.y));
      a.a(this, ViewUri.aK, ViewUri.SubView.I, localClientEvent);
    }
  }

  protected void onResume()
  {
    super.onResume();
    this.t.a();
    this.x = SystemClock.elapsedRealtime();
    this.s = true;
    ArrayList localArrayList = getIntent().getParcelableArrayListExtra("hardware_devices");
    if ((localArrayList == null) || (localArrayList.size() == 0))
    {
      this.v = ClientEvent.SubEvent.aq;
      finish();
      return;
    }
    a((ConnectDevice)localArrayList.get(0));
  }

  public void onStart()
  {
    super.onStart();
    this.q = new b(this);
    this.q.a(this);
    this.q.e();
  }

  public void onStop()
  {
    super.onStop();
    if (this.r)
    {
      this.q.a();
      this.q.f();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.ConnectOnboardingActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
