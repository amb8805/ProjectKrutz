package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinLogger;

class at
  implements Thread.UncaughtExceptionHandler
{
  at(as paramas)
  {
  }

  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    this.a.a.b.e("TaskManager", "Caught unhandeled exception", paramThrowable);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.at
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
