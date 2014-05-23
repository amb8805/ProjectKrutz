package com.spotify.mobile.android.ui.fragments;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.adapter.i;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.view.RateLimitedSeekBar;
import com.spotify.mobile.android.ui.view.r;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.dh;
import com.spotify.mobile.android.util.di;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.dy;
import java.util.ArrayList;

public final class c extends Fragment
  implements com.spotify.mobile.android.service.connections.g, g
{
  private static final String[] b = { "volume" };
  private dt Y;
  private ArrayList<ConnectDevice> Z;
  o<Cursor> a = new c.5(this);
  private boolean aa = false;
  private float ab = 0.0F;
  private boolean ac = false;
  private dh ad;
  private long ae = 0L;
  private boolean af;
  private Handler ag;
  private a ah = (a)com.spotify.mobile.android.c.c.a(a.class);
  private boolean ai;
  private int aj = 0;
  private boolean ak = false;
  private boolean al = false;
  private com.spotify.mobile.android.service.connections.b am;
  private boolean an = false;
  private di ao;
  private r ap = new c.6(this);
  private View c;
  private View d;
  private View e;
  private ListView f;
  private RateLimitedSeekBar g;
  private LinearLayout h;
  private i i;

  public c()
  {
  }

  public static c D()
  {
    return new c();
  }

  public final Fragment C()
  {
    return this;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.al = f.a(i());
    View localView1;
    if (this.al)
    {
      localView1 = paramLayoutInflater.inflate(2130903135, paramViewGroup, false);
      ((TextView)localView1.findViewById(2131362227)).setText(2131689752);
      this.f = ((ListView)localView1.findViewById(2131362379));
      if (!this.al)
        break label226;
      this.e = localView1.findViewById(2131362381);
      this.d = null;
    }
    while (true)
    {
      this.i = new i();
      this.f.setAdapter(this.i);
      this.f.setOnItemClickListener(new c.4(this));
      this.g = ((RateLimitedSeekBar)localView1.findViewById(2131362377));
      this.g.setMax(100);
      this.g.a(this.ab);
      this.g.a();
      this.g.b();
      this.g.a(this.ap);
      this.h = ((LinearLayout)localView1.findViewById(2131362376));
      this.ao = new c.2(this);
      return localView1;
      localView1 = paramLayoutInflater.inflate(2130903134, paramViewGroup, false);
      break;
      label226: View localView2 = paramLayoutInflater.inflate(2130903164, null, false);
      this.f.addHeaderView(localView2, null, false);
      this.d = localView2.findViewById(2131362457);
      this.e = localView2.findViewById(2131362381);
      ImageButton localImageButton = (ImageButton)localView1.findViewById(2131362265);
      localImageButton.setImageDrawable(k.i(i()));
      localImageButton.setOnClickListener(new c.1(this));
    }
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131689752);
  }

  public final void a()
  {
    this.an = true;
    this.am.a(new c.3(this));
    this.am.c();
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ag = new Handler();
    this.Y = dv.a(i(), ViewUri.aI);
    a_(false);
    if (paramBundle != null)
    {
      this.aa = paramBundle.getBoolean("key_is_volume_visible");
      this.ab = paramBundle.getFloat("key_volume_level", 0.0F);
      this.ac = paramBundle.getBoolean("key_is_self_active");
    }
    this.ad = new dh(i(), this.ag);
    this.af = FeatureFragment.Y.a();
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    int j;
    int k;
    label49: ViewGroup.MarginLayoutParams localMarginLayoutParams;
    int m;
    if (this.af)
    {
      j = 2131689750;
      k = 0;
      if (!this.al)
        break label122;
      this.c = dy.a(v(), Integer.valueOf(2130838022), null, Integer.valueOf(j));
      if (k != 0)
        this.c.setVisibility(0);
      boolean bool = this.aa;
      localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.h.getLayoutParams();
      m = 0;
      if (!bool)
        break label163;
    }
    while (true)
    {
      localMarginLayoutParams.bottomMargin = m;
      this.h.requestLayout();
      return;
      j = 2131689751;
      this.e.setVisibility(8);
      k = 1;
      break;
      label122: this.c = dy.a(v(), Integer.valueOf(2130837996), null, Integer.valueOf(j));
      if (this.af)
        break label49;
      this.d.setVisibility(8);
      break label49;
      label163: m = -j().getDimensionPixelSize(2131427401);
    }
  }

  public final void b()
  {
    this.an = false;
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putBoolean("key_is_volume_visible", this.aa);
    paramBundle.putFloat("key_volume_level", this.ab);
    paramBundle.putBoolean("key_is_self_active", this.ac);
  }

  public final void p_()
  {
    super.p_();
    if (this.af)
    {
      this.am = new com.spotify.mobile.android.service.connections.b(i());
      this.am.a(this);
      this.am.e();
    }
    i().getContentResolver().registerContentObserver(dh.a, true, this.ad);
    this.ad.a(this.ao);
  }

  public final void q_()
  {
    super.q_();
    if ((this.af) && (this.an))
    {
      this.am.a();
      this.am.f();
    }
    i().getContentResolver().unregisterContentObserver(this.ad);
    this.ad.a(null);
  }

  public final void w()
  {
    super.w();
    this.ai = false;
    this.Y.a();
    if (this.am != null)
      this.am.d();
  }

  public final void x()
  {
    super.x();
    this.Y.b();
    int j = this.aj;
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.Z, ClientEvent.SubEvent.a);
    localClientEvent.a("device-count", String.valueOf(j));
    a.a(i(), ViewUri.aI, ViewUri.SubView.a, localClientEvent);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
