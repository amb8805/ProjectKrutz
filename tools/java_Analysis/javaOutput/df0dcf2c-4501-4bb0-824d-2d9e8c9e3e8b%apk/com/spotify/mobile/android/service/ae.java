package com.spotify.mobile.android.service;

import android.os.Handler;
import com.spotify.mobile.android.c.a;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.Assertion.SoftAssertionError;

public class ae
  implements a, Runnable
{
  private int a = 0;
  private Handler b;
  private aq c;

  public ae()
  {
  }

  private static void a(String paramString)
  {
    try
    {
      if (Math.random() >= 0.99D)
        Assertion.b(paramString + ", throttled 99%");
      return;
    }
    catch (Assertion.SoftAssertionError localSoftAssertionError)
    {
    }
  }

  public final void a()
  {
    if (this.a > 0)
      a("Orbit got stuck while shutting down, but finished after " + 5 * this.a + " seconds");
    this.b.removeCallbacks(this);
  }

  public final void a(Handler paramHandler, aq paramaq)
  {
    this.b = paramHandler;
    this.c = paramaq;
    paramHandler.postDelayed(this, 5000L);
  }

  public void run()
  {
    this.a = (1 + this.a);
    if (this.a < 6)
    {
      this.b.postDelayed(this, 5000L);
      return;
    }
    a("Orbit got stuck while shutting down");
    aq.a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
