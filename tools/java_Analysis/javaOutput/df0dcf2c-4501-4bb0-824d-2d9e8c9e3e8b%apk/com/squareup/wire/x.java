package com.squareup.wire;

import java.io.IOException;

public final class x
{
  private final byte[] a;
  private final int b;
  private int c;

  private x(byte[] paramArrayOfByte, int paramInt)
  {
    this.a = paramArrayOfByte;
    this.c = 0;
    this.b = (paramInt + 0);
  }

  static int a(int paramInt)
  {
    return b(a(paramInt, WireType.a));
  }

  public static int a(int paramInt, WireType paramWireType)
  {
    return paramInt << 3 | paramWireType.a();
  }

  static int a(long paramLong)
  {
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      return 1;
    if ((0xFFFFFFFFFFFFC000 & paramLong) == 0L)
      return 2;
    if ((0xFFFFFFFFFFE00000 & paramLong) == 0L)
      return 3;
    if ((0xFFFFFFFFF0000000 & paramLong) == 0L)
      return 4;
    if ((0xFFFFFFF800000000 & paramLong) == 0L)
      return 5;
    if ((0xFFFFFC0000000000 & paramLong) == 0L)
      return 6;
    if ((0xFFFE000000000000 & paramLong) == 0L)
      return 7;
    if ((0xFF00000000000000 & paramLong) == 0L)
      return 8;
    if ((0x8000000000000000 & paramLong) == 0L)
      return 9;
    return 10;
  }

  static x a(byte[] paramArrayOfByte, int paramInt)
  {
    return new x(paramArrayOfByte, paramInt);
  }

  static int b(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0)
      return 1;
    if ((paramInt & 0xFFFFC000) == 0)
      return 2;
    if ((0xFFE00000 & paramInt) == 0)
      return 3;
    if ((0xF0000000 & paramInt) == 0)
      return 4;
    return 5;
  }

  static long d(long paramLong)
  {
    return paramLong << 1 ^ paramLong >> 63;
  }

  static int f(int paramInt)
  {
    return paramInt << 1 ^ paramInt >> 31;
  }

  final void a(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    if (this.b - this.c >= i)
    {
      System.arraycopy(paramArrayOfByte, 0, this.a, this.c, i);
      this.c = (i + this.c);
      return;
    }
    throw new IOException("Out of space: position=" + this.c + ", limit=" + this.b);
  }

  final void b(int paramInt, WireType paramWireType)
  {
    d(a(paramInt, paramWireType));
  }

  final void b(long paramLong)
  {
    while (true)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      {
        c((int)paramLong);
        return;
      }
      c(0x80 | 0x7F & (int)paramLong);
      paramLong >>>= 7;
    }
  }

  final void c(int paramInt)
  {
    int i = (byte)paramInt;
    if (this.c == this.b)
      throw new IOException("Out of space: position=" + this.c + ", limit=" + this.b);
    byte[] arrayOfByte = this.a;
    int j = this.c;
    this.c = (j + 1);
    arrayOfByte[j] = i;
  }

  final void c(long paramLong)
  {
    c(0xFF & (int)paramLong);
    c(0xFF & (int)(paramLong >> 8));
    c(0xFF & (int)(paramLong >> 16));
    c(0xFF & (int)(paramLong >> 24));
    c(0xFF & (int)(paramLong >> 32));
    c(0xFF & (int)(paramLong >> 40));
    c(0xFF & (int)(paramLong >> 48));
    c(0xFF & (int)(paramLong >> 56));
  }

  final void d(int paramInt)
  {
    while (true)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        c(paramInt);
        return;
      }
      c(0x80 | paramInt & 0x7F);
      paramInt >>>= 7;
    }
  }

  final void e(int paramInt)
  {
    c(paramInt & 0xFF);
    c(0xFF & paramInt >> 8);
    c(0xFF & paramInt >> 16);
    c(0xFF & paramInt >> 24);
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
