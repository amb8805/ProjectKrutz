package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class p
  implements o
{
  private p(l paraml)
  {
  }

  private JSONObject b(String paramString, Object paramObject)
  {
    JSONObject localJSONObject = new JSONObject();
    String str = b();
    localJSONObject.put(paramString, paramObject);
    localJSONObject.put("$token", l.c(this.a));
    localJSONObject.put("$time", System.currentTimeMillis());
    if (str != null)
      localJSONObject.put("$distinct_id", b());
    return localJSONObject;
  }

  public final void a()
  {
    l.a(this.a).e();
    JSONArray localJSONArray = new JSONArray();
    try
    {
      JSONObject localJSONObject1 = new JSONObject().put("$android_devices", localJSONArray);
      try
      {
        JSONObject localJSONObject2 = b("$set", localJSONObject1);
        l.a(this.a, localJSONObject2);
        return;
      }
      catch (JSONException localJSONException2)
      {
        Log.e("MixpanelAPI", "Exception setting people properties", localJSONException2);
        return;
      }
    }
    catch (JSONException localJSONException1)
    {
      Log.e("MixpanelAPI", "set", localJSONException1);
    }
  }

  public final void a(Survey paramSurvey, Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT < 10);
    while (!i.a(paramActivity.getApplicationContext()))
      return;
    synchronized (l.e(this.a))
    {
      int i = paramActivity.hashCode();
      int j = l.f(this.a);
      Bitmap localBitmap = null;
      int k = 0;
      if (i == j)
      {
        localBitmap = l.g(this.a);
        k = l.h(this.a);
      }
      l.a(this.a, null);
      l.a(this.a, -1);
      l.b(this.a, -1);
      if (localBitmap != null)
      {
        SurveyState.a(paramSurvey, paramActivity, b(), l.c(this.a), localBitmap, k);
        return;
      }
    }
    f.a(paramActivity, new p.3(this, paramSurvey, paramActivity));
  }

  public final void a(x paramx, Activity paramActivity)
  {
    p.2 local2;
    String str1;
    String str2;
    p.1 local1;
    synchronized (l.e(this.a))
    {
      l.a(this.a, null);
      l.a(this.a, -1);
      l.b(this.a, -1);
      local2 = new p.2(this, paramActivity, paramx);
      if (l.b(this.a).a())
      {
        str1 = l.c(this.a);
        str2 = b();
        local1 = new p.1(this, local2);
        if (str2 == null)
          Log.i("MixpanelAPI", "Skipping survey check, because user has not yet been identified.");
      }
      else
      {
        return;
      }
    }
    if (Build.VERSION.SDK_INT < 10)
    {
      Log.i("MixpanelAPI", "Surveys not supported on OS older than API 10, reporting null.");
      local2.a(null);
      return;
    }
    c localc = new c(local1, str2, str1);
    l.d(this.a).a(localc);
  }

  public final void a(String paramString)
  {
    if (b() == null)
      return;
    l.a(this.a).b(paramString);
    try
    {
      JSONArray localJSONArray = new JSONArray("[" + paramString + "]");
      try
      {
        JSONObject localJSONObject1 = new JSONObject();
        localJSONObject1.put("$android_devices", localJSONArray);
        JSONObject localJSONObject2 = b("$union", localJSONObject1);
        l.a(this.a, localJSONObject2);
        return;
      }
      catch (JSONException localJSONException1)
      {
        Log.e("MixpanelAPI", "Exception unioning a property");
        return;
      }
    }
    catch (JSONException localJSONException2)
    {
      Log.e("MixpanelAPI", "set push registration id error", localJSONException2);
    }
  }

  public final void a(String paramString, Object paramObject)
  {
    try
    {
      JSONObject localJSONObject1 = new JSONObject();
      localJSONObject1.put(paramString, paramObject);
      JSONObject localJSONObject2 = b("$append", localJSONObject1);
      l.a(this.a, localJSONObject2);
      return;
    }
    catch (JSONException localJSONException)
    {
      Log.e("MixpanelAPI", "Exception appending a property", localJSONException);
    }
  }

  public final o b(String paramString)
  {
    if (paramString == null)
      return null;
    return new p.4(this, paramString);
  }

  public String b()
  {
    return l.a(this.a).d();
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
