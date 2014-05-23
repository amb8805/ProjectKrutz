package com.spotify.mobile.android.util;

import android.support.v4.app.Fragment;
import java.lang.reflect.Field;

public final class ba
{
  public static void a(Fragment paramFragment)
  {
    try
    {
      Field localField = Fragment.class.getDeclaredField("D");
      localField.setAccessible(true);
      localField.set(paramFragment, null);
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      throw new RuntimeException(localNoSuchFieldException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ba
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
