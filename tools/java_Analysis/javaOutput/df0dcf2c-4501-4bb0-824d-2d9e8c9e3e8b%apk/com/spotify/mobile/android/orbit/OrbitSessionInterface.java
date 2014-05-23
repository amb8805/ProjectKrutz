package com.spotify.mobile.android.orbit;

public abstract interface OrbitSessionInterface
{
  public abstract void eraseOfflineUser();

  public abstract void logDeviceIdentifier(String paramString1, String paramString2);

  public abstract void logDevicePowerStatus(String paramString1, String paramString2, long paramLong);

  public abstract void logEvent(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String[] paramArrayOfString1, String[] paramArrayOfString2);

  public abstract void logView(String paramString, long paramLong);

  public abstract void login(String paramString1, String paramString2);

  public abstract void loginWithFacebookToken(String paramString1, String paramString2);

  public abstract void loginWithStoredCredentials();

  public abstract void logout(boolean paramBoolean);

  public abstract void reportAdUrlClicked();

  public abstract void sendToInbox(String paramString1, String paramString2, String paramString3);

  public abstract void setLanguage(String paramString);
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.orbit.OrbitSessionInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
