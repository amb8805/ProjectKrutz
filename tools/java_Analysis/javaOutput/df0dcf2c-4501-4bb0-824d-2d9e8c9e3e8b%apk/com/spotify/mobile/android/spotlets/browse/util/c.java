package com.spotify.mobile.android.spotlets.browse.util;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;

final class c extends AsyncTask<Void, Void, Bitmap>
{
  private final ImageView b;
  private String c;

  public c(b paramb, ImageView paramImageView, String paramString)
  {
    paramImageView.setTag(paramString);
    this.b = paramImageView;
    this.c = paramString;
  }

  // ERROR //
  private Bitmap a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 28	com/spotify/mobile/android/spotlets/browse/util/c:c	Ljava/lang/String;
    //   6: invokestatic 36	com/spotify/mobile/android/spotlets/browse/util/b:a	(Ljava/lang/String;)Ljava/lang/String;
    //   9: astore_2
    //   10: new 38	java/net/URL
    //   13: dup
    //   14: aload_0
    //   15: getfield 28	com/spotify/mobile/android/spotlets/browse/util/c:c	Ljava/lang/String;
    //   18: invokespecial 41	java/net/URL:<init>	(Ljava/lang/String;)V
    //   21: invokevirtual 45	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   24: checkcast 47	java/net/HttpURLConnection
    //   27: astore 6
    //   29: aload 6
    //   31: iconst_1
    //   32: invokevirtual 51	java/net/HttpURLConnection:setDoInput	(Z)V
    //   35: aload 6
    //   37: invokevirtual 54	java/net/HttpURLConnection:connect	()V
    //   40: aload 6
    //   42: invokevirtual 58	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   45: invokestatic 64	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   48: astore 7
    //   50: aload_0
    //   51: getfield 15	com/spotify/mobile/android/spotlets/browse/util/c:a	Lcom/spotify/mobile/android/spotlets/browse/util/b;
    //   54: aload_2
    //   55: aload 7
    //   57: invokestatic 67	com/spotify/mobile/android/spotlets/browse/util/b:a	(Lcom/spotify/mobile/android/spotlets/browse/util/b;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //   60: aload 7
    //   62: areturn
    //   63: astore_3
    //   64: aload_3
    //   65: astore 4
    //   67: aconst_null
    //   68: astore 5
    //   70: aload_1
    //   71: ifnull +7 -> 78
    //   74: aload_1
    //   75: invokevirtual 70	java/net/HttpURLConnection:disconnect	()V
    //   78: new 72	java/lang/StringBuilder
    //   81: dup
    //   82: ldc 74
    //   84: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   87: aload_0
    //   88: getfield 28	com/spotify/mobile/android/spotlets/browse/util/c:c	Ljava/lang/String;
    //   91: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: ldc 81
    //   96: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: aload 4
    //   101: invokevirtual 85	java/io/IOException:getMessage	()Ljava/lang/String;
    //   104: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: iconst_0
    //   111: anewarray 90	java/lang/Object
    //   114: invokestatic 95	com/spotify/mobile/android/util/bp:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   117: aload 5
    //   119: areturn
    //   120: astore 4
    //   122: aload 6
    //   124: astore_1
    //   125: aconst_null
    //   126: astore 5
    //   128: goto -58 -> 70
    //   131: astore 8
    //   133: aload 6
    //   135: astore_1
    //   136: aload 7
    //   138: astore 5
    //   140: aload 8
    //   142: astore 4
    //   144: goto -74 -> 70
    //
    // Exception table:
    //   from	to	target	type
    //   10	29	63	java/io/IOException
    //   29	50	120	java/io/IOException
    //   50	60	131	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.util.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
