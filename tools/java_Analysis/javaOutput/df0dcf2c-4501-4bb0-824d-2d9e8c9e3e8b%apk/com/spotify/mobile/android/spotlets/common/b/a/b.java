package com.spotify.mobile.android.spotlets.common.b.a;

import android.text.TextUtils;

final class b
  implements d
{
  private final String a;
  private final boolean b;
  private final String c;
  private final String d;

  b(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    this.b = paramBoolean;
    this.a = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }

  public final String a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.c;
  }

  public final String c()
  {
    return this.d;
  }

  public final boolean d()
  {
    return (this.b) && (!TextUtils.isEmpty(this.a)) && (!TextUtils.isEmpty(this.d)) && (!TextUtils.isEmpty(this.c));
  }

  public final String toString()
  {
    return "user=\"" + this.a + "\"; productType=\"" + this.c + "\";countryCode=\"" + this.d + "\"; loggedIn=" + this.b;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.b.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
