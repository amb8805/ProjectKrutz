package com.applovin.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AppLovinService extends Service
{
  public AppLovinService()
  {
  }

  public IBinder onBind(Intent paramIntent)
  {
    return new AppLovinService.LocalBinder();
  }

  public void onCreate()
  {
    super.onCreate();
    AppLovinSdk.getInstance(getApplicationContext());
  }
}

/* Location:
 * Qualified Name:     com.applovin.sdk.AppLovinService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
