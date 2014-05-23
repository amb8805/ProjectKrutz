package com.spotify.mobile.android.spotlets.artist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.spotlets.artist.adapters.e;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.ui.menus.ArtistMenuDelegate;
import com.spotify.mobile.android.ui.menus.ArtistMenuDelegate.CanDownload;

public final class k extends a
{
  private static final com.spotify.mobile.android.ui.cell.a e = new k.2();
  private GridView b;
  private e c;
  private ArtistMenuDelegate d = new ArtistMenuDelegate(ArtistMenuDelegate.CanDownload.b, new k.1(this));

  public k()
  {
  }

  protected final View D()
  {
    if (f.a(i()));
    for (int i = 2130903158; ; i = 2130903146)
    {
      View localView = LayoutInflater.from(i()).inflate(i, null, false);
      this.b = ((GridView)localView.findViewById(2131362409));
      this.b.setOnCreateContextMenuListener(this);
      this.b.setOnItemClickListener(new k.3(this));
      return localView;
    }
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131690068);
  }

  protected final void b(ArtistModel paramArtistModel)
  {
    this.c = new e(paramArtistModel.relatedArtists, i(), this.d, e);
    this.b.setAdapter(this.c);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
