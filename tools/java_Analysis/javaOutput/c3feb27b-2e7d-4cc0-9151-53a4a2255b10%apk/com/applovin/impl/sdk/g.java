package com.applovin.impl.sdk;

import android.util.Log;
import com.applovin.sdk.AppLovinLogger;

class g
  implements AppLovinLogger
{
  private s a;
  private ac b;
  private h c;

  g()
  {
  }

  void a(ac paramac)
  {
    this.b = paramac;
  }

  void a(h paramh)
  {
    this.c = paramh;
  }

  void a(s params)
  {
    this.a = params;
  }

  protected boolean a()
  {
    if (this.b != null)
      return ((Boolean)this.b.a(z.l)).booleanValue();
    return false;
  }

  public void d(String paramString1, String paramString2)
  {
    if (a())
      Log.d("AppLovinSdk", "[" + paramString1 + "] " + paramString2);
    if (this.c != null)
      this.c.a("DEBUG  [" + paramString1 + "] " + paramString2);
  }

  public void e(String paramString1, String paramString2)
  {
    e(paramString1, paramString2, null);
  }

  public void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a())
      Log.e("AppLovinSdk", "[" + paramString1 + "] " + paramString2, paramThrowable);
    if (this.a != null)
      this.a.a(AppLovinEvent.a(paramString1, paramString2, paramThrowable), false);
    h localh;
    StringBuilder localStringBuilder;
    if (this.c != null)
    {
      localh = this.c;
      localStringBuilder = new StringBuilder().append("ERROR  [").append(paramString1).append("] ").append(paramString2);
      if (paramThrowable == null)
        break label149;
    }
    label149: for (String str = ": " + paramThrowable.getMessage(); ; str = "")
    {
      localh.a(str);
      return;
    }
  }

  public void i(String paramString1, String paramString2)
  {
    if (a())
      Log.i("AppLovinSdk", "[" + paramString1 + "] " + paramString2);
    if (this.c != null)
      this.c.a("INFO  [" + paramString1 + "] " + paramString2);
  }

  public void userError(String paramString1, String paramString2)
  {
    userError(paramString1, paramString2, null);
  }

  public void userError(String paramString1, String paramString2, Throwable paramThrowable)
  {
    Log.e("AppLovinSdk", "[" + paramString1 + "] " + paramString2, paramThrowable);
    if (this.a != null)
      this.a.a(AppLovinEvent.b(paramString1, paramString2, paramThrowable), false);
    h localh;
    StringBuilder localStringBuilder;
    if (this.c != null)
    {
      localh = this.c;
      localStringBuilder = new StringBuilder().append("USER  [").append(paramString1).append("] ").append(paramString2);
      if (paramThrowable == null)
        break label142;
    }
    label142: for (String str = ": " + paramThrowable.getMessage(); ; str = "")
    {
      localh.a(str);
      return;
    }
  }

  public void w(String paramString1, String paramString2)
  {
    w(paramString1, paramString2, null);
  }

  public void w(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a())
      Log.w("AppLovinSdk", "[" + paramString1 + "] " + paramString2, paramThrowable);
    if (this.c != null)
      this.c.a("WARN  [" + paramString1 + "] " + paramString2);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
