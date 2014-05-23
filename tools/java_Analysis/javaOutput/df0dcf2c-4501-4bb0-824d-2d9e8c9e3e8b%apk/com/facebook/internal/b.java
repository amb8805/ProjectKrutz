package com.facebook.internal;

import android.content.Context;
import com.facebook.aa;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public final class b
{
  static final String a = b.class.getSimpleName();
  private static final AtomicLong b = new AtomicLong();
  private final String c;
  private final f d;
  private final File e;
  private boolean f;
  private final Object g;
  private AtomicLong h = new AtomicLong(0L);

  public b(Context paramContext, String paramString, f paramf)
  {
    this.c = paramString;
    this.d = paramf;
    this.e = new File(paramContext.getCacheDir(), paramString);
    this.g = new Object();
    if ((this.e.mkdirs()) || (this.e.isDirectory()))
      c.a(this.e);
  }

  public final InputStream a(String paramString, InputStream paramInputStream)
  {
    return new e(paramInputStream, b(paramString, null));
  }

  public final InputStream a(String paramString1, String paramString2)
  {
    File localFile = new File(this.e, ad.b(paramString1));
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(localFile);
      localBufferedInputStream = new BufferedInputStream(localFileInputStream, 8192);
      try
      {
        JSONObject localJSONObject = i.a(localBufferedInputStream);
        if (localJSONObject == null)
          return null;
        String str1 = localJSONObject.optString("key");
        if (str1 != null)
        {
          boolean bool1 = str1.equals(paramString1);
          if (bool1);
        }
        else
        {
          return null;
        }
        String str2 = localJSONObject.optString("tag", null);
        if ((paramString2 != null) || (str2 == null))
        {
          if (paramString2 != null)
          {
            boolean bool2 = paramString2.equals(str2);
            if (bool2);
          }
        }
        else
          return null;
        long l = new Date().getTime();
        new StringBuilder("Setting lastModified to ").append(Long.valueOf(l)).append(" for ").append(localFile.getName());
        u.a();
        localFile.setLastModified(l);
        return localBufferedInputStream;
      }
      finally
      {
        localBufferedInputStream.close();
      }
    }
    catch (IOException localIOException)
    {
    }
    BufferedInputStream localBufferedInputStream;
    return null;
  }

  public final void a()
  {
    File[] arrayOfFile = this.e.listFiles(c.a());
    this.h.set(System.currentTimeMillis());
    if (arrayOfFile != null)
      aa.b().execute(new b.2(this, arrayOfFile));
  }

  // ERROR //
  public final java.io.OutputStream b(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 59	com/facebook/internal/b:e	Ljava/io/File;
    //   4: invokestatic 261	com/facebook/internal/c:b	(Ljava/io/File;)Ljava/io/File;
    //   7: astore_3
    //   8: aload_3
    //   9: invokevirtual 87	java/io/File:delete	()Z
    //   12: pop
    //   13: aload_3
    //   14: invokevirtual 264	java/io/File:createNewFile	()Z
    //   17: ifne +31 -> 48
    //   20: new 194	java/io/IOException
    //   23: dup
    //   24: new 135	java/lang/StringBuilder
    //   27: dup
    //   28: ldc_w 266
    //   31: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   34: aload_3
    //   35: invokevirtual 269	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   38: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: invokevirtual 272	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: invokespecial 273	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   47: athrow
    //   48: new 275	java/io/FileOutputStream
    //   51: dup
    //   52: aload_3
    //   53: invokespecial 276	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   56: astore 5
    //   58: new 278	java/io/BufferedOutputStream
    //   61: dup
    //   62: new 280	com/facebook/internal/d
    //   65: dup
    //   66: aload 5
    //   68: new 282	com/facebook/internal/b$1
    //   71: dup
    //   72: aload_0
    //   73: invokestatic 246	java/lang/System:currentTimeMillis	()J
    //   76: aload_3
    //   77: aload_1
    //   78: invokespecial 285	com/facebook/internal/b$1:<init>	(Lcom/facebook/internal/b;JLjava/io/File;Ljava/lang/String;)V
    //   81: invokespecial 288	com/facebook/internal/d:<init>	(Ljava/io/OutputStream;Lcom/facebook/internal/h;)V
    //   84: sipush 8192
    //   87: invokespecial 291	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   90: astore 6
    //   92: new 214	org/json/JSONObject
    //   95: dup
    //   96: invokespecial 292	org/json/JSONObject:<init>	()V
    //   99: astore 7
    //   101: aload 7
    //   103: ldc 212
    //   105: aload_1
    //   106: invokevirtual 296	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   109: pop
    //   110: aload_2
    //   111: invokestatic 299	com/facebook/internal/ad:a	(Ljava/lang/String;)Z
    //   114: ifne +12 -> 126
    //   117: aload 7
    //   119: ldc 224
    //   121: aload_2
    //   122: invokevirtual 296	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   125: pop
    //   126: aload 7
    //   128: invokevirtual 300	org/json/JSONObject:toString	()Ljava/lang/String;
    //   131: invokevirtual 304	java/lang/String:getBytes	()[B
    //   134: astore 14
    //   136: aload 6
    //   138: iconst_0
    //   139: invokevirtual 310	java/io/OutputStream:write	(I)V
    //   142: aload 6
    //   144: sipush 255
    //   147: aload 14
    //   149: arraylength
    //   150: bipush 16
    //   152: ishr
    //   153: iand
    //   154: invokevirtual 310	java/io/OutputStream:write	(I)V
    //   157: aload 6
    //   159: sipush 255
    //   162: aload 14
    //   164: arraylength
    //   165: bipush 8
    //   167: ishr
    //   168: iand
    //   169: invokevirtual 310	java/io/OutputStream:write	(I)V
    //   172: aload 6
    //   174: sipush 255
    //   177: aload 14
    //   179: arraylength
    //   180: iconst_0
    //   181: ishr
    //   182: iand
    //   183: invokevirtual 310	java/io/OutputStream:write	(I)V
    //   186: aload 6
    //   188: aload 14
    //   190: invokevirtual 313	java/io/OutputStream:write	([B)V
    //   193: aload 6
    //   195: areturn
    //   196: astore 16
    //   198: getstatic 111	com/facebook/LoggingBehavior:d	Lcom/facebook/LoggingBehavior;
    //   201: pop
    //   202: getstatic 28	com/facebook/internal/b:a	Ljava/lang/String;
    //   205: pop
    //   206: new 135	java/lang/StringBuilder
    //   209: dup
    //   210: ldc_w 315
    //   213: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   216: aload 16
    //   218: invokevirtual 153	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   221: pop
    //   222: invokestatic 317	com/facebook/internal/u:c	()V
    //   225: new 194	java/io/IOException
    //   228: dup
    //   229: aload 16
    //   231: invokevirtual 320	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   234: invokespecial 273	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   237: athrow
    //   238: astore 9
    //   240: getstatic 111	com/facebook/LoggingBehavior:d	Lcom/facebook/LoggingBehavior;
    //   243: pop
    //   244: getstatic 28	com/facebook/internal/b:a	Ljava/lang/String;
    //   247: pop
    //   248: new 135	java/lang/StringBuilder
    //   251: dup
    //   252: ldc_w 322
    //   255: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   258: aload 9
    //   260: invokevirtual 153	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   263: pop
    //   264: invokestatic 317	com/facebook/internal/u:c	()V
    //   267: new 194	java/io/IOException
    //   270: dup
    //   271: aload 9
    //   273: invokevirtual 323	org/json/JSONException:getMessage	()Ljava/lang/String;
    //   276: invokespecial 273	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   279: athrow
    //   280: astore 8
    //   282: aload 6
    //   284: invokevirtual 324	java/io/BufferedOutputStream:close	()V
    //   287: aload 8
    //   289: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   48	58	196	java/io/FileNotFoundException
    //   92	126	238	org/json/JSONException
    //   126	193	238	org/json/JSONException
    //   92	126	280	finally
    //   126	193	280	finally
    //   240	280	280	finally
  }

  public final String toString()
  {
    return "{FileLruCache: tag:" + this.c + " file:" + this.e.getName() + "}";
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
