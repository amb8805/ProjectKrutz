package com.applovin.impl.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLovinEvent
{
  public static final String SESSION_END = "session_end";
  public static final String SESSION_START = "session_start";
  private String a;
  private String b;
  private long c;
  private String d;
  private Map e;

  public AppLovinEvent(String paramString)
  {
    this(paramString, new HashMap());
  }

  private AppLovinEvent(String paramString, long paramLong)
  {
    this(paramString, paramLong, UUID.randomUUID().toString(), new HashMap());
  }

  private AppLovinEvent(String paramString1, long paramLong, String paramString2, String paramString3, Map paramMap)
  {
    this.a = paramString2;
    this.b = paramString3;
    this.c = paramLong;
    this.d = paramString1;
    this.e = paramMap;
  }

  private AppLovinEvent(String paramString1, long paramLong, String paramString2, Map paramMap)
  {
    this(paramString1, paramLong, paramString2, "NO_LINK_ID_SET", paramMap);
  }

  public AppLovinEvent(String paramString, Map paramMap)
  {
    this(paramString, System.currentTimeMillis(), UUID.randomUUID().toString(), paramMap);
  }

  static AppLovinEvent a(String paramString1, double paramDouble, String paramString2)
  {
    AppLovinEvent localAppLovinEvent = new AppLovinEvent("revenue");
    localAppLovinEvent.setField("name", paramString1);
    localAppLovinEvent.setField("revenue", Double.toString(paramDouble));
    localAppLovinEvent.setField("currency", paramString2);
    return localAppLovinEvent;
  }

  static AppLovinEvent a(String paramString, long paramLong)
  {
    AppLovinEvent localAppLovinEvent = new AppLovinEvent("session_tracking", paramLong);
    localAppLovinEvent.setField("action", paramString);
    return localAppLovinEvent;
  }

  static AppLovinEvent a(String paramString1, String paramString2, String paramString3, Throwable paramThrowable)
  {
    AppLovinEvent localAppLovinEvent = new AppLovinEvent("error");
    if (paramThrowable != null)
      paramString1 = paramString1 + ": " + paramThrowable.getMessage();
    localAppLovinEvent.setField("code", paramString3);
    localAppLovinEvent.setField("message", paramString2);
    localAppLovinEvent.setField("exception", paramString1);
    return localAppLovinEvent;
  }

  static AppLovinEvent a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    return a(paramString1, paramString2, "ReportedError", paramThrowable);
  }

  static AppLovinEvent a(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    JSONObject localJSONObject = paramJSONObject.optJSONObject("values");
    if (localJSONObject != null)
    {
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = localIterator.next().toString();
        localHashMap.put(str, localJSONObject.getString(str));
      }
    }
    return new AppLovinEvent(paramJSONObject.getString("type"), paramJSONObject.getLong("ts"), paramJSONObject.getString("id"), paramJSONObject.getString("sid"), localHashMap);
  }

  static AppLovinEvent b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    return a(paramString1, paramString2, "UserError", paramThrowable);
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    AppLovinEvent localAppLovinEvent;
    do
    {
      return true;
      if (!(paramObject instanceof AppLovinEvent))
        return false;
      localAppLovinEvent = (AppLovinEvent)paramObject;
    }
    while (this.a.equals(localAppLovinEvent.a));
    return false;
  }

  public String getEventID()
  {
    return this.a;
  }

  public int hashCode()
  {
    return this.a.hashCode();
  }

  public void setField(String paramString1, String paramString2)
  {
    this.e.put(paramString1, paramString2);
  }

  protected void setSessionLinkIdentifier(String paramString)
  {
    this.b = paramString;
  }

  public JSONObject toJson()
  {
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("id", this.a);
    localJSONObject1.put("sid", this.b);
    localJSONObject1.put("ts", this.c);
    localJSONObject1.put("type", this.d);
    JSONObject localJSONObject2 = new JSONObject();
    Iterator localIterator = this.e.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localJSONObject2.put(str, this.e.get(str));
    }
    localJSONObject1.put("values", localJSONObject2);
    return localJSONObject1;
  }

  public String toString()
  {
    try
    {
      String str = "ALEvent: " + toJson();
      return str;
    }
    catch (JSONException localJSONException)
    {
    }
    return "ALEvent: Corrupted JSON";
  }

  public void truncateValues(int paramInt)
  {
    Iterator localIterator = this.e.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = (String)this.e.get(str1);
      if (str2.length() > paramInt)
        this.e.put(str1, str2.substring(0, paramInt));
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.AppLovinEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
