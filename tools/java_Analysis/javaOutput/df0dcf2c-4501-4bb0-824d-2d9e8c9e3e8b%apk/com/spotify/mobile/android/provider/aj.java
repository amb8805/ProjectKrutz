package com.spotify.mobile.android.provider;

import android.os.Handler;
import android.os.Looper;
import com.spotify.mobile.android.service.connections.e;
import com.spotify.mobile.android.util.bp;

final class aj
  implements e
{
  aj(SpotifyProvider paramSpotifyProvider)
  {
  }

  public final void a()
  {
    bp.c("Provider connected to MetadataManager.", new Object[0]);
  }

  public final void b()
  {
    bp.c("Provider disconnected from MetadataManager.", new Object[0]);
    if (SpotifyProvider.a(this.a) != null)
    {
      SpotifyProvider.a(this.a).getLooper().quit();
      SpotifyProvider.b(this.a);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
