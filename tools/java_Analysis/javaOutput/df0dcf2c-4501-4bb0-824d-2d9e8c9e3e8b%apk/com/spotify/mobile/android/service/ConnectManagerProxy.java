package com.spotify.mobile.android.service;

import com.spotify.mobile.android.service.managers.ConnectManager;

public class ConnectManagerProxy extends AbstractProxyService<ConnectManager>
{
  public ConnectManagerProxy()
  {
  }

  public void onCreate()
  {
    super.onCreate();
    this.c = new d(this);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.ConnectManagerProxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
