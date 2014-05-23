package com.squareup.wire;

import java.util.Arrays;

public final class b
{
  public static final b a = a(new byte[0]);
  private final byte[] b;
  private transient int c;

  private b(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
  }

  public static b a(byte[] paramArrayOfByte)
  {
    return new b((byte[])paramArrayOfByte.clone());
  }

  public static b a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    return new b(arrayOfByte);
  }

  public final int a()
  {
    return this.b.length;
  }

  public final byte[] b()
  {
    return (byte[])this.b.clone();
  }

  public final boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof b)) && (Arrays.equals(((b)paramObject).b, this.b)));
  }

  public final int hashCode()
  {
    int i = this.c;
    if (i != 0)
      return i;
    int j = Arrays.hashCode(this.b);
    this.c = j;
    return j;
  }

  public final String toString()
  {
    return n.a(this.b);
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
