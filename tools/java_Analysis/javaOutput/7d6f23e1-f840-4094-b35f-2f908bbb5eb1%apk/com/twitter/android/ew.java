package com.twitter.android;

import android.os.AsyncTask;

final class ew extends AsyncTask
{
  ew(SignUpActivity paramSignUpActivity)
  {
  }

  // ERROR //
  private static android.graphics.Bitmap a(java.lang.String[] paramArrayOfString)
  {
    // Byte code:
    //   0: new 20	java/net/URL
    //   3: dup
    //   4: aload_0
    //   5: iconst_0
    //   6: aaload
    //   7: invokespecial 23	java/net/URL:<init>	(Ljava/lang/String;)V
    //   10: invokevirtual 27	java/net/URL:openStream	()Ljava/io/InputStream;
    //   13: astore 6
    //   15: aload 6
    //   17: astore 4
    //   19: aload 4
    //   21: invokestatic 33	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   24: astore 10
    //   26: aload 4
    //   28: invokestatic 38	cr:a	(Ljava/io/Closeable;)V
    //   31: aload 10
    //   33: areturn
    //   34: astore 5
    //   36: aconst_null
    //   37: astore 4
    //   39: aload 4
    //   41: invokestatic 38	cr:a	(Ljava/io/Closeable;)V
    //   44: aconst_null
    //   45: areturn
    //   46: astore_3
    //   47: aconst_null
    //   48: astore 4
    //   50: aload 4
    //   52: invokestatic 38	cr:a	(Ljava/io/Closeable;)V
    //   55: aconst_null
    //   56: areturn
    //   57: astore_1
    //   58: aconst_null
    //   59: astore_2
    //   60: aload_2
    //   61: invokestatic 38	cr:a	(Ljava/io/Closeable;)V
    //   64: aload_1
    //   65: athrow
    //   66: astore 9
    //   68: aload 4
    //   70: astore_2
    //   71: aload 9
    //   73: astore_1
    //   74: goto -14 -> 60
    //   77: astore 8
    //   79: goto -29 -> 50
    //   82: astore 7
    //   84: goto -45 -> 39
    //
    // Exception table:
    //   from	to	target	type
    //   0	15	34	java/net/MalformedURLException
    //   0	15	46	java/io/IOException
    //   0	15	57	finally
    //   19	26	66	finally
    //   19	26	77	java/io/IOException
    //   19	26	82	java/net/MalformedURLException
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ew
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
