package com.mobileapptracker;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h
{
  private static final Uri g = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
  private static final List h = Arrays.asList(new String[] { "ir", "d", "db", "dm", "ma", "ov", "cc", "l", "an", "pn", "av", "dc", "ad", "android_id_md5", "android_id_sha1", "android_id_sha256", "r", "c", "id", "ua", "tpid", "ar", "ti", "age", "gender", "latitude", "longitude", "altitude", "connection_type", "mobile_country_code", "mobile_network_code", "screen_density", "screen_layout_size", "android_purchase_status", "referral_source", "referral_url", "google_aid", "app_ad_tracking", "facebook_user_id", "google_user_id", "twitter_user_id", "attribute_sub1", "attribute_sub2", "attribute_sub3", "attribute_sub4", "attribute_sub5" });
  private static volatile h t = null;
  protected f a;
  protected g b;
  protected boolean c;
  protected BroadcastReceiver d;
  protected Context e;
  protected c f;
  private l i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private boolean p;
  private ConcurrentHashMap q;
  private a r;
  private ScheduledExecutorService s;

  protected h()
  {
  }

  private int a(String paramString1, String paramString2, double paramDouble, String paramString3, String paramString4)
  {
    try
    {
      boolean bool = this.o;
      if (!bool);
      for (i1 = -1; ; i1 = -1)
      {
        return i1;
        b();
        a("ac", "conversion");
        localDate = new Date();
        if (!e(paramString1))
          break label172;
        if (!paramString1.equals("close"))
          break;
      }
      if ((paramString1.equals("open")) || (paramString1.equals("install")) || (paramString1.equals("update")) || (paramString1.equals("session")))
      {
        a("ac", "session");
        localDate = new Date(5000L + localDate.getTime());
      }
      while (true)
      {
        str = i();
        if (str != null)
          break;
        if (!this.m)
          break label343;
        Log.d("MobileAppTracker", "Error constructing url for tracking call");
        break label343;
        a("en", paramString1);
      }
    }
    finally
    {
    }
    while (true)
    {
      Date localDate;
      String str;
      label172: a("ei", paramString1);
      continue;
      a(str, paramString2, (String)this.q.get("ac"), paramDouble, paramString3, paramString4, null, null, (String)this.q.get("attribute_sub1"), (String)this.q.get("attribute_sub2"), (String)this.q.get("attribute_sub3"), (String)this.q.get("attribute_sub4"), (String)this.q.get("attribute_sub5"), true, localDate);
      b();
      a("ei", null);
      a("en", null);
      a(0.0D);
      c("USD");
      a("ar", null);
      a(1, null);
      a(2, null);
      a(3, null);
      a(4, null);
      a(5, null);
      int i1 = 1;
      continue;
      label343: i1 = -1;
    }
  }

  public static h a()
  {
    try
    {
      h localh = t;
      return localh;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  private String a(String paramString1, double paramDouble, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    // Byte code:
    //   0: new 241	java/lang/StringBuilder
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 243	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   8: astore 11
    //   10: aload_0
    //   11: dload_2
    //   12: invokespecial 225	com/mobileapptracker/h:a	(D)V
    //   15: aload 4
    //   17: ifnull +9 -> 26
    //   20: aload_0
    //   21: aload 4
    //   23: invokespecial 230	com/mobileapptracker/h:c	(Ljava/lang/String;)V
    //   26: aload_0
    //   27: ldc 91
    //   29: aload 5
    //   31: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: aload_0
    //   35: iconst_1
    //   36: aload 6
    //   38: invokespecial 233	com/mobileapptracker/h:a	(ILjava/lang/String;)V
    //   41: aload_0
    //   42: iconst_2
    //   43: aload 7
    //   45: invokespecial 233	com/mobileapptracker/h:a	(ILjava/lang/String;)V
    //   48: aload_0
    //   49: iconst_3
    //   50: aload 8
    //   52: invokespecial 233	com/mobileapptracker/h:a	(ILjava/lang/String;)V
    //   55: aload_0
    //   56: iconst_4
    //   57: aload 9
    //   59: invokespecial 233	com/mobileapptracker/h:a	(ILjava/lang/String;)V
    //   62: aload_0
    //   63: iconst_5
    //   64: aload 10
    //   66: invokespecial 233	com/mobileapptracker/h:a	(ILjava/lang/String;)V
    //   69: aload_0
    //   70: invokespecial 245	com/mobileapptracker/h:l	()Ljava/lang/String;
    //   73: ifnull +13 -> 86
    //   76: aload_0
    //   77: invokespecial 245	com/mobileapptracker/h:l	()Ljava/lang/String;
    //   80: invokevirtual 249	java/lang/String:length	()I
    //   83: ifne +20 -> 103
    //   86: aload_0
    //   87: ldc 53
    //   89: aload_0
    //   90: getfield 251	com/mobileapptracker/h:e	Landroid/content/Context;
    //   93: ldc 253
    //   95: ldc 255
    //   97: invokestatic 258	com/mobileapptracker/h:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   100: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   103: aload_0
    //   104: invokespecial 260	com/mobileapptracker/h:k	()Ljava/lang/String;
    //   107: invokevirtual 249	java/lang/String:length	()I
    //   110: ifle +403 -> 513
    //   113: aload 11
    //   115: new 241	java/lang/StringBuilder
    //   118: dup
    //   119: ldc_w 262
    //   122: invokespecial 243	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   125: aload_0
    //   126: invokespecial 260	com/mobileapptracker/h:k	()Ljava/lang/String;
    //   129: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: aload_0
    //   140: invokespecial 271	com/mobileapptracker/h:n	()Ljava/lang/String;
    //   143: invokevirtual 249	java/lang/String:length	()I
    //   146: ifle +29 -> 175
    //   149: aload 11
    //   151: new 241	java/lang/StringBuilder
    //   154: dup
    //   155: ldc_w 273
    //   158: invokespecial 243	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   161: aload_0
    //   162: invokespecial 271	com/mobileapptracker/h:n	()Ljava/lang/String;
    //   165: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload_0
    //   176: invokespecial 275	com/mobileapptracker/h:m	()Ljava/lang/String;
    //   179: invokevirtual 249	java/lang/String:length	()I
    //   182: ifle +29 -> 211
    //   185: aload 11
    //   187: new 241	java/lang/StringBuilder
    //   190: dup
    //   191: ldc_w 277
    //   194: invokespecial 243	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   197: aload_0
    //   198: invokespecial 275	com/mobileapptracker/h:m	()Ljava/lang/String;
    //   201: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   207: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: pop
    //   211: aload_0
    //   212: getfield 251	com/mobileapptracker/h:e	Landroid/content/Context;
    //   215: invokevirtual 283	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   218: astore 33
    //   220: iconst_1
    //   221: anewarray 51	java/lang/String
    //   224: dup
    //   225: iconst_0
    //   226: ldc_w 285
    //   229: aastore
    //   230: astore 34
    //   232: aload 33
    //   234: getstatic 49	com/mobileapptracker/h:g	Landroid/net/Uri;
    //   237: aload 34
    //   239: aconst_null
    //   240: aconst_null
    //   241: aconst_null
    //   242: invokevirtual 291	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   245: astore 35
    //   247: aload 35
    //   249: ifnull +438 -> 687
    //   252: aload 35
    //   254: invokeinterface 297 1 0
    //   259: ifne +293 -> 552
    //   262: goto +425 -> 687
    //   265: aload 36
    //   267: ifnull +17 -> 284
    //   270: aload 11
    //   272: ldc_w 299
    //   275: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: aload 36
    //   280: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: pop
    //   284: aload_0
    //   285: getfield 251	com/mobileapptracker/h:e	Landroid/content/Context;
    //   288: ldc_w 301
    //   291: ldc_w 303
    //   294: invokestatic 258	com/mobileapptracker/h:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   297: astore 14
    //   299: aload 14
    //   301: invokevirtual 249	java/lang/String:length	()I
    //   304: ifeq +68 -> 372
    //   307: aload 14
    //   309: ldc_w 305
    //   312: invokestatic 311	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   315: astore 32
    //   317: aload 32
    //   319: astore 14
    //   321: aload 11
    //   323: ldc_w 313
    //   326: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: aload 14
    //   331: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: pop
    //   335: aload_0
    //   336: getfield 251	com/mobileapptracker/h:e	Landroid/content/Context;
    //   339: ldc_w 301
    //   342: iconst_0
    //   343: invokevirtual 317	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   346: invokeinterface 323 1 0
    //   351: astore 29
    //   353: aload 29
    //   355: ldc_w 303
    //   358: invokeinterface 329 2 0
    //   363: pop
    //   364: aload 29
    //   366: invokeinterface 332 1 0
    //   371: pop
    //   372: new 241	java/lang/StringBuilder
    //   375: dup
    //   376: invokespecial 333	java/lang/StringBuilder:<init>	()V
    //   379: astore 15
    //   381: getstatic 147	com/mobileapptracker/h:h	Ljava/util/List;
    //   384: invokeinterface 339 1 0
    //   389: astore 16
    //   391: aload 16
    //   393: invokeinterface 344 1 0
    //   398: ifne +203 -> 601
    //   401: new 346	java/text/SimpleDateFormat
    //   404: dup
    //   405: ldc_w 348
    //   408: getstatic 354	java/util/Locale:US	Ljava/util/Locale;
    //   411: invokespecial 357	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   414: new 166	java/util/Date
    //   417: dup
    //   418: invokespecial 167	java/util/Date:<init>	()V
    //   421: invokevirtual 361	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   424: astore 19
    //   426: aload 19
    //   428: ldc_w 305
    //   431: invokestatic 311	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   434: astore 26
    //   436: aload 26
    //   438: astore 19
    //   440: aload 15
    //   442: ldc_w 363
    //   445: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   448: aload 19
    //   450: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   453: pop
    //   454: aload_0
    //   455: getfield 365	com/mobileapptracker/h:b	Lcom/mobileapptracker/g;
    //   458: ifnull +8 -> 466
    //   461: aload_0
    //   462: getfield 365	com/mobileapptracker/h:b	Lcom/mobileapptracker/g;
    //   465: pop
    //   466: new 241	java/lang/StringBuilder
    //   469: dup
    //   470: aload_0
    //   471: getfield 367	com/mobileapptracker/h:r	Lcom/mobileapptracker/a;
    //   474: aload 15
    //   476: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   479: invokevirtual 372	com/mobileapptracker/a:a	(Ljava/lang/String;)[B
    //   482: invokestatic 375	com/mobileapptracker/a:a	([B)Ljava/lang/String;
    //   485: invokespecial 243	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   488: astore 22
    //   490: aload 11
    //   492: ldc_w 377
    //   495: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: aload 22
    //   500: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   503: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: pop
    //   507: aload 11
    //   509: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   512: areturn
    //   513: aload_0
    //   514: invokespecial 379	com/mobileapptracker/h:p	()Ljava/lang/String;
    //   517: invokevirtual 249	java/lang/String:length	()I
    //   520: ifle -381 -> 139
    //   523: aload 11
    //   525: new 241	java/lang/StringBuilder
    //   528: dup
    //   529: ldc_w 381
    //   532: invokespecial 243	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   535: aload_0
    //   536: invokespecial 379	com/mobileapptracker/h:p	()Ljava/lang/String;
    //   539: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   542: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   545: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   548: pop
    //   549: goto -410 -> 139
    //   552: aload 35
    //   554: aload 35
    //   556: ldc_w 285
    //   559: invokeinterface 385 2 0
    //   564: invokeinterface 389 2 0
    //   569: astore 36
    //   571: aload 35
    //   573: invokeinterface 391 1 0
    //   578: goto -313 -> 265
    //   581: astore 13
    //   583: aload 13
    //   585: invokevirtual 394	java/lang/Exception:printStackTrace	()V
    //   588: goto -304 -> 284
    //   591: astore 27
    //   593: aload 27
    //   595: invokevirtual 395	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   598: goto -277 -> 321
    //   601: aload 16
    //   603: invokeinterface 399 1 0
    //   608: checkcast 51	java/lang/String
    //   611: astore 17
    //   613: aload_0
    //   614: getfield 213	com/mobileapptracker/h:q	Ljava/util/concurrent/ConcurrentHashMap;
    //   617: aload 17
    //   619: invokevirtual 219	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   622: ifnull -231 -> 391
    //   625: aload 15
    //   627: ldc_w 401
    //   630: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   633: aload 17
    //   635: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   638: ldc_w 403
    //   641: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   644: aload_0
    //   645: getfield 213	com/mobileapptracker/h:q	Ljava/util/concurrent/ConcurrentHashMap;
    //   648: aload 17
    //   650: invokevirtual 219	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   653: checkcast 51	java/lang/String
    //   656: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   659: pop
    //   660: goto -269 -> 391
    //   663: astore 20
    //   665: aload 20
    //   667: invokevirtual 395	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   670: goto -230 -> 440
    //   673: astore 24
    //   675: aload 24
    //   677: invokevirtual 394	java/lang/Exception:printStackTrace	()V
    //   680: aload 15
    //   682: astore 22
    //   684: goto -194 -> 490
    //   687: aconst_null
    //   688: astore 36
    //   690: goto -425 -> 265
    //
    // Exception table:
    //   from	to	target	type
    //   211	247	581	java/lang/Exception
    //   252	262	581	java/lang/Exception
    //   270	284	581	java/lang/Exception
    //   552	578	581	java/lang/Exception
    //   307	317	591	java/io/UnsupportedEncodingException
    //   426	436	663	java/io/UnsupportedEncodingException
    //   466	490	673	java/lang/Exception
  }

  private void a(double paramDouble)
  {
    a("r", Double.toString(paramDouble));
  }

  private void a(int paramInt)
  {
    a("av", Integer.toString(paramInt));
  }

  private void a(int paramInt, String paramString)
  {
    a("attribute_sub" + paramInt, paramString);
  }

  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    h localh = new h();
    t = localh;
    localh.e = paramContext.getApplicationContext();
    localh.s = Executors.newSingleThreadScheduledExecutor();
    localh.i = new l();
    localh.r = new a(paramString2.trim(), "heF9BATUfWuISyO8");
    localh.c = false;
    localh.j = false;
    localh.m = false;
    localh.n = false;
    localh.o = false;
    localh.p = false;
    localh.k = true;
    localh.l = true;
    localh.o = localh.a(paramContext, paramString1);
    localh.f = new c(paramContext, t);
    if (localh.o)
      localh.b();
    localh.d = new j(localh);
    if (localh.c)
    {
      paramContext.getApplicationContext().unregisterReceiver(localh.d);
      localh.c = false;
    }
    IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    paramContext.getApplicationContext().registerReceiver(localh.d, localIntentFilter);
    localh.c = true;
  }

  private static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    paramContext.getSharedPreferences(paramString1, 0).edit().putString(paramString2, paramString3).commit();
  }

  private void a(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null))
      if (paramString2.equals(""))
        this.q.remove(paramString1);
    while ((paramString1 == null) || (paramString2 != null))
    {
      return;
      try
      {
        String str = URLEncoder.encode(paramString2, "UTF-8");
        paramString2 = str;
        this.q.put(paramString1, paramString2);
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
    this.q.remove(paramString1);
  }

  private void a(String paramString1, String paramString2, String paramString3, double paramDouble, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, boolean paramBoolean, Date paramDate)
  {
    ScheduledExecutorService localScheduledExecutorService = this.s;
    c localc = this.f;
    localc.getClass();
    localScheduledExecutorService.execute(new d(localc, paramString1, paramString2, paramString3, paramDouble, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9, paramString10, paramString11, paramString12, paramBoolean, paramDate));
  }

  // ERROR //
  private boolean a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: new 215	java/util/concurrent/ConcurrentHashMap
    //   4: dup
    //   5: invokespecial 520	java/util/concurrent/ConcurrentHashMap:<init>	()V
    //   8: putfield 213	com/mobileapptracker/h:q	Ljava/util/concurrent/ConcurrentHashMap;
    //   11: aload_1
    //   12: ldc_w 522
    //   15: invokevirtual 525	android/content/Context:checkCallingOrSelfPermission	(Ljava/lang/String;)I
    //   18: ifne +816 -> 834
    //   21: iconst_1
    //   22: istore_3
    //   23: aload_1
    //   24: ldc_w 527
    //   27: invokevirtual 525	android/content/Context:checkCallingOrSelfPermission	(Ljava/lang/String;)I
    //   30: ifne +809 -> 839
    //   33: iconst_1
    //   34: istore 4
    //   36: aload_0
    //   37: ldc_w 529
    //   40: aload_2
    //   41: invokevirtual 440	java/lang/String:trim	()Ljava/lang/String;
    //   44: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   47: aload_0
    //   48: ldc 159
    //   50: ldc 161
    //   52: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   55: aload_1
    //   56: invokevirtual 532	android/content/Context:getPackageName	()Ljava/lang/String;
    //   59: astore 7
    //   61: aload_0
    //   62: aload 7
    //   64: invokespecial 534	com/mobileapptracker/h:d	(Ljava/lang/String;)V
    //   67: aload_1
    //   68: invokevirtual 538	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   71: astore 8
    //   73: aload_0
    //   74: ldc 67
    //   76: aload 8
    //   78: aload 8
    //   80: aload 7
    //   82: iconst_0
    //   83: invokevirtual 544	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   86: invokevirtual 548	android/content/pm/PackageManager:getApplicationLabel	(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    //   89: invokeinterface 551 1 0
    //   94: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   97: new 166	java/util/Date
    //   100: dup
    //   101: new 553	java/io/File
    //   104: dup
    //   105: aload 8
    //   107: aload 7
    //   109: iconst_0
    //   110: invokevirtual 544	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   113: getfield 559	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   116: invokespecial 560	java/io/File:<init>	(Ljava/lang/String;)V
    //   119: invokevirtual 563	java/io/File:lastModified	()J
    //   122: invokespecial 193	java/util/Date:<init>	(J)V
    //   125: astore 27
    //   127: new 346	java/text/SimpleDateFormat
    //   130: dup
    //   131: ldc_w 348
    //   134: getstatic 354	java/util/Locale:US	Ljava/util/Locale;
    //   137: invokespecial 357	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   140: astore 28
    //   142: aload 28
    //   144: ldc_w 565
    //   147: invokestatic 571	java/util/TimeZone:getTimeZone	(Ljava/lang/String;)Ljava/util/TimeZone;
    //   150: invokevirtual 575	java/text/SimpleDateFormat:setTimeZone	(Ljava/util/TimeZone;)V
    //   153: aload_0
    //   154: ldc 85
    //   156: aload 28
    //   158: aload 27
    //   160: invokevirtual 361	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   163: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   166: aload_0
    //   167: aload 8
    //   169: aload 7
    //   171: iconst_0
    //   172: invokevirtual 579	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   175: getfield 585	android/content/pm/PackageInfo:versionCode	I
    //   178: invokespecial 587	com/mobileapptracker/h:a	(I)V
    //   181: aload_0
    //   182: ldc 58
    //   184: getstatic 592	android/os/Build:MODEL	Ljava/lang/String;
    //   187: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   190: aload_0
    //   191: ldc 56
    //   193: getstatic 595	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   196: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   199: aload_0
    //   200: ldc 62
    //   202: getstatic 600	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   205: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   208: aload_0
    //   209: ldc 111
    //   211: aload_1
    //   212: invokevirtual 604	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   215: invokevirtual 610	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   218: getfield 616	android/util/DisplayMetrics:density	F
    //   221: invokestatic 621	java/lang/Float:toString	(F)Ljava/lang/String;
    //   224: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   227: aload_1
    //   228: ldc_w 623
    //   231: invokevirtual 627	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   234: checkcast 629	android/view/WindowManager
    //   237: astore 12
    //   239: getstatic 632	android/os/Build$VERSION:SDK_INT	I
    //   242: bipush 13
    //   244: if_icmplt +480 -> 724
    //   247: new 634	android/graphics/Point
    //   250: dup
    //   251: invokespecial 635	android/graphics/Point:<init>	()V
    //   254: astore 13
    //   256: aload 12
    //   258: invokeinterface 639 1 0
    //   263: aload 13
    //   265: invokevirtual 645	android/view/Display:getSize	(Landroid/graphics/Point;)V
    //   268: aload 13
    //   270: getfield 648	android/graphics/Point:x	I
    //   273: istore 14
    //   275: aload 13
    //   277: getfield 651	android/graphics/Point:y	I
    //   280: istore 15
    //   282: aload_0
    //   283: ldc 113
    //   285: new 241	java/lang/StringBuilder
    //   288: dup
    //   289: iload 14
    //   291: invokestatic 413	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   294: invokestatic 655	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   297: invokespecial 243	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   300: ldc_w 656
    //   303: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: iload 15
    //   308: invokestatic 413	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   311: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   317: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   320: aload_1
    //   321: ldc_w 658
    //   324: invokevirtual 627	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   327: checkcast 660	android/net/ConnectivityManager
    //   330: iconst_1
    //   331: invokevirtual 664	android/net/ConnectivityManager:getNetworkInfo	(I)Landroid/net/NetworkInfo;
    //   334: invokevirtual 669	android/net/NetworkInfo:isConnected	()Z
    //   337: ifeq +414 -> 751
    //   340: aload_0
    //   341: ldc 105
    //   343: ldc_w 671
    //   346: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   349: aload_0
    //   350: ldc 65
    //   352: invokestatic 675	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   355: getstatic 354	java/util/Locale:US	Ljava/util/Locale;
    //   358: invokevirtual 679	java/util/Locale:getDisplayLanguage	(Ljava/util/Locale;)Ljava/lang/String;
    //   361: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   364: aload_1
    //   365: ldc_w 681
    //   368: invokevirtual 627	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   371: checkcast 683	android/telephony/TelephonyManager
    //   374: astore 16
    //   376: aload 16
    //   378: ifnull +439 -> 817
    //   381: aload 16
    //   383: invokevirtual 686	android/telephony/TelephonyManager:getNetworkCountryIso	()Ljava/lang/String;
    //   386: ifnull +377 -> 763
    //   389: aload_0
    //   390: ldc 64
    //   392: aload 16
    //   394: invokevirtual 686	android/telephony/TelephonyManager:getNetworkCountryIso	()Ljava/lang/String;
    //   397: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   400: aload_0
    //   401: ldc 73
    //   403: aload 16
    //   405: invokevirtual 689	android/telephony/TelephonyManager:getNetworkOperatorName	()Ljava/lang/String;
    //   408: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   411: aload 16
    //   413: invokevirtual 692	android/telephony/TelephonyManager:getNetworkOperator	()Ljava/lang/String;
    //   416: astore 17
    //   418: aload 17
    //   420: ifnull +36 -> 456
    //   423: aload 17
    //   425: iconst_0
    //   426: iconst_3
    //   427: invokevirtual 696	java/lang/String:substring	(II)Ljava/lang/String;
    //   430: astore 24
    //   432: aload 17
    //   434: iconst_3
    //   435: invokevirtual 698	java/lang/String:substring	(I)Ljava/lang/String;
    //   438: astore 25
    //   440: aload_0
    //   441: ldc 107
    //   443: aload 24
    //   445: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   448: aload_0
    //   449: ldc 109
    //   451: aload 25
    //   453: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   456: new 700	android/os/Handler
    //   459: dup
    //   460: invokestatic 706	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   463: invokespecial 709	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   466: new 711	com/mobileapptracker/k
    //   469: dup
    //   470: aload_0
    //   471: aload_1
    //   472: invokespecial 714	com/mobileapptracker/k:<init>	(Lcom/mobileapptracker/h;Landroid/content/Context;)V
    //   475: invokevirtual 718	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   478: pop
    //   479: aload_0
    //   480: ldc 123
    //   482: iconst_1
    //   483: invokestatic 413	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   486: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   489: aload_0
    //   490: ldc 227
    //   492: invokespecial 230	com/mobileapptracker/h:c	(Ljava/lang/String;)V
    //   495: aload_1
    //   496: ldc_w 720
    //   499: ldc_w 720
    //   502: invokestatic 258	com/mobileapptracker/h:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   505: astore 19
    //   507: aload 19
    //   509: invokevirtual 249	java/lang/String:length	()I
    //   512: ifne +23 -> 535
    //   515: invokestatic 726	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   518: invokevirtual 727	java/util/UUID:toString	()Ljava/lang/String;
    //   521: astore 19
    //   523: aload_1
    //   524: ldc_w 720
    //   527: ldc_w 720
    //   530: aload 19
    //   532: invokestatic 729	com/mobileapptracker/h:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   535: aload_0
    //   536: ldc_w 731
    //   539: aload 19
    //   541: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   544: aload_0
    //   545: ldc 75
    //   547: aload_1
    //   548: invokevirtual 283	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   551: ldc_w 733
    //   554: invokestatic 738	android/provider/Settings$Secure:getString	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   557: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   560: aload_0
    //   561: getfield 454	com/mobileapptracker/h:k	Z
    //   564: ifeq +26 -> 590
    //   567: iload_3
    //   568: ifeq +22 -> 590
    //   571: aload_0
    //   572: ldc 54
    //   574: aload_1
    //   575: ldc_w 681
    //   578: invokevirtual 627	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   581: checkcast 683	android/telephony/TelephonyManager
    //   584: invokevirtual 741	android/telephony/TelephonyManager:getDeviceId	()Ljava/lang/String;
    //   587: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   590: aload_0
    //   591: getfield 456	com/mobileapptracker/h:l	Z
    //   594: ifeq +238 -> 832
    //   597: iload 4
    //   599: ifeq +233 -> 832
    //   602: aload_1
    //   603: ldc_w 743
    //   606: invokevirtual 627	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   609: checkcast 745	android/net/wifi/WifiManager
    //   612: astore 20
    //   614: aload 20
    //   616: ifnull +216 -> 832
    //   619: aload 20
    //   621: invokevirtual 749	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   624: astore 21
    //   626: aload 21
    //   628: ifnull +204 -> 832
    //   631: aload 21
    //   633: invokevirtual 754	android/net/wifi/WifiInfo:getMacAddress	()Ljava/lang/String;
    //   636: ifnull +196 -> 832
    //   639: aload_0
    //   640: ldc 60
    //   642: aload 21
    //   644: invokevirtual 754	android/net/wifi/WifiInfo:getMacAddress	()Ljava/lang/String;
    //   647: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   650: iconst_1
    //   651: ireturn
    //   652: astore 9
    //   654: aload_0
    //   655: getfield 198	com/mobileapptracker/h:m	Z
    //   658: ifeq -492 -> 166
    //   661: ldc 200
    //   663: ldc_w 756
    //   666: invokestatic 207	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   669: pop
    //   670: goto -504 -> 166
    //   673: astore 5
    //   675: aload_0
    //   676: getfield 198	com/mobileapptracker/h:m	Z
    //   679: ifeq +17 -> 696
    //   682: ldc 200
    //   684: ldc_w 758
    //   687: invokestatic 207	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   690: pop
    //   691: aload 5
    //   693: invokevirtual 394	java/lang/Exception:printStackTrace	()V
    //   696: iconst_0
    //   697: ireturn
    //   698: astore 11
    //   700: aload_0
    //   701: getfield 198	com/mobileapptracker/h:m	Z
    //   704: ifeq +12 -> 716
    //   707: ldc 200
    //   709: ldc_w 760
    //   712: invokestatic 207	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   715: pop
    //   716: aload_0
    //   717: iconst_0
    //   718: invokespecial 587	com/mobileapptracker/h:a	(I)V
    //   721: goto -540 -> 181
    //   724: aload 12
    //   726: invokeinterface 639 1 0
    //   731: invokevirtual 763	android/view/Display:getWidth	()I
    //   734: istore 14
    //   736: aload 12
    //   738: invokeinterface 639 1 0
    //   743: invokevirtual 766	android/view/Display:getHeight	()I
    //   746: istore 15
    //   748: goto -466 -> 282
    //   751: aload_0
    //   752: ldc 105
    //   754: ldc_w 768
    //   757: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   760: goto -411 -> 349
    //   763: aload_0
    //   764: getfield 454	com/mobileapptracker/h:k	Z
    //   767: ifeq -367 -> 400
    //   770: iload_3
    //   771: ifeq -371 -> 400
    //   774: aload 16
    //   776: invokevirtual 771	android/telephony/TelephonyManager:getSimCountryIso	()Ljava/lang/String;
    //   779: ifnull -379 -> 400
    //   782: aload_0
    //   783: ldc 64
    //   785: aload 16
    //   787: invokevirtual 771	android/telephony/TelephonyManager:getSimCountryIso	()Ljava/lang/String;
    //   790: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   793: goto -393 -> 400
    //   796: astore 22
    //   798: aload_0
    //   799: getfield 198	com/mobileapptracker/h:m	Z
    //   802: ifeq -346 -> 456
    //   805: ldc 200
    //   807: ldc_w 773
    //   810: invokestatic 207	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   813: pop
    //   814: goto -358 -> 456
    //   817: aload_0
    //   818: ldc 64
    //   820: invokestatic 675	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   823: invokevirtual 776	java/util/Locale:getCountry	()Ljava/lang/String;
    //   826: invokespecial 164	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   829: goto -373 -> 456
    //   832: iconst_1
    //   833: ireturn
    //   834: iconst_0
    //   835: istore_3
    //   836: goto -813 -> 23
    //   839: iconst_0
    //   840: istore 4
    //   842: goto -806 -> 36
    //
    // Exception table:
    //   from	to	target	type
    //   73	166	652	android/content/pm/PackageManager$NameNotFoundException
    //   36	73	673	java/lang/Exception
    //   73	166	673	java/lang/Exception
    //   166	181	673	java/lang/Exception
    //   181	282	673	java/lang/Exception
    //   282	349	673	java/lang/Exception
    //   349	376	673	java/lang/Exception
    //   381	400	673	java/lang/Exception
    //   400	418	673	java/lang/Exception
    //   423	456	673	java/lang/Exception
    //   456	535	673	java/lang/Exception
    //   535	567	673	java/lang/Exception
    //   571	590	673	java/lang/Exception
    //   590	597	673	java/lang/Exception
    //   602	614	673	java/lang/Exception
    //   619	626	673	java/lang/Exception
    //   631	650	673	java/lang/Exception
    //   654	670	673	java/lang/Exception
    //   700	716	673	java/lang/Exception
    //   716	721	673	java/lang/Exception
    //   724	748	673	java/lang/Exception
    //   751	760	673	java/lang/Exception
    //   763	770	673	java/lang/Exception
    //   774	793	673	java/lang/Exception
    //   798	814	673	java/lang/Exception
    //   817	829	673	java/lang/Exception
    //   166	181	698	android/content/pm/PackageManager$NameNotFoundException
    //   423	456	796	java/lang/IndexOutOfBoundsException
  }

  private static String b(Context paramContext, String paramString1, String paramString2)
  {
    return paramContext.getSharedPreferences(paramString1, 0).getString(paramString2, "");
  }

  private void c(String paramString)
  {
    while ((paramString == null) || (paramString.equals("")))
      paramString = "USD";
    a("c", paramString);
  }

  private void d(String paramString)
  {
    while ((paramString == null) || (paramString.equals("")))
      paramString = this.e.getPackageName();
    a("pn", paramString);
  }

  private static boolean e(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    int i1 = arrayOfChar.length;
    for (int i2 = 0; ; i2++)
    {
      if (i2 >= i1)
        return false;
      if (Character.isLetter(arrayOfChar[i2]))
        return true;
    }
  }

  private String i()
  {
    localStringBuilder = new StringBuilder("https://").append(e()).append(".");
    if (this.m)
    {
      localStringBuilder.append("debug.engine.mobileapptracking.com");
      while (true)
      {
        localStringBuilder.append("/serve?s=android&ver=3.0");
        String str1 = (String)this.q.get("sdk_plugin");
        if (str1 != null)
          localStringBuilder.append("&sdk_plugin=").append(str1);
        localStringBuilder.append("&pn=").append(o());
        localIterator = this.q.keySet().iterator();
        label109: if (!localIterator.hasNext())
        {
          if (this.j)
            localStringBuilder.append("&skip_dup=1");
          if (this.m)
            localStringBuilder.append("&debug=1");
          if (this.p)
            localStringBuilder.append("&post_conversion=1");
          if (this.n)
            localStringBuilder.append("&existing_user=1");
          try
          {
            Uri localUri = Uri.parse("content://" + o() + "/referrer_apps");
            localCursor = this.e.getContentResolver().query(localUri, null, null, null, "publisher_package_name desc");
            if ((localCursor != null) && (localCursor.moveToFirst()))
            {
              str3 = localCursor.getString(localCursor.getColumnIndex("tracking_id"));
              try
              {
                String str5 = URLEncoder.encode(str3, "UTF-8");
                str4 = str5;
                this.q.put("ti", str4);
                localCursor.close();
                return localStringBuilder.toString();
                localStringBuilder.append("engine.mobileapptracking.com");
                continue;
                String str2 = (String)localIterator.next();
                if (h.contains(str2))
                  break label109;
                localStringBuilder.append("&").append(str2).append("=").append((String)this.q.get(str2));
              }
              catch (UnsupportedEncodingException localUnsupportedEncodingException)
              {
                while (true)
                {
                  localUnsupportedEncodingException.printStackTrace();
                  String str4 = str3;
                }
              }
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              Cursor localCursor;
              String str3;
              if (this.m)
              {
                Log.d("MobileAppTracker", "Error reading app-to-app values");
                localException.printStackTrace();
              }
            }
          }
        }
      }
    }
  }

  private String j()
  {
    return (String)this.q.get("c");
  }

  private String k()
  {
    return b(this.e, "mat_log_id_install", "logId");
  }

  private String l()
  {
    return (String)this.q.get("ir");
  }

  private String m()
  {
    return b(this.e, "mat_log_id_last_open", "logId");
  }

  private String n()
  {
    return b(this.e, "mat_log_id_open", "logId");
  }

  private String o()
  {
    return (String)this.q.get("pn");
  }

  private String p()
  {
    return b(this.e, "mat_log_id_update", "logId");
  }

  public final int a(String paramString, b paramb)
  {
    JSONArray localJSONArray = new JSONArray();
    HashMap localHashMap = new HashMap();
    if (paramb.a != null)
      localHashMap.put("item", paramb.a);
    localHashMap.put("quantity", Integer.toString(paramb.b));
    localHashMap.put("unit_price", Double.toString(paramb.c));
    localHashMap.put("revenue", Double.toString(paramb.d));
    if (paramb.e != null)
      localHashMap.put("attribute_sub1", paramb.e);
    if (paramb.f != null)
      localHashMap.put("attribute_sub2", paramb.f);
    if (paramb.g != null)
      localHashMap.put("attribute_sub3", paramb.g);
    if (paramb.h != null)
      localHashMap.put("attribute_sub4", paramb.h);
    if (paramb.i != null)
      localHashMap.put("attribute_sub5", paramb.i);
    localJSONArray.put(new JSONObject(localHashMap));
    return a(paramString, localJSONArray.toString(), 0.0D, j(), null);
  }

  public final void a(String paramString)
  {
    a("si", paramString);
  }

  // ERROR //
  protected final void a(String paramString1, String paramString2, String paramString3, double paramDouble, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, boolean paramBoolean)
  {
    // Byte code:
    //   0: iload 15
    //   2: ifeq +630 -> 632
    //   5: aload_0
    //   6: aload_1
    //   7: dload 4
    //   9: aload 6
    //   11: aload 7
    //   13: aload 10
    //   15: aload 11
    //   17: aload 12
    //   19: aload 13
    //   21: aload 14
    //   23: invokespecial 904	com/mobileapptracker/h:a	(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   26: astore 16
    //   28: new 886	org/json/JSONObject
    //   31: dup
    //   32: invokespecial 905	org/json/JSONObject:<init>	()V
    //   35: astore 17
    //   37: aload_2
    //   38: ifnull +20 -> 58
    //   41: aload 17
    //   43: ldc_w 907
    //   46: new 850	org/json/JSONArray
    //   49: dup
    //   50: aload_2
    //   51: invokespecial 908	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   54: invokevirtual 911	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   57: pop
    //   58: aload 8
    //   60: ifnull +14 -> 74
    //   63: aload 17
    //   65: ldc_w 913
    //   68: aload 8
    //   70: invokevirtual 911	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   73: pop
    //   74: aload 9
    //   76: ifnull +14 -> 90
    //   79: aload 17
    //   81: ldc_w 915
    //   84: aload 9
    //   86: invokevirtual 911	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   89: pop
    //   90: aload_0
    //   91: getfield 365	com/mobileapptracker/h:b	Lcom/mobileapptracker/g;
    //   94: ifnull +8 -> 102
    //   97: aload_0
    //   98: getfield 365	com/mobileapptracker/h:b	Lcom/mobileapptracker/g;
    //   101: pop
    //   102: aload_0
    //   103: getfield 198	com/mobileapptracker/h:m	Z
    //   106: ifeq +32 -> 138
    //   109: ldc 200
    //   111: new 241	java/lang/StringBuilder
    //   114: dup
    //   115: ldc_w 917
    //   118: invokespecial 243	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   121: aload_3
    //   122: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: ldc_w 919
    //   128: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: invokestatic 207	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   137: pop
    //   138: aload_0
    //   139: getfield 437	com/mobileapptracker/h:i	Lcom/mobileapptracker/l;
    //   142: aload 16
    //   144: aload 17
    //   146: invokevirtual 922	com/mobileapptracker/l:a	(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    //   149: astore 19
    //   151: aload 19
    //   153: ifnonnull +30 -> 183
    //   156: return
    //   157: astore 18
    //   159: aload_0
    //   160: getfield 198	com/mobileapptracker/h:m	Z
    //   163: ifeq +12 -> 175
    //   166: ldc 200
    //   168: ldc_w 924
    //   171: invokestatic 207	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   174: pop
    //   175: aload 18
    //   177: invokevirtual 925	org/json/JSONException:printStackTrace	()V
    //   180: goto -90 -> 90
    //   183: aload 19
    //   185: ldc_w 927
    //   188: invokevirtual 930	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   191: ifnonnull +64 -> 255
    //   194: aload_0
    //   195: aload 16
    //   197: aload_2
    //   198: aload_3
    //   199: dload 4
    //   201: aload 6
    //   203: aload 7
    //   205: aload 8
    //   207: aload 9
    //   209: aload 10
    //   211: aload 11
    //   213: aload 12
    //   215: aload 13
    //   217: aload 14
    //   219: iconst_0
    //   220: new 166	java/util/Date
    //   223: dup
    //   224: invokespecial 167	java/util/Date:<init>	()V
    //   227: invokespecial 222	com/mobileapptracker/h:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;)V
    //   230: aload_0
    //   231: getfield 198	com/mobileapptracker/h:m	Z
    //   234: ifeq -78 -> 156
    //   237: ldc 200
    //   239: ldc_w 932
    //   242: invokestatic 207	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   245: pop
    //   246: return
    //   247: astore 20
    //   249: aload 20
    //   251: invokevirtual 925	org/json/JSONException:printStackTrace	()V
    //   254: return
    //   255: aload_0
    //   256: getfield 934	com/mobileapptracker/h:a	Lcom/mobileapptracker/f;
    //   259: ifnull +25 -> 284
    //   262: aload 19
    //   264: ldc_w 927
    //   267: invokevirtual 930	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   270: ldc_w 936
    //   273: invokevirtual 176	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   276: ifeq +250 -> 526
    //   279: aload_0
    //   280: getfield 934	com/mobileapptracker/h:a	Lcom/mobileapptracker/f;
    //   283: pop
    //   284: aload 19
    //   286: ldc_w 938
    //   289: invokevirtual 930	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   292: ldc 178
    //   294: invokevirtual 176	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   297: ifeq +50 -> 347
    //   300: aload 19
    //   302: ldc_w 940
    //   305: invokevirtual 930	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   308: astore 33
    //   310: aload_0
    //   311: invokespecial 271	com/mobileapptracker/h:n	()Ljava/lang/String;
    //   314: ifnonnull +18 -> 332
    //   317: aload_0
    //   318: getfield 251	com/mobileapptracker/h:e	Landroid/content/Context;
    //   321: ldc_w 845
    //   324: ldc_w 841
    //   327: aload 33
    //   329: invokestatic 729	com/mobileapptracker/h:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   332: aload_0
    //   333: getfield 251	com/mobileapptracker/h:e	Landroid/content/Context;
    //   336: ldc_w 843
    //   339: ldc_w 841
    //   342: aload 33
    //   344: invokestatic 729	com/mobileapptracker/h:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   347: aload_0
    //   348: getfield 198	com/mobileapptracker/h:m	Z
    //   351: ifeq -195 -> 156
    //   354: ldc 200
    //   356: new 241	java/lang/StringBuilder
    //   359: dup
    //   360: ldc_w 942
    //   363: invokespecial 243	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   366: aload 19
    //   368: invokevirtual 943	org/json/JSONObject:toString	()Ljava/lang/String;
    //   371: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   377: invokestatic 207	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   380: pop
    //   381: aload 19
    //   383: invokevirtual 944	org/json/JSONObject:length	()I
    //   386: ifle -230 -> 156
    //   389: aload 19
    //   391: ldc_w 946
    //   394: invokevirtual 949	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   397: ifeq +157 -> 554
    //   400: aload 19
    //   402: ldc_w 946
    //   405: invokevirtual 930	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   408: ldc_w 951
    //   411: invokevirtual 176	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   414: ifne +140 -> 554
    //   417: aload 19
    //   419: ldc_w 946
    //   422: invokevirtual 955	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   425: astore 28
    //   427: aload 28
    //   429: ldc 161
    //   431: invokevirtual 949	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   434: ifeq -278 -> 156
    //   437: aload 28
    //   439: ldc 161
    //   441: invokevirtual 955	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   444: astore 29
    //   446: aload 29
    //   448: ldc_w 957
    //   451: invokevirtual 949	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   454: ifeq -298 -> 156
    //   457: aload 29
    //   459: ldc_w 957
    //   462: invokevirtual 930	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   465: ldc_w 959
    //   468: invokevirtual 176	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   471: ifeq +73 -> 544
    //   474: aload 29
    //   476: ldc_w 961
    //   479: invokevirtual 930	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   482: astore 31
    //   484: ldc 200
    //   486: new 241	java/lang/StringBuilder
    //   489: dup
    //   490: ldc_w 963
    //   493: invokespecial 243	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   496: aload 31
    //   498: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   504: invokestatic 207	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   507: pop
    //   508: return
    //   509: astore 23
    //   511: ldc 200
    //   513: ldc_w 965
    //   516: invokestatic 207	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   519: pop
    //   520: aload 23
    //   522: invokevirtual 925	org/json/JSONException:printStackTrace	()V
    //   525: return
    //   526: aload_0
    //   527: getfield 934	com/mobileapptracker/h:a	Lcom/mobileapptracker/f;
    //   530: pop
    //   531: goto -247 -> 284
    //   534: astore 34
    //   536: aload 34
    //   538: invokevirtual 925	org/json/JSONException:printStackTrace	()V
    //   541: goto -257 -> 284
    //   544: ldc 200
    //   546: ldc_w 967
    //   549: invokestatic 207	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   552: pop
    //   553: return
    //   554: aload 19
    //   556: ldc_w 969
    //   559: invokevirtual 949	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   562: ifeq -406 -> 156
    //   565: aload 19
    //   567: ldc_w 969
    //   570: invokevirtual 955	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   573: astore 25
    //   575: aload 25
    //   577: ldc_w 971
    //   580: invokevirtual 949	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   583: ifeq -427 -> 156
    //   586: aload 25
    //   588: ldc_w 971
    //   591: invokevirtual 930	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   594: astore 26
    //   596: ldc 200
    //   598: new 241	java/lang/StringBuilder
    //   601: dup
    //   602: ldc_w 973
    //   605: invokespecial 243	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   608: aload 26
    //   610: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   613: ldc_w 975
    //   616: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   619: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   622: invokestatic 207	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   625: pop
    //   626: return
    //   627: astore 21
    //   629: goto -282 -> 347
    //   632: aload_1
    //   633: astore 16
    //   635: goto -607 -> 28
    //
    // Exception table:
    //   from	to	target	type
    //   41	58	157	org/json/JSONException
    //   63	74	157	org/json/JSONException
    //   79	90	157	org/json/JSONException
    //   183	246	247	org/json/JSONException
    //   389	508	509	org/json/JSONException
    //   544	553	509	org/json/JSONException
    //   554	626	509	org/json/JSONException
    //   262	284	534	org/json/JSONException
    //   526	531	534	org/json/JSONException
    //   284	332	627	org/json/JSONException
    //   332	347	627	org/json/JSONException
  }

  public final void a(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }

  protected final void b()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)this.e.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo != null) && (localNetworkInfo.isConnected()));
    for (int i1 = 1; i1 == 0; i1 = 0)
      return;
    ScheduledExecutorService localScheduledExecutorService = this.s;
    c localc = this.f;
    localc.getClass();
    localScheduledExecutorService.execute(new e(localc));
  }

  public final void b(String paramString)
  {
    a("ui", paramString);
  }

  public final int c()
  {
    if (this.q.get("r") == null);
    for (Double localDouble = Double.valueOf(0.0D); ; localDouble = Double.valueOf(Double.parseDouble((String)this.q.get("r"))))
      return a("session", null, localDouble.doubleValue(), j(), (String)this.q.get("ar"));
  }

  final void d()
  {
    this.p = true;
    a("session", null, 0.0D, null, null);
    this.p = false;
  }

  public final String e()
  {
    return (String)this.q.get("adv");
  }

  public final String f()
  {
    return (String)this.q.get("si");
  }

  public final String g()
  {
    return (String)this.q.get("ui");
  }

  public final void h()
  {
    this.m = false;
  }
}

/* Location:
 * Qualified Name:     com.mobileapptracker.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
