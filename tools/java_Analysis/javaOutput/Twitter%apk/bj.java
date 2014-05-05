import java.io.InputStream;

public final class bj extends InputStream
{
  private q a;
  private InputStream b;
  private byte[] c;
  private int d;
  private int e;

  public bj(q paramq, InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramq;
    this.b = paramInputStream;
    this.c = paramArrayOfByte;
    this.d = paramInt1;
    this.e = paramInt2;
  }

  private void a()
  {
    byte[] arrayOfByte = this.c;
    if (arrayOfByte != null)
    {
      this.c = null;
      this.a.a(arrayOfByte);
    }
  }

  public final int available()
  {
    if (this.c != null)
      return this.e - this.d;
    return this.b.available();
  }

  public final void close()
  {
    a();
    this.b.close();
  }

  public final void mark(int paramInt)
  {
    if (this.c == null)
      this.b.mark(paramInt);
  }

  public final boolean markSupported()
  {
    return (this.c == null) && (this.b.markSupported());
  }

  public final int read()
  {
    if (this.c != null)
    {
      byte[] arrayOfByte = this.c;
      int i = this.d;
      this.d = (i + 1);
      int j = 0xFF & arrayOfByte[i];
      if (this.d >= this.e)
        a();
      return j;
    }
    return this.b.read();
  }

  public final int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i;
    if (this.c != null)
    {
      i = this.e - this.d;
      if (paramInt2 <= i)
        break label79;
    }
    while (true)
    {
      System.arraycopy(this.c, this.d, paramArrayOfByte, paramInt1, i);
      this.d = (i + this.d);
      if (this.d >= this.e)
        a();
      return i;
      return this.b.read(paramArrayOfByte, paramInt1, paramInt2);
      label79: i = paramInt2;
    }
  }

  public final void reset()
  {
    if (this.c == null)
      this.b.reset();
  }

  public final long skip(long paramLong)
  {
    int i;
    long l1;
    if (this.c != null)
    {
      i = this.e - this.d;
      if (i > paramLong)
      {
        this.d += (int)paramLong;
        l1 = paramLong;
      }
    }
    while (true)
    {
      return l1;
      a();
      long l3 = 0L + i;
      long l4 = paramLong - i;
      l1 = l3;
      for (long l2 = l4; l2 > 0L; l2 = paramLong)
      {
        return l1 + this.b.skip(l2);
        l1 = 0L;
      }
    }
  }
}

/* Location:
 * Qualified Name:     bj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
