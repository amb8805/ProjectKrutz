package com.b.a;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class c extends FilterOutputStream
{
  private c(b paramb, OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }

  public final void close()
  {
    try
    {
      this.out.close();
      return;
    }
    catch (IOException localIOException)
    {
      b.c(this.a);
    }
  }

  public final void flush()
  {
    try
    {
      this.out.flush();
      return;
    }
    catch (IOException localIOException)
    {
      b.c(this.a);
    }
  }

  public final void write(int paramInt)
  {
    try
    {
      this.out.write(paramInt);
      return;
    }
    catch (IOException localIOException)
    {
      b.c(this.a);
    }
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      this.out.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    catch (IOException localIOException)
    {
      b.c(this.a);
    }
  }
}

/* Location:
 * Qualified Name:     com.b.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
