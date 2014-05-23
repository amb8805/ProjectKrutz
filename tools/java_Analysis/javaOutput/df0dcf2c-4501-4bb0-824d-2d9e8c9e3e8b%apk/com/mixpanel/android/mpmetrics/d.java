package com.mixpanel.android.mpmetrics;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

final class d
{
  private final Object b = new Object();
  private Handler c;
  private long d = 0L;
  private long e = 0L;
  private long f = -1L;
  private y g;

  public d(a parama)
  {
    HandlerThread localHandlerThread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 1);
    localHandlerThread.start();
    this.c = new e(this, localHandlerThread.getLooper());
  }

  public final void a(Message paramMessage)
  {
    synchronized (this.b)
    {
      if (this.c == null)
      {
        a.a(this.a, "Dead mixpanel worker dropping a message: " + paramMessage);
        return;
      }
      this.c.sendMessage(paramMessage);
    }
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
