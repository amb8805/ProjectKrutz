import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class o extends bi
{
  private static BigDecimal a = new BigDecimal(-9223372036854775808L);
  private static BigDecimal r = new BigDecimal(9223372036854775807L);
  private static BigDecimal s = new BigDecimal(-9223372036854775808L);
  private static BigDecimal t = new BigDecimal(9223372036854775807L);
  private boolean A;
  private int B;
  private int C;
  private int D;
  private int u = 0;
  private int v;
  private long w;
  private double x;
  private BigInteger y;
  private BigDecimal z;

  protected o(q paramq, int paramInt)
  {
    super(paramq, paramInt);
  }

  private void c(int paramInt)
  {
    if (this.q == cp.h)
    {
      char[] arrayOfChar = this.m.d();
      int i = this.m.c();
      int j = this.B;
      if (this.A)
        i++;
      if (j <= 9)
      {
        int k = dj.a(arrayOfChar, i, j);
        if (this.A)
          k = -k;
        this.v = k;
        this.u = 1;
        return;
      }
      if (j <= 18)
      {
        long l = dj.b(arrayOfChar, i, j);
        if (this.A)
          l = -l;
        if (j == 10)
          if (this.A)
          {
            if (l >= -2147483648L)
            {
              this.v = (int)l;
              this.u = 1;
            }
          }
          else if (l <= 2147483647L)
          {
            this.v = (int)l;
            this.u = 1;
            return;
          }
        this.w = l;
        this.u = 2;
        return;
      }
      String str = this.m.e();
      try
      {
        if (dj.a(arrayOfChar, i, j, this.A))
        {
          this.w = Long.parseLong(str);
          this.u = 2;
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        a("Malformed numeric value '" + str + "'", localNumberFormatException2);
        return;
      }
      this.y = new BigInteger(str);
      this.u = 4;
      return;
    }
    if (this.q == cp.i)
    {
      if (paramInt == 16)
        try
        {
          this.z = this.m.f();
          this.u = 16;
          return;
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          a("Malformed numeric value '" + this.m.e() + "'", localNumberFormatException1);
          return;
        }
      this.x = this.m.g();
      this.u = 8;
      return;
    }
    c("Current token (" + this.q + ") not numeric, can not use numeric value accessors");
  }

  private void r()
  {
    c("Numeric value (" + j() + ") out of range of int (" + -2147483648 + " - " + 2147483647 + ")");
  }

  private void s()
  {
    c("Numeric value (" + j() + ") out of range of long (" + -9223372036854775808L + " - " + 9223372036854775807L + ")");
  }

  protected final cp a(boolean paramBoolean, int paramInt)
  {
    this.A = paramBoolean;
    this.B = paramInt;
    this.C = 0;
    this.D = 0;
    this.u = 0;
    return cp.h;
  }

  protected final cp a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 <= 0) && (paramInt3 <= 0))
      return a(paramBoolean, paramInt1);
    return b(paramBoolean, paramInt1, paramInt2, paramInt3);
  }

  protected final void a(int paramInt, String paramString)
  {
    String str = "Unexpected character (" + b(paramInt) + ") in numeric value";
    if (paramString != null)
      str = str + ": " + paramString;
    c(str);
  }

  protected final void a(String paramString)
  {
    c("Invalid numeric value: " + paramString);
  }

  protected final cp b(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    this.A = paramBoolean;
    this.B = paramInt1;
    this.C = paramInt2;
    this.D = paramInt3;
    this.u = 0;
    return cp.i;
  }

  public final int d()
  {
    if ((0x1 & this.u) == 0)
    {
      if (this.u == 0)
        c(1);
      if ((0x1 & this.u) == 0)
      {
        if ((0x2 & this.u) == 0)
          break label106;
        int i = (int)this.w;
        if (i != this.w)
          c("Numeric value (" + j() + ") out of range of int");
        this.v = i;
      }
    }
    while (true)
    {
      this.u = (0x1 | this.u);
      return this.v;
      label106: if ((0x4 & this.u) != 0)
      {
        this.v = this.y.intValue();
      }
      else if ((0x8 & this.u) != 0)
      {
        if ((this.x < -2147483648.0D) || (this.x > 2147483647.0D))
          r();
        this.v = (int)this.x;
      }
      else if ((0x10 & this.u) != 0)
      {
        if ((s.compareTo(this.z) > 0) || (t.compareTo(this.z) < 0))
          r();
        this.v = this.z.intValue();
      }
      else
      {
        l();
      }
    }
  }

  public final long e()
  {
    if ((0x2 & this.u) == 0)
    {
      if (this.u == 0)
        c(2);
      if ((0x2 & this.u) == 0)
      {
        if ((0x1 & this.u) == 0)
          break label63;
        this.w = this.v;
      }
    }
    while (true)
    {
      this.u = (0x2 | this.u);
      return this.w;
      label63: if ((0x4 & this.u) != 0)
      {
        this.w = this.y.longValue();
      }
      else if ((0x8 & this.u) != 0)
      {
        if ((this.x < -9.223372036854776E+18D) || (this.x > 9.223372036854776E+18D))
          s();
        this.w = ()this.x;
      }
      else if ((0x10 & this.u) != 0)
      {
        if ((a.compareTo(this.z) > 0) || (r.compareTo(this.z) < 0))
          s();
        this.w = this.z.longValue();
      }
      else
      {
        l();
      }
    }
  }

  public final double f()
  {
    if ((0x8 & this.u) == 0)
    {
      if (this.u == 0)
        c(8);
      if ((0x8 & this.u) == 0)
      {
        if ((0x10 & this.u) == 0)
          break label70;
        this.x = this.z.doubleValue();
      }
    }
    while (true)
    {
      this.u = (0x8 | this.u);
      return this.x;
      label70: if ((0x4 & this.u) != 0)
        this.x = this.y.doubleValue();
      else if ((0x2 & this.u) != 0)
        this.x = this.w;
      else if ((0x1 & this.u) != 0)
        this.x = this.v;
      else
        l();
    }
  }
}

/* Location:
 * Qualified Name:     o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
