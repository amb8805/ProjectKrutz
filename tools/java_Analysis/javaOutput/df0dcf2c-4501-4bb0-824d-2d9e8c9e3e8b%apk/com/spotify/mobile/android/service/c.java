package com.spotify.mobile.android.service;

import com.spotify.mobile.android.util.cc;

public final class c
{
  private String a;
  private long b;

  public c(String paramString, long paramLong)
  {
    this.a = paramString;
    this.b = paramLong;
  }

  public static c a(ConnectDevice paramConnectDevice)
  {
    cc.a(paramConnectDevice);
    cc.a(paramConnectDevice.a());
    return new c(paramConnectDevice.a(), paramConnectDevice.k());
  }

  public final String a()
  {
    return this.a;
  }

  public final boolean a(c paramc)
  {
    return paramc.a.equals(this.a);
  }

  public final long b()
  {
    return this.b;
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof c)) && (((c)paramObject).a.equals(this.a)) && (((c)paramObject).b == this.b);
  }

  public final int hashCode()
  {
    return this.a.hashCode() ^ (int)this.b;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
