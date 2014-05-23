package com.spotify.mobile.android.spotlets.openaccess.b;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.spotify.mobile.android.spotlets.openaccess.d;
import com.spotify.mobile.android.spotlets.openaccess.model.Artist;
import com.spotify.mobile.android.spotlets.openaccess.model.Image;
import com.spotify.mobile.android.spotlets.openaccess.model.Images;
import com.spotify.mobile.android.spotlets.openaccess.model.TopTracks;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.prettylist.StickyListView;
import com.spotify.mobile.android.ui.prettylist.e;
import com.spotify.mobile.android.ui.stuff.f;
import com.spotify.mobile.android.ui.stuff.i;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public final class b extends Fragment
  implements d
{
  private static final com.spotify.mobile.android.spotlets.openaccess.a.b e = new b.1();
  private com.spotify.mobile.android.ui.prettylist.c a;
  private com.spotify.mobile.android.spotlets.openaccess.c b;
  private com.spotify.mobile.android.spotlets.openaccess.a.a c;
  private q d;

  public b()
  {
  }

  public static b a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("uri", paramString);
    b localb = new b();
    localb.b_(localBundle);
    return localb;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FragmentActivity localFragmentActivity = i();
    this.c = new com.spotify.mobile.android.spotlets.openaccess.a.a(i(), e);
    this.d = new q(i());
    this.d.a(this.c, 2131690070, 0);
    SpotifyLink localSpotifyLink = new SpotifyLink(g().getString("uri"));
    this.a = e.a(localFragmentActivity);
    this.a.b(f.a(localFragmentActivity, null));
    this.a.a().a(true);
    com.spotify.mobile.android.ui.prettylist.c localc = this.a;
    LinearLayout localLinearLayout = new LinearLayout(i());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setGravity(17);
    localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    localc.a(localLinearLayout);
    this.a.c().setAdapter(this.d);
    localFragmentActivity.getApplicationContext();
    this.b = com.spotify.mobile.android.spotlets.openaccess.c.a(this);
    this.b.a(localSpotifyLink.c());
    return this.a.i();
  }

  public final void a(Artist paramArtist)
  {
    if (paramArtist.getImages().containsImage())
    {
      String str = paramArtist.getImages().getLargestImage().getImageUrl();
      Picasso localPicasso = ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a();
      localPicasso.a(str).a(new com.spotify.mobile.android.ui.c.a(i())).a(this.a.d());
      localPicasso.a(str).a(i.a(i())).a(com.spotify.mobile.android.ui.b.a.a()).a(this.a.e());
    }
    while (true)
    {
      this.a.a(paramArtist.getName());
      return;
      this.a.e().setImageDrawable(i.a(i()));
    }
  }

  public final void a(TopTracks paramTopTracks)
  {
    this.c.a(paramTopTracks.getTracks());
  }

  public final void a(Throwable paramThrowable)
  {
    bp.a(paramThrowable, paramThrowable.getMessage());
  }

  public final void b(Throwable paramThrowable)
  {
    bp.a(paramThrowable, paramThrowable.getMessage());
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.openaccess.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
