package com.b.a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

final class f
  implements Closeable
{
  private final InputStream a;
  private final Charset b;
  private byte[] c;
  private int d;
  private int e;

  public f(InputStream paramInputStream, Charset paramCharset)
  {
    this(paramInputStream, paramCharset, (byte)0);
  }

  private f(InputStream paramInputStream, Charset paramCharset, byte paramByte)
  {
    if ((paramInputStream == null) || (paramCharset == null))
      throw new NullPointerException();
    if (!paramCharset.equals(g.a))
      throw new IllegalArgumentException("Unsupported encoding");
    this.a = paramInputStream;
    this.b = paramCharset;
    this.c = new byte[8192];
  }

  private void b()
  {
    int i = this.a.read(this.c, 0, this.c.length);
    if (i == -1)
      throw new EOFException();
    this.d = 0;
    this.e = i;
  }

  public final String a()
  {
    synchronized (this.a)
    {
      if (this.c == null)
        throw new IOException("LineReader is closed");
    }
    if (this.d >= this.e)
      b();
    for (int i = this.d; ; i++)
    {
      if (i != this.e)
      {
        if (this.c[i] != 10)
          continue;
        if ((i == this.d) || (this.c[(i - 1)] != 13))
          break label272;
      }
      label272: for (int k = i - 1; ; k = i)
      {
        String str2 = new String(this.c, this.d, k - this.d, this.b.name());
        this.d = (i + 1);
        return str2;
        f.1 local1 = new f.1(this, 80 + (this.e - this.d));
        while (true)
        {
          local1.write(this.c, this.d, this.e - this.d);
          this.e = -1;
          b();
          for (int j = this.d; j != this.e; j++)
            if (this.c[j] == 10)
            {
              if (j != this.d)
                local1.write(this.c, this.d, j - this.d);
              this.d = (j + 1);
              String str1 = local1.toString();
              return str1;
            }
        }
      }
    }
  }

  public final void close()
  {
    synchronized (this.a)
    {
      if (this.c != null)
      {
        this.c = null;
        this.a.close();
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.b.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
