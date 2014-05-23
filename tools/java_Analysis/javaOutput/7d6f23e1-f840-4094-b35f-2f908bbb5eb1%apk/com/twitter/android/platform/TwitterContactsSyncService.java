package com.twitter.android.platform;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class TwitterContactsSyncService extends Service
{
  private static final Object a = new Object();
  private static m b = null;

  public TwitterContactsSyncService()
  {
  }

  public IBinder onBind(Intent paramIntent)
  {
    return b.getSyncAdapterBinder();
  }

  public void onCreate()
  {
    synchronized (a)
    {
      if (b == null)
        b = new m(getApplicationContext());
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.TwitterContactsSyncService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
