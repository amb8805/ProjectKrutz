package com.spotify.mobile.android.util;

import org.json.JSONArray;
import org.json.JSONObject;

final class r extends o
{
  private bh a;

  public r(bh parambh)
  {
    super((byte)0);
    this.a = parambh;
  }

  protected final void b(JSONArray paramJSONArray)
  {
    this.a.a(null, "Response was json array instead of json object: " + paramJSONArray);
  }

  protected final void b(JSONObject paramJSONObject)
  {
    this.a.a(paramJSONObject);
  }

  protected final void d(Throwable paramThrowable, String paramString)
  {
    this.a.a(paramThrowable, paramString);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
