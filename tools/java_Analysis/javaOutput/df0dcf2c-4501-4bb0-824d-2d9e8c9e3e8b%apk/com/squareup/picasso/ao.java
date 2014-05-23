package com.squareup.picasso;

import android.os.Process;

final class ao extends Thread
{
  public ao(Runnable paramRunnable)
  {
    super(paramRunnable);
  }

  public final void run()
  {
    Process.setThreadPriority(10);
    super.run();
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.ao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
