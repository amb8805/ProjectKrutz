import java.io.IOException;
import java.io.InputStream;

public abstract class b extends o
{
  protected byte[] a;
  private InputStream r;
  private boolean s;

  protected b(q paramq, int paramInt1, InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    super(paramq, paramInt1);
    this.r = paramInputStream;
    this.a = paramArrayOfByte;
    this.c = paramInt2;
    this.d = paramInt3;
    this.s = paramBoolean;
  }

  protected final boolean a()
  {
    this.e += this.d;
    this.g -= this.d;
    if (this.r != null)
    {
      int i = this.r.read(this.a, 0, this.a.length);
      if (i > 0)
      {
        this.c = 0;
        this.d = i;
        return true;
      }
      b();
      if (i == 0)
        throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.a.length + " bytes");
    }
    return false;
  }

  protected final void b()
  {
    if (this.r != null)
    {
      if ((this.b.c()) || (a(au.a)))
        this.r.close();
      this.r = null;
    }
  }

  protected final void c()
  {
    super.c();
    if (this.s)
    {
      byte[] arrayOfByte = this.a;
      if (arrayOfByte != null)
      {
        this.a = null;
        this.b.a(arrayOfByte);
      }
    }
  }
}

/* Location:
 * Qualified Name:     b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
