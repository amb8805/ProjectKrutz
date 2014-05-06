package com.twitter.android;

import android.database.ContentObserver;
import android.os.Handler;
import com.twitter.android.widget.r;

public final class fs extends ContentObserver
{
  public fs(BaseListFragment paramBaseListFragment, Handler paramHandler)
  {
    super(paramHandler);
  }

  public final boolean deliverSelfNotifications()
  {
    return true;
  }

  public final void onChange(boolean paramBoolean)
  {
    if (!this.a.i)
    {
      r localr = this.a.g();
      this.a.c();
      this.a.a(localr, true);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.fs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
