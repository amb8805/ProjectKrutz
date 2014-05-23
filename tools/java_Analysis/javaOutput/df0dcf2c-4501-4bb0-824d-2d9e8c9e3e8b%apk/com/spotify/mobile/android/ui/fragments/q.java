package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PorterDuff.Mode;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.spotify.mobile.android.service.managers.ConnectManager.DeviceState;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.actions.d;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.view.CancellableSeekBar;
import com.spotify.mobile.android.ui.view.ConnectIconView;
import com.spotify.mobile.android.ui.view.ConnectIconView.Aspect;
import com.spotify.mobile.android.ui.view.DisableableViewPager;
import com.spotify.mobile.android.ui.view.PlayerContentView;
import com.spotify.mobile.android.ui.view.PremiumUpsellBanner;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.bv;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.cy;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.aj;
import java.util.LinkedList;

public final class q extends Fragment
  implements com.spotify.mobile.android.service.connections.g, g
{
  static final String[] a = { "paused", "position", "length", "shuffle", "repeat_state", "is_prev_enabled", "is_next_enabled", "is_seek_enabled", "is_radio", "is_mock_radio", "is_radio_loading", "is_radio_improving", "radio_thumb_state", "context_type", "context_title", "context_owner", "context_uri", "is_ad_playing", "ad_url", "skips_remaining", "is_queue_available", "is_suggested_track", "state_cached_on", "is_shuffle_restricted" };
  private static final cy f = cy.a("is_skip_limit_ad_played");
  private static float g = 0.0F;
  private static float h = 0.0F;
  private TextView Y;
  private TextView Z;
  private boolean aA;
  private boolean aB;
  private boolean aC;
  private boolean aD;
  private boolean aE;
  private boolean aF;
  private boolean aG;
  private boolean aH;
  private int aI;
  private int aJ;
  private boolean aK;
  private com.spotify.mobile.android.model.c aL;
  private String aM;
  private int aN;
  private int aO;
  private com.spotify.mobile.android.ui.page.a.c aP;
  private com.spotify.mobile.android.ui.page.a.f aQ;
  private com.spotify.mobile.android.ui.page.a.f aR;
  private com.spotify.mobile.android.ui.page.a.f aS;
  private com.spotify.mobile.android.ui.page.a.f aT;
  private ConnectManager.DeviceState aU;
  private int aV = 0;
  private com.spotify.mobile.android.service.connections.b aW;
  private boolean aX = false;
  private a aY = (a)com.spotify.mobile.android.c.c.a(a.class);
  private d aZ = (d)com.spotify.mobile.android.c.c.a(d.class);
  private ImageButton aa;
  private ImageButton ab;
  private ImageButton ac;
  private ImageButton ad;
  private ImageButton ae;
  private ImageButton af;
  private ImageButton ag;
  private ImageButton ah;
  private ImageButton ai;
  private ConnectIconView aj;
  private View ak;
  private PremiumUpsellBanner al;
  private FrameLayout am;
  private View an;
  private CancellableSeekBar ao;
  private TextView ap;
  private TextView aq;
  private final bv ar = new bv();
  private final Runnable as = new q.1(this);
  private DisableableViewPager at;
  private final LinkedList<PlayerContentView> au = new LinkedList();
  private Handler av;
  private final Object aw = new Object();
  private r ax = null;
  private boolean ay;
  private int az;
  protected Cursor b;
  private com.spotify.mobile.android.ui.b.c ba = new com.spotify.mobile.android.ui.b.c();
  private Uri bb;
  private aj bc = new q.12(this);
  public int c;
  o<Cursor> d = new q.11(this);
  o<Cursor> e = new q.13(this);
  private View i;

  public q()
  {
  }

  private boolean E()
  {
    return (F()) && (this.aI == 0);
  }

  private boolean F()
  {
    return this.aI != -1;
  }

  public static ConnectIconView.Aspect a(ConnectManager.DeviceState paramDeviceState)
  {
    cc.a(paramDeviceState);
    switch (q.14.a[paramDeviceState.ordinal()])
    {
    default:
      return ConnectIconView.Aspect.a;
    case 1:
      return ConnectIconView.Aspect.b;
    case 2:
      return ConnectIconView.Aspect.c;
    case 3:
    }
    return ConnectIconView.Aspect.d;
  }

  public static void a(Context paramContext, ConnectIconView paramConnectIconView, int paramInt)
  {
    long l = SystemClock.elapsedRealtime();
    ViewUri.SubView localSubView = ViewUri.SubView.E;
    switch (q.14.b[paramConnectIconView.a().ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.U, ClientEvent.SubEvent.an);
      localClientEvent.a("last-hit", String.valueOf(l));
      localClientEvent.a("last-animation", String.valueOf(paramConnectIconView.b()));
      localClientEvent.a("numberOfDevices", String.valueOf(paramInt));
      com.spotify.mobile.android.c.c.a(a.class);
      a.a(paramContext, ViewUri.aH, localSubView, localClientEvent);
      return;
      localSubView = ViewUri.SubView.D;
      continue;
      localSubView = ViewUri.SubView.F;
    }
  }

  private Cursor b(int paramInt)
  {
    if (paramInt < 0)
      return null;
    if ((this.b == null) || (this.b.isClosed()) || (!this.b.moveToPosition(paramInt)))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      bp.d("No song information associated with position: %d", arrayOfObject);
      return null;
    }
    return this.b;
  }

  public final Fragment C()
  {
    return this;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    int j;
    View localView;
    ConnectIconView localConnectIconView;
    if (com.spotify.android.paste.widget.f.a(i()))
    {
      j = 2130903239;
      localView = paramLayoutInflater.inflate(j, paramViewGroup, false);
      if (!com.spotify.android.paste.widget.f.a(i()))
      {
        this.ba.setColorFilter(j().getColor(2131296307), PorterDuff.Mode.SRC_ATOP);
        com.spotify.android.paste.widget.g.a(localView, this.ba);
      }
      this.at = ((DisableableViewPager)localView.findViewById(2131362615));
      this.at.b(1);
      this.ao = ((CancellableSeekBar)localView.findViewById(2131362618));
      this.aa = ((ImageButton)localView.findViewById(2131362265));
      this.ab = ((ImageButton)localView.findViewById(2131362620));
      this.i = localView.findViewById(2131362609);
      this.Y = ((TextView)localView.findViewById(2131362610));
      this.Z = ((TextView)localView.findViewById(2131362611));
      this.ac = ((ImageButton)localView.findViewById(2131362623));
      this.ad = ((ImageButton)localView.findViewById(2131362624));
      this.ae = ((ImageButton)localView.findViewById(2131362625));
      this.af = ((ImageButton)localView.findViewById(2131362613));
      this.ag = ((ImageButton)localView.findViewById(2131362612));
      this.ah = ((ImageButton)localView.findViewById(2131362622));
      this.ai = ((ImageButton)localView.findViewById(2131362621));
      this.ak = localView.findViewById(2131362544);
      this.al = ((PremiumUpsellBanner)localView.findViewById(2131362627));
      this.ap = ((TextView)localView.findViewById(2131362617));
      this.aq = ((TextView)localView.findViewById(2131362619));
      this.am = ((FrameLayout)localView.findViewById(2131362616));
      this.aj = ((ConnectIconView)localView.findViewById(2131362626));
      this.aj.setOnClickListener(new q.16(this));
      localConnectIconView = this.aj;
      if (!FeatureFragment.i.a())
        break label807;
    }
    label807: for (int k = 0; ; k = 4)
    {
      localConnectIconView.setVisibility(k);
      this.an = localView.findViewById(2131362628);
      this.ad.setImageDrawable(k.a(i()));
      this.ac.setImageDrawable(k.e(i()));
      this.ae.setImageDrawable(k.f(i()));
      this.ab.setImageDrawable(k.h(i()));
      this.aa.setImageDrawable(k.i(i()));
      this.ah.setImageDrawable(k.n(i()));
      this.ai.setImageDrawable(k.o(i()));
      this.aO = 0;
      this.aN = 0;
      this.at.setOnTouchListener(new q.17(this));
      this.at.a(new q.18(this));
      this.aa.setOnClickListener(new q.19(this));
      this.i.setOnClickListener(new q.20(this));
      this.ab.setOnClickListener(new q.21(this));
      this.ac.setOnClickListener(new q.2(this));
      this.ad.setOnClickListener(new q.3(this));
      this.ae.setOnClickListener(new q.4(this));
      this.af.setOnClickListener(new q.5(this));
      this.ag.setOnClickListener(new q.6(this));
      this.ai.setOnClickListener(new q.7(this));
      this.ah.setOnClickListener(new q.8(this));
      this.ao.a(new q.9(this));
      this.at.a(new q.10(this));
      this.al.a(3);
      this.al.a(ViewUri.r, ViewUri.SubView.h);
      this.aP = new com.spotify.mobile.android.ui.page.a.c(this.av, this.am);
      this.aQ = null;
      this.aR = null;
      this.aS = null;
      this.aT = null;
      return localView;
      j = 2130903240;
      break;
    }
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131690131);
  }

  public final void a()
  {
    this.aX = true;
    this.aW.a();
    this.aW.a(new q.15(this));
    if (this.aU == null)
      this.aW.c();
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.av = new Handler();
    a_(true);
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    if ((paramBundle != null) && (paramBundle.containsKey("connect_state")))
      this.aU = ConnectManager.DeviceState.values()[paramBundle.getInt("connect_state")];
  }

  public final void b()
  {
    this.aX = false;
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (this.aU != null)
      paramBundle.putInt("connect_state", this.aU.ordinal());
  }

  public final void p_()
  {
    super.p_();
    this.aW = new com.spotify.mobile.android.service.connections.b(i());
    this.aW.a(this);
    this.aW.e();
  }

  public final void q_()
  {
    super.q_();
    if (this.aX)
    {
      this.aW.a();
      this.aW.f();
    }
  }

  public final void w()
  {
    super.w();
    t().b(2131362137, null, this.e);
    t().b(2131362138, null, this.d);
  }

  public final void y()
  {
    this.av.removeCallbacksAndMessages(null);
    this.ar.a(this.as);
    ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a().a(this.bc);
    t().a(2131362138);
    t().a(2131362137);
    super.y();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
