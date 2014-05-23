package com.spotify.mobile.android.spotlets.artist;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistInfo;
import com.spotify.mobile.android.spotlets.artist.view.headers.HeaderViewGallery;

public class h extends a
{
  private HeaderViewGallery b;
  private String c;

  public h()
  {
  }

  protected final View D()
  {
    this.b = new HeaderViewGallery(i());
    this.b.findViewById(2131362537).setVisibility(0);
    this.b.a();
    this.b.c();
    return this.b;
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131690067);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.c = i().getString(2131690067);
  }

  protected final void b(ArtistModel paramArtistModel)
  {
    this.b.a(paramArtistModel.info);
    this.c = paramArtistModel.info.name;
    a(paramArtistModel.info.name);
  }

  public final void w()
  {
    super.w();
    a(this.c);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
