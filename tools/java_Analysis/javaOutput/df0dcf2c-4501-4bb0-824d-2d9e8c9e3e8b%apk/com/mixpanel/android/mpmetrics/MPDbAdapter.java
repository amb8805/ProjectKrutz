package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

final class MPDbAdapter
{
  private static final String a = "CREATE TABLE " + MPDbAdapter.Table.a.a() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL);";
  private static final String b = "CREATE TABLE " + MPDbAdapter.Table.b.a() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL);";
  private static final String c = "CREATE INDEX IF NOT EXISTS time_idx ON " + MPDbAdapter.Table.a.a() + " (created_at);";
  private static final String d = "CREATE INDEX IF NOT EXISTS time_idx ON " + MPDbAdapter.Table.b.a() + " (created_at);";
  private final k e;

  public MPDbAdapter(Context paramContext)
  {
    this(paramContext, "mixpanel");
  }

  private MPDbAdapter(Context paramContext, String paramString)
  {
    this.e = new k(paramContext, paramString);
  }

  // ERROR //
  public final int a(org.json.JSONObject paramJSONObject, MPDbAdapter.Table paramTable)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_2
    //   3: invokevirtual 29	com/mixpanel/android/mpmetrics/MPDbAdapter$Table:a	()Ljava/lang/String;
    //   6: astore 4
    //   8: aload_0
    //   9: getfield 65	com/mixpanel/android/mpmetrics/MPDbAdapter:e	Lcom/mixpanel/android/mpmetrics/k;
    //   12: invokevirtual 72	com/mixpanel/android/mpmetrics/k:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   15: astore 9
    //   17: new 74	android/content/ContentValues
    //   20: dup
    //   21: invokespecial 75	android/content/ContentValues:<init>	()V
    //   24: astore 10
    //   26: aload 10
    //   28: ldc 77
    //   30: aload_1
    //   31: invokevirtual 80	org/json/JSONObject:toString	()Ljava/lang/String;
    //   34: invokevirtual 84	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: aload 10
    //   39: ldc 86
    //   41: invokestatic 92	java/lang/System:currentTimeMillis	()J
    //   44: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   47: invokevirtual 101	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   50: aload 9
    //   52: aload 4
    //   54: aconst_null
    //   55: aload 10
    //   57: invokevirtual 107	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   60: pop2
    //   61: aload 9
    //   63: new 15	java/lang/StringBuilder
    //   66: dup
    //   67: ldc 109
    //   69: invokespecial 21	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   72: aload 4
    //   74: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual 38	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: aconst_null
    //   81: invokevirtual 113	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   84: astore 13
    //   86: aload 13
    //   88: astore 7
    //   90: aload 7
    //   92: invokeinterface 119 1 0
    //   97: pop
    //   98: aload 7
    //   100: iconst_0
    //   101: invokeinterface 123 2 0
    //   106: istore 15
    //   108: aload 7
    //   110: ifnull +10 -> 120
    //   113: aload 7
    //   115: invokeinterface 126 1 0
    //   120: aload_0
    //   121: getfield 65	com/mixpanel/android/mpmetrics/MPDbAdapter:e	Lcom/mixpanel/android/mpmetrics/k;
    //   124: invokevirtual 127	com/mixpanel/android/mpmetrics/k:close	()V
    //   127: iload 15
    //   129: ireturn
    //   130: astore 6
    //   132: aconst_null
    //   133: astore 7
    //   135: ldc 129
    //   137: new 15	java/lang/StringBuilder
    //   140: dup
    //   141: ldc 131
    //   143: invokespecial 21	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   146: aload 4
    //   148: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: ldc 133
    //   153: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: invokevirtual 38	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: aload 6
    //   161: invokestatic 138	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   164: pop
    //   165: aload 7
    //   167: ifnull +71 -> 238
    //   170: aload 7
    //   172: invokeinterface 126 1 0
    //   177: aload_0
    //   178: getfield 65	com/mixpanel/android/mpmetrics/MPDbAdapter:e	Lcom/mixpanel/android/mpmetrics/k;
    //   181: invokevirtual 140	com/mixpanel/android/mpmetrics/k:a	()V
    //   184: aload_3
    //   185: ifnull +9 -> 194
    //   188: aload_3
    //   189: invokeinterface 126 1 0
    //   194: aload_0
    //   195: getfield 65	com/mixpanel/android/mpmetrics/MPDbAdapter:e	Lcom/mixpanel/android/mpmetrics/k;
    //   198: invokevirtual 127	com/mixpanel/android/mpmetrics/k:close	()V
    //   201: iconst_m1
    //   202: ireturn
    //   203: astore 5
    //   205: aload_3
    //   206: ifnull +9 -> 215
    //   209: aload_3
    //   210: invokeinterface 126 1 0
    //   215: aload_0
    //   216: getfield 65	com/mixpanel/android/mpmetrics/MPDbAdapter:e	Lcom/mixpanel/android/mpmetrics/k;
    //   219: invokevirtual 127	com/mixpanel/android/mpmetrics/k:close	()V
    //   222: aload 5
    //   224: athrow
    //   225: astore 5
    //   227: aload 7
    //   229: astore_3
    //   230: goto -25 -> 205
    //   233: astore 6
    //   235: goto -100 -> 135
    //   238: aload 7
    //   240: astore_3
    //   241: goto -64 -> 177
    //
    // Exception table:
    //   from	to	target	type
    //   8	86	130	android/database/sqlite/SQLiteException
    //   8	86	203	finally
    //   177	184	203	finally
    //   90	108	225	finally
    //   135	165	225	finally
    //   170	177	225	finally
    //   90	108	233	android/database/sqlite/SQLiteException
  }

  public final void a()
  {
    this.e.a();
  }

  public final void a(long paramLong, MPDbAdapter.Table paramTable)
  {
    str = paramTable.a();
    try
    {
      this.e.getWritableDatabase().delete(str, "created_at <= " + paramLong, null);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      Log.e("MixpanelAPI", "cleanupEvents " + str + " by time FAILED. Deleting DB.", localSQLiteException);
      this.e.a();
      return;
    }
    finally
    {
      this.e.close();
    }
  }

  public final void a(String paramString, MPDbAdapter.Table paramTable)
  {
    str = paramTable.a();
    try
    {
      this.e.getWritableDatabase().delete(str, "_id <= " + paramString, null);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      Log.e("MixpanelAPI", "cleanupEvents " + str + " by id FAILED. Deleting DB.", localSQLiteException);
      this.e.a();
      return;
    }
    finally
    {
      this.e.close();
    }
  }

  // ERROR //
  public final String[] a(MPDbAdapter.Table paramTable)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 29	com/mixpanel/android/mpmetrics/MPDbAdapter$Table:a	()Ljava/lang/String;
    //   4: astore_2
    //   5: aload_0
    //   6: getfield 65	com/mixpanel/android/mpmetrics/MPDbAdapter:e	Lcom/mixpanel/android/mpmetrics/k;
    //   9: invokevirtual 165	com/mixpanel/android/mpmetrics/k:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   12: new 15	java/lang/StringBuilder
    //   15: dup
    //   16: ldc 167
    //   18: invokespecial 21	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: aload_2
    //   22: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: ldc 169
    //   27: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: invokevirtual 38	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   33: aconst_null
    //   34: invokevirtual 113	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   37: astore 10
    //   39: aload 10
    //   41: astore 4
    //   43: new 171	org/json/JSONArray
    //   46: dup
    //   47: invokespecial 172	org/json/JSONArray:<init>	()V
    //   50: astore 11
    //   52: aconst_null
    //   53: astore 12
    //   55: aload 4
    //   57: invokeinterface 175 1 0
    //   62: ifeq +72 -> 134
    //   65: aload 4
    //   67: invokeinterface 178 1 0
    //   72: ifeq +25 -> 97
    //   75: aload 4
    //   77: aload 4
    //   79: ldc 180
    //   81: invokeinterface 184 2 0
    //   86: invokeinterface 188 2 0
    //   91: astore 17
    //   93: aload 17
    //   95: astore 12
    //   97: aload 11
    //   99: new 79	org/json/JSONObject
    //   102: dup
    //   103: aload 4
    //   105: aload 4
    //   107: ldc 77
    //   109: invokeinterface 184 2 0
    //   114: invokeinterface 188 2 0
    //   119: invokespecial 189	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   122: invokevirtual 192	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   125: pop
    //   126: goto -71 -> 55
    //   129: astore 15
    //   131: goto -76 -> 55
    //   134: aload 11
    //   136: invokevirtual 196	org/json/JSONArray:length	()I
    //   139: ifle +187 -> 326
    //   142: aload 11
    //   144: invokevirtual 197	org/json/JSONArray:toString	()Ljava/lang/String;
    //   147: astore 14
    //   149: aload 14
    //   151: astore 13
    //   153: aload_0
    //   154: getfield 65	com/mixpanel/android/mpmetrics/MPDbAdapter:e	Lcom/mixpanel/android/mpmetrics/k;
    //   157: invokevirtual 127	com/mixpanel/android/mpmetrics/k:close	()V
    //   160: aload 4
    //   162: ifnull +153 -> 315
    //   165: aload 4
    //   167: invokeinterface 126 1 0
    //   172: aload 13
    //   174: astore 8
    //   176: aload 12
    //   178: astore 7
    //   180: aconst_null
    //   181: astore 9
    //   183: aload 7
    //   185: ifnull +27 -> 212
    //   188: aconst_null
    //   189: astore 9
    //   191: aload 8
    //   193: ifnull +19 -> 212
    //   196: iconst_2
    //   197: anewarray 199	java/lang/String
    //   200: dup
    //   201: iconst_0
    //   202: aload 7
    //   204: aastore
    //   205: dup
    //   206: iconst_1
    //   207: aload 8
    //   209: aastore
    //   210: astore 9
    //   212: aload 9
    //   214: areturn
    //   215: astore 5
    //   217: aconst_null
    //   218: astore 4
    //   220: ldc 129
    //   222: new 15	java/lang/StringBuilder
    //   225: dup
    //   226: ldc 201
    //   228: invokespecial 21	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   231: aload_2
    //   232: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: invokevirtual 38	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   238: aload 5
    //   240: invokestatic 138	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   243: pop
    //   244: aload_0
    //   245: getfield 65	com/mixpanel/android/mpmetrics/MPDbAdapter:e	Lcom/mixpanel/android/mpmetrics/k;
    //   248: invokevirtual 127	com/mixpanel/android/mpmetrics/k:close	()V
    //   251: aload 4
    //   253: ifnull +53 -> 306
    //   256: aload 4
    //   258: invokeinterface 126 1 0
    //   263: aconst_null
    //   264: astore 7
    //   266: aconst_null
    //   267: astore 8
    //   269: goto -89 -> 180
    //   272: astore_3
    //   273: aconst_null
    //   274: astore 4
    //   276: aload_0
    //   277: getfield 65	com/mixpanel/android/mpmetrics/MPDbAdapter:e	Lcom/mixpanel/android/mpmetrics/k;
    //   280: invokevirtual 127	com/mixpanel/android/mpmetrics/k:close	()V
    //   283: aload 4
    //   285: ifnull +10 -> 295
    //   288: aload 4
    //   290: invokeinterface 126 1 0
    //   295: aload_3
    //   296: athrow
    //   297: astore_3
    //   298: goto -22 -> 276
    //   301: astore 5
    //   303: goto -83 -> 220
    //   306: aconst_null
    //   307: astore 7
    //   309: aconst_null
    //   310: astore 8
    //   312: goto -132 -> 180
    //   315: aload 13
    //   317: astore 8
    //   319: aload 12
    //   321: astore 7
    //   323: goto -143 -> 180
    //   326: aconst_null
    //   327: astore 13
    //   329: goto -176 -> 153
    //
    // Exception table:
    //   from	to	target	type
    //   97	126	129	org/json/JSONException
    //   5	39	215	android/database/sqlite/SQLiteException
    //   5	39	272	finally
    //   43	52	297	finally
    //   55	93	297	finally
    //   97	126	297	finally
    //   134	149	297	finally
    //   220	244	297	finally
    //   43	52	301	android/database/sqlite/SQLiteException
    //   55	93	301	android/database/sqlite/SQLiteException
    //   97	126	301	android/database/sqlite/SQLiteException
    //   134	149	301	android/database/sqlite/SQLiteException
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.MPDbAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
