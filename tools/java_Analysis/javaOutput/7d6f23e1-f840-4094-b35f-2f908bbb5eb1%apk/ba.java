import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

abstract class ba extends Reader
{
  protected InputStream a;
  protected byte[] b;
  protected int c;
  protected int d;
  private q e;
  private char[] f = null;

  protected ba(q paramq, InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.e = paramq;
    this.a = paramInputStream;
    this.b = paramArrayOfByte;
    this.c = paramInt1;
    this.d = paramInt2;
  }

  protected static void b()
  {
    throw new IOException("Strange I/O stream, returned 0 bytes on read");
  }

  public final void a()
  {
    byte[] arrayOfByte = this.b;
    if (arrayOfByte != null)
    {
      this.b = null;
      this.e.a(arrayOfByte);
    }
  }

  public void close()
  {
    InputStream localInputStream = this.a;
    if (localInputStream != null)
    {
      this.a = null;
      a();
      localInputStream.close();
    }
  }

  public int read()
  {
    if (this.f == null)
      this.f = new char[1];
    if (read(this.f, 0, 1) <= 0)
      return -1;
    return this.f[0];
  }
}

/* Location:
 * Qualified Name:     ba
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
