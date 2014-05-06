package com.twitter.android.platform;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import java.util.List;

public final class f
{
  public f()
  {
  }

  public static boolean a(LocationManager paramLocationManager)
  {
    return (a(paramLocationManager, "network")) || (a(paramLocationManager, "gps"));
  }

  public static boolean a(LocationManager paramLocationManager, LocationListener paramLocationListener)
  {
    boolean bool1 = a(paramLocationManager, "gps");
    boolean bool2 = false;
    if (bool1)
    {
      paramLocationManager.requestLocationUpdates("gps", 0L, 0.0F, paramLocationListener);
      bool2 = true;
    }
    if (a(paramLocationManager, "network"))
    {
      paramLocationManager.requestLocationUpdates("network", 0L, 0.0F, paramLocationListener);
      bool2 = true;
    }
    return bool2;
  }

  private static boolean a(LocationManager paramLocationManager, String paramString)
  {
    return (paramLocationManager.getProvider(paramString) != null) && (paramLocationManager.isProviderEnabled(paramString));
  }

  public static Location b(LocationManager paramLocationManager)
  {
    List localList = paramLocationManager.getProviders(true);
    if (localList != null)
      for (int i = localList.size() - 1; i >= 0; i--)
      {
        Location localLocation = paramLocationManager.getLastKnownLocation((String)localList.get(i));
        if (localLocation != null)
          return localLocation;
      }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
