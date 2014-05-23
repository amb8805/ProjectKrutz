import java.io.OutputStream;
import java.util.LinkedList;

public final class a extends OutputStream
{
  private static final byte[] a = new byte[0];
  private final cd b = null;
  private final LinkedList c = new LinkedList();
  private int d;
  private byte[] e = new byte[500];
  private int f;

  public a()
  {
    this(null);
  }

  private a(cd paramcd)
  {
    this(null, 500);
  }

  private a(cd paramcd, int paramInt)
  {
  }

  private void a()
  {
    this.d += this.e.length;
    int i = Math.max(this.d >> 1, 1000);
    if (i > 262144)
      i = 262144;
    this.c.add(this.e);
    this.e = new byte[i];
    this.f = 0;
  }

  public final void close()
  {
  }

  public final void flush()
  {
  }

  public final void write(int paramInt)
  {
    if (this.f >= this.e.length)
      a();
    byte[] arrayOfByte = this.e;
    int i = this.f;
    this.f = (i + 1);
    arrayOfByte[i] = (byte)paramInt;
  }

  public final void write(byte[] paramArrayOfByte)
  {
    write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    int j = paramInt1;
    while (true)
    {
      int k = Math.min(this.e.length - this.f, i);
      if (k > 0)
      {
        System.arraycopy(paramArrayOfByte, j, this.e, this.f, k);
        j += k;
        this.f = (k + this.f);
        i -= k;
      }
      if (i <= 0)
        break;
      a();
    }
  }
}

/* Location:
 * Qualified Name:     a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
