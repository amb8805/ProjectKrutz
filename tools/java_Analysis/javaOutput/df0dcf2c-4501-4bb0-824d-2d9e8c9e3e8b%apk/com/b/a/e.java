package com.b.a;

import java.io.Closeable;
import java.io.InputStream;

public final class e
  implements Closeable
{
  private final String b;
  private final long c;
  private final InputStream[] d;
  private final long[] e;

  private e(a parama, String paramString, long paramLong, InputStream[] paramArrayOfInputStream, long[] paramArrayOfLong)
  {
    this.b = paramString;
    this.c = paramLong;
    this.d = paramArrayOfInputStream;
    this.e = paramArrayOfLong;
  }

  public final InputStream a()
  {
    return this.d[0];
  }

  public final void close()
  {
    InputStream[] arrayOfInputStream = this.d;
    int i = arrayOfInputStream.length;
    for (int j = 0; j < i; j++)
      g.a(arrayOfInputStream[j]);
  }
}

/* Location:
 * Qualified Name:     com.b.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
