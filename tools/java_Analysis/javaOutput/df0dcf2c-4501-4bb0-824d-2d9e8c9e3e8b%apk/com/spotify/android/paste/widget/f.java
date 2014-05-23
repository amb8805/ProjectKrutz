package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.TypedArray;
import com.spotify.android.paste.b;

public final class f
{
  static boolean a = true;

  static <T> void a(Class<T> paramClass, T paramT)
  {
    if ((a) && (paramT.getClass() != paramClass))
      throw new UnsupportedOperationException("You are not allowed to subclass " + paramClass.getName());
  }

  public static boolean a(Context paramContext)
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = b.f;
    localTypedArray = paramContext.obtainStyledAttributes(arrayOfInt);
    try
    {
      boolean bool = localTypedArray.getBoolean(0, true);
      return bool;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
