package com.facebook;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class c
{
  private static Object a = new Object();
  private Context b;
  private HashMap<AppEventsLogger.AccessTokenAppIdPair, List<AppEventsLogger.AppEvent>> c = new HashMap();

  private c(Context paramContext)
  {
    this.b = paramContext;
  }

  // ERROR //
  public static c a(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 18	com/facebook/c:a	Ljava/lang/Object;
    //   3: astore_1
    //   4: aload_1
    //   5: monitorenter
    //   6: new 2	com/facebook/c
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 33	com/facebook/c:<init>	(Landroid/content/Context;)V
    //   14: astore_2
    //   15: new 35	java/io/ObjectInputStream
    //   18: dup
    //   19: new 37	java/io/BufferedInputStream
    //   22: dup
    //   23: aload_2
    //   24: getfield 26	com/facebook/c:b	Landroid/content/Context;
    //   27: ldc 39
    //   29: invokevirtual 45	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   32: invokespecial 48	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   35: invokespecial 49	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   38: astore_3
    //   39: aload_3
    //   40: invokevirtual 53	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   43: checkcast 21	java/util/HashMap
    //   46: astore 10
    //   48: aload_2
    //   49: getfield 26	com/facebook/c:b	Landroid/content/Context;
    //   52: ldc 39
    //   54: invokevirtual 57	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   57: invokevirtual 63	java/io/File:delete	()Z
    //   60: pop
    //   61: aload_2
    //   62: aload 10
    //   64: putfield 24	com/facebook/c:c	Ljava/util/HashMap;
    //   67: aload_3
    //   68: invokestatic 68	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   71: aload_1
    //   72: monitorexit
    //   73: aload_2
    //   74: areturn
    //   75: aload 5
    //   77: invokestatic 68	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   80: goto -9 -> 71
    //   83: astore 6
    //   85: aload_1
    //   86: monitorexit
    //   87: aload 6
    //   89: athrow
    //   90: astore 13
    //   92: aconst_null
    //   93: astore_3
    //   94: aload 13
    //   96: astore 7
    //   98: invokestatic 74	com/facebook/AppEventsLogger:f	()Ljava/lang/String;
    //   101: new 76	java/lang/StringBuilder
    //   104: dup
    //   105: ldc 78
    //   107: invokespecial 81	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   110: aload 7
    //   112: invokevirtual 84	java/lang/Exception:toString	()Ljava/lang/String;
    //   115: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   121: invokestatic 95	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   124: pop
    //   125: aload_3
    //   126: invokestatic 68	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   129: goto -58 -> 71
    //   132: aload_3
    //   133: invokestatic 68	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   136: aload 8
    //   138: athrow
    //   139: astore 8
    //   141: goto -9 -> 132
    //   144: astore 7
    //   146: goto -48 -> 98
    //   149: astore 4
    //   151: aload_3
    //   152: astore 5
    //   154: goto -79 -> 75
    //   157: astore 14
    //   159: aconst_null
    //   160: astore 5
    //   162: goto -87 -> 75
    //   165: astore 12
    //   167: aload 12
    //   169: astore 8
    //   171: aconst_null
    //   172: astore_3
    //   173: goto -41 -> 132
    //
    // Exception table:
    //   from	to	target	type
    //   6	15	83	finally
    //   67	71	83	finally
    //   71	73	83	finally
    //   75	80	83	finally
    //   125	129	83	finally
    //   132	139	83	finally
    //   15	39	90	java/lang/Exception
    //   39	67	139	finally
    //   98	125	139	finally
    //   39	67	144	java/lang/Exception
    //   39	67	149	java/io/FileNotFoundException
    //   15	39	157	java/io/FileNotFoundException
    //   15	39	165	finally
  }

  public static void a(Context paramContext, AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair, d paramd)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(paramAccessTokenAppIdPair, paramd);
    a(paramContext, localHashMap);
  }

  // ERROR //
  public static void a(Context paramContext, Map<AppEventsLogger.AccessTokenAppIdPair, d> paramMap)
  {
    // Byte code:
    //   0: getstatic 18	com/facebook/c:a	Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_2
    //   5: monitorenter
    //   6: aload_0
    //   7: invokestatic 107	com/facebook/c:a	(Landroid/content/Context;)Lcom/facebook/c;
    //   10: astore 4
    //   12: aload_1
    //   13: invokeinterface 111 1 0
    //   18: invokeinterface 117 1 0
    //   23: astore 5
    //   25: aload 5
    //   27: invokeinterface 122 1 0
    //   32: ifeq +112 -> 144
    //   35: aload 5
    //   37: invokeinterface 125 1 0
    //   42: checkcast 127	java/util/Map$Entry
    //   45: astore 10
    //   47: aload 10
    //   49: invokeinterface 130 1 0
    //   54: checkcast 132	com/facebook/d
    //   57: invokevirtual 135	com/facebook/d:b	()Ljava/util/List;
    //   60: astore 11
    //   62: aload 11
    //   64: invokeinterface 141 1 0
    //   69: ifeq -44 -> 25
    //   72: aload 10
    //   74: invokeinterface 144 1 0
    //   79: checkcast 146	com/facebook/AppEventsLogger$AccessTokenAppIdPair
    //   82: astore 12
    //   84: aload 4
    //   86: getfield 24	com/facebook/c:c	Ljava/util/HashMap;
    //   89: aload 12
    //   91: invokevirtual 150	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   94: ifne +21 -> 115
    //   97: aload 4
    //   99: getfield 24	com/facebook/c:c	Ljava/util/HashMap;
    //   102: aload 12
    //   104: new 152	java/util/ArrayList
    //   107: dup
    //   108: invokespecial 153	java/util/ArrayList:<init>	()V
    //   111: invokevirtual 154	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   114: pop
    //   115: aload 4
    //   117: getfield 24	com/facebook/c:c	Ljava/util/HashMap;
    //   120: aload 12
    //   122: invokevirtual 158	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   125: checkcast 137	java/util/List
    //   128: aload 11
    //   130: invokeinterface 162 2 0
    //   135: pop
    //   136: goto -111 -> 25
    //   139: astore_3
    //   140: aload_2
    //   141: monitorexit
    //   142: aload_3
    //   143: athrow
    //   144: new 164	java/io/ObjectOutputStream
    //   147: dup
    //   148: new 166	java/io/BufferedOutputStream
    //   151: dup
    //   152: aload 4
    //   154: getfield 26	com/facebook/c:b	Landroid/content/Context;
    //   157: ldc 39
    //   159: iconst_0
    //   160: invokevirtual 170	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   163: invokespecial 173	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   166: invokespecial 174	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   169: astore 6
    //   171: aload 6
    //   173: aload 4
    //   175: getfield 24	com/facebook/c:c	Ljava/util/HashMap;
    //   178: invokevirtual 178	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   181: aload 6
    //   183: invokestatic 68	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   186: aload_2
    //   187: monitorexit
    //   188: return
    //   189: astore 7
    //   191: aconst_null
    //   192: astore 6
    //   194: invokestatic 74	com/facebook/AppEventsLogger:f	()Ljava/lang/String;
    //   197: new 76	java/lang/StringBuilder
    //   200: dup
    //   201: ldc 78
    //   203: invokespecial 81	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   206: aload 7
    //   208: invokevirtual 84	java/lang/Exception:toString	()Ljava/lang/String;
    //   211: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   217: invokestatic 95	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   220: pop
    //   221: aload 6
    //   223: invokestatic 68	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   226: goto -40 -> 186
    //   229: aload 6
    //   231: invokestatic 68	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   234: aload 8
    //   236: athrow
    //   237: astore 8
    //   239: goto -10 -> 229
    //   242: astore 7
    //   244: goto -50 -> 194
    //   247: astore 8
    //   249: aconst_null
    //   250: astore 6
    //   252: goto -23 -> 229
    //
    // Exception table:
    //   from	to	target	type
    //   6	25	139	finally
    //   25	115	139	finally
    //   115	136	139	finally
    //   181	186	139	finally
    //   186	188	139	finally
    //   221	226	139	finally
    //   229	237	139	finally
    //   144	171	189	java/lang/Exception
    //   171	181	237	finally
    //   194	221	237	finally
    //   171	181	242	java/lang/Exception
    //   144	171	247	finally
  }

  public final List<AppEventsLogger.AppEvent> a(AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    return (List)this.c.get(paramAccessTokenAppIdPair);
  }

  public final Set<AppEventsLogger.AccessTokenAppIdPair> a()
  {
    return this.c.keySet();
  }
}

/* Location:
 * Qualified Name:     com.facebook.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
