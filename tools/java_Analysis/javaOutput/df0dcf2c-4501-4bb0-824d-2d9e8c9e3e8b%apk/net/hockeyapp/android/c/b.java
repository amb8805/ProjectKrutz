package net.hockeyapp.android.c;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Environment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;
import net.hockeyapp.android.b.a;

public final class b extends AsyncTask<String, Integer, Boolean>
{
  private Context a;
  private a b;
  private String c;
  private String d;
  private String e;
  private ProgressDialog f;

  public b(Context paramContext, String paramString, a parama)
  {
    this.a = paramContext;
    this.c = paramString;
    this.d = (UUID.randomUUID() + ".apk");
    this.e = (Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download");
    this.b = parama;
  }

  private Boolean b()
  {
    HttpURLConnection localHttpURLConnection;
    try
    {
      localHttpURLConnection = (HttpURLConnection)new URL(this.c + "&type=apk").openConnection();
      localHttpURLConnection.addRequestProperty("User-Agent", "HockeySDK/Android");
      localHttpURLConnection.setInstanceFollowRedirects(true);
      if (Build.VERSION.SDK_INT <= 9)
        localHttpURLConnection.setRequestProperty("connection", "close");
      localHttpURLConnection.connect();
      i = localHttpURLConnection.getContentLength();
      localFile1 = new File(this.e);
      if ((!localFile1.mkdirs()) && (!localFile1.exists()))
        throw new IOException("Could not create the dir(s):" + localFile1.getAbsolutePath());
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return Boolean.valueOf(false);
    }
    int i;
    File localFile1;
    File localFile2 = new File(localFile1, this.d);
    BufferedInputStream localBufferedInputStream = new BufferedInputStream(localHttpURLConnection.getInputStream());
    FileOutputStream localFileOutputStream = new FileOutputStream(localFile2);
    byte[] arrayOfByte = new byte[1024];
    long l = 0L;
    while (true)
    {
      int j = localBufferedInputStream.read(arrayOfByte);
      if (j == -1)
        break;
      l += j;
      Integer[] arrayOfInteger = new Integer[1];
      arrayOfInteger[0] = Integer.valueOf((int)(100L * l / i));
      publishProgress(arrayOfInteger);
      localFileOutputStream.write(arrayOfByte, 0, j);
    }
    localFileOutputStream.flush();
    localFileOutputStream.close();
    localBufferedInputStream.close();
    if (l > 0L);
    for (boolean bool = true; ; bool = false)
    {
      Boolean localBoolean = Boolean.valueOf(bool);
      return localBoolean;
    }
  }

  public final void a()
  {
    this.a = null;
    this.f = null;
  }

  public final void a(Context paramContext)
  {
    this.a = paramContext;
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
