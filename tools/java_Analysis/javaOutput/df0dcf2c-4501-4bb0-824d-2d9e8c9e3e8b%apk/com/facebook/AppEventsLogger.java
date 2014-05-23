package com.facebook;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.af;
import com.facebook.internal.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class AppEventsLogger
{
  private static final String a = AppEventsLogger.class.getCanonicalName();
  private static Map<AppEventsLogger.AccessTokenAppIdPair, d> d = new ConcurrentHashMap();
  private static Timer e;
  private static Timer f;
  private static AppEventsLogger.FlushBehavior g = AppEventsLogger.FlushBehavior.a;
  private static boolean h;
  private static Context i;
  private static Object j = new Object();
  private static String k;
  private static Map<String, Date> l = new HashMap();
  private static Map<String, a> m = new AppEventsLogger.1();
  private final Context b;
  private final AppEventsLogger.AccessTokenAppIdPair c;

  private AppEventsLogger(Context paramContext, String paramString)
  {
    af.a(paramContext, "context");
    this.b = paramContext;
    Session localSession = Session.h();
    if (localSession != null)
      this.c = new AppEventsLogger.AccessTokenAppIdPair(localSession);
    while (true)
    {
      synchronized (j)
      {
        if (k == null)
          k = ad.a(paramContext, paramString);
        if (i == null)
          i = paramContext.getApplicationContext();
      }
      synchronized (j)
      {
        if (e != null)
        {
          return;
          if (paramString == null)
            paramString = ad.a(paramContext);
          this.c = new AppEventsLogger.AccessTokenAppIdPair(null, paramString);
          continue;
          localObject2 = finally;
          throw localObject2;
        }
        e = new Timer();
        f = new Timer();
        e.schedule(new AppEventsLogger.2(), 0L, 60000L);
        f.schedule(new AppEventsLogger.3(), 0L, 86400000L);
        return;
      }
    }
  }

  public static AppEventsLogger.FlushBehavior a()
  {
    synchronized (j)
    {
      AppEventsLogger.FlushBehavior localFlushBehavior = g;
      return localFlushBehavior;
    }
  }

  public static AppEventsLogger a(Context paramContext)
  {
    return new AppEventsLogger(paramContext, null);
  }

  public static AppEventsLogger a(Context paramContext, String paramString)
  {
    return new AppEventsLogger(paramContext, paramString);
  }

  private static b a(AppEventsLogger.FlushReason paramFlushReason, Set<AppEventsLogger.AccessTokenAppIdPair> paramSet)
  {
    b localb = new b((byte)0);
    boolean bool = aa.a(i);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = paramSet.iterator();
    label223: 
    while (localIterator1.hasNext())
    {
      AppEventsLogger.AccessTokenAppIdPair localAccessTokenAppIdPair = (AppEventsLogger.AccessTokenAppIdPair)localIterator1.next();
      d locald = a(localAccessTokenAppIdPair);
      if (locald != null)
      {
        String str = localAccessTokenAppIdPair.b();
        ae localae = ad.a(str, false);
        Request localRequest = Request.a(String.format("%s/activities", new Object[] { str }), null);
        Bundle localBundle = localRequest.a();
        if (localBundle == null)
          localBundle = new Bundle();
        localBundle.putString("access_token", localAccessTokenAppIdPair.a());
        localRequest.a(localBundle);
        int n = locald.a(localRequest, localae.b(), localae.a(), bool);
        if (n == 0);
        for (Object localObject = null; ; localObject = localRequest)
        {
          if (localObject == null)
            break label223;
          localArrayList.add(localObject);
          break;
          localb.a = (n + localb.a);
          localRequest.a(new AppEventsLogger.5(localAccessTokenAppIdPair, localRequest, locald, localb));
        }
      }
    }
    if (localArrayList.size() > 0)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(localb.a);
      arrayOfObject[1] = paramFlushReason.toString();
      u.b();
      Iterator localIterator2 = localArrayList.iterator();
      while (localIterator2.hasNext())
        ((Request)localIterator2.next()).c();
      return localb;
    }
    return null;
  }

  private static d a(Context paramContext, AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    synchronized (j)
    {
      d locald = (d)d.get(paramAccessTokenAppIdPair);
      if (locald == null)
      {
        locald = new d(aa.a(paramContext.getContentResolver()), paramContext.getPackageName(), k);
        d.put(paramAccessTokenAppIdPair, locald);
      }
      return locald;
    }
  }

  private static d a(AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    synchronized (j)
    {
      d locald = (d)d.get(paramAccessTokenAppIdPair);
      return locald;
    }
  }

  public static void b()
  {
    c.a(i, d);
  }

  private static int g()
  {
    synchronized (j)
    {
      Iterator localIterator = d.values().iterator();
      int n = 0;
      while (localIterator.hasNext())
        n += ((d)localIterator.next()).a();
      return n;
    }
  }

  private static int h()
  {
    c localc = c.a(i);
    Iterator localIterator = localc.a().iterator();
    int n = 0;
    while (localIterator.hasNext())
    {
      AppEventsLogger.AccessTokenAppIdPair localAccessTokenAppIdPair = (AppEventsLogger.AccessTokenAppIdPair)localIterator.next();
      d locald = a(i, localAccessTokenAppIdPair);
      List localList = localc.a(localAccessTokenAppIdPair);
      locald.a(localList);
      n += localList.size();
    }
    return n;
  }

  public final void a(String paramString, Bundle paramBundle)
  {
    AppEventsLogger.AppEvent localAppEvent = new AppEventsLogger.AppEvent(paramString, paramBundle);
    Context localContext = this.b;
    AppEventsLogger.AccessTokenAppIdPair localAccessTokenAppIdPair = this.c;
    a locala = (a)m.get(localAppEvent.a());
    int i1;
    if (locala == null)
      i1 = 0;
    while (true)
    {
      if (i1 == 0)
        a(localContext, localAccessTokenAppIdPair).a(localAppEvent);
      synchronized (j)
      {
        if ((a() != AppEventsLogger.FlushBehavior.b) && (g() > 100))
        {
          AppEventsLogger.FlushReason localFlushReason = AppEventsLogger.FlushReason.e;
          aa.b().execute(new AppEventsLogger.4(localFlushReason));
        }
        return;
        Date localDate = (Date)l.get(localAppEvent.a());
        if ((localDate != null) && (new Date().getTime() - localDate.getTime() < 1000 * locala.a()))
        {
          n = 1;
          if ((n == 0) || (locala.b() == AppEventsLogger.SuppressionTimeoutBehavior.b))
            l.put(localAppEvent.a(), new Date());
          i1 = n;
          continue;
        }
        int n = 0;
      }
    }
  }

  public final String c()
  {
    return this.c.b();
  }
}

/* Location:
 * Qualified Name:     com.facebook.AppEventsLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
