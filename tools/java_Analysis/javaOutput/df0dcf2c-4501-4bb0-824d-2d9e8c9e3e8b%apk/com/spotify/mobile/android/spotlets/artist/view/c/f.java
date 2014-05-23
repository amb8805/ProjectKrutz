package com.spotify.mobile.android.spotlets.artist.view.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.ListView;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.view.headers.HeaderViewSingleImage;

public final class f extends a
{
  private ListView b;
  private final com.spotify.mobile.android.spotlets.artist.b.a c;

  f(Context paramContext, com.spotify.mobile.android.spotlets.artist.b.a parama)
  {
    super(paramContext, parama);
    this.c = parama;
  }

  public final com.spotify.mobile.android.spotlets.artist.view.headers.a a(ArtistModel paramArtistModel)
  {
    HeaderViewSingleImage localHeaderViewSingleImage = HeaderViewSingleImage.a(d(), paramArtistModel.info);
    localHeaderViewSingleImage.a(paramArtistModel.info);
    localHeaderViewSingleImage.a(new f.1(this));
    this.b.addHeaderView(localHeaderViewSingleImage);
    return localHeaderViewSingleImage;
  }

  public final void a(View.OnCreateContextMenuListener paramOnCreateContextMenuListener)
  {
    b(LayoutInflater.from(d()).inflate(2130903198, null, false));
    this.b = ((ListView)e().findViewById(2131362356));
    this.b.setOnCreateContextMenuListener(paramOnCreateContextMenuListener);
  }

  public final ListView b()
  {
    return this.b;
  }

  public final boolean h()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.c.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
