package com.spotify.mobile.android.orbit;

import java.io.FileDescriptor;

public abstract interface OrbitProviderInterface
{
  public abstract String acquirePath(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2);

  public abstract void insert(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2);

  public abstract int numberOfRows(String paramString);

  public abstract String query(String paramString, String[] paramArrayOfString, int paramInt1, int paramInt2);

  public abstract void releasePath(String paramString1, String paramString2);

  public abstract void remove(String paramString);

  public abstract void setObserver(OrbitProviderObserver paramOrbitProviderObserver);

  public abstract void update(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String[] paramArrayOfString4);

  public abstract boolean writeImageToPipe(String paramString, FileDescriptor paramFileDescriptor);
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.orbit.OrbitProviderInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
