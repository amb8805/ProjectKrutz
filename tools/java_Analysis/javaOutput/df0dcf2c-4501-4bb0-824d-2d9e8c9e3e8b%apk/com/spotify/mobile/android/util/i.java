package com.spotify.mobile.android.util;

public final class i
{
  private static final String[] a = { "Various", "Various Artists", "Various Artist", "Various Artists.", "Various Artistes" };

  public static boolean a(String paramString)
  {
    String[] arrayOfString = a;
    int i = arrayOfString.length;
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (arrayOfString[j].equalsIgnoreCase(paramString))
          bool = true;
      }
      else
        return bool;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
