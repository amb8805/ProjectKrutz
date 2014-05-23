package com.applovin.impl.sdk;

import java.util.concurrent.ThreadFactory;

class as
  implements ThreadFactory
{
  private final String b;

  public as(ap paramap, String paramString)
  {
    this.b = paramString;
  }

  public Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = new Thread(paramRunnable, "AppLovinSdk:" + this.b + ":" + bg.a(this.a.a.getSdkKey()));
    localThread.setDaemon(true);
    localThread.setPriority(10);
    localThread.setUncaughtExceptionHandler(new at(this));
    return localThread;
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.as
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
