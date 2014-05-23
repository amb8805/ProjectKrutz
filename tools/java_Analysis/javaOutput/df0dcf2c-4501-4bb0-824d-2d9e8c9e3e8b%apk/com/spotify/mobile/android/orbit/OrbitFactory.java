package com.spotify.mobile.android.orbit;

import android.app.Service;
import com.spotify.mobile.android.c.a;
import com.spotify.mobile.android.core.internal.ConnectivityListener;

public abstract interface OrbitFactory extends a
{
  public abstract OrbitServiceInterface createService(Service paramService, int paramInt, String paramString);

  public abstract ConnectivityListener getConnectivityListener();
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.orbit.OrbitFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
