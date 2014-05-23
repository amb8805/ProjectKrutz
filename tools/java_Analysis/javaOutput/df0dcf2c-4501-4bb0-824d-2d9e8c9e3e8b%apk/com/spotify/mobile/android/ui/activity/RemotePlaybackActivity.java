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
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.service.ConnectDevice.DeviceType;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.z;

public class RemotePlaybackActivity extends BaseFragmentActivity
  implements com.spotify.mobile.android.service.connections.g
{
  private cw A;
  boolean n;
  private com.spotify.mobile.android.ui.actions.b o;
  private long p;
  private a q = (a)com.spotify.mobile.android.c.c.a(a.class);
  private ClientEvent.SubEvent r = ClientEvent.SubEvent.a;
  private dt s;
  private ConnectDevice t;
  private com.spotify.mobile.android.service.connections.b u;
  private boolean v = false;
  private boolean w = false;
  private DialogLayout x;
  private ImageView y;
  private TextView z;

  public RemotePlaybackActivity()
  {
  }

  public static Intent a(Context paramContext, ConnectDevice paramConnectDevice)
  {
    cc.a(paramContext);
    cc.a(paramConnectDevice);
    Intent localIntent = new Intent(paramContext, RemotePlaybackActivity.class);
    localIntent.putExtra("active_device", paramConnectDevice);
    return localIntent;
  }

  private void a(ConnectDevice paramConnectDevice)
  {
    Assertion.a(paramConnectDevice);
    this.t = paramConnectDevice;
    String str = this.t.b();
    this.z.setText(str);
    if (this.n)
      switch (RemotePlaybackActivity.4.a[this.t.j().ordinal()])
      {
      default:
        this.y.setImageResource(2130837993);
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
    while (true)
    {
      z.a(this.A, com.spotify.mobile.android.service.c.a(paramConnectDevice));
      return;
      this.y.setImageResource(2130837990);
      continue;
      this.y.setImageResource(2130837994);
      continue;
      this.y.setImageResource(2130837992);
      continue;
      this.y.setImageResource(2130837995);
      continue;
      this.y.setImageResource(2130837991);
    }
  }

  public final void a()
  {
    this.v = true;
    this.u.a();
    this.u.a(new RemotePlaybackActivity.3(this));
  }

  public final void b()
  {
    this.v = false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (((dk)com.spotify.mobile.android.c.c.a(dk.class)).b())
      setTheme(2131755252);
    while (true)
    {
      this.A = cw.a(this);
      this.x = new DialogLayout(this);
      setContentView(this.x);
      this.s = dv.a(this, ViewUri.aJ);
      this.o = ((com.spotify.mobile.android.ui.actions.b)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.b.class));
      this.x.a(2131689755);
      this.x.a(2131689753, new RemotePlaybackActivity.1(this));
      this.x.b(2131689754, new RemotePlaybackActivity.2(this));
      LinearLayout localLinearLayout = new LinearLayout(this);
      localLinearLayout.setOrientation(1);
      this.z = new TextView(this);
      this.z.setSingleLine(true);
      this.z.setEllipsize(TextUtils.TruncateAt.MARQUEE);
      this.z.setMarqueeRepeatLimit(-1);
      this.z.setGravity(1);
      this.z.setHorizontallyScrolling(true);
      this.z.setFocusableInTouchMode(true);
      this.z.setFocusable(true);
      com.spotify.android.paste.widget.g.b(this, this.z, 2130772392);
      localLinearLayout.addView(this.z);
      this.n = getResources().getBoolean(2131230726);
      if (this.n)
      {
        this.y = new ImageView(this);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
        localLayoutParams.setMargins(0, getResources().getDimensionPixelSize(2131427399), 0, 0);
        localLinearLayout.addView(this.y, localLayoutParams);
      }
      this.x.a(localLinearLayout);
      return;
      setTheme(2131755260);
    }
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
  }

  protected void onPause()
  {
    super.onPause();
    this.w = false;
    this.s.b();
    setResult(-1);
    if (this.t != null)
    {
      long l = SystemClock.elapsedRealtime() - this.p;
      int i = getResources().getConfiguration().orientation;
      boolean bool = false;
      if (2 == i)
        bool = true;
      ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.U, this.r);
      localClientEvent.a("popup-duration", String.valueOf(l));
      localClientEvent.a("device-type", String.valueOf(this.t.j().ordinal()));
      localClientEvent.a("landscape-orientation", String.valueOf(bool));
      a.a(this, ViewUri.aJ, ViewUri.SubView.G, localClientEvent);
    }
  }

  protected void onResume()
  {
    super.onResume();
    this.w = true;
    this.p = SystemClock.elapsedRealtime();
    this.s.a();
    Intent localIntent = getIntent();
    ConnectDevice localConnectDevice1 = (ConnectDevice)localIntent.getParcelableExtra("active_device");
    if ((localConnectDevice1 != null) && (localConnectDevice1.a() != null))
    {
      ConnectDevice localConnectDevice2 = (ConnectDevice)localIntent.getParcelableExtra("active_device");
      Assertion.a(localConnectDevice2);
      a(localConnectDevice2);
      return;
    }
    this.r = ClientEvent.SubEvent.aq;
    finish();
  }

  public void onStart()
  {
    super.onStart();
    this.u = new com.spotify.mobile.android.service.connections.b(this);
    this.u.a(this);
    this.u.e();
  }

  public void onStop()
  {
    super.onStop();
    if (this.v)
    {
      this.u.a();
      this.u.f();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.RemotePlaybackActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
