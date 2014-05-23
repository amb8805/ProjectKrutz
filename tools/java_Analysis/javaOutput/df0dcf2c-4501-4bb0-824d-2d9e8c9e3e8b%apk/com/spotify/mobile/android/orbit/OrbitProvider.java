package com.spotify.mobile.android.orbit;

import java.io.FileDescriptor;

public final class OrbitProvider
  implements OrbitProviderInterface
{
  private int nOrbitProviderPtr;

  private OrbitProvider()
  {
  }

  public final native String acquirePath(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2);

  public final native void insert(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2);

  public final native int numberOfRows(String paramString);

  public final native String query(String paramString, String[] paramArrayOfString, int paramInt1, int paramInt2);

  public final native void releasePath(String paramString1, String paramString2);

  public final native void remove(String paramString);

  public final native void setObserver(OrbitProviderObserver paramOrbitProviderObserver);

  public final native void update(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String[] paramArrayOfString4);

  public final native boolean writeImageToPipe(String paramString, FileDescriptor paramFileDescriptor);
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.orbit.OrbitProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
