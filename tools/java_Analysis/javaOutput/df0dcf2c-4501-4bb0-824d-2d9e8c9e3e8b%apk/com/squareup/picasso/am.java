package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build.VERSION;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class am
  implements Downloader
{
  static volatile Object a;
  private static final Object b = new Object();
  private final Context c;

  public am(Context paramContext)
  {
    this.c = paramContext.getApplicationContext();
  }

  public final n a(Uri paramUri, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      localContext = this.c;
      if (a == null)
        try
        {
          synchronized (b)
          {
            if (a == null)
            {
              File localFile = an.b(localContext);
              HttpResponseCache localHttpResponseCache = HttpResponseCache.getInstalled();
              if (localHttpResponseCache == null)
                localHttpResponseCache = HttpResponseCache.install(localFile, an.a(localFile));
              a = localHttpResponseCache;
            }
            localHttpURLConnection = (HttpURLConnection)new URL(paramUri.toString()).openConnection();
            localHttpURLConnection.setConnectTimeout(15000);
            localHttpURLConnection.setReadTimeout(20000);
            localHttpURLConnection.setUseCaches(true);
            if (paramBoolean)
              localHttpURLConnection.setRequestProperty("Cache-Control", "only-if-cached,max-age=2147483647");
            int i = localHttpURLConnection.getResponseCode();
            if (i >= 300)
            {
              localHttpURLConnection.disconnect();
              throw new Downloader.ResponseException(i + " " + localHttpURLConnection.getResponseMessage());
            }
          }
        }
        catch (IOException localIOException)
        {
          HttpURLConnection localHttpURLConnection;
          break label71;
          boolean bool = an.a(localHttpURLConnection.getHeaderField("X-Android-Response-Source"));
          return new n(localHttpURLConnection.getInputStream(), bool);
        }
    }
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.am
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
