package com.spotify.mobile.android.service;

import android.os.Bundle;

public final class u
{
  private boolean a;
  private boolean b;

  public u()
  {
  }

  public u(Bundle paramBundle)
  {
    if (paramBundle == null)
      return;
    this.a = paramBundle.getBoolean("with_radio", false);
    this.b = paramBundle.getBoolean("shuffle_restricted", false);
  }

  public final void a(Bundle paramBundle)
  {
    paramBundle.putBoolean("with_radio", this.a);
    paramBundle.putBoolean("shuffle_restricted", this.b);
  }

  public final void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public final boolean a()
  {
    return this.a;
  }

  public final void b(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public final boolean b()
  {
    return this.b;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    u localu;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localu = (u)paramObject;
      if (this.a != localu.a)
        return false;
    }
    while (this.b == localu.b);
    return false;
  }

  public final int hashCode()
  {
    int i = 1;
    int j;
    int k;
    if (this.a)
    {
      j = i;
      k = j * 31;
      if (!this.b)
        break label32;
    }
    while (true)
    {
      return k + i;
      j = 0;
      break;
      label32: i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
