package com.spotify.mobile.android.service;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.spotify.mobile.android.service.managers.b;

public class MetadataManagerProxy extends AbstractProxyService<b>
{
  public MetadataManagerProxy()
  {
  }

  public static void a(Context paramContext, ServiceConnection paramServiceConnection)
  {
    paramContext.bindService(new Intent(paramContext, MetadataManagerProxy.class), paramServiceConnection, 1);
  }

  public void onCreate()
  {
    super.onCreate();
    this.c = new x(this);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.MetadataManagerProxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
