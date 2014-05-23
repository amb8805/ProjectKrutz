package com.spotify.mobile.android.spotlets.socialchart;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.m;
import android.support.v4.app.n;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.google.common.collect.Lists;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.e;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.HeaderView;
import com.spotify.android.paste.widget.h;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.router.Player;
import com.spotify.cosmos.android.router.PlayerState;
import com.spotify.cosmos.android.router.PlayerState.Action;
import com.spotify.cosmos.android.router.PlayerStateBuilder;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.socialchart.model.SocialChartUserModel;
import com.spotify.mobile.android.spotlets.socialchart.model.TrackModel;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.NavigationItem.NavigationGroup;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.fragments.logic.r;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseAlbum;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseArtist;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveTrack;
import com.spotify.mobile.android.ui.stuff.f;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import java.util.Arrays;
import java.util.List;

public class b extends m
  implements NavigationItem, com.spotify.mobile.android.ui.fragments.g, ab
{
  private Resolver Y;
  private com.spotify.mobile.android.spotlets.socialchart.a.a Z;
  private Player aa;
  private com.spotify.mobile.android.ui.actions.d ab = (com.spotify.mobile.android.ui.actions.d)c.a(com.spotify.mobile.android.ui.actions.d.class);
  private SocialChartUserModel ac;
  private LoadingView ad;
  private dt ae;
  private View af;
  private ListView ag;
  private EmptyView ah;
  private EmptyView ai;
  private EmptyView aj;
  private aa ak;
  private TrackMenuDelegate al = new TrackMenuDelegate(TrackMenuDelegate.CanBrowseAlbum.a, TrackMenuDelegate.CanBrowseArtist.a, TrackMenuDelegate.CanRemoveFromCollection.a, TrackMenuDelegate.CanRemoveTrack.b, new b.1(this));
  private Handler i;

  public b()
  {
  }

  private List<String> E()
  {
    return Lists.a(Arrays.asList(this.ac.getTrackModels()), new b.4(this));
  }

  public final Fragment C()
  {
    return this;
  }

  public final NavigationItem.NavigationGroup D()
  {
    return NavigationItem.NavigationGroup.e;
  }

  final int a(String paramString)
  {
    for (int j = 0; j < this.ac.getTrackModels().length; j++)
      if (TextUtils.equals(this.ac.getTrackModels()[j].getTrackUri(), paramString))
        return j;
    return -1;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FrameLayout localFrameLayout = new FrameLayout(i());
    localFrameLayout.setBackgroundColor(com.spotify.android.paste.widget.g.a(i(), 16842836));
    localFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    com.spotify.mobile.android.ui.prettylist.d locald = com.spotify.mobile.android.ui.prettylist.d.a((MainActivity)i());
    this.af = locald.getRootView();
    localFrameLayout.addView(this.af);
    this.ag = locald.c();
    locald.a(com.spotify.android.paste.widget.g.a(i(), 2130772373));
    locald.a(i().getString(2131690291));
    locald.k();
    TextView localTextView = h.a(i(), locald.f());
    localTextView.setText(i().getString(2131690290));
    com.spotify.android.paste.widget.g.b(i(), localTextView, 2130772388);
    locald.f().a(localTextView);
    Button localButton1 = f.a(i(), null);
    localButton1.setOnClickListener(new b.2(this));
    locald.b(localButton1);
    this.Z = new com.spotify.mobile.android.spotlets.socialchart.a.a(i());
    this.ag.setAdapter(this.Z);
    this.ad = LoadingView.a(paramLayoutInflater, i(), this.af);
    this.af.setVisibility(4);
    localFrameLayout.addView(this.ad);
    this.ah = new EmptyView(i());
    this.ah.a(i().getString(2131690288));
    this.ah.b(i().getString(2131690286));
    e locale1 = new e(i(), SpotifyIcon.D, i().getResources().getDimensionPixelSize(2131427413));
    locale1.a(com.spotify.android.paste.widget.g.a(i(), 2130772376));
    this.ah.a(locale1);
    this.ah.setVisibility(8);
    Button localButton2 = h.b(i(), localFrameLayout);
    localButton2.setId(2131362050);
    localButton2.setText(2131690287);
    localButton2.setSingleLine(true);
    this.ah.a(localButton2);
    localButton2.setOnClickListener(new b.3(this));
    localFrameLayout.addView(this.ah);
    this.ai = new EmptyView(i());
    this.ai.a(i().getString(2131690285));
    this.ai.b(i().getString(2131690284));
    this.ai.setVisibility(8);
    localFrameLayout.addView(this.ai);
    this.aj = new EmptyView(i());
    this.aj.a(i().getString(2131690289));
    e locale2 = new e(i(), SpotifyIcon.cO, i().getResources().getDimensionPixelSize(2131427413));
    locale2.a(com.spotify.android.paste.widget.g.a(i(), 2130772376));
    this.aj.a(locale2);
    this.aj.setVisibility(8);
    localFrameLayout.addView(this.aj);
    return localFrameLayout;
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131690291);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.i = new Handler(i().getMainLooper());
    this.Y = new DeferredResolver("main", i());
    this.Y.connect();
    this.aa = new Player(this.Y);
    this.aa.subscribe(new SocialChartFragment.2(this, this.i, PlayerState.class));
    this.ae = dv.a(i(), ViewUri.h);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    int j = (int)paramLong;
    PlayerStateBuilder localPlayerStateBuilder = PlayerStateBuilder.create(PlayerState.Action.PLAY).contextUri("spotify:internal:social_chart").index(j).tracks(E()).viewUri("spotify:internal:social_chart");
    this.aa.play(localPlayerStateBuilder.build());
  }

  public final void a(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.aj.setVisibility(0);
      b().setVisibility(8);
      return;
    }
    this.aj.setVisibility(8);
    b().setVisibility(0);
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ak = new aa(i(), this);
    t().a(2131362174, null, this.ak);
    b().setOnCreateContextMenuListener(this);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    View localView = ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView;
    if ((localView.getTag() instanceof TrackModel))
      this.al.a(paramContextMenu, new a((TrackModel)localView.getTag()));
  }

  public final void w()
  {
    super.w();
    this.ae.a();
    this.ad.c();
    this.ad.a();
    String str = ((r)m_().a("tag_session_fragment")).b();
    this.Y.get("hm://social-charts-view/v1/user/" + Uri.encode(str), new SocialChartFragment.5(this, this.i, SocialChartUserModel.class));
  }

  public final void x()
  {
    super.x();
    this.ae.b();
  }

  public final void y()
  {
    super.y();
    this.Y.destroy();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.socialchart.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
