package com.applovin.impl.sdk;

import android.content.Context;
import com.applovin.adview.AppLovinInterstitialActivity;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class ai extends ar
{
  private final AppLovinAdSize a;
  private final AppLovinAdType b;
  private final AppLovinAdLoadListener c;
  private boolean h;

  ai(AppLovinAdSize paramAppLovinAdSize, AppLovinAdLoadListener paramAppLovinAdLoadListener, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    this(paramAppLovinAdSize, AppLovinAdType.REGULAR, paramAppLovinAdLoadListener, paramAppLovinSdkImpl);
  }

  ai(AppLovinAdSize paramAppLovinAdSize, AppLovinAdType paramAppLovinAdType, AppLovinAdLoadListener paramAppLovinAdLoadListener, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    super("FetchNextAd", paramAppLovinSdkImpl);
    this.a = paramAppLovinAdSize;
    this.b = paramAppLovinAdType;
    this.c = paramAppLovinAdLoadListener;
  }

  private List a(List paramList)
  {
    if ((paramList == null) || (paramList.isEmpty()))
      return null;
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localArrayList.add(((q)localIterator.next()).c);
    return localArrayList;
  }

  private void a(ae paramae)
  {
    long l = paramae.b("ad_session_start");
    if (System.currentTimeMillis() - l > 60000 * ((Integer)this.e.a(z.B)).intValue())
    {
      paramae.b("ad_session_start", System.currentTimeMillis());
      paramae.c("ad_dsp_session");
    }
  }

  private void b(Map paramMap)
  {
    paramMap.put("api_did", this.e.a(z.c));
    paramMap.put("sdk_key", this.e.getSdkKey());
    paramMap.put("sdk_version", "5.2.2-5.2.2");
    String str = (String)this.e.a(z.J);
    if ((str != null) && (str.length() > 0))
      paramMap.put("plugin_version", str);
    paramMap.put("accept", g());
    paramMap.put("preloading", String.valueOf(this.h));
    paramMap.put("size", this.a.getLabel());
    paramMap.put("format", "json");
  }

  private void c(Map paramMap)
  {
    if (((Boolean)this.e.a(z.U)).booleanValue())
    {
      ae localae = this.e.b();
      paramMap.put("total_imps", String.valueOf(localae.b("ad_dsp")));
      paramMap.put("session_imps", String.valueOf(localae.b("ad_dsp_session")));
    }
  }

  private void d(Map paramMap)
  {
    if (((Boolean)this.e.a(z.U)).booleanValue())
    {
      Map localMap = ((i)this.e.getTargetingData()).a();
      if ((localMap != null) && (!localMap.isEmpty()))
        paramMap.putAll(localMap);
    }
  }

  private void e(Map paramMap)
  {
    String str1 = (String)this.e.a(z.C);
    if (str1.length() > 2)
      try
      {
        JSONObject localJSONObject = new JSONObject(str1);
        Iterator localIterator = localJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          String str3 = localJSONObject.getString(str2);
          paramMap.put(str2, str3);
          this.f.d(this.d, "Ad request parameter \"" + str2 + "\" overriden with \"" + str3 + "\"");
        }
      }
      catch (JSONException localJSONException)
      {
        this.f.e(this.d, "Unable to parse ad request parameter overrides", localJSONException);
      }
  }

  private void f(Map paramMap)
  {
    localMap = a.a(this.e);
    if (localMap.isEmpty());
    try
    {
      g(localMap);
      a.a(localMap, this.e);
      paramMap.putAll(localMap);
      paramMap.put("network", m.a(this.e));
      paramMap.put("app_id", bg.b(this.e.getApplicationContext().getPackageName(), this.e));
      return;
    }
    catch (Exception localException)
    {
      while (true)
        this.f.e(this.d, "Unable to populate device information", localException);
    }
  }

  private String g()
  {
    String str = "inter_size,custom_size,launch_app,multi_click";
    if ((j.b()) && (j.a(AppLovinInterstitialActivity.class, this.g)))
      str = str + ",video";
    return str;
  }

  private void g(Map paramMap)
  {
    n localn = f();
    r localr = localn.c();
    String str1 = localr.a;
    if (bg.d(str1))
      paramMap.put("hudid", bg.a(bg.b(str1), this.e));
    String str2 = localr.b;
    if (bg.d(str2))
    {
      paramMap.put("hadid", bg.a(bg.b(str2), this.e));
      paramMap.put("adid", str2);
    }
    paramMap.put("brand", bg.c(localr.e));
    paramMap.put("carrier", bg.c(localr.h));
    paramMap.put("cpu_speed", localr.i);
    paramMap.put("locale", localr.j.toString());
    paramMap.put("model", bg.c(localr.c));
    paramMap.put("os", bg.c(localr.d));
    paramMap.put("platform", "android");
    if (localn.g())
      paramMap.put("sources", "tpa");
  }

  private void h(Map paramMap)
  {
    if (this.b != null)
      paramMap.put("require", this.b.getLabel());
  }

  void a()
  {
    super.a();
    a(-410);
  }

  protected void a(int paramInt)
  {
    this.f.e(this.d, "Unable to fetch " + this.a + " ad: server returned " + paramInt);
    try
    {
      if (this.c != null)
        this.c.failedToReceiveAd(paramInt);
      m.b(paramInt, this.e);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        this.f.e(this.d, "Unable process a failure to recieve an ad", localThrowable);
    }
  }

  protected void a(StringBuffer paramStringBuffer)
  {
    if (((Boolean)this.e.a(z.r)).booleanValue());
    try
    {
      paramStringBuffer.append("&" + n.a() + "=").append(d());
      return;
    }
    catch (Exception localException)
    {
      this.f.e(this.d, "Unable to populate apps", localException);
    }
  }

  protected void a(Map paramMap)
  {
    d(paramMap);
    f(paramMap);
    c(paramMap);
    b(paramMap);
    e(paramMap);
    h(paramMap);
  }

  protected void a(JSONObject paramJSONObject)
  {
    av localav = new av(paramJSONObject, this.c, this.e);
    this.e.a().a(localav, aq.a);
    m.a(paramJSONObject, this.e);
  }

  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  protected String b()
  {
    HashMap localHashMap = new HashMap();
    a(localHashMap);
    StringBuffer localStringBuffer = new StringBuffer(c());
    localStringBuffer.append("?").append(bg.a(localHashMap));
    a(localStringBuffer);
    return localStringBuffer.toString();
  }

  protected String c()
  {
    return m.b("ad", this.e);
  }

  protected String d()
  {
    return bg.a(a(f().b()), ",", ((Integer)this.e.a(z.q)).intValue());
  }

  public void run()
  {
    if (this.h)
    {
      this.f.d(this.d, "Preloading next ad...");
      while (true)
      {
        ae localae = this.e.b();
        localae.a("ad_req");
        a(localae);
        try
        {
          aj localaj = new aj(this, "RepeatFetchNextAd", z.i, this.e);
          localaj.a(z.n);
          localaj.run();
          return;
          this.f.d(this.d, "Fetching next ad...");
        }
        catch (Throwable localThrowable)
        {
          this.f.e(this.d, "Unable to fetch " + this.a + " ad", localThrowable);
          a(0);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.ai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
