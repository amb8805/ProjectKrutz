import java.io.Writer;

public final class di extends df
{
  private static char[] d = e.g();
  private q e;
  private Writer f;
  private char[] g;
  private int h = 0;
  private int i = 0;
  private int j;
  private char[] k;

  public di(q paramq, int paramInt, am paramam, Writer paramWriter)
  {
    super(paramInt, paramam);
    this.e = paramq;
    this.f = paramWriter;
    this.g = paramq.f();
    this.j = this.g.length;
  }

  private static void a(int paramInt1, char[] paramArrayOfChar, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      int m = -(paramInt1 + 1);
      paramArrayOfChar[paramInt2] = '\\';
      int n = paramInt2 + 1;
      paramArrayOfChar[n] = 'u';
      int i1 = n + 1;
      paramArrayOfChar[i1] = '0';
      int i2 = i1 + 1;
      paramArrayOfChar[i2] = '0';
      int i3 = i2 + 1;
      paramArrayOfChar[i3] = d[(m >> 4)];
      paramArrayOfChar[(i3 + 1)] = d[(m & 0xF)];
      return;
    }
    paramArrayOfChar[paramInt2] = '\\';
    paramArrayOfChar[(paramInt2 + 1)] = (char)paramInt1;
  }

  private void b(int paramInt)
  {
    char[] arrayOfChar = this.k;
    if (arrayOfChar == null)
    {
      arrayOfChar = new char[6];
      arrayOfChar[0] = '\\';
      arrayOfChar[2] = '0';
      arrayOfChar[3] = '0';
    }
    if (paramInt < 0)
    {
      int m = -(paramInt + 1);
      arrayOfChar[1] = 'u';
      arrayOfChar[4] = d[(m >> 4)];
      arrayOfChar[5] = d[(m & 0xF)];
      this.f.write(arrayOfChar, 0, 6);
      return;
    }
    arrayOfChar[1] = (char)paramInt;
    this.f.write(arrayOfChar, 0, 2);
  }

  private void e(String paramString)
  {
    int m = paramString.length();
    if (m > this.j)
    {
      g();
      int i8 = paramString.length();
      int i9 = 0;
      label212: 
      do
      {
        int i10 = this.j;
        if (i9 + i10 > i8)
          i10 = i8 - i9;
        paramString.getChars(i9, i9 + i10, this.g, 0);
        int[] arrayOfInt2 = e.f();
        int i11 = arrayOfInt2.length;
        int i12 = 0;
        while (i12 < i10)
        {
          int i13 = i12;
          do
          {
            int i14 = this.g[i13];
            if ((i14 < i11) && (arrayOfInt2[i14] != 0))
              break;
            i13++;
          }
          while (i13 < i10);
          int i15 = i13 - i12;
          if (i15 > 0)
          {
            this.f.write(this.g, i12, i15);
            if (i13 >= i10)
              break;
          }
          int i16 = arrayOfInt2[this.g[i13]];
          int i17 = i13 + 1;
          if (i16 < 0);
          for (int i18 = 6; ; i18 = 2)
          {
            if (i18 <= this.i)
              break label212;
            b(i16);
            i12 = i17;
            break;
          }
          int i19 = i17 - i18;
          a(i16, this.g, i19);
          i12 = i19;
        }
        i9 += i10;
      }
      while (i9 < i8);
    }
    label455: label482: 
    while (true)
    {
      return;
      if (m + this.i > this.j)
        g();
      paramString.getChars(0, m, this.g, this.i);
      int n = m + this.i;
      int[] arrayOfInt1 = e.f();
      int i1 = arrayOfInt1.length;
      while (true)
      {
        if (this.i >= n)
          break label482;
        while (true)
        {
          int i2 = this.g[this.i];
          if ((i2 < i1) && (arrayOfInt1[i2] != 0))
            break label357;
          int i3 = 1 + this.i;
          this.i = i3;
          if (i3 >= n)
            break;
        }
        label357: int i4 = this.i - this.h;
        if (i4 > 0)
          this.f.write(this.g, this.h, i4);
        int i5 = arrayOfInt1[this.g[this.i]];
        this.i = (1 + this.i);
        if (i5 < 0);
        for (int i6 = 6; ; i6 = 2)
        {
          if (i6 <= this.i)
            break label455;
          this.h = this.i;
          b(i5);
          break;
        }
        int i7 = this.i - i6;
        this.h = i7;
        a(i5, this.g, i7);
      }
    }
  }

  private void g()
  {
    int m = this.i - this.h;
    if (m > 0)
    {
      int n = this.h;
      this.h = 0;
      this.i = 0;
      this.f.write(this.g, n, m);
    }
  }

  public final void a()
  {
    c("start an array");
    this.c = this.c.g();
    if (this.a == null)
    {
      if (this.i >= this.j)
        g();
      char[] arrayOfChar = this.g;
      int m = this.i;
      this.i = (m + 1);
      arrayOfChar[m] = '[';
    }
  }

  public final void a(int paramInt)
  {
    c("write number");
    if (11 + this.i >= this.j)
      g();
    if (this.b)
    {
      if (13 + this.i >= this.j)
        g();
      char[] arrayOfChar1 = this.g;
      int m = this.i;
      this.i = (m + 1);
      arrayOfChar1[m] = '"';
      this.i = dm.a(paramInt, this.g, this.i);
      char[] arrayOfChar2 = this.g;
      int n = this.i;
      this.i = (n + 1);
      arrayOfChar2[n] = '"';
      return;
    }
    this.i = dm.a(paramInt, this.g, this.i);
  }

  public final void a(long paramLong)
  {
    c("write number");
    if (this.b)
    {
      if (23 + this.i >= this.j)
        g();
      char[] arrayOfChar1 = this.g;
      int m = this.i;
      this.i = (m + 1);
      arrayOfChar1[m] = '"';
      this.i = dm.a(paramLong, this.g, this.i);
      char[] arrayOfChar2 = this.g;
      int n = this.i;
      this.i = (n + 1);
      arrayOfChar2[n] = '"';
      return;
    }
    if (21 + this.i >= this.j)
      g();
    this.i = dm.a(paramLong, this.g, this.i);
  }

  public final void a(String paramString)
  {
    int m = this.c.a(paramString);
    if (m == 4)
      d("Can not write a field name, expecting a value");
    int n;
    if (m == 1)
      n = 1;
    while (this.a != null)
      if (a(cc.c))
      {
        if (this.i >= this.j)
          g();
        char[] arrayOfChar4 = this.g;
        int i4 = this.i;
        this.i = (i4 + 1);
        arrayOfChar4[i4] = '"';
        e(paramString);
        if (this.i >= this.j)
          g();
        char[] arrayOfChar5 = this.g;
        int i5 = this.i;
        this.i = (i5 + 1);
        arrayOfChar5[i5] = '"';
        return;
        n = 0;
      }
      else
      {
        e(paramString);
        return;
      }
    if (1 + this.i >= this.j)
      g();
    if (n != 0)
    {
      char[] arrayOfChar3 = this.g;
      int i3 = this.i;
      this.i = (i3 + 1);
      arrayOfChar3[i3] = ',';
    }
    if (!a(cc.c))
    {
      e(paramString);
      return;
    }
    char[] arrayOfChar1 = this.g;
    int i1 = this.i;
    this.i = (i1 + 1);
    arrayOfChar1[i1] = '"';
    e(paramString);
    if (this.i >= this.j)
      g();
    char[] arrayOfChar2 = this.g;
    int i2 = this.i;
    this.i = (i2 + 1);
    arrayOfChar2[i2] = '"';
  }

  public final void a(String paramString1, String paramString2)
  {
    a(paramString1);
    b(paramString2);
  }

  public final void a(boolean paramBoolean)
  {
    c("write boolean value");
    if (5 + this.i >= this.j)
      g();
    int m = this.i;
    char[] arrayOfChar = this.g;
    int i3;
    if (paramBoolean)
    {
      arrayOfChar[m] = 't';
      int i4 = m + 1;
      arrayOfChar[i4] = 'r';
      int i5 = i4 + 1;
      arrayOfChar[i5] = 'u';
      i3 = i5 + 1;
      arrayOfChar[i3] = 'e';
    }
    while (true)
    {
      this.i = (i3 + 1);
      return;
      arrayOfChar[m] = 'f';
      int n = m + 1;
      arrayOfChar[n] = 'a';
      int i1 = n + 1;
      arrayOfChar[i1] = 'l';
      int i2 = i1 + 1;
      arrayOfChar[i2] = 's';
      i3 = i2 + 1;
      arrayOfChar[i3] = 'e';
    }
  }

  public final void b()
  {
    if (!this.c.a())
      d("Current context not an ARRAY but " + this.c.d());
    if (this.a == null)
    {
      if (this.i >= this.j)
        g();
      char[] arrayOfChar = this.g;
      int m = this.i;
      this.i = (m + 1);
      arrayOfChar[m] = ']';
    }
    this.c = this.c.i();
  }

  public final void b(String paramString)
  {
    c("write text value");
    if (paramString == null)
    {
      if (4 + this.i >= this.j)
        g();
      int i1 = this.i;
      char[] arrayOfChar3 = this.g;
      arrayOfChar3[i1] = 'n';
      int i2 = i1 + 1;
      arrayOfChar3[i2] = 'u';
      int i3 = i2 + 1;
      arrayOfChar3[i3] = 'l';
      int i4 = i3 + 1;
      arrayOfChar3[i4] = 'l';
      this.i = (i4 + 1);
      return;
    }
    if (this.i >= this.j)
      g();
    char[] arrayOfChar1 = this.g;
    int m = this.i;
    this.i = (m + 1);
    arrayOfChar1[m] = '"';
    e(paramString);
    if (this.i >= this.j)
      g();
    char[] arrayOfChar2 = this.g;
    int n = this.i;
    this.i = (n + 1);
    arrayOfChar2[n] = '"';
  }

  public final void c()
  {
    c("start an object");
    this.c = this.c.h();
    if (this.a == null)
    {
      if (this.i >= this.j)
        g();
      char[] arrayOfChar = this.g;
      int m = this.i;
      this.i = (m + 1);
      arrayOfChar[m] = '{';
    }
  }

  protected final void c(String paramString)
  {
    int m = this.c.j();
    if (m == 5)
      d("Can not " + paramString + ", expecting field name");
    if (this.a == null)
      switch (m)
      {
      default:
      case 1:
      case 2:
      case 3:
      }
    do
    {
      return;
      int n = 44;
      while (true)
      {
        if (this.i >= this.j)
          g();
        this.g[this.i] = n;
        this.i = (1 + this.i);
        return;
        n = 58;
        continue;
        n = 32;
      }
      switch (m)
      {
      case 1:
      case 2:
      case 3:
      default:
        throw new RuntimeException("Internal error: should never end up through this code path");
      case 0:
      }
    }
    while ((this.c.a()) || (!this.c.c()));
  }

  public final void close()
  {
    super.close();
    if ((this.g != null) && (a(cc.b)))
      while (true)
      {
        cu localcu = f();
        if (localcu.a())
        {
          b();
        }
        else
        {
          if (!localcu.c())
            break;
          d();
        }
      }
    g();
    if ((this.e.c()) || (a(cc.a)))
      this.f.close();
    while (true)
    {
      char[] arrayOfChar = this.g;
      if (arrayOfChar != null)
      {
        this.g = null;
        this.e.b(arrayOfChar);
      }
      return;
      this.f.flush();
    }
  }

  public final void d()
  {
    if (!this.c.c())
      d("Current context not an object but " + this.c.d());
    this.c = this.c.i();
    if (this.a == null)
    {
      if (this.i >= this.j)
        g();
      char[] arrayOfChar = this.g;
      int m = this.i;
      this.i = (m + 1);
      arrayOfChar[m] = '}';
    }
  }

  public final void e()
  {
    g();
    if ((this.f != null) && (a(cc.e)))
      this.f.flush();
  }
}

/* Location:
 * Qualified Name:     di
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
