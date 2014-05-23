package com.spotify.mobile.android.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.bp;
import java.io.File;

public class DeleteCacheService extends IntentService
{
  private a a = (a)c.a(a.class);

  public DeleteCacheService()
  {
    super(DeleteCacheService.class.getSimpleName());
  }

  private void a(File paramFile, e parame)
  {
    if (paramFile.exists())
    {
      File[] arrayOfFile = paramFile.listFiles();
      int i = arrayOfFile.length;
      int j = 0;
      if (j < i)
      {
        File localFile = arrayOfFile[j];
        if (localFile.isDirectory())
          a(localFile, parame);
        while (true)
        {
          j++;
          break;
          long l = localFile.length();
          if (localFile.delete())
          {
            parame.d = (l + parame.d);
          }
          else
          {
            parame.e = (l + parame.e);
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = localFile.getAbsolutePath();
            bp.b("Failed deleting file: %s", arrayOfObject2);
          }
        }
      }
    }
    if (!paramFile.delete())
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = paramFile.getAbsolutePath();
      bp.b("Failed deleting directory: %s", arrayOfObject1);
    }
  }

  private void a(String paramString, e parame)
  {
    bp.b("Deleting directory at %s", new Object[] { paramString });
    File localFile1 = new File(paramString);
    File localFile2 = new File(localFile1.getAbsolutePath() + "." + SystemClock.elapsedRealtime() + ".tmp");
    if (!localFile1.renameTo(localFile2))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localFile2.getAbsolutePath();
      bp.b("Failed renaming to: %s", arrayOfObject2);
      return;
    }
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = localFile2.getAbsolutePath();
    bp.b("Renamed to: %s", arrayOfObject1);
    a(localFile2, parame);
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    ak localak = new ak(this);
    long l = SystemClock.elapsedRealtime();
    locale = new e((byte)0);
    locale.a = localak.a();
    locale.b = localak.b();
    localak.c();
    a(locale.a, locale);
    a(locale.b, locale);
    locale.c = (SystemClock.elapsedRealtime() - l);
    if (locale.c < 5000L);
    try
    {
      Thread.sleep(5000L - locale.c);
      label101: sendBroadcast(new Intent("com.spotify.mobile.android.service.BROADCAST_DELETE_CACHE_FINISHED"));
      ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.J);
      localClientEvent.a("cache-path", locale.a);
      localClientEvent.a("settings-path", locale.b);
      localClientEvent.a("time-taken", locale.c);
      localClientEvent.a("deleted-bytes", locale.d);
      localClientEvent.a("failed-bytes", locale.e);
      a.a(ViewUri.ax, ViewUri.SubView.a, localClientEvent);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label101;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.DeleteCacheService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
