package com.spotify.mobile.android.util;

import org.json.JSONArray;
import org.json.JSONObject;

final class q extends o
{
  private bg a;

  public q(bg parambg)
  {
    super((byte)0);
    this.a = parambg;
  }

  protected final void b(JSONArray paramJSONArray)
  {
    this.a.a(paramJSONArray);
  }

  protected final void b(JSONObject paramJSONObject)
  {
    this.a.a(null, "Response was json object instead of json array: " + paramJSONObject);
  }

  protected final void d(Throwable paramThrowable, String paramString)
  {
    this.a.a(paramThrowable, paramString);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
