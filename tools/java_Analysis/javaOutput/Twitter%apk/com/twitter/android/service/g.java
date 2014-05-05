package com.twitter.android.service;

import java.io.Serializable;

public final class g
  implements Serializable
{
  public final j a;
  public final long b;
  public final j c;
  public long d;
  public int e;
  public String f;
  public long g;
  public String h;

  public g(long paramLong, j paramj1, j paramj2)
  {
    this.g = paramLong;
    this.a = paramj1;
    this.b = System.currentTimeMillis();
    this.c = paramj2;
  }

  public final String toString()
  {
    return "ownerId=" + this.g + ",event=" + this.a + ",refEvent=" + this.c + ",ts=" + this.b;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.service.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
