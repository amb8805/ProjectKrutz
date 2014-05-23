package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.n;
import android.support.v4.view.ah;
import android.text.TextUtils.TruncateAt;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.ui.adapter.aa;
import com.spotify.mobile.android.ui.adapter.ab;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.adapter.r;
import com.spotify.mobile.android.ui.adapter.t;
import com.spotify.mobile.android.ui.adapter.w;
import com.spotify.mobile.android.ui.adapter.z;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseAlbum;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseArtist;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveTrack;
import com.spotify.mobile.android.ui.prettylist.StickyListView;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.ui.view.i;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.cv;
import com.spotify.mobile.android.util.dg;
import com.spotify.mobile.android.util.do;
import com.spotify.mobile.android.util.dp;
import com.spotify.mobile.android.util.ds;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.dx;
import com.spotify.mobile.android.util.k;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class PlaylistFragment extends android.support.v4.app.m
  implements com.spotify.mobile.android.model.l, g, com.spotify.mobile.android.ui.o
{
  static final String[] Y = { "name", "image_uri" };
  static final String[] Z = { "product_type" };
  private static final String ab = PlaylistFragment.class.getSimpleName();
  private static final List<cv> ac;
  private static final cv ad = new cv("", 2131690299, false);
  static final String[] i;
  private q aA;
  private aa aB;
  private z aC;
  private String aD;
  private String aE;
  private String aF;
  private String aG;
  private cv aH = ad;
  private boolean aI = false;
  private boolean aJ = false;
  private boolean aK = false;
  private String aL;
  private boolean aM;
  private boolean aN;
  private boolean aO;
  private boolean aP;
  private boolean aQ;
  private boolean aR;
  private ViewUri.Verified aS;
  private int aT;
  private int aU = 0;
  private int aV = 0;
  private int aW = 0;
  private boolean aX = false;
  private dt aY;
  private com.spotify.mobile.android.ui.actions.a aZ = (com.spotify.mobile.android.ui.actions.a)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
  boolean aa;
  private k<PlaylistFragment.StateFlags> ae = new k(PlaylistFragment.StateFlags.class);
  private ListView af;
  private Parcelable ag;
  private int ah;
  private do ai;
  private int aj = -1;
  private boolean ak = false;
  private String al;
  private int am = -1;
  private String an;
  private String ao;
  private com.spotify.mobile.android.ui.prettylist.c ap;
  private View aq;
  private ToggleButton ar;
  private TextView as;
  private com.spotify.mobile.android.ui.view.paste.a at;
  private EmptyView au;
  private DownloadHeaderView av;
  private FilterHeaderView aw;
  private LoadingView ax;
  private View ay;
  private com.spotify.mobile.android.util.g az;
  private com.spotify.mobile.android.ui.actions.d ba = (com.spotify.mobile.android.ui.actions.d)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.d.class);
  private com.spotify.mobile.android.ui.actions.c bb = (com.spotify.mobile.android.ui.actions.c)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.c.class);
  private TrackMenuDelegate bc = new TrackMenuDelegate(TrackMenuDelegate.CanBrowseAlbum.a, TrackMenuDelegate.CanBrowseArtist.a, TrackMenuDelegate.CanRemoveFromCollection.b, TrackMenuDelegate.CanRemoveTrack.c, new PlaylistFragment.1(this));
  private final ab bd = new PlaylistFragment.12(this);
  private View.OnClickListener be = new PlaylistFragment.14(this);
  private View.OnClickListener bf = new PlaylistFragment.15(this);
  private ah bg = new PlaylistFragment.18(this);
  private r bh = new PlaylistFragment.19(this);
  private com.spotify.mobile.android.ui.view.h bi = new PlaylistFragment.20(this);
  private com.spotify.mobile.android.ui.view.f bj = new PlaylistFragment.2(this);
  private android.support.v4.app.o<Cursor> bk = new PlaylistFragment.3(this);
  private View.OnClickListener bl = new PlaylistFragment.4(this);
  private android.support.v4.app.o<Cursor> bm = new PlaylistFragment.5(this);
  private android.support.v4.app.o<Cursor> bn = new PlaylistFragment.6(this);
  private android.support.v4.app.o<Cursor> bo = new PlaylistFragment.7(this);
  private com.spotify.mobile.android.util.l<PlaylistFragment.StateFlags> bp = new PlaylistFragment.8(this, EnumSet.of(PlaylistFragment.StateFlags.m, PlaylistFragment.StateFlags.e, PlaylistFragment.StateFlags.h, PlaylistFragment.StateFlags.d));
  private com.spotify.mobile.android.util.l<PlaylistFragment.StateFlags> bq = new PlaylistFragment.9(this, EnumSet.of(PlaylistFragment.StateFlags.g, PlaylistFragment.StateFlags.f));
  private com.spotify.mobile.android.util.l<PlaylistFragment.StateFlags> br = new PlaylistFragment.10(this, EnumSet.of(PlaylistFragment.StateFlags.b, PlaylistFragment.StateFlags.c, PlaylistFragment.StateFlags.i));
  private android.support.v4.app.o<Cursor> bs = new PlaylistFragment.11(this);
  private dp bt = new PlaylistFragment.13(this);

  static
  {
    ArrayList localArrayList = new ArrayList();
    ac = localArrayList;
    localArrayList.add(new cv("name", 2131690298));
    ac.add(new cv("time_added", 2131690297));
    ac.add(new cv("artist_name", 2131690293));
    ac.add(new cv("album_name", 2131690292));
    ac.add(ad);
    i = new String[] { "owner_uri", "subscriber_count", "offline_state", "is_subscribed", "is_own", "name", "is_collaborative", "sync_progress", "is_published", "is_starred", "is_toptracks", "is_available", "is_user_browsable", "is_radio_available", "image_large_uri", "playable_item_count", "description", "time_modified", "length", "item_count" };
  }

  public PlaylistFragment()
  {
  }

  private boolean D()
  {
    return "local".equals(this.aE);
  }

  private boolean E()
  {
    return "queue".equals(this.aE);
  }

  public static boolean b(Intent paramIntent)
  {
    return paramIntent.hasExtra("playlist_uri");
  }

  public final Fragment C()
  {
    return this;
  }

  public final Uri a()
  {
    return Uri.parse(this.aE);
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.ae.a();
    boolean bool1;
    FragmentActivity localFragmentActivity1;
    label115: FrameLayout localFrameLayout;
    String str;
    label879: boolean bool2;
    ViewGroup localViewGroup3;
    if ((ds.b(i())) && (!this.aM))
    {
      bool1 = true;
      this.aa = bool1;
      localFragmentActivity1 = i();
      this.aq = com.spotify.mobile.android.ui.stuff.f.a(localFragmentActivity1, null);
      this.aq.setOnClickListener(this.bl);
      this.aw = FilterHeaderView.a(paramLayoutInflater, this.aG, ac, ad, this.bi);
      if (!this.aM)
        break label1127;
      this.ap = com.spotify.mobile.android.ui.prettylist.e.c(i());
      this.aw.setBackgroundColor(com.spotify.android.paste.widget.g.a(localFragmentActivity1, 2130772373));
      this.ap.c(this.aw);
      localFrameLayout = new FrameLayout(localFragmentActivity1);
      localFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
      localFrameLayout.addView(this.ap.i());
      View localView1 = new View(localFragmentActivity1);
      localView1.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
      localFrameLayout.addView(localView1);
      FilterHeaderView.a(localView1, this.aw);
      if (this.ap.b() != null)
      {
        com.spotify.mobile.android.ui.prettylist.c localc = this.ap;
        FragmentActivity localFragmentActivity4 = i();
        LinearLayout localLinearLayout = new LinearLayout(i());
        localLinearLayout.setOrientation(1);
        localLinearLayout.setGravity(17);
        localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.ar = com.spotify.android.paste.widget.h.a(localFragmentActivity4, localLinearLayout, j().getString(2131689991), j().getString(2131689990));
        ((LinearLayout.LayoutParams)this.ar.getLayoutParams()).bottomMargin = com.spotify.android.paste.graphics.d.a(8.0F, j());
        this.ar.setOnClickListener(this.be);
        this.as = com.spotify.android.paste.widget.h.a(localFragmentActivity4, localLinearLayout);
        this.as.setGravity(17);
        this.as.setIncludeFontPadding(false);
        this.as.setMaxLines(2);
        this.as.setEllipsize(TextUtils.TruncateAt.END);
        this.as.setLineSpacing(com.spotify.android.paste.graphics.d.a(4.0F, j()), 1.0F);
        com.spotify.android.paste.widget.g.b(i(), this.as, 2130772390);
        localLinearLayout.addView(this.ar);
        localLinearLayout.addView(this.as);
        localc.a(localLinearLayout);
        this.at = new com.spotify.mobile.android.ui.view.paste.a(i());
        this.at.a(this.bf);
        this.at.c(a(2131689988));
        this.ap.a(this.bg);
      }
      localFrameLayout.setBackgroundColor(com.spotify.android.paste.widget.g.a(i(), 16842836));
      this.af = this.ap.c();
      this.af.setFastScrollEnabled(true);
      ViewGroup localViewGroup1 = i.c(i());
      this.af.addHeaderView(localViewGroup1, null, false);
      this.av = ((DownloadHeaderView)i.a(i()));
      this.av.a(this.bj);
      localViewGroup1.addView(this.av);
      FragmentActivity localFragmentActivity2 = i();
      EmptyView localEmptyView = new EmptyView(localFragmentActivity2);
      localEmptyView.a(localFragmentActivity2.getString(2131690154));
      localEmptyView.b(localFragmentActivity2.getString(2131690153));
      if (!ds.b(localFragmentActivity2))
      {
        com.spotify.android.paste.graphics.e locale = new com.spotify.android.paste.graphics.e(localFragmentActivity2, SpotifyIcon.Z);
        locale.a(com.spotify.android.paste.widget.g.a(localFragmentActivity2, 2130772376));
        locale.a(j().getDimensionPixelSize(2131427413));
        localEmptyView.a(locale);
      }
      Button localButton = com.spotify.android.paste.widget.h.b(localFragmentActivity2, localEmptyView);
      localButton.setText(2131690129);
      localButton.setOnClickListener(new PlaylistFragment.17(this));
      localEmptyView.a(localButton);
      localEmptyView.setClickable(true);
      this.ay = localEmptyView;
      localFrameLayout.addView(this.ay);
      this.ay.setVisibility(8);
      View localView2 = this.ap.i();
      localView2.setVisibility(4);
      this.ax = LoadingView.a(paramLayoutInflater, i(), localView2);
      localFrameLayout.addView(this.ax);
      this.ae.a(this.bq);
      this.ae.a(this.bp);
      this.ae.a(this.br);
      this.aB = new aa(i(), this.bd);
      this.au = com.spotify.mobile.android.spotlets.collection.a.a.a(i(), "");
      if (!FeatureFragment.h.a())
        break label1233;
      str = a(2131690195);
      this.aA = new q(i());
      this.aA.a(this.aB, str, 0);
      this.aA.a(new w(this.au, (byte)0), null, 1);
      this.aA.b(new int[] { 1 });
      if (FeatureFragment.an.a())
      {
        bool2 = dg.a(i());
        if (!FeatureFragment.ao.a())
          break label1245;
        FragmentActivity localFragmentActivity3 = i();
        ListView localListView = this.af;
        localViewGroup3 = (ViewGroup)LayoutInflater.from(localFragmentActivity3).inflate(2130903125, localListView, false);
        localViewGroup3.setOnClickListener(new PlaylistFragment.16(this));
      }
    }
    label1233: label1245: for (ViewGroup localViewGroup2 = localViewGroup3; ; localViewGroup2 = null)
    {
      this.aC = new z(i(), this.bc);
      if (!FeatureFragment.ap.a());
      for (t localt = new t(this.bh, bool2); ; localt = null)
      {
        this.aA.a(this.aC, 2131690155, 2, localt, localViewGroup2);
        if (bool2)
          t().a(2131362144, null, this.bo);
        this.aA.a(bool2);
        a(this.aA);
        return localFrameLayout;
        bool1 = false;
        break;
        label1127: if (this.aa)
        {
          this.ap = com.spotify.mobile.android.ui.prettylist.e.b(i());
          this.aw.setBackgroundColor(com.spotify.android.paste.widget.g.a(localFragmentActivity1, 2130772373));
          break label115;
        }
        this.ap = com.spotify.mobile.android.ui.prettylist.e.a(i());
        this.ap.b(this.aq);
        this.ap.a(com.spotify.android.paste.widget.g.a(localFragmentActivity1, 2130772373));
        this.ap.a().a(true);
        this.ap.a(this.aL);
        break label115;
        str = null;
        break label879;
      }
    }
  }

  public final String a(Context paramContext)
  {
    if (this.aL == null)
      return paramContext.getString(2131690152);
    return this.aL;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = g();
    this.aE = localBundle.getString("playlist_uri");
    this.aF = localBundle.getString("playlist_owner_uri");
    this.aG = localBundle.getString("filter");
    this.aH = cv.a(localBundle.getString("sort_order"), ac);
    this.aL = localBundle.getString("title");
    this.aM = localBundle.getBoolean("is_sub_fragment");
    this.aS = ((ViewUri.Verified)localBundle.getParcelable("referer"));
    if (this.aS == null)
      this.aS = ViewUri.aV;
    if (paramBundle != null)
    {
      this.aH = cv.a(paramBundle.getString("sort_order"), ac);
      this.aG = paramBundle.getString("filter");
      this.ag = paramBundle.getParcelable("list");
      this.aW = paramBundle.getInt("suggested_tracks_offset");
    }
    if (this.aG == null)
      this.aG = "";
    if (this.aH == null)
      this.aH = ad;
    if (!this.aM);
    for (boolean bool = true; ; bool = false)
    {
      a_(bool);
      this.ah = -1;
      if (paramBundle == null)
      {
        String str = localBundle.getString("lookup_track_uri");
        if (str != null)
        {
          this.ai = new do(i(), t(), 2131362145, this.bt);
          Uri localUri = com.spotify.mobile.android.provider.o.b(this.aE);
          this.ai.a(localUri, str, this.aH.b());
        }
      }
      this.az = new com.spotify.mobile.android.util.g();
      ViewUri.Verified localVerified = ViewUri.B.a(this.aE);
      this.aY = dv.a(i(), localVerified);
      return;
    }
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
    c(paramMenu);
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    k localk = this.ae;
    PlaylistFragment.StateFlags localStateFlags = PlaylistFragment.StateFlags.a;
    localk.b();
    localk.a(localStateFlags, true);
    localk.b();
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    int j = paramInt - this.af.getHeaderViewsCount();
    Uri localUri1 = com.spotify.mobile.android.provider.o.b(this.aE);
    ViewUri.Verified localVerified = ViewUri.B.a(this.aE);
    if (FeatureFragment.h.a())
    {
      ShufflePlayHeaderView.a(this.az, this.aq);
      ClientEvent localClientEvent2 = ClientEvent.b(localUri1, paramLong);
      if (this.aA.b(j) == 2)
      {
        com.spotify.mobile.android.ui.actions.a.a(i(), localVerified, ViewUri.SubView.q, localClientEvent2);
        return;
      }
      com.spotify.mobile.android.ui.actions.a.a(i(), localVerified, ViewUri.SubView.a, localClientEvent2);
      return;
    }
    if (this.aA.b(j) == 2);
    ClientEvent localClientEvent1;
    for (Uri localUri2 = com.spotify.mobile.android.provider.o.a(this.aE, this.aW); ; localUri2 = com.spotify.mobile.android.provider.o.a(this.aE, this.aG))
    {
      com.spotify.mobile.android.ui.actions.d.a(i(), localVerified, ViewUri.SubView.a, this.aS, localUri2, paramLong, false);
      localClientEvent1 = ClientEvent.a(localUri2, paramLong);
      if (this.aA.b(j) != 2)
        break;
      com.spotify.mobile.android.ui.actions.a.a(i(), localVerified, ViewUri.SubView.q, localClientEvent1);
      return;
    }
    com.spotify.mobile.android.ui.actions.a.a(i(), localVerified, ViewUri.SubView.a, localClientEvent1);
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    b().setOnCreateContextMenuListener(this);
    t().a(2131362141, null, this.bm);
    t().a(2131362146, null, this.bn);
    t().a(2131362143, null, this.bk);
    if (this.aF != null)
      t().a(2131362142, null, this.bs);
  }

  public final void c(Menu paramMenu)
  {
    if (this.aT == 0);
    while (true)
    {
      return;
      ViewUri.Verified localVerified = ViewUri.B.a(this.aE);
      if ((this.aE != null) && (ds.b(i())) && (this.aT > 0))
        this.aq = com.spotify.mobile.android.ui.menus.a.a(i(), paramMenu, localVerified, com.spotify.mobile.android.provider.o.b(this.aE));
      if ((!E()) && (!D()) && ((this.aJ) || (this.aI)))
        com.spotify.mobile.android.ui.menus.e.a(i(), paramMenu, localVerified, com.spotify.mobile.android.provider.o.a(this.aE), new SpotifyLink(this.aE).a(), this.aU, this.aV);
      if ((!E()) && (this.aO))
      {
        if (((!this.aQ) || (this.aJ)) && (!this.aR) && (this.aP))
          com.spotify.mobile.android.ui.menus.a.b(i(), paramMenu, localVerified, this.aE);
        com.spotify.mobile.android.ui.menus.a.a(i(), paramMenu, localVerified, this.aD, "", this.aE);
      }
      if ((!E()) && (!D()))
      {
        if (!this.aJ)
          break label309;
        if ((!this.aQ) && (!this.aR))
        {
          com.spotify.mobile.android.ui.menus.e.b(i(), paramMenu, localVerified, this.aE);
          com.spotify.mobile.android.ui.menus.e.b(i(), paramMenu, localVerified, this.aE, this.aK);
        }
        if (!this.aK)
          com.spotify.mobile.android.ui.menus.e.c(i(), paramMenu, localVerified, this.aE, this.aN);
      }
      while (E())
      {
        com.spotify.mobile.android.ui.menus.e.a(i(), paramMenu, localVerified);
        return;
        label309: com.spotify.mobile.android.ui.menus.e.a(i(), paramMenu, localVerified, this.aE, this.aI);
      }
    }
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("sort_order", this.aH.b());
    paramBundle.putString("filter", this.aG);
    paramBundle.putInt("suggested_tracks_offset", this.aW);
    if (this.af != null)
      paramBundle.putParcelable("list", this.af.onSaveInstanceState());
  }

  public final void e()
  {
    FilterHeaderView.a(this.aw);
    this.ax.clearAnimation();
    ((ViewGroup)v()).removeView(this.ax);
    this.ae.b(this.bq);
    this.ae.b(this.bp);
    this.ae.b(this.br);
    super.e();
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
    }
    while (!(localObject instanceof com.spotify.mobile.android.model.m));
    this.bc.a(paramContextMenu, (com.spotify.mobile.android.model.m)localObject);
  }

  public final void w()
  {
    super.w();
    this.ax.a();
    this.aY.a();
  }

  public final void x()
  {
    super.x();
    if (this.ak)
    {
      com.spotify.mobile.android.ui.actions.d.e(i());
      this.ak = false;
    }
    this.aY.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.PlaylistFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
