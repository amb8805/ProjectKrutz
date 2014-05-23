package com.squareup.wire;

import java.nio.charset.Charset;

final class n
{
  private static final Charset a = Charset.forName("UTF-8");

  public static String a(byte[] paramArrayOfByte)
  {
    int i = 4 * (paramArrayOfByte.length / 3);
    if (paramArrayOfByte.length % 3 > 0)
      i += 4;
    o localo = new o(new byte[i]);
    localo.a(paramArrayOfByte, paramArrayOfByte.length);
    return new String(o.a(localo), a);
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
