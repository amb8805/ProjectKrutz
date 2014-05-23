package com.spotify.mobile.android.service;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;

public abstract interface l extends IInterface
{
  public abstract int a(String paramString);

  public abstract String a(String paramString, String[] paramArrayOfString, int paramInt1, int paramInt2);

  public abstract String a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2);

  public abstract void a(ServiceShutdownReceiver paramServiceShutdownReceiver);

  public abstract void a(String paramString1, String paramString2);

  public abstract void a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String[] paramArrayOfString4);

  public abstract void b(String paramString);

  public abstract void b(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2);

  public abstract ParcelFileDescriptor c(String paramString);
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
