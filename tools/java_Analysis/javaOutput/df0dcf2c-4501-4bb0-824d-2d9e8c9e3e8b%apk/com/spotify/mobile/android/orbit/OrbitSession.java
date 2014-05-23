package com.spotify.mobile.android.orbit;

public final class OrbitSession
  implements OrbitSessionInterface
{
  private int nOrbitSessionPtr;

  private OrbitSession()
  {
  }

  public final native void eraseOfflineUser();

  public final native void logDeviceIdentifier(String paramString1, String paramString2);

  public final native void logDevicePowerStatus(String paramString1, String paramString2, long paramLong);

  public final native void logEvent(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String[] paramArrayOfString1, String[] paramArrayOfString2);

  public final native void logView(String paramString, long paramLong);

  public final native void login(String paramString1, String paramString2);

  public final native void loginWithFacebookToken(String paramString1, String paramString2);

  public final native void loginWithStoredCredentials();

  public final native void logout(boolean paramBoolean);

  public final native void reportAdUrlClicked();

  public final native void sendToInbox(String paramString1, String paramString2, String paramString3);

  public final native void setLanguage(String paramString);
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.orbit.OrbitSession
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
