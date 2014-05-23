package com.applovin.impl.sdk;

import android.content.Context;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinLogger;

class ao
  implements Runnable
{
  protected final AppLovinSdkImpl a;
  protected final AppLovinLogger b;
  protected final Context c;

  ao(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    this.a = paramAppLovinSdkImpl;
    this.c = paramAppLovinSdkImpl.getApplicationContext();
    this.b = paramAppLovinSdkImpl.getLogger();
  }

  private boolean c()
  {
    return ((Boolean)this.a.a(z.A)).booleanValue();
  }

  private void d()
  {
    String str1 = (String)this.a.a(z.N);
    if (str1.length() > 0)
      for (String str2 : str1.split(","))
        this.a.getAdService().preloadAd(AppLovinAdSize.fromString(str2));
  }

  protected boolean a()
  {
    if (!n.a("android.permission.INTERNET", this.c))
    {
      this.b.userError("TaskInitializeSdk", "Unable to enable AppLovin SDK: no android.permission.INTERNET");
      return false;
    }
    return true;
  }

  protected void b()
  {
    if (bg.a(z.o, this.a))
    {
      af localaf = new af(this.a);
      this.a.a().a(localaf, aq.b, 1500L);
    }
  }

  public void run()
  {
    long l = System.currentTimeMillis();
    this.b.d("TaskInitializeSdk", "Initializing AppLovin SDK 5.2.2-5.2.2...");
    try
    {
      if (a())
      {
        this.a.getEventManager().b();
        ae localae = this.a.b();
        localae.c();
        localae.c("ad_dsp_session");
        if (c())
          new bh(this.a).start();
        b();
        d();
        this.a.getEventService().trackSessionStart();
        if (((String)this.a.a(z.W)).equals("unknown"))
          this.a.getSettingsManager().a(z.W, "true");
        this.a.a(true);
      }
      while (true)
      {
        AppLovinLogger localAppLovinLogger3 = this.b;
        StringBuilder localStringBuilder3 = new StringBuilder().append("AppLovin SDK 5.2.2-5.2.2 initialization ");
        if (!this.a.isEnabled())
          break;
        str3 = "succeeded";
        localAppLovinLogger3.d("TaskInitializeSdk", str3 + " in " + (System.currentTimeMillis() - l) + "ms");
        return;
        this.a.a(false);
      }
    }
    catch (Throwable localThrowable)
    {
      String str3;
      this.b.e("TaskInitializeSdk", "Unable to intialize SDK, disabling the SDK", localThrowable);
      this.a.a(false);
      AppLovinLogger localAppLovinLogger2 = this.b;
      StringBuilder localStringBuilder2 = new StringBuilder().append("AppLovin SDK 5.2.2-5.2.2 initialization ");
      if (this.a.isEnabled());
      for (String str2 = "succeeded"; ; str2 = "failed")
      {
        localAppLovinLogger2.d("TaskInitializeSdk", str2 + " in " + (System.currentTimeMillis() - l) + "ms");
        return;
        str3 = "failed";
        break;
      }
    }
    finally
    {
      localAppLovinLogger1 = this.b;
      localStringBuilder1 = new StringBuilder().append("AppLovin SDK 5.2.2-5.2.2 initialization ");
      if (!this.a.isEnabled());
    }
    AppLovinLogger localAppLovinLogger1;
    StringBuilder localStringBuilder1;
    for (String str1 = "succeeded"; ; str1 = "failed")
    {
      localAppLovinLogger1.d("TaskInitializeSdk", str1 + " in " + (System.currentTimeMillis() - l) + "ms");
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.ao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
