package com.spotify.mobile.android.util;

import android.app.Activity;
import android.app.Service;
import android.net.Uri;
import android.support.v4.app.n;
import com.spotify.mobile.android.provider.SpotifyProvider;

public class ed
{
  private static final String a = ed.class.getSimpleName();
  private static final String[] b = { "url", "token", "type" };
  private String c;
  private eg d;

  private ed()
  {
  }

  public static ed a(Activity paramActivity, n paramn)
  {
    return new ee(paramActivity, paramn, (byte)0);
  }

  public static ed a(Service paramService)
  {
    return new ef(paramService, (byte)0);
  }

  // ERROR //
  protected final void a(android.database.Cursor paramCursor)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: invokeinterface 60 1 0
    //   8: ifne +4 -> 12
    //   11: return
    //   12: aload_1
    //   13: invokestatic 65	com/spotify/mobile/android/provider/ae:a	(Landroid/database/Cursor;)Z
    //   16: ifeq -5 -> 11
    //   19: aload_0
    //   20: getfield 67	com/spotify/mobile/android/util/ed:d	Lcom/spotify/mobile/android/util/eg;
    //   23: ifnull -12 -> 11
    //   26: aload_0
    //   27: getfield 69	com/spotify/mobile/android/util/ed:c	Ljava/lang/String;
    //   30: invokestatic 75	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   33: invokevirtual 79	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   36: astore_3
    //   37: aload_1
    //   38: iconst_1
    //   39: ldc 81
    //   41: invokestatic 86	com/spotify/mobile/android/util/am:a	(Landroid/database/Cursor;ILjava/lang/String;)Ljava/lang/String;
    //   44: astore 12
    //   46: aload 12
    //   48: astore 6
    //   50: aconst_null
    //   51: astore_2
    //   52: aload 6
    //   54: ifnull +59 -> 113
    //   57: aload 6
    //   59: ldc 81
    //   61: invokevirtual 90	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   64: istore 13
    //   66: aconst_null
    //   67: astore_2
    //   68: iload 13
    //   70: ifne +43 -> 113
    //   73: aload 6
    //   75: ldc 92
    //   77: invokevirtual 96	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   80: astore 14
    //   82: aload 14
    //   84: arraylength
    //   85: istore 15
    //   87: aconst_null
    //   88: astore_2
    //   89: iload 15
    //   91: iconst_2
    //   92: if_icmplt +21 -> 113
    //   95: aload 14
    //   97: iconst_1
    //   98: aaload
    //   99: ldc 98
    //   101: invokestatic 104	java/net/URLDecoder:decode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   104: astore_2
    //   105: aload_3
    //   106: ldc 106
    //   108: aload_2
    //   109: invokevirtual 112	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   112: pop
    //   113: aload_3
    //   114: invokevirtual 116	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   117: astore 7
    //   119: iconst_1
    //   120: anewarray 4	java/lang/Object
    //   123: astore 8
    //   125: aload 8
    //   127: iconst_0
    //   128: aload_0
    //   129: getfield 69	com/spotify/mobile/android/util/ed:c	Ljava/lang/String;
    //   132: aastore
    //   133: ldc 118
    //   135: aload 8
    //   137: invokestatic 123	com/spotify/mobile/android/util/bp:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   140: ldc 125
    //   142: iconst_1
    //   143: anewarray 4	java/lang/Object
    //   146: dup
    //   147: iconst_0
    //   148: aload 6
    //   150: aastore
    //   151: invokestatic 123	com/spotify/mobile/android/util/bp:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   154: ldc 127
    //   156: iconst_1
    //   157: anewarray 4	java/lang/Object
    //   160: dup
    //   161: iconst_0
    //   162: aload_2
    //   163: aastore
    //   164: invokestatic 123	com/spotify/mobile/android/util/bp:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   167: iconst_1
    //   168: anewarray 4	java/lang/Object
    //   171: astore 9
    //   173: aload 9
    //   175: iconst_0
    //   176: aload 7
    //   178: invokevirtual 130	android/net/Uri:toString	()Ljava/lang/String;
    //   181: aastore
    //   182: ldc 132
    //   184: aload 9
    //   186: invokestatic 123	com/spotify/mobile/android/util/bp:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   189: aload_0
    //   190: getfield 67	com/spotify/mobile/android/util/ed:d	Lcom/spotify/mobile/android/util/eg;
    //   193: ifnull -182 -> 11
    //   196: aload_0
    //   197: getfield 67	com/spotify/mobile/android/util/ed:d	Lcom/spotify/mobile/android/util/eg;
    //   200: aload 7
    //   202: invokeinterface 138 2 0
    //   207: return
    //   208: astore 10
    //   210: aload 10
    //   212: astore 11
    //   214: aconst_null
    //   215: astore 6
    //   217: aload 11
    //   219: ldc 140
    //   221: invokestatic 143	com/spotify/mobile/android/util/bp:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   224: goto -111 -> 113
    //   227: astore 4
    //   229: aload 4
    //   231: astore 5
    //   233: aconst_null
    //   234: astore 6
    //   236: aload 5
    //   238: ldc 140
    //   240: invokestatic 143	com/spotify/mobile/android/util/bp:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   243: goto -130 -> 113
    //   246: astore 5
    //   248: goto -12 -> 236
    //   251: astore 11
    //   253: goto -36 -> 217
    //
    // Exception table:
    //   from	to	target	type
    //   37	46	208	java/lang/IllegalArgumentException
    //   37	46	227	java/io/UnsupportedEncodingException
    //   57	66	246	java/io/UnsupportedEncodingException
    //   73	87	246	java/io/UnsupportedEncodingException
    //   95	113	246	java/io/UnsupportedEncodingException
    //   57	66	251	java/lang/IllegalArgumentException
    //   73	87	251	java/lang/IllegalArgumentException
    //   95	113	251	java/lang/IllegalArgumentException
  }

  public void a(String paramString, eg parameg)
  {
    this.c = paramString;
    this.d = parameg;
  }

  public void b()
  {
    this.d = null;
  }

  protected final Uri c()
  {
    String str = this.c;
    return Uri.parse(SpotifyProvider.a + "/web_token/" + Uri.encode(str));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ed
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
