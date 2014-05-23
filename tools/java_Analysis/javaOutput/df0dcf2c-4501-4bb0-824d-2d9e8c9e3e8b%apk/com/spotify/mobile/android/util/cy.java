package com.spotify.mobile.android.util;

import java.util.HashMap;
import java.util.Map;

public final class cy
{
  private static Map<String, cy> a = new HashMap();
  private String b;

  private cy(String paramString)
  {
    this.b = paramString;
  }

  public static cy a(String paramString)
  {
    try
    {
      cc.a(paramString);
      if ((cy)a.get(paramString) != null)
        throw new AssertionError("Requesting same string for a key previously defined somewhere else");
    }
    finally
    {
    }
    cy localcy = new cy(paramString);
    a.put(paramString, localcy);
    return localcy;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.cy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
