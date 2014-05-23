package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObject.Factory;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executor;;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class aa
{
  private static final String a = aa.class.getCanonicalName();
  private static final HashSet<LoggingBehavior> b = new HashSet(Arrays.asList(arrayOfLoggingBehavior));
  private static volatile Executor c;
  private static volatile boolean d;
  private static volatile String e;
  private static volatile String f = "facebook.com";
  private static final Object g = new Object();
  private static final Uri h = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
  private static final BlockingQueue<Runnable> i = new LinkedBlockingQueue(10);
  private static final ThreadFactory j = new aa.1();

  static
  {
    LoggingBehavior[] arrayOfLoggingBehavior = new LoggingBehavior[1];
    arrayOfLoggingBehavior[0] = LoggingBehavior.f;
  }

  public aa()
  {
  }

  static t a(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null))
      try
      {
        throw new IllegalArgumentException("Both context and applicationId must be non-null");
      }
      catch (Exception localException)
      {
        ad.a();
        return new t(null, null, new FacebookRequestError(null, localException));
      }
    str1 = a(paramContext.getContentResolver());
    localSharedPreferences = paramContext.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
    str2 = paramString + "ping";
    str3 = paramString + "json";
    long l = localSharedPreferences.getLong(str2, 0L);
    String str4 = localSharedPreferences.getString(str3, null);
    GraphObject localGraphObject1 = GraphObject.Factory.create();
    localGraphObject1.setProperty("event", "MOBILE_APP_INSTALL");
    String str5 = ad.a(paramContext, paramString);
    if (!a(paramContext))
    {
      bool = true;
      while (true)
      {
        ad.a(localGraphObject1, str1, str5, bool);
        localGraphObject1.setProperty("auto_publish", Boolean.valueOf(true));
        localGraphObject1.setProperty("application_package_name", paramContext.getPackageName());
        localRequest = Request.a(String.format("%s/activities", new Object[] { paramString }), localGraphObject1);
        if (l != 0L)
        {
          localObject1 = null;
          if (str4 != null)
            try
            {
              GraphObject localGraphObject2 = GraphObject.Factory.create(new JSONObject(str4));
              localObject1 = localGraphObject2;
              localObject2 = localObject1;
              if (localObject2 == null)
                return (t)t.a("true", null, new r(new Request[] { localRequest }), true).get(0);
              return new t(null, null, localObject2, true);
              if (str1 == null)
                throw new FacebookException("No attribution id returned from the Facebook application");
              if (!ad.a(paramString, false).a())
                throw new FacebookException("Install attribution has been disabled on the server.");
              t localt = localRequest.c();
              SharedPreferences.Editor localEditor = localSharedPreferences.edit();
              localEditor.putLong(str2, System.currentTimeMillis());
              if ((localt.b() != null) && (localt.b().getInnerJSONObject() != null))
                localEditor.putString(str3, localt.b().getInnerJSONObject().toString());
              localEditor.commit();
              return localt;
              bool = false;
            }
            catch (JSONException localJSONException)
            {
              while (true)
                Object localObject2 = null;
            }
        }
      }
    }
  }

  public static String a(ContentResolver paramContentResolver)
  {
    try
    {
      String[] arrayOfString = { "aid" };
      Cursor localCursor = paramContentResolver.query(h, arrayOfString, null, null, null);
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        String str = localCursor.getString(localCursor.getColumnIndex("aid"));
        localCursor.close();
        return str;
      }
    }
    catch (Exception localException)
    {
      Log.d(a, "Caught unexpected exception in getAttributionId(): " + localException.toString());
      return null;
    }
    return null;
  }

  public static final boolean a()
  {
    HashSet localHashSet = b;
    return false;
  }

  public static boolean a(Context paramContext)
  {
    return paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
  }

  public static Executor b()
  {
    synchronized (g)
    {
      if (c == null)
      {
        Object localObject3 = f();
        if (localObject3 == null)
          localObject3 = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, i, j);
        c = (Executor)localObject3;
      }
      return c;
    }
  }

  public static String c()
  {
    return f;
  }

  @Deprecated
  public static boolean d()
  {
    return d;
  }

  public static String e()
  {
    return e;
  }

  // ERROR //
  private static Executor f()
  {
    // Byte code:
    //   0: ldc_w 339
    //   3: ldc_w 341
    //   6: invokevirtual 345	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   9: astore_1
    //   10: aload_1
    //   11: aconst_null
    //   12: invokevirtual 350	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   15: astore_3
    //   16: aload_3
    //   17: ifnonnull +11 -> 28
    //   20: aconst_null
    //   21: areturn
    //   22: astore_0
    //   23: aconst_null
    //   24: areturn
    //   25: astore_2
    //   26: aconst_null
    //   27: areturn
    //   28: aload_3
    //   29: instanceof 352
    //   32: ifne +5 -> 37
    //   35: aconst_null
    //   36: areturn
    //   37: aload_3
    //   38: checkcast 352	java/util/concurrent/Executor
    //   41: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	10	22	java/lang/NoSuchFieldException
    //   10	16	25	java/lang/IllegalAccessException
  }
}

/* Location:
 * Qualified Name:     com.facebook.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
