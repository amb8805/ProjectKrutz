package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.android.paste.widget.SpotifyIconView;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.actions.d;
import com.spotify.mobile.android.ui.activity.BaseFragmentActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;

public class UpsellDialogActivity extends BaseFragmentActivity
{
  private ViewUri.Verified n;
  private ViewUri.SubView o;
  private Uri p;
  private d q = (d)c.a(d.class);
  private a r = (a)c.a(a.class);
  private Button s;
  private Button t;
  private View.OnClickListener u = new UpsellDialogActivity.2(this);
  private View.OnClickListener v = new UpsellDialogActivity.3(this);
  private View.OnClickListener w = new UpsellDialogActivity.4(this);
  private View.OnClickListener x = new UpsellDialogActivity.5(this);

  public UpsellDialogActivity()
  {
  }

  public static Intent a(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, UpsellDialogActivity.class);
    localIntent.putExtra("type", paramInt);
    return localIntent;
  }

  private void a(LinearLayout paramLinearLayout, int paramInt)
  {
    LinearLayout localLinearLayout = new LinearLayout(this);
    localLinearLayout.setOrientation(0);
    TextView localTextView = h.a(this, paramLinearLayout);
    localTextView.setText(paramInt);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams1.weight = 1.0F;
    localLayoutParams1.gravity = 16;
    localLinearLayout.addView(localTextView, localLayoutParams1);
    SpotifyIconView localSpotifyIconView = h.f(this, localLinearLayout);
    localSpotifyIconView.a(getResources().getColor(2131296400));
    localSpotifyIconView.a(SpotifyIcon.k);
    int i = getResources().getDimensionPixelSize(2131427491);
    localLinearLayout.addView(localSpotifyIconView, new LinearLayout.LayoutParams(i, i));
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
    int j = getResources().getDimensionPixelOffset(2131427492);
    localLayoutParams2.setMargins(0, j, 0, j);
    paramLinearLayout.addView(localLinearLayout, localLayoutParams2);
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 2131690379;
    super.onCreate(paramBundle);
    int j;
    DialogLayout localDialogLayout;
    Uri localUri;
    label110: int m;
    label197: ClientInfo localClientInfo;
    label336: String str2;
    if (((dk)c.a(dk.class)).b())
    {
      setTheme(2131755252);
      j = 1;
      localDialogLayout = new DialogLayout(this);
      setContentView(localDialogLayout);
      setResult(0);
      int k = getIntent().getIntExtra("type", -1);
      Assertion.b(Integer.valueOf(-1), Integer.valueOf(k));
      String str1 = getIntent().getStringExtra("shuffle_content_uri");
      if (paramBundle != null)
        str1 = paramBundle.getString("shuffle_content_uri");
      if (str1 == null)
        break label532;
      localUri = Uri.parse(str1);
      this.p = localUri;
      switch (k)
      {
      default:
        Assertion.a("Bad upsell dialog type " + k);
        i = 0;
        m = 0;
        localClientInfo = (ClientInfo)c.a(ClientInfo.class);
        localDialogLayout.a(m);
        LinearLayout localLinearLayout = new LinearLayout(this);
        localLinearLayout.setGravity(1);
        localLinearLayout.setOrientation(1);
        int i1 = getResources().getDimensionPixelOffset(2131427490);
        localLinearLayout.setPadding(i1, i1, i1, i1);
        this.s = h.d(this, localLinearLayout);
        boolean bool = getResources().getBoolean(2131230729);
        if ((j != 0) && (bool))
        {
          a(localLinearLayout, 2131690389);
          a(localLinearLayout, 2131690385);
          a(localLinearLayout, 2131690386);
          a(localLinearLayout, 2131690388);
          a(localLinearLayout, 2131690387);
          LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
          localLayoutParams.setMargins(0, getResources().getDimensionPixelSize(2131427489), 0, 0);
          localLinearLayout.addView(this.s, localLayoutParams);
          this.t = h.e(this, localLinearLayout);
          this.t.setText(2131690374);
          this.t.setOnClickListener(new UpsellDialogActivity.1(this));
          localLinearLayout.addView(this.t, localLayoutParams);
          localDialogLayout.a(localLinearLayout);
          if (CheckOptInTrialEligibilityTask.a() != CheckOptInTrialEligibilityTask.State.b)
            break label818;
          this.s.setText(2131690376);
          this.s.setOnClickListener(this.v);
          str2 = "NTX_ab_deferred_trial";
        }
      case 1:
      case 2:
      case 3:
      case 5:
      case 0:
      case 4:
      case 6:
      case 7:
      case 8:
      case 9:
      }
    }
    while (true)
    {
      a(dv.a(this, this.n));
      if (paramBundle == null)
      {
        ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.Y);
        localClientEvent.a(str2);
        a.a(this, ViewUri.ad, this.o, localClientEvent);
      }
      return;
      setTheme(2131755260);
      j = 0;
      break;
      label532: localUri = null;
      break label110;
      this.n = ViewUri.ag;
      this.o = ViewUri.SubView.i;
      m = 2131690397;
      i = 2131690396;
      break label197;
      this.n = ViewUri.ah;
      this.o = ViewUri.SubView.j;
      m = 2131690391;
      i = 2131690390;
      break label197;
      this.n = ViewUri.ai;
      this.o = ViewUri.SubView.k;
      m = 2131690393;
      i = 2131690392;
      break label197;
      this.n = ViewUri.af;
      this.o = ViewUri.SubView.r;
      m = 2131690395;
      i = 2131690394;
      break label197;
      m = 2131690400;
      i = 2131690399;
      this.n = ViewUri.af;
      if (this.p == null);
      for (ViewUri.SubView localSubView = ViewUri.SubView.l; ; localSubView = ViewUri.SubView.r)
      {
        this.o = localSubView;
        break;
      }
      this.n = ViewUri.aj;
      this.o = ViewUri.SubView.m;
      m = 2131690378;
      i = 2131690377;
      break label197;
      this.n = ViewUri.am;
      this.o = ViewUri.SubView.n;
      m = 2131690380;
      break label197;
      this.n = ViewUri.ae;
      this.o = ViewUri.SubView.o;
      m = 2131690384;
      i = 2131690383;
      break label197;
      this.n = ViewUri.ae;
      this.o = ViewUri.SubView.p;
      m = 2131690382;
      i = 2131690381;
      break label197;
      this.n = ViewUri.an;
      this.o = ViewUri.SubView.H;
      m = 2131690398;
      break label197;
      localDialogLayout.c(i);
      break label336;
      label818: if (localClientInfo.d())
      {
        this.s.setText(2131690373);
        this.s.setOnClickListener(this.u);
        str2 = "";
      }
      else if (this.p != null)
      {
        this.s.setText(2131690375);
        this.s.setOnClickListener(this.w);
        str2 = "";
      }
      else
      {
        this.t.setVisibility(8);
        this.s.setText(2131690372);
        this.s.setOnClickListener(this.x);
        str2 = "";
      }
    }
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.p != null)
      paramBundle.putString("shuffle_content_uri", this.p.toString());
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.upsell.UpsellDialogActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
