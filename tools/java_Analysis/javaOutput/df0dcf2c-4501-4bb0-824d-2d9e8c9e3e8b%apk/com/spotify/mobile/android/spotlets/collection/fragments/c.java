package com.spotify.mobile.android.spotlets.collection.fragments;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.n;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.model.l;
import com.spotify.mobile.android.spotlets.collection.adapter.AlbumsWithTracksAdapter;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.spotlets.follow.FollowersCountLoader;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseAlbum;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseArtist;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveTrack;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.Collection.State;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;
import com.spotify.mobile.android.util.ar;
import com.spotify.mobile.android.util.ds;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.dx;
import com.spotify.mobile.android.util.tracking.h;

public class c extends android.support.v4.app.m
  implements l, com.spotify.mobile.android.ui.fragments.g, com.spotify.mobile.android.ui.o
{
  private static final String[] aa = { "name", "uri", "offline_state", "sync_progress", "is_available", "is_radio_available", "albums_in_collection_count", "image_large_uri", "is_followed" };
  FollowersCountLoader Y;
  aa Z;
  private int aA = 0;
  private dt aB;
  private ViewUri.Verified aC;
  private com.spotify.mobile.android.ui.actions.a aD = (com.spotify.mobile.android.ui.actions.a)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
  private com.spotify.mobile.android.ui.actions.d aE = (com.spotify.mobile.android.ui.actions.d)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.d.class);
  private com.spotify.mobile.android.ui.actions.c aF = (com.spotify.mobile.android.ui.actions.c)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.c.class);
  private com.spotify.mobile.android.ui.menus.d aG = (com.spotify.mobile.android.ui.menus.d)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.menus.d.class);
  private h aH;
  private ar<Integer> aI;
  private TrackMenuDelegate aJ = new TrackMenuDelegate(TrackMenuDelegate.CanBrowseAlbum.b, TrackMenuDelegate.CanBrowseArtist.b, TrackMenuDelegate.CanRemoveFromCollection.a, TrackMenuDelegate.CanRemoveTrack.b, new c.1(this));
  private View.OnClickListener aK = new c.8(this);
  private View.OnClickListener aL = new c.9(this);
  private com.spotify.mobile.android.ui.view.f aM = new c.10(this);
  private ab aN = new c.11(this);
  private View.OnClickListener aO = new c.12(this);
  private android.support.v4.app.o<Cursor> aP = new c.2(this);
  private com.spotify.mobile.android.spotlets.follow.e aQ = new c.3(this);
  private com.spotify.mobile.android.spotlets.follow.b aR = new c.4(this);
  private android.support.v4.app.o<Cursor> aS = new c.5(this);
  private String ab;
  private String ac;
  private String ad;
  private boolean ae;
  private boolean af;
  private boolean ag;
  private q ah;
  private AlbumsWithTracksAdapter ai;
  private Cursor aj;
  private DownloadHeaderView ak;
  private View al;
  private LoadingView am;
  private EmptyView an;
  private View ao;
  private Parcelable ap;
  private com.spotify.mobile.android.ui.prettylist.c aq;
  private com.spotify.mobile.android.util.g ar;
  private boolean as;
  private Handler at;
  private TextView au;
  private ToggleButton av;
  private boolean aw;
  private com.spotify.mobile.android.spotlets.follow.a ax;
  private int ay = 0;
  private int az = 0;
  FollowManager i;

  public c()
  {
  }

  public static c a(String paramString1, String paramString2, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("artist_collection_uri", paramString1);
    localBundle.putString("title", paramString2);
    localBundle.putBoolean("is_sub_fragment", paramBoolean);
    c localc = new c();
    localc.b_(localBundle);
    return localc;
  }

  public final Fragment C()
  {
    return this;
  }

  public final Uri a()
  {
    return Uri.parse(this.ad);
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    MainActivity localMainActivity;
    com.spotify.mobile.android.ui.prettylist.c localc1;
    ListView localListView1;
    label217: FrameLayout localFrameLayout;
    if (!this.as)
    {
      localMainActivity = (MainActivity)i();
      if (ds.b(localMainActivity))
      {
        localc1 = com.spotify.mobile.android.ui.prettylist.e.b(localMainActivity);
        this.aq = localc1;
        this.aq.a(com.spotify.android.paste.widget.g.a(localMainActivity, 2130772373));
        com.spotify.mobile.android.ui.prettylist.c localc2 = this.aq;
        View localView = LayoutInflater.from(i()).inflate(2130903161, null);
        this.au = ((TextView)localView.findViewById(2131362282));
        this.av = ((ToggleButton)localView.findViewById(2131362452));
        this.av.setOnClickListener(new c.7(this));
        localc2.a(localView);
        this.aq.a(this.ab);
        this.ao = this.aq.i();
        ListView localListView2 = this.aq.c();
        if (ds.a(i()))
        {
          this.al = com.spotify.mobile.android.ui.stuff.f.a(i(), null);
          this.al.setOnClickListener(this.aO);
          this.aq.b(this.al);
        }
        localListView1 = localListView2;
        localFrameLayout = new FrameLayout(i());
        localFrameLayout.setBackgroundColor(com.spotify.android.paste.widget.g.a(i(), 16842836));
        localFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        localFrameLayout.addView(this.ao);
        localListView1.setFastScrollEnabled(true);
        this.ao.setVisibility(4);
        this.am = LoadingView.a(paramLayoutInflater, i(), this.ao);
        localFrameLayout.addView(this.am);
        if ((!ds.b(i())) || (this.as))
          break label533;
      }
    }
    label533: for (EmptyView localEmptyView = com.spotify.mobile.android.spotlets.collection.a.a.a(i(), this.aK, this.aL); ; localEmptyView = com.spotify.mobile.android.spotlets.collection.a.a.b(i(), this.aK, this.aL))
    {
      localEmptyView.setVisibility(8);
      this.an = localEmptyView;
      localFrameLayout.addView(this.an);
      this.ai = new AlbumsWithTracksAdapter(i(), FeatureFragment.h.a());
      this.ai.a(a(2131690130));
      this.ah = new q(i());
      this.ah.a(this.ai, i().getString(2131689677), 0);
      this.ah.d(0);
      this.ak = ((DownloadHeaderView)com.spotify.mobile.android.ui.view.i.a(i()));
      this.ak.a(this.aM);
      localListView1.addHeaderView(this.ak, null, false);
      localListView1.setAdapter(this.ah);
      return localFrameLayout;
      localc1 = com.spotify.mobile.android.ui.prettylist.e.a(localMainActivity);
      break;
      this.ao = paramLayoutInflater.inflate(2130903181, paramViewGroup, false);
      localListView1 = (ListView)this.ao.findViewById(16908298);
      break label217;
    }
  }

  public final String a(Context paramContext)
  {
    if (this.ab == null)
      return paramContext.getString(2131689505);
    return this.ab;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
      this.ap = paramBundle.getParcelable("list");
    Bundle localBundle = g();
    this.ad = localBundle.getString("artist_collection_uri");
    this.ab = localBundle.getString("title");
    this.as = localBundle.getBoolean("is_sub_fragment");
    this.aC = ViewUri.aE.a(this.ad);
    this.aB = dv.a(i(), this.aC);
    this.aH = new h(i(), this.aC.toString());
    this.aH.b(paramBundle);
    this.aI = new ar(2, new c.6(this));
    if (!this.as);
    for (boolean bool = true; ; bool = false)
    {
      a_(bool);
      this.ar = new com.spotify.mobile.android.util.g();
      this.at = new Handler();
      this.i = ((FollowManager)com.spotify.mobile.android.c.c.a(FollowManager.class));
      this.Y = new FollowersCountLoader(i());
      this.Z = new aa(i(), this.aN);
      return;
    }
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
    c(paramMenu);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    int j = paramInt - paramListView.getHeaderViewsCount();
    switch (this.ah.b(j))
    {
    default:
    case 0:
    }
    Object localObject;
    do
    {
      return;
      localObject = paramView.getTag();
      if ((localObject instanceof com.spotify.mobile.android.spotlets.collection.adapter.a))
      {
        com.spotify.mobile.android.spotlets.collection.adapter.a locala = (com.spotify.mobile.android.spotlets.collection.adapter.a)localObject;
        com.spotify.mobile.android.ui.actions.a.a(i(), this.aC, ClientEvent.a("artist", ClientEvent.SubEvent.aw, locala.d(), null));
        a(MainActivity.a(i(), locala.d(), locala.b()));
        return;
      }
    }
    while (!(localObject instanceof com.spotify.mobile.android.model.m));
    com.spotify.mobile.android.model.m localm = (com.spotify.mobile.android.model.m)localObject;
    Uri localUri = com.spotify.mobile.android.provider.c.b(this.ad);
    if (FeatureFragment.h.a())
    {
      com.spotify.mobile.android.ui.actions.a.a(i(), this.aC, ClientEvent.a("artist", ClientEvent.SubEvent.au, localm.h(), Long.valueOf(paramLong)));
      if ((this.al instanceof ShufflePlayHeaderView))
      {
        ((ShufflePlayHeaderView)this.al).b();
        return;
      }
      ShufflePlayHeaderView.a(this.ar, this.al);
      return;
    }
    com.spotify.mobile.android.ui.actions.a.a(i(), this.aC, ClientEvent.a("artist", ClientEvent.SubEvent.at, localm.h(), Long.valueOf(paramLong)));
    com.spotify.mobile.android.ui.actions.d.a(i(), this.aC, localUri, paramLong);
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    b().setOnCreateContextMenuListener(this);
    this.am.a();
    t().a(2131362100, null, this.aP);
    t().a(2131362103, null, this.aS);
    t().a(2131362101, null, this.Z);
  }

  public final void c(Menu paramMenu)
  {
    if ((this.ai != null) && (this.ai.getCount() > 0));
    for (int j = 1; ; j = 0)
    {
      if (this.ac != null)
      {
        if ((ds.b(i())) && (j != 0))
          this.al = com.spotify.mobile.android.ui.menus.a.a(i(), paramMenu, this.aC, com.spotify.mobile.android.provider.c.b(this.ac));
        if (this.ae)
          com.spotify.mobile.android.ui.menus.a.b(i(), paramMenu, this.aC, this.ac);
      }
      if (j != 0)
        com.spotify.mobile.android.ui.menus.e.a(i(), paramMenu, this.aC, com.spotify.mobile.android.provider.c.a(this.ad), new SpotifyLink(this.ad).a(), this.ay, this.az);
      if ((this.ag) && (this.ac != null) && (!com.spotify.mobile.android.util.i.a(this.ab)) && (this.ax != null))
        com.spotify.mobile.android.ui.menus.e.d(i(), paramMenu, this.aC, this.ac, this.aw);
      if ((this.ac != null) && (!com.spotify.mobile.android.util.i.a(this.ab)) && (this.af))
        com.spotify.mobile.android.ui.menus.e.b(i(), paramMenu, this.aC, this.ac, this.ab);
      return;
    }
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (b() != null)
      paramBundle.putParcelable("list", b().onSaveInstanceState());
    this.aH.a(paramBundle);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    View localView = ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView;
    if (!(localView instanceof ListItemView));
    Object localObject;
    do
    {
      return;
      localObject = localView.getTag();
      if ((localObject instanceof com.spotify.mobile.android.model.m))
      {
        this.aJ.a(paramContextMenu, (com.spotify.mobile.android.model.m)localObject);
        return;
      }
    }
    while (!(localObject instanceof com.spotify.mobile.android.spotlets.collection.adapter.a));
    com.spotify.mobile.android.spotlets.collection.adapter.a locala = (com.spotify.mobile.android.spotlets.collection.adapter.a)localObject;
    this.aG.a(i(), paramContextMenu, this.aC, ViewUri.SubView.a, Collection.State.a, true, locala.c());
    this.aG.f(i(), paramContextMenu, this.aC, ViewUri.SubView.a, locala.c());
    this.aG.d(i(), paramContextMenu, this.aC, ViewUri.SubView.a, locala.c());
    com.spotify.mobile.android.ui.menus.d locald = this.aG;
    FragmentActivity localFragmentActivity1 = i();
    ViewUri.Verified localVerified = this.aC;
    ViewUri.SubView localSubView = ViewUri.SubView.a;
    String str = locala.b();
    FragmentActivity localFragmentActivity2 = i();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = locala.b();
    locald.a(localFragmentActivity1, paramContextMenu, localVerified, localSubView, str, localFragmentActivity2.getString(2131690252, arrayOfObject), locala.c());
  }

  public final void p_()
  {
    super.p_();
    this.aH.a();
  }

  public final void q_()
  {
    super.q_();
    this.aH.c();
  }

  public final void w()
  {
    super.w();
    this.aB.a();
  }

  public final void x()
  {
    super.x();
    this.aB.b();
  }

  public final void y()
  {
    super.y();
    if (this.ac != null)
      this.i.b(this.ac, this.aR);
    this.Y.a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.collection.fragments.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
