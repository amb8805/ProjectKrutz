package com.spotify.mobile.android.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class ds
{
  public static boolean a(Context paramContext)
  {
    return paramContext.getResources().getConfiguration().orientation == 1;
  }

  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == paramObject2;
  }

  public static boolean b(Context paramContext)
  {
    return paramContext.getResources().getConfiguration().orientation == 2;
  }

  public static boolean c(Context paramContext)
  {
    return paramContext.getResources().getBoolean(2131230727);
  }

  public static boolean d(Context paramContext)
  {
    return (c(paramContext)) && (b(paramContext));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ds
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
