package com.facebook.a;

import android.os.Bundle;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;

public final class i
{
  @Deprecated
  public static Bundle a(String paramString)
  {
    String str = paramString.replace("fbconnect", "http");
    try
    {
      URL localURL = new URL(str);
      Bundle localBundle = b(localURL.getQuery());
      localBundle.putAll(b(localURL.getRef()));
      return localBundle;
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    return new Bundle();
  }

  @Deprecated
  private static Bundle b(String paramString)
  {
    int i = 0;
    Bundle localBundle = new Bundle();
    String[] arrayOfString1;
    int j;
    if (paramString != null)
    {
      arrayOfString1 = paramString.split("&");
      j = arrayOfString1.length;
    }
    while (true)
    {
      String[] arrayOfString2;
      if (i < j)
      {
        arrayOfString2 = arrayOfString1[i].split("=");
        try
        {
          if (arrayOfString2.length == 2)
            localBundle.putString(URLDecoder.decode(arrayOfString2[0], "UTF-8"), URLDecoder.decode(arrayOfString2[1], "UTF-8"));
          else if (arrayOfString2.length == 1)
            localBundle.putString(URLDecoder.decode(arrayOfString2[0], "UTF-8"), "");
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
        }
      }
      else
      {
        return localBundle;
      }
      i++;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.a.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
