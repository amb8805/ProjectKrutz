import java.math.BigDecimal;
import java.util.ArrayList;

public final class ci
{
  private static char[] a = new char[0];
  private final cd b;
  private char[] c;
  private int d;
  private int e;
  private ArrayList f;
  private boolean g = false;
  private int h;
  private char[] i;
  private int j;
  private String k;
  private char[] l;

  public ci(cd paramcd)
  {
    this.b = paramcd;
  }

  private final char[] b(int paramInt)
  {
    if (this.b != null)
      return this.b.a(dq.c, paramInt);
    return new char[Math.max(paramInt, 1000)];
  }

  private void c(int paramInt)
  {
    int m = this.e;
    this.e = 0;
    char[] arrayOfChar = this.c;
    this.c = null;
    int n = this.d;
    this.d = -1;
    int i1 = m + paramInt;
    if ((this.i == null) || (i1 > this.i.length))
      this.i = b(i1);
    if (m > 0)
      System.arraycopy(arrayOfChar, n, this.i, 0, m);
    this.h = 0;
    this.j = m;
  }

  private void d(int paramInt)
  {
    if (this.f == null)
      this.f = new ArrayList();
    char[] arrayOfChar1 = this.i;
    this.g = true;
    this.f.add(arrayOfChar1);
    this.h += arrayOfChar1.length;
    int m = arrayOfChar1.length;
    int n = m >> 1;
    if (n < paramInt)
      n = paramInt;
    char[] arrayOfChar2 = new char[Math.min(262144, m + n)];
    this.j = 0;
    this.i = arrayOfChar2;
  }

  private void m()
  {
    this.d = -1;
    this.j = 0;
    this.e = 0;
    this.c = null;
    this.k = null;
    this.l = null;
    if (this.g)
      n();
  }

  private final void n()
  {
    this.g = false;
    this.f.clear();
    this.h = 0;
    this.j = 0;
  }

  private char[] o()
  {
    Object localObject = this.l;
    if (localObject == null)
    {
      if (this.k == null)
        break label31;
      localObject = this.k.toCharArray();
    }
    label31: int m;
    while (true)
    {
      this.l = ((char[])localObject);
      return localObject;
      if (this.d >= 0)
      {
        if (this.e <= 0)
        {
          localObject = a;
        }
        else
        {
          localObject = new char[this.e];
          System.arraycopy(this.c, this.d, localObject, 0, this.e);
        }
      }
      else
      {
        m = b();
        if (m > 0)
          break;
        localObject = a;
      }
    }
    char[] arrayOfChar1 = new char[m];
    int i3;
    if (this.f != null)
    {
      int i1 = this.f.size();
      int i2 = 0;
      int i5;
      for (i3 = 0; i2 < i1; i3 = i5)
      {
        char[] arrayOfChar2 = (char[])this.f.get(i2);
        int i4 = arrayOfChar2.length;
        System.arraycopy(arrayOfChar2, 0, arrayOfChar1, i3, i4);
        i5 = i3 + i4;
        i2++;
      }
    }
    for (int n = i3; ; n = 0)
    {
      System.arraycopy(this.i, 0, arrayOfChar1, n, this.j);
      localObject = arrayOfChar1;
      break;
    }
  }

  public final void a()
  {
    if (this.b == null)
      m();
    while (this.i == null)
      return;
    m();
    char[] arrayOfChar = this.i;
    this.i = null;
    this.b.a(dq.c, arrayOfChar);
  }

  public final void a(int paramInt)
  {
    this.j = paramInt;
  }

  public final void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.k = null;
    this.l = null;
    this.c = paramArrayOfChar;
    this.d = paramInt1;
    this.e = paramInt2;
    if (this.g)
      n();
  }

  public final int b()
  {
    if (this.d >= 0)
      return this.e;
    return this.h + this.j;
  }

  public final void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.c = null;
    this.d = -1;
    this.e = 0;
    this.k = null;
    this.l = null;
    if (this.g)
      n();
    char[] arrayOfChar;
    int m;
    while (true)
    {
      this.h = 0;
      this.j = 0;
      if (this.d >= 0)
        c(paramInt2);
      this.k = null;
      this.l = null;
      arrayOfChar = this.i;
      m = arrayOfChar.length - this.j;
      if (m < paramInt2)
        break;
      System.arraycopy(paramArrayOfChar, paramInt1, arrayOfChar, this.j, paramInt2);
      this.j = (paramInt2 + this.j);
      return;
      if (this.i == null)
        this.i = b(paramInt2);
    }
    int i1;
    int n;
    if (m > 0)
    {
      System.arraycopy(paramArrayOfChar, paramInt1, arrayOfChar, this.j, m);
      int i2 = paramInt1 + m;
      int i3 = paramInt2 - m;
      i1 = i2;
      n = i3;
    }
    while (true)
    {
      d(n);
      System.arraycopy(paramArrayOfChar, i1, this.i, 0, n);
      this.j = n;
      return;
      n = paramInt2;
      i1 = paramInt1;
    }
  }

  public final int c()
  {
    if (this.d >= 0)
      return this.d;
    return 0;
  }

  public final char[] d()
  {
    if (this.d >= 0)
      return this.c;
    if (!this.g)
      return this.i;
    return o();
  }

  public final String e()
  {
    if (this.k == null)
    {
      if (this.l == null)
        break label34;
      this.k = new String(this.l);
    }
    while (true)
    {
      return this.k;
      label34: if (this.d >= 0)
      {
        if (this.e <= 0)
        {
          this.k = "";
          return "";
        }
        this.k = new String(this.c, this.d, this.e);
      }
      else
      {
        int m = this.h;
        int n = this.j;
        if (m == 0)
        {
          if (n == 0);
          for (String str = ""; ; str = new String(this.i, 0, n))
          {
            this.k = str;
            break;
          }
        }
        StringBuilder localStringBuilder = new StringBuilder(m + n);
        if (this.f != null)
        {
          int i1 = this.f.size();
          for (int i2 = 0; i2 < i1; i2++)
          {
            char[] arrayOfChar = (char[])this.f.get(i2);
            localStringBuilder.append(arrayOfChar, 0, arrayOfChar.length);
          }
        }
        localStringBuilder.append(this.i, 0, this.j);
        this.k = localStringBuilder.toString();
      }
    }
  }

  public final BigDecimal f()
  {
    if (this.l != null)
      return new BigDecimal(this.l);
    if (this.d >= 0)
      return new BigDecimal(this.c, this.d, this.e);
    if (this.h == 0)
      return new BigDecimal(this.i, 0, this.j);
    return new BigDecimal(o());
  }

  public final double g()
  {
    return Double.parseDouble(e());
  }

  public final char[] h()
  {
    if (this.d >= 0)
      c(1);
    while (true)
    {
      return this.i;
      char[] arrayOfChar = this.i;
      if (arrayOfChar == null)
        this.i = b(0);
      else if (this.j >= arrayOfChar.length)
        d(1);
    }
  }

  public final char[] i()
  {
    this.d = -1;
    this.j = 0;
    this.e = 0;
    this.c = null;
    this.k = null;
    this.l = null;
    if (this.g)
      n();
    char[] arrayOfChar = this.i;
    if (arrayOfChar == null)
    {
      arrayOfChar = b(0);
      this.i = arrayOfChar;
    }
    return arrayOfChar;
  }

  public final int j()
  {
    return this.j;
  }

  public final char[] k()
  {
    if (this.f == null)
      this.f = new ArrayList();
    this.g = true;
    this.f.add(this.i);
    int m = this.i.length;
    this.h = (m + this.h);
    char[] arrayOfChar = new char[Math.min(m + (m >> 1), 262144)];
    this.j = 0;
    this.i = arrayOfChar;
    return arrayOfChar;
  }

  public final char[] l()
  {
    char[] arrayOfChar = this.i;
    int m = arrayOfChar.length;
    if (m == 262144);
    for (int n = 262145; ; n = Math.min(262144, m + (m >> 1)))
    {
      this.i = new char[n];
      System.arraycopy(arrayOfChar, 0, this.i, 0, m);
      return this.i;
    }
  }

  public final String toString()
  {
    return e();
  }
}

/* Location:
 * Qualified Name:     ci
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
