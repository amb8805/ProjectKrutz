package com.applovin.impl.sdk;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.applovin.sdk.AppLovinLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;

class s
{
  private final AppLovinSdkImpl a;
  private final AppLovinLogger b;
  private final Object c = new Object();
  private final Collection d = new HashSet();
  private String e;
  private long f = 0L;

  s(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    this.a = paramAppLovinSdkImpl;
    this.b = paramAppLovinSdkImpl.getLogger();
    this.e = f().getString("SessionLinkIdentifier", "NO_LINK_ID_SET");
  }

  private HashSet a(String paramString)
  {
    JSONArray localJSONArray = new JSONArray(paramString);
    HashSet localHashSet = new HashSet();
    for (int i = 0; i < localJSONArray.length(); i++)
      localHashSet.add(AppLovinEvent.a(localJSONArray.getJSONObject(i)));
    return localHashSet;
  }

  protected static JSONArray a(Collection paramCollection)
  {
    JSONArray localJSONArray;
    try
    {
      localJSONArray = new JSONArray();
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
        localJSONArray.put(((AppLovinEvent)localIterator.next()).toJson());
    }
    finally
    {
    }
    return localJSONArray;
  }

  private SharedPreferences f()
  {
    return this.a.getSettingsManager().a();
  }

  private void g()
  {
    long l = this.f + 1000L * ((Long)this.a.a(z.P)).longValue();
    if (System.currentTimeMillis() > l);
    for (int i = 1; ; i = 0)
    {
      if ((i != 0) && (((Boolean)this.a.a(z.O)).booleanValue()))
      {
        this.f = System.currentTimeMillis();
        c();
      }
      return;
    }
  }

  private void h()
  {
    synchronized (this.c)
    {
      try
      {
        SharedPreferences.Editor localEditor = f().edit();
        localEditor.putString("ALQueuedEvents", a(this.d).toString());
        localEditor.commit();
        return;
      }
      catch (JSONException localJSONException)
      {
        while (true)
          Log.e("EventManager", "Generated invalid JSON while trying to save events.", localJSONException);
      }
    }
  }

  public Collection a()
  {
    synchronized (this.c)
    {
      ArrayList localArrayList = new ArrayList(this.d);
      return localArrayList;
    }
  }

  public void a(AppLovinEvent paramAppLovinEvent)
  {
    a(paramAppLovinEvent, true);
  }

  public void a(AppLovinEvent paramAppLovinEvent, boolean paramBoolean)
  {
    if (paramAppLovinEvent != null)
      synchronized (this.c)
      {
        if (this.d.size() < ((Integer)this.a.a(z.R)).intValue())
        {
          paramAppLovinEvent.setSessionLinkIdentifier(this.e);
          this.d.add(paramAppLovinEvent);
          h();
          this.b.d("EventManager", "Now tracking event: " + paramAppLovinEvent);
          this.b.d("EventManager", "Tracked: " + paramAppLovinEvent);
          if (paramBoolean)
            g();
          return;
        }
        Log.e("EventManager", "Could not track event: maximum cache size exceeded.");
      }
    this.b.d("EventManager", "Disregarded tracking of null event.");
  }

  protected void b()
  {
    synchronized (this.c)
    {
      try
      {
        HashSet localHashSet = a(f().getString("ALQueuedEvents", ""));
        this.d.addAll(localHashSet);
        return;
      }
      catch (JSONException localJSONException)
      {
        while (true)
        {
          Log.e("EventManager", "Loaded invalid JSON from SharedPreferences. Clearing event cache.", localJSONException);
          d();
        }
      }
    }
  }

  public void b(Collection paramCollection)
  {
    synchronized (this.c)
    {
      this.d.removeAll(paramCollection);
      h();
      return;
    }
  }

  protected void c()
  {
    af localaf = new af(this.a);
    this.a.a().a(localaf, aq.b, 0L);
  }

  protected void d()
  {
    synchronized (this.c)
    {
      this.d.clear();
      h();
      return;
    }
  }

  protected String e()
  {
    synchronized (this.c)
    {
      this.e = UUID.randomUUID().toString();
      f().edit().putString("SessionLinkIdentifier", this.e).commit();
      String str = this.e;
      return str;
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
