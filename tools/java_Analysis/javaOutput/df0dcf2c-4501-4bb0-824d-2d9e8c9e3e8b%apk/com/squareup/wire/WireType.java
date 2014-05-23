package com.squareup.wire;

public enum WireType
{
  private final int value;

  static
  {
    WireType[] arrayOfWireType = new WireType[6];
    arrayOfWireType[0] = a;
    arrayOfWireType[1] = b;
    arrayOfWireType[2] = c;
    arrayOfWireType[3] = d;
    arrayOfWireType[4] = e;
    arrayOfWireType[5] = f;
  }

  private WireType(int paramInt)
  {
    this.value = paramInt;
  }

  public static WireType a(int paramInt)
  {
    switch (paramInt & 0x7)
    {
    default:
      throw new IllegalArgumentException("No WireType for value " + paramInt);
    case 0:
      return a;
    case 1:
      return b;
    case 2:
      return c;
    case 3:
      return d;
    case 4:
      return e;
    case 5:
    }
    return f;
  }

  public final int a()
  {
    return this.value;
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.WireType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
