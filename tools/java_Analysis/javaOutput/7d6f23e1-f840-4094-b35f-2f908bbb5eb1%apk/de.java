import java.io.FilterOutputStream;
import java.io.OutputStream;

final class de extends FilterOutputStream
{
  private final bf a;
  private final long b;
  private final long c;
  private long d;
  private long e;

  public de(OutputStream paramOutputStream, long paramLong, bf parambf)
  {
    super(paramOutputStream);
    this.a = parambf;
    this.b = (2L * paramLong);
    this.d = 0L;
    this.c = (this.b / 5L);
    this.e = this.c;
  }

  public final void write(int paramInt)
  {
    super.write(paramInt);
    this.d = (1L + this.d);
    if (this.d >= this.e)
    {
      super.flush();
      if (this.a != null)
        this.a.a(this.d, this.b);
      this.e += this.c;
    }
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super.write(paramArrayOfByte, paramInt1, paramInt2);
    this.d += paramInt2;
    if (this.d >= this.e)
    {
      super.flush();
      if (this.a != null)
        this.a.a(this.d, this.b);
      this.e += this.c;
    }
  }
}

/* Location:
 * Qualified Name:     de
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
