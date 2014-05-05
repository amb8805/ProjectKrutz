package com.twitter.android.service;

import ac;
import ad;
import ai;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.util.Log;
import aq;
import bu;
import cl;
import com.twitter.android.platform.d;
import com.twitter.android.provider.ak;
import do;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import n;
import n;;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.json.JSONException;

public class ScribeService extends IntentService
{
  private static final boolean a = Log.isLoggable("ScribeService", 3);
  private static String b = "log_interval";
  private static String c = "log_enabled";
  private static String d = "log_last_flush_request";
  private static final String[] e = { "log" };
  private static final byte[] f = { 108, 111, 103, 91, 93, 61, 91 };
  private static final byte[] g = { 44 };
  private static final byte[] h = { 93 };
  private static final HashMap i;
  private SingleClientConnManager j;
  private HttpClient k;

  static
  {
    HashMap localHashMap = new HashMap();
    i = localHashMap;
    localHashMap.put("LOG", Integer.valueOf(1));
    i.put("FLUSH", Integer.valueOf(2));
    i.put("RAW", Integer.valueOf(3));
  }

  public ScribeService()
  {
    super("ScribeService");
  }

  public static void a(Context paramContext)
  {
    if (b(paramContext))
      paramContext.startService(new Intent(paramContext, ScribeService.class).setAction("FLUSH"));
  }

  public static void a(Context paramContext, long paramLong, n paramn)
  {
    if (b(paramContext))
    {
      String str = paramn.d().getURI().getPath();
      for (aq localaq : paramn.c())
        if (localaq.a != 200)
        {
          g localg = new g(paramLong, j.p, null);
          localg.f = str;
          localg.e = localaq.a;
          localg.d = localaq.c;
          b(paramContext, localg);
        }
    }
  }

  public static void a(Context paramContext, g paramg)
  {
    if (b(paramContext))
      b(paramContext, paramg);
  }

  public static void a(Context paramContext, ArrayList paramArrayList)
  {
    if (b(paramContext))
      paramContext.startService(new Intent(paramContext, ScribeService.class).setAction("LOG").putExtra("logs", paramArrayList));
  }

  public static void a(Context paramContext, boolean paramBoolean, long paramLong)
  {
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putBoolean(c, paramBoolean).putLong(b, paramLong).commit();
  }

  public static void a(Context paramContext, byte[] paramArrayOfByte)
  {
    paramContext.startService(new Intent(paramContext, ScribeService.class).setAction("RAW").putExtra("raw", paramArrayOfByte));
  }

  private void a(byte[] paramArrayOfByte, long paramLong)
  {
    if (paramArrayOfByte != null)
    {
      ak.a(this, paramLong).a(paramArrayOfByte);
      Context localContext = getApplicationContext();
      SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(localContext);
      long l1 = localSharedPreferences.getLong(b, 60000L);
      long l2 = localSharedPreferences.getLong(d, 0L);
      long l3 = System.currentTimeMillis();
      if (l3 - l1 > l2)
      {
        localSharedPreferences.edit().putLong(d, l3).commit();
        new Handler(getMainLooper()).postDelayed(new f(this, localContext), l1);
      }
    }
  }

  private void a(byte[] paramArrayOfByte, ac paramac)
  {
    HttpPost localHttpPost;
    if (paramArrayOfByte != null)
    {
      localHttpPost = new HttpPost("https://scribe.twitter.com/scribe");
      ByteArrayEntity localByteArrayEntity = new ByteArrayEntity(paramArrayOfByte);
      localByteArrayEntity.setContentType("application/x-www-form-urlencoded");
      localHttpPost.setEntity(localByteArrayEntity);
      if (paramac == null)
        break label80;
    }
    label80: for (Object localObject = new bu(this.k, localHttpPost, new cl(paramac), null); ; localObject = new n(this.k, localHttpPost, null))
    {
      ai.a(this).a((n)localObject);
      ((n)localObject).a();
      return;
    }
  }

  private byte[] a(long paramLong)
  {
    localak = ak.a(this, paramLong);
    localCursor = localak.getReadableDatabase().query("scribe", e, null, null, null, null, null);
    if (localCursor != null)
      try
      {
        if (localCursor.getCount() > 0)
        {
          localByteArrayOutputStream = new ByteArrayOutputStream();
          localByteArrayOutputStream.write(f);
          localCursor.moveToNext();
          localByteArrayOutputStream.write(localCursor.getBlob(0));
          while (localCursor.moveToNext())
          {
            localByteArrayOutputStream.write(g);
            localByteArrayOutputStream.write(localCursor.getBlob(0));
          }
        }
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          ByteArrayOutputStream localByteArrayOutputStream;
          return null;
          localByteArrayOutputStream.write(h);
          if (a)
            Log.d("ScribeService", "Starting request (" + localByteArrayOutputStream.size() + " bytes)");
          byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
          return arrayOfByte;
          localak.e();
          localCursor.close();
        }
      }
      finally
      {
        localak.e();
        localCursor.close();
      }
  }

  // ERROR //
  private static byte[] a(g paramg)
  {
    // Byte code:
    //   0: getstatic 34	com/twitter/android/service/ScribeService:a	Z
    //   3: ifeq +13 -> 16
    //   6: ldc 26
    //   8: aload_0
    //   9: invokevirtual 355	com/twitter/android/service/g:toString	()Ljava/lang/String;
    //   12: invokestatic 349	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   15: pop
    //   16: new 310	java/io/ByteArrayOutputStream
    //   19: dup
    //   20: invokespecial 311	java/io/ByteArrayOutputStream:<init>	()V
    //   23: astore_1
    //   24: new 357	java/io/OutputStreamWriter
    //   27: dup
    //   28: aload_1
    //   29: invokespecial 360	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
    //   32: astore_2
    //   33: getstatic 365	do:a	Lef;
    //   36: aload_2
    //   37: invokevirtual 370	ef:a	(Ljava/io/Writer;)Law;
    //   40: astore 8
    //   42: aload 8
    //   44: astore 7
    //   46: aload 7
    //   48: invokevirtual 374	aw:c	()V
    //   51: aload 7
    //   53: ldc_w 376
    //   56: ldc_w 378
    //   59: invokevirtual 381	aw:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   62: aload_0
    //   63: getfield 383	com/twitter/android/service/g:c	Lcom/twitter/android/service/j;
    //   66: ifnull +18 -> 84
    //   69: aload 7
    //   71: ldc_w 385
    //   74: aload_0
    //   75: getfield 383	com/twitter/android/service/g:c	Lcom/twitter/android/service/j;
    //   78: invokevirtual 386	com/twitter/android/service/j:toString	()Ljava/lang/String;
    //   81: invokevirtual 381	aw:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   84: aload 7
    //   86: ldc_w 388
    //   89: aload_0
    //   90: getfield 390	com/twitter/android/service/g:a	Lcom/twitter/android/service/j;
    //   93: invokevirtual 386	com/twitter/android/service/j:toString	()Ljava/lang/String;
    //   96: invokevirtual 381	aw:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   99: aload 7
    //   101: ldc_w 392
    //   104: aload_0
    //   105: getfield 394	com/twitter/android/service/g:b	J
    //   108: invokevirtual 397	aw:a	(Ljava/lang/String;J)V
    //   111: aload_0
    //   112: getfield 390	com/twitter/android/service/g:a	Lcom/twitter/android/service/j;
    //   115: getstatic 143	com/twitter/android/service/j:p	Lcom/twitter/android/service/j;
    //   118: if_acmpne +27 -> 145
    //   121: aload 7
    //   123: ldc_w 399
    //   126: aload_0
    //   127: getfield 155	com/twitter/android/service/g:d	J
    //   130: invokevirtual 397	aw:a	(Ljava/lang/String;J)V
    //   133: aload 7
    //   135: ldc_w 401
    //   138: aload_0
    //   139: getfield 150	com/twitter/android/service/g:e	I
    //   142: invokevirtual 404	aw:a	(Ljava/lang/String;I)V
    //   145: aload_0
    //   146: getfield 148	com/twitter/android/service/g:f	Ljava/lang/String;
    //   149: ifnull +15 -> 164
    //   152: aload 7
    //   154: ldc_w 406
    //   157: aload_0
    //   158: getfield 148	com/twitter/android/service/g:f	Ljava/lang/String;
    //   161: invokevirtual 381	aw:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   164: aload_0
    //   165: getfield 408	com/twitter/android/service/g:h	Ljava/lang/String;
    //   168: ifnull +15 -> 183
    //   171: aload 7
    //   173: ldc_w 409
    //   176: aload_0
    //   177: getfield 408	com/twitter/android/service/g:h	Ljava/lang/String;
    //   180: invokevirtual 381	aw:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   183: aload 7
    //   185: invokevirtual 411	aw:d	()V
    //   188: aload 7
    //   190: invokevirtual 412	aw:e	()V
    //   193: aload_1
    //   194: invokevirtual 353	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   197: astore 10
    //   199: aload 7
    //   201: invokestatic 417	cr:a	(Ljava/io/Closeable;)V
    //   204: aload_2
    //   205: invokestatic 417	cr:a	(Ljava/io/Closeable;)V
    //   208: aload 10
    //   210: areturn
    //   211: astore 11
    //   213: aconst_null
    //   214: astore 4
    //   216: aconst_null
    //   217: astore 5
    //   219: aload 5
    //   221: invokestatic 417	cr:a	(Ljava/io/Closeable;)V
    //   224: aload 4
    //   226: invokestatic 417	cr:a	(Ljava/io/Closeable;)V
    //   229: aconst_null
    //   230: areturn
    //   231: astore 6
    //   233: aconst_null
    //   234: astore_2
    //   235: aconst_null
    //   236: astore 7
    //   238: aload 7
    //   240: invokestatic 417	cr:a	(Ljava/io/Closeable;)V
    //   243: aload_2
    //   244: invokestatic 417	cr:a	(Ljava/io/Closeable;)V
    //   247: aload 6
    //   249: athrow
    //   250: astore 6
    //   252: aconst_null
    //   253: astore 7
    //   255: goto -17 -> 238
    //   258: astore 6
    //   260: goto -22 -> 238
    //   263: astore_3
    //   264: aload_2
    //   265: astore 4
    //   267: aconst_null
    //   268: astore 5
    //   270: goto -51 -> 219
    //   273: astore 9
    //   275: aload_2
    //   276: astore 4
    //   278: aload 7
    //   280: astore 5
    //   282: goto -63 -> 219
    //
    // Exception table:
    //   from	to	target	type
    //   16	33	211	java/io/IOException
    //   16	33	231	finally
    //   33	42	250	finally
    //   46	84	258	finally
    //   84	145	258	finally
    //   145	164	258	finally
    //   164	183	258	finally
    //   183	199	258	finally
    //   33	42	263	java/io/IOException
    //   46	84	273	java/io/IOException
    //   84	145	273	java/io/IOException
    //   145	164	273	java/io/IOException
    //   164	183	273	java/io/IOException
    //   183	199	273	java/io/IOException
  }

  private static void b(Context paramContext, g paramg)
  {
    paramContext.startService(new Intent(paramContext, ScribeService.class).setAction("LOG").putExtra("log", paramg));
  }

  private static boolean b(Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean(c, false);
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    this.j = new SingleClientConnManager(n.b, n.a);
    this.k = n.a(this.j);
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.j.shutdown();
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    m = 0;
    String str1 = paramIntent.getAction();
    Integer localInteger = (Integer)i.get(str1);
    int n;
    if (localInteger == null)
      n = 0;
    switch (n)
    {
    default:
    case 1:
      ArrayList localArrayList;
      do
      {
        return;
        n = localInteger.intValue();
        break;
        g localg1 = (g)paramIntent.getSerializableExtra("log");
        if (localg1 != null)
        {
          a(a(localg1), localg1.g);
          return;
        }
        localArrayList = (ArrayList)paramIntent.getSerializableExtra("logs");
      }
      while (localArrayList == null);
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        g localg2 = (g)localIterator.next();
        if (localg2 != null)
          a(a(localg2), localg2.g);
      }
    case 3:
      a(paramIntent.getByteArrayExtra("raw"), 0L);
      return;
    case 2:
    }
    localAccountManager = AccountManager.get(this);
    Account[] arrayOfAccount = localAccountManager.getAccountsByType("com.twitter.android.auth.login");
    int i1 = arrayOfAccount.length;
    while (true)
      if (m < i1)
      {
        localAccount = arrayOfAccount[m];
        String str2 = localAccountManager.getUserData(localAccount, "account_user_info");
        if (str2 != null)
          try
          {
            ad localad = do.c(str2);
            a(a(localad.a), d.a(localAccountManager, localAccount));
            m++;
            continue;
            a(a(0L), null);
            return;
          }
          catch (JSONException localJSONException)
          {
            break label254;
          }
          catch (IOException localIOException)
          {
            break label254;
          }
      }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.service.ScribeService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
