import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.Log;

public final class ab
{
  public static final PorterDuffXfermode a;
  private static final boolean b = Log.isLoggable("ImageUtils", 3);
  private static final Paint c;
  private static final Paint d;
  private static final Paint e;
  private static final Paint f;

  static
  {
    a = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    c = new Paint(2);
    Paint localPaint1 = new Paint();
    d = localPaint1;
    localPaint1.setStrokeWidth(1.0F);
    d.setStyle(Paint.Style.STROKE);
    d.setColor(-2039584);
    Paint localPaint2 = new Paint();
    e = localPaint2;
    localPaint2.setStrokeWidth(1.0F);
    e.setStyle(Paint.Style.STROKE);
    e.setColor(-986896);
    Paint localPaint3 = new Paint();
    f = localPaint3;
    localPaint3.setStrokeWidth(3.0F);
    f.setStyle(Paint.Style.STROKE);
    f.setColor(-986896);
  }

  private ab()
  {
  }

  // ERROR //
  public static Bitmap a(android.content.Context paramContext, android.net.Uri paramUri, float paramFloat1, float paramFloat2, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 84	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore 5
    //   6: aload 5
    //   8: aload_1
    //   9: invokevirtual 90	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   12: astore 12
    //   14: new 92	android/graphics/BitmapFactory$Options
    //   17: dup
    //   18: invokespecial 93	android/graphics/BitmapFactory$Options:<init>	()V
    //   21: astore 13
    //   23: aload 13
    //   25: iconst_1
    //   26: putfield 96	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   29: aload 12
    //   31: aconst_null
    //   32: aload 13
    //   34: invokestatic 102	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   37: pop
    //   38: aload 13
    //   40: getfield 106	android/graphics/BitmapFactory$Options:outWidth	I
    //   43: i2f
    //   44: fstore 16
    //   46: aload 13
    //   48: getfield 109	android/graphics/BitmapFactory$Options:outHeight	I
    //   51: i2f
    //   52: fstore 17
    //   54: getstatic 25	ab:b	Z
    //   57: ifeq +57 -> 114
    //   60: ldc 17
    //   62: new 111	java/lang/StringBuilder
    //   65: dup
    //   66: invokespecial 112	java/lang/StringBuilder:<init>	()V
    //   69: ldc 114
    //   71: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: fload 16
    //   76: invokevirtual 121	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   79: ldc 123
    //   81: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: fload 17
    //   86: invokevirtual 121	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   89: ldc 125
    //   91: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: fload_2
    //   95: invokevirtual 121	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   98: ldc 123
    //   100: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: fload_3
    //   104: invokevirtual 121	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   107: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: invokestatic 132	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   113: pop
    //   114: aload 5
    //   116: aload_1
    //   117: invokevirtual 90	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   120: astore 18
    //   122: fload 16
    //   124: fload_2
    //   125: fcmpl
    //   126: ifgt +10 -> 136
    //   129: fload 17
    //   131: fload_3
    //   132: fcmpl
    //   133: ifle +182 -> 315
    //   136: fload 16
    //   138: fload_2
    //   139: fdiv
    //   140: fstore 19
    //   142: fload 17
    //   144: fload_3
    //   145: fdiv
    //   146: fstore 20
    //   148: fload 19
    //   150: fload 20
    //   152: fcmpl
    //   153: ifle +140 -> 293
    //   156: fload 17
    //   158: fload 19
    //   160: fdiv
    //   161: fstore 21
    //   163: fload 16
    //   165: fload_2
    //   166: fdiv
    //   167: fconst_1
    //   168: fcmpl
    //   169: ifle +136 -> 305
    //   172: new 92	android/graphics/BitmapFactory$Options
    //   175: dup
    //   176: invokespecial 93	android/graphics/BitmapFactory$Options:<init>	()V
    //   179: astore 26
    //   181: aload 26
    //   183: fload 16
    //   185: fload_2
    //   186: fdiv
    //   187: f2i
    //   188: putfield 135	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   191: aload 18
    //   193: aconst_null
    //   194: aload 26
    //   196: invokestatic 102	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   199: astore 24
    //   201: aload 24
    //   203: ifnull +129 -> 332
    //   206: iconst_0
    //   207: fload_2
    //   208: f2i
    //   209: iadd
    //   210: iconst_0
    //   211: fload 21
    //   213: f2i
    //   214: iadd
    //   215: getstatic 141	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   218: invokestatic 147	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   221: astore 25
    //   223: new 149	android/graphics/Canvas
    //   226: dup
    //   227: aload 25
    //   229: invokespecial 152	android/graphics/Canvas:<init>	(Landroid/graphics/Bitmap;)V
    //   232: aload 24
    //   234: new 154	android/graphics/Rect
    //   237: dup
    //   238: iconst_0
    //   239: iconst_0
    //   240: aload 24
    //   242: invokevirtual 158	android/graphics/Bitmap:getWidth	()I
    //   245: aload 24
    //   247: invokevirtual 161	android/graphics/Bitmap:getHeight	()I
    //   250: invokespecial 164	android/graphics/Rect:<init>	(IIII)V
    //   253: new 154	android/graphics/Rect
    //   256: dup
    //   257: iconst_0
    //   258: iconst_0
    //   259: iconst_1
    //   260: fload_2
    //   261: f2i
    //   262: iadd
    //   263: fload 21
    //   265: f2i
    //   266: invokespecial 164	android/graphics/Rect:<init>	(IIII)V
    //   269: getstatic 46	ab:c	Landroid/graphics/Paint;
    //   272: invokevirtual 168	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    //   275: aload 24
    //   277: invokevirtual 171	android/graphics/Bitmap:recycle	()V
    //   280: aload 12
    //   282: invokestatic 176	cr:a	(Ljava/io/Closeable;)V
    //   285: aload 18
    //   287: invokestatic 176	cr:a	(Ljava/io/Closeable;)V
    //   290: aload 25
    //   292: areturn
    //   293: fload 16
    //   295: fload 20
    //   297: fdiv
    //   298: fstore_2
    //   299: fload_3
    //   300: fstore 21
    //   302: goto -139 -> 163
    //   305: aload 18
    //   307: invokestatic 179	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   310: astore 24
    //   312: goto -111 -> 201
    //   315: aload 18
    //   317: invokestatic 179	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   320: astore 27
    //   322: aload 27
    //   324: astore 24
    //   326: fload_3
    //   327: fstore 21
    //   329: goto -128 -> 201
    //   332: aload 12
    //   334: invokestatic 176	cr:a	(Ljava/io/Closeable;)V
    //   337: aload 18
    //   339: invokestatic 176	cr:a	(Ljava/io/Closeable;)V
    //   342: aconst_null
    //   343: areturn
    //   344: astore 9
    //   346: aconst_null
    //   347: astore 10
    //   349: aconst_null
    //   350: astore 11
    //   352: aload 10
    //   354: invokestatic 176	cr:a	(Ljava/io/Closeable;)V
    //   357: aload 11
    //   359: invokestatic 176	cr:a	(Ljava/io/Closeable;)V
    //   362: aconst_null
    //   363: areturn
    //   364: astore 6
    //   366: aconst_null
    //   367: astore 7
    //   369: aconst_null
    //   370: astore 8
    //   372: aload 7
    //   374: invokestatic 176	cr:a	(Ljava/io/Closeable;)V
    //   377: aload 8
    //   379: invokestatic 176	cr:a	(Ljava/io/Closeable;)V
    //   382: aload 6
    //   384: athrow
    //   385: astore 6
    //   387: aload 12
    //   389: astore 7
    //   391: aconst_null
    //   392: astore 8
    //   394: goto -22 -> 372
    //   397: astore 23
    //   399: aload 18
    //   401: astore 8
    //   403: aload 23
    //   405: astore 6
    //   407: aload 12
    //   409: astore 7
    //   411: goto -39 -> 372
    //   414: astore 14
    //   416: aload 12
    //   418: astore 10
    //   420: aconst_null
    //   421: astore 11
    //   423: goto -71 -> 352
    //   426: astore 22
    //   428: aload 18
    //   430: astore 11
    //   432: aload 12
    //   434: astore 10
    //   436: goto -84 -> 352
    //
    // Exception table:
    //   from	to	target	type
    //   6	14	344	java/io/IOException
    //   6	14	364	finally
    //   14	114	385	finally
    //   114	122	385	finally
    //   172	201	397	finally
    //   206	280	397	finally
    //   305	312	397	finally
    //   315	322	397	finally
    //   14	114	414	java/io/IOException
    //   114	122	414	java/io/IOException
    //   172	201	426	java/io/IOException
    //   206	280	426	java/io/IOException
    //   305	312	426	java/io/IOException
    //   315	322	426	java/io/IOException
  }

  public static Bitmap a(Bitmap paramBitmap, int paramInt)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint(3);
    RoundRectShape localRoundRectShape = new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null);
    localRoundRectShape.resize(paramInt, paramInt);
    localRoundRectShape.draw(localCanvas, localPaint);
    localPaint.setXfermode(a);
    if ((paramBitmap.getWidth() != paramInt) || (paramBitmap.getHeight() != paramInt))
    {
      localCanvas.drawBitmap(paramBitmap, new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight()), new Rect(0, 0, paramInt, paramInt), localPaint);
      return localBitmap;
    }
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, localPaint);
    return localBitmap;
  }

  public static Bitmap a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    BitmapFactory.Options localOptions1 = new BitmapFactory.Options();
    localOptions1.inJustDecodeBounds = true;
    BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, localOptions1);
    int i = localOptions1.outWidth;
    int j = localOptions1.outHeight;
    if (b)
      Log.d("ImageUtils", "resizeBitmap: Input: " + i + "x" + j + ", resize to: " + paramInt1 + "x" + paramInt2);
    int k = Math.min(paramInt1, paramInt2);
    int m = Math.max(i, j);
    if (m > k)
    {
      BitmapFactory.Options localOptions2 = new BitmapFactory.Options();
      localOptions2.inSampleSize = Math.max(2, m / k);
      return BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, localOptions2);
    }
    return BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
}

/* Location:
 * Qualified Name:     ab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
