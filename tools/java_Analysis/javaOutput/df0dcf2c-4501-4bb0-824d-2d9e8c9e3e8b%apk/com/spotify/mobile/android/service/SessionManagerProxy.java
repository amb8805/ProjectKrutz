package com.spotify.mobile.android.service;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.spotify.mobile.android.service.managers.d;

public class SessionManagerProxy extends AbstractProxyService<d>
{
  public SessionManagerProxy()
  {
  }

  public static void a(Context paramContext, ServiceConnection paramServiceConnection)
  {
    paramContext.bindService(new Intent(paramContext, SessionManagerProxy.class), paramServiceConnection, 1);
  }

  public void onCreate()
  {
    super.onCreate();
    this.c = new ad(this);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.SessionManagerProxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
