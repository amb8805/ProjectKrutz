package com.spotify.mobile.android.spotlets.artist.view.a;

import android.content.Context;
import com.spotify.mobile.android.provider.a;
import com.spotify.mobile.android.spotlets.artist.model.j;
import com.spotify.mobile.android.ui.menus.AlbumMenuDelegate;
import com.spotify.mobile.android.ui.menus.AlbumMenuDelegate.CanBrowseArtist;
import com.spotify.mobile.android.ui.menus.AlbumMenuDelegate.CanDownload;
import com.spotify.mobile.android.ui.menus.AlbumMenuDelegate.CanRemoveFromCollection;

public final class e extends c<j>
{
  private final AlbumMenuDelegate a = new AlbumMenuDelegate(AlbumMenuDelegate.CanBrowseArtist.b, AlbumMenuDelegate.CanRemoveFromCollection.a, AlbumMenuDelegate.CanDownload.b, new e.1(this));

  public e(Context paramContext, String paramString, b paramb)
  {
    super(paramContext, paramString, paramb);
  }

  protected final void a(String paramString)
  {
    a(paramString, a.a(paramString), j.a, "uri=?", new String[] { paramString });
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
