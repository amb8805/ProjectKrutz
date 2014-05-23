package com.spotify.mobile.android.spotlets.browse.util;

import android.content.res.Resources;
import com.spotify.mobile.android.spotlets.browse.model.Genre;
import java.util.HashMap;

public class GenresHashMap extends HashMap<String, Genre>
{
  static final long serialVersionUID = 1L;
  private final transient Resources a;

  public GenresHashMap(Resources paramResources)
  {
    this.a = paramResources;
  }

  public final void a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    put(paramString, new Genre(null, paramString, null, this.a.getString(paramInt1), paramInt2, paramInt3, null, null, null, null));
  }

  public final void a(String paramString1, String paramString2, int paramInt)
  {
    put(paramString2, new Genre(null, paramString2, paramString1, this.a.getString(paramInt), -1, -1, null, null, null, null));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.util.GenresHashMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
