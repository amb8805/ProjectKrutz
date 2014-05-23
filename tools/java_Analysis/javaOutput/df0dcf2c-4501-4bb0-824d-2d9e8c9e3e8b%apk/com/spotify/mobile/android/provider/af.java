package com.spotify.mobile.android.provider;

import com.spotify.mobile.android.util.soft.SoftObject;

final class af
{
  private SoftObject a;
  private int b = 0;
  private int c = 0;

  public af(int paramInt, String paramString)
  {
    this.b = paramInt;
    if ((paramString != null) && (paramString.length() > 0))
    {
      this.c = paramString.length();
      this.a = new SoftObject(paramString);
    }
  }

  public final int a()
  {
    return this.c;
  }

  public final SoftObject a(int paramInt)
  {
    if (this.a == null)
      return null;
    return this.a.e(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
