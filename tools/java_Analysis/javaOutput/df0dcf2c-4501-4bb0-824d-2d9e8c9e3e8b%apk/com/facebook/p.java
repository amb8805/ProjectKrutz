package com.facebook;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.ParcelFileDescriptor;
import com.facebook.internal.u;
import java.io.BufferedOutputStream;

final class p
  implements o
{
  private final BufferedOutputStream a;
  private final u b;
  private boolean c = true;

  public p(BufferedOutputStream paramBufferedOutputStream, u paramu)
  {
    this.a = paramBufferedOutputStream;
    this.b = paramu;
  }

  private void a()
  {
    b("--%s", new Object[] { "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" });
  }

  // ERROR //
  private void a(String paramString1, ParcelFileDescriptor paramParcelFileDescriptor, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_3
    //   4: ifnonnull +6 -> 10
    //   7: ldc 33
    //   9: astore_3
    //   10: aload_0
    //   11: aload_1
    //   12: aload_1
    //   13: aload_3
    //   14: invokespecial 36	com/facebook/p:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   17: new 38	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   20: dup
    //   21: aload_2
    //   22: invokespecial 41	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   25: astore 5
    //   27: new 43	java/io/BufferedInputStream
    //   30: dup
    //   31: aload 5
    //   33: invokespecial 46	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   36: astore 6
    //   38: sipush 8192
    //   41: newarray byte
    //   43: astore 8
    //   45: iconst_0
    //   46: istore 9
    //   48: aload 6
    //   50: aload 8
    //   52: invokevirtual 50	java/io/BufferedInputStream:read	([B)I
    //   55: istore 10
    //   57: iload 10
    //   59: iconst_m1
    //   60: if_icmpeq +25 -> 85
    //   63: aload_0
    //   64: getfield 21	com/facebook/p:a	Ljava/io/BufferedOutputStream;
    //   67: aload 8
    //   69: iconst_0
    //   70: iload 10
    //   72: invokevirtual 56	java/io/BufferedOutputStream:write	([BII)V
    //   75: iload 9
    //   77: iload 10
    //   79: iadd
    //   80: istore 9
    //   82: goto -34 -> 48
    //   85: aload 6
    //   87: invokevirtual 59	java/io/BufferedInputStream:close	()V
    //   90: aload 5
    //   92: invokevirtual 60	android/os/ParcelFileDescriptor$AutoCloseInputStream:close	()V
    //   95: aload_0
    //   96: ldc 62
    //   98: iconst_0
    //   99: anewarray 4	java/lang/Object
    //   102: invokespecial 30	com/facebook/p:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: aload_0
    //   106: invokespecial 64	com/facebook/p:a	()V
    //   109: aload_0
    //   110: getfield 23	com/facebook/p:b	Lcom/facebook/internal/u;
    //   113: astore 11
    //   115: new 66	java/lang/StringBuilder
    //   118: dup
    //   119: ldc 68
    //   121: invokespecial 71	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   124: aload_1
    //   125: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: astore 12
    //   133: iconst_1
    //   134: anewarray 4	java/lang/Object
    //   137: astore 13
    //   139: aload 13
    //   141: iconst_0
    //   142: iload 9
    //   144: invokestatic 85	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   147: aastore
    //   148: aload 11
    //   150: aload 12
    //   152: ldc 87
    //   154: aload 13
    //   156: invokestatic 93	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   159: invokevirtual 98	com/facebook/internal/u:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   162: return
    //   163: astore 7
    //   165: aconst_null
    //   166: astore 6
    //   168: aload 6
    //   170: ifnull +8 -> 178
    //   173: aload 6
    //   175: invokevirtual 59	java/io/BufferedInputStream:close	()V
    //   178: aload 4
    //   180: ifnull +8 -> 188
    //   183: aload 4
    //   185: invokevirtual 60	android/os/ParcelFileDescriptor$AutoCloseInputStream:close	()V
    //   188: aload 7
    //   190: athrow
    //   191: astore 7
    //   193: aload 5
    //   195: astore 4
    //   197: aconst_null
    //   198: astore 6
    //   200: goto -32 -> 168
    //   203: astore 7
    //   205: aload 5
    //   207: astore 4
    //   209: goto -41 -> 168
    //
    // Exception table:
    //   from	to	target	type
    //   17	27	163	finally
    //   27	38	191	finally
    //   38	45	203	finally
    //   48	57	203	finally
    //   63	75	203	finally
  }

  private void a(String paramString1, String paramString2, String paramString3)
  {
    a("Content-Disposition: form-data; name=\"%s\"", new Object[] { paramString1 });
    if (paramString2 != null)
      a("; filename=\"%s\"", new Object[] { paramString2 });
    b("", new Object[0]);
    if (paramString3 != null)
      b("%s: %s", new Object[] { "Content-Type", paramString3 });
    b("", new Object[0]);
  }

  private void a(String paramString, Object[] paramArrayOfObject)
  {
    if (this.c)
    {
      this.a.write("--".getBytes());
      this.a.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
      this.a.write("\r\n".getBytes());
      this.c = false;
    }
    this.a.write(String.format(paramString, paramArrayOfObject).getBytes());
  }

  private void b(String paramString, Object[] paramArrayOfObject)
  {
    a(paramString, paramArrayOfObject);
    a("\r\n", new Object[0]);
  }

  public final void a(String paramString, Object paramObject)
  {
    if (Request.b(paramObject))
    {
      a(paramString, Request.c(paramObject));
      return;
    }
    if ((paramObject instanceof Bitmap))
    {
      Bitmap localBitmap = (Bitmap)paramObject;
      a(paramString, paramString, "image/png");
      localBitmap.compress(Bitmap.CompressFormat.PNG, 100, this.a);
      b("", new Object[0]);
      a();
      this.b.a("    " + paramString, "<Image>");
      return;
    }
    if ((paramObject instanceof byte[]))
    {
      byte[] arrayOfByte = (byte[])paramObject;
      a(paramString, paramString, "content/unknown");
      this.a.write(arrayOfByte);
      b("", new Object[0]);
      a();
      u localu = this.b;
      String str = "    " + paramString;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(arrayOfByte.length);
      localu.a(str, String.format("<Data: %d>", arrayOfObject));
      return;
    }
    if ((paramObject instanceof ParcelFileDescriptor))
    {
      a(paramString, (ParcelFileDescriptor)paramObject, null);
      return;
    }
    if ((paramObject instanceof Request.ParcelFileDescriptorWithMimeType))
    {
      Request.ParcelFileDescriptorWithMimeType localParcelFileDescriptorWithMimeType = (Request.ParcelFileDescriptorWithMimeType)paramObject;
      a(paramString, localParcelFileDescriptorWithMimeType.b(), localParcelFileDescriptorWithMimeType.a());
      return;
    }
    throw new IllegalArgumentException("value is not a supported type: String, Bitmap, byte[]");
  }

  public final void a(String paramString1, String paramString2)
  {
    a(paramString1, null, null);
    b("%s", new Object[] { paramString2 });
    a();
    if (this.b != null)
      this.b.a("    " + paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     com.facebook.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
