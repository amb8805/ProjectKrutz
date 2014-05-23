package com.spotify.mobile.android.spotlets.artist.view.a;

import android.content.Context;
import com.spotify.mobile.android.model.m;
import com.spotify.mobile.android.provider.aa;
import com.spotify.mobile.android.spotlets.artist.model.k;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseAlbum;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseArtist;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveTrack;

public final class f extends c<m>
{
  private final TrackMenuDelegate a = new TrackMenuDelegate(TrackMenuDelegate.CanBrowseAlbum.a, TrackMenuDelegate.CanBrowseArtist.b, TrackMenuDelegate.CanRemoveFromCollection.a, TrackMenuDelegate.CanRemoveTrack.b, new f.1(this));

  public f(Context paramContext, String paramString, b paramb)
  {
    super(paramContext, paramString, paramb);
  }

  protected final void a(String paramString)
  {
    a(paramString, aa.a(paramString), k.a, "uri=?", new String[] { paramString });
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
