package com.spotify.android.paste.graphics;

import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class d
{
  public static int a(float paramFloat, Resources paramResources)
  {
    return (int)(paramFloat * paramResources.getDisplayMetrics().density);
  }

  public static int b(float paramFloat, Resources paramResources)
  {
    int i = Math.round(paramFloat * paramResources.getDisplayMetrics().density);
    if (i != 0)
      return i;
    if (paramFloat == 0.0F)
      return 0;
    if (paramFloat > 0.0F)
      return 1;
    return -1;
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.graphics.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
