package com.b.a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
  implements Closeable
{
  static final Pattern a = Pattern.compile("[a-z0-9_-]{1,64}");
  private static final OutputStream p = new a.2();
  final ThreadPoolExecutor b = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
  private final File c;
  private final File d;
  private final File e;
  private final File f;
  private final int g;
  private long h;
  private final int i;
  private long j = 0L;
  private Writer k;
  private final LinkedHashMap<String, d> l = new LinkedHashMap(0, 0.75F, true);
  private int m;
  private long n = 0L;
  private final Callable<Void> o = new a.1(this);

  private a(File paramFile)
  {
    this.c = paramFile;
    this.g = 1;
    this.d = new File(paramFile, "journal");
    this.e = new File(paramFile, "journal.tmp");
    this.f = new File(paramFile, "journal.bkp");
    this.i = 1;
    this.h = 10485760L;
  }

  public static a a(File paramFile)
  {
    if (10485760L <= 0L)
      throw new IllegalArgumentException("maxSize <= 0");
    File localFile1 = new File(paramFile, "journal.bkp");
    File localFile2;
    a locala1;
    if (localFile1.exists())
    {
      localFile2 = new File(paramFile, "journal");
      if (localFile2.exists())
        localFile1.delete();
    }
    else
    {
      while (true)
      {
        locala1 = new a(paramFile);
        if (locala1.d.exists())
          try
          {
            locala1.c();
            locala1.d();
            locala1.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(locala1.d, true), g.a));
            return locala1;
            a(localFile1, localFile2, false);
          }
          catch (IOException localIOException)
          {
            System.out.println("DiskLruCache " + paramFile + " is corrupt: " + localIOException.getMessage() + ", removing");
            locala1.close();
            g.a(locala1.c);
          }
      }
    }
    paramFile.mkdirs();
    a locala2 = new a(paramFile);
    locala2.e();
    return locala2;
  }

  private void a(b paramb, boolean paramBoolean)
  {
    d locald;
    try
    {
      locald = b.a(paramb);
      if (d.b(locald) != paramb)
        throw new IllegalStateException();
    }
    finally
    {
    }
    int i1 = 0;
    if (paramBoolean)
    {
      boolean bool = d.e(locald);
      i1 = 0;
      if (!bool)
        for (int i2 = 0; ; i2++)
        {
          int i3 = this.i;
          i1 = 0;
          if (i2 >= i3)
            break;
          if (b.b(paramb)[i2] == 0)
          {
            paramb.c();
            throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
          }
          if (!locald.b(i2).exists())
          {
            paramb.c();
            return;
          }
        }
    }
    while (true)
    {
      if (i1 < this.i)
      {
        File localFile1 = locald.b(i1);
        if (paramBoolean)
        {
          if (localFile1.exists())
          {
            File localFile2 = locald.a(i1);
            localFile1.renameTo(localFile2);
            long l2 = d.c(locald)[i1];
            long l3 = localFile2.length();
            d.c(locald)[i1] = l3;
            this.j = (l3 + (this.j - l2));
          }
        }
        else
          b(localFile1);
      }
      else
      {
        this.m = (1 + this.m);
        d.a(locald, null);
        if ((paramBoolean | d.e(locald)))
        {
          d.a(locald);
          this.k.write("CLEAN " + d.d(locald) + locald.a() + '\n');
          if (paramBoolean)
          {
            long l1 = this.n;
            this.n = (1L + l1);
            d.a(locald, l1);
          }
        }
        while (true)
        {
          this.k.flush();
          if ((this.j <= this.h) && (!f()))
            break;
          this.b.submit(this.o);
          break;
          this.l.remove(d.d(locald));
          this.k.write("REMOVE " + d.d(locald) + '\n');
        }
      }
      i1++;
    }
  }

  private static void a(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    if (paramBoolean)
      b(paramFile2);
    if (!paramFile1.renameTo(paramFile2))
      throw new IOException();
  }

  private static void b(File paramFile)
  {
    if ((paramFile.exists()) && (!paramFile.delete()))
      throw new IOException();
  }

  // ERROR //
  private void c()
  {
    // Byte code:
    //   0: new 307	com/b/a/f
    //   3: dup
    //   4: new 309	java/io/FileInputStream
    //   7: dup
    //   8: aload_0
    //   9: getfield 104	com/b/a/a:d	Ljava/io/File;
    //   12: invokespecial 310	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   15: getstatic 155	com/b/a/g:a	Ljava/nio/charset/Charset;
    //   18: invokespecial 313	com/b/a/f:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   21: astore_1
    //   22: aload_1
    //   23: invokevirtual 314	com/b/a/f:a	()Ljava/lang/String;
    //   26: astore_3
    //   27: aload_1
    //   28: invokevirtual 314	com/b/a/f:a	()Ljava/lang/String;
    //   31: astore 4
    //   33: aload_1
    //   34: invokevirtual 314	com/b/a/f:a	()Ljava/lang/String;
    //   37: astore 5
    //   39: aload_1
    //   40: invokevirtual 314	com/b/a/f:a	()Ljava/lang/String;
    //   43: astore 6
    //   45: aload_1
    //   46: invokevirtual 314	com/b/a/f:a	()Ljava/lang/String;
    //   49: astore 7
    //   51: ldc_w 316
    //   54: aload_3
    //   55: invokevirtual 322	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   58: ifeq +55 -> 113
    //   61: ldc_w 324
    //   64: aload 4
    //   66: invokevirtual 322	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   69: ifeq +44 -> 113
    //   72: aload_0
    //   73: getfield 95	com/b/a/a:g	I
    //   76: invokestatic 329	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   79: aload 5
    //   81: invokevirtual 322	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   84: ifeq +29 -> 113
    //   87: aload_0
    //   88: getfield 114	com/b/a/a:i	I
    //   91: invokestatic 329	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   94: aload 6
    //   96: invokevirtual 322	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   99: ifeq +14 -> 113
    //   102: ldc_w 331
    //   105: aload 7
    //   107: invokevirtual 322	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   110: ifne +74 -> 184
    //   113: new 121	java/io/IOException
    //   116: dup
    //   117: new 174	java/lang/StringBuilder
    //   120: dup
    //   121: ldc_w 333
    //   124: invokespecial 177	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   127: aload_3
    //   128: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: ldc_w 335
    //   134: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: aload 4
    //   139: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: ldc_w 335
    //   145: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: aload 6
    //   150: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: ldc_w 335
    //   156: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: aload 7
    //   161: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: ldc_w 337
    //   167: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: invokevirtual 195	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   173: invokespecial 338	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   176: athrow
    //   177: astore_2
    //   178: aload_1
    //   179: invokestatic 341	com/b/a/g:a	(Ljava/io/Closeable;)V
    //   182: aload_2
    //   183: athrow
    //   184: iconst_0
    //   185: istore 8
    //   187: aload_1
    //   188: invokevirtual 314	com/b/a/f:a	()Ljava/lang/String;
    //   191: astore 10
    //   193: aload 10
    //   195: bipush 32
    //   197: invokevirtual 345	java/lang/String:indexOf	(I)I
    //   200: istore 11
    //   202: iload 11
    //   204: iconst_m1
    //   205: if_icmpne +50 -> 255
    //   208: new 121	java/io/IOException
    //   211: dup
    //   212: new 174	java/lang/StringBuilder
    //   215: dup
    //   216: ldc_w 347
    //   219: invokespecial 177	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   222: aload 10
    //   224: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: invokevirtual 195	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   230: invokespecial 338	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   233: athrow
    //   234: astore 9
    //   236: aload_0
    //   237: iload 8
    //   239: aload_0
    //   240: getfield 64	com/b/a/a:l	Ljava/util/LinkedHashMap;
    //   243: invokevirtual 351	java/util/LinkedHashMap:size	()I
    //   246: isub
    //   247: putfield 261	com/b/a/a:m	I
    //   250: aload_1
    //   251: invokestatic 341	com/b/a/g:a	(Ljava/io/Closeable;)V
    //   254: return
    //   255: iload 11
    //   257: iconst_1
    //   258: iadd
    //   259: istore 12
    //   261: aload 10
    //   263: bipush 32
    //   265: iload 12
    //   267: invokevirtual 354	java/lang/String:indexOf	(II)I
    //   270: istore 13
    //   272: iload 13
    //   274: iconst_m1
    //   275: if_icmpne +43 -> 318
    //   278: aload 10
    //   280: iload 12
    //   282: invokevirtual 357	java/lang/String:substring	(I)Ljava/lang/String;
    //   285: astore 14
    //   287: iload 11
    //   289: bipush 6
    //   291: if_icmpne +237 -> 528
    //   294: aload 10
    //   296: ldc_w 359
    //   299: invokevirtual 363	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   302: ifeq +226 -> 528
    //   305: aload_0
    //   306: getfield 64	com/b/a/a:l	Ljava/util/LinkedHashMap;
    //   309: aload 14
    //   311: invokevirtual 297	java/util/LinkedHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   314: pop
    //   315: goto +220 -> 535
    //   318: aload 10
    //   320: iload 12
    //   322: iload 13
    //   324: invokevirtual 366	java/lang/String:substring	(II)Ljava/lang/String;
    //   327: astore 15
    //   329: aload_0
    //   330: getfield 64	com/b/a/a:l	Ljava/util/LinkedHashMap;
    //   333: aload 15
    //   335: invokevirtual 369	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   338: checkcast 222	com/b/a/d
    //   341: astore 16
    //   343: aload 16
    //   345: ifnonnull +28 -> 373
    //   348: new 222	com/b/a/d
    //   351: dup
    //   352: aload_0
    //   353: aload 15
    //   355: iconst_0
    //   356: invokespecial 372	com/b/a/d:<init>	(Lcom/b/a/a;Ljava/lang/String;B)V
    //   359: astore 16
    //   361: aload_0
    //   362: getfield 64	com/b/a/a:l	Ljava/util/LinkedHashMap;
    //   365: aload 15
    //   367: aload 16
    //   369: invokevirtual 376	java/util/LinkedHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   372: pop
    //   373: iload 13
    //   375: iconst_m1
    //   376: if_icmpeq +60 -> 436
    //   379: iload 11
    //   381: iconst_5
    //   382: if_icmpne +54 -> 436
    //   385: aload 10
    //   387: ldc_w 378
    //   390: invokevirtual 363	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   393: ifeq +43 -> 436
    //   396: aload 10
    //   398: iload 13
    //   400: iconst_1
    //   401: iadd
    //   402: invokevirtual 357	java/lang/String:substring	(I)Ljava/lang/String;
    //   405: ldc_w 380
    //   408: invokevirtual 384	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   411: astore 19
    //   413: aload 16
    //   415: invokestatic 266	com/b/a/d:a	(Lcom/b/a/d;)Z
    //   418: pop
    //   419: aload 16
    //   421: aconst_null
    //   422: invokestatic 264	com/b/a/d:a	(Lcom/b/a/d;Lcom/b/a/b;)Lcom/b/a/b;
    //   425: pop
    //   426: aload 16
    //   428: aload 19
    //   430: invokestatic 387	com/b/a/d:a	(Lcom/b/a/d;[Ljava/lang/String;)V
    //   433: goto +102 -> 535
    //   436: iload 13
    //   438: iconst_m1
    //   439: if_icmpne +40 -> 479
    //   442: iload 11
    //   444: iconst_5
    //   445: if_icmpne +34 -> 479
    //   448: aload 10
    //   450: ldc_w 389
    //   453: invokevirtual 363	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   456: ifeq +23 -> 479
    //   459: aload 16
    //   461: new 217	com/b/a/b
    //   464: dup
    //   465: aload_0
    //   466: aload 16
    //   468: iconst_0
    //   469: invokespecial 392	com/b/a/b:<init>	(Lcom/b/a/a;Lcom/b/a/d;B)V
    //   472: invokestatic 264	com/b/a/d:a	(Lcom/b/a/d;Lcom/b/a/b;)Lcom/b/a/b;
    //   475: pop
    //   476: goto +59 -> 535
    //   479: iload 13
    //   481: iconst_m1
    //   482: if_icmpne +20 -> 502
    //   485: iload 11
    //   487: iconst_4
    //   488: if_icmpne +14 -> 502
    //   491: aload 10
    //   493: ldc_w 394
    //   496: invokevirtual 363	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   499: ifne +36 -> 535
    //   502: new 121	java/io/IOException
    //   505: dup
    //   506: new 174	java/lang/StringBuilder
    //   509: dup
    //   510: ldc_w 347
    //   513: invokespecial 177	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   516: aload 10
    //   518: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   521: invokevirtual 195	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   524: invokespecial 338	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   527: athrow
    //   528: aload 14
    //   530: astore 15
    //   532: goto -203 -> 329
    //   535: iinc 8 1
    //   538: goto -351 -> 187
    //
    // Exception table:
    //   from	to	target	type
    //   22	113	177	finally
    //   113	177	177	finally
    //   187	202	177	finally
    //   208	234	177	finally
    //   236	250	177	finally
    //   261	272	177	finally
    //   278	287	177	finally
    //   294	315	177	finally
    //   318	329	177	finally
    //   329	343	177	finally
    //   348	373	177	finally
    //   385	433	177	finally
    //   448	476	177	finally
    //   491	502	177	finally
    //   502	528	177	finally
    //   187	202	234	java/io/EOFException
    //   208	234	234	java/io/EOFException
    //   261	272	234	java/io/EOFException
    //   278	287	234	java/io/EOFException
    //   294	315	234	java/io/EOFException
    //   318	329	234	java/io/EOFException
    //   329	343	234	java/io/EOFException
    //   348	373	234	java/io/EOFException
    //   385	433	234	java/io/EOFException
    //   448	476	234	java/io/EOFException
    //   491	502	234	java/io/EOFException
    //   502	528	234	java/io/EOFException
  }

  private b d(String paramString)
  {
    d locald1;
    try
    {
      g();
      e(paramString);
      locald1 = (d)this.l.get(paramString);
      if (-1L != -1L)
        if (locald1 != null)
        {
          l1 = d.f(locald1);
          if (l1 == -1L);
        }
        else
        {
          localb2 = null;
        }
      while (true)
      {
        return localb2;
        if (locald1 != null)
          break;
        locald3 = new d(this, paramString, (byte)0);
        this.l.put(paramString, locald3);
        locald2 = locald3;
        localb2 = new b(this, locald2, (byte)0);
        d.a(locald2, localb2);
        this.k.write("DIRTY " + paramString + '\n');
        this.k.flush();
      }
    }
    finally
    {
    }
    while (true)
    {
      long l1;
      b localb2;
      d locald3;
      d locald2;
      b localb1 = d.b(locald1);
      if (localb1 != null)
        localb2 = null;
      else
        locald2 = locald1;
    }
  }

  private void d()
  {
    b(this.e);
    Iterator localIterator = this.l.values().iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (d.b(locald) == null)
      {
        for (int i2 = 0; i2 < this.i; i2++)
          this.j += d.c(locald)[i2];
      }
      else
      {
        d.a(locald, null);
        for (int i1 = 0; i1 < this.i; i1++)
        {
          b(locald.a(i1));
          b(locald.b(i1));
        }
        localIterator.remove();
      }
    }
  }

  private void e()
  {
    try
    {
      if (this.k != null)
        this.k.close();
      localBufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.e), g.a));
      try
      {
        localBufferedWriter.write("libcore.io.DiskLruCache");
        localBufferedWriter.write("\n");
        localBufferedWriter.write("1");
        localBufferedWriter.write("\n");
        localBufferedWriter.write(Integer.toString(this.g));
        localBufferedWriter.write("\n");
        localBufferedWriter.write(Integer.toString(this.i));
        localBufferedWriter.write("\n");
        localBufferedWriter.write("\n");
        localIterator = this.l.values().iterator();
        while (true)
        {
          if (!localIterator.hasNext())
            break label246;
          locald = (d)localIterator.next();
          if (d.b(locald) == null)
            break;
          localBufferedWriter.write("DIRTY " + d.d(locald) + '\n');
        }
      }
      finally
      {
        localBufferedWriter.close();
      }
    }
    finally
    {
    }
    BufferedWriter localBufferedWriter;
    while (true)
    {
      Iterator localIterator;
      d locald;
      localBufferedWriter.write("CLEAN " + d.d(locald) + locald.a() + '\n');
    }
    label246: localBufferedWriter.close();
    if (this.d.exists())
      a(this.d, this.f, true);
    a(this.e, this.d, false);
    this.f.delete();
    this.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d, true), g.a));
  }

  private static void e(String paramString)
  {
    if (!a.matcher(paramString).matches())
      throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + paramString + "\"");
  }

  private boolean f()
  {
    return (this.m >= 2000) && (this.m >= this.l.size());
  }

  private void g()
  {
    if (this.k == null)
      throw new IllegalStateException("cache is closed");
  }

  private void h()
  {
    while (this.j > this.h)
      c((String)((Map.Entry)this.l.entrySet().iterator().next()).getKey());
  }

  public final e a(String paramString)
  {
    try
    {
      g();
      e(paramString);
      d locald = (d)this.l.get(paramString);
      if (locald == null)
        locale = null;
      while (true)
      {
        return locale;
        if (!d.e(locald))
        {
          locale = null;
        }
        else
        {
          arrayOfInputStream = new InputStream[this.i];
          i1 = 0;
          try
          {
            while (i1 < this.i)
            {
              arrayOfInputStream[i1] = new FileInputStream(locald.a(i1));
              i1++;
            }
          }
          catch (FileNotFoundException localFileNotFoundException)
          {
            i2 = 0;
            if (i2 >= this.i)
              break;
          }
          while (arrayOfInputStream[i2] != null)
          {
            g.a(arrayOfInputStream[i2]);
            i2++;
          }
          this.m = (1 + this.m);
          this.k.append("READ " + paramString + '\n');
          if (f())
            this.b.submit(this.o);
          locale = new e(this, paramString, d.f(locald), arrayOfInputStream, d.c(locald), (byte)0);
        }
      }
    }
    finally
    {
    }
    while (true)
    {
      InputStream[] arrayOfInputStream;
      int i1;
      int i2;
      e locale = null;
    }
  }

  public final void a()
  {
    try
    {
      g();
      h();
      this.k.flush();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final b b(String paramString)
  {
    return d(paramString);
  }

  public final boolean c(String paramString)
  {
    try
    {
      g();
      e(paramString);
      d locald = (d)this.l.get(paramString);
      if (locald != null)
      {
        localb = d.b(locald);
        i1 = 0;
        if (localb == null);
      }
      else
      {
        bool = false;
        return bool;
      }
      do
      {
        this.j -= d.c(locald)[i1];
        d.c(locald)[i1] = 0L;
        i1++;
        if (i1 >= this.i)
          break;
        localFile = locald.a(i1);
      }
      while ((!localFile.exists()) || (localFile.delete()));
      throw new IOException("failed to delete " + localFile);
    }
    finally
    {
    }
    while (true)
    {
      b localb;
      int i1;
      File localFile;
      this.m = (1 + this.m);
      this.k.append("REMOVE " + paramString + '\n');
      this.l.remove(paramString);
      if (f())
        this.b.submit(this.o);
      boolean bool = true;
    }
  }

  public final void close()
  {
    try
    {
      Writer localWriter = this.k;
      if (localWriter == null)
        return;
      localIterator = new ArrayList(this.l.values()).iterator();
      while (localIterator.hasNext())
      {
        locald = (d)localIterator.next();
        if (d.b(locald) != null)
          d.b(locald).c();
      }
    }
    finally
    {
    }
    while (true)
    {
      Iterator localIterator;
      d locald;
      h();
      this.k.close();
      this.k = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.b.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
