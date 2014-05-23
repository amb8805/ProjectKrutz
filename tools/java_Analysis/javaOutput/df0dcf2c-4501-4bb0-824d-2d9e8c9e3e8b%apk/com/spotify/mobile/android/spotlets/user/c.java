package com.spotify.mobile.android.spotlets.user;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.m;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.text.TextUtils.TruncateAt;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.router.Cosmos;
import com.spotify.cosmos.android.util.RequestBuilder;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.model.j;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager;
import com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.NavigationItem.NavigationGroup;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.adapter.w;
import com.spotify.mobile.android.ui.menus.ArtistMenuDelegate;
import com.spotify.mobile.android.ui.menus.ArtistMenuDelegate.CanDownload;
import com.spotify.mobile.android.ui.menus.PlaylistMenuDelegate;
import com.spotify.mobile.android.ui.menus.PlaylistMenuDelegate.CanDownload;
import com.spotify.mobile.android.ui.menus.PlaylistMenuDelegate.CanRemovePlaylist;
import com.spotify.mobile.android.ui.prettylist.e;
import com.spotify.mobile.android.ui.stuff.i;
import com.spotify.mobile.android.ui.view.SpotifyImageView;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;
import com.spotify.mobile.android.util.ds;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.dx;

public class c extends m
  implements com.spotify.mobile.android.model.l, com.spotify.mobile.android.spotlets.follow.b, NavigationItem, com.spotify.mobile.android.ui.fragments.g, ab
{
  private SpotifyImageView Y;
  private ToggleButton Z;
  private q aa;
  private f ab;
  private a ac;
  private w ad;
  private String ae;
  private String af;
  private String ag;
  private dt ah;
  private Resolver ai;
  private ProfileModel aj;
  private PlaylistMenuDelegate ak = new PlaylistMenuDelegate(PlaylistMenuDelegate.CanDownload.b, PlaylistMenuDelegate.CanRemovePlaylist.b, new c.1(this));
  private TextView al;
  private TextView am;
  private TextView an;
  private TextView ao;
  private View ap;
  private View aq;
  private View ar;
  private NotAvailableViewManager as;
  private com.spotify.mobile.android.util.tracking.h at;
  private com.spotify.mobile.android.ui.prettylist.c au;
  private View av;
  private ArtistMenuDelegate aw = new ArtistMenuDelegate(ArtistMenuDelegate.CanDownload.b, new c.2(this));
  private o<Cursor> ax = new c.6(this);
  private boolean i;

  public c()
  {
  }

  private void E()
  {
    if (this.as.a().booleanValue())
      return;
    this.as.a(NotAvailableViewManager.DataState.b);
    t().a(2131362155, null, this.ax);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Uri.encode(this.ag);
    String str = String.format("hm://user-profile-view/v1/android/profile/%s", arrayOfObject);
    Handler localHandler = new Handler(Looper.getMainLooper());
    Request localRequest = RequestBuilder.get(str).build();
    this.ai.resolve(localRequest, new ProfileFragment.6(this, localHandler, ProfileModel.class));
  }

  public static c a(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("user_uri", paramString1);
    localBundle.putString("title", paramString2);
    c localc = new c();
    localc.b_(localBundle);
    return localc;
  }

  private static void b(View paramView, TextView paramTextView, int paramInt)
  {
    paramTextView.setText(String.valueOf(paramInt));
    if (paramInt > 0);
    for (boolean bool = true; ; bool = false)
    {
      paramView.setClickable(bool);
      return;
    }
  }

  public final Fragment C()
  {
    return this;
  }

  public final NavigationItem.NavigationGroup D()
  {
    return NavigationItem.NavigationGroup.m;
  }

  public final Uri a()
  {
    return Uri.parse(this.ae);
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.ab = new f(i());
    this.ac = new a(i());
    this.aa = new q(i());
    paramViewGroup.findViewById(16908298);
    this.aa.a(this.ab, a(2131690172), 0, null, null);
    this.aa.a(this.ac, a(2131690171), 1, null, null);
    this.aa.b(new int[] { 0, 1 });
    Object localObject2;
    Object localObject1;
    if (com.spotify.android.paste.widget.f.a(i()))
    {
      this.av = ((ViewGroup)LayoutInflater.from(i()).inflate(2130903175, null, false));
      this.an = ((TextView)this.av.findViewById(2131362300));
      this.Y = ((SpotifyImageView)this.av.findViewById(2131362223));
      this.Y.a(2130837640);
      View localView2 = this.av.findViewById(2131362483);
      ViewGroup localViewGroup = (ViewGroup)paramLayoutInflater.inflate(2130903184, null);
      ListView localListView2 = (ListView)localViewGroup.findViewById(16908298);
      localListView2.addHeaderView(this.av, null, false);
      a(this.aa);
      this.as = new NotAvailableViewManager(i(), paramLayoutInflater, localListView2, localViewGroup);
      localObject2 = localView2;
      localObject1 = localViewGroup;
      this.as.a(2131690170);
      this.ap = ((View)localObject2).findViewById(2131362487);
      this.aq = ((View)localObject2).findViewById(2131362490);
      this.ar = ((View)localObject2).findViewById(2131362484);
      this.al = ((TextView)((View)localObject2).findViewById(2131362488));
      this.am = ((TextView)((View)localObject2).findViewById(2131362491));
      this.ao = ((TextView)((View)localObject2).findViewById(2131362485));
      this.ar.setOnClickListener(new c.3(this));
      this.ap.setOnClickListener(new c.4(this));
      this.aq.setOnClickListener(new c.5(this));
      t().a(2131362150, null, new aa(i(), this));
      return localObject1;
    }
    q localq = this.aa;
    FragmentActivity localFragmentActivity = i();
    EmptyView localEmptyView = new EmptyView(localFragmentActivity);
    localEmptyView.b().setSingleLine(false);
    localEmptyView.b().setEllipsize(null);
    localEmptyView.c().setSingleLine(false);
    localEmptyView.c().setEllipsize(null);
    localEmptyView.a(localFragmentActivity.getString(2131690169));
    localEmptyView.b(localFragmentActivity.getString(2131690168));
    c.8 local8 = new c.8(this);
    Button localButton = com.spotify.android.paste.widget.h.b(localFragmentActivity, localEmptyView);
    localButton.setId(2131362050);
    localButton.setText(2131690167);
    localButton.setSingleLine(true);
    localButton.setEllipsize(TextUtils.TruncateAt.END);
    localEmptyView.a(localButton);
    localButton.setOnClickListener(local8);
    this.ad = new w(localEmptyView, (byte)0);
    localq.a(this.ad, null, 2);
    MainActivity localMainActivity = (MainActivity)i();
    if (ds.b(localMainActivity));
    for (com.spotify.mobile.android.ui.prettylist.c localc = e.b(localMainActivity); ; localc = e.a(localMainActivity))
    {
      this.au = localc;
      this.au.a(com.spotify.android.paste.widget.g.a(localMainActivity, 2130772373));
      ListView localListView1 = this.au.c();
      View localView1 = paramLayoutInflater.inflate(2130903246, null);
      localListView1.addHeaderView(localView1);
      localListView1.setAdapter(this.aa);
      this.au.e().setImageDrawable(i.d(i()));
      FrameLayout localFrameLayout = new FrameLayout(i());
      localFrameLayout.setBackgroundColor(com.spotify.android.paste.widget.g.a(i(), 16842836));
      localFrameLayout.addView(this.au.i());
      this.as = new NotAvailableViewManager(i(), paramLayoutInflater, this.au.i(), localFrameLayout);
      localObject1 = localFrameLayout;
      localObject2 = localView1;
      break;
    }
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131690173);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ae = g().getString("user_uri");
    this.af = g().getString("title");
    this.ag = new SpotifyLink(this.ae).b();
    ViewUri.Verified localVerified = ViewUri.A.a(this.ae);
    this.at = new com.spotify.mobile.android.util.tracking.h(i(), localVerified.toString());
    this.at.b(paramBundle);
    this.ah = dv.a(i(), localVerified);
    this.ai = Cosmos.getResolver("com.spotify.profile", i());
    this.ai.connect();
    a_(true);
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    b().setOnCreateContextMenuListener(this);
    ((FollowManager)com.spotify.mobile.android.c.c.a(FollowManager.class)).a(this.ae, this);
    E();
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    int j = paramInt - b().getHeaderViewsCount();
    switch (this.aa.b(j))
    {
    default:
      return;
    case 0:
      TopArtistModel localTopArtistModel = (TopArtistModel)paramView.getTag();
      if (localTopArtistModel == null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putParcelableArray("artists-json", this.aj.getTopArtistsList().getTopArtists());
        a(MainActivity.a(i(), d.f(this.ae), null, localBundle));
        return;
      }
      a(MainActivity.a(i(), localTopArtistModel.getUri()));
      return;
    case 1:
    }
    FragmentActivity localFragmentActivity = i();
    Object localObject = paramView.getTag();
    if (localObject != null)
    {
      PlaylistModel localPlaylistModel = (PlaylistModel)localObject;
      a(MainActivity.a(localFragmentActivity, localPlaylistModel.getUri(), localPlaylistModel.getName()));
      return;
    }
    a(MainActivity.a(localFragmentActivity, d.e(this.ae)));
  }

  public final void a(com.spotify.mobile.android.spotlets.follow.a parama)
  {
    b(this.ap, this.al, parama.b());
    b(this.aq, this.am, parama.c());
    if (this.Z != null)
      this.Z.setChecked(parama.d());
  }

  public final void a(boolean paramBoolean)
  {
    this.as.a(paramBoolean);
    if (paramBoolean)
      E();
  }

  public final void b(Menu paramMenu)
  {
    paramMenu.clear();
    if (this.i)
      com.spotify.mobile.android.ui.menus.a.a(i(), paramMenu);
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    if (this.af == null)
      this.af = i().getString(2131690173);
    ((com.spotify.mobile.android.ui.activity.l)i()).a(this, this.af);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    this.at.a(paramBundle);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    Object localObject = ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView.getTag();
    if ((localObject instanceof com.spotify.mobile.android.model.b))
      this.aw.a(paramContextMenu, (com.spotify.mobile.android.model.b)localObject);
    while (!(localObject instanceof j))
      return;
    this.ak.a(paramContextMenu, (j)localObject);
  }

  public final void p_()
  {
    super.p_();
    this.at.a();
  }

  public final void q_()
  {
    super.q_();
    this.at.c();
  }

  public final void w()
  {
    super.w();
    this.ah.a();
  }

  public final void x()
  {
    super.x();
    this.ah.b();
  }

  public final void y()
  {
    this.ai.destroy();
    ((FollowManager)com.spotify.mobile.android.c.c.a(FollowManager.class)).b(this.ae, this);
    super.y();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.user.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
