package com.squareup.picasso;

import android.os.Handler;
import android.os.Process;
import java.lang.ref.ReferenceQueue;

final class x extends Thread
{
  private final ReferenceQueue<?> a;
  private final Handler b;

  x(ReferenceQueue<?> paramReferenceQueue, Handler paramHandler)
  {
    this.a = paramReferenceQueue;
    this.b = paramHandler;
    setDaemon(true);
    setName("Picasso-refQueue");
  }

  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      while (true)
      {
        b localb = (b)this.a.remove();
        this.b.sendMessage(this.b.obtainMessage(3, localb.a));
      }
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    catch (Exception localException)
    {
      this.b.post(new x.1(this, localException));
    }
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
