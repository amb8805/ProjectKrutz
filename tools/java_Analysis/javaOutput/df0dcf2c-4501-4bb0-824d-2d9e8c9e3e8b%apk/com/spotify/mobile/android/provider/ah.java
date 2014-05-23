package com.spotify.mobile.android.provider;

import android.database.ContentObserver;

final class ah extends ContentObserver
{
  public ah(ae paramae)
  {
    super(null);
  }

  public final void onChange(boolean paramBoolean)
  {
    synchronized (ae.c(this.a))
    {
      ae.d(this.a);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.ah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
