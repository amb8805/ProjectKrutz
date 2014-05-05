package com.twitter.android.platform;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class TwitterAuthenticationService extends Service
{
  private a a;

  public TwitterAuthenticationService()
  {
  }

  public IBinder onBind(Intent paramIntent)
  {
    return this.a.getIBinder();
  }

  public void onCreate()
  {
    super.onCreate();
    this.a = new a(this);
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.a = null;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.TwitterAuthenticationService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
