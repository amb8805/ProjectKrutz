package com.google.common.a;

public final class a
{
  public static int a(long paramLong)
  {
    if (paramLong > 2147483647L)
      return 2147483647;
    if (paramLong < -2147483648L)
      return -2147483648;
    return (int)paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.common.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
