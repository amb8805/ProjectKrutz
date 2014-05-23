package com.spotify.mobile.android.spotlets.artist.view.c;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistInfo;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Image;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.ui.stuff.f;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.List;

public final class d extends a
{
  private ListView b;
  private Button c;
  private final com.spotify.mobile.android.spotlets.artist.b.a d;
  private com.spotify.mobile.android.ui.actions.d e = (com.spotify.mobile.android.ui.actions.d)c.a(com.spotify.mobile.android.ui.actions.d.class);
  private com.spotify.mobile.android.ui.actions.a f = (com.spotify.mobile.android.ui.actions.a)c.a(com.spotify.mobile.android.ui.actions.a.class);
  private com.spotify.mobile.android.ui.prettylist.d g;
  private com.spotify.mobile.android.spotlets.artist.view.a h;
  private View.OnClickListener i = new d.3(this);

  d(Context paramContext, com.spotify.mobile.android.spotlets.artist.b.a parama)
  {
    super(paramContext, parama);
    this.d = parama;
  }

  public final com.spotify.mobile.android.spotlets.artist.view.headers.a a(ArtistModel paramArtistModel)
  {
    Picasso localPicasso = ((dd)c.a(dd.class)).a();
    if (paramArtistModel.info.portraits.size() != 0)
    {
      String str = ((ArtistModel.Image)paramArtistModel.info.portraits.get(0)).uri;
      localPicasso.a(com.spotify.mobile.android.provider.i.b(str)).a(new com.spotify.mobile.android.ui.c.a(d())).a(this.g.d());
      localPicasso.a(com.spotify.mobile.android.provider.i.b(str)).a(com.spotify.mobile.android.ui.stuff.i.a(d())).a(com.spotify.mobile.android.ui.b.a.a()).a(this.g.e());
      this.g.e().setOnClickListener(new d.1(this, paramArtistModel));
    }
    while (true)
    {
      this.g.a(paramArtistModel.info.name);
      return new d.2(this);
      this.g.e().setImageDrawable(com.spotify.mobile.android.ui.stuff.i.a(d()));
    }
  }

  public final void a(View.OnCreateContextMenuListener paramOnCreateContextMenuListener)
  {
    if (FeatureFragment.as.a());
    for (this.c = f.a(d(), null, SpotifyIcon.bC, 2131690000); ; this.c = f.a(d(), null))
    {
      this.c.setOnClickListener(this.i);
      this.g = com.spotify.mobile.android.ui.prettylist.d.a((MainActivity)d());
      this.g.b(this.c);
      this.g.k();
      b(this.g);
      this.b = this.g.c();
      this.b.setOnCreateContextMenuListener(paramOnCreateContextMenuListener);
      this.h = new com.spotify.mobile.android.spotlets.artist.view.a(d(), this.a);
      this.g.a(this.h.a());
      return;
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.h.a(paramBoolean);
  }

  public final void a(boolean paramBoolean, int paramInt)
  {
    this.h.a(paramBoolean, paramInt);
  }

  public final ListView b()
  {
    return this.b;
  }

  protected final View f()
  {
    return this.c;
  }

  public final boolean h()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.c.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
