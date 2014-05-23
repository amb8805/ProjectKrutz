package com.spotify.cosmos.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class MainLooperExecutor
  implements Executor
{
  private static MainLooperExecutor sInstance = new MainLooperExecutor();
  private Handler mHandler = new Handler(Looper.getMainLooper());

  private MainLooperExecutor()
  {
  }

  public static MainLooperExecutor getInstance()
  {
    return sInstance;
  }

  public final void execute(Runnable paramRunnable)
  {
    this.mHandler.post(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.MainLooperExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
