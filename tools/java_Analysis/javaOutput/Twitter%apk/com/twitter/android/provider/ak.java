package com.twitter.android.provider;

import ab;
import an;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import be;
import co;
import cq;
import cr;
import cv;
import dn;
import dp;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p;

public final class ak extends SQLiteOpenHelper
{
  private static final boolean a = Log.isLoggable("DatabaseHelper", 3);
  private static final int[] b = { 9, 10, 3, 6, 11, 12 };
  private static final HashMap c = new HashMap();
  private final Context d;
  private final ContentResolver e;

  private ak(Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 8);
    this.d = paramContext;
    this.e = this.d.getContentResolver();
  }

  private static long a(SQLiteDatabase paramSQLiteDatabase, long paramLong1, long paramLong2)
  {
    Cursor localCursor = paramSQLiteDatabase.query("statuses", new String[] { "MAX(status_id)" }, "status_id>" + paramLong1 + " AND " + "status_id" + '<' + paramLong2, null, null, null, null);
    long l2;
    if (localCursor != null)
      if (localCursor.moveToFirst())
      {
        l2 = Math.max(paramLong1, localCursor.getLong(0));
        localCursor.close();
      }
    for (long l1 = l2; ; l1 = paramLong1)
    {
      return l1 + 1L;
      l2 = paramLong1;
      break;
    }
  }

  private long a(SQLiteDatabase paramSQLiteDatabase, long paramLong1, String paramString, long paramLong2, long paramLong3, be parambe)
  {
    ContentValues localContentValues;
    try
    {
      localContentValues = new ContentValues();
      if (paramLong1 > 0L)
      {
        i = 1;
        if (paramLong1 != 0L)
          break label340;
        l1 = a(paramSQLiteDatabase, 2954391679L, 2954491679L);
        l2 = System.currentTimeMillis();
        localContentValues.put("content", paramString);
        if (parambe != null)
          break label168;
        localContentValues.putNull("entities");
      }
      while (true)
      {
        if (i == 0)
          break label190;
        paramSQLiteDatabase.update("statuses", localContentValues, "status_id=" + l1, null);
        localContentValues.clear();
        localContentValues.put("updated_at", Long.valueOf(l2));
        paramSQLiteDatabase.update("status_groups", localContentValues, "g_status_id=" + l1, null);
        this.e.notifyChange(az.l, null);
        return l1;
        i = 0;
        break;
        localContentValues.put("entities", parambe.a());
      }
    }
    finally
    {
    }
    while (true)
    {
      int i;
      long l2;
      label168: label190: localContentValues.put("status_id", Long.valueOf(l1));
      localContentValues.put("created", Long.valueOf(l2));
      localContentValues.put("author_id", Long.valueOf(paramLong2));
      localContentValues.put("in_r_status_id", Long.valueOf(paramLong3));
      paramSQLiteDatabase.insert("statuses", "status_id", localContentValues);
      localContentValues.clear();
      localContentValues.put("g_status_id", Long.valueOf(l1));
      localContentValues.put("owner_id", Long.valueOf(paramLong2));
      localContentValues.put("type", Integer.valueOf(11));
      localContentValues.put("sender_id", Long.valueOf(paramLong2));
      localContentValues.put("ref_id", Long.valueOf(l1));
      localContentValues.put("updated_at", Long.valueOf(l2));
      paramSQLiteDatabase.insert("status_groups", "g_status_id", localContentValues);
      continue;
      label340: long l1 = paramLong1;
    }
  }

  private long a(String[] paramArrayOfString1, String paramString, String[] paramArrayOfString2)
  {
    Cursor localCursor;
    try
    {
      localCursor = getReadableDatabase().query("search_queries", paramArrayOfString1, paramString, paramArrayOfString2, null, null, null);
      if (localCursor != null)
        try
        {
          if (localCursor.moveToFirst())
          {
            i = localCursor.getInt(0);
            l2 = i;
            localCursor.close();
            l1 = l2;
            return l1;
          }
          localCursor.close();
        }
        finally
        {
          localCursor.close();
        }
    }
    finally
    {
    }
    while (true)
    {
      int i;
      long l2;
      long l1 = 0L;
    }
  }

  public static ad a(Cursor paramCursor)
  {
    long l1 = paramCursor.getLong(1);
    String str1 = paramCursor.getString(2);
    String str2 = paramCursor.getString(3);
    String str3 = paramCursor.getString(4);
    String str4 = paramCursor.getString(8);
    int i = paramCursor.getInt(9);
    String str5 = paramCursor.getString(10);
    int j = paramCursor.getInt(18);
    boolean bool1;
    boolean bool2;
    label103: String str6;
    int k;
    long l2;
    int m;
    if (paramCursor.getInt(5) == 1)
    {
      bool1 = true;
      if (paramCursor.getInt(6) != 1)
        break label233;
      bool2 = true;
      str6 = paramCursor.getString(7);
      k = paramCursor.getInt(11);
      l2 = paramCursor.getLong(12);
      m = paramCursor.getInt(13);
      if (paramCursor.getInt(14) != 1)
        break label239;
    }
    label233: label239: for (boolean bool3 = true; ; bool3 = false)
    {
      return new ad(l1, str1, str2, str3, str4, i, str5, j, bool1, bool2, str6, k, l2, m, bool3, paramCursor.getInt(15), paramCursor.getLong(19), null, paramCursor.getLong(16), paramCursor.getInt(17));
      bool1 = false;
      break;
      bool2 = false;
      break label103;
    }
  }

  public static ak a(Context paramContext, long paramLong)
  {
    try
    {
      String str = f(paramLong);
      ak localak = (ak)c.get(str);
      if (localak == null)
      {
        localak = new ak(paramContext.getApplicationContext(), str);
        c.put(str, localak);
      }
      return localak;
    }
    finally
    {
    }
  }

  private String a(int paramInt1, int paramInt2, long paramLong)
  {
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("cursors");
    String[] arrayOfString = new String[3];
    arrayOfString[0] = Long.toString(paramLong);
    arrayOfString[1] = Integer.toString(paramInt2);
    arrayOfString[2] = Integer.toString(paramInt1);
    localCursor = localSQLiteQueryBuilder.query(getReadableDatabase(), z.a, "owner_id=? AND type=? AND kind=?", arrayOfString, null, null, null);
    if (localCursor != null)
      try
      {
        if (localCursor.moveToFirst())
        {
          String str = localCursor.getString(0);
          return str;
        }
        return null;
      }
      finally
      {
        localCursor.close();
      }
  }

  private static StringBuilder a(StringBuilder paramStringBuilder, long[] paramArrayOfLong)
  {
    if (paramArrayOfLong != null)
    {
      int i = 0;
      int j = paramArrayOfLong.length;
      while (i < j)
      {
        paramStringBuilder.append(paramArrayOfLong[i]);
        if (i < j - 1)
          paramStringBuilder.append((char)',');
        i++;
      }
    }
    return paramStringBuilder;
  }

  private void a(int paramInt1, int paramInt2, long paramLong, String paramString)
  {
    if (paramString == null);
    while (true)
    {
      return;
      try
      {
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("kind", Integer.valueOf(paramInt1));
        localContentValues.put("type", Integer.valueOf(paramInt2));
        localContentValues.put("owner_id", Long.valueOf(paramLong));
        localContentValues.put("next", paramString);
        SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
        String[] arrayOfString = new String[3];
        arrayOfString[0] = Long.toString(paramLong);
        arrayOfString[1] = Integer.toString(paramInt2);
        arrayOfString[2] = Integer.toString(paramInt1);
        if (localSQLiteDatabase.update("cursors", localContentValues, "owner_id=? AND type=? AND kind=?", arrayOfString) == 0)
          localSQLiteDatabase.insert("cursors", "owner_id", localContentValues);
        if (!a)
          continue;
        Log.d("DatabaseHelper", "Saved cursor for type: " + paramInt2 + ", kind: " + paramInt1 + ", next: " + paramString);
      }
      finally
      {
      }
    }
  }

  private void a(long paramLong, int paramInt1, int paramInt2)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      String[] arrayOfString = new String[3];
      arrayOfString[0] = Long.toString(paramLong);
      arrayOfString[1] = Integer.toString(paramInt1);
      arrayOfString[2] = Integer.toString(paramInt2);
      int i = localSQLiteDatabase.delete("cursors", "owner_id=? AND type=? AND kind=?", arrayOfString);
      if ((a) && (i > 0))
        Log.d("DatabaseHelper", "Invalidated cursor: " + paramInt2);
      return;
    }
    finally
    {
    }
  }

  private void a(long paramLong, int paramInt, boolean paramBoolean)
  {
    try
    {
      long l = g(paramLong, paramInt);
      if (l == 0L);
      while (true)
      {
        return;
        if (a)
          Log.d("DatabaseHelper", "Tagging the oldest status of type: " + paramInt + " owner id: " + paramLong + " row id: " + l);
        SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("is_last", Integer.valueOf(0));
        localSQLiteDatabase.update("status_groups", localContentValues, "is_last=1", null);
        localContentValues.put("is_last", Integer.valueOf(1));
        String[] arrayOfString = new String[1];
        arrayOfString[0] = Long.toString(l);
        localSQLiteDatabase.update("status_groups", localContentValues, "_id=?", arrayOfString);
        if (paramBoolean)
          f();
      }
    }
    finally
    {
    }
  }

  private void a(SQLiteDatabase paramSQLiteDatabase)
  {
    try
    {
      paramSQLiteDatabase.delete("user_groups", null, null);
      paramSQLiteDatabase.delete("cursors", null, null);
      paramSQLiteDatabase.delete("users", null, null);
      paramSQLiteDatabase.delete("status_groups", null, null);
      paramSQLiteDatabase.delete("statuses", null, null);
      paramSQLiteDatabase.delete("lists", null, null);
      paramSQLiteDatabase.delete("messages", null, null);
      paramSQLiteDatabase.delete("search_queries", null, null);
      paramSQLiteDatabase.delete("scribe", null, null);
      paramSQLiteDatabase.delete("activities", null, null);
      paramSQLiteDatabase.delete("stories", null, null);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void a(cv paramcv)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "updateList: " + paramcv.a() + " follow: " + paramcv.i());
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("i_follow", Integer.valueOf(paramcv.i()));
      localContentValues.put("members", Integer.valueOf(paramcv.e()));
      localContentValues.put("subscribers", Integer.valueOf(paramcv.f()));
      String[] arrayOfString = new String[1];
      arrayOfString[0] = Long.toString(paramcv.a());
      localSQLiteDatabase.update("lists", localContentValues, "list_id=?", arrayOfString);
      return;
    }
    finally
    {
    }
  }

  private void a(dn paramdn, long paramLong)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "updateSearchQuery: " + paramdn.a + ", rowId: " + paramLong);
      ContentValues localContentValues = new ContentValues();
      if ((paramdn.b != null) && (paramdn.a != null))
      {
        localContentValues.put("query", paramdn.b);
        localContentValues.put("name", paramdn.a);
        localContentValues.put("time", Long.valueOf(System.currentTimeMillis()));
        localContentValues.put("latitude", paramdn.c);
        localContentValues.put("longitude", paramdn.d);
        localContentValues.put("radius", paramdn.e);
        localContentValues.put("location", paramdn.f);
        SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
        String[] arrayOfString = new String[1];
        arrayOfString[0] = Long.toString(paramLong);
        localSQLiteDatabase.update("search_queries", localContentValues, "_id=?", arrayOfString);
      }
      return;
    }
    finally
    {
    }
  }

  private void a(String paramString, String[] paramArrayOfString, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase;
    Cursor localCursor;
    try
    {
      localSQLiteDatabase = getWritableDatabase();
      localCursor = localSQLiteDatabase.query("users", new String[] { "user_id", "friendship" }, paramString, paramArrayOfString, null, null, null);
      if (localCursor == null)
        break label258;
      localContentValues = new ContentValues();
      localSQLiteDatabase.beginTransaction();
      try
      {
        l1 = System.currentTimeMillis();
        while (true)
        {
          if (!localCursor.moveToNext())
            break label241;
          l2 = localCursor.getLong(0);
          i = localCursor.getInt(1);
          if (!paramBoolean)
            break;
          j = i | 0x1;
          localContentValues.put("friendship", Integer.valueOf(j));
          localContentValues.put("friendship_time", Long.valueOf(l1));
          arrayOfString = new String[1];
          arrayOfString[0] = Long.toString(l2);
          localSQLiteDatabase.update("users", localContentValues, "user_id=?", arrayOfString);
          if (a)
            Log.d("DatabaseHelper", "updateFriendship: " + l2 + " friendship now: " + j);
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
        localCursor.close();
      }
    }
    finally
    {
    }
    while (true)
    {
      ContentValues localContentValues;
      long l1;
      long l2;
      int i;
      String[] arrayOfString;
      int j = i & 0xFFFFFFFE;
    }
    label241: localSQLiteDatabase.setTransactionSuccessful();
    localSQLiteDatabase.endTransaction();
    localCursor.close();
    label258:
  }

  private static boolean a(p paramp, ContentValues paramContentValues)
  {
    String str = paramp.h;
    if (TextUtils.isEmpty(str))
      return false;
    paramContentValues.put("status_id", Long.valueOf(paramp.a));
    paramContentValues.put("author_id", Long.valueOf(paramp.m.a));
    paramContentValues.put("content", str);
    paramContentValues.put("source", paramp.b);
    paramContentValues.put("source_url", paramp.c);
    paramContentValues.put("created", Long.valueOf(paramp.d));
    paramContentValues.put("in_r_status_id", Long.valueOf(paramp.g));
    paramContentValues.put("in_r_user_id", Long.valueOf(paramp.f));
    paramContentValues.put("favorited", Boolean.valueOf(paramp.l));
    paramContentValues.put("latitude", paramp.i);
    paramContentValues.put("longitude", paramp.j);
    ap localap = paramp.p;
    if (localap != null)
    {
      paramContentValues.put("place_type", Integer.valueOf(localap.a));
      paramContentValues.put("place_name", localap.b);
      paramContentValues.put("place_bounding", localap.c);
      paramContentValues.put("place_id", localap.d);
    }
    paramContentValues.put("retweet_count", Integer.valueOf(paramp.o));
    be localbe = paramp.n;
    if (localbe != null)
      paramContentValues.put("entities", localbe.a());
    return true;
  }

  private static byte[] a(int paramInt, List paramList)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 1:
      ArrayList localArrayList = new ArrayList(paramList.size());
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        localArrayList.add(new ar((ad)localIterator.next()));
      return cr.a(localArrayList);
    case 2:
      return g.a(paramList);
    case 3:
    }
    return ae.a(paramList);
  }

  private long b(dn paramdn, int paramInt)
  {
    if (paramdn != null)
      try
      {
        if (a)
          Log.d("DatabaseHelper", "findSearchQuery: " + paramdn.a + ", of type: " + paramInt);
        if ((paramdn.c != null) && (paramdn.d != null))
        {
          str = "query=? AND name=? AND type=? AND latitude=? AND longitude=?";
          arrayOfString = new String[5];
          arrayOfString[0] = paramdn.b;
          arrayOfString[1] = paramdn.a;
          arrayOfString[2] = Integer.toString(paramInt);
          arrayOfString[3] = paramdn.c.toString();
          arrayOfString[4] = paramdn.d.toString();
        }
        while (true)
        {
          l2 = a(ad.a, str, arrayOfString);
          l1 = l2;
          return l1;
          str = "query=? AND name=? AND type=? AND latitude IS NULL AND longitude IS NULL";
          arrayOfString = new String[3];
          arrayOfString[0] = paramdn.b;
          arrayOfString[1] = paramdn.a;
          arrayOfString[2] = Integer.toString(paramInt);
        }
      }
      finally
      {
      }
    while (true)
    {
      String str;
      String[] arrayOfString;
      long l2;
      long l1 = 0L;
    }
  }

  private long c(dn paramdn, int paramInt)
  {
    try
    {
      if (a)
      {
        Log.d("DatabaseHelper", "insertSearchQuery: " + paramdn.a + ", of type: " + paramInt);
        break label205;
        while (true)
        {
          ContentValues localContentValues = new ContentValues();
          localContentValues.put("type", Integer.valueOf(paramInt));
          localContentValues.put("query", paramdn.b);
          localContentValues.put("name", paramdn.a);
          localContentValues.put("time", Long.valueOf(System.currentTimeMillis()));
          localContentValues.put("latitude", paramdn.c);
          localContentValues.put("longitude", paramdn.d);
          localContentValues.put("radius", paramdn.e);
          localContentValues.put("location", paramdn.f);
          localContentValues.put("query_id", Long.valueOf(paramdn.g));
          long l = getWritableDatabase().insert("search_queries", "query", localContentValues);
          return l;
          c(paramInt);
        }
      }
    }
    finally
    {
    }
    label205: switch (paramInt)
    {
    default:
    case 0:
    case 4:
    }
  }

  // ERROR //
  private void c(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 26	com/twitter/android/provider/ak:a	Z
    //   5: ifeq +29 -> 34
    //   8: ldc 18
    //   10: new 58	java/lang/StringBuilder
    //   13: dup
    //   14: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   17: ldc_w 567
    //   20: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: iload_1
    //   24: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   27: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: invokestatic 287	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   33: pop
    //   34: aload_0
    //   35: invokevirtual 275	com/twitter/android/provider/ak:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   38: astore_3
    //   39: getstatic 554	com/twitter/android/provider/ad:a	[Ljava/lang/String;
    //   42: astore 4
    //   44: iconst_1
    //   45: anewarray 54	java/lang/String
    //   48: astore 5
    //   50: aload 5
    //   52: iconst_0
    //   53: iload_1
    //   54: invokestatic 256	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   57: aastore
    //   58: aload_3
    //   59: ldc 211
    //   61: aload 4
    //   63: ldc_w 569
    //   66: aload 5
    //   68: aconst_null
    //   69: aconst_null
    //   70: ldc_w 571
    //   73: invokevirtual 85	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   76: astore 6
    //   78: aload 6
    //   80: ifnonnull +6 -> 86
    //   83: aload_0
    //   84: monitorexit
    //   85: return
    //   86: aload 6
    //   88: invokeinterface 574 1 0
    //   93: bipush 10
    //   95: isub
    //   96: istore 7
    //   98: iload 7
    //   100: ifgt +18 -> 118
    //   103: aload 6
    //   105: invokeinterface 104 1 0
    //   110: goto -27 -> 83
    //   113: astore_2
    //   114: aload_0
    //   115: monitorexit
    //   116: aload_2
    //   117: athrow
    //   118: getstatic 26	com/twitter/android/provider/ak:a	Z
    //   121: ifeq +30 -> 151
    //   124: ldc 18
    //   126: new 58	java/lang/StringBuilder
    //   129: dup
    //   130: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   133: ldc_w 576
    //   136: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: iload 7
    //   141: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   144: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: invokestatic 287	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   150: pop
    //   151: aload_3
    //   152: invokevirtual 398	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   155: aload 6
    //   157: invokeinterface 401 1 0
    //   162: ifeq +52 -> 214
    //   165: iload 7
    //   167: iflt +47 -> 214
    //   170: aload 6
    //   172: iconst_0
    //   173: invokeinterface 215 2 0
    //   178: i2l
    //   179: lstore 10
    //   181: iconst_1
    //   182: anewarray 54	java/lang/String
    //   185: astore 12
    //   187: aload 12
    //   189: iconst_0
    //   190: lload 10
    //   192: invokestatic 254	java/lang/Long:toString	(J)Ljava/lang/String;
    //   195: aastore
    //   196: aload_3
    //   197: ldc 211
    //   199: ldc_w 311
    //   202: aload 12
    //   204: invokevirtual 292	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   207: pop
    //   208: iinc 7 255
    //   211: goto -56 -> 155
    //   214: aload_3
    //   215: invokevirtual 415	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   218: aload_3
    //   219: invokevirtual 412	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   222: aload 6
    //   224: invokeinterface 104 1 0
    //   229: goto -146 -> 83
    //   232: astore 8
    //   234: aload_3
    //   235: invokevirtual 412	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   238: aload 8
    //   240: athrow
    //   241: astore 9
    //   243: aload 6
    //   245: invokeinterface 104 1 0
    //   250: aload 9
    //   252: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   2	34	113	finally
    //   34	78	113	finally
    //   86	98	113	finally
    //   103	110	113	finally
    //   118	151	113	finally
    //   222	229	113	finally
    //   243	253	113	finally
    //   151	155	232	finally
    //   155	165	232	finally
    //   170	208	232	finally
    //   214	218	232	finally
    //   218	222	241	finally
    //   234	241	241	finally
  }

  private void c(long paramLong1, int paramInt, long paramLong2)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "deleteOldStatuses: owner id: " + paramLong1 + ", type: " + paramInt + ", tag: " + paramLong2);
      localSQLiteDatabase = getWritableDatabase();
      String[] arrayOfString = new String[3];
      arrayOfString[0] = Long.toString(paramLong1);
      arrayOfString[1] = Integer.toString(paramInt);
      arrayOfString[2] = Long.toString(paramLong2);
      Cursor localCursor1 = localSQLiteDatabase.query("status_groups", new String[] { "COUNT(*)" }, "owner_id=? AND type=? AND tag=?", arrayOfString, null, null, null);
      if (localCursor1 == null)
        break label426;
      boolean bool = localCursor1.moveToFirst();
      int i = 0;
      if (bool)
        i = localCursor1.getInt(0);
      localCursor1.close();
      if (a)
        Log.d("DatabaseHelper", "deleteOldStatuses: total count: " + i);
      if (i <= 400)
        break label426;
      localCursor2 = localSQLiteDatabase.query("status_groups LEFT JOIN statuses ON status_groups.g_status_id=statuses.status_id", j.a, "owner_id=? AND type=? AND tag=?", arrayOfString, null, null, "updated_at ASC", String.valueOf(1 + (i - 100)));
      if (localCursor2 == null)
        break label426;
      int j = localCursor2.getCount();
      if (j <= 0)
        break label426;
      try
      {
        localStringBuilder = new StringBuilder(256);
        localStringBuilder.append("_id").append(" IN(");
        while (localCursor2.moveToNext())
        {
          localStringBuilder.append(localCursor2.getLong(0));
          if (!localCursor2.isLast())
            localStringBuilder.append((char)',');
        }
      }
      finally
      {
        localCursor2.close();
      }
    }
    finally
    {
    }
    SQLiteDatabase localSQLiteDatabase;
    Cursor localCursor2;
    StringBuilder localStringBuilder;
    localStringBuilder.append((char)')');
    int k = localSQLiteDatabase.delete("status_groups", localStringBuilder.toString(), null);
    if (a)
      Log.d("DatabaseHelper", "deleteOldStatuses: Deleted: " + k);
    if (k > 0)
      a(3, paramInt, paramLong1, Long.toString(c(paramLong1, paramInt)));
    localCursor2.close();
    label426:
  }

  private void d(int paramInt)
  {
    try
    {
      long l = f(paramInt);
      if (l == 0L);
      while (true)
      {
        return;
        if (a)
          Log.d("DatabaseHelper", "Tagging the oldest message of type: " + paramInt + " row id: " + l);
        localSQLiteDatabase = getWritableDatabase();
        localContentValues = new ContentValues();
        localContentValues.put("is_last", Integer.valueOf(0));
        localSQLiteDatabase.update("messages", localContentValues, "is_last=1", null);
        localContentValues.put("is_last", Integer.valueOf(1));
        arrayOfString = new String[1];
        arrayOfString[0] = Long.toString(l);
        localSQLiteDatabase.update("messages", localContentValues, "msg_id=?", arrayOfString);
        localContentResolver = this.e;
        if (paramInt != 1)
          break;
        localUri = ac.a;
        localContentResolver.notifyChange(localUri, null);
      }
    }
    finally
    {
    }
    while (true)
    {
      SQLiteDatabase localSQLiteDatabase;
      ContentValues localContentValues;
      String[] arrayOfString;
      ContentResolver localContentResolver;
      Uri localUri = ac.b;
    }
  }

  private void e(int paramInt)
  {
    try
    {
      long l = g(paramInt);
      if (l == 0L);
      while (true)
      {
        return;
        if (a)
          Log.d("DatabaseHelper", "Tagging the oldest activity of type: " + paramInt + " activity id: " + l);
        SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("is_last", Integer.valueOf(0));
        localSQLiteDatabase.update("activities", localContentValues, "is_last=1", null);
        localContentValues.put("is_last", Integer.valueOf(1));
        String[] arrayOfString = new String[1];
        arrayOfString[0] = String.valueOf(l);
        localSQLiteDatabase.update("activities", localContentValues, "created_at=?", arrayOfString);
        this.e.notifyChange(u.a, null);
      }
    }
    finally
    {
    }
  }

  private void e(long paramLong, int paramInt)
  {
    try
    {
      long l = f(paramLong, paramInt);
      if (l == 0L);
      while (true)
      {
        return;
        if (a)
          Log.d("DatabaseHelper", "Tagging the oldest user of type: " + paramInt + " owner id: " + paramLong + " row id: " + l);
        SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("is_last", Integer.valueOf(0));
        localSQLiteDatabase.update("user_groups", localContentValues, "is_last=1", null);
        localContentValues.put("is_last", Integer.valueOf(1));
        String[] arrayOfString = new String[1];
        arrayOfString[0] = Long.toString(l);
        localSQLiteDatabase.update("user_groups", localContentValues, "_id=?", arrayOfString);
        this.e.notifyChange(aj.a, null);
      }
    }
    finally
    {
    }
  }

  private long f(int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
    String[] arrayOfString1 = e.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = Integer.toString(paramInt);
    localCursor = localSQLiteDatabase.query("messages", arrayOfString1, "type=?", arrayOfString2, null, null, "created ASC", "1");
    if (localCursor != null)
      try
      {
        if (localCursor.moveToFirst())
        {
          long l = localCursor.getLong(0);
          return l;
        }
        return 0L;
      }
      finally
      {
        localCursor.close();
      }
  }

  private long f(long paramLong, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
    String[] arrayOfString1 = m.a;
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = Long.toString(paramLong);
    arrayOfString2[1] = Integer.toString(paramInt);
    localCursor = localSQLiteDatabase.query("user_groups_view", arrayOfString1, "owner_id=? AND type=?", arrayOfString2, null, null, "_id DESC", "1");
    if (localCursor != null)
      try
      {
        if (localCursor.moveToFirst())
        {
          long l = localCursor.getLong(0);
          return l;
        }
        return 0L;
      }
      finally
      {
        localCursor.close();
      }
  }

  public static String f(long paramLong)
  {
    return paramLong + ".db";
  }

  private void f()
  {
    ContentResolver localContentResolver = this.e;
    localContentResolver.notifyChange(az.a, null);
    localContentResolver.notifyChange(af.a, null);
  }

  private long g(int paramInt)
  {
    Cursor localCursor;
    try
    {
      SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
      String[] arrayOfString1 = ap.a;
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = String.valueOf(paramInt);
      localCursor = localSQLiteDatabase.query("activities", arrayOfString1, "type=?", arrayOfString2, null, null, "min_position DESC", "1");
      if (localCursor != null)
        try
        {
          if (localCursor.moveToFirst())
          {
            l2 = localCursor.getLong(0);
            localCursor.close();
            l1 = l2;
            return l1;
          }
          localCursor.close();
        }
        finally
        {
          localCursor.close();
        }
    }
    finally
    {
    }
    while (true)
    {
      long l2;
      long l1 = 0L;
    }
  }

  private long g(long paramLong, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
    String[] arrayOfString1 = ai.a;
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = Long.toString(paramLong);
    arrayOfString2[1] = Integer.toString(paramInt);
    localCursor = localSQLiteDatabase.query("status_groups_view", arrayOfString1, "owner_id=? AND type=?", arrayOfString2, null, null, "updated_at ASC, _id DESC", "1");
    if (localCursor != null)
      try
      {
        if (localCursor.moveToFirst())
        {
          long l = localCursor.getLong(0);
          return l;
        }
        return 0L;
      }
      finally
      {
        localCursor.close();
      }
  }

  private ad g(long paramLong)
  {
    Cursor localCursor;
    try
    {
      SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
      String[] arrayOfString1 = v.a;
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = Long.toString(paramLong);
      localCursor = localSQLiteDatabase.query("users", arrayOfString1, "user_id=?", arrayOfString2, null, null, null);
      if (localCursor != null)
        try
        {
          if (localCursor.moveToFirst())
          {
            localad2 = a(localCursor);
            localCursor.close();
            localad1 = localad2;
            return localad1;
          }
          localCursor.close();
        }
        finally
        {
          localCursor.close();
        }
    }
    finally
    {
    }
    while (true)
    {
      ad localad2;
      ad localad1 = null;
    }
  }

  private void h(long paramLong)
  {
    try
    {
      long l = i(paramLong);
      if (l == 0L);
      while (true)
      {
        return;
        if (a)
          Log.d("DatabaseHelper", "Tagging the oldest list owned by: " + paramLong + " row id: " + l);
        SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("is_last", Integer.valueOf(0));
        localSQLiteDatabase.update("lists", localContentValues, "is_last=1", null);
        localContentValues.put("is_last", Integer.valueOf(1));
        String[] arrayOfString = new String[1];
        arrayOfString[0] = Long.toString(l);
        localSQLiteDatabase.update("lists", localContentValues, "_id=?", arrayOfString);
        this.e.notifyChange(aq.a, null);
      }
    }
    finally
    {
    }
  }

  // ERROR //
  private void h(long paramLong, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 26	com/twitter/android/provider/ak:a	Z
    //   5: ifeq +39 -> 44
    //   8: ldc 18
    //   10: new 58	java/lang/StringBuilder
    //   13: dup
    //   14: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   17: ldc_w 699
    //   20: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: lload_1
    //   24: invokevirtual 68	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   27: ldc_w 701
    //   30: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: iload_3
    //   34: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   37: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokestatic 287	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   43: pop
    //   44: aload_0
    //   45: invokevirtual 275	com/twitter/android/provider/ak:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   48: astore 5
    //   50: iconst_1
    //   51: anewarray 54	java/lang/String
    //   54: astore 6
    //   56: aload 6
    //   58: iconst_0
    //   59: iload_3
    //   60: invokestatic 598	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   63: aastore
    //   64: aload 5
    //   66: ldc_w 326
    //   69: iconst_1
    //   70: anewarray 54	java/lang/String
    //   73: dup
    //   74: iconst_0
    //   75: ldc_w 585
    //   78: aastore
    //   79: ldc_w 569
    //   82: aload 6
    //   84: aconst_null
    //   85: aconst_null
    //   86: aconst_null
    //   87: invokevirtual 85	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   90: astore 7
    //   92: iconst_0
    //   93: istore 8
    //   95: aload 7
    //   97: ifnull +34 -> 131
    //   100: aload 7
    //   102: invokeinterface 91 1 0
    //   107: ifeq +68 -> 175
    //   110: aload 7
    //   112: iconst_0
    //   113: invokeinterface 215 2 0
    //   118: istore 9
    //   120: aload 7
    //   122: invokeinterface 104 1 0
    //   127: iload 9
    //   129: istore 8
    //   131: getstatic 26	com/twitter/android/provider/ak:a	Z
    //   134: ifeq +30 -> 164
    //   137: ldc 18
    //   139: new 58	java/lang/StringBuilder
    //   142: dup
    //   143: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   146: ldc_w 703
    //   149: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: iload 8
    //   154: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   157: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: invokestatic 287	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   163: pop
    //   164: iload 8
    //   166: sipush 400
    //   169: if_icmpgt +12 -> 181
    //   172: aload_0
    //   173: monitorexit
    //   174: return
    //   175: iconst_0
    //   176: istore 9
    //   178: goto -58 -> 120
    //   181: aload 5
    //   183: ldc_w 326
    //   186: getstatic 673	com/twitter/android/provider/ap:a	[Ljava/lang/String;
    //   189: ldc_w 569
    //   192: aload 6
    //   194: aconst_null
    //   195: aconst_null
    //   196: ldc_w 705
    //   199: iconst_1
    //   200: iload 8
    //   202: sipush 200
    //   205: isub
    //   206: iadd
    //   207: invokestatic 598	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   210: invokevirtual 601	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   213: astore 10
    //   215: aload 10
    //   217: ifnull -45 -> 172
    //   220: aload 10
    //   222: invokeinterface 708 1 0
    //   227: ifeq +251 -> 478
    //   230: aload 10
    //   232: iconst_0
    //   233: invokeinterface 95 2 0
    //   238: lstore 12
    //   240: lload 12
    //   242: lconst_0
    //   243: lcmp
    //   244: ifle +217 -> 461
    //   247: iconst_2
    //   248: anewarray 54	java/lang/String
    //   251: astore 14
    //   253: aload 14
    //   255: iconst_0
    //   256: iload_3
    //   257: invokestatic 598	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   260: aastore
    //   261: aload 14
    //   263: iconst_1
    //   264: lload 12
    //   266: invokestatic 635	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   269: aastore
    //   270: aload 5
    //   272: ldc_w 326
    //   275: ldc_w 710
    //   278: aload 14
    //   280: invokevirtual 292	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   283: istore 15
    //   285: getstatic 26	com/twitter/android/provider/ak:a	Z
    //   288: ifeq +30 -> 318
    //   291: ldc 18
    //   293: new 58	java/lang/StringBuilder
    //   296: dup
    //   297: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   300: ldc_w 712
    //   303: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: iload 15
    //   308: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   311: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   314: invokestatic 287	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   317: pop
    //   318: iconst_2
    //   319: anewarray 54	java/lang/String
    //   322: astore 16
    //   324: aload 16
    //   326: iconst_0
    //   327: bipush 8
    //   329: invokestatic 598	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   332: aastore
    //   333: aload 16
    //   335: iconst_1
    //   336: lload 12
    //   338: invokestatic 635	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   341: aastore
    //   342: aload 5
    //   344: ldc_w 316
    //   347: ldc_w 714
    //   350: aload 16
    //   352: invokevirtual 292	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   355: istore 17
    //   357: getstatic 26	com/twitter/android/provider/ak:a	Z
    //   360: ifeq +30 -> 390
    //   363: ldc 18
    //   365: new 58	java/lang/StringBuilder
    //   368: dup
    //   369: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   372: ldc_w 716
    //   375: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: iload 17
    //   380: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   383: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   386: invokestatic 287	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   389: pop
    //   390: iconst_2
    //   391: anewarray 54	java/lang/String
    //   394: astore 18
    //   396: aload 18
    //   398: iconst_0
    //   399: bipush 12
    //   401: invokestatic 598	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   404: aastore
    //   405: aload 18
    //   407: iconst_1
    //   408: lload 12
    //   410: invokestatic 635	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   413: aastore
    //   414: aload 5
    //   416: ldc 154
    //   418: ldc_w 714
    //   421: aload 18
    //   423: invokevirtual 292	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   426: istore 19
    //   428: getstatic 26	com/twitter/android/provider/ak:a	Z
    //   431: ifeq +30 -> 461
    //   434: ldc 18
    //   436: new 58	java/lang/StringBuilder
    //   439: dup
    //   440: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   443: ldc_w 718
    //   446: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: iload 19
    //   451: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   454: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   457: invokestatic 287	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   460: pop
    //   461: aload 10
    //   463: invokeinterface 104 1 0
    //   468: goto -296 -> 172
    //   471: astore 4
    //   473: aload_0
    //   474: monitorexit
    //   475: aload 4
    //   477: athrow
    //   478: lconst_0
    //   479: lstore 12
    //   481: goto -241 -> 240
    //   484: astore 11
    //   486: aload 10
    //   488: invokeinterface 104 1 0
    //   493: aload 11
    //   495: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   2	44	471	finally
    //   44	92	471	finally
    //   100	120	471	finally
    //   120	127	471	finally
    //   131	164	471	finally
    //   181	215	471	finally
    //   461	468	471	finally
    //   486	496	471	finally
    //   220	240	484	finally
    //   247	318	484	finally
    //   318	390	484	finally
    //   390	461	484	finally
  }

  private long i(long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
    String[] arrayOfString1 = t.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = Long.toString(paramLong);
    localCursor = localSQLiteDatabase.query("lists", arrayOfString1, "owner_id=?", arrayOfString2, null, null, "full_name DESC", "1");
    if (localCursor != null)
      try
      {
        if (localCursor.moveToFirst())
        {
          long l = localCursor.getLong(0);
          return l;
        }
        return 0L;
      }
      finally
      {
        localCursor.close();
      }
  }

  private void j(long paramLong)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "deleteOldMessages: owner id: " + paramLong);
      localSQLiteDatabase = getWritableDatabase();
      localCursor1 = localSQLiteDatabase.query("messages", new String[] { "COUNT(*)" }, null, null, null, null, null);
      if (localCursor1 != null)
      {
        bool = localCursor1.moveToFirst();
        i = 0;
        if (bool)
          i = localCursor1.getInt(0);
        localCursor1.close();
        if (a)
          Log.d("DatabaseHelper", "deleteOldMessages: Have count: " + i);
        if (i > 400)
          break label148;
      }
      do
      {
        return;
        localCursor2 = localSQLiteDatabase.query("messages", e.a, null, null, null, null, "created ASC", String.valueOf(1 + (i - 200)));
      }
      while (localCursor2 == null);
      try
      {
        if (localCursor2.getCount() > 0)
        {
          localStringBuilder = new StringBuilder(256);
          localStringBuilder.append("msg_id").append(" IN(");
          while (localCursor2.moveToNext())
          {
            localStringBuilder.append(localCursor2.getLong(0));
            if (!localCursor2.isLast())
              localStringBuilder.append((char)',');
          }
        }
      }
      finally
      {
        localCursor2.close();
      }
    }
    finally
    {
    }
    while (true)
    {
      SQLiteDatabase localSQLiteDatabase;
      Cursor localCursor1;
      boolean bool;
      int i;
      label148: Cursor localCursor2;
      StringBuilder localStringBuilder;
      localStringBuilder.append((char)')');
      int j = localSQLiteDatabase.delete("messages", localStringBuilder.toString(), null);
      if (a)
        Log.d("DatabaseHelper", "deleteOldMessages: Deleted: " + j);
      if (j > 0)
      {
        long l1 = f(1);
        if (l1 > 0L)
          a(4, 1, paramLong, Long.toString(l1));
        long l2 = f(0);
        if (l2 > 0L)
          a(4, 0, paramLong, Long.toString(l2));
      }
      localCursor2.close();
    }
  }

  public final int a()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = String.valueOf(13);
      int i = localSQLiteDatabase.delete("status_groups", "type=?", arrayOfString);
      if (a)
        Log.d("DatabaseHelper", "Deleted search results: " + i);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int a(an paraman, String paramString)
  {
    try
    {
      byte[] arrayOfByte = cr.a(paraman.c);
      int i;
      if (arrayOfByte == null)
        i = 0;
      while (true)
      {
        return i;
        SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
        localSQLiteDatabase.delete("stories", "query=?", new String[] { paramString });
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("type", Integer.valueOf(paraman.a));
        localContentValues.put("score", Double.valueOf(paraman.b));
        localContentValues.put("query", paramString);
        localContentValues.put("data", arrayOfByte);
        long l = localSQLiteDatabase.insert("stories", null, localContentValues);
        if (l > 0L)
          i = 1;
        else
          i = 0;
      }
    }
    finally
    {
    }
  }

  public final int a(ArrayList paramArrayList, int paramInt)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "Merging search queries: " + paramArrayList.size() + " of type: " + paramInt);
      bool = paramArrayList.isEmpty();
      if (bool)
      {
        i = 0;
        return i;
      }
      localLinkedHashMap = new LinkedHashMap();
      localIterator1 = paramArrayList.iterator();
      while (localIterator1.hasNext())
      {
        localdn3 = (dn)localIterator1.next();
        localLinkedHashMap.put(Integer.valueOf(17 + localdn3.a.hashCode() + 31 * localdn3.b.hashCode()), localdn3);
      }
    }
    finally
    {
    }
    int i;
    LinkedHashMap localLinkedHashMap;
    SQLiteDatabase localSQLiteDatabase;
    Cursor localCursor;
    while (true)
    {
      boolean bool;
      Iterator localIterator1;
      dn localdn3;
      localSQLiteDatabase = getWritableDatabase();
      String[] arrayOfString1 = ag.a;
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = Integer.toString(paramInt);
      localCursor = localSQLiteDatabase.query("search_queries", arrayOfString1, "type=?", arrayOfString2, null, null, null);
      if (localCursor != null)
        break;
      i = 0;
    }
    try
    {
      localSQLiteDatabase.beginTransaction();
      j = 0;
      while (localCursor.moveToNext())
      {
        str1 = localCursor.getString(1);
        str2 = localCursor.getString(2);
        m = 17 + str1.hashCode() + 31 * str2.hashCode();
        l = localCursor.getLong(0);
        localdn2 = (dn)localLinkedHashMap.remove(Integer.valueOf(m));
        if (localdn2 != null)
        {
          localContentValues2 = new ContentValues();
          localContentValues2.put("name", localdn2.a);
          localContentValues2.put("query", localdn2.b);
          localContentValues2.put("time", Long.valueOf(localdn2.h));
          localContentValues2.put("latitude", localdn2.c);
          localContentValues2.put("longitude", localdn2.d);
          localContentValues2.put("radius", localdn2.e);
          localContentValues2.put("location", localdn2.f);
          localContentValues2.put("query_id", Long.valueOf(localdn2.g));
          arrayOfString3 = new String[1];
          arrayOfString3[0] = Long.toString(l);
          localSQLiteDatabase.update("search_queries", localContentValues2, "_id=?", arrayOfString3);
          j++;
        }
        else
        {
          arrayOfString4 = new String[1];
          arrayOfString4[0] = Long.toString(l);
          localSQLiteDatabase.delete("search_queries", "_id=?", arrayOfString4);
        }
      }
    }
    finally
    {
      try
      {
        localSQLiteDatabase.endTransaction();
        throw localObject2;
      }
      finally
      {
        localCursor.close();
      }
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      localCursor.close();
      if (a)
        Log.d("DatabaseHelper", "Inserting new search queries: " + localLinkedHashMap.size());
      k = localLinkedHashMap.size();
      if (k > 0)
      {
        try
        {
          localSQLiteDatabase.beginTransaction();
          localContentValues1 = new ContentValues();
          localContentValues1.put("type", Integer.valueOf(paramInt));
          localIterator2 = localLinkedHashMap.values().iterator();
          while (localIterator2.hasNext())
          {
            localdn1 = (dn)localIterator2.next();
            localContentValues1.put("name", localdn1.a);
            localContentValues1.put("time", Long.valueOf(localdn1.h));
            localContentValues1.put("query", localdn1.b);
            localContentValues1.put("latitude", localdn1.c);
            localContentValues1.put("longitude", localdn1.d);
            localContentValues1.put("radius", localdn1.e);
            localContentValues1.put("location", localdn1.f);
            localContentValues1.put("query_id", Long.valueOf(localdn1.g));
            localSQLiteDatabase.insert("search_queries", "name", localContentValues1);
          }
        }
        finally
        {
          localSQLiteDatabase.endTransaction();
        }
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        switch (paramInt)
        {
        default:
        case 1:
        case 6:
        case 7:
        }
      }
    }
    while (true)
    {
      int j;
      String str1;
      String str2;
      int m;
      long l;
      dn localdn2;
      ContentValues localContentValues2;
      String[] arrayOfString3;
      String[] arrayOfString4;
      int k;
      ContentValues localContentValues1;
      Iterator localIterator2;
      dn localdn1;
      i = j + localLinkedHashMap.size();
      break;
      this.e.notifyChange(c.a, null);
      this.e.notifyChange(ay.a, null);
    }
  }

  public final int a(ArrayList paramArrayList, long paramLong, int paramInt, String paramString1, String paramString2)
  {
    if (paramArrayList != null)
      try
      {
        boolean bool = paramArrayList.isEmpty();
        if (bool)
        {
          i = 0;
          return i;
        }
        localArrayList = new ArrayList();
        localIterator1 = paramArrayList.iterator();
        while (localIterator1.hasNext())
          localArrayList.add(((co)localIterator1.next()).a);
      }
      finally
      {
      }
    while (true)
    {
      ArrayList localArrayList;
      Iterator localIterator1;
      int j = a(localArrayList, paramLong, paramInt, -1L, paramString1, null);
      Iterator localIterator2 = paramArrayList.iterator();
      int m;
      for (int k = j; localIterator2.hasNext(); k = m)
      {
        co localco = (co)localIterator2.next();
        if ((localco.b != null) && (!localco.b.isEmpty()))
        {
          m = k + a(localco.b, paramLong, paramInt, localco.a.a, null, null);
          continue;
          this.e.notifyChange(r.a, null);
          break label244;
          this.e.notifyChange(r.b, null);
          break label244;
        }
        else
        {
          m = k;
        }
      }
      if (k > 0)
        switch (paramInt)
        {
        case 9:
        case 10:
        }
      label244: int i = k;
    }
  }

  // ERROR //
  public final int a(Collection paramCollection, long paramLong1, int paramInt, long paramLong2, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: lload_2
    //   3: lconst_0
    //   4: lcmp
    //   5: ifge +45 -> 50
    //   8: iload 4
    //   10: iconst_m1
    //   11: if_icmpeq +39 -> 50
    //   14: new 818	java/lang/IllegalArgumentException
    //   17: dup
    //   18: new 58	java/lang/StringBuilder
    //   21: dup
    //   22: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   25: ldc_w 820
    //   28: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: iload 4
    //   33: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   36: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: invokespecial 822	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   42: athrow
    //   43: astore 22
    //   45: aload_0
    //   46: monitorexit
    //   47: aload 22
    //   49: athrow
    //   50: getstatic 26	com/twitter/android/provider/ak:a	Z
    //   53: ifeq +88 -> 141
    //   56: ldc 18
    //   58: new 58	java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   65: ldc_w 824
    //   68: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: aload_1
    //   72: invokeinterface 825 1 0
    //   77: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   80: ldc_w 546
    //   83: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: iload 4
    //   88: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   91: ldc_w 827
    //   94: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: lload_2
    //   98: invokevirtual 68	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   101: ldc_w 583
    //   104: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: lload 5
    //   109: invokevirtual 68	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   112: ldc_w 829
    //   115: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: aload 7
    //   120: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: ldc_w 831
    //   126: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: aload 8
    //   131: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   137: invokestatic 287	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   140: pop
    //   141: aload_0
    //   142: invokevirtual 275	com/twitter/android/provider/ak:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   145: astore 9
    //   147: aload 7
    //   149: ifnull +114 -> 263
    //   152: aload 7
    //   154: ldc_w 833
    //   157: invokevirtual 836	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   160: ifeq +103 -> 263
    //   163: iconst_2
    //   164: anewarray 54	java/lang/String
    //   167: astore 55
    //   169: aload 55
    //   171: iconst_0
    //   172: lload_2
    //   173: invokestatic 254	java/lang/Long:toString	(J)Ljava/lang/String;
    //   176: aastore
    //   177: aload 55
    //   179: iconst_1
    //   180: iload 4
    //   182: invokestatic 256	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   185: aastore
    //   186: aload 9
    //   188: ldc_w 316
    //   191: ldc_w 662
    //   194: aload 55
    //   196: invokevirtual 292	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   199: istore 56
    //   201: getstatic 26	com/twitter/android/provider/ak:a	Z
    //   204: ifeq +51 -> 255
    //   207: ldc 18
    //   209: new 58	java/lang/StringBuilder
    //   212: dup
    //   213: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   216: ldc_w 838
    //   219: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: iload 56
    //   224: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   227: ldc_w 827
    //   230: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: lload_2
    //   234: invokevirtual 68	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   237: ldc_w 546
    //   240: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: iload 4
    //   245: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   248: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   251: invokestatic 287	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   254: pop
    //   255: aload_0
    //   256: lload_2
    //   257: iload 4
    //   259: iconst_1
    //   260: invokespecial 840	com/twitter/android/provider/ak:a	(JII)V
    //   263: aload_1
    //   264: invokeinterface 841 1 0
    //   269: istore 10
    //   271: iconst_0
    //   272: istore 11
    //   274: iload 10
    //   276: ifne +1362 -> 1638
    //   279: new 30	java/util/HashMap
    //   282: dup
    //   283: invokespecial 33	java/util/HashMap:<init>	()V
    //   286: astore 12
    //   288: aload_1
    //   289: invokeinterface 792 1 0
    //   294: astore 13
    //   296: aload 13
    //   298: invokeinterface 516 1 0
    //   303: ifeq +34 -> 337
    //   306: aload 13
    //   308: invokeinterface 521 1 0
    //   313: checkcast 222	ad
    //   316: astore 53
    //   318: aload 12
    //   320: aload 53
    //   322: getfield 435	ad:a	J
    //   325: invokestatic 149	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   328: aload 53
    //   330: invokevirtual 243	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   333: pop
    //   334: goto -38 -> 296
    //   337: new 58	java/lang/StringBuilder
    //   340: dup
    //   341: sipush 256
    //   344: invokespecial 602	java/lang/StringBuilder:<init>	(I)V
    //   347: astore 14
    //   349: aload 14
    //   351: ldc_w 393
    //   354: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: ldc_w 606
    //   360: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   363: pop
    //   364: iconst_1
    //   365: istore 16
    //   367: aload 12
    //   369: invokevirtual 789	java/util/HashMap:values	()Ljava/util/Collection;
    //   372: invokeinterface 792 1 0
    //   377: astore 17
    //   379: aload 17
    //   381: invokeinterface 516 1 0
    //   386: ifeq +48 -> 434
    //   389: aload 17
    //   391: invokeinterface 521 1 0
    //   396: checkcast 222	ad
    //   399: astore 50
    //   401: iload 16
    //   403: ifeq +20 -> 423
    //   406: iconst_0
    //   407: istore 16
    //   409: aload 14
    //   411: aload 50
    //   413: getfield 435	ad:a	J
    //   416: invokevirtual 68	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   419: pop
    //   420: goto -41 -> 379
    //   423: aload 14
    //   425: bipush 44
    //   427: invokevirtual 75	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   430: pop
    //   431: goto -22 -> 409
    //   434: aload 14
    //   436: bipush 41
    //   438: invokevirtual 75	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   441: pop
    //   442: aload 9
    //   444: ldc_w 318
    //   447: getstatic 844	com/twitter/android/provider/an:a	[Ljava/lang/String;
    //   450: aload 14
    //   452: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   455: aconst_null
    //   456: aconst_null
    //   457: aconst_null
    //   458: aconst_null
    //   459: invokevirtual 85	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   462: astore 19
    //   464: aload 19
    //   466: ifnonnull +11 -> 477
    //   469: iconst_0
    //   470: istore 27
    //   472: aload_0
    //   473: monitorexit
    //   474: iload 27
    //   476: ireturn
    //   477: new 30	java/util/HashMap
    //   480: dup
    //   481: invokespecial 33	java/util/HashMap:<init>	()V
    //   484: astore 20
    //   486: aload 19
    //   488: invokeinterface 401 1 0
    //   493: ifeq +131 -> 624
    //   496: aload 19
    //   498: iconst_0
    //   499: invokeinterface 95 2 0
    //   504: lstore 44
    //   506: aload 12
    //   508: lload 44
    //   510: invokestatic 149	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   513: invokevirtual 780	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   516: checkcast 222	ad
    //   519: astore 46
    //   521: aload 46
    //   523: ifnull -37 -> 486
    //   526: aload 46
    //   528: getfield 846	ad:g	Ljava/lang/String;
    //   531: ifnull -45 -> 486
    //   534: aload 19
    //   536: iconst_2
    //   537: invokeinterface 95 2 0
    //   542: lstore 47
    //   544: aload 46
    //   546: getfield 849	ad:t	J
    //   549: lload 47
    //   551: lcmp
    //   552: ifle -66 -> 486
    //   555: aload 46
    //   557: invokevirtual 850	ad:hashCode	()I
    //   560: aload 19
    //   562: iconst_1
    //   563: invokeinterface 215 2 0
    //   568: if_icmpeq -82 -> 486
    //   571: aload 19
    //   573: iconst_3
    //   574: invokeinterface 220 2 0
    //   579: aload 46
    //   581: getfield 851	ad:c	Ljava/lang/String;
    //   584: invokestatic 854	cr:a	(Ljava/lang/String;Ljava/lang/String;)Z
    //   587: ifne +9 -> 596
    //   590: aload 46
    //   592: iconst_1
    //   593: putfield 857	ad:u	Z
    //   596: aload 20
    //   598: lload 44
    //   600: invokestatic 149	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   603: aload 46
    //   605: invokevirtual 243	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   608: pop
    //   609: goto -123 -> 486
    //   612: astore 21
    //   614: aload 19
    //   616: invokeinterface 104 1 0
    //   621: aload 21
    //   623: athrow
    //   624: aload 19
    //   626: invokeinterface 104 1 0
    //   631: getstatic 26	com/twitter/android/provider/ak:a	Z
    //   634: ifeq +47 -> 681
    //   637: ldc 18
    //   639: new 58	java/lang/StringBuilder
    //   642: dup
    //   643: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   646: ldc_w 859
    //   649: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   652: aload 12
    //   654: invokevirtual 785	java/util/HashMap:size	()I
    //   657: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   660: ldc_w 861
    //   663: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   666: aload 20
    //   668: invokevirtual 785	java/util/HashMap:size	()I
    //   671: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   674: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   677: invokestatic 287	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   680: pop
    //   681: aload 12
    //   683: invokevirtual 785	java/util/HashMap:size	()I
    //   686: istore 23
    //   688: iload 23
    //   690: ifle +986 -> 1676
    //   693: aload 9
    //   695: invokevirtual 398	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   698: new 107	android/content/ContentValues
    //   701: dup
    //   702: invokespecial 108	android/content/ContentValues:<init>	()V
    //   705: astore 39
    //   707: aload 12
    //   709: invokevirtual 789	java/util/HashMap:values	()Ljava/util/Collection;
    //   712: invokeinterface 792 1 0
    //   717: astore 40
    //   719: iconst_0
    //   720: istore 41
    //   722: aload 40
    //   724: invokeinterface 516 1 0
    //   729: ifeq +329 -> 1058
    //   732: aload 40
    //   734: invokeinterface 521 1 0
    //   739: checkcast 222	ad
    //   742: astore 42
    //   744: aload 39
    //   746: invokevirtual 141	android/content/ContentValues:clear	()V
    //   749: aload 39
    //   751: ldc_w 393
    //   754: aload 42
    //   756: getfield 435	ad:a	J
    //   759: invokestatic 149	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   762: invokevirtual 152	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   765: aload 39
    //   767: ldc_w 863
    //   770: aload 42
    //   772: getfield 846	ad:g	Ljava/lang/String;
    //   775: invokevirtual 126	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   778: aload 39
    //   780: ldc_w 368
    //   783: aload 42
    //   785: getfield 864	ad:b	Ljava/lang/String;
    //   788: invokevirtual 126	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   791: aload 39
    //   793: ldc_w 866
    //   796: aload 42
    //   798: getfield 867	ad:d	Ljava/lang/String;
    //   801: invokevirtual 126	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   804: aload 39
    //   806: ldc_w 869
    //   809: aload 42
    //   811: getfield 871	ad:e	Ljava/lang/String;
    //   814: invokevirtual 126	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   817: aload 39
    //   819: ldc_w 873
    //   822: aload 42
    //   824: getfield 875	ad:f	I
    //   827: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   830: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   833: aload 39
    //   835: ldc_w 388
    //   838: aload 42
    //   840: getfield 876	ad:j	Ljava/lang/String;
    //   843: invokevirtual 126	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   846: aload 39
    //   848: ldc_w 878
    //   851: aload 42
    //   853: getfield 880	ad:h	Z
    //   856: invokestatic 459	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   859: invokevirtual 462	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   862: aload 39
    //   864: ldc_w 882
    //   867: aload 42
    //   869: getfield 884	ad:i	Z
    //   872: invokestatic 459	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   875: invokevirtual 462	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   878: aload 39
    //   880: ldc_w 886
    //   883: aload 42
    //   885: getfield 888	ad:m	J
    //   888: invokestatic 149	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   891: invokevirtual 152	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   894: aload 39
    //   896: ldc_w 890
    //   899: aload 42
    //   901: getfield 851	ad:c	Ljava/lang/String;
    //   904: invokevirtual 126	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   907: aload 39
    //   909: ldc_w 892
    //   912: aload 42
    //   914: getfield 895	ad:k	I
    //   917: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   920: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   923: aload 39
    //   925: ldc_w 897
    //   928: aload 42
    //   930: getfield 899	ad:l	I
    //   933: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   936: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   939: aload 39
    //   941: ldc 52
    //   943: aload 42
    //   945: getfield 901	ad:n	I
    //   948: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   951: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   954: aload 39
    //   956: ldc_w 903
    //   959: aload 42
    //   961: getfield 905	ad:p	Z
    //   964: invokestatic 459	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   967: invokevirtual 462	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   970: aload 39
    //   972: ldc_w 907
    //   975: aload 42
    //   977: invokevirtual 850	ad:hashCode	()I
    //   980: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   983: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   986: aload 39
    //   988: ldc_w 909
    //   991: aload 42
    //   993: getfield 849	ad:t	J
    //   996: invokestatic 149	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   999: invokevirtual 152	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   1002: aload 39
    //   1004: ldc_w 395
    //   1007: aload 42
    //   1009: getfield 912	ad:q	I
    //   1012: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1015: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   1018: aload 39
    //   1020: ldc_w 914
    //   1023: aload 42
    //   1025: getfield 917	ad:s	I
    //   1028: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1031: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   1034: aload 9
    //   1036: ldc_w 318
    //   1039: ldc_w 393
    //   1042: aload 39
    //   1044: invokevirtual 186	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   1047: lconst_0
    //   1048: lcmp
    //   1049: ifle -327 -> 722
    //   1052: iinc 41 1
    //   1055: goto -333 -> 722
    //   1058: aload 9
    //   1060: invokevirtual 415	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   1063: aload 9
    //   1065: invokevirtual 412	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   1068: iload 41
    //   1070: istore 24
    //   1072: aload 20
    //   1074: invokevirtual 785	java/util/HashMap:size	()I
    //   1077: istore 25
    //   1079: iload 25
    //   1081: ifle +588 -> 1669
    //   1084: iload 4
    //   1086: iconst_3
    //   1087: if_icmpeq +451 -> 1538
    //   1090: iconst_1
    //   1091: istore 28
    //   1093: aload 9
    //   1095: invokevirtual 398	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   1098: new 107	android/content/ContentValues
    //   1101: dup
    //   1102: invokespecial 108	android/content/ContentValues:<init>	()V
    //   1105: astore 30
    //   1107: aload 20
    //   1109: invokevirtual 789	java/util/HashMap:values	()Ljava/util/Collection;
    //   1112: invokeinterface 792 1 0
    //   1117: astore 31
    //   1119: iload 24
    //   1121: istore 32
    //   1123: iconst_0
    //   1124: istore 33
    //   1126: aload 31
    //   1128: invokeinterface 516 1 0
    //   1133: ifeq +411 -> 1544
    //   1136: aload 31
    //   1138: invokeinterface 521 1 0
    //   1143: checkcast 222	ad
    //   1146: astore 34
    //   1148: aload 30
    //   1150: invokevirtual 141	android/content/ContentValues:clear	()V
    //   1153: aload 30
    //   1155: ldc_w 863
    //   1158: aload 34
    //   1160: getfield 846	ad:g	Ljava/lang/String;
    //   1163: invokevirtual 126	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   1166: aload 30
    //   1168: ldc_w 368
    //   1171: aload 34
    //   1173: getfield 864	ad:b	Ljava/lang/String;
    //   1176: invokevirtual 126	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   1179: aload 30
    //   1181: ldc_w 866
    //   1184: aload 34
    //   1186: getfield 867	ad:d	Ljava/lang/String;
    //   1189: invokevirtual 126	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   1192: aload 30
    //   1194: ldc_w 869
    //   1197: aload 34
    //   1199: getfield 871	ad:e	Ljava/lang/String;
    //   1202: invokevirtual 126	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   1205: aload 30
    //   1207: ldc_w 873
    //   1210: aload 34
    //   1212: getfield 875	ad:f	I
    //   1215: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1218: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   1221: aload 30
    //   1223: ldc_w 388
    //   1226: aload 34
    //   1228: getfield 876	ad:j	Ljava/lang/String;
    //   1231: invokevirtual 126	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   1234: aload 30
    //   1236: ldc_w 878
    //   1239: aload 34
    //   1241: getfield 880	ad:h	Z
    //   1244: invokestatic 459	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1247: invokevirtual 462	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   1250: aload 30
    //   1252: ldc_w 882
    //   1255: aload 34
    //   1257: getfield 884	ad:i	Z
    //   1260: invokestatic 459	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1263: invokevirtual 462	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   1266: aload 30
    //   1268: ldc_w 886
    //   1271: aload 34
    //   1273: getfield 888	ad:m	J
    //   1276: invokestatic 149	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1279: invokevirtual 152	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   1282: aload 30
    //   1284: ldc_w 890
    //   1287: aload 34
    //   1289: getfield 851	ad:c	Ljava/lang/String;
    //   1292: invokevirtual 126	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   1295: aload 30
    //   1297: ldc_w 892
    //   1300: aload 34
    //   1302: getfield 895	ad:k	I
    //   1305: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1308: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   1311: aload 30
    //   1313: ldc_w 897
    //   1316: aload 34
    //   1318: getfield 899	ad:l	I
    //   1321: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1324: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   1327: aload 30
    //   1329: ldc 52
    //   1331: aload 34
    //   1333: getfield 901	ad:n	I
    //   1336: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1339: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   1342: aload 30
    //   1344: ldc_w 903
    //   1347: aload 34
    //   1349: getfield 905	ad:p	Z
    //   1352: invokestatic 459	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1355: invokevirtual 462	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   1358: aload 30
    //   1360: ldc_w 907
    //   1363: aload 34
    //   1365: invokevirtual 850	ad:hashCode	()I
    //   1368: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1371: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   1374: aload 30
    //   1376: ldc_w 909
    //   1379: aload 34
    //   1381: getfield 849	ad:t	J
    //   1384: invokestatic 149	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1387: invokevirtual 152	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   1390: iload 28
    //   1392: ifeq +19 -> 1411
    //   1395: aload 30
    //   1397: ldc_w 395
    //   1400: aload 34
    //   1402: getfield 912	ad:q	I
    //   1405: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1408: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   1411: aload 30
    //   1413: ldc_w 914
    //   1416: aload 34
    //   1418: getfield 917	ad:s	I
    //   1421: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1424: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   1427: aload 34
    //   1429: getfield 857	ad:u	Z
    //   1432: ifeq +51 -> 1483
    //   1435: iconst_1
    //   1436: istore 33
    //   1438: getstatic 26	com/twitter/android/provider/ak:a	Z
    //   1441: ifeq +33 -> 1474
    //   1444: ldc 18
    //   1446: new 58	java/lang/StringBuilder
    //   1449: dup
    //   1450: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   1453: ldc_w 919
    //   1456: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1459: aload 34
    //   1461: getfield 435	ad:a	J
    //   1464: invokevirtual 68	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1467: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1470: invokestatic 287	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   1473: pop
    //   1474: aload 30
    //   1476: ldc_w 921
    //   1479: aconst_null
    //   1480: invokevirtual 176	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   1483: iconst_1
    //   1484: anewarray 54	java/lang/String
    //   1487: astore 35
    //   1489: aload 35
    //   1491: iconst_0
    //   1492: aload 34
    //   1494: getfield 435	ad:a	J
    //   1497: invokestatic 254	java/lang/Long:toString	(J)Ljava/lang/String;
    //   1500: aastore
    //   1501: aload 9
    //   1503: ldc_w 318
    //   1506: aload 30
    //   1508: ldc_w 405
    //   1511: aload 35
    //   1513: invokevirtual 138	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   1516: istore 36
    //   1518: iload 32
    //   1520: iload 36
    //   1522: iadd
    //   1523: istore 32
    //   1525: goto -399 -> 1126
    //   1528: astore 38
    //   1530: aload 9
    //   1532: invokevirtual 412	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   1535: aload 38
    //   1537: athrow
    //   1538: iconst_0
    //   1539: istore 28
    //   1541: goto -448 -> 1093
    //   1544: aload 9
    //   1546: invokevirtual 415	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   1549: aload 9
    //   1551: invokevirtual 412	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   1554: iload 33
    //   1556: ifeq +126 -> 1682
    //   1559: aload_0
    //   1560: getfield 49	com/twitter/android/provider/ak:e	Landroid/content/ContentResolver;
    //   1563: getstatic 924	com/twitter/android/provider/ao:b	Landroid/net/Uri;
    //   1566: aconst_null
    //   1567: invokevirtual 168	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   1570: goto +112 -> 1682
    //   1573: iload 26
    //   1575: ifle +114 -> 1689
    //   1578: aload_0
    //   1579: getfield 49	com/twitter/android/provider/ak:e	Landroid/content/ContentResolver;
    //   1582: getstatic 925	com/twitter/android/provider/ao:a	Landroid/net/Uri;
    //   1585: aconst_null
    //   1586: invokevirtual 168	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   1589: iload 26
    //   1591: iconst_1
    //   1592: if_icmpne +97 -> 1689
    //   1595: aload_0
    //   1596: getfield 49	com/twitter/android/provider/ak:e	Landroid/content/ContentResolver;
    //   1599: getstatic 927	com/twitter/android/provider/ao:c	Landroid/net/Uri;
    //   1602: invokevirtual 933	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   1605: aload_1
    //   1606: invokeinterface 792 1 0
    //   1611: invokeinterface 521 1 0
    //   1616: checkcast 222	ad
    //   1619: getfield 435	ad:a	J
    //   1622: invokestatic 635	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   1625: invokevirtual 939	android/net/Uri$Builder:appendEncodedPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   1628: invokevirtual 943	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   1631: aconst_null
    //   1632: invokevirtual 168	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   1635: goto +54 -> 1689
    //   1638: iload 4
    //   1640: iconst_m1
    //   1641: if_icmpeq +55 -> 1696
    //   1644: aload_0
    //   1645: aload_1
    //   1646: lload_2
    //   1647: iload 4
    //   1649: lload 5
    //   1651: aload 8
    //   1653: invokevirtual 946	com/twitter/android/provider/ak:a	(Ljava/util/Collection;JIJLjava/lang/String;)V
    //   1656: goto +40 -> 1696
    //   1659: astore 29
    //   1661: aload 9
    //   1663: invokevirtual 412	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   1666: aload 29
    //   1668: athrow
    //   1669: iload 24
    //   1671: istore 26
    //   1673: goto -100 -> 1573
    //   1676: iconst_0
    //   1677: istore 24
    //   1679: goto -607 -> 1072
    //   1682: iload 32
    //   1684: istore 26
    //   1686: goto -113 -> 1573
    //   1689: iload 26
    //   1691: istore 11
    //   1693: goto -55 -> 1638
    //   1696: iload 11
    //   1698: istore 27
    //   1700: goto -1228 -> 472
    //
    // Exception table:
    //   from	to	target	type
    //   14	43	43	finally
    //   50	141	43	finally
    //   141	147	43	finally
    //   152	255	43	finally
    //   255	263	43	finally
    //   263	271	43	finally
    //   279	296	43	finally
    //   296	334	43	finally
    //   337	364	43	finally
    //   367	379	43	finally
    //   379	401	43	finally
    //   409	420	43	finally
    //   423	431	43	finally
    //   434	464	43	finally
    //   477	486	43	finally
    //   614	624	43	finally
    //   624	681	43	finally
    //   681	688	43	finally
    //   1063	1068	43	finally
    //   1072	1079	43	finally
    //   1530	1538	43	finally
    //   1549	1554	43	finally
    //   1559	1570	43	finally
    //   1578	1589	43	finally
    //   1595	1635	43	finally
    //   1644	1656	43	finally
    //   1661	1669	43	finally
    //   486	521	612	finally
    //   526	596	612	finally
    //   596	609	612	finally
    //   693	719	1528	finally
    //   722	1052	1528	finally
    //   1058	1063	1528	finally
    //   1093	1119	1659	finally
    //   1126	1390	1659	finally
    //   1395	1411	1659	finally
    //   1411	1435	1659	finally
    //   1438	1474	1659	finally
    //   1474	1483	1659	finally
    //   1483	1518	1659	finally
    //   1544	1549	1659	finally
  }

  public final int a(Collection paramCollection, long paramLong1, int paramInt, long paramLong2, boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "Merge statuses: " + paramCollection.size() + ", of type: " + paramInt + ", owned by: " + paramLong1 + ", merging older: " + paramBoolean2);
      if ((paramInt != -1) && (paramLong1 < 0L))
        throw new IllegalArgumentException("null owner id not allowed for type: " + paramInt);
    }
    finally
    {
    }
    int i;
    if (paramCollection.isEmpty())
    {
      if (paramBoolean2)
        a(paramLong1, paramInt, paramBoolean3);
      i = 0;
    }
    label673: int i2;
    int i4;
    while (true)
    {
      return i;
      if (paramString != null)
        a(3, paramInt, paramLong1, paramString);
      StringBuilder localStringBuilder = new StringBuilder(256);
      localStringBuilder.append("status_id").append(" IN(");
      HashMap localHashMap1 = new HashMap();
      Iterator localIterator1 = paramCollection.iterator();
      int j = 1;
      if (localIterator1.hasNext())
      {
        p localp6 = (p)localIterator1.next();
        if (j != 0)
          j = 0;
        while (true)
        {
          p localp7 = localp6.a();
          localStringBuilder.append(localp7.a);
          localHashMap1.put(Long.valueOf(localp7.a), localp6);
          break;
          localStringBuilder.append((char)',');
        }
      }
      localStringBuilder.append((char)')');
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      Cursor localCursor = localSQLiteDatabase.query("statuses", x.a, localStringBuilder.toString(), null, null, null, null);
      if (localCursor == null)
      {
        i = 0;
      }
      else
      {
        try
        {
          ContentValues localContentValues1 = new ContentValues();
          localSQLiteDatabase.beginTransaction();
          k = 0;
          while (localCursor.moveToNext())
          {
            localContentValues1.clear();
            localp4 = (p)localHashMap1.remove(Long.valueOf(localCursor.getLong(1)));
            if (localp4 != null)
            {
              localp5 = localp4.a();
              localContentValues1.put("favorited", Boolean.valueOf(localp5.l));
              localContentValues1.put("retweet_count", Integer.valueOf(localp5.o));
              l = localCursor.getLong(0);
              if (a)
                Log.d("DatabaseHelper", "Updating status at row id: " + l);
              arrayOfString = new String[1];
              arrayOfString[0] = Long.toString(l);
              k += localSQLiteDatabase.update("statuses", localContentValues1, "_id=?", arrayOfString);
            }
          }
          localSQLiteDatabase.setTransactionSuccessful();
          localCursor.close();
          localSQLiteDatabase.endTransaction();
          localHashMap2 = new HashMap();
          localIterator2 = paramCollection.iterator();
          while (true)
          {
            if (!localIterator2.hasNext())
              break label673;
            localp2 = (p)localIterator2.next();
            localad1 = localp2.m;
            if (localad1 == null)
              break;
            localHashMap2.put(Long.valueOf(localad1.a), localad1);
            localp3 = localp2.k;
            if (localp3 != null)
            {
              localad2 = localp3.m;
              if (localad2 != null)
                localHashMap2.put(Long.valueOf(localad2.a), localad2);
            }
          }
        }
        finally
        {
          localCursor.close();
          localSQLiteDatabase.endTransaction();
        }
        int k;
        HashMap localHashMap2;
        while (true)
        {
          p localp4;
          p localp5;
          long l;
          String[] arrayOfString;
          Iterator localIterator2;
          p localp2;
          ad localad1;
          p localp3;
          ad localad2;
          localHashMap1.remove(Long.valueOf(localp2.a));
        }
        a(localHashMap2.values(), -1L, -1, -1L, null, null);
        int m = localHashMap1.size();
        int n = 0;
        if (m > 0)
        {
          try
          {
            localSQLiteDatabase.beginTransaction();
            ContentValues localContentValues2 = new ContentValues();
            Iterator localIterator3 = localHashMap1.values().iterator();
            i2 = 0;
            if (localIterator3.hasNext())
            {
              p localp1 = (p)localIterator3.next();
              localContentValues2.clear();
              if (!a(localp1.a(), localContentValues2))
                break;
              if (localSQLiteDatabase.insert("statuses", "status_id", localContentValues2) <= 0L)
                break label949;
              i4 = 1;
              break label935;
            }
            localSQLiteDatabase.setTransactionSuccessful();
            localSQLiteDatabase.endTransaction();
            n = i2;
            if (a)
              Log.d("DatabaseHelper", "Inserted new statuses: " + n + ", of type: " + paramInt);
            if (paramInt != -1)
            {
              i = b(paramCollection, paramLong1, paramInt, paramLong2, paramBoolean1, paramBoolean2, paramString, true);
              if ((!paramBoolean3) || (i + (n + k) <= 0))
                continue;
              f();
              continue;
            }
          }
          finally
          {
            localSQLiteDatabase.endTransaction();
          }
        }
        else
        {
          int i1 = localHashMap1.size();
          i = i1;
        }
      }
    }
    int i3 = i2;
    while (true)
    {
      label935: i3 = i4 + i2;
      i2 = i3;
      break;
      label949: i4 = 0;
    }
  }

  public final int a(List paramList, long paramLong, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase;
    Cursor localCursor;
    HashMap localHashMap;
    try
    {
      localSQLiteDatabase = getWritableDatabase();
      localCursor = localSQLiteDatabase.query("stories", b.a, "query is null ", null, null, null, null);
      localHashMap = new HashMap();
      if (localCursor == null)
        break label115;
      while (true)
      {
        if (!localCursor.moveToNext())
          break label108;
        localInteger = Integer.valueOf(localCursor.getInt(1));
        if (localCursor.getInt(2) == 0)
          break;
        bool2 = true;
        localHashMap.put(localInteger, Boolean.valueOf(bool2));
      }
    }
    finally
    {
    }
    while (true)
    {
      Integer localInteger;
      boolean bool2 = false;
    }
    label108: localCursor.close();
    label115: localSQLiteDatabase.delete("stories", "query is null ", null);
    ArrayList localArrayList;
    if (paramList.size() > 0)
    {
      localArrayList = new ArrayList();
      try
      {
        localSQLiteDatabase.beginTransaction();
        ContentValues localContentValues = new ContentValues();
        Iterator localIterator = paramList.iterator();
        i = 0;
        j = 0;
        while (localIterator.hasNext())
        {
          localan = (an)localIterator.next();
          arrayOfByte = cr.a(localan.c);
          if (arrayOfByte != null)
          {
            localContentValues.put("type", Integer.valueOf(localan.a));
            localContentValues.put("score", Double.valueOf(localan.b));
            m = localan.e;
            localBoolean = (Boolean)localHashMap.get(Integer.valueOf(m));
            if (localBoolean == null);
            for (bool1 = localan.d; ; bool1 = localBoolean.booleanValue())
            {
              localContentValues.put("unread", Boolean.valueOf(bool1));
              localContentValues.put("identifier", Integer.valueOf(m));
              localContentValues.putNull("query");
              localContentValues.put("data", arrayOfByte);
              if ((j >= 3) || (!bool1))
                break;
              n = i + 1;
              j++;
              localSQLiteDatabase.insert("stories", null, localContentValues);
              localp = localan.c.f;
              if (localp == null)
                break label466;
              localArrayList.add(localp);
              break label466;
            }
          }
        }
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        if (!localArrayList.isEmpty())
          a(localArrayList, paramLong, 10, -1L, true, false, null, false);
        this.e.notifyChange(au.a, null);
        k = i;
        return k;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
    while (true)
    {
      int j;
      an localan;
      byte[] arrayOfByte;
      int m;
      Boolean localBoolean;
      boolean bool1;
      p localp;
      int n = i;
      continue;
      int k = 0;
      continue;
      label466: int i = n;
    }
  }

  public final int a(List paramList, long paramLong, int paramInt, boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "Merging messages: " + paramList.size() + " of type: " + paramInt + ", read: " + paramBoolean1 + ", last page: " + paramBoolean2 + ", next: " + paramString);
      if (paramString != null)
        a(4, paramInt, paramLong, paramString);
      if (paramList.isEmpty())
      {
        if (paramBoolean2)
          d(paramInt);
        i = 0;
        return i;
      }
      localLinkedHashMap = new LinkedHashMap();
      localStringBuilder1 = new StringBuilder(256);
      localStringBuilder1.append("msg_id").append(" IN(");
      j = 1;
      localIterator1 = paramList.iterator();
      while (true)
      {
        if (!localIterator1.hasNext())
          break label251;
        localcq3 = (cq)localIterator1.next();
        localLinkedHashMap.put(Long.valueOf(localcq3.a), localcq3);
        if (j == 0)
          break;
        j = 0;
        localStringBuilder1.append(localcq3.a);
      }
    }
    finally
    {
    }
    while (true)
    {
      int i;
      LinkedHashMap localLinkedHashMap;
      StringBuilder localStringBuilder1;
      int j;
      Iterator localIterator1;
      cq localcq3;
      localStringBuilder1.append((char)',');
      continue;
      label251: localStringBuilder1.append((char)')');
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      Cursor localCursor = localSQLiteDatabase.query("messages", e.a, localStringBuilder1.toString(), null, null, null, null);
      if (localCursor == null)
      {
        i = 0;
      }
      else
      {
        try
        {
          if (localCursor.moveToNext())
            localLinkedHashMap.remove(Long.valueOf(localCursor.getLong(0)));
        }
        finally
        {
          localCursor.close();
        }
        int k;
        if (localLinkedHashMap.isEmpty())
        {
          if (paramBoolean2)
            d(paramInt);
        }
        else
        {
          if (a)
            Log.d("DatabaseHelper", "Inserting new messages: " + localLinkedHashMap.size());
          HashMap localHashMap = new HashMap();
          Iterator localIterator2 = localLinkedHashMap.values().iterator();
          while (localIterator2.hasNext())
          {
            cq localcq2 = (cq)localIterator2.next();
            localHashMap.put(Long.valueOf(localcq2.d.a), localcq2.d);
            localHashMap.put(Long.valueOf(localcq2.e.a), localcq2.e);
          }
          a(localHashMap.values(), -1L, -1, -1L, null, null);
          k = localLinkedHashMap.size();
          if (k <= 0)
            break label936;
          if (paramString == null)
            j(paramLong);
          try
          {
            localSQLiteDatabase.beginTransaction();
            m = 0;
            localContentValues = new ContentValues();
            localContentValues.put("type", Integer.valueOf(paramInt));
            if (paramBoolean1)
            {
              n = 1;
              localContentValues.put("is_read", Integer.valueOf(n));
              localStringBuilder2 = new StringBuilder();
              localIterator3 = localLinkedHashMap.values().iterator();
              while (true)
              {
                if (!localIterator3.hasNext())
                  break label875;
                localcq1 = (cq)localIterator3.next();
                m++;
                localad1 = localcq1.d;
                localad2 = localcq1.e;
                localStringBuilder2.append(Math.min(localad1.a, localad2.a)).append((char)':').append(Math.max(localad1.a, localad2.a));
                localContentValues.put("thread", localStringBuilder2.toString());
                localContentValues.put("msg_id", Long.valueOf(localcq1.a));
                localContentValues.put("content", localcq1.b);
                localContentValues.put("created", Long.valueOf(localcq1.c));
                localContentValues.put("recipient_id", Long.valueOf(localad2.a));
                localContentValues.put("sender_id", Long.valueOf(localad1.a));
                if ((!paramBoolean2) || (m != k))
                  break;
                bool = true;
                localContentValues.put("is_last", Boolean.valueOf(bool));
                if (localcq1.f != null)
                  localContentValues.put("entities", localcq1.f.a());
                localSQLiteDatabase.insert("messages", "msg_id", localContentValues);
                localStringBuilder2.delete(0, localStringBuilder2.length());
              }
            }
          }
          finally
          {
            localSQLiteDatabase.endTransaction();
          }
          while (true)
          {
            int m;
            ContentValues localContentValues;
            StringBuilder localStringBuilder2;
            Iterator localIterator3;
            cq localcq1;
            ad localad1;
            ad localad2;
            int n = 0;
            continue;
            boolean bool = false;
          }
          label875: localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          ContentResolver localContentResolver = this.e;
          if (paramInt == 1)
            localContentResolver.notifyChange(ac.a, null);
          while (true)
          {
            localContentResolver.notifyChange(l.a, null);
            break;
            localContentResolver.notifyChange(ac.b, null);
          }
        }
        i = 0;
        continue;
        label936: i = k;
      }
    }
  }

  public final int a(long[] paramArrayOfLong)
  {
    int i = 0;
    SQLiteDatabase localSQLiteDatabase;
    try
    {
      localSQLiteDatabase = getWritableDatabase();
      if (paramArrayOfLong != null)
      {
        j = paramArrayOfLong.length;
        if (j > 0)
          try
          {
            localSQLiteDatabase.beginTransaction();
            localContentValues = new ContentValues();
            localContentValues.put("unread", Integer.valueOf(0));
            m = paramArrayOfLong.length;
            for (n = 0; n < m; n++)
            {
              localLong = Long.valueOf(paramArrayOfLong[n]);
              arrayOfString = new String[1];
              arrayOfString[0] = localLong.toString();
              i += localSQLiteDatabase.update("stories", localContentValues, "_id=?", arrayOfString);
            }
            localSQLiteDatabase.setTransactionSuccessful();
            localSQLiteDatabase.endTransaction();
            k = i;
            return k;
          }
          finally
          {
            localSQLiteDatabase.endTransaction();
          }
      }
    }
    finally
    {
    }
    while (true)
    {
      int j;
      ContentValues localContentValues;
      int m;
      int n;
      Long localLong;
      String[] arrayOfString;
      int k = 0;
    }
  }

  public final long a(int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
    String[] arrayOfString1 = e.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = Integer.toString(paramInt);
    Cursor localCursor = localSQLiteDatabase.query("messages", arrayOfString1, "type=?", arrayOfString2, null, null, "created DESC", "1");
    if (localCursor != null)
    {
      try
      {
        if (localCursor.moveToFirst())
        {
          long l2 = localCursor.getLong(0);
          l1 = l2;
          return l1;
        }
      }
      finally
      {
        localCursor.close();
      }
      while (true)
        long l1 = 0L;
    }
    return 0L;
  }

  public final long a(long paramLong1, String paramString, long paramLong2, long paramLong3, be parambe)
  {
    try
    {
      long l = a(getWritableDatabase(), paramLong1, paramString, paramLong2, paramLong3, parambe);
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long a(dn paramdn, int paramInt)
  {
    try
    {
      long l1 = b(paramdn, paramInt);
      if (l1 > 0L)
        switch (paramInt)
        {
        default:
          a(paramdn, l1);
        case 1:
        case 6:
        case 7:
        }
      while (true)
      {
        return l1;
        long l2 = c(paramdn, paramInt);
        l1 = l2;
      }
    }
    finally
    {
    }
  }

  public final long a(dn paramdn, List paramList, long paramLong, boolean paramBoolean)
  {
    try
    {
      long l = a(paramdn, 4);
      if (paramBoolean);
      for (String str = "0"; ; str = null)
      {
        a(paramList, paramLong, 3, l, null, str);
        return l;
      }
    }
    finally
    {
    }
  }

  public final long a(String paramString, int paramInt)
  {
    try
    {
      String[] arrayOfString1 = { "query_id" };
      String[] arrayOfString2 = new String[2];
      arrayOfString2[0] = paramString;
      arrayOfString2[1] = Integer.toString(6);
      long l = a(arrayOfString1, "query=? AND type=?", arrayOfString2);
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long a(byte[] paramArrayOfByte)
  {
    try
    {
      ContentValues localContentValues = new ContentValues(1);
      localContentValues.put("log", paramArrayOfByte);
      long l = getWritableDatabase().insert("scribe", "log", localContentValues);
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String a(int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    String str;
    switch (paramInt3)
    {
    default:
      try
      {
        throw new IllegalArgumentException("Invalid page type: " + paramInt3);
      }
      finally
      {
      }
    case 0:
      if (a)
        Log.d("DatabaseHelper", "getCursor(): start cursor for type: " + paramInt2 + ", kind: " + paramInt1 + ", owner id: " + paramLong);
      str = "-1";
    case 1:
    }
    while (true)
    {
      return str;
      str = a(paramInt1, paramInt2, paramLong);
      if (a)
        Log.d("DatabaseHelper", "getCursor(): next cursor for type: " + paramInt2 + ", kind: " + paramInt1 + ", owner id: " + paramLong + " -> " + str);
    }
  }

  public final ArrayList a(ArrayList paramArrayList, long paramLong, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    ArrayList localArrayList1;
    try
    {
      localArrayList1 = new ArrayList();
      int i = paramArrayList.size();
      if (i == 0)
      {
        if (paramBoolean2)
          e(paramInt);
        localArrayList2 = localArrayList1;
        return localArrayList2;
      }
      localLinkedHashMap1 = new LinkedHashMap(i);
      Iterator localIterator1 = paramArrayList.iterator();
      while (localIterator1.hasNext())
      {
        ae localae4 = (ae)localIterator1.next();
        localLinkedHashMap1.put(Long.valueOf(localae4.b), localae4);
      }
    }
    finally
    {
    }
    ArrayList localArrayList2;
    LinkedHashMap localLinkedHashMap1;
    StringBuilder localStringBuilder = new StringBuilder(256).append("created_at").append(" IN(");
    int j = 1;
    Iterator localIterator2 = paramArrayList.iterator();
    if (localIterator2.hasNext())
    {
      ae localae3 = (ae)localIterator2.next();
      if (j != 0)
        j = 0;
      while (true)
      {
        localStringBuilder.append(localae3.b);
        break;
        localStringBuilder.append((char)',');
      }
    }
    localStringBuilder.append((char)')');
    SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
    Cursor localCursor = localSQLiteDatabase.query("activities", ap.a, localStringBuilder.toString(), null, null, null, null);
    if (localCursor != null)
    {
      while (localCursor.moveToNext())
      {
        Long localLong = Long.valueOf(localCursor.getLong(0));
        ae localae2 = (ae)localLinkedHashMap1.get(localLong);
        if (localCursor.getInt(1) == localae2.a)
          localLinkedHashMap1.remove(localLong);
      }
      localCursor.close();
    }
    HashMap localHashMap1;
    LinkedHashMap localLinkedHashMap2;
    HashMap localHashMap2;
    HashMap localHashMap3;
    if (localLinkedHashMap1.isEmpty())
    {
      if (paramBoolean2)
        e(paramInt);
    }
    else
    {
      localHashMap1 = new HashMap();
      localLinkedHashMap2 = new LinkedHashMap();
      localHashMap2 = new HashMap();
      localHashMap3 = new HashMap();
      try
      {
        localSQLiteDatabase.beginTransaction();
        int k = localLinkedHashMap1.size();
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("type", Integer.valueOf(paramInt));
        Iterator localIterator3 = localLinkedHashMap1.values().iterator();
        l1 = 0L;
        l2 = -1L;
        m = 0;
        if (localIterator3.hasNext())
        {
          localae1 = (ae)localIterator3.next();
          m++;
          localContentValues.put("event", Integer.valueOf(localae1.a));
          localContentValues.put("created_at", Long.valueOf(localae1.b));
          localContentValues.put("max_position", Long.valueOf(localae1.c));
          localContentValues.put("min_position", Long.valueOf(localae1.d));
          localContentValues.put("sources_size", Integer.valueOf(localae1.e));
          localContentValues.put("source_type", Integer.valueOf(localae1.f));
          localContentValues.put("sources", a(localae1.f, localae1.g));
          localContentValues.put("targets_size", Integer.valueOf(localae1.h));
          localContentValues.put("target_type", Integer.valueOf(localae1.i));
          localContentValues.put("targets", a(localae1.i, localae1.j));
          localContentValues.put("target_objects_size", Integer.valueOf(localae1.k));
          localContentValues.put("target_object_type", Integer.valueOf(localae1.l));
          localContentValues.put("target_objects", a(localae1.l, localae1.m));
          if ((paramBoolean2) && (m == k))
          {
            bool = true;
            localContentValues.put("is_last", Boolean.valueOf(bool));
            if (localSQLiteDatabase.insert("activities", "created_at", localContentValues) <= 0L)
              break label1498;
            localArrayList1.add(localae1);
            if (l2 != -1L)
              break label1491;
            l7 = localae1.b;
            if (localae1.f != 1)
              break label815;
            localIterator11 = localae1.g.iterator();
            while (localIterator11.hasNext())
            {
              localad2 = (ad)localIterator11.next();
              localHashMap1.put(Long.valueOf(localad2.a), localad2);
            }
          }
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
    while (true)
    {
      long l1;
      long l2;
      int m;
      ae localae1;
      long l7;
      label737: Iterator localIterator11;
      ad localad2;
      boolean bool = false;
      continue;
      label815: switch (localae1.i)
      {
      default:
      case 2:
        while (true)
          switch (localae1.l)
          {
          case 2:
            if ((paramInt != 0) || (3 != localae1.a))
              break label965;
            Object localObject4 = null;
            Iterator localIterator9 = localae1.j.iterator();
            while (localIterator9.hasNext())
            {
              p localp3 = (p)localIterator9.next();
              localLinkedHashMap2.put(Long.valueOf(localp3.a), localp3);
              localObject4 = localp3;
            }
            if (localObject4 != null)
              l1 = localObject4.a;
          case 3:
          }
        Iterator localIterator10 = localae1.j.iterator();
        while (localIterator10.hasNext())
        {
          p localp4 = (p)localIterator10.next();
          localHashMap2.put(Long.valueOf(localp4.a), localp4);
        }
      case 1:
        label965: Iterator localIterator8 = localae1.j.iterator();
        while (localIterator8.hasNext())
        {
          ad localad1 = (ad)localIterator8.next();
          localHashMap1.put(Long.valueOf(localad1.a), localad1);
        }
      case 3:
      }
      Iterator localIterator4 = localae1.j.iterator();
      while (localIterator4.hasNext())
      {
        cv localcv1 = (cv)localIterator4.next();
        localHashMap3.put(Long.valueOf(localcv1.a()), localcv1);
      }
      if ((paramInt == 0) && (2 == localae1.a))
      {
        Object localObject3 = null;
        Iterator localIterator6 = localae1.m.iterator();
        while (localIterator6.hasNext())
        {
          p localp1 = (p)localIterator6.next();
          localLinkedHashMap2.put(Long.valueOf(localp1.a), localp1);
          localObject3 = localp1;
        }
        if (localObject3 != null)
        {
          l1 = localObject3.a;
          l2 = l7;
        }
      }
      else
      {
        Iterator localIterator7 = localae1.m.iterator();
        while (localIterator7.hasNext())
        {
          p localp2 = (p)localIterator7.next();
          localHashMap2.put(Long.valueOf(localp2.a), localp2);
        }
        Iterator localIterator5 = localae1.m.iterator();
        while (true)
          if (localIterator5.hasNext())
          {
            cv localcv2 = (cv)localIterator5.next();
            localHashMap3.put(Long.valueOf(localcv2.a()), localcv2);
            continue;
            localSQLiteDatabase.setTransactionSuccessful();
            localSQLiteDatabase.endTransaction();
            if (!localHashMap1.isEmpty())
              a(localHashMap1.values(), paramLong, 8, l2, null, null);
            if (!localHashMap2.isEmpty())
              a(localHashMap2.values(), paramLong, 12, l2, false, false, null, false);
            if (!localLinkedHashMap2.isEmpty())
              if (!paramBoolean1)
                break label1485;
            label1485: for (String str = String.valueOf(l1); ; str = null)
            {
              a(localLinkedHashMap2.values(), paramLong, 5, -1L, paramBoolean1, paramBoolean1, str, true);
              if (!localHashMap3.isEmpty())
                a(localHashMap3.values(), paramLong, 3, null);
              if (!localArrayList1.isEmpty())
              {
                if (!paramBoolean1)
                  h(paramLong, paramInt);
                this.e.notifyChange(u.a, null);
              }
              localArrayList2 = localArrayList1;
              break;
            }
            label1491: l7 = l2;
            break label737;
            label1498: long l3 = l1;
            l4 = l2;
            l5 = l3;
            break label1532;
            localArrayList2 = localArrayList1;
            break;
          }
        long l8 = l1;
        long l4 = l7;
        long l5 = l8;
        label1532: long l6 = l5;
        l2 = l4;
        l1 = l6;
        continue;
        l2 = l7;
      }
    }
  }

  // ERROR //
  public final p a(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 209	com/twitter/android/provider/ak:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   6: astore 4
    //   8: getstatic 1151	com/twitter/android/provider/ab:a	[Ljava/lang/String;
    //   11: astore 5
    //   13: iconst_1
    //   14: anewarray 54	java/lang/String
    //   17: astore 6
    //   19: aload 6
    //   21: iconst_0
    //   22: lload_1
    //   23: invokestatic 254	java/lang/Long:toString	(J)Ljava/lang/String;
    //   26: aastore
    //   27: aload 4
    //   29: ldc 52
    //   31: aload 5
    //   33: ldc_w 1153
    //   36: aload 6
    //   38: aconst_null
    //   39: aconst_null
    //   40: aconst_null
    //   41: invokevirtual 85	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   44: astore 7
    //   46: aload 7
    //   48: ifnull +346 -> 394
    //   51: aload 7
    //   53: invokeinterface 91 1 0
    //   58: ifeq +314 -> 372
    //   61: aload_0
    //   62: aload 7
    //   64: iconst_1
    //   65: invokeinterface 95 2 0
    //   70: invokespecial 1155	com/twitter/android/provider/ak:g	(J)Lad;
    //   73: astore 10
    //   75: aload 10
    //   77: ifnonnull +51 -> 128
    //   80: ldc 18
    //   82: new 58	java/lang/StringBuilder
    //   85: dup
    //   86: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   89: ldc_w 1157
    //   92: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: aload 7
    //   97: iconst_1
    //   98: invokeinterface 95 2 0
    //   103: invokevirtual 68	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   106: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   109: invokestatic 1160	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   112: pop
    //   113: aload 7
    //   115: invokeinterface 104 1 0
    //   120: aconst_null
    //   121: astore 8
    //   123: aload_0
    //   124: monitorexit
    //   125: aload 8
    //   127: areturn
    //   128: aload 7
    //   130: bipush 14
    //   132: invokeinterface 1164 2 0
    //   137: ifeq +178 -> 315
    //   140: aconst_null
    //   141: astore 12
    //   143: aload 7
    //   145: iconst_0
    //   146: invokeinterface 95 2 0
    //   151: lstore 13
    //   153: aload 7
    //   155: iconst_2
    //   156: invokeinterface 95 2 0
    //   161: lstore 15
    //   163: aload 7
    //   165: bipush 9
    //   167: invokeinterface 220 2 0
    //   172: astore 17
    //   174: aload 7
    //   176: bipush 10
    //   178: invokeinterface 220 2 0
    //   183: astore 18
    //   185: aload 7
    //   187: iconst_3
    //   188: invokeinterface 220 2 0
    //   193: astore 19
    //   195: aload 7
    //   197: bipush 12
    //   199: invokeinterface 95 2 0
    //   204: lstore 20
    //   206: aload 7
    //   208: bipush 11
    //   210: invokeinterface 95 2 0
    //   215: lstore 22
    //   217: aload 7
    //   219: iconst_4
    //   220: invokeinterface 215 2 0
    //   225: iconst_1
    //   226: if_icmpne +140 -> 366
    //   229: iconst_1
    //   230: istore 24
    //   232: new 418	p
    //   235: dup
    //   236: lload 13
    //   238: lload 15
    //   240: aload 17
    //   242: aload 18
    //   244: aload 19
    //   246: lload 20
    //   248: lload 22
    //   250: iload 24
    //   252: aload 7
    //   254: bipush 7
    //   256: invokeinterface 220 2 0
    //   261: aload 7
    //   263: bipush 8
    //   265: invokeinterface 220 2 0
    //   270: aload 12
    //   272: aconst_null
    //   273: aload 10
    //   275: aconst_null
    //   276: aload 7
    //   278: bipush 13
    //   280: invokeinterface 215 2 0
    //   285: aconst_null
    //   286: aload 7
    //   288: iconst_2
    //   289: invokeinterface 215 2 0
    //   294: i2l
    //   295: invokespecial 1167	p:<init>	(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;Lap;Lp;Lad;Lbe;ILjava/lang/String;J)V
    //   298: astore 8
    //   300: aload 7
    //   302: invokeinterface 104 1 0
    //   307: goto -184 -> 123
    //   310: astore_3
    //   311: aload_0
    //   312: monitorexit
    //   313: aload_3
    //   314: athrow
    //   315: new 474	ap
    //   318: dup
    //   319: aload 7
    //   321: bipush 15
    //   323: invokeinterface 220 2 0
    //   328: aload 7
    //   330: bipush 14
    //   332: invokeinterface 215 2 0
    //   337: aload 7
    //   339: iconst_5
    //   340: invokeinterface 220 2 0
    //   345: aload 7
    //   347: bipush 6
    //   349: invokeinterface 220 2 0
    //   354: invokespecial 1170	ap:<init>	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    //   357: astore 25
    //   359: aload 25
    //   361: astore 12
    //   363: goto -220 -> 143
    //   366: iconst_0
    //   367: istore 24
    //   369: goto -137 -> 232
    //   372: aload 7
    //   374: invokeinterface 104 1 0
    //   379: goto +15 -> 394
    //   382: astore 9
    //   384: aload 7
    //   386: invokeinterface 104 1 0
    //   391: aload 9
    //   393: athrow
    //   394: aconst_null
    //   395: astore 8
    //   397: goto -274 -> 123
    //
    // Exception table:
    //   from	to	target	type
    //   2	46	310	finally
    //   113	120	310	finally
    //   300	307	310	finally
    //   372	379	310	finally
    //   384	394	310	finally
    //   51	75	382	finally
    //   80	113	382	finally
    //   128	140	382	finally
    //   143	229	382	finally
    //   232	300	382	finally
    //   315	359	382	finally
  }

  public final void a(int paramInt, long paramLong1, long paramLong2)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "Removing user: " + paramLong2 + ", owned by: " + paramLong1 + ", of type: " + paramInt);
      localSQLiteDatabase = getWritableDatabase();
      arrayOfString1 = new String[3];
      arrayOfString1[0] = Long.toString(paramLong1);
      arrayOfString1[1] = Integer.toString(paramInt);
      arrayOfString1[2] = Long.toString(paramLong2);
      localSQLiteDatabase.delete("user_groups", "owner_id=? AND type=? AND user_id=?", arrayOfString1);
      switch (paramInt)
      {
      default:
      case 0:
      }
      do
      {
        this.e.notifyChange(aj.a, null);
        return;
        arrayOfString2 = bb.a;
        arrayOfString3 = new String[2];
        arrayOfString3[0] = Long.toString(paramLong1);
        arrayOfString3[1] = Long.toString(paramLong2);
        localCursor = localSQLiteDatabase.query("status_groups LEFT JOIN statuses ON status_groups.g_status_id=statuses.status_id", arrayOfString2, "owner_id=? AND author_id=?", arrayOfString3, null, null, null);
      }
      while (localCursor == null);
      try
      {
        if (localCursor.getCount() > 0)
        {
          localStringBuilder = new StringBuilder(256);
          localStringBuilder.append("g_status_id").append(" IN(");
          i = 1;
          while (true)
          {
            if (!localCursor.moveToNext())
              break label295;
            if (i == 0)
              break;
            i = 0;
            localStringBuilder.append(localCursor.getLong(0));
          }
        }
      }
      finally
      {
        localCursor.close();
      }
    }
    finally
    {
    }
    while (true)
    {
      SQLiteDatabase localSQLiteDatabase;
      String[] arrayOfString1;
      String[] arrayOfString2;
      String[] arrayOfString3;
      Cursor localCursor;
      StringBuilder localStringBuilder;
      int i;
      localStringBuilder.append((char)',');
      continue;
      label295: localStringBuilder.append((char)')');
      localStringBuilder.append(" AND ");
      localStringBuilder.append("owner_id");
      localStringBuilder.append((char)'=').append(Long.toString(paramLong1));
      int j = localSQLiteDatabase.delete("status_groups", localStringBuilder.toString(), null);
      if (j > 0)
      {
        if (a)
          Log.d("DatabaseHelper", "Deleted old friend statuses: " + j);
        a(paramLong1, paramInt, 3);
        f();
      }
      localCursor.close();
    }
  }

  public final void a(int paramInt, long paramLong1, long paramLong2, cv paramcv)
  {
    long l;
    try
    {
      l = paramcv.a();
      if (a)
        Log.d("DatabaseHelper", "Removing list user " + paramLong2 + ", of type: " + paramInt + ", from list id: " + l);
      localSQLiteDatabase = getWritableDatabase();
      arrayOfString1 = new String[3];
      arrayOfString1[0] = Long.toString(paramLong1);
      arrayOfString1[1] = Integer.toString(paramInt);
      arrayOfString1[2] = Long.toString(paramLong2);
      localSQLiteDatabase.delete("user_groups", "owner_id=? AND type=? AND user_id=?", arrayOfString1);
      localContentResolver = this.e;
      switch (paramInt)
      {
      default:
      case 4:
        while (true)
        {
          if (paramInt == 5)
            a(paramcv);
          localContentResolver.notifyChange(aj.a, null);
          return;
          str = "owner_id=? AND type=? AND tag=? AND " + paramLong2 + " IN (SELECT " + "author_id" + " FROM " + "statuses" + " WHERE " + "g_status_id" + '=' + "status_id" + ')';
          arrayOfString3 = new String[3];
          arrayOfString3[0] = Long.toString(paramLong1);
          arrayOfString3[1] = Integer.toString(9);
          arrayOfString3[2] = Long.toString(l);
          if (localSQLiteDatabase.delete("status_groups", str, arrayOfString3) > 0)
            f();
        }
      case 5:
      }
    }
    finally
    {
    }
    while (true)
    {
      SQLiteDatabase localSQLiteDatabase;
      String[] arrayOfString1;
      ContentResolver localContentResolver;
      String str;
      String[] arrayOfString3;
      if (a)
        Log.d("DatabaseHelper", "Removing subscriber list: " + l + ", owned by: " + paramLong2);
      String[] arrayOfString2 = new String[3];
      arrayOfString2[0] = Long.toString(paramLong1);
      arrayOfString2[1] = Integer.toString(2);
      arrayOfString2[2] = Long.toString(l);
      int i = localSQLiteDatabase.delete("lists", "owner_id=? AND type=? AND list_id=?", arrayOfString2);
      b(l, false);
      if (i > 0)
        localContentResolver.notifyChange(aq.a, null);
    }
  }

  public final void a(long paramLong, int paramInt)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "setFriendship: " + paramLong + " friendship: " + paramInt);
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("friendship", Integer.valueOf(paramInt));
      localContentValues.put("friendship_time", Long.valueOf(System.currentTimeMillis()));
      String[] arrayOfString = new String[1];
      arrayOfString[0] = Long.toString(paramLong);
      localSQLiteDatabase.update("users", localContentValues, "user_id=?", arrayOfString);
      return;
    }
    finally
    {
    }
  }

  public final void a(long paramLong1, int paramInt, long paramLong2, long paramLong3)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "deleteOldStatuses: owner id: " + paramLong1 + ", type: " + paramInt + ", statusId: " + paramLong3);
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      String[] arrayOfString = new String[4];
      arrayOfString[0] = Long.toString(paramLong1);
      arrayOfString[1] = Integer.toString(paramInt);
      arrayOfString[2] = Long.toString(-1L);
      arrayOfString[3] = Long.toString(paramLong3);
      int i = localSQLiteDatabase.delete("status_groups", "owner_id=? AND type=? AND tag=? AND g_status_id<?", arrayOfString);
      if (a)
        Log.d("DatabaseHelper", "deleteOldStatuses: Deleted: " + i);
      return;
    }
    finally
    {
    }
  }

  public final void a(long paramLong1, long paramLong2, long paramLong3, int paramInt)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      long l = a(localSQLiteDatabase, 2954291678L, 2954391678L);
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("status_id", Long.valueOf(l));
      localContentValues.put("created", Long.valueOf(paramLong3));
      localSQLiteDatabase.insert("statuses", "status_id", localContentValues);
      localContentValues.clear();
      localContentValues.put("owner_id", Long.valueOf(paramLong1));
      localContentValues.put("type", Integer.valueOf(0));
      localContentValues.put("tag", Integer.valueOf(-1));
      localContentValues.put("ref_id", Long.valueOf(paramLong2));
      localContentValues.put("is_read", Integer.valueOf(1));
      localContentValues.put("timeline", Boolean.valueOf(false));
      localContentValues.put("tweet_type", Integer.valueOf(2));
      localContentValues.put("updated_at", Long.valueOf(paramLong3));
      localContentValues.put("g_status_id", Long.valueOf(l));
      localContentValues.put("is_last", Boolean.valueOf(false));
      localSQLiteDatabase.insert("status_groups", "g_status_id", localContentValues);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(long paramLong1, long paramLong2, boolean paramBoolean)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "Unfavorite status: " + paramLong2 + ", owned by: " + paramLong1);
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = Long.toString(paramLong2);
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("favorited", Boolean.valueOf(paramBoolean));
      localSQLiteDatabase.update("statuses", localContentValues, "status_id=?", arrayOfString1);
      if (!paramBoolean)
      {
        String[] arrayOfString2 = new String[3];
        arrayOfString2[0] = Long.toString(paramLong1);
        arrayOfString2[1] = Integer.toString(2);
        arrayOfString2[2] = Long.toString(paramLong2);
        localSQLiteDatabase.delete("status_groups", "owner_id=? AND type=? AND g_status_id=?", arrayOfString2);
      }
      f();
      return;
    }
    finally
    {
    }
  }

  public final void a(long paramLong, ad paramad, int paramInt, cv paramcv)
  {
    try
    {
      ArrayList localArrayList1 = new ArrayList();
      localArrayList1.add(paramad);
      a(localArrayList1, paramcv.h().a, paramInt, paramcv.a(), null, null);
      switch (paramInt)
      {
      default:
      case 4:
        while (true)
        {
          return;
          a(paramcv);
        }
      case 5:
      }
    }
    finally
    {
    }
    while (true)
    {
      ArrayList localArrayList2 = new ArrayList();
      localArrayList2.add(paramcv);
      a(localArrayList2, paramLong, 2, null);
      b(paramcv.a(), true);
      this.e.notifyChange(aq.a, null);
    }
  }

  public final void a(long paramLong, p paramp)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "Removing status: " + paramp.a + ", owned by: " + paramLong);
      localSQLiteDatabase = getWritableDatabase();
      str1 = Long.toString(paramLong);
      arrayOfString1 = new String[3];
      arrayOfString1[0] = str1;
      arrayOfString1[1] = str1;
      arrayOfString1[2] = Long.toString(paramp.a);
      localp = paramp.k;
      if (localp == null)
        i = 0 + localSQLiteDatabase.delete("status_groups", "owner_id=? AND sender_id=? AND ref_id=?", arrayOfString1);
      while (true)
      {
        if (i > 0)
          f();
        return;
        str2 = Long.toString(localp.a);
        arrayOfString2 = new String[] { "sender_id", "ref_id", "updated_at" };
        arrayOfString3 = new String[3];
        arrayOfString3[0] = str1;
        arrayOfString3[1] = Integer.toString(7);
        arrayOfString3[2] = str2;
        localCursor = localSQLiteDatabase.query("status_groups_view", arrayOfString2, "owner_id=? AND type=? AND g_status_id=?", arrayOfString3, null, null, null);
        if (localCursor != null)
          try
          {
            localContentValues = new ContentValues(3);
            if (localCursor.moveToFirst())
            {
              localContentValues.put("sender_id", Long.valueOf(localCursor.getLong(0)));
              localContentValues.put("ref_id", Long.valueOf(localCursor.getLong(1)));
              localContentValues.put("updated_at", Long.valueOf(localCursor.getLong(2)));
            }
            while (true)
            {
              n = localSQLiteDatabase.update("status_groups", localContentValues, "owner_id=? AND sender_id=? AND ref_id=?", arrayOfString1);
              i1 = n + 0;
              localCursor.close();
              j = i1;
              arrayOfString4 = new String[3];
              arrayOfString4[0] = str1;
              arrayOfString4[1] = Integer.toString(6);
              arrayOfString4[2] = str2;
              k = j + localSQLiteDatabase.delete("status_groups", "owner_id=? AND type=? AND g_status_id=?", arrayOfString4);
              arrayOfString5 = new String[3];
              arrayOfString5[0] = str1;
              arrayOfString5[1] = Integer.toString(1);
              arrayOfString5[2] = str2;
              m = localSQLiteDatabase.delete("status_groups", "owner_id=? AND type=? AND g_status_id=?", arrayOfString5);
              i = m + k;
              break;
              localContentValues.put("sender_id", Long.valueOf(localp.m.a));
              localContentValues.put("ref_id", Long.valueOf(localp.a));
              localContentValues.put("updated_at", Long.valueOf(localp.e));
              localContentValues.put("tweet_type", Integer.valueOf(0));
            }
          }
          finally
          {
            localCursor.close();
          }
      }
    }
    finally
    {
    }
    while (true)
    {
      SQLiteDatabase localSQLiteDatabase;
      String str1;
      String[] arrayOfString1;
      p localp;
      int i;
      String str2;
      String[] arrayOfString2;
      String[] arrayOfString3;
      Cursor localCursor;
      ContentValues localContentValues;
      int n;
      int i1;
      String[] arrayOfString4;
      int k;
      String[] arrayOfString5;
      int m;
      int j = 0;
    }
  }

  public final void a(long paramLong, boolean paramBoolean)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "updateFriendship: " + paramLong + " is friend: " + paramBoolean);
      String[] arrayOfString = new String[1];
      arrayOfString[0] = Long.toString(paramLong);
      a("user_id=?", arrayOfString, paramBoolean);
      return;
    }
    finally
    {
    }
  }

  public final void a(ArrayList paramArrayList, boolean paramBoolean)
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder("user_id").append(" IN (");
      i = 0;
      j = paramArrayList.size();
      if (i < j)
      {
        localStringBuilder.append(paramArrayList.get(i));
        if (i < j - 1)
          localStringBuilder.append((char)',');
      }
      else
      {
        localStringBuilder.append((char)')');
        a(localStringBuilder.toString(), null, true);
        return;
      }
    }
    finally
    {
    }
    while (true)
    {
      int i;
      int j;
      i++;
    }
  }

  public final void a(Collection paramCollection, long paramLong1, int paramInt, long paramLong2, String paramString)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "mergeUserGroups: " + paramCollection.size() + ", owned by: " + paramLong1 + ", of type: " + paramInt + ", next: " + paramString);
      if ((paramInt == -1) || (paramLong1 < 0L));
      while (true)
      {
        return;
        if (paramString != null)
          a(1, paramInt, paramLong1, paramString);
        if (!paramCollection.isEmpty())
          break;
        if ("0".equals(paramString))
          e(paramLong1, paramInt);
      }
    }
    finally
    {
    }
    while (true)
    {
      LinkedHashMap localLinkedHashMap = new LinkedHashMap();
      Iterator localIterator1 = paramCollection.iterator();
      while (localIterator1.hasNext())
      {
        ad localad2 = (ad)localIterator1.next();
        localLinkedHashMap.put(Long.valueOf(localad2.a), localad2);
      }
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      String[] arrayOfString1 = d.a;
      String[] arrayOfString2 = new String[2];
      arrayOfString2[0] = Long.toString(paramLong1);
      arrayOfString2[1] = Integer.toString(paramInt);
      Cursor localCursor = localSQLiteDatabase.query("user_groups", arrayOfString1, "owner_id=? AND type=?", arrayOfString2, null, null, null);
      if (localCursor != null)
      {
        try
        {
          if (localCursor.moveToNext())
            localLinkedHashMap.remove(Long.valueOf(localCursor.getLong(0)));
        }
        finally
        {
          localCursor.close();
        }
        if (a)
          Log.d("DatabaseHelper", "Inserting new user groups: " + localLinkedHashMap.size());
        int i = localLinkedHashMap.size();
        if (i > 0)
        {
          try
          {
            localSQLiteDatabase.beginTransaction();
            j = 0;
            localContentValues = new ContentValues();
            localContentValues.put("owner_id", Long.valueOf(paramLong1));
            localContentValues.put("type", Integer.valueOf(paramInt));
            localContentValues.put("tag", Long.valueOf(paramLong2));
            localIterator2 = localLinkedHashMap.values().iterator();
            while (true)
            {
              if (!localIterator2.hasNext())
                break label525;
              localad1 = (ad)localIterator2.next();
              j++;
              localContentValues.put("user_id", Long.valueOf(localad1.a));
              if ((j != i) || (!"0".equals(paramString)))
                break;
              bool = true;
              localContentValues.put("is_last", Boolean.valueOf(bool));
              localSQLiteDatabase.insert("user_groups", "user_id", localContentValues);
            }
          }
          finally
          {
            localSQLiteDatabase.endTransaction();
          }
          while (true)
          {
            int j;
            ContentValues localContentValues;
            Iterator localIterator2;
            ad localad1;
            boolean bool = false;
          }
          label525: localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          this.e.notifyChange(aj.a, null);
        }
      }
    }
  }

  public final void a(Collection paramCollection, long paramLong, int paramInt, String paramString)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "Merging lists: " + paramCollection.size() + ", owned by: " + paramLong + ", type: " + paramInt + ", next: " + paramString);
      if (paramLong < 0L)
        throw new IllegalArgumentException("null owner id not allowed for lists");
    }
    finally
    {
    }
    if (paramString != null)
      a(2, paramInt, paramLong, paramString);
    if (paramCollection.isEmpty())
      if ("0".equals(paramString))
        h(paramLong);
    while (true)
    {
      return;
      HashMap localHashMap1 = new HashMap();
      Iterator localIterator1 = paramCollection.iterator();
      while (localIterator1.hasNext())
      {
        cv localcv6 = (cv)localIterator1.next();
        localHashMap1.put(Long.valueOf(localcv6.a()), localcv6);
      }
      StringBuilder localStringBuilder = new StringBuilder(256);
      localStringBuilder.append("list_id").append(" IN(");
      int i = 1;
      Iterator localIterator2 = localHashMap1.values().iterator();
      if (localIterator2.hasNext())
      {
        cv localcv5 = (cv)localIterator2.next();
        if (i != 0)
          i = 0;
        while (true)
        {
          localStringBuilder.append(localcv5.a());
          break;
          localStringBuilder.append((char)',');
        }
      }
      localStringBuilder.append((char)')').append(" AND ").append("owner_id").append((char)'=').append(paramLong).append(" AND ").append("type").append((char)'=').append(paramInt);
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      Cursor localCursor = localSQLiteDatabase.query("lists", bd.a, localStringBuilder.toString(), null, null, null, null);
      if (localCursor != null)
      {
        HashMap localHashMap2 = new HashMap();
        try
        {
          while (localCursor.moveToNext())
          {
            long l = localCursor.getLong(0);
            cv localcv4 = (cv)localHashMap1.remove(Long.valueOf(l));
            if (localcv4.hashCode() != localCursor.getInt(1))
              localHashMap2.put(Long.valueOf(l), localcv4);
          }
        }
        finally
        {
          localCursor.close();
        }
        if (a)
          Log.d("DatabaseHelper", "Inserting new lists: " + localHashMap1.size() + ", updating lists: " + localHashMap2.size());
        if (localHashMap1.size() > 0)
        {
          HashMap localHashMap3 = new HashMap();
          Iterator localIterator3 = localHashMap1.values().iterator();
          while (localIterator3.hasNext())
          {
            cv localcv3 = (cv)localIterator3.next();
            localHashMap3.put(Long.valueOf(localcv3.h().a), localcv3.h());
          }
          a(localHashMap3.values(), -1L, -1, -1L, null, null);
          try
          {
            localSQLiteDatabase.beginTransaction();
            int j = localHashMap1.size();
            ContentValues localContentValues1 = new ContentValues();
            localContentValues1.put("owner_id", Long.valueOf(paramLong));
            localContentValues1.put("type", Integer.valueOf(paramInt));
            k = 0;
            localIterator4 = localHashMap1.values().iterator();
            while (true)
            {
              if (!localIterator4.hasNext())
                break label918;
              localcv2 = (cv)localIterator4.next();
              k++;
              localContentValues1.put("list_id", Long.valueOf(localcv2.a()));
              localContentValues1.put("list_name", localcv2.b());
              localContentValues1.put("full_name", localcv2.c());
              localContentValues1.put("description", localcv2.d());
              localContentValues1.put("members", Integer.valueOf(localcv2.e()));
              localContentValues1.put("subscribers", Integer.valueOf(localcv2.f()));
              localContentValues1.put("mode", Integer.valueOf(localcv2.g()));
              localContentValues1.put("creator_id", Long.valueOf(localcv2.h().a));
              localContentValues1.put("i_follow", Integer.valueOf(localcv2.i()));
              localContentValues1.put("hash", Integer.valueOf(localcv2.hashCode()));
              if ((j != k) || (!"0".equals(paramString)))
                break;
              bool = true;
              localContentValues1.put("is_last", Boolean.valueOf(bool));
              localSQLiteDatabase.insert("lists", "list_id", localContentValues1);
            }
          }
          finally
          {
            localSQLiteDatabase.endTransaction();
          }
          while (true)
          {
            int k;
            Iterator localIterator4;
            cv localcv2;
            boolean bool = false;
          }
          label918: localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
        }
        int m = localHashMap2.size();
        if (m > 0)
        {
          try
          {
            localSQLiteDatabase.beginTransaction();
            ContentValues localContentValues2 = new ContentValues();
            Iterator localIterator5 = localHashMap2.values().iterator();
            while (localIterator5.hasNext())
            {
              cv localcv1 = (cv)localIterator5.next();
              localContentValues2.clear();
              localContentValues2.put("list_name", localcv1.b());
              localContentValues2.put("full_name", localcv1.c());
              localContentValues2.put("description", localcv1.d());
              localContentValues2.put("members", Integer.valueOf(localcv1.e()));
              localContentValues2.put("subscribers", Integer.valueOf(localcv1.f()));
              localContentValues2.put("mode", Integer.valueOf(localcv1.g()));
              localContentValues2.put("creator_id", Long.valueOf(localcv1.h().a));
              if (localcv1.i() != 0)
                localContentValues2.put("i_follow", Integer.valueOf(localcv1.i()));
              localContentValues2.put("hash", Integer.valueOf(localcv1.hashCode()));
              String[] arrayOfString = new String[1];
              arrayOfString[0] = Long.toString(localcv1.a());
              localSQLiteDatabase.update("lists", localContentValues2, "list_id=?", arrayOfString);
            }
          }
          finally
          {
            localSQLiteDatabase.endTransaction();
          }
          localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
        }
        if (localHashMap1.size() + localHashMap2.size() > 0)
          this.e.notifyChange(aq.a, null);
      }
    }
  }

  // ERROR //
  public final void a(p paramp, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: getfield 967	p:k	Lp;
    //   6: astore 5
    //   8: aload_1
    //   9: invokevirtual 959	p:a	()Lp;
    //   12: astore 6
    //   14: aload 6
    //   16: getfield 430	p:a	J
    //   19: lstore 7
    //   21: getstatic 26	com/twitter/android/provider/ak:a	Z
    //   24: ifeq +30 -> 54
    //   27: ldc 18
    //   29: new 58	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   36: ldc_w 1299
    //   39: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: lload 7
    //   44: invokevirtual 68	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   47: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: invokestatic 287	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   53: pop
    //   54: aload_0
    //   55: invokevirtual 275	com/twitter/android/provider/ak:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   58: astore 9
    //   60: getstatic 962	com/twitter/android/provider/x:a	[Ljava/lang/String;
    //   63: astore 10
    //   65: iconst_1
    //   66: anewarray 54	java/lang/String
    //   69: astore 11
    //   71: aload 11
    //   73: iconst_0
    //   74: lload 7
    //   76: invokestatic 254	java/lang/Long:toString	(J)Ljava/lang/String;
    //   79: aastore
    //   80: aload 9
    //   82: ldc 52
    //   84: aload 10
    //   86: ldc_w 1153
    //   89: aload 11
    //   91: aconst_null
    //   92: aconst_null
    //   93: aconst_null
    //   94: invokevirtual 85	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   97: astore 12
    //   99: aload 12
    //   101: ifnull +491 -> 592
    //   104: aload 12
    //   106: invokeinterface 91 1 0
    //   111: ifne +535 -> 646
    //   114: new 499	java/util/ArrayList
    //   117: dup
    //   118: iconst_1
    //   119: invokespecial 507	java/util/ArrayList:<init>	(I)V
    //   122: astore 14
    //   124: aload 14
    //   126: aload 6
    //   128: getfield 434	p:m	Lad;
    //   131: invokeinterface 1231 2 0
    //   136: pop
    //   137: aload 5
    //   139: ifnull +15 -> 154
    //   142: aload 14
    //   144: aload_1
    //   145: getfield 434	p:m	Lad;
    //   148: invokeinterface 1231 2 0
    //   153: pop
    //   154: aload_0
    //   155: aload 14
    //   157: ldc2_w 805
    //   160: iconst_m1
    //   161: ldc2_w 805
    //   164: aconst_null
    //   165: aconst_null
    //   166: invokevirtual 809	com/twitter/android/provider/ak:a	(Ljava/util/Collection;JIJLjava/lang/String;Ljava/lang/String;)I
    //   169: pop
    //   170: new 107	android/content/ContentValues
    //   173: dup
    //   174: invokespecial 108	android/content/ContentValues:<init>	()V
    //   177: astore 18
    //   179: aload 6
    //   181: aload 18
    //   183: invokestatic 969	com/twitter/android/provider/ak:a	(Lp;Landroid/content/ContentValues;)Z
    //   186: ifeq +460 -> 646
    //   189: aload 9
    //   191: ldc 52
    //   193: ldc 72
    //   195: aload 18
    //   197: invokevirtual 186	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   200: lstore 36
    //   202: lload 36
    //   204: lconst_0
    //   205: lcmp
    //   206: ifle +389 -> 595
    //   209: iconst_1
    //   210: istore 38
    //   212: iload 38
    //   214: iconst_0
    //   215: iadd
    //   216: istore 19
    //   218: aload 12
    //   220: invokeinterface 104 1 0
    //   225: new 499	java/util/ArrayList
    //   228: dup
    //   229: invokespecial 800	java/util/ArrayList:<init>	()V
    //   232: astore 20
    //   234: aload 20
    //   236: aload_1
    //   237: invokevirtual 528	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   240: pop
    //   241: iload 19
    //   243: aload_0
    //   244: aload 20
    //   246: lload_2
    //   247: iconst_1
    //   248: ldc2_w 805
    //   251: iconst_1
    //   252: iconst_0
    //   253: aconst_null
    //   254: iconst_0
    //   255: invokevirtual 973	com/twitter/android/provider/ak:b	(Ljava/util/Collection;JIJZZLjava/lang/String;Z)I
    //   258: iadd
    //   259: istore 22
    //   261: aload 5
    //   263: ifnull +376 -> 639
    //   266: iload 22
    //   268: aload_0
    //   269: aload 20
    //   271: lload_2
    //   272: bipush 6
    //   274: ldc2_w 805
    //   277: iconst_1
    //   278: iconst_0
    //   279: aconst_null
    //   280: iconst_0
    //   281: invokevirtual 973	com/twitter/android/provider/ak:b	(Ljava/util/Collection;JIJZZLjava/lang/String;Z)I
    //   284: iadd
    //   285: istore 23
    //   287: new 107	android/content/ContentValues
    //   290: dup
    //   291: iconst_3
    //   292: invokespecial 1071	android/content/ContentValues:<init>	(I)V
    //   295: astore 24
    //   297: aload 24
    //   299: ldc_w 1224
    //   302: iconst_1
    //   303: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   306: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   309: aload 24
    //   311: ldc 204
    //   313: aload_1
    //   314: getfield 430	p:a	J
    //   317: invokestatic 149	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   320: invokevirtual 152	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   323: aload 24
    //   325: ldc 202
    //   327: aload 6
    //   329: getfield 434	p:m	Lad;
    //   332: getfield 435	ad:a	J
    //   335: invokestatic 149	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   338: invokevirtual 152	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   341: iconst_2
    //   342: anewarray 54	java/lang/String
    //   345: astore 25
    //   347: aload 25
    //   349: iconst_0
    //   350: lload_2
    //   351: invokestatic 254	java/lang/Long:toString	(J)Ljava/lang/String;
    //   354: aastore
    //   355: aload 25
    //   357: iconst_1
    //   358: aload 5
    //   360: getfield 430	p:a	J
    //   363: invokestatic 254	java/lang/Long:toString	(J)Ljava/lang/String;
    //   366: aastore
    //   367: iload 23
    //   369: aload 9
    //   371: ldc 154
    //   373: aload 24
    //   375: ldc_w 1301
    //   378: aload 25
    //   380: invokevirtual 138	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   383: iadd
    //   384: istore 26
    //   386: aload 24
    //   388: invokevirtual 141	android/content/ContentValues:clear	()V
    //   391: aload 24
    //   393: ldc 192
    //   395: bipush 7
    //   397: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   400: invokevirtual 200	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   403: new 58	java/lang/StringBuilder
    //   406: dup
    //   407: ldc_w 1229
    //   410: invokespecial 1247	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   413: ldc 70
    //   415: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: ldc_w 1224
    //   421: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   424: bipush 61
    //   426: invokevirtual 75	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   429: iconst_1
    //   430: invokevirtual 280	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   433: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   436: astore 27
    //   438: iconst_3
    //   439: anewarray 54	java/lang/String
    //   442: astore 28
    //   444: aload 28
    //   446: iconst_0
    //   447: lload_2
    //   448: invokestatic 254	java/lang/Long:toString	(J)Ljava/lang/String;
    //   451: aastore
    //   452: aload 28
    //   454: iconst_1
    //   455: iconst_0
    //   456: invokestatic 256	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   459: aastore
    //   460: aload 28
    //   462: iconst_2
    //   463: aload 5
    //   465: getfield 430	p:a	J
    //   468: invokestatic 254	java/lang/Long:toString	(J)Ljava/lang/String;
    //   471: aastore
    //   472: aload 9
    //   474: ldc 154
    //   476: iconst_1
    //   477: anewarray 54	java/lang/String
    //   480: dup
    //   481: iconst_0
    //   482: ldc 143
    //   484: aastore
    //   485: aload 27
    //   487: aload 28
    //   489: aconst_null
    //   490: aconst_null
    //   491: aconst_null
    //   492: invokevirtual 85	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   495: astore 29
    //   497: aload 29
    //   499: ifnull +133 -> 632
    //   502: lconst_0
    //   503: lstore 31
    //   505: aload 29
    //   507: invokeinterface 91 1 0
    //   512: ifeq +17 -> 529
    //   515: aload 29
    //   517: iconst_0
    //   518: invokeinterface 95 2 0
    //   523: lstore 34
    //   525: lload 34
    //   527: lstore 31
    //   529: aload 29
    //   531: invokeinterface 104 1 0
    //   536: lload 31
    //   538: lconst_0
    //   539: lcmp
    //   540: ifle +92 -> 632
    //   543: iload 26
    //   545: aload 9
    //   547: ldc 154
    //   549: aload 24
    //   551: aload 27
    //   553: aload 28
    //   555: invokevirtual 138	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   558: iadd
    //   559: istore 30
    //   561: aload_1
    //   562: lload 31
    //   564: putfield 444	p:d	J
    //   567: iload 30
    //   569: aload_0
    //   570: aload 20
    //   572: lload_2
    //   573: iconst_0
    //   574: ldc2_w 805
    //   577: iconst_1
    //   578: iconst_0
    //   579: aconst_null
    //   580: iconst_0
    //   581: invokevirtual 973	com/twitter/android/provider/ak:b	(Ljava/util/Collection;JIJZZLjava/lang/String;Z)I
    //   584: iadd
    //   585: ifle +7 -> 592
    //   588: aload_0
    //   589: invokespecial 313	com/twitter/android/provider/ak:f	()V
    //   592: aload_0
    //   593: monitorexit
    //   594: return
    //   595: iconst_0
    //   596: istore 38
    //   598: goto -386 -> 212
    //   601: astore 13
    //   603: aload 12
    //   605: invokeinterface 104 1 0
    //   610: aload 13
    //   612: athrow
    //   613: astore 4
    //   615: aload_0
    //   616: monitorexit
    //   617: aload 4
    //   619: athrow
    //   620: astore 33
    //   622: aload 29
    //   624: invokeinterface 104 1 0
    //   629: aload 33
    //   631: athrow
    //   632: iload 26
    //   634: istore 30
    //   636: goto -69 -> 567
    //   639: iload 22
    //   641: istore 30
    //   643: goto -76 -> 567
    //   646: iconst_0
    //   647: istore 19
    //   649: goto -431 -> 218
    //
    // Exception table:
    //   from	to	target	type
    //   104	137	601	finally
    //   142	154	601	finally
    //   154	202	601	finally
    //   2	54	613	finally
    //   54	99	613	finally
    //   218	261	613	finally
    //   266	497	613	finally
    //   529	536	613	finally
    //   543	567	613	finally
    //   567	592	613	finally
    //   603	613	613	finally
    //   622	632	613	finally
    //   505	525	620	finally
  }

  public final boolean a(long paramLong1, int paramInt, long paramLong2)
  {
    Cursor localCursor;
    try
    {
      SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
      String[] arrayOfString1 = bb.a;
      String[] arrayOfString2 = new String[3];
      arrayOfString2[0] = Long.toString(paramLong1);
      arrayOfString2[1] = Integer.toString(0);
      arrayOfString2[2] = Long.toString(paramLong2);
      localCursor = localSQLiteDatabase.query("status_groups", arrayOfString1, "owner_id=? AND type=? AND g_status_id=?", arrayOfString2, null, null, null);
      if (localCursor != null)
        try
        {
          bool2 = localCursor.moveToFirst();
          localCursor.close();
          bool1 = bool2;
          return bool1;
        }
        finally
        {
          localObject2 = finally;
          localCursor.close();
          throw localObject2;
        }
    }
    finally
    {
    }
    while (true)
    {
      boolean bool2;
      boolean bool1 = false;
    }
  }

  public final boolean a(long paramLong1, long paramLong2)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      String[] arrayOfString = new String[3];
      arrayOfString[0] = Long.toString(paramLong2);
      arrayOfString[1] = Long.toString(paramLong2);
      arrayOfString[2] = Long.toString(paramLong1);
      int i = localSQLiteDatabase.delete("status_groups", "owner_id=? AND sender_id=? AND ref_id=?", arrayOfString);
      if (i > 0)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  public final boolean a(String paramString)
  {
    Cursor localCursor = getReadableDatabase().query("search_queries", new String[] { "_id" }, "LOWER(query)=LOWER(?) AND query_id > 0", new String[] { paramString }, null, null, null);
    if (localCursor != null)
      try
      {
        boolean bool = localCursor.moveToFirst();
        return bool;
      }
      finally
      {
        localCursor.close();
      }
    return false;
  }

  public final byte[] a(long paramLong, String paramString, ByteArrayInputStream paramByteArrayInputStream)
  {
    try
    {
      Bitmap localBitmap1 = BitmapFactory.decodeStream(paramByteArrayInputStream);
      byte[] arrayOfByte;
      if (localBitmap1 == null)
      {
        Log.w("DatabaseHelper", "Cannot decode image for: " + paramLong + " from: " + paramString);
        arrayOfByte = null;
      }
      while (true)
      {
        return arrayOfByte;
        Bitmap localBitmap2 = ab.a(localBitmap1, (int)(48.0F * this.d.getResources().getDisplayMetrics().density));
        localBitmap1.recycle();
        try
        {
          ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(4 * (localBitmap2.getWidth() * localBitmap2.getHeight()));
          localBitmap2.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
          localBitmap2.recycle();
          localByteArrayOutputStream.flush();
          localByteArrayOutputStream.close();
          arrayOfByte = localByteArrayOutputStream.toByteArray();
          ContentValues localContentValues = new ContentValues();
          localContentValues.put("image", arrayOfByte);
          SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
          String[] arrayOfString = new String[1];
          arrayOfString[0] = Long.toString(paramLong);
          localSQLiteDatabase.update("users", localContentValues, "user_id=?", arrayOfString);
        }
        catch (IOException localIOException)
        {
          Log.w("DatabaseHelper", "Could not write user image: " + paramLong + " from: " + paramString);
          arrayOfByte = null;
        }
      }
    }
    finally
    {
    }
  }

  public final int b(long paramLong)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = Long.toString(paramLong);
      int i = localSQLiteDatabase.delete("search_queries", "query_id=?", arrayOfString);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int b(Collection paramCollection, long paramLong1, int paramInt, long paramLong2, boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "mergeStatusGroups: " + paramCollection.size() + ", owned by: " + paramLong1 + ", of type: " + paramInt + ", read: " + paramBoolean1 + ", merging older: " + paramBoolean2 + ", timeline: " + paramBoolean3 + ", next: " + paramString);
      if ((paramInt == -1) || (paramLong1 < 0L))
      {
        i = 0;
        return i;
      }
      if (paramCollection.isEmpty())
      {
        if (paramBoolean2)
          a(paramLong1, paramInt, false);
      }
      else
      {
        localLinkedHashMap = new LinkedHashMap();
        localStringBuilder = new StringBuilder("owner_id=? AND type=? AND tag=?");
        localStringBuilder.append(" AND ").append("g_status_id").append(" IN (");
        j = 1;
        localIterator1 = paramCollection.iterator();
        while (true)
        {
          if (!localIterator1.hasNext())
            break label285;
          localp3 = (p)localIterator1.next();
          if (j == 0)
            break;
          j = 0;
          localp4 = localp3.a();
          localLinkedHashMap.put(Long.valueOf(localp4.a), localp3);
          localStringBuilder.append(localp4.a);
        }
      }
    }
    finally
    {
    }
    while (true)
    {
      int i;
      LinkedHashMap localLinkedHashMap;
      StringBuilder localStringBuilder;
      int j;
      Iterator localIterator1;
      p localp3;
      p localp4;
      localStringBuilder.append((char)',');
      continue;
      label285: localStringBuilder.append((char)')');
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      String[] arrayOfString1 = new String[3];
      arrayOfString1[0] = Long.toString(paramLong1);
      arrayOfString1[1] = Integer.toString(paramInt);
      arrayOfString1[2] = Long.toString(paramLong2);
      Cursor localCursor = localSQLiteDatabase.query("status_groups", h.a, localStringBuilder.toString(), arrayOfString1, null, null, null);
      if (localCursor == null)
      {
        i = 0;
      }
      else
      {
        int k = 0;
        int m = 0;
        ContentValues localContentValues1;
        try
        {
          localContentValues1 = new ContentValues();
          localSQLiteDatabase.beginTransaction();
          do
          {
            if (!localCursor.moveToNext())
              break;
            localp2 = (p)localLinkedHashMap.remove(Long.valueOf(localCursor.getLong(0)));
          }
          while (localp2 == null);
          localContentValues1.clear();
          if (paramBoolean3)
            localContentValues1.put("timeline", Boolean.valueOf(paramBoolean3));
          if (localp2.k != null)
            localContentValues1.put("tweet_type", Integer.valueOf(1));
          while (true)
          {
            localContentValues1.put("ref_id", Long.valueOf(localp2.a));
            localContentValues1.put("sender_id", Long.valueOf(localp2.m.a));
            l = localCursor.getLong(1);
            arrayOfString2 = new String[1];
            arrayOfString2[0] = Long.toString(l);
            k += localSQLiteDatabase.update("status_groups", localContentValues1, "_id=?", arrayOfString2);
            break;
            if (!localp2.b())
              break label583;
            localContentValues1.put("tweet_type", Integer.valueOf(4));
          }
        }
        finally
        {
          localSQLiteDatabase.endTransaction();
          localCursor.close();
        }
        while (true)
        {
          p localp2;
          long l;
          String[] arrayOfString2;
          label583: localContentValues1.put("tweet_type", Integer.valueOf(0));
        }
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        localCursor.close();
        if (a)
          Log.d("DatabaseHelper", "Updated " + k + " status groups.");
        int n = localLinkedHashMap.size();
        int i1;
        label762: int i2;
        if (n > 0)
        {
          ContentValues localContentValues2;
          try
          {
            localSQLiteDatabase.beginTransaction();
            localContentValues2 = new ContentValues();
            localContentValues2.put("owner_id", Long.valueOf(paramLong1));
            localContentValues2.put("type", Integer.valueOf(paramInt));
            localContentValues2.put("tag", Long.valueOf(paramLong2));
            if (!paramBoolean1)
              break label1062;
            i1 = 1;
            localContentValues2.put("is_read", Integer.valueOf(i1));
            localContentValues2.put("timeline", Boolean.valueOf(paramBoolean3));
            localIterator2 = localLinkedHashMap.values().iterator();
            if (!localIterator2.hasNext())
              break label970;
            localp1 = (p)localIterator2.next();
            if (localp1.k != null)
            {
              localContentValues2.put("tweet_type", Integer.valueOf(1));
              localContentValues2.put("g_status_id", Long.valueOf(localp1.k.a));
            }
            while (true)
            {
              localContentValues2.put("updated_at", Long.valueOf(localp1.e));
              localContentValues2.put("ref_id", Long.valueOf(localp1.a));
              localContentValues2.put("sender_id", Long.valueOf(localp1.m.a));
              if (localSQLiteDatabase.insert("status_groups", "g_status_id", localContentValues2) <= 0L)
                break label1068;
              i2 = 1;
              break label1052;
              if (!localp1.b())
                break;
              localContentValues2.put("tweet_type", Integer.valueOf(4));
              localContentValues2.put("g_status_id", Long.valueOf(localp1.a));
            }
          }
          finally
          {
            localSQLiteDatabase.endTransaction();
          }
          while (true)
          {
            Iterator localIterator2;
            p localp1;
            localContentValues2.put("tweet_type", Integer.valueOf(0));
            localContentValues2.put("g_status_id", Long.valueOf(localp1.a));
          }
          label970: localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          if (a)
            Log.d("DatabaseHelper", "Inserted new status groups: " + m);
          if (paramString == null)
            c(paramLong1, paramInt, paramLong2);
        }
        else if (paramBoolean2)
        {
          a(paramLong1, paramInt, false);
          break label1074;
          i = 0;
          continue;
          while (true)
          {
            label1052: m += i2;
            break label762;
            label1062: i1 = 0;
            break;
            label1068: i2 = 0;
          }
        }
        label1074: i = n;
      }
    }
  }

  public final int b(long[] paramArrayOfLong)
  {
    try
    {
      int i = c(paramArrayOfLong);
      if (i > 0)
        this.e.notifyChange(az.l, null);
      return i;
    }
    finally
    {
    }
  }

  public final long b(int paramInt)
  {
    Cursor localCursor;
    try
    {
      SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
      String[] arrayOfString1 = ap.a;
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = String.valueOf(0);
      localCursor = localSQLiteDatabase.query("activities", arrayOfString1, "type=?", arrayOfString2, null, null, "max_position DESC", "1");
      if (localCursor != null)
        try
        {
          if (localCursor.moveToFirst())
          {
            l2 = localCursor.getLong(2);
            localCursor.close();
            l1 = l2;
            return l1;
          }
          localCursor.close();
        }
        finally
        {
          localCursor.close();
        }
    }
    finally
    {
    }
    while (true)
    {
      long l2;
      long l1 = 0L;
    }
  }

  public final long b(long paramLong, int paramInt)
  {
    Cursor localCursor;
    try
    {
      SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
      String[] arrayOfString1 = s.a;
      String[] arrayOfString2 = new String[2];
      arrayOfString2[0] = Long.toString(paramLong);
      arrayOfString2[1] = Integer.toString(0);
      localCursor = localSQLiteDatabase.query("status_groups_view", arrayOfString1, "owner_id=? AND type=?", arrayOfString2, null, null, "updated_at DESC, _id ASC", "1");
      if (localCursor != null)
        try
        {
          if (localCursor.moveToFirst())
          {
            l2 = localCursor.getLong(0);
            localCursor.close();
            l1 = l2;
            return l1;
          }
          localCursor.close();
        }
        finally
        {
          localCursor.close();
        }
    }
    finally
    {
    }
    while (true)
    {
      long l2;
      long l1 = 0L;
    }
  }

  public final void b()
  {
    try
    {
      a(getWritableDatabase());
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void b(long paramLong1, int paramInt, long paramLong2)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "Marking statuses owned by: " + paramLong1 + ", of type: " + paramInt + ", tag: " + -1L + " as read.");
      localSQLiteDatabase = getWritableDatabase();
      localContentValues = new ContentValues();
      localContentValues.put("is_read", Integer.valueOf(1));
      arrayOfString = new String[3];
      arrayOfString[0] = Long.toString(paramLong1);
      arrayOfString[1] = Integer.toString(paramInt);
      arrayOfString[2] = Long.toString(-1L);
      i = localSQLiteDatabase.update("status_groups", localContentValues, "owner_id=? AND type=? AND tag=?", arrayOfString);
      if (i == 0)
        return;
      localContentResolver = this.e;
      switch (paramInt)
      {
      case 4:
      default:
        throw new IllegalArgumentException("Invalid status type: " + paramInt);
      case 0:
      case 1:
      case 2:
      case 3:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      }
    }
    finally
    {
    }
    while (true)
    {
      SQLiteDatabase localSQLiteDatabase;
      ContentValues localContentValues;
      String[] arrayOfString;
      int i;
      ContentResolver localContentResolver;
      localContentResolver.notifyChange(ContentUris.withAppendedId(az.i, paramLong1), null);
      continue;
      localContentResolver.notifyChange(ContentUris.withAppendedId(az.k, paramLong1), null);
      localContentResolver.notifyChange(ContentUris.withAppendedId(af.b, paramLong1), null);
      continue;
      localContentResolver.notifyChange(ContentUris.withAppendedId(az.j, paramLong1), null);
      continue;
      localContentResolver.notifyChange(ContentUris.withAppendedId(az.h, paramLong1), null);
      continue;
      localContentResolver.notifyChange(ContentUris.withAppendedId(az.g, paramLong1), null);
      continue;
      localContentResolver.notifyChange(ContentUris.withAppendedId(az.f, paramLong1), null);
      continue;
      localContentResolver.notifyChange(ContentUris.withAppendedId(az.e, paramLong1), null);
      continue;
      localContentResolver.notifyChange(ContentUris.withAppendedId(az.d, paramLong1), null);
      continue;
      localContentResolver.notifyChange(ContentUris.withAppendedId(az.c, paramLong1), null);
    }
  }

  public final void b(long paramLong1, long paramLong2)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      String str = Long.toString(paramLong2);
      localSQLiteDatabase.delete("lists", "list_id=?", new String[] { str });
      String[] arrayOfString1 = new String[2];
      arrayOfString1[0] = Integer.toString(4);
      arrayOfString1[1] = str;
      int i = localSQLiteDatabase.delete("user_groups", "type=? AND tag=?", arrayOfString1);
      if (i > 0)
        a(paramLong1, 4, 1);
      String[] arrayOfString2 = new String[2];
      arrayOfString2[0] = Integer.toString(5);
      arrayOfString2[1] = str;
      int j = localSQLiteDatabase.delete("user_groups", "type=? AND tag=?", arrayOfString2);
      if (j > 0)
        a(paramLong1, 5, 1);
      String[] arrayOfString3 = new String[2];
      arrayOfString3[0] = Integer.toString(9);
      arrayOfString3[1] = str;
      int k = localSQLiteDatabase.delete("status_groups", "type=? AND tag=?", arrayOfString3);
      if (k > 0)
        a(paramLong1, 9, 3);
      ContentResolver localContentResolver = this.e;
      if (k > 0)
        f();
      if (i + j > 0)
        localContentResolver.notifyChange(aj.b, null);
      localContentResolver.notifyChange(aq.a, null);
      return;
    }
    finally
    {
    }
  }

  public final void b(long paramLong, boolean paramBoolean)
  {
    i = 1;
    try
    {
      if (a)
        Log.d("DatabaseHelper", "updateFollowList: " + paramLong + " follow: " + paramBoolean);
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      ContentValues localContentValues = new ContentValues();
      if (paramBoolean);
      while (true)
      {
        localContentValues.put("i_follow", Integer.valueOf(i));
        String[] arrayOfString = new String[1];
        arrayOfString[0] = Long.toString(paramLong);
        localSQLiteDatabase.update("lists", localContentValues, "list_id=?", arrayOfString);
        return;
        i = 2;
      }
    }
    finally
    {
    }
  }

  public final int c(long paramLong1, long paramLong2)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      String str = "tweet_type=2 AND ref_id=? AND owner_id=" + paramLong1;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = Long.toString(paramLong2);
      int i = localSQLiteDatabase.delete("status_groups", str, arrayOfString);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int c(long[] paramArrayOfLong)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      StringBuilder localStringBuilder = new StringBuilder("g_status_id").append(" IN (");
      a(localStringBuilder, paramArrayOfLong).append((char)')');
      int i = localSQLiteDatabase.delete("status_groups", localStringBuilder.toString(), null);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long c(long paramLong, int paramInt)
  {
    Cursor localCursor;
    try
    {
      SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
      String[] arrayOfString1 = s.a;
      String[] arrayOfString2 = new String[2];
      arrayOfString2[0] = Long.toString(paramLong);
      arrayOfString2[1] = Integer.toString(paramInt);
      localCursor = localSQLiteDatabase.query("status_groups_view", arrayOfString1, "owner_id=? AND type=?", arrayOfString2, null, null, "updated_at ASC, _id DESC", "1");
      if (localCursor != null)
        try
        {
          if (localCursor.moveToFirst())
          {
            l2 = localCursor.getLong(0);
            localCursor.close();
            l1 = l2;
            return l1;
          }
          localCursor.close();
        }
        finally
        {
          localCursor.close();
        }
    }
    finally
    {
    }
    while (true)
    {
      long l2;
      long l1 = 0L;
    }
  }

  public final void c()
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "Marking Inbox messages as read.");
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("is_read", Integer.valueOf(1));
      String[] arrayOfString = new String[1];
      arrayOfString[0] = Integer.toString(1);
      if (localSQLiteDatabase.update("messages", localContentValues, "type=?", arrayOfString) > 0)
        this.e.notifyChange(ac.a, null);
      return;
    }
    finally
    {
    }
  }

  public final void c(long paramLong)
  {
    try
    {
      if (a)
        Log.d("DatabaseHelper", "Removing direct message: " + paramLong);
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = Long.toString(paramLong);
      localSQLiteDatabase.delete("messages", "msg_id=?", arrayOfString);
      ContentResolver localContentResolver = this.e;
      localContentResolver.notifyChange(ac.a, null);
      localContentResolver.notifyChange(ac.b, null);
      return;
    }
    finally
    {
    }
  }

  public final int d()
  {
    SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
    String[] arrayOfString1 = e.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = Integer.toString(1);
    Cursor localCursor = localSQLiteDatabase.query("messages", arrayOfString1, "type=? AND is_read=0", arrayOfString2, null, null, null, null);
    if (localCursor == null)
      return 0;
    int i = localCursor.getCount();
    if (a)
      Log.d("DatabaseHelper", "getUnreadMessages: " + i);
    localCursor.close();
    return i;
  }

  public final int d(long paramLong, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
    String[] arrayOfString1 = ai.a;
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = Long.toString(paramLong);
    arrayOfString2[1] = Integer.toString(paramInt);
    Cursor localCursor = localSQLiteDatabase.query("status_groups_view", arrayOfString1, "owner_id=? AND type=? AND is_read=0", arrayOfString2, null, null, null, null);
    if (localCursor == null)
      return 0;
    int i = localCursor.getCount();
    if (a)
      Log.d("DatabaseHelper", "getUnreadStatuses of type: " + paramInt + ", count: " + i);
    localCursor.close();
    return i;
  }

  public final int d(long[] paramArrayOfLong)
  {
    int i;
    if (paramArrayOfLong == null)
      i = 0;
    while (true)
    {
      return i;
      try
      {
        SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
        StringBuilder localStringBuilder = new StringBuilder("msg_id").append(" IN (");
        a(localStringBuilder, paramArrayOfLong).append((char)')');
        i = localSQLiteDatabase.delete("messages", localStringBuilder.toString(), null);
        if (i <= 0)
          continue;
        ContentResolver localContentResolver = this.e;
        localContentResolver.notifyChange(aw.a, null);
        localContentResolver.notifyChange(l.a, null);
        localContentResolver.notifyChange(o.a, null);
      }
      finally
      {
      }
    }
  }

  public final byte[] d(long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
    String[] arrayOfString1 = ah.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = Long.toString(paramLong);
    localCursor = localSQLiteDatabase.query("users", arrayOfString1, "user_id=?", arrayOfString2, null, null, null);
    if (localCursor == null)
      return null;
    try
    {
      if (localCursor.moveToFirst())
      {
        byte[] arrayOfByte = localCursor.getBlob(0);
        return arrayOfByte;
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }

  public final void e()
  {
    try
    {
      getWritableDatabase().delete("scribe", null, null);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void e(long paramLong)
  {
    try
    {
      arrayOfString1 = new String[1];
      arrayOfString1[0] = String.valueOf(paramLong);
      localSQLiteDatabase = getWritableDatabase();
      Log.i("DatabaseHelper", "Begin cleanup.");
      try
      {
        localSQLiteDatabase.beginTransaction();
        int i = 0 + localSQLiteDatabase.delete("status_groups", "type IN (9,2,13,10,6,7) AND owner_id=?", arrayOfString1) + localSQLiteDatabase.delete("status_groups", "owner_id!=?", arrayOfString1) + localSQLiteDatabase.delete("user_groups", "owner_id!=?", arrayOfString1);
        int[] arrayOfInt = b;
        int j = arrayOfInt.length;
        int k = i;
        for (int m = 0; m < j; m++)
        {
          int n = arrayOfInt[m];
          String[] arrayOfString2 = new String[1];
          arrayOfString2[0] = String.valueOf(n);
          k += localSQLiteDatabase.delete("user_groups", "type=?", arrayOfString2);
        }
        String[] arrayOfString3 = new String[1];
        arrayOfString3[0] = String.valueOf(7);
        int i1 = k + localSQLiteDatabase.delete("search_queries", "type=?", arrayOfString3) + localSQLiteDatabase.delete("cursors", "owner_id!=?", arrayOfString1) + localSQLiteDatabase.delete("lists", "owner_id!=?", arrayOfString1) + localSQLiteDatabase.delete("statuses", "status_id NOT IN (SELECT DISTINCT g_status_id FROM status_groups)", null) + localSQLiteDatabase.delete("users", "user_id NOT IN (SELECT DISTINCT author_id FROM statuses) AND user_id NOT IN (SELECT DISTINCT sender_id FROM status_groups) AND user_id NOT IN (SELECT DISTINCT user_id FROM user_groups) AND user_id NOT IN (SELECT DISTINCT sender_id FROM messages) AND user_id NOT IN (SELECT DISTINCT recipient_id FROM messages) AND user_id NOT IN (SELECT DISTINCT creator_id FROM lists)", null);
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        Log.i("DatabaseHelper", "Cleaned up: " + i1);
        return;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
    finally
    {
    }
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    String[] arrayOfString1 = { "CREATE TABLE users (_id INTEGER PRIMARY KEY,user_id INT UNIQUE NOT NULL,username TEXT,name TEXT,description TEXT,web_url TEXT,bg_color INT,location TEXT,protected INT,verified INT,followers INT,friends INT,statuses INT,geo_enabled INT,profile_created INT,image_url TEXT,hash INT,updated INT,friendship INT,friendship_time INT,favorites INT DEFAULT 0,image BLOB);", "CREATE TABLE user_groups (_id INTEGER PRIMARY KEY,type INT,tag INT,owner_id INT,user_id INT,is_last INT);", "CREATE TABLE cursors (_id INTEGER PRIMARY KEY,kind INT,type INT,owner_id INT,next TEXT);", "CREATE TABLE statuses (_id INTEGER PRIMARY KEY,status_id INT UNIQUE NOT NULL,author_id INT,content TEXT,source TEXT,source_url TEXT,created INT,in_r_user_id INT,in_r_status_id INT,favorited INT,latitude TEXT,longitude TEXT,place_type INT,place_name TEXT,place_bounding TEXT,place_id TEXT,entities TEXT,retweet_count INT);", "CREATE TABLE status_groups (_id INTEGER PRIMARY KEY,tweet_type INT DEFAULT 0,type INT,sender_id INT,owner_id INT,ref_id INT,tag INT,g_status_id INT,is_read INT,is_last INT,updated_at INT,timeline INT);", "CREATE TABLE messages (_id INTEGER PRIMARY KEY,type INT,msg_id INT UNIQUE NOT NULL,content TEXT,created INT,sender_id INT,recipient_id INT,thread TEXT,is_read INT,entities BLOB,is_last INT);", "CREATE TABLE search_queries (_id INTEGER PRIMARY KEY,type INT,name TEXT NOT NULL,query TEXT NOT NULL,query_id INT,time INT,latitude REAL,longitude REAL,radius REAL,location TEXT);", "CREATE TABLE lists (_id INTEGER PRIMARY KEY,owner_id INT,type INT,list_id INT,list_name TEXT,full_name TEXT,description TEXT,subscribers INT,members INT,mode INT,creator_id INT,i_follow INT,is_last INT,hash INT)", "CREATE TABLE scribe (_id INTEGER PRIMARY KEY,log BLOB);", "CREATE TABLE activities (_id INTEGER PRIMARY KEY,type INT,event INT,created_at INT,max_position INT,min_position INT,sources_size INT,source_type INT,sources BLOB,targets_size INT,target_type INT,targets BLOB,target_objects_size INT,target_object_type INT,target_objects BLOB,is_last INT);", "CREATE TABLE stories (_id INTEGER PRIMARY KEY,type INT,score FLOAT,query TEXT,unread INT DEFAULT 1,identifier INT,data BLOB);" };
    int i = arrayOfString1.length;
    for (int j = 0; j < i; j++)
      paramSQLiteDatabase.execSQL(arrayOfString1[j]);
    String[] arrayOfString2 = { "CREATE INDEX user_groups_idx ON user_groups (type,owner_id,user_id);", "CREATE INDEX status_groups_idx ON status_groups (type,owner_id,tag,g_status_id);", "CREATE INDEX user_cursors_index ON cursors (kind,type,owner_id);", "CREATE INDEX search_queries_index ON search_queries (type,name,query);", "CREATE INDEX messages_index ON messages (thread);" };
    int k = arrayOfString2.length;
    for (int m = 0; m < k; m++)
      paramSQLiteDatabase.execSQL(arrayOfString2[m]);
    String[] arrayOfString3 = { "CREATE VIEW status_groups_view AS SELECT status_groups._id AS _id,status_groups.owner_id AS owner_id,status_groups.type AS type,status_groups.tag AS tag,status_groups.g_status_id AS g_status_id,status_groups.is_read AS is_read,status_groups.is_last AS is_last,status_groups.timeline AS timeline,status_groups.sender_id AS sender_id,status_groups.tweet_type AS tweet_type,status_groups.ref_id AS ref_id,status_groups.updated_at AS updated_at,statuses.author_id AS author_id,statuses.content AS content,statuses.source AS source,statuses.source_url AS source_url,statuses.created AS created,statuses.in_r_user_id AS in_r_user_id,statuses.in_r_status_id AS in_r_status_id,statuses.favorited AS favorited,statuses.latitude AS latitude,statuses.longitude AS longitude,statuses.place_type AS place_type,statuses.place_name AS place_name,statuses.place_bounding AS place_bounding,statuses.place_id AS place_id,statuses.entities AS entities,statuses.retweet_count AS retweet_count,user.username AS username,user.name AS name,user.image_url AS image_url,user.image AS image,user.protected AS protected,user.verified AS verified,sender.username AS s_username,sender.name AS s_name,sender.image_url AS s_profile_image_url,sender.protected AS s_protected,sender.image AS s_image FROM status_groups LEFT JOIN statuses ON status_groups.g_status_id=statuses.status_id LEFT JOIN users AS user ON statuses.author_id=user.user_id LEFT JOIN users AS sender ON status_groups.sender_id=sender.user_id;", "CREATE VIEW user_groups_view AS SELECT user_groups._id AS _id,user_groups.type AS type,user_groups.tag AS tag,user_groups.owner_id AS owner_id,user_groups.user_id AS user_id,user_groups.is_last AS is_last,user.username AS username,user.name AS name,user.description AS description,user.web_url AS web_url,user.bg_color AS bg_color,user.location AS location,user.protected AS protected,user.verified AS verified,user.profile_created AS profile_created,user.image_url AS image_url,user.followers AS followers,user.friends AS friends,user.statuses AS statuses,user.geo_enabled AS geo_enabled,user.image AS image,user.friendship AS friendship,user.friendship_time AS friendship_time FROM user_groups LEFT JOIN users AS user ON user_groups.user_id=user.user_id;", "CREATE VIEW messages_received_view AS SELECT messages._id AS _id,messages.type AS type,messages.msg_id AS msg_id,messages.content AS content,messages.created AS created,messages.sender_id AS sender_id,messages.recipient_id AS recipient_id,messages.is_read AS is_read,messages.is_last AS is_last,users.username AS username,users.name AS name,users.image_url AS image_url,users.image AS image FROM messages,users WHERE messages.sender_id=users.user_id;", "CREATE VIEW messages_sent_view AS SELECT messages._id AS _id,messages.type AS type,messages.msg_id AS msg_id,messages.content AS content,messages.created AS created,messages.sender_id AS sender_id,messages.recipient_id AS recipient_id,messages.is_read AS is_read,messages.is_last AS is_last,users.username AS username,users.name AS name,users.image_url AS image_url,users.image AS image FROM messages,users WHERE messages.recipient_id=users.user_id;", "CREATE VIEW messages_threaded AS SELECT * FROM (SELECT messages.*,r.username r_username,r.name r_name,r.image_url r_profile_image_url,s.username s_username,s.name s_name,s.image_url s_profile_image_url FROM messages LEFT JOIN users r ON recipient_id=r.user_id LEFT JOIN users s ON sender_id=s.user_id ORDER BY created ASC) GROUP BY thread;", "CREATE VIEW messages_conversation AS SELECT messages.*,s.username s_username,s.name s_name,s.image_url s_profile_image_url FROM messages LEFT JOIN users s ON sender_id=s.user_id;", "CREATE VIEW lists_view AS SELECT lists._id AS _id,lists.owner_id AS owner_id,lists.type AS type,lists.list_id AS list_id,lists.list_name AS list_name,lists.full_name AS full_name,lists.description AS description,lists.subscribers AS subscribers,lists.members AS members,lists.mode AS mode,lists.creator_id AS creator_id,lists.i_follow AS i_follow,lists.is_last AS is_last,users.username AS username,users.name AS name,users.image_url AS image_url,users.image AS image FROM lists,users WHERE lists.creator_id=users.user_id;", "CREATE VIEW status_groups_retweets_view AS SELECT status_groups_view.*, retweets.* FROM status_groups_view LEFT JOIN ( SELECT g_status_id AS rt_orig_status_id,ref_id AS rt_orig_ref_id FROM status_groups_view WHERE type=0 AND tweet_type=1 AND sender_id=owner_id GROUP BY rt_orig_status_id) AS retweets ON (retweets.rt_orig_status_id=status_groups_view.g_status_id);", "CREATE VIEW slug_users_view AS SELECT search_queries._id AS _id,search_queries.name AS name,search_queries.query AS query,search_queries.query_id AS query_id,user_groups_view.username AS username,user_groups_view.user_id AS user_id,user_groups_view.image_url AS image_url,user_groups_view.image AS image FROM search_queries LEFT JOIN user_groups_view ON search_queries.query_id=user_groups_view.tag WHERE user_groups_view.type=6;", "CREATE VIEW user_recommendations_view AS SELECT u.*,c.user_id AS conn_user_id,c.username AS conn_username,c.name AS conn_name FROM user_groups_view AS u LEFT OUTER JOIN user_groups_view AS c ON u.user_id=c.tag WHERE (u.type=9 OR u.type=10) AND u.tag=-1 ORDER BY u._id" };
    int n = arrayOfString3.length;
    for (int i1 = 0; i1 < n; i1++)
      paramSQLiteDatabase.execSQL(arrayOfString3[i1]);
    String[] arrayOfString4 = this.d.databaseList();
    SQLiteDatabase localSQLiteDatabase1;
    if ((arrayOfString4.length == 1) && ("twitter.db".equals(arrayOfString4[0])))
      try
      {
        localSQLiteDatabase1 = new ak(this.d, "twitter.db").getReadableDatabase();
        localCursor1 = localSQLiteDatabase1.query("status_groups_view", new String[] { "content", "author_id", "in_r_status_id", "entities" }, "type=11", null, null, null, null);
        if (localCursor1 != null)
          try
          {
            arrayOfax2 = new ax[localCursor1.getCount()];
            for (i4 = 0; localCursor1.moveToNext(); i4 = i5)
            {
              localax2 = new ax();
              localax2.d = localCursor1.getString(0);
              localax2.q = localCursor1.getLong(1);
              localax2.j = localCursor1.getLong(2);
              localax2.x = localCursor1.getBlob(3);
              i5 = i4 + 1;
              arrayOfax2[i4] = localax2;
            }
            localCursor1.close();
            arrayOfax1 = arrayOfax2;
            if (arrayOfax1 != null)
            {
              i2 = arrayOfax1.length;
              i3 = 0;
              if (i3 < i2)
              {
                localax1 = arrayOfax1[i3];
                if (localax1 == null)
                  break label766;
                if (localax1.x == null)
                  localbe = be.a(localax1.x);
              }
            }
          }
          finally
          {
            localCursor1.close();
          }
      }
      finally
      {
        Cursor localCursor1;
        this.d.deleteDatabase("twitter.db");
      }
    while (true)
    {
      ax[] arrayOfax2;
      int i4;
      ax localax2;
      int i5;
      int i2;
      int i3;
      ax localax1;
      be localbe = null;
      continue;
      SQLiteDatabase localSQLiteDatabase2 = q.a(this.d).getWritableDatabase();
      Cursor localCursor2 = localSQLiteDatabase1.query("user_values", new String[] { "name", "value" }, null, null, null, null, null);
      if (localCursor2 != null)
      {
        localSQLiteDatabase2.beginTransaction();
        try
        {
          while (localCursor2.moveToNext())
          {
            ContentValues localContentValues = new ContentValues(2);
            localContentValues.put("name", localCursor2.getString(0));
            localContentValues.put("value", localCursor2.getString(1));
            localSQLiteDatabase2.insert("user_values", "name", localContentValues);
          }
        }
        finally
        {
          localSQLiteDatabase2.endTransaction();
          localCursor2.close();
        }
        localSQLiteDatabase2.setTransactionSuccessful();
        localSQLiteDatabase2.endTransaction();
        localCursor2.close();
      }
      this.d.deleteDatabase("twitter.db");
      return;
      ax[] arrayOfax1 = null;
      continue;
      label766: i3++;
    }
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (paramInt1 == 1)
      paramSQLiteDatabase.execSQL("CREATE TABLE scribe (_id INTEGER PRIMARY KEY,log BLOB);");
    for (int i = 2; ; i = paramInt1)
    {
      if (i == 2)
      {
        paramSQLiteDatabase.execSQL("CREATE VIEW status_groups_retweets_view AS SELECT status_groups_view.*, retweets.* FROM status_groups_view LEFT JOIN ( SELECT g_status_id AS rt_orig_status_id,ref_id AS rt_orig_ref_id FROM status_groups_view WHERE type=0 AND tweet_type=1 AND sender_id=owner_id GROUP BY rt_orig_status_id) AS retweets ON (retweets.rt_orig_status_id=status_groups_view.g_status_id);");
        i = 3;
      }
      if (i == 3)
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE activities (_id INTEGER PRIMARY KEY,type INT,event INT,created_at INT,max_position INT,min_position INT,sources_size INT,source_type INT,sources BLOB,targets_size INT,target_type INT,targets BLOB,target_objects_size INT,target_object_type INT,target_objects BLOB,is_last INT);");
        paramSQLiteDatabase.execSQL("CREATE TABLE stories (_id INTEGER PRIMARY KEY,type INT,score FLOAT,query TEXT,unread INT DEFAULT 1,identifier INT,data BLOB);");
        paramSQLiteDatabase.execSQL("CREATE VIEW slug_users_view AS SELECT search_queries._id AS _id,search_queries.name AS name,search_queries.query AS query,search_queries.query_id AS query_id,user_groups_view.username AS username,user_groups_view.user_id AS user_id,user_groups_view.image_url AS image_url,user_groups_view.image AS image FROM search_queries LEFT JOIN user_groups_view ON search_queries.query_id=user_groups_view.tag WHERE user_groups_view.type=6;");
        paramSQLiteDatabase.execSQL("ALTER TABLE users ADD COLUMN bg_color INT;");
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS photos;");
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS search_results;");
        paramSQLiteDatabase.execSQL("DROP VIEW IF EXISTS search_results_view;");
        i = 4;
      }
      if (i == 4)
      {
        if (paramInt1 == 4)
        {
          paramSQLiteDatabase.execSQL("DROP VIEW IF EXISTS user_recommendations_view;");
          paramSQLiteDatabase.execSQL("CREATE VIEW user_recommendations_view AS SELECT u.*,c.user_id AS conn_user_id,c.username AS conn_username,c.name AS conn_name FROM user_groups_view AS u LEFT OUTER JOIN user_groups_view AS c ON u.user_id=c.tag WHERE (u.type=9 OR u.type=10) AND u.tag=-1 ORDER BY u._id");
        }
        i = 5;
      }
      if (i == 5)
      {
        paramSQLiteDatabase.execSQL("DROP VIEW IF EXISTS user_groups_view;");
        paramSQLiteDatabase.execSQL("DROP VIEW IF EXISTS user_recommendations_view;");
        paramSQLiteDatabase.execSQL("ALTER TABLE users ADD COLUMN friendship_time INT;");
        paramSQLiteDatabase.execSQL("CREATE VIEW user_groups_view AS SELECT user_groups._id AS _id,user_groups.type AS type,user_groups.tag AS tag,user_groups.owner_id AS owner_id,user_groups.user_id AS user_id,user_groups.is_last AS is_last,user.username AS username,user.name AS name,user.description AS description,user.web_url AS web_url,user.bg_color AS bg_color,user.location AS location,user.protected AS protected,user.verified AS verified,user.profile_created AS profile_created,user.image_url AS image_url,user.followers AS followers,user.friends AS friends,user.statuses AS statuses,user.geo_enabled AS geo_enabled,user.image AS image,user.friendship AS friendship,user.friendship_time AS friendship_time FROM user_groups LEFT JOIN users AS user ON user_groups.user_id=user.user_id;");
        paramSQLiteDatabase.execSQL("CREATE VIEW user_recommendations_view AS SELECT u.*,c.user_id AS conn_user_id,c.username AS conn_username,c.name AS conn_name FROM user_groups_view AS u LEFT OUTER JOIN user_groups_view AS c ON u.user_id=c.tag WHERE (u.type=9 OR u.type=10) AND u.tag=-1 ORDER BY u._id");
        if (paramInt1 == 5)
        {
          paramSQLiteDatabase.execSQL("ALTER TABLE stories  ADD COLUMN identifier INT;");
          paramSQLiteDatabase.execSQL("ALTER TABLE stories  ADD COLUMN unread INT DEFAULT 1;");
        }
        i = 6;
      }
      if (i == 6)
      {
        if (paramInt1 == 6)
          paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN is_last INT;");
        i = 7;
      }
      if ((i == 7) && (paramInt1 == 7))
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM user_groups WHERE type=8");
        paramSQLiteDatabase.execSQL("DELETE FROM status_groups WHERE type=12");
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
