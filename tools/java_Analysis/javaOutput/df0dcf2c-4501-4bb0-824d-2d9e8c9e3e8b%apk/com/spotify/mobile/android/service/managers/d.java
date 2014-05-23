package com.spotify.mobile.android.service.managers;

import com.spotify.mobile.android.orbit.OrbitSessionInterface;
import com.spotify.mobile.android.service.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class d extends s
{
  private OrbitSessionInterface a;

  public d(OrbitSessionInterface paramOrbitSessionInterface)
  {
    this.a = paramOrbitSessionInterface;
  }

  public final void a()
  {
    this.a.loginWithStoredCredentials();
  }

  public final void a(String paramString)
  {
    this.a.setLanguage(paramString);
  }

  public final void a(String paramString, long paramLong)
  {
    this.a.logView(paramString, paramLong);
  }

  public final void a(String paramString1, String paramString2)
  {
    this.a.login(paramString1, paramString2);
  }

  public final void a(String paramString1, String paramString2, long paramLong)
  {
    this.a.logDevicePowerStatus(paramString1, paramString2, paramLong);
  }

  public final void a(String paramString1, String paramString2, String paramString3)
  {
    this.a.sendToInbox(paramString1, paramString2, paramString3);
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, HashMap<String, String> paramHashMap)
  {
    int i = paramHashMap.size();
    String[] arrayOfString1 = new String[i];
    String[] arrayOfString2 = new String[i];
    Iterator localIterator = paramHashMap.entrySet().iterator();
    for (int j = 0; localIterator.hasNext(); j++)
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      arrayOfString1[j] = ((String)localEntry.getKey());
      arrayOfString2[j] = ((String)localEntry.getValue());
    }
    this.a.logEvent(paramString1, paramString2, paramString3, paramString4, paramString5, arrayOfString1, arrayOfString2);
  }

  public final void b()
  {
    this.a.logout(true);
  }

  public final void b(String paramString1, String paramString2)
  {
    this.a.loginWithFacebookToken(paramString1, paramString2);
  }

  public final void c()
  {
    this.a.eraseOfflineUser();
  }

  public final void c(String paramString1, String paramString2)
  {
    this.a.logDeviceIdentifier(paramString1, paramString2);
  }

  public final void d()
  {
    this.a.reportAdUrlClicked();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.managers.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
