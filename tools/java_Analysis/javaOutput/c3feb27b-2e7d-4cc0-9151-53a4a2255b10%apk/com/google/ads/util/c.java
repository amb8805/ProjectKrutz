package com.google.ads.util;

public class c
{
  static
  {
    if (!c.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      return;
    }
  }

  private c()
  {
  }

  public static byte[] a(String paramString)
  {
    return a(paramString.getBytes(), 0);
  }

  public static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }

  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    c.b localb = new c.b(paramInt3, new byte[paramInt2 * 3 / 4]);
    if (!localb.a(paramArrayOfByte, paramInt1, paramInt2, true))
      throw new IllegalArgumentException("bad base-64");
    if (localb.b == localb.a.length)
      return localb.a;
    byte[] arrayOfByte = new byte[localb.b];
    System.arraycopy(localb.a, 0, arrayOfByte, 0, localb.b);
    return arrayOfByte;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.util.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
