package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class r
{
  private static boolean j = true;
  private static final Object k = new Object();
  private final Future<SharedPreferences> a;
  private final Future<SharedPreferences> b;
  private final SharedPreferences.OnSharedPreferenceChangeListener c;
  private JSONObject d;
  private Map<String, String> e;
  private boolean f;
  private String g;
  private String h;
  private JSONArray i;

  public r(Future<SharedPreferences> paramFuture1, Future<SharedPreferences> paramFuture2)
  {
    this.b = paramFuture1;
    this.a = paramFuture2;
    this.d = null;
    this.e = null;
    this.f = false;
    this.c = new r.1(this);
  }

  // ERROR //
  public static JSONArray a(SharedPreferences paramSharedPreferences)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 57
    //   3: aconst_null
    //   4: invokeinterface 63 3 0
    //   9: astore_1
    //   10: aload_0
    //   11: ldc 65
    //   13: aconst_null
    //   14: invokeinterface 63 3 0
    //   19: astore_2
    //   20: aload_2
    //   21: ifnull +78 -> 99
    //   24: aload_1
    //   25: ifnull +74 -> 99
    //   28: new 67	org/json/JSONArray
    //   31: dup
    //   32: aload_2
    //   33: invokespecial 70	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   36: astore_3
    //   37: new 67	org/json/JSONArray
    //   40: dup
    //   41: invokespecial 71	org/json/JSONArray:<init>	()V
    //   44: astore 4
    //   46: iconst_0
    //   47: istore 5
    //   49: iload 5
    //   51: aload_3
    //   52: invokevirtual 75	org/json/JSONArray:length	()I
    //   55: if_icmpge +61 -> 116
    //   58: aload_3
    //   59: iload 5
    //   61: invokevirtual 79	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   64: astore 11
    //   66: aload 11
    //   68: ldc 81
    //   70: aload_1
    //   71: invokevirtual 87	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   74: pop
    //   75: aload 4
    //   77: aload 11
    //   79: invokevirtual 90	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   82: pop
    //   83: iinc 5 1
    //   86: goto -37 -> 49
    //   89: astore 14
    //   91: ldc 92
    //   93: ldc 94
    //   95: invokestatic 99	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   98: pop
    //   99: aconst_null
    //   100: areturn
    //   101: astore 9
    //   103: ldc 92
    //   105: ldc 101
    //   107: aload 9
    //   109: invokestatic 104	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   112: pop
    //   113: goto -30 -> 83
    //   116: aload_0
    //   117: invokeinterface 108 1 0
    //   122: astore 6
    //   124: aload 6
    //   126: ldc 65
    //   128: invokeinterface 114 2 0
    //   133: pop
    //   134: aload 6
    //   136: invokeinterface 118 1 0
    //   141: pop
    //   142: aload 4
    //   144: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   28	37	89	org/json/JSONException
    //   58	83	101	org/json/JSONException
  }

  public static void a(Context paramContext, String paramString, Map<String, String> paramMap)
  {
    SharedPreferences.Editor localEditor;
    synchronized (k)
    {
      localEditor = paramContext.getSharedPreferences(paramString, 0).edit();
      localEditor.clear();
      Iterator localIterator = paramMap.entrySet().iterator();
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localEditor.putString((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
    localEditor.commit();
    j = true;
  }

  private void h()
  {
    this.e = new HashMap();
    try
    {
      SharedPreferences localSharedPreferences = (SharedPreferences)this.b.get();
      localSharedPreferences.unregisterOnSharedPreferenceChangeListener(this.c);
      localSharedPreferences.registerOnSharedPreferenceChangeListener(this.c);
      Iterator localIterator = localSharedPreferences.getAll().entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = (String)localEntry.getKey();
        Object localObject = localEntry.getValue();
        this.e.put(str, localObject.toString());
      }
    }
    catch (ExecutionException localExecutionException)
    {
      Log.e("MixpanelAPI PersistentProperties", "Cannot load referrer properties from shared preferences.", localExecutionException.getCause());
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("MixpanelAPI PersistentProperties", "Cannot load referrer properties from shared preferences.", localInterruptedException);
    }
  }

  private void i()
  {
    try
    {
      localSharedPreferences = (SharedPreferences)this.a.get();
      if (localSharedPreferences == null)
        return;
    }
    catch (ExecutionException localExecutionException)
    {
      while (true)
      {
        Log.e("MixpanelAPI PersistentProperties", "Cannot read distinct ids from sharedPreferences.", localExecutionException.getCause());
        localSharedPreferences = null;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      SharedPreferences localSharedPreferences;
      while (true)
      {
        Log.e("MixpanelAPI PersistentProperties", "Cannot read distinct ids from sharedPreferences.", localInterruptedException);
        localSharedPreferences = null;
      }
      this.g = localSharedPreferences.getString("events_distinct_id", null);
      this.h = localSharedPreferences.getString("people_distinct_id", null);
      this.i = null;
      str = localSharedPreferences.getString("waiting_array", null);
      if (str == null);
    }
    try
    {
      this.i = new JSONArray(str);
      if (this.g == null)
      {
        this.g = UUID.randomUUID().toString();
        j();
      }
      this.f = true;
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        String str;
        Log.e("MixpanelAPI PersistentProperties", "Could not interpret waiting people JSON record " + str);
      }
    }
  }

  private void j()
  {
    try
    {
      SharedPreferences.Editor localEditor = ((SharedPreferences)this.a.get()).edit();
      localEditor.putString("events_distinct_id", this.g);
      localEditor.putString("people_distinct_id", this.h);
      if (this.i == null)
        localEditor.remove("waiting_array");
      while (true)
      {
        localEditor.commit();
        return;
        localEditor.putString("waiting_array", this.i.toString());
      }
    }
    catch (ExecutionException localExecutionException)
    {
      Log.e("MixpanelAPI PersistentProperties", "Can't write distinct ids to shared preferences.", localExecutionException.getCause());
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("MixpanelAPI PersistentProperties", "Can't write distinct ids to shared preferences.", localInterruptedException);
    }
  }

  // ERROR //
  public final JSONObject a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   4: ifnonnull +53 -> 57
    //   7: aload_0
    //   8: new 83	org/json/JSONObject
    //   11: dup
    //   12: aload_0
    //   13: getfield 39	com/mixpanel/android/mpmetrics/r:a	Ljava/util/concurrent/Future;
    //   16: invokeinterface 177 1 0
    //   21: checkcast 59	android/content/SharedPreferences
    //   24: ldc 236
    //   26: ldc 238
    //   28: invokeinterface 63 3 0
    //   33: invokespecial 239	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   36: putfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   39: aload_0
    //   40: getfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   43: ifnonnull +14 -> 57
    //   46: aload_0
    //   47: new 83	org/json/JSONObject
    //   50: dup
    //   51: invokespecial 240	org/json/JSONObject:<init>	()V
    //   54: putfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   57: aload_0
    //   58: getfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   61: areturn
    //   62: astore 15
    //   64: ldc 92
    //   66: ldc 242
    //   68: aload 15
    //   70: invokevirtual 201	java/util/concurrent/ExecutionException:getCause	()Ljava/lang/Throwable;
    //   73: invokestatic 104	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   76: pop
    //   77: aload_0
    //   78: getfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   81: ifnonnull -24 -> 57
    //   84: aload_0
    //   85: new 83	org/json/JSONObject
    //   88: dup
    //   89: invokespecial 240	org/json/JSONObject:<init>	()V
    //   92: putfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   95: goto -38 -> 57
    //   98: astore 13
    //   100: ldc 92
    //   102: ldc 242
    //   104: aload 13
    //   106: invokestatic 104	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   109: pop
    //   110: aload_0
    //   111: getfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   114: ifnonnull -57 -> 57
    //   117: aload_0
    //   118: new 83	org/json/JSONObject
    //   121: dup
    //   122: invokespecial 240	org/json/JSONObject:<init>	()V
    //   125: putfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   128: goto -71 -> 57
    //   131: astore_2
    //   132: ldc 92
    //   134: ldc 244
    //   136: invokestatic 99	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   139: pop
    //   140: aload_0
    //   141: getfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   144: ifnonnull +32 -> 176
    //   147: ldc 92
    //   149: ldc 246
    //   151: invokestatic 99	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   154: pop
    //   155: aload_0
    //   156: getfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   159: ifnonnull -102 -> 57
    //   162: aload_0
    //   163: new 83	org/json/JSONObject
    //   166: dup
    //   167: invokespecial 240	org/json/JSONObject:<init>	()V
    //   170: putfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   173: goto -116 -> 57
    //   176: aload_0
    //   177: getfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   180: invokevirtual 247	org/json/JSONObject:toString	()Ljava/lang/String;
    //   183: astore 4
    //   185: aload_0
    //   186: getfield 39	com/mixpanel/android/mpmetrics/r:a	Ljava/util/concurrent/Future;
    //   189: invokeinterface 177 1 0
    //   194: checkcast 59	android/content/SharedPreferences
    //   197: invokeinterface 108 1 0
    //   202: astore 9
    //   204: aload 9
    //   206: ldc 236
    //   208: aload 4
    //   210: invokeinterface 163 3 0
    //   215: pop
    //   216: aload 9
    //   218: invokeinterface 118 1 0
    //   223: pop
    //   224: goto -69 -> 155
    //   227: astore 7
    //   229: ldc 92
    //   231: ldc 249
    //   233: aload 7
    //   235: invokevirtual 201	java/util/concurrent/ExecutionException:getCause	()Ljava/lang/Throwable;
    //   238: invokestatic 104	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   241: pop
    //   242: goto -87 -> 155
    //   245: astore_1
    //   246: aload_0
    //   247: getfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   250: ifnonnull +14 -> 264
    //   253: aload_0
    //   254: new 83	org/json/JSONObject
    //   257: dup
    //   258: invokespecial 240	org/json/JSONObject:<init>	()V
    //   261: putfield 41	com/mixpanel/android/mpmetrics/r:d	Lorg/json/JSONObject;
    //   264: aload_1
    //   265: athrow
    //   266: astore 5
    //   268: ldc 92
    //   270: ldc 249
    //   272: aload 5
    //   274: invokestatic 104	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   277: pop
    //   278: goto -123 -> 155
    //
    // Exception table:
    //   from	to	target	type
    //   7	39	62	java/util/concurrent/ExecutionException
    //   7	39	98	java/lang/InterruptedException
    //   7	39	131	org/json/JSONException
    //   185	224	227	java/util/concurrent/ExecutionException
    //   7	39	245	finally
    //   64	77	245	finally
    //   100	110	245	finally
    //   132	155	245	finally
    //   176	185	245	finally
    //   185	224	245	finally
    //   229	242	245	finally
    //   268	278	245	finally
    //   185	224	266	java/lang/InterruptedException
  }

  public final void a(String paramString)
  {
    if (!this.f)
      i();
    this.g = paramString;
    j();
  }

  public final void a(JSONObject paramJSONObject)
  {
    if (!this.f)
      i();
    if (this.i == null)
      this.i = new JSONArray();
    this.i.put(paramJSONObject);
    j();
  }

  public final Map<String, String> b()
  {
    synchronized (k)
    {
      if ((j) || (this.e == null))
      {
        h();
        j = false;
      }
      return this.e;
    }
  }

  public final void b(String paramString)
  {
    try
    {
      SharedPreferences.Editor localEditor = ((SharedPreferences)this.a.get()).edit();
      localEditor.putString("push_id", paramString);
      localEditor.commit();
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      Log.e("MixpanelAPI PersistentProperties", "Can't write push id to shared preferences", localExecutionException.getCause());
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("MixpanelAPI PersistentProperties", "Can't write push id to shared preferences", localInterruptedException);
    }
  }

  public final String c()
  {
    if (!this.f)
      i();
    return this.g;
  }

  public final String d()
  {
    if (!this.f)
      i();
    return this.h;
  }

  public final void e()
  {
    try
    {
      SharedPreferences.Editor localEditor = ((SharedPreferences)this.a.get()).edit();
      localEditor.remove("push_id");
      localEditor.commit();
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      Log.e("MixpanelAPI PersistentProperties", "Can't write push id to shared preferences", localExecutionException.getCause());
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("MixpanelAPI PersistentProperties", "Can't write push id to shared preferences", localInterruptedException);
    }
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
