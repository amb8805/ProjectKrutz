package com.spotify.mobile.android.spotlets.artist.view.c;

import android.app.Activity;
import android.content.Context;
import android.view.View.OnCreateContextMenuListener;
import android.widget.ImageView;
import android.widget.ListView;
import com.spotify.android.paste.widget.HeaderView;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistInfo;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Image;
import com.spotify.mobile.android.ui.prettylist.PrettyHeaderView;
import com.spotify.mobile.android.ui.prettylist.e;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.List;

public final class c extends a
{
  private com.spotify.mobile.android.ui.prettylist.c b;
  private ListView c;
  private PrettyHeaderView d;
  private com.spotify.mobile.android.spotlets.artist.view.a e;

  c(Context paramContext, com.spotify.mobile.android.spotlets.artist.b.a parama)
  {
    super(paramContext, parama);
  }

  public final com.spotify.mobile.android.spotlets.artist.view.headers.a a(ArtistModel paramArtistModel)
  {
    Picasso localPicasso = ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a();
    if (paramArtistModel.info.portraits.size() != 0)
    {
      String str = ((ArtistModel.Image)paramArtistModel.info.portraits.get(0)).uri;
      localPicasso.a(com.spotify.mobile.android.provider.i.b(str)).a(new com.spotify.mobile.android.ui.c.a(d())).a(this.d.a());
      localPicasso.a(com.spotify.mobile.android.provider.i.b(str)).a(com.spotify.mobile.android.ui.stuff.i.a(d())).a(com.spotify.mobile.android.ui.b.a.a()).a(this.d.b().a());
      this.d.b().a().setOnClickListener(new c.1(this, paramArtistModel));
    }
    while (true)
    {
      return new c.2(this);
      this.d.b().a().setImageDrawable(com.spotify.mobile.android.ui.stuff.i.a(d()));
    }
  }

  public final void a(View.OnCreateContextMenuListener paramOnCreateContextMenuListener)
  {
    this.b = e.b((Activity)d());
    b(this.b.i());
    this.c = this.b.c();
    this.c.setOnCreateContextMenuListener(paramOnCreateContextMenuListener);
    this.d = this.b.b();
    this.e = new com.spotify.mobile.android.spotlets.artist.view.a(d(), this.a);
    this.d.b().a(this.e.a());
  }

  public final void a(boolean paramBoolean)
  {
    this.e.a(paramBoolean);
  }

  public final void a(boolean paramBoolean, int paramInt)
  {
    this.e.a(paramBoolean, paramInt);
  }

  public final ListView b()
  {
    return this.c;
  }

  public final boolean h()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
