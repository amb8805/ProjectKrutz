package com.google.ads.internal;

import android.content.Context;
import com.google.ads.m;
import com.google.ads.m.a;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import com.google.ads.util.i.b;
import com.google.ads.util.i.c;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class j
  implements Runnable
{
  private String a;
  private Context b;

  public j(String paramString, Context paramContext)
  {
    this.a = paramString;
    this.b = paramContext;
  }

  protected BufferedOutputStream a(HttpURLConnection paramHttpURLConnection)
    throws IOException
  {
    return new BufferedOutputStream(paramHttpURLConnection.getOutputStream());
  }

  protected HttpURLConnection a(URL paramURL)
    throws IOException
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection();
    localHttpURLConnection.setDoOutput(true);
    localHttpURLConnection.setInstanceFollowRedirects(true);
    AdUtil.a(localHttpURLConnection, this.b);
    localHttpURLConnection.setRequestProperty("Accept", "application/json");
    localHttpURLConnection.setRequestProperty("Content-Type", "application/json");
    return localHttpURLConnection;
  }

  public void run()
  {
    String str = (String)((m.a)m.a().b.a()).h.a();
    try
    {
      localHttpURLConnection = a(new URL(str));
      byte[] arrayOfByte = new j.a(this.a).a().toString().getBytes();
      localHttpURLConnection.setFixedLengthStreamingMode(arrayOfByte.length);
      try
      {
        BufferedOutputStream localBufferedOutputStream = a(localHttpURLConnection);
        localBufferedOutputStream.write(arrayOfByte);
        localBufferedOutputStream.close();
        if (localHttpURLConnection.getResponseCode() != 200)
          b.b("Got error response from BadAd backend: " + localHttpURLConnection.getResponseMessage());
        return;
      }
      finally
      {
        localHttpURLConnection.disconnect();
      }
    }
    catch (IOException localIOException)
    {
      HttpURLConnection localHttpURLConnection;
      b.b("Error reporting bad ad.", localIOException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.internal.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
