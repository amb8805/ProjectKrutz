package com.twitter.android.service;

import android.content.Intent;
import android.os.Process;

final class c
  implements Runnable
{
  private final Intent a;
  private final int b;

  public c(TwitterService paramTwitterService, Intent paramIntent, int paramInt)
  {
    this.a = paramIntent;
    this.b = paramInt;
  }

  public final void run()
  {
    Process.setThreadPriority(10);
    this.c.a(this.a, this.b);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.service.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
