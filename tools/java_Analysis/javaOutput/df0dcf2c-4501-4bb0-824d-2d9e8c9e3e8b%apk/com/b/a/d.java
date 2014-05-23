package com.b.a;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class d
{
  private final String b;
  private final long[] c;
  private boolean d;
  private b e;
  private long f;

  private d(a parama, String paramString)
  {
    this.b = paramString;
    this.c = new long[a.f(parama)];
  }

  private static IOException a(String[] paramArrayOfString)
  {
    throw new IOException("unexpected journal line: " + Arrays.toString(paramArrayOfString));
  }

  public final File a(int paramInt)
  {
    return new File(a.g(this.a), this.b + "." + paramInt);
  }

  public final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (long l : this.c)
      localStringBuilder.append((char)' ').append(l);
    return localStringBuilder.toString();
  }

  public final File b(int paramInt)
  {
    return new File(a.g(this.a), this.b + "." + paramInt + ".tmp");
  }
}

/* Location:
 * Qualified Name:     com.b.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
