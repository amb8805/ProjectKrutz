package com.applovin.impl.sdk;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinLogger;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinTargetingData;

public class AppLovinSdkImpl extends AppLovinSdk
{
  public static final String FULL_VERSION = "5.2.2-5.2.2";
  public static final String IMPL_VERSION = "5.2.2";
  private String a;
  private AppLovinSdkSettings b;
  private Context c;
  private AppLovinLogger d;
  private s e;
  private ap f;
  private ac g;
  private k h;
  private ae i;
  private bh j;
  private i k;
  private b l;
  private AppLovinEventServiceImpl m;
  private boolean n = true;
  private boolean o = false;
  private boolean p = false;
  private boolean q = false;
  private boolean r = false;

  public AppLovinSdkImpl()
  {
  }

  private static boolean g()
  {
    return (!Build.VERSION.RELEASE.startsWith("1.")) && (!Build.VERSION.RELEASE.startsWith("2.0")) && (!Build.VERSION.RELEASE.startsWith("2.1"));
  }

  ap a()
  {
    return this.f;
  }

  Object a(ab paramab)
  {
    return this.g.a(paramab);
  }

  void a(boolean paramBoolean)
  {
    this.n = false;
    this.o = paramBoolean;
    this.p = true;
  }

  ae b()
  {
    return this.i;
  }

  boolean c()
  {
    return this.n;
  }

  boolean d()
  {
    return this.p;
  }

  void e()
  {
    this.n = true;
    this.f.a(new ao(this), 0L);
  }

  void f()
  {
    this.g.d();
    this.g.b();
    this.i.a();
  }

  public AppLovinAdService getAdService()
  {
    return this.l;
  }

  public Context getApplicationContext()
  {
    return this.c;
  }

  public k getConnectionManager()
  {
    return this.h;
  }

  public s getEventManager()
  {
    return this.e;
  }

  public AppLovinEventService getEventService()
  {
    return this.m;
  }

  public AppLovinLogger getLogger()
  {
    return this.d;
  }

  public String getSdkKey()
  {
    return this.a;
  }

  public AppLovinSdkSettings getSettings()
  {
    return this.b;
  }

  public ac getSettingsManager()
  {
    return this.g;
  }

  public AppLovinTargetingData getTargetingData()
  {
    return this.k;
  }

  public boolean hasCriticalErrors()
  {
    return (this.q) || (this.r);
  }

  protected void initialize(String paramString, AppLovinSdkSettings paramAppLovinSdkSettings, Context paramContext)
  {
    this.a = paramString;
    this.b = paramAppLovinSdkSettings;
    this.c = paramContext;
    try
    {
      g localg = new g();
      this.d = localg;
      this.g = new ac(this);
      this.e = new s(this);
      this.f = new ap(this);
      this.h = new k(this);
      this.i = new ae(this);
      this.j = new bh(this);
      this.l = new b(this);
      this.m = new AppLovinEventServiceImpl(this);
      this.k = new i(this);
      if (!g())
      {
        this.q = true;
        Log.e("AppLovinSdk", "Unable to initalize AppLovin SDK: Android SDK version has to be at least level 8");
      }
      if ((paramString == null) || (paramString.length() < 1))
      {
        this.r = true;
        Log.e("AppLovinSdk", "Unable to find AppLovin SDK key. Please add     meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
      }
      if (!hasCriticalErrors())
      {
        localg.a(this.e);
        localg.a(this.g);
        if ((paramAppLovinSdkSettings instanceof x))
          localg.a(((x)paramAppLovinSdkSettings).a());
        this.g.c();
        if (((Boolean)this.g.a(z.b)).booleanValue())
        {
          this.g.a(paramAppLovinSdkSettings);
          this.g.a(z.b, Boolean.valueOf(false));
          this.g.b();
        }
        e();
        return;
      }
      a(false);
      return;
    }
    catch (Throwable localThrowable)
    {
      Log.e("AppLovinSdk", "Failed to load AppLovin SDK, ad serving will be disabled", localThrowable);
      a(false);
    }
  }

  public void initializeSdk()
  {
  }

  public boolean isEnabled()
  {
    return this.o;
  }

  public void setPluginVersion(String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("No version specified");
    this.g.a(z.J, paramString);
    this.g.b();
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.AppLovinSdkImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
