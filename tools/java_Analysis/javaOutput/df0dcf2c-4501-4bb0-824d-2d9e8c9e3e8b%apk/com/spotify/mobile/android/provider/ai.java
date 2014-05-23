package com.spotify.mobile.android.provider;

import android.os.Bundle;
import java.util.Locale;

public final class ai
{
  public static Bundle a(String paramString, String[] paramArrayOfString)
  {
    Bundle localBundle = new Bundle();
    if (paramString == null)
      return localBundle;
    String[] arrayOfString1 = paramString.split(",");
    int i = arrayOfString1.length;
    int j = 0;
    int k = 0;
    String str1;
    String str2;
    while (true)
      if (j < i)
      {
        String[] arrayOfString2 = arrayOfString1[j].split("=");
        if (arrayOfString2.length == 2)
        {
          str1 = arrayOfString2[0].trim().toLowerCase(Locale.US);
          str2 = arrayOfString2[1].trim();
          if (str2.equals("?"))
          {
            if (paramArrayOfString == null)
              throw new IllegalArgumentException("selectionArgs cannot be null");
            if (k >= paramArrayOfString.length)
              throw new IllegalArgumentException("too few values in selectionArgs");
            str2 = paramArrayOfString[k].trim();
            k++;
          }
        }
        try
        {
          localBundle.putInt(str1, Integer.valueOf(str2).intValue());
          j++;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          while (true)
            localBundle.putString(str1, str2);
        }
      }
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.ai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
