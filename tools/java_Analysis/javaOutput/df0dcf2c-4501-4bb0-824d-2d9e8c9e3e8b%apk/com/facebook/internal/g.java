package com.facebook.internal;

import java.io.File;

final class g
  implements Comparable<g>
{
  private final File a;
  private final long b;

  g(File paramFile)
  {
    this.a = paramFile;
    this.b = paramFile.lastModified();
  }

  private int a(g paramg)
  {
    if (this.b < paramg.b)
      return -1;
    if (this.b > paramg.b)
      return 1;
    return this.a.compareTo(paramg.a);
  }

  final File a()
  {
    return this.a;
  }

  final long b()
  {
    return this.b;
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof g)) && (a((g)paramObject) == 0);
  }

  public final int hashCode()
  {
    return 37 * (1073 + this.a.hashCode()) + (int)(this.b % 2147483647L);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
