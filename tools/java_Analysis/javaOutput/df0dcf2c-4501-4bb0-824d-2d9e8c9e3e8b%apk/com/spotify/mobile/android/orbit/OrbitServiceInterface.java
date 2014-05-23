package com.spotify.mobile.android.orbit;

import com.spotify.cosmos.router.NativeRouter;

public abstract interface OrbitServiceInterface
{
  public abstract void crash();

  public abstract OrbitPlayerInterface getOrbitPlayer();

  public abstract OrbitProviderInterface getOrbitProvider();

  public abstract OrbitPushNotificationsInterface getOrbitPushNotifications();

  public abstract OrbitSessionInterface getOrbitSession();

  public abstract void setObserver(OrbitServiceObserver paramOrbitServiceObserver);

  public abstract void start(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, NativeRouter paramNativeRouter);

  public abstract void stop();
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.orbit.OrbitServiceInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
