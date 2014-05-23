package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

final class t extends InputStream
{
  private final InputStream a;
  private long b;
  private long c;
  private long d;
  private long e = -1L;

  public t(InputStream paramInputStream)
  {
    this(paramInputStream, (byte)0);
  }

  private t(InputStream paramInputStream, byte paramByte)
  {
    if (!paramInputStream.markSupported())
      paramInputStream = new BufferedInputStream(paramInputStream, 4096);
    this.a = paramInputStream;
  }

  private void a(long paramLong1, long paramLong2)
  {
    while (paramLong1 < paramLong2)
    {
      long l = this.a.skip(paramLong2 - paramLong1);
      if (l == 0L)
      {
        if (read() == -1)
          break;
        l = 1L;
      }
      paramLong1 += l;
    }
  }

  public final long a(int paramInt)
  {
    l = this.b + paramInt;
    if (this.d < l)
      try
      {
        if ((this.c < this.b) && (this.b <= this.d))
        {
          this.a.reset();
          this.a.mark((int)(l - this.c));
          a(this.c, this.b);
        }
        while (true)
        {
          this.d = l;
          return this.b;
          this.c = this.b;
          this.a.mark((int)(l - this.b));
        }
      }
      catch (IOException localIOException)
      {
        throw new IllegalStateException("Unable to mark: " + localIOException);
      }
  }

  public final void a(long paramLong)
  {
    if ((this.b > this.d) || (paramLong < this.c))
      throw new IOException("Cannot reset");
    this.a.reset();
    a(this.c, paramLong);
    this.b = paramLong;
  }

  public final int available()
  {
    return this.a.available();
  }

  public final void close()
  {
    this.a.close();
  }

  public final void mark(int paramInt)
  {
    this.e = a(paramInt);
  }

  public final boolean markSupported()
  {
    return this.a.markSupported();
  }

  public final int read()
  {
    int i = this.a.read();
    if (i != -1)
      this.b = (1L + this.b);
    return i;
  }

  public final int read(byte[] paramArrayOfByte)
  {
    int i = this.a.read(paramArrayOfByte);
    if (i != -1)
      this.b += i;
    return i;
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = this.a.read(paramArrayOfByte, paramInt1, paramInt2);
    if (i != -1)
      this.b += i;
    return i;
  }

  public final void reset()
  {
    a(this.e);
  }

  public final long skip(long paramLong)
  {
    long l = this.a.skip(paramLong);
    this.b = (l + this.b);
    return l;
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
