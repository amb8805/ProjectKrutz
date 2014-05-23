package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinLogger;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class af extends ar
{
  af(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    super("SubmitData", paramAppLovinSdkImpl);
  }

  static JSONArray a(Collection paramCollection)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      q localq = (q)localIterator.next();
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("package_name", localq.c);
      localJSONObject.put("created_at", localq.d / 1000L);
      localJSONArray.put(localJSONObject);
    }
    return localJSONArray;
  }

  static JSONObject a(Map paramMap)
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localJSONObject.put((String)localEntry.getKey(), localEntry.getValue());
    }
    return localJSONObject;
  }

  protected void a(JSONObject paramJSONObject)
  {
    n localn = f();
    q localq = localn.d();
    r localr = localn.c();
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("model", localr.c);
    localJSONObject1.put("os", localr.d);
    localJSONObject1.put("brand", localr.e);
    localJSONObject1.put("sdk_version", localr.f);
    localJSONObject1.put("country_code", localr.g);
    localJSONObject1.put("carrier", localr.h);
    localJSONObject1.put("cpu_speed", localr.i);
    localJSONObject1.put("type", "android");
    if (((Boolean)this.e.a(z.U)).booleanValue())
    {
      localJSONObject1.put("adid", localr.b);
      localJSONObject1.put("h_android_id", bg.a(bg.b(localr.b), this.e));
      localJSONObject1.put("h_udid", bg.a(bg.b(localr.a), this.e));
      localJSONObject1.put("h_nn_android_id", bg.a(localr.b, this.e));
      localJSONObject1.put("h_nn_udid", bg.a(localr.a, this.e));
    }
    Locale localLocale = localr.j;
    if (localLocale != null)
      localJSONObject1.put("locale", localLocale.toString());
    paramJSONObject.put("device_info", localJSONObject1);
    JSONObject localJSONObject2 = new JSONObject();
    localJSONObject2.put("package_name", localq.c);
    localJSONObject2.put("app_name", localq.a);
    localJSONObject2.put("app_version", localq.b);
    localJSONObject2.put("created_at", localq.d / 1000L);
    localJSONObject2.put("applovin_sdk_version", "5.2.2-5.2.2");
    String str1 = (String)this.e.a(z.W);
    localJSONObject2.put("first_install", str1);
    if (str1.equals("true"))
      this.e.getSettingsManager().a(z.W, "false");
    String str2 = (String)this.e.a(z.J);
    if ((str2 != null) && (str2.length() > 0))
      localJSONObject2.put("plugin_version", str2);
    paramJSONObject.put("app_info", localJSONObject2);
    if (((Boolean)this.e.a(z.U)).booleanValue())
    {
      Map localMap = ((i)this.e.getTargetingData()).a();
      if ((localMap != null) && (!localMap.isEmpty()))
        paramJSONObject.put("targeting", a(localMap));
      paramJSONObject.put("stats", this.e.b().b());
    }
  }

  protected void a(JSONObject paramJSONObject, Collection paramCollection)
  {
    try
    {
      JSONObject localJSONObject = m.a(paramJSONObject);
      ac localac = this.e.getSettingsManager();
      localac.a(z.c, localJSONObject.getString("device_id"));
      localac.a(z.f, localJSONObject.getString("device_token"));
      localac.a(z.d, localJSONObject.getString("publisher_id"));
      localac.a(z.e, localJSONObject.getString("app_id"));
      localac.b();
      m.a(localJSONObject, this.e);
      if (localJSONObject.has("adserver_parameters"))
      {
        String str = localJSONObject.getJSONObject("adserver_parameters").toString();
        localac.a(z.C, str);
      }
      this.e.getEventManager().b(paramCollection);
      if (((Boolean)this.e.a(z.y)).booleanValue())
        a_();
      return;
    }
    catch (JSONException localJSONException)
    {
      this.f.e(this.d, "Unable to parse API response", localJSONException);
    }
  }

  protected void a_()
  {
    this.e.a().a(new bc(this.e), aq.b);
  }

  protected Collection b()
  {
    if ((((Boolean)this.e.a(z.r)).booleanValue()) && (bg.a(z.s, this.e)))
      return f().b();
    return null;
  }

  protected void b(JSONObject paramJSONObject, Collection paramCollection)
  {
    ag localag = new ag(this, "Repeat" + this.d, z.h, this.e, paramJSONObject, paramCollection);
    localag.a(z.m);
    localag.run();
  }

  public void run()
  {
    try
    {
      s locals = this.e.getEventManager();
      this.f.i(this.d, "Submitting user data...");
      JSONObject localJSONObject = new JSONObject();
      a(localJSONObject);
      if (((Boolean)this.e.a(z.T)).booleanValue())
      {
        Collection localCollection2 = b();
        if (localCollection2 != null)
          localJSONObject.put(n.a(), a(localCollection2));
      }
      if (((Boolean)this.e.a(z.U)).booleanValue())
      {
        Collection localCollection1 = locals.a();
        localJSONObject.put("events", s.a(localCollection1));
        b(localJSONObject, localCollection1);
        return;
      }
      this.e.getEventManager().d();
      b(localJSONObject, new HashSet(0));
      return;
    }
    catch (JSONException localJSONException)
    {
      this.f.e(this.d, "Unable to create JSON message with collected data", localJSONException);
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
