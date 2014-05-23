package com.spotify.mobile.android.orbit;

public final class OrbitPushNotifications
  implements OrbitPushNotificationsInterface
{
  private int nOrbitPushNotificationsPtr;

  private OrbitPushNotifications()
  {
  }

  public final native void registerGcmDevice(String paramString);

  public final native void setPreviousGcmRegistrationId(String paramString);
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.orbit.OrbitPushNotifications
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
