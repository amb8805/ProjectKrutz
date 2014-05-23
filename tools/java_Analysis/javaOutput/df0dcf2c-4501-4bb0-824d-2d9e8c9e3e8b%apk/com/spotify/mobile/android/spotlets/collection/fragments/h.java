package com.spotify.mobile.android.spotlets.collection.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.text.TextUtils;
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
import com.spotify.mobile.android.model.j;
import com.spotify.mobile.android.provider.Metadata.PlaylistFilter;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.activity.l;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.adapter.w;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.menus.PlaylistMenuDelegate;
import com.spotify.mobile.android.ui.menus.PlaylistMenuDelegate.CanDownload;
import com.spotify.mobile.android.ui.menus.PlaylistMenuDelegate.CanRemovePlaylist;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.ar;
import com.spotify.mobile.android.util.cv;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import com.spotify.mobile.android.util.cy;
import com.spotify.mobile.android.util.dm;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import java.util.ArrayList;
import java.util.List;

public final class h extends m
  implements g, com.spotify.mobile.android.ui.fragments.g, com.spotify.mobile.android.ui.p
{
  private static final cy Y;
  private static final cy Z;
  private static final List<cv> aa;
  private static final cv ab;
  public static final String i = ViewUri.aA.toString();
  private android.support.v4.app.o<Cursor> aA = new h.7(this);
  private String ac;
  private cv ad;
  private ListView ae;
  private EmptyView af;
  private EmptyView ag;
  private EmptyView ah;
  private LoadingView ai;
  private Parcelable aj;
  private dt ak;
  private ViewUri.Verified al;
  private cw am;
  private q an;
  private android.support.v4.widget.a ao;
  private FilterHeaderView ap;
  private com.spotify.mobile.android.spotlets.collection.a.b aq;
  private com.spotify.mobile.android.ui.n ar;
  private ar<Integer> as;
  private com.spotify.mobile.android.ui.actions.a at = (com.spotify.mobile.android.ui.actions.a)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
  private com.spotify.mobile.android.util.tracking.h au;
  private PlaylistMenuDelegate av = new PlaylistMenuDelegate(com.spotify.mobile.android.provider.p.a(Metadata.PlaylistFilter.a), PlaylistMenuDelegate.CanDownload.a, PlaylistMenuDelegate.CanRemovePlaylist.a, new h.1(this));
  private PlaylistMenuDelegate aw = new PlaylistMenuDelegate(com.spotify.mobile.android.provider.p.a(Metadata.PlaylistFilter.b), PlaylistMenuDelegate.CanDownload.a, PlaylistMenuDelegate.CanRemovePlaylist.a, new h.2(this));
  private com.spotify.mobile.android.spotlets.collection.a.c ax = new h.4(this);
  private View.OnClickListener ay = new h.5(this);
  private com.spotify.mobile.android.ui.view.h az = new h.6(this);

  static
  {
    Y = cy.a("playlists_sort_order");
    Z = cy.a("playlists_show_only_offlined_content");
    ab = new cv("", 2131690299, false);
    ArrayList localArrayList = new ArrayList();
    aa = localArrayList;
    localArrayList.add(new cv("name", 2131690296));
    aa.add(new cv("most_played_rank", 2131690295, false));
    aa.add(ab);
  }

  public h()
  {
  }

  public static h F()
  {
    h localh = new h();
    localh.b_(new Bundle());
    return localh;
  }

  private void G()
  {
    Fragment localFragment = m();
    if ((localFragment != null) && ((localFragment instanceof CollectionFragment)))
    {
      com.spotify.mobile.android.ui.n localn = this.ar;
      String str = null;
      if (localn != null)
      {
        boolean bool = this.ar.b();
        str = null;
        if (bool)
          str = this.ar.a();
      }
      ((CollectionFragment)localFragment).a(str);
      return;
    }
    ((l)i()).a(this, i().getString(2131690158));
    ((l)i()).h();
  }

  public static cv a(cw paramcw)
  {
    return cv.a(paramcw, Y, ab, aa);
  }

  public final Fragment C()
  {
    return this;
  }

  public final void D()
  {
    this.ak.a();
    a_(true);
    G();
  }

  public final void E()
  {
    this.ak.b();
    a_(false);
    this.ap.a();
  }

  public final Fragment a(String paramString1, String paramString2)
  {
    return MainActivity.a(new SpotifyLink(paramString1), paramString2);
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    ViewGroup localViewGroup1 = (ViewGroup)paramLayoutInflater.inflate(2130903186, paramViewGroup, false);
    this.ao = new com.spotify.mobile.android.ui.adapter.o(i());
    this.ah = com.spotify.mobile.android.spotlets.collection.a.a.a(i(), "");
    View localView = paramLayoutInflater.inflate(2130903098, null, false);
    ((TextView)localView.findViewById(2131362315)).setText(2131689683);
    localView.findViewById(2131362316).setOnClickListener(this.ay);
    this.an = new q(i());
    this.an.a(this.ao, null, 0);
    this.an.a(new w(this.ah, (byte)0), null, 1);
    this.an.a(new w(localView, (byte)0), null, 2);
    this.an.d(0);
    this.an.b(new int[] { 1, 2 });
    this.ae = ((ListView)localViewGroup1.findViewById(16908298));
    ViewGroup localViewGroup2 = (ViewGroup)this.ae.getParent();
    this.ae.setTag("playlists");
    this.ai = LoadingView.a(LayoutInflater.from(i()));
    localViewGroup2.addView(this.ai);
    this.af = com.spotify.mobile.android.spotlets.collection.a.a.e(i());
    this.af.setVisibility(8);
    localViewGroup2.addView(this.af);
    this.ag = com.spotify.mobile.android.spotlets.collection.a.a.a(i(), this.ay);
    this.ag.setVisibility(8);
    localViewGroup2.addView(this.ag);
    i();
    this.ap = FilterHeaderView.a(paramLayoutInflater, this.ac, aa, this.ad, this.aq.a(), this.az, this.ae);
    this.ap.setBackgroundColor(j().getColor(2131296272));
    this.ap.a(this.al, "playlists");
    this.ap.a(2131689978);
    this.ae.setAdapter(this.an);
    this.ae.setFastScrollEnabled(true);
    a(this.an);
    return localViewGroup1;
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131690158);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.ac = paramBundle.getString("filter");
      this.aj = paramBundle.getParcelable("list");
    }
    this.am = cw.a(i());
    this.ad = cv.a(this.am, Y, ab, aa);
    if (this.ac == null)
      this.ac = "";
    if (this.ad == null)
      this.ad = ab;
    this.al = ViewUri.aA;
    this.au = new com.spotify.mobile.android.util.tracking.h(i(), this.al.toString());
    this.au.b(paramBundle);
    this.ak = dv.a(i(), this.al);
    this.as = new ar(1, new h.3(this));
    this.aq = new com.spotify.mobile.android.spotlets.collection.a.b(this.al, "playlists", FeatureFragment.h.a(), this.am, Z);
    this.aq.a(this.ax);
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
    this.ar.a(paramMenu);
    com.spotify.mobile.android.ui.menus.a.a(i(), paramMenu, this.al);
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    b().setOnCreateContextMenuListener(this);
    this.ar = new com.spotify.mobile.android.ui.n(this, this);
    this.ar.a(paramBundle);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    int j = paramInt - 1;
    int k = this.an.b(j);
    Object localObject = paramView.getTag();
    if (!(localObject instanceof j))
      return;
    switch (k)
    {
    default:
      Assertion.a("Section id unknown: " + k);
      return;
    case 0:
    }
    j localj = (j)localObject;
    if ((localj.s()) && (!TextUtils.isEmpty(localj.s_())))
    {
      com.spotify.mobile.android.ui.actions.a.a(i(), this.al, ViewUri.SubView.a, ClientEvent.a("playlists", ClientEvent.SubEvent.ay, localj.s_(), null));
      if (this.ar.b())
      {
        this.ar.a(localj.s_(), localj.a(i()));
        return;
      }
      a(MainActivity.a(i(), localj.s_(), localj.a(i())));
      return;
    }
    dm.h(i());
  }

  public final void a(String paramString)
  {
    ((com.spotify.mobile.android.ui.adapter.o)this.ao).a(paramString);
    G();
  }

  public final void b(boolean paramBoolean)
  {
    super.b(true);
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ai.a();
    t().a(2131362107, null, this.aA);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("filter", this.ac);
    if (this.ae != null)
      paramBundle.putParcelable("list", this.ae.onSaveInstanceState());
    this.ar.b(paramBundle);
    this.au.a(paramBundle);
  }

  public final void e()
  {
    FilterHeaderView.a(this.ap);
    super.e();
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    Object localObject = ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView.getTag();
    j localj;
    if ((localObject instanceof j))
    {
      localj = (j)localObject;
      if (this.aq.b())
        this.aw.a(paramContextMenu, localj);
    }
    else
    {
      return;
    }
    this.av.a(paramContextMenu, localj);
  }

  public final void p_()
  {
    super.p_();
    this.au.a();
  }

  public final void q_()
  {
    super.q_();
    this.au.c();
  }

  public final void x()
  {
    super.x();
    this.am.a().a(Y, this.ad.b()).b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.collection.fragments.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
