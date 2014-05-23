package com.facebook.internal;

import android.content.Context;
import java.io.IOException;

class ac
{
  static final String a = ac.class.getSimpleName();
  private static final String b = a + "_Redirect";
  private static volatile b c;

  ac()
  {
  }

  // ERROR //
  static java.net.URI a(Context paramContext, java.net.URI paramURI)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_1
    //   3: ifnonnull +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_1
    //   9: invokevirtual 44	java/net/URI:toString	()Ljava/lang/String;
    //   12: astore_3
    //   13: aload_0
    //   14: invokestatic 47	com/facebook/internal/ac:b	(Landroid/content/Context;)Lcom/facebook/internal/b;
    //   17: astore 9
    //   19: aload_3
    //   20: astore 10
    //   22: aconst_null
    //   23: astore 11
    //   25: aload 9
    //   27: aload 10
    //   29: getstatic 35	com/facebook/internal/ac:b	Ljava/lang/String;
    //   32: invokevirtual 52	com/facebook/internal/b:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    //   35: astore 14
    //   37: aload 14
    //   39: ifnull +96 -> 135
    //   42: new 54	java/io/InputStreamReader
    //   45: dup
    //   46: aload 14
    //   48: invokespecial 57	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   51: astore 5
    //   53: sipush 128
    //   56: newarray char
    //   58: astore 17
    //   60: new 21	java/lang/StringBuilder
    //   63: dup
    //   64: invokespecial 24	java/lang/StringBuilder:<init>	()V
    //   67: astore 18
    //   69: aload 5
    //   71: aload 17
    //   73: iconst_0
    //   74: sipush 128
    //   77: invokevirtual 61	java/io/InputStreamReader:read	([CII)I
    //   80: istore 19
    //   82: iload 19
    //   84: ifle +26 -> 110
    //   87: aload 18
    //   89: aload 17
    //   91: iconst_0
    //   92: iload 19
    //   94: invokevirtual 64	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: goto -29 -> 69
    //   101: astore 16
    //   103: aload 5
    //   105: invokestatic 69	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   108: aconst_null
    //   109: areturn
    //   110: aload 5
    //   112: invokestatic 69	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   115: aload 18
    //   117: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   120: astore 21
    //   122: aload 21
    //   124: astore 10
    //   126: aload 5
    //   128: astore 11
    //   130: iconst_1
    //   131: istore_2
    //   132: goto -107 -> 25
    //   135: iload_2
    //   136: ifeq +22 -> 158
    //   139: new 43	java/net/URI
    //   142: dup
    //   143: aload 10
    //   145: invokespecial 72	java/net/URI:<init>	(Ljava/lang/String;)V
    //   148: astore 22
    //   150: aload 11
    //   152: invokestatic 69	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   155: aload 22
    //   157: areturn
    //   158: aload 11
    //   160: invokestatic 69	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   163: aconst_null
    //   164: areturn
    //   165: astore 8
    //   167: aconst_null
    //   168: astore 5
    //   170: aload 5
    //   172: invokestatic 69	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   175: aconst_null
    //   176: areturn
    //   177: astore 6
    //   179: aconst_null
    //   180: astore 5
    //   182: aload 6
    //   184: astore 7
    //   186: aload 5
    //   188: invokestatic 69	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   191: aload 7
    //   193: athrow
    //   194: astore 7
    //   196: goto -10 -> 186
    //   199: astore 7
    //   201: aload 11
    //   203: astore 5
    //   205: goto -19 -> 186
    //   208: astore 15
    //   210: goto -40 -> 170
    //   213: astore 13
    //   215: aload 11
    //   217: astore 5
    //   219: goto -49 -> 170
    //   222: astore 4
    //   224: aconst_null
    //   225: astore 5
    //   227: goto -124 -> 103
    //   230: astore 12
    //   232: aload 11
    //   234: astore 5
    //   236: goto -133 -> 103
    //
    // Exception table:
    //   from	to	target	type
    //   53	69	101	java/net/URISyntaxException
    //   69	82	101	java/net/URISyntaxException
    //   87	98	101	java/net/URISyntaxException
    //   110	122	101	java/net/URISyntaxException
    //   13	19	165	java/io/IOException
    //   13	19	177	finally
    //   53	69	194	finally
    //   69	82	194	finally
    //   87	98	194	finally
    //   110	122	194	finally
    //   25	37	199	finally
    //   42	53	199	finally
    //   139	150	199	finally
    //   53	69	208	java/io/IOException
    //   69	82	208	java/io/IOException
    //   87	98	208	java/io/IOException
    //   110	122	208	java/io/IOException
    //   25	37	213	java/io/IOException
    //   42	53	213	java/io/IOException
    //   139	150	213	java/io/IOException
    //   13	19	222	java/net/URISyntaxException
    //   25	37	230	java/net/URISyntaxException
    //   42	53	230	java/net/URISyntaxException
    //   139	150	230	java/net/URISyntaxException
  }

  static void a(Context paramContext)
  {
    try
    {
      b(paramContext).a();
      return;
    }
    catch (IOException localIOException)
    {
      new StringBuilder("clearCache failed ").append(localIOException.getMessage());
      u.c();
    }
  }

  // ERROR //
  static void a(Context paramContext, java.net.URI paramURI1, java.net.URI paramURI2)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aconst_null
    //   6: astore_3
    //   7: aload_0
    //   8: invokestatic 47	com/facebook/internal/ac:b	(Landroid/content/Context;)Lcom/facebook/internal/b;
    //   11: aload_1
    //   12: invokevirtual 44	java/net/URI:toString	()Ljava/lang/String;
    //   15: getstatic 35	com/facebook/internal/ac:b	Ljava/lang/String;
    //   18: invokevirtual 95	com/facebook/internal/b:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/OutputStream;
    //   21: astore 8
    //   23: aload 8
    //   25: astore_3
    //   26: aload_3
    //   27: aload_2
    //   28: invokevirtual 44	java/net/URI:toString	()Ljava/lang/String;
    //   31: invokevirtual 101	java/lang/String:getBytes	()[B
    //   34: invokevirtual 107	java/io/OutputStream:write	([B)V
    //   37: aload_3
    //   38: invokestatic 69	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   41: return
    //   42: astore 7
    //   44: aload_3
    //   45: invokestatic 69	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   48: return
    //   49: astore 4
    //   51: aconst_null
    //   52: astore 5
    //   54: aload 4
    //   56: astore 6
    //   58: aload 5
    //   60: invokestatic 69	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   63: aload 6
    //   65: athrow
    //   66: astore 9
    //   68: aload_3
    //   69: astore 5
    //   71: aload 9
    //   73: astore 6
    //   75: goto -17 -> 58
    //
    // Exception table:
    //   from	to	target	type
    //   7	23	42	java/io/IOException
    //   26	37	42	java/io/IOException
    //   7	23	49	finally
    //   26	37	66	finally
  }

  private static b b(Context paramContext)
  {
    try
    {
      if (c == null)
        c = new b(paramContext.getApplicationContext(), a, new f());
      b localb = c;
      return localb;
    }
    finally
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.ac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
