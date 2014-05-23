package com.spotify.mobile.android.spotlets.artist.util;

import android.media.FaceDetector.Face;
import com.google.common.base.Optional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a
  implements com.spotify.mobile.android.c.a
{
  private final Map<String, List<FaceDetector.Face>> a = new HashMap();

  public a()
  {
  }

  public final Optional<List<FaceDetector.Face>> a(String paramString)
  {
    return Optional.c(this.a.get(paramString));
  }

  public final void a(String paramString, List<FaceDetector.Face> paramList)
  {
    this.a.put(paramString, paramList);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.util.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
