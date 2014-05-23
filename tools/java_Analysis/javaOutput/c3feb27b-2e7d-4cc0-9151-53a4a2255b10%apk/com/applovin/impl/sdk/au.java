package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinLogger;

class au
  implements Runnable
{
  private final String b;
  private final ar c;
  private final aq d;

  au(ap paramap, ar paramar, aq paramaq)
  {
    this.b = paramar.e();
    this.c = paramar;
    this.d = paramaq;
  }

  public void run()
  {
    long l1 = System.currentTimeMillis();
    try
    {
      j.a();
      if (this.a.a.c())
        break label274;
      if (this.a.a.isEnabled())
      {
        this.a.b.i(this.b, "Task  started exection...");
        this.c.run();
        long l2 = System.currentTimeMillis() - l1;
        this.a.b.i(this.b, "Task executed successfully in " + l2 + "ms.");
        ae localae = this.a.a.b();
        localae.a(this.b + "_count");
        localae.a(this.b + "_time", l2);
        return;
      }
      if (this.a.a.d())
      {
        this.a.a.e();
        this.c.a();
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      this.a.b.e(this.b, "Task failed execution in " + (System.currentTimeMillis() - l1) + "ms.", localThrowable);
      return;
    }
    while (true)
      this.a.b.w(this.b, "Task not executed, SDK is disabled");
    label274: this.a.b.i(this.b, "Task re-scheduled...");
    this.a.a(this.c, this.d, 2000L);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.au
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
