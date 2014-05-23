package com.spotify.mobile.android.util;

import android.content.Context;

public final class dw extends dt
{
  private String c;

  protected dw(Context paramContext, ViewUri.Verified paramVerified)
  {
    this(paramContext, paramVerified, "");
  }

  protected dw(Context paramContext, ViewUri.Verified paramVerified, String paramString)
  {
    super(paramContext, paramVerified);
    this.c = paramString;
  }

  protected final void a(long paramLong)
  {
    bj.a(this, paramLong);
  }

  public final String d()
  {
    return this.c;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
