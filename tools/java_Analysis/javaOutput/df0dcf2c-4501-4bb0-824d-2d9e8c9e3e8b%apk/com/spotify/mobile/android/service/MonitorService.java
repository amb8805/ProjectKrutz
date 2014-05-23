package com.spotify.mobile.android.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

public class MonitorService extends Service
{
  private y a = new y(this);

  public MonitorService()
  {
  }

  public static void a(Context paramContext, ServiceConnection paramServiceConnection)
  {
    paramContext.bindService(new Intent(paramContext, MonitorService.class), paramServiceConnection, 1);
  }

  public IBinder onBind(Intent paramIntent)
  {
    return this.a;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.MonitorService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
