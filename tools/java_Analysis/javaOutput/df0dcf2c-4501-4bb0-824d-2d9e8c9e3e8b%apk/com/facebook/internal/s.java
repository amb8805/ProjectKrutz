package com.facebook.internal;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStream;;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

class s
{
  static final String a = s.class.getSimpleName();
  private static volatile b b;

  s()
  {
  }

  static InputStream a(Context paramContext, HttpURLConnection paramHttpURLConnection)
  {
    int i = paramHttpURLConnection.getResponseCode();
    Object localObject = null;
    if (i == 200)
    {
      URL localURL = paramHttpURLConnection.getURL();
      localObject = paramHttpURLConnection.getInputStream();
      try
      {
        if (a(localURL.toURI()))
        {
          InputStream localInputStream = b(paramContext).a(localURL.toString(), new t((InputStream)localObject, paramHttpURLConnection));
          localObject = localInputStream;
        }
        return localObject;
      }
      catch (URISyntaxException localURISyntaxException)
      {
        return localObject;
      }
      catch (IOException localIOException)
      {
      }
    }
    return localObject;
  }

  static InputStream a(URI paramURI, Context paramContext)
  {
    Object localObject = null;
    if (paramURI != null)
    {
      boolean bool = a(paramURI);
      localObject = null;
      if (bool)
        try
        {
          InputStream localInputStream = b(paramContext).a(paramURI.toString(), null);
          localObject = localInputStream;
          return localObject;
        }
        catch (IOException localIOException)
        {
          localIOException.toString();
          u.c();
        }
    }
    return null;
  }

  static void a(Context paramContext)
  {
    try
    {
      b(paramContext).a();
      return;
    }
    catch (IOException localIOException)
    {
      new StringBuilder("clearCache failed ").append(localIOException.getMessage());
      u.c();
    }
  }

  private static boolean a(URI paramURI)
  {
    if (paramURI != null)
    {
      String str = paramURI.getHost();
      if (str.endsWith("fbcdn.net"));
      while ((str.startsWith("fbcdn")) && (str.endsWith("akamaihd.net")))
        return true;
    }
    return false;
  }

  private static b b(Context paramContext)
  {
    try
    {
      if (b == null)
        b = new b(paramContext.getApplicationContext(), a, new f());
      b localb = b;
      return localb;
    }
    finally
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
