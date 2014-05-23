package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.HttpResponseCache;
import com.squareup.okhttp.OkHttpClient;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class v
  implements Downloader
{
  private final OkHttpClient a;

  public v(Context paramContext)
  {
    this(an.b(paramContext));
  }

  private v(OkHttpClient paramOkHttpClient)
  {
    this.a = paramOkHttpClient;
  }

  private v(File paramFile)
  {
    this(paramFile, an.a(paramFile));
  }

  private v(File paramFile, long paramLong)
  {
    this(new OkHttpClient());
    try
    {
      this.a.setResponseCache(new HttpResponseCache(paramFile, paramLong));
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public final n a(Uri paramUri, boolean paramBoolean)
  {
    HttpURLConnection localHttpURLConnection = this.a.open(new URL(paramUri.toString()));
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
    String str = localHttpURLConnection.getHeaderField("OkHttp-Response-Source");
    if (str == null)
      str = localHttpURLConnection.getHeaderField("X-Android-Response-Source");
    boolean bool = an.a(str);
    return new n(localHttpURLConnection.getInputStream(), bool);
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
