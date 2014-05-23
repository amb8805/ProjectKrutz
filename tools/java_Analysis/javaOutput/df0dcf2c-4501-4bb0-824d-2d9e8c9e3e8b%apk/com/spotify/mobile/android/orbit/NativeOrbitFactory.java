package com.spotify.mobile.android.orbit;

import android.app.Service;
import com.spotify.mobile.android.core.internal.ConnectivityListener;

public class NativeOrbitFactory
  implements OrbitFactory
{
  public NativeOrbitFactory()
  {
  }

  public OrbitService createService(Service paramService, int paramInt, String paramString)
  {
    return OrbitService.create(paramService, paramInt, paramString);
  }

  public ConnectivityListener getConnectivityListener()
  {
    return ConnectivityListener.getInstance();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.orbit.NativeOrbitFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
