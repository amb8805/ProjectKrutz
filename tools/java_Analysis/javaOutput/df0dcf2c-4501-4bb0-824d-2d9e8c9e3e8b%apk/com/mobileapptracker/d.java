package com.mobileapptracker;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Date;
import java.util.concurrent.Semaphore;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  implements Runnable
{
  private String b = null;
  private String c = null;
  private String d = null;
  private double e = 0.0D;
  private String f = null;
  private String g = null;
  private String h = null;
  private String i = null;
  private String j = null;
  private String k = null;
  private String l = null;
  private String m = null;
  private String n = null;
  private boolean o = false;
  private Date p = null;

  protected d(c paramc, String paramString1, String paramString2, String paramString3, double paramDouble, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, boolean paramBoolean, Date paramDate)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramDouble;
    this.f = paramString4;
    this.g = paramString5;
    this.h = paramString6;
    this.i = paramString7;
    this.j = paramString8;
    this.k = paramString9;
    this.l = paramString10;
    this.m = paramString11;
    this.n = paramString12;
    this.o = paramBoolean;
    this.p = paramDate;
  }

  public final void run()
  {
    try
    {
      c.a(this.a).acquire();
      localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("link", this.b);
        if (this.c != null)
          localJSONObject.put("event_items", this.c);
        localJSONObject.put("action", this.d);
        localJSONObject.put("revenue", this.e);
        if (this.f == null)
          this.f = "USD";
        localJSONObject.put("currency", this.f);
        if (this.g != null)
          localJSONObject.put("ref_id", this.g);
        if (this.j != null)
          localJSONObject.put("event_attribute1", this.j);
        if (this.k != null)
          localJSONObject.put("event_attribute2", this.k);
        if (this.l != null)
          localJSONObject.put("event_attribute3", this.l);
        if (this.m != null)
          localJSONObject.put("event_attribute4", this.m);
        if (this.n != null)
          localJSONObject.put("event_attribute5", this.n);
        if (this.h != null)
          localJSONObject.put("iap_data", this.h);
        if (this.i != null)
          localJSONObject.put("iap_signature", this.i);
        localJSONObject.put("should_build_data", this.o);
        localJSONObject.put("run_date", this.p.getTime());
        SharedPreferences.Editor localEditor = c.b(this.a).edit();
        int i1 = 1 + this.a.a();
        this.a.a(i1);
        localEditor.putString(Integer.toString(i1), localJSONObject.toString());
        localEditor.commit();
        return;
      }
      catch (JSONException localJSONException)
      {
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      JSONObject localJSONObject;
      localInterruptedException.printStackTrace();
      return;
    }
    finally
    {
      c.a(this.a).release();
    }
  }
}

/* Location:
 * Qualified Name:     com.mobileapptracker.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
