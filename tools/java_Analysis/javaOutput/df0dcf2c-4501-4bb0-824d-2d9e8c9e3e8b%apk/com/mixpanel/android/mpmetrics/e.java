package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

final class e extends Handler
{
  private MPDbAdapter b = null;
  private final Set<Integer> c = new HashSet();
  private long d;
  private boolean e;

  public e(d paramd, Looper paramLooper)
  {
    super(paramLooper);
    this.e = a.a(paramd.a).d();
    this.d = a.a(paramd.a).b();
    d.a(paramd, new y(a.b(paramd.a)));
  }

  // ERROR //
  private Survey a(c paramc)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 74	com/mixpanel/android/mpmetrics/c:c	()Ljava/lang/String;
    //   5: aload_1
    //   6: invokevirtual 76	com/mixpanel/android/mpmetrics/c:b	()Ljava/lang/String;
    //   9: invokespecial 79	com/mixpanel/android/mpmetrics/e:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   12: astore_2
    //   13: aload_2
    //   14: ifnonnull +5 -> 19
    //   17: aconst_null
    //   18: areturn
    //   19: new 81	org/json/JSONObject
    //   22: dup
    //   23: aload_2
    //   24: invokespecial 84	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   27: ldc 86
    //   29: invokevirtual 90	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   32: astore 5
    //   34: iconst_0
    //   35: istore 6
    //   37: aconst_null
    //   38: astore 7
    //   40: aload 7
    //   42: ifnonnull +156 -> 198
    //   45: iload 6
    //   47: aload 5
    //   49: invokevirtual 95	org/json/JSONArray:length	()I
    //   52: if_icmpge +146 -> 198
    //   55: new 97	com/mixpanel/android/mpmetrics/Survey
    //   58: dup
    //   59: aload 5
    //   61: iload 6
    //   63: invokevirtual 101	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   66: invokespecial 104	com/mixpanel/android/mpmetrics/Survey:<init>	(Lorg/json/JSONObject;)V
    //   69: astore 8
    //   71: aload_0
    //   72: getfield 31	com/mixpanel/android/mpmetrics/e:c	Ljava/util/Set;
    //   75: aload 8
    //   77: invokevirtual 105	com/mixpanel/android/mpmetrics/Survey:b	()I
    //   80: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   83: invokeinterface 117 2 0
    //   88: istore 13
    //   90: iload 13
    //   92: ifne +109 -> 201
    //   95: iinc 6 1
    //   98: aload 8
    //   100: astore 7
    //   102: goto -62 -> 40
    //   105: astore_3
    //   106: ldc 119
    //   108: new 121	java/lang/StringBuilder
    //   111: dup
    //   112: ldc 123
    //   114: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   117: aload_2
    //   118: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: invokestatic 136	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   127: pop
    //   128: aconst_null
    //   129: areturn
    //   130: astore 11
    //   132: ldc 119
    //   134: new 121	java/lang/StringBuilder
    //   137: dup
    //   138: ldc 138
    //   140: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   143: aload 5
    //   145: invokevirtual 139	org/json/JSONArray:toString	()Ljava/lang/String;
    //   148: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   154: invokestatic 142	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   157: pop
    //   158: aconst_null
    //   159: astore 8
    //   161: goto -66 -> 95
    //   164: astore 9
    //   166: ldc 119
    //   168: new 121	java/lang/StringBuilder
    //   171: dup
    //   172: ldc 138
    //   174: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   177: aload 5
    //   179: invokevirtual 139	org/json/JSONArray:toString	()Ljava/lang/String;
    //   182: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   188: invokestatic 142	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   191: pop
    //   192: aconst_null
    //   193: astore 8
    //   195: goto -100 -> 95
    //   198: aload 7
    //   200: areturn
    //   201: aload 7
    //   203: astore 8
    //   205: goto -110 -> 95
    //
    // Exception table:
    //   from	to	target	type
    //   19	34	105	org/json/JSONException
    //   55	90	130	org/json/JSONException
    //   55	90	164	com/mixpanel/android/mpmetrics/Survey$BadSurveyException
  }

  private String a(String paramString1, String paramString2)
  {
    try
    {
      String str1 = URLEncoder.encode(paramString1, "utf-8");
      String str2 = URLEncoder.encode(paramString2, "utf-8");
      String str3 = "?version=1&lib=android&token=" + str1 + "&distinct_id=" + str2;
      String str4 = a.a(this.a.a).g() + str3;
      String str5 = a.a(this.a.a).j() + str3;
      locals = a.b().a(str4, str5);
      if (locals.a() != ServerMessage.Status.a)
        return null;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException("Mixpanel library requires utf-8 string encoding to be available", localUnsupportedEncodingException);
    }
    s locals;
    return locals.b();
  }

  private JSONObject a(b paramb)
  {
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2 = paramb.b();
    JSONObject localJSONObject3 = new JSONObject();
    localJSONObject3.put("mp_lib", "android");
    localJSONObject3.put("$lib_version", "4.0.0");
    localJSONObject3.put("$os", "Android");
    String str1;
    String str2;
    label82: String str3;
    if (Build.VERSION.RELEASE == null)
    {
      str1 = "UNKNOWN";
      localJSONObject3.put("$os_version", str1);
      if (Build.MANUFACTURER != null)
        break label467;
      str2 = "UNKNOWN";
      localJSONObject3.put("$manufacturer", str2);
      if (Build.BRAND != null)
        break label475;
      str3 = "UNKNOWN";
      label102: localJSONObject3.put("$brand", str3);
      if (Build.MODEL != null)
        break label483;
    }
    label467: label475: label483: for (String str4 = "UNKNOWN"; ; str4 = Build.MODEL)
    {
      localJSONObject3.put("$model", str4);
      DisplayMetrics localDisplayMetrics = d.d(this.a).d();
      localJSONObject3.put("$screen_dpi", localDisplayMetrics.densityDpi);
      localJSONObject3.put("$screen_height", localDisplayMetrics.heightPixels);
      localJSONObject3.put("$screen_width", localDisplayMetrics.widthPixels);
      String str5 = d.d(this.a).a();
      if (str5 != null)
        localJSONObject3.put("$app_version", str5);
      Boolean localBoolean1 = Boolean.valueOf(d.d(this.a).b());
      if (localBoolean1 != null)
        localJSONObject3.put("$has_nfc", localBoolean1.booleanValue());
      Boolean localBoolean2 = Boolean.valueOf(d.d(this.a).c());
      if (localBoolean2 != null)
        localJSONObject3.put("$has_telephone", localBoolean2.booleanValue());
      String str6 = d.d(this.a).e();
      if (str6 != null)
        localJSONObject3.put("$carrier", str6);
      Boolean localBoolean3 = d.d(this.a).f();
      if (localBoolean3 != null)
        localJSONObject3.put("$wifi", localBoolean3.booleanValue());
      d.d(this.a);
      Boolean localBoolean4 = y.g();
      if (localBoolean4 != null)
        localJSONObject3.put("$bluetooth_enabled", localBoolean4);
      String str7 = d.d(this.a).h();
      if (str7 != null)
        localJSONObject3.put("$bluetooth_version", str7);
      localJSONObject3.put("token", paramb.c());
      if (localJSONObject2 == null)
        break label491;
      Iterator localIterator = localJSONObject2.keys();
      while (localIterator.hasNext())
      {
        String str8 = (String)localIterator.next();
        localJSONObject3.put(str8, localJSONObject2.get(str8));
      }
      str1 = Build.VERSION.RELEASE;
      break;
      str2 = Build.MANUFACTURER;
      break label82;
      str3 = Build.BRAND;
      break label102;
    }
    label491: localJSONObject1.put("event", paramb.a());
    localJSONObject1.put("properties", localJSONObject3);
    return localJSONObject1;
  }

  private void a(MPDbAdapter paramMPDbAdapter)
  {
    if (a())
    {
      a.a(this.a.a, "Sending records to Mixpanel");
      if (this.e)
      {
        a(paramMPDbAdapter, MPDbAdapter.Table.a, a.a(this.a.a).e(), null);
        a(paramMPDbAdapter, MPDbAdapter.Table.b, a.a(this.a.a).f(), null);
        return;
      }
      a(paramMPDbAdapter, MPDbAdapter.Table.a, a.a(this.a.a).e(), a.a(this.a.a).h());
      a(paramMPDbAdapter, MPDbAdapter.Table.b, a.a(this.a.a).f(), a.a(this.a.a).i());
      return;
    }
    a.a(this.a.a, "Can't send data to mixpanel, because the device is not connected to the internet");
  }

  private void a(MPDbAdapter paramMPDbAdapter, MPDbAdapter.Table paramTable, String paramString1, String paramString2)
  {
    String[] arrayOfString = paramMPDbAdapter.a(paramTable);
    String str1;
    ServerMessage.Status localStatus;
    if (arrayOfString != null)
    {
      str1 = arrayOfString[0];
      String str2 = arrayOfString[1];
      localStatus = a.b().a(str2, paramString1, paramString2).a();
      if (localStatus != ServerMessage.Status.a)
        break label119;
      a.a(this.a.a, "Posted to " + paramString1);
      a.a(this.a.a, "Sent Message\n" + str2);
    }
    label119: 
    do
      do
      {
        paramMPDbAdapter.a(str1, paramTable);
        return;
      }
      while (localStatus != ServerMessage.Status.b);
    while (hasMessages(a.d()));
    sendEmptyMessageDelayed(a.d(), this.d);
  }

  private boolean a()
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)a.b(this.a.a).getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo != null)
      {
        boolean bool = localNetworkInfo.isConnectedOrConnecting();
        if (bool)
          return true;
      }
      return false;
    }
    catch (SecurityException localSecurityException)
    {
    }
    return true;
  }

  public final void handleMessage(Message paramMessage)
  {
    if (this.b == null)
    {
      this.b = a.b(a.b(this.a.a));
      this.b.a(System.currentTimeMillis() - a.a(this.a.a).c(), MPDbAdapter.Table.a);
      this.b.a(System.currentTimeMillis() - a.a(this.a.a).c(), MPDbAdapter.Table.b);
    }
    try
    {
      if (paramMessage.what == a.c())
      {
        Long localLong = (Long)paramMessage.obj;
        a.a(this.a.a, "Changing flush interval to " + localLong);
        this.d = localLong.longValue();
        removeMessages(a.d());
        i = -1;
      }
      while (true)
        if (i >= a.a(this.a.a).a())
        {
          a.a(this.a.a, "Flushing queue due to bulk upload limit");
          d.a(this.a);
          a(this.b);
          return;
          if (paramMessage.what == a.e())
          {
            Boolean localBoolean = (Boolean)paramMessage.obj;
            a.a(this.a.a, "Setting fallback to " + localBoolean);
            this.e = localBoolean.booleanValue();
            i = -1;
          }
          else if (paramMessage.what == a.f())
          {
            JSONObject localJSONObject2 = (JSONObject)paramMessage.obj;
            a.a(this.a.a, "Queuing people record for sending later");
            a.a(this.a.a, "    " + localJSONObject2.toString());
            i = this.b.a(localJSONObject2, MPDbAdapter.Table.b);
          }
          else
          {
            b localb;
            if (paramMessage.what == a.g())
            {
              localb = (b)paramMessage.obj;
              try
              {
                JSONObject localJSONObject1 = a(localb);
                a.a(this.a.a, "Queuing event for sending later");
                a.a(this.a.a, "    " + localJSONObject1.toString());
                int j = this.b.a(localJSONObject1, MPDbAdapter.Table.a);
                i = j;
              }
              catch (JSONException localJSONException)
              {
                Log.e("MixpanelAPI", "Exception tracking event " + localb.a(), localJSONException);
                i = -1;
              }
            }
            else if (paramMessage.what == a.d())
            {
              a.a(this.a.a, "Flushing queue due to scheduled or forced flush");
              d.a(this.a);
              a(this.b);
              i = -1;
            }
            else if (paramMessage.what == a.h())
            {
              a.a(this.a.a, "Checking Mixpanel for available surveys");
              c localc = (c)paramMessage.obj;
              e.1 local1 = new e.1(this, localc, a(localc));
              if (Build.VERSION.SDK_INT >= 11)
              {
                AsyncTask.execute(local1);
                i = -1;
              }
              else
              {
                new Thread(local1).run();
                i = -1;
              }
            }
            else if (paramMessage.what == a.i())
            {
              Log.w("MixpanelAPI", "Worker received a hard kill. Dumping all events and force-killing. Thread id " + Thread.currentThread().getId());
            }
          }
        }
    }
    catch (RuntimeException localObject2)
    {
      while (true)
      {
        synchronized (d.b(this.a))
        {
          this.b.a();
          d.c(this.a);
          Looper.myLooper().quit();
          i = -1;
        }
        Log.e("MixpanelAPI", "Worker threw an unhandled exception", localRuntimeException);
        synchronized (d.b(this.a))
        {
          d.c(this.a);
          try
          {
            Looper.myLooper().quit();
            Log.e("MixpanelAPI", "Mixpanel will not process any more analytics messages", localRuntimeException);
            return;
            localObject2 = finally;
            throw localObject2;
            Log.e("MixpanelAPI", "Unexpected message received by Mixpanel worker: " + paramMessage);
            i = -1;
            continue;
            if ((i > 0) && (!hasMessages(a.d())))
            {
              a.a(this.a.a, "Queue depth " + i + " - Adding flush in " + this.d);
              if (this.d >= 0L)
              {
                sendEmptyMessageDelayed(a.d(), this.d);
                return;
              }
            }
          }
          catch (Exception localException)
          {
            while (true)
              Log.e("MixpanelAPI", "Could not halt looper", localException);
          }
        }
      }
    }
    int i;
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
