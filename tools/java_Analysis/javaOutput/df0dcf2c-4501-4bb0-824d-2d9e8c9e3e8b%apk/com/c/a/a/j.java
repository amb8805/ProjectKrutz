package com.c.a.a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

final class j
  implements HttpEntity
{
  private static final char[] d = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
  ByteArrayOutputStream a = new ByteArrayOutputStream();
  boolean b = false;
  boolean c = false;
  private String e = null;

  public j()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Random localRandom = new Random();
    while (i < 30)
    {
      localStringBuffer.append(d[localRandom.nextInt(d.length)]);
      i++;
    }
    this.e = localStringBuffer.toString();
  }

  private void a()
  {
    if (!this.c);
    try
    {
      this.a.write(("--" + this.e + "\r\n").getBytes());
      this.c = true;
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        localIOException.printStackTrace();
    }
  }

  public final void a(String paramString1, String paramString2)
  {
    a();
    try
    {
      this.a.write(("Content-Disposition: form-data; name=\"" + paramString1 + "\"\r\n\r\n").getBytes());
      this.a.write(paramString2.getBytes());
      this.a.write(("\r\n--" + this.e + "\r\n").getBytes());
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }

  // ERROR //
  public final void a(String paramString1, String paramString2, InputStream paramInputStream, String paramString3, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 88	com/c/a/a/j:a	()V
    //   4: new 63	java/lang/StringBuilder
    //   7: dup
    //   8: ldc 97
    //   10: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   13: aload 4
    //   15: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: ldc 73
    //   20: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   26: astore 10
    //   28: aload_0
    //   29: getfield 37	com/c/a/a/j:a	Ljava/io/ByteArrayOutputStream;
    //   32: new 63	java/lang/StringBuilder
    //   35: dup
    //   36: ldc 90
    //   38: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   41: aload_1
    //   42: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: ldc 99
    //   47: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: aload_2
    //   51: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: ldc 101
    //   56: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: invokevirtual 78	java/lang/String:getBytes	()[B
    //   65: invokevirtual 82	java/io/ByteArrayOutputStream:write	([B)V
    //   68: aload_0
    //   69: getfield 37	com/c/a/a/j:a	Ljava/io/ByteArrayOutputStream;
    //   72: aload 10
    //   74: invokevirtual 78	java/lang/String:getBytes	()[B
    //   77: invokevirtual 82	java/io/ByteArrayOutputStream:write	([B)V
    //   80: aload_0
    //   81: getfield 37	com/c/a/a/j:a	Ljava/io/ByteArrayOutputStream;
    //   84: ldc 103
    //   86: invokevirtual 78	java/lang/String:getBytes	()[B
    //   89: invokevirtual 82	java/io/ByteArrayOutputStream:write	([B)V
    //   92: sipush 4096
    //   95: newarray byte
    //   97: astore 11
    //   99: aload_3
    //   100: aload 11
    //   102: invokevirtual 109	java/io/InputStream:read	([B)I
    //   105: istore 12
    //   107: iload 12
    //   109: iconst_m1
    //   110: if_icmpeq +30 -> 140
    //   113: aload_0
    //   114: getfield 37	com/c/a/a/j:a	Ljava/io/ByteArrayOutputStream;
    //   117: aload 11
    //   119: iconst_0
    //   120: iload 12
    //   122: invokevirtual 112	java/io/ByteArrayOutputStream:write	([BII)V
    //   125: goto -26 -> 99
    //   128: astore 8
    //   130: aload 8
    //   132: invokevirtual 85	java/io/IOException:printStackTrace	()V
    //   135: aload_3
    //   136: invokevirtual 115	java/io/InputStream:close	()V
    //   139: return
    //   140: iload 5
    //   142: ifne +37 -> 179
    //   145: aload_0
    //   146: getfield 37	com/c/a/a/j:a	Ljava/io/ByteArrayOutputStream;
    //   149: new 63	java/lang/StringBuilder
    //   152: dup
    //   153: ldc 94
    //   155: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   158: aload_0
    //   159: getfield 32	com/c/a/a/j:e	Ljava/lang/String;
    //   162: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: ldc 73
    //   167: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   173: invokevirtual 78	java/lang/String:getBytes	()[B
    //   176: invokevirtual 82	java/io/ByteArrayOutputStream:write	([B)V
    //   179: aload_0
    //   180: getfield 37	com/c/a/a/j:a	Ljava/io/ByteArrayOutputStream;
    //   183: invokevirtual 118	java/io/ByteArrayOutputStream:flush	()V
    //   186: aload_3
    //   187: invokevirtual 115	java/io/InputStream:close	()V
    //   190: return
    //   191: astore 13
    //   193: aload 13
    //   195: invokevirtual 85	java/io/IOException:printStackTrace	()V
    //   198: return
    //   199: astore 9
    //   201: aload 9
    //   203: invokevirtual 85	java/io/IOException:printStackTrace	()V
    //   206: return
    //   207: astore 6
    //   209: aload_3
    //   210: invokevirtual 115	java/io/InputStream:close	()V
    //   213: aload 6
    //   215: athrow
    //   216: astore 7
    //   218: aload 7
    //   220: invokevirtual 85	java/io/IOException:printStackTrace	()V
    //   223: goto -10 -> 213
    //
    // Exception table:
    //   from	to	target	type
    //   4	99	128	java/io/IOException
    //   99	107	128	java/io/IOException
    //   113	125	128	java/io/IOException
    //   145	179	128	java/io/IOException
    //   179	186	128	java/io/IOException
    //   186	190	191	java/io/IOException
    //   135	139	199	java/io/IOException
    //   4	99	207	finally
    //   99	107	207	finally
    //   113	125	207	finally
    //   130	135	207	finally
    //   145	179	207	finally
    //   179	186	207	finally
    //   209	213	216	java/io/IOException
  }

  public final void consumeContent()
  {
    if (isStreaming())
      throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
  }

  public final InputStream getContent()
  {
    return new ByteArrayInputStream(this.a.toByteArray());
  }

  public final Header getContentEncoding()
  {
    return null;
  }

  public final long getContentLength()
  {
    if (!this.b)
      try
      {
        this.a.write(("\r\n--" + this.e + "--\r\n").getBytes());
        this.b = true;
        return this.a.toByteArray().length;
      }
      catch (IOException localIOException)
      {
        while (true)
          localIOException.printStackTrace();
      }
  }

  public final Header getContentType()
  {
    return new BasicHeader("Content-Type", "multipart/form-data; boundary=" + this.e);
  }

  public final boolean isChunked()
  {
    return false;
  }

  public final boolean isRepeatable()
  {
    return false;
  }

  public final boolean isStreaming()
  {
    return false;
  }

  public final void writeTo(OutputStream paramOutputStream)
  {
    paramOutputStream.write(this.a.toByteArray());
  }
}

/* Location:
 * Qualified Name:     com.c.a.a.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
