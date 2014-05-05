import java.io.IOException;
import java.io.Reader;

public abstract class bt extends o
{
  protected char[] a;
  private Reader r;

  protected bt(q paramq, int paramInt, Reader paramReader)
  {
    super(paramq, paramInt);
    this.r = paramReader;
    this.a = paramq.e();
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
        throw new IOException("Reader returned 0 characters when trying to read " + this.d);
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
    char[] arrayOfChar = this.a;
    if (arrayOfChar != null)
    {
      this.a = null;
      this.b.a(arrayOfChar);
    }
  }

  protected final char e(String paramString)
  {
    if ((this.c >= this.d) && (!a()))
      b(paramString);
    char[] arrayOfChar = this.a;
    int i = this.c;
    this.c = (i + 1);
    return arrayOfChar[i];
  }
}

/* Location:
 * Qualified Name:     bt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
