package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.ParcelFileDescriptor;

final class c
  implements Runnable
{
  private final Uri b;
  private final ParcelFileDescriptor c;

  public c(ImageManager paramImageManager, Uri paramUri, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.b = paramUri;
    this.c = paramParcelFileDescriptor;
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 36	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   3: invokevirtual 40	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   6: invokestatic 45	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   9: if_acmpne +56 -> 65
    //   12: ldc 47
    //   14: new 49	java/lang/StringBuilder
    //   17: dup
    //   18: ldc 51
    //   20: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   23: invokestatic 45	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   26: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   29: ldc 60
    //   31: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: invokestatic 36	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   37: invokevirtual 40	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   40: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   43: ldc 65
    //   45: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: invokestatic 75	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   54: pop
    //   55: new 77	java/lang/IllegalStateException
    //   58: dup
    //   59: ldc 79
    //   61: invokespecial 80	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   64: athrow
    //   65: aload_0
    //   66: getfield 23	com/google/android/gms/common/images/c:c	Landroid/os/ParcelFileDescriptor;
    //   69: astore_1
    //   70: aconst_null
    //   71: astore_2
    //   72: iconst_0
    //   73: istore_3
    //   74: aload_1
    //   75: ifnull +25 -> 100
    //   78: aload_0
    //   79: getfield 23	com/google/android/gms/common/images/c:c	Landroid/os/ParcelFileDescriptor;
    //   82: invokevirtual 86	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   85: invokestatic 92	android/graphics/BitmapFactory:decodeFileDescriptor	(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;
    //   88: astore 12
    //   90: aload 12
    //   92: astore_2
    //   93: aload_0
    //   94: getfield 23	com/google/android/gms/common/images/c:c	Landroid/os/ParcelFileDescriptor;
    //   97: invokevirtual 95	android/os/ParcelFileDescriptor:close	()V
    //   100: new 97	java/util/concurrent/CountDownLatch
    //   103: dup
    //   104: iconst_1
    //   105: invokespecial 100	java/util/concurrent/CountDownLatch:<init>	(I)V
    //   108: astore 4
    //   110: aload_0
    //   111: getfield 16	com/google/android/gms/common/images/c:a	Lcom/google/android/gms/common/images/ImageManager;
    //   114: invokestatic 105	com/google/android/gms/common/images/ImageManager:e	(Lcom/google/android/gms/common/images/ImageManager;)Landroid/os/Handler;
    //   117: new 107	com/google/android/gms/common/images/d
    //   120: dup
    //   121: aload_0
    //   122: getfield 16	com/google/android/gms/common/images/c:a	Lcom/google/android/gms/common/images/ImageManager;
    //   125: aload_0
    //   126: getfield 21	com/google/android/gms/common/images/c:b	Landroid/net/Uri;
    //   129: aload_2
    //   130: iload_3
    //   131: aload 4
    //   133: invokespecial 110	com/google/android/gms/common/images/d:<init>	(Lcom/google/android/gms/common/images/ImageManager;Landroid/net/Uri;Landroid/graphics/Bitmap;ZLjava/util/concurrent/CountDownLatch;)V
    //   136: invokevirtual 116	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   139: pop
    //   140: aload 4
    //   142: invokevirtual 119	java/util/concurrent/CountDownLatch:await	()V
    //   145: return
    //   146: astore 8
    //   148: ldc 121
    //   150: new 49	java/lang/StringBuilder
    //   153: dup
    //   154: ldc 123
    //   156: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   159: aload_0
    //   160: getfield 21	com/google/android/gms/common/images/c:b	Landroid/net/Uri;
    //   163: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   166: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: aload 8
    //   171: invokestatic 126	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   174: pop
    //   175: iconst_1
    //   176: istore_3
    //   177: aconst_null
    //   178: astore_2
    //   179: goto -86 -> 93
    //   182: astore 10
    //   184: ldc 121
    //   186: ldc 128
    //   188: aload 10
    //   190: invokestatic 126	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   193: pop
    //   194: goto -94 -> 100
    //   197: astore 6
    //   199: ldc 121
    //   201: new 49	java/lang/StringBuilder
    //   204: dup
    //   205: ldc 130
    //   207: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   210: aload_0
    //   211: getfield 21	com/google/android/gms/common/images/c:b	Landroid/net/Uri;
    //   214: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   217: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   220: invokestatic 133	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   223: pop
    //   224: return
    //
    // Exception table:
    //   from	to	target	type
    //   78	90	146	java/lang/OutOfMemoryError
    //   93	100	182	java/io/IOException
    //   140	145	197	java/lang/InterruptedException
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.images.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
