package com.spotify.mobile.android.spotlets.artist;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.n;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.provider.r;
import com.spotify.mobile.android.spotlets.artist.adapters.ArtistPageAdapter.Section;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistInfo;
import com.spotify.mobile.android.spotlets.artist.model.FollowLoader;
import com.spotify.mobile.android.spotlets.artist.view.c.e;
import com.spotify.mobile.android.ui.activity.m;
import com.spotify.mobile.android.ui.fragments.g;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;
import com.spotify.mobile.android.util.ad;
import com.spotify.mobile.android.util.ae;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.ds;
import com.spotify.mobile.android.util.dx;
import java.util.List;

public class i extends a
  implements com.spotify.mobile.android.model.l, com.spotify.mobile.android.spotlets.artist.model.b, m, g, ae
{
  private com.spotify.mobile.android.spotlets.artist.view.a.a Y;
  private FollowLoader Z;
  private com.spotify.mobile.android.spotlets.artist.model.h aa = new i.1(this);
  private com.spotify.mobile.android.spotlets.artist.view.c.b ab = new i.2(this);
  private ab ac = new i.3(this);
  aa b;
  private e c = (e)c.a(i.class, e.class);
  private com.spotify.mobile.android.spotlets.artist.view.c.a d;
  private com.spotify.mobile.android.spotlets.artist.b.a e;
  private com.spotify.mobile.android.spotlets.artist.a.b f;
  private int g = -1;
  private String h;
  private com.spotify.mobile.android.util.tracking.h i;

  static
  {
    c.a(i.class, e.class, new e());
  }

  public i()
  {
  }

  protected final View D()
  {
    return this.d.c();
  }

  public final boolean F()
  {
    return this.d.g();
  }

  public final void G()
  {
    this.Y.a();
  }

  public final Uri a()
  {
    return Uri.parse(this.e.f());
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.d.a(this);
    t().a(2131362101, null, this.b);
    this.Z.a(t());
    return super.a(paramLayoutInflater, paramViewGroup, paramBundle);
  }

  public final String a(Context paramContext)
  {
    if (this.h == null)
      return paramContext.getString(2131689505);
    return this.h;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.e = com.spotify.mobile.android.spotlets.artist.b.h.a(g().getString("artist_uri"));
    this.d = e.a(i(), this.e);
    this.d.a(this.ab);
    this.f = new com.spotify.mobile.android.spotlets.artist.a.b(i().getApplicationContext(), this.d);
    if (paramBundle != null)
      this.g = paramBundle.getInt("gallery_item", -1);
    this.i = new com.spotify.mobile.android.util.tracking.h(i(), b().toString());
    this.i.b(paramBundle);
    this.Y = new com.spotify.mobile.android.spotlets.artist.view.a.a(i(), this.e.f());
    a_(true);
    this.Z = new FollowLoader(i(), this.e.f(), this.aa);
    this.b = new aa(i(), this.ac);
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
    ViewUri.Verified localVerified = ViewUri.G.a(this.e.f());
    com.spotify.mobile.android.ui.menus.a.b(i(), paramMenu, localVerified, this.e.f());
    com.spotify.mobile.android.ui.menus.a.a(i(), paramMenu, localVerified, a(i()), "", this.e.f());
    if (FeatureFragment.as.a());
    for (View localView = com.spotify.mobile.android.ui.menus.a.b(i(), paramMenu, localVerified, r.a(this.e.f())); ; localView = com.spotify.mobile.android.ui.menus.a.a(i(), paramMenu, localVerified, com.spotify.mobile.android.provider.b.c(this.e.f())))
    {
      this.d.a(localView);
      return;
    }
  }

  public final void b(Menu paramMenu)
  {
    if (FeatureFragment.as.a());
    for (MenuItem localMenuItem = paramMenu.findItem(2131362045); localMenuItem == null; localMenuItem = paramMenu.findItem(2131362044))
      return;
    if (ds.b(i()))
    {
      if ((this.a == null) || (this.a.topTracks.size() == 0))
      {
        localMenuItem.setVisible(false);
        return;
      }
      localMenuItem.setVisible(true);
      return;
    }
    localMenuItem.setVisible(false);
  }

  protected final void b(ArtistModel paramArtistModel)
  {
    this.d.b(paramArtistModel);
    this.f.c();
    this.h = paramArtistModel.info.name;
    if (i() != null)
      i().v_();
    if (this.g >= 0)
      this.d.a(this.g);
    this.d.b().setOnCreateContextMenuListener(this);
    if (!this.i.d())
      this.i.b();
    a(this.h);
    i().v_();
    String str;
    if (g().getBoolean("autoplay", false))
    {
      g().putBoolean("autoplay", false);
      str = g().getString("track_uri");
      if (paramArtistModel.topTracks.isEmpty())
        Assertion.b("Top tracks is empty, artist uri: " + this.e);
    }
    else
    {
      return;
    }
    boolean bool = TextUtils.isEmpty(str);
    int j = 0;
    if (bool);
    while (true)
    {
      int m = this.d.a(ArtistPageAdapter.Section.b.ordinal(), j);
      if (m < 0)
        break;
      this.d.b(m);
      return;
      int k = paramArtistModel.findTopTrackIndex(str);
      if (k < 0)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = str;
        arrayOfObject[1] = paramArtistModel.uri;
        bp.d("Couldn't find track (%s) in artist's (%s) top tracks", arrayOfObject);
        j = 0;
      }
      else
      {
        j = k;
      }
    }
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putInt("gallery_item", this.d.a());
    this.i.a(paramBundle);
  }

  public final void e()
  {
    this.Z.a();
    super.e();
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.Y.a(paramContextMenu, ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView);
  }

  public final void p_()
  {
    super.p_();
    this.i.a();
  }

  public final void q_()
  {
    super.q_();
    this.i.c();
  }

  public final void w()
  {
    super.w();
    this.f.a();
    ((com.spotify.mobile.android.ui.activity.l)i()).a(this);
    ((ad)c.a(ad.class)).a(this);
    a(this.h);
  }

  public final void x()
  {
    super.x();
    this.f.b();
    ((com.spotify.mobile.android.ui.activity.l)i()).a(null);
    ((ad)c.a(ad.class)).a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
