package com.spotify.mobile.android.spotlets.collection.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.ui.actions.d;
import com.spotify.mobile.android.ui.activity.l;
import com.spotify.mobile.android.ui.adapter.aa;
import com.spotify.mobile.android.ui.adapter.ab;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.adapter.w;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseAlbum;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseArtist;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveTrack;
import com.spotify.mobile.android.ui.menus.e;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.ui.view.f;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.cv;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cy;
import com.spotify.mobile.android.util.do;
import com.spotify.mobile.android.util.dp;
import com.spotify.mobile.android.util.ds;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import java.util.ArrayList;
import java.util.List;

public final class i extends android.support.v4.app.m
  implements g, com.spotify.mobile.android.ui.fragments.g
{
  private static final cy Y;
  private static final cy Z;
  private static final ab aD = new i.3();
  private static final List<cv> aa;
  private static final cv ab;
  public static final String i = ViewUri.aF.toString();
  private d aA = (d)com.spotify.mobile.android.c.c.a(d.class);
  private com.spotify.mobile.android.util.tracking.h aB;
  private TrackMenuDelegate aC = new TrackMenuDelegate(TrackMenuDelegate.CanBrowseAlbum.a, TrackMenuDelegate.CanBrowseArtist.a, TrackMenuDelegate.CanRemoveFromCollection.a, TrackMenuDelegate.CanRemoveTrack.b, new i.1(this));
  private com.spotify.mobile.android.spotlets.collection.a.c aE = new i.4(this);
  private View.OnClickListener aF = new i.5(this);
  private f aG = new i.6(this);
  private dp aH = new i.7(this);
  private com.spotify.mobile.android.ui.view.h aI = new i.8(this);
  private View.OnClickListener aJ = new i.9(this);
  private o<Cursor> aK = new i.10(this);
  private o<Cursor> aL = new i.2(this);
  private String ac;
  private cv ad;
  private ListView ae;
  private EmptyView af;
  private EmptyView ag;
  private EmptyView ah;
  private Parcelable ai;
  private int aj;
  private do ak;
  private dt al;
  private ViewUri.Verified am;
  private cw an;
  private int ao = 1;
  private com.spotify.mobile.android.spotlets.collection.a.b ap;
  private com.spotify.mobile.android.util.g aq;
  private android.support.v4.widget.a ar;
  private q as;
  private FilterHeaderView at;
  private View au;
  private DownloadHeaderView av;
  private LoadingView aw;
  private int ax;
  private int ay;
  private com.spotify.mobile.android.ui.actions.a az = (com.spotify.mobile.android.ui.actions.a)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);

  static
  {
    Y = cy.a("tracks_sort_order");
    Z = cy.a("tracks_show_only_offlined_content");
    ab = new cv("time_added", 2131690297);
    ArrayList localArrayList = new ArrayList();
    aa = localArrayList;
    localArrayList.add(new cv("name", 2131690298));
    aa.add(ab);
  }

  public i()
  {
  }

  public static i F()
  {
    i locali = new i();
    locali.b_(new Bundle());
    return locali;
  }

  private void H()
  {
    Fragment localFragment = m();
    if ((localFragment != null) && ((localFragment instanceof CollectionFragment)))
    {
      ((CollectionFragment)localFragment).a(null);
      return;
    }
    ((l)i()).a(this, i().getString(2131689688));
    ((l)i()).h();
  }

  public final Fragment C()
  {
    return this;
  }

  public final void D()
  {
    this.al.a();
    a_(true);
    H();
  }

  public final void E()
  {
    this.al.b();
    a_(false);
    this.at.a();
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    ViewGroup localViewGroup1 = (ViewGroup)paramLayoutInflater.inflate(2130903186, paramViewGroup, false);
    this.as = new q(i());
    this.ar = new aa(i(), aD);
    this.ae = ((ListView)localViewGroup1.findViewById(16908298));
    ViewGroup localViewGroup2 = (ViewGroup)this.ae.getParent();
    this.ag = com.spotify.mobile.android.spotlets.collection.a.a.a(i());
    this.ag.setVisibility(8);
    localViewGroup2.addView(this.ag);
    this.af = com.spotify.mobile.android.spotlets.collection.a.a.a(i(), this.aF);
    this.af.setVisibility(8);
    localViewGroup2.addView(this.af);
    this.ah = com.spotify.mobile.android.spotlets.collection.a.a.a(i(), "");
    View localView = paramLayoutInflater.inflate(2130903098, null, false);
    ((TextView)localView.findViewById(2131362315)).setText(2131689684);
    localView.findViewById(2131362316).setOnClickListener(this.aF);
    this.as.a(this.ar, null, 0);
    this.as.a(new w(this.ah, (byte)0), null, 1);
    this.as.a(new w(localView, (byte)0), null, 2);
    this.as.d(0);
    this.as.b(new int[] { 1, 2 });
    i();
    this.at = FilterHeaderView.a(paramLayoutInflater, this.ac, aa, this.ad, this.ap.a(), this.aI, this.ae);
    this.at.setBackgroundColor(j().getColor(2131296272));
    this.at.a(this.am, "tracks");
    this.at.a(2131689979);
    this.av = ((DownloadHeaderView)com.spotify.mobile.android.ui.view.i.a(i()));
    this.av.a(this.aG);
    ViewGroup localViewGroup3 = com.spotify.mobile.android.ui.view.i.c(i());
    if (ds.a(i()))
    {
      this.au = ShufflePlayHeaderView.a(i(), this.ae, this.aJ);
      ((ShufflePlayHeaderView)this.au).a();
      ((ShufflePlayHeaderView)this.au).b(true);
      localViewGroup3.addView(((ShufflePlayHeaderView)this.au).c());
    }
    localViewGroup3.addView(this.av);
    this.ae.addHeaderView(localViewGroup3, null, false);
    this.aw = LoadingView.a(LayoutInflater.from(i()));
    localViewGroup2.addView(this.aw);
    this.ae.setAdapter(this.as);
    this.ae.setFastScrollEnabled(true);
    return localViewGroup1;
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131689688);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.ac = paramBundle.getString("filter");
      this.ai = paramBundle.getParcelable("list");
    }
    this.an = cw.a(i());
    this.ad = cv.a(this.an, Y, ab, aa);
    this.aj = -1;
    Bundle localBundle = g();
    if (localBundle != null)
    {
      if ((this.ac == null) && (localBundle.containsKey("filter")))
        this.ac = localBundle.getString("filter");
      if (localBundle.containsKey("sort_order"))
        this.ad = cv.a(localBundle.getString("sort_order"), aa);
    }
    if (this.ac == null)
      this.ac = "";
    if (this.ad == null)
      this.ad = ab;
    this.am = ViewUri.aF;
    this.aB = new com.spotify.mobile.android.util.tracking.h(i(), this.am.toString());
    this.aB.b(paramBundle);
    this.al = dv.a(i(), this.am);
    this.ap = new com.spotify.mobile.android.spotlets.collection.a.b(this.am, "tracks", FeatureFragment.h.a(), this.an, Z);
    this.ap.a(this.aE);
    this.aq = new com.spotify.mobile.android.util.g();
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
    if ((ds.b(i())) && (this.ar != null) && (this.ar.getCount() > 0))
      this.au = com.spotify.mobile.android.ui.menus.a.a(i(), paramMenu, this.am, com.spotify.mobile.android.provider.c.a(this.ac, this.ap.b()));
    e.a(i(), paramMenu, this.am, com.spotify.mobile.android.provider.c.a, SpotifyLink.LinkType.p, this.ax, this.ay);
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    b().setOnCreateContextMenuListener(this);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    int j = paramInt - this.ae.getHeaderViewsCount();
    switch (this.as.b(j))
    {
    default:
      return;
    case 0:
    }
    Uri localUri = com.spotify.mobile.android.provider.c.a(this.ac, this.ap.b());
    com.spotify.mobile.android.model.m localm = (com.spotify.mobile.android.model.m)paramView.getTag();
    if (FeatureFragment.h.a())
    {
      com.spotify.mobile.android.ui.actions.a.a(i(), this.am, ClientEvent.a("tracks", ClientEvent.SubEvent.au, localm.h(), Long.valueOf(paramLong)));
      if ((this.au instanceof ShufflePlayHeaderView))
      {
        ((ShufflePlayHeaderView)this.au).b();
        return;
      }
      ShufflePlayHeaderView.a(this.aq, this.au);
      return;
    }
    com.spotify.mobile.android.ui.actions.a.a(i(), this.am, ClientEvent.a("tracks", ClientEvent.SubEvent.at, localm.h(), Long.valueOf(paramLong)));
    d.a(i(), this.am, localUri, paramLong);
  }

  public final void b(boolean paramBoolean)
  {
    super.b(true);
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.aw.a();
    t().a(2131362094, null, this.aL);
    t().a(2131362109, null, this.aK);
    if ((g() != null) && (g().getString("lookup_track_uri") != null))
    {
      this.ak = new do(i(), t(), 2131362110, this.aH);
      Uri localUri = com.spotify.mobile.android.provider.c.a();
      String str = g().getString("lookup_track_uri");
      this.ak.a(localUri, str, this.ad.b());
    }
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("filter", this.ac);
    if (this.ae != null)
      paramBundle.putParcelable("list", this.ae.onSaveInstanceState());
    this.aB.a(paramBundle);
  }

  public final void e()
  {
    FilterHeaderView.a(this.at);
    super.e();
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    View localView = ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView;
    if (!(localView instanceof ListItemView));
    Object localObject;
    do
    {
      return;
      localObject = localView.getTag();
    }
    while (!(localObject instanceof com.spotify.mobile.android.model.m));
    this.aC.a(paramContextMenu, (com.spotify.mobile.android.model.m)localObject);
  }

  public final void p_()
  {
    super.p_();
    this.aB.a();
  }

  public final void q_()
  {
    super.q_();
    this.aB.c();
  }

  public final void w()
  {
    super.w();
  }

  public final void x()
  {
    super.x();
    this.at.a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.collection.fragments.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
