package com.spotify.mobile.android.spotlets.follow;

import com.spotify.mobile.android.util.cc;
import java.util.Locale;

public final class a
{
  private final String a;
  private int b;
  private int c;
  private boolean d;

  public a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.a = paramString;
    this.c = paramInt1;
    this.b = paramInt2;
    this.d = paramBoolean;
  }

  private void a(boolean paramBoolean)
  {
    try
    {
      boolean bool;
      int i;
      if (paramBoolean != this.d)
      {
        bool = true;
        cc.a(bool, "following is already " + paramBoolean);
        if (!paramBoolean)
          break label69;
        i = 1 + this.c;
      }
      for (this.c = i; ; this.c = i)
      {
        this.c = i;
        this.d = paramBoolean;
        return;
        bool = false;
        break;
        i = -1 + this.c;
      }
    }
    finally
    {
    }
  }

  public final String a()
  {
    return this.a;
  }

  public final void a(int paramInt)
  {
    this.c = paramInt;
  }

  public final int b()
  {
    return this.c;
  }

  public final void b(int paramInt)
  {
    this.b = paramInt;
  }

  public final int c()
  {
    return this.b;
  }

  public final boolean d()
  {
    return this.d;
  }

  public final String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = Integer.valueOf(this.b);
    arrayOfObject[2] = Integer.valueOf(this.c);
    arrayOfObject[3] = Boolean.valueOf(this.d);
    return String.format(localLocale, "uri: %s  followingCount: %s  followersCount: %s  isFollowing: %s", arrayOfObject);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.follow.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
