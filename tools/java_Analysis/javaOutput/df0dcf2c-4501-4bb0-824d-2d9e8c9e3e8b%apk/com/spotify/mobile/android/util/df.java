package com.spotify.mobile.android.util;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public final class df
{
  public static String a(int paramInt)
  {
    int i = paramInt % 60;
    int j = paramInt / 60;
    Locale localLocale = Locale.getDefault();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(j);
    arrayOfObject[1] = Integer.valueOf(i);
    return String.format(localLocale, "%d:%02d", arrayOfObject);
  }

  public static String a(String paramString)
  {
    int i = 0;
    Assertion.a(Integer.valueOf(0), Integer.valueOf(paramString.length() % 2));
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    while (i < paramString.length())
    {
      localByteArrayOutputStream.write(0x2A ^ Integer.parseInt(paramString.substring(i, i + 2), 16));
      i += 2;
    }
    try
    {
      String str = new String(localByteArrayOutputStream.toByteArray(), "UTF-16");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException(localUnsupportedEncodingException);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.df
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
