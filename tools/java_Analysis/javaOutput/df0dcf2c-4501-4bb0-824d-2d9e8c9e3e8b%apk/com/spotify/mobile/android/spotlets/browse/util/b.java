package com.spotify.mobile.android.spotlets.browse.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.widget.ImageView;
import com.b.a.a;
import com.spotify.mobile.android.util.bp;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class b
{
  private a a;
  private Bitmap.CompressFormat b = Bitmap.CompressFormat.JPEG;
  private int c = 70;

  public b(Context paramContext, String paramString, Bitmap.CompressFormat paramCompressFormat)
  {
    try
    {
      this.a = a.a(new File(paramContext.getCacheDir().getPath() + File.separator + paramString));
      this.b = paramCompressFormat;
      this.c = 70;
      return;
    }
    catch (IOException localIOException)
    {
      bp.b("Exception occurred on creating disk cache with name: " + paramString + ", " + localIOException.getMessage(), new Object[0]);
    }
  }

  // ERROR //
  private Bitmap a(String paramString, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: getfield 62	com/spotify/mobile/android/spotlets/browse/util/b:a	Lcom/b/a/a;
    //   6: aload_1
    //   7: invokevirtual 79	com/b/a/a:a	(Ljava/lang/String;)Lcom/b/a/e;
    //   10: astore 9
    //   12: aload 9
    //   14: astore 5
    //   16: aload 5
    //   18: ifnonnull +19 -> 37
    //   21: aconst_null
    //   22: astore 7
    //   24: aload 5
    //   26: ifnull +8 -> 34
    //   29: aload 5
    //   31: invokevirtual 84	com/b/a/e:close	()V
    //   34: aload 7
    //   36: areturn
    //   37: aload 5
    //   39: invokevirtual 87	com/b/a/e:a	()Ljava/io/InputStream;
    //   42: astore 10
    //   44: sipush 8192
    //   47: newarray byte
    //   49: astore 11
    //   51: new 89	java/io/ByteArrayOutputStream
    //   54: dup
    //   55: sipush 2048
    //   58: invokespecial 92	java/io/ByteArrayOutputStream:<init>	(I)V
    //   61: astore 12
    //   63: aload 12
    //   65: invokevirtual 95	java/io/ByteArrayOutputStream:reset	()V
    //   68: aload 10
    //   70: aload 11
    //   72: iconst_0
    //   73: sipush 8192
    //   76: invokevirtual 101	java/io/InputStream:read	([BII)I
    //   79: istore 13
    //   81: iload 13
    //   83: iconst_m1
    //   84: if_icmpeq +60 -> 144
    //   87: aload 12
    //   89: aload 11
    //   91: iconst_0
    //   92: iload 13
    //   94: invokevirtual 105	java/io/ByteArrayOutputStream:write	([BII)V
    //   97: goto -29 -> 68
    //   100: astore 4
    //   102: new 30	java/lang/StringBuilder
    //   105: dup
    //   106: ldc 107
    //   108: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   111: aload 4
    //   113: invokevirtual 70	java/io/IOException:getMessage	()Ljava/lang/String;
    //   116: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: iconst_0
    //   123: anewarray 4	java/lang/Object
    //   126: invokestatic 75	com/spotify/mobile/android/util/bp:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: aconst_null
    //   130: astore 7
    //   132: aload 5
    //   134: ifnull -100 -> 34
    //   137: aload 5
    //   139: invokevirtual 84	com/b/a/e:close	()V
    //   142: aconst_null
    //   143: areturn
    //   144: aload 12
    //   146: invokevirtual 111	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   149: astore 14
    //   151: aconst_null
    //   152: astore 7
    //   154: aload 14
    //   156: ifnull +100 -> 256
    //   159: new 113	android/graphics/BitmapFactory$Options
    //   162: dup
    //   163: invokespecial 114	android/graphics/BitmapFactory$Options:<init>	()V
    //   166: astore 15
    //   168: aload 15
    //   170: iconst_1
    //   171: putfield 118	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   174: aload 14
    //   176: iconst_0
    //   177: aload 14
    //   179: arraylength
    //   180: aload 15
    //   182: invokestatic 124	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   185: pop
    //   186: aload 15
    //   188: getfield 127	android/graphics/BitmapFactory$Options:outWidth	I
    //   191: iload_3
    //   192: idiv
    //   193: iconst_2
    //   194: idiv
    //   195: iload_2
    //   196: if_icmplt +10 -> 206
    //   199: iload_3
    //   200: iconst_2
    //   201: imul
    //   202: istore_3
    //   203: goto -17 -> 186
    //   206: new 113	android/graphics/BitmapFactory$Options
    //   209: dup
    //   210: invokespecial 114	android/graphics/BitmapFactory$Options:<init>	()V
    //   213: astore 17
    //   215: aload 17
    //   217: iconst_1
    //   218: putfield 130	android/graphics/BitmapFactory$Options:inPurgeable	Z
    //   221: aload 17
    //   223: iconst_0
    //   224: putfield 133	android/graphics/BitmapFactory$Options:inDither	Z
    //   227: aload 17
    //   229: iconst_1
    //   230: putfield 136	android/graphics/BitmapFactory$Options:inInputShareable	Z
    //   233: aload 17
    //   235: iload_3
    //   236: putfield 139	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   239: aload 14
    //   241: iconst_0
    //   242: aload 14
    //   244: arraylength
    //   245: aload 17
    //   247: invokestatic 124	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   250: astore 18
    //   252: aload 18
    //   254: astore 7
    //   256: aload 5
    //   258: ifnull -224 -> 34
    //   261: aload 5
    //   263: invokevirtual 84	com/b/a/e:close	()V
    //   266: aload 7
    //   268: areturn
    //   269: astore 8
    //   271: aconst_null
    //   272: astore 5
    //   274: aload 8
    //   276: astore 6
    //   278: aload 5
    //   280: ifnull +8 -> 288
    //   283: aload 5
    //   285: invokevirtual 84	com/b/a/e:close	()V
    //   288: aload 6
    //   290: athrow
    //   291: astore 6
    //   293: goto -15 -> 278
    //   296: astore 4
    //   298: aconst_null
    //   299: astore 5
    //   301: goto -199 -> 102
    //
    // Exception table:
    //   from	to	target	type
    //   37	68	100	java/io/IOException
    //   68	81	100	java/io/IOException
    //   87	97	100	java/io/IOException
    //   144	151	100	java/io/IOException
    //   159	186	100	java/io/IOException
    //   186	199	100	java/io/IOException
    //   206	252	100	java/io/IOException
    //   2	12	269	finally
    //   37	68	291	finally
    //   68	81	291	finally
    //   87	97	291	finally
    //   102	129	291	finally
    //   144	151	291	finally
    //   159	186	291	finally
    //   186	199	291	finally
    //   206	252	291	finally
    //   2	12	296	java/io/IOException
  }

  // ERROR //
  private boolean a(Bitmap paramBitmap, com.b.a.b paramb)
  {
    // Byte code:
    //   0: new 159	java/io/BufferedOutputStream
    //   3: dup
    //   4: aload_2
    //   5: invokevirtual 162	com/b/a/b:a	()Ljava/io/OutputStream;
    //   8: sipush 8192
    //   11: invokespecial 165	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   14: astore_3
    //   15: aload_1
    //   16: aload_0
    //   17: getfield 24	com/spotify/mobile/android/spotlets/browse/util/b:b	Landroid/graphics/Bitmap$CompressFormat;
    //   20: aload_0
    //   21: getfield 26	com/spotify/mobile/android/spotlets/browse/util/b:c	I
    //   24: aload_3
    //   25: invokevirtual 171	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   28: istore 5
    //   30: aload_3
    //   31: invokevirtual 174	java/io/OutputStream:close	()V
    //   34: iload 5
    //   36: ireturn
    //   37: astore 4
    //   39: aconst_null
    //   40: astore_3
    //   41: aload_3
    //   42: ifnull +7 -> 49
    //   45: aload_3
    //   46: invokevirtual 174	java/io/OutputStream:close	()V
    //   49: aload 4
    //   51: athrow
    //   52: astore 4
    //   54: goto -13 -> 41
    //
    // Exception table:
    //   from	to	target	type
    //   0	15	37	finally
    //   15	30	52	finally
  }

  private static String b(String paramString)
  {
    try
    {
      byte[] arrayOfByte = MessageDigest.getInstance("MD5").digest(paramString.getBytes());
      StringBuffer localStringBuffer = new StringBuffer();
      for (int i = 0; i < arrayOfByte.length; i++)
        localStringBuffer.append(Integer.toHexString(0x100 | 0xFF & arrayOfByte[i]).substring(1, 3));
      String str = localStringBuffer.toString();
      return str;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      bp.b("Exception occurred when md5 hashing: " + paramString + ", " + localNoSuchAlgorithmException.getMessage(), new Object[0]);
    }
    return null;
  }

  public final void a(ImageView paramImageView, String paramString, int paramInt)
  {
    Bitmap localBitmap = a(b(paramString), paramInt);
    if (localBitmap == null)
    {
      new c(this, paramImageView, paramString).execute(new Void[0]);
      return;
    }
    paramImageView.setImageBitmap(localBitmap);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.util.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
