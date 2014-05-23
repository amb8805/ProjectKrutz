package com.spotify.mobile.android.util;

import com.c.a.a.f;
import org.json.JSONArray;
import org.json.JSONObject;

abstract class o extends f
{
  private o()
  {
  }

  public final void a(String paramString)
  {
    d(null, "Response was not json: " + paramString);
  }

  public final void a(Throwable paramThrowable, String paramString)
  {
    d(paramThrowable, "Error with response: " + paramString);
  }

  public final void a(Throwable paramThrowable, JSONArray paramJSONArray)
  {
    d(paramThrowable, "Error with json array response: " + paramJSONArray);
  }

  public final void a(Throwable paramThrowable, JSONObject paramJSONObject)
  {
    d(paramThrowable, "Error with json object response: " + paramJSONObject);
  }

  public final void a(JSONArray paramJSONArray)
  {
    b(paramJSONArray);
  }

  public final void a(JSONObject paramJSONObject)
  {
    b(paramJSONObject);
  }

  protected abstract void b(JSONArray paramJSONArray);

  protected abstract void b(JSONObject paramJSONObject);

  protected abstract void d(Throwable paramThrowable, String paramString);
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
