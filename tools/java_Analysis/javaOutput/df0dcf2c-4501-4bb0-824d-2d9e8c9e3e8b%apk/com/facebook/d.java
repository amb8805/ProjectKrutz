package com.facebook;

import android.os.Bundle;
import com.facebook.internal.ad;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObject.Factory;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

final class d
{
  private List<AppEventsLogger.AppEvent> a = new ArrayList();
  private List<AppEventsLogger.AppEvent> b = new ArrayList();
  private int c;
  private String d;
  private String e;
  private String f;
  private final int g = 1000;

  public d(String paramString1, String paramString2, String paramString3)
  {
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
  }

  private static byte[] a(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("UTF-8");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      ad.a();
    }
    return null;
  }

  public final int a()
  {
    try
    {
      int i = this.a.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int a(Request paramRequest, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i;
    JSONArray localJSONArray;
    try
    {
      i = this.c;
      this.b.addAll(this.a);
      this.a.clear();
      localJSONArray = new JSONArray();
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        AppEventsLogger.AppEvent localAppEvent = (AppEventsLogger.AppEvent)localIterator.next();
        if ((paramBoolean1) || (!localAppEvent.b()))
          localJSONArray.put(localAppEvent.c());
      }
    }
    finally
    {
    }
    if (localJSONArray.length() == 0)
      return 0;
    GraphObject localGraphObject = GraphObject.Factory.create();
    localGraphObject.setProperty("event", "CUSTOM_APP_EVENTS");
    if (this.c > 0)
      localGraphObject.setProperty("num_skipped_events", Integer.valueOf(i));
    if (paramBoolean2)
      ad.a(localGraphObject, this.d, this.f, paramBoolean3);
    localGraphObject.setProperty("application_package_name", this.e);
    paramRequest.a(localGraphObject);
    Bundle localBundle = paramRequest.a();
    if (localBundle == null)
      localBundle = new Bundle();
    String str = localJSONArray.toString();
    if (str != null)
    {
      localBundle.putByteArray("custom_events_file", a(str));
      paramRequest.a(str);
    }
    paramRequest.a(localBundle);
    return localJSONArray.length();
  }

  public final void a(AppEventsLogger.AppEvent paramAppEvent)
  {
    try
    {
      if (this.a.size() + this.b.size() >= 1000)
        this.c = (1 + this.c);
      while (true)
      {
        return;
        this.a.add(paramAppEvent);
      }
    }
    finally
    {
    }
  }

  public final void a(List<AppEventsLogger.AppEvent> paramList)
  {
    try
    {
      this.a.addAll(paramList);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean);
    try
    {
      this.a.addAll(this.b);
      this.b.clear();
      this.c = 0;
      return;
    }
    finally
    {
    }
  }

  public final List<AppEventsLogger.AppEvent> b()
  {
    try
    {
      List localList = this.a;
      this.a = new ArrayList();
      return localList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
