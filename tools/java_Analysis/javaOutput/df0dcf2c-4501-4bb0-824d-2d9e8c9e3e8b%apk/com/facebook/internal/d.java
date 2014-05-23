package com.facebook.internal;

import java.io.OutputStream;

final class d extends OutputStream
{
  final OutputStream a;
  final h b;

  d(OutputStream paramOutputStream, h paramh)
  {
    this.a = paramOutputStream;
    this.b = paramh;
  }

  public final void close()
  {
    try
    {
      this.a.close();
      return;
    }
    finally
    {
      this.b.a();
    }
  }

  public final void flush()
  {
    this.a.flush();
  }

  public final void write(int paramInt)
  {
    this.a.write(paramInt);
  }

  public final void write(byte[] paramArrayOfByte)
  {
    this.a.write(paramArrayOfByte);
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
