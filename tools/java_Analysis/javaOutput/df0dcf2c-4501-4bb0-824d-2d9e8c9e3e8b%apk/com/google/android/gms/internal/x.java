package com.google.android.gms.internal;

import android.util.Base64;

public final class x
{
  public static String a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    return Base64.encodeToString(paramArrayOfByte, 0);
  }

  public static String b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    return Base64.encodeToString(paramArrayOfByte, 10);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
