import java.io.Reader;

public final class da extends ca
{
  private am r;
  private cx s;
  private boolean t = false;

  public da(q paramq, int paramInt, Reader paramReader, am paramam, cx paramcx)
  {
    super(paramq, paramInt, paramReader);
    this.r = paramam;
    this.s = paramcx;
  }

  private String a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.m.a(this.a, paramInt1, this.c - paramInt1);
    char[] arrayOfChar1 = this.m.h();
    int i = this.m.j();
    char[] arrayOfChar2 = arrayOfChar1;
    int j = i;
    int k = paramInt2;
    while (true)
    {
      if ((this.c >= this.d) && (!a()))
        b(": was expecting closing '" + (char)paramInt3 + "' for name");
      char[] arrayOfChar3 = this.a;
      int m = this.c;
      this.c = (m + 1);
      int n = arrayOfChar3[m];
      if (n <= 92)
        if (n != 92);
      int i2;
      for (int i1 = v(); ; i1 = n)
      {
        k = n + k * 31;
        i2 = j + 1;
        arrayOfChar2[j] = i1;
        if (i2 < arrayOfChar2.length)
          break label273;
        arrayOfChar2 = this.m.k();
        j = 0;
        break;
        if (n <= paramInt3)
        {
          if (n == paramInt3)
            break label221;
          if (n < 32)
            c(n, "name");
        }
      }
      label221: this.m.a(j);
      ci localci = this.m;
      char[] arrayOfChar4 = localci.d();
      int i3 = localci.c();
      int i4 = localci.b();
      return this.s.a(arrayOfChar4, i3, i4, k);
      label273: j = i2;
    }
  }

  private void a(cp paramcp)
  {
    String str = paramcp.a();
    int i = 1;
    int j = str.length();
    while (i < j)
    {
      if ((this.c >= this.d) && (!a()))
        b(" in a value");
      if (this.a[this.c] != str.charAt(i))
      {
        StringBuilder localStringBuilder = new StringBuilder(str.substring(0, i));
        while ((this.c < this.d) || (a()))
        {
          char c = this.a[this.c];
          if (!Character.isJavaIdentifierPart(c))
            break;
          this.c = (1 + this.c);
          localStringBuilder.append(c);
        }
        c("Unrecognized token '" + localStringBuilder.toString() + "': was expecting 'null', 'true' or 'false'");
      }
      this.c = (1 + this.c);
      i++;
    }
  }

  private String d(int paramInt)
  {
    int i23;
    int i26;
    int i25;
    if (paramInt != 34)
      if ((paramInt == 39) && (a(au.d)))
      {
        i23 = this.c;
        int i24 = this.d;
        if (i23 >= i24)
          break label800;
        int[] arrayOfInt3 = e.a();
        int i28 = arrayOfInt3.length;
        int i29 = i23;
        i26 = 0;
        do
        {
          int i30 = this.a[i29];
          if (i30 == 39)
          {
            int i31 = this.c;
            this.c = (i29 + 1);
            return this.s.a(this.a, i31, i29 - i31, i26);
          }
          if ((i30 < i28) && (arrayOfInt3[i30] != 0))
            break;
          i26 = i30 + i26 * 31;
          i29++;
        }
        while (i29 < i24);
        i25 = i29;
      }
    while (true)
    {
      int i27 = this.c;
      this.c = i25;
      return a(i27, i26, 39);
      if (!a(au.c))
        b(paramInt, "was expecting double-quote to start field name");
      int[] arrayOfInt2 = e.c();
      int i5 = arrayOfInt2.length;
      boolean bool;
      int i7;
      int i18;
      int i19;
      if (paramInt < i5)
        if ((arrayOfInt2[paramInt] == 0) && ((paramInt < 48) || (paramInt > 57)))
        {
          bool = true;
          if (!bool)
            b(paramInt, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
          i6 = this.c;
          i7 = this.d;
          if (i6 >= i7)
            break label794;
          i18 = i6;
          i19 = 0;
        }
      label382: 
      do
      {
        int i20 = this.a[i18];
        if (i20 < i5)
        {
          if (arrayOfInt2[i20] == 0)
            break label382;
          int i22 = this.c - 1;
          this.c = i18;
          return this.s.a(this.a, i22, i18 - i22, i19);
          bool = false;
          break;
          bool = Character.isJavaIdentifierPart((char)paramInt);
          break;
        }
        if (!Character.isJavaIdentifierPart(i20))
        {
          int i21 = this.c - 1;
          this.c = i18;
          return this.s.a(this.a, i21, i18 - i21, i19);
        }
        i19 = i20 + i19 * 31;
        i18++;
      }
      while (i18 < i7);
      int i8 = i19;
      int i6 = i18;
      while (true)
      {
        int i9 = this.c - 1;
        this.c = i6;
        this.m.a(this.a, i9, this.c - i9);
        char[] arrayOfChar1 = this.m.h();
        int i10 = this.m.j();
        int i11 = arrayOfInt2.length;
        int i12 = i8;
        int i13 = i10;
        while (true)
        {
          int i14;
          if ((this.c < this.d) || (a()))
          {
            i14 = this.a[this.c];
            if (i14 > i11)
              break label571;
            if (arrayOfInt2[i14] == 0)
              break label579;
          }
          label571: 
          while (!Character.isJavaIdentifierPart(i14))
          {
            this.m.a(i13);
            ci localci = this.m;
            char[] arrayOfChar2 = localci.d();
            int i16 = localci.c();
            int i17 = localci.b();
            return this.s.a(arrayOfChar2, i16, i17, i12);
          }
          label579: this.c = (1 + this.c);
          i12 = i14 + i12 * 31;
          int i15 = i13 + 1;
          arrayOfChar1[i13] = i14;
          if (i15 >= arrayOfChar1.length)
          {
            arrayOfChar1 = this.m.k();
            i13 = 0;
            continue;
            int i = this.c;
            int j = this.d;
            int m;
            int k;
            if (i < j)
            {
              int[] arrayOfInt1 = e.a();
              int i1 = arrayOfInt1.length;
              int i2 = i;
              m = 0;
              do
              {
                int i3 = this.a[i2];
                if ((i3 < i1) && (arrayOfInt1[i3] != 0))
                {
                  if (i3 != 34)
                    break;
                  int i4 = this.c;
                  this.c = (i2 + 1);
                  return this.s.a(this.a, i4, i2 - i4, m);
                }
                m = i3 + m * 31;
                i2++;
              }
              while (i2 < j);
              k = i2;
            }
            while (true)
            {
              int n = this.c;
              this.c = k;
              return a(n, m, 34);
              k = i;
              m = 0;
            }
          }
          else
          {
            i13 = i15;
          }
        }
        label794: i8 = 0;
      }
      label800: i25 = i23;
      i26 = 0;
    }
  }

  private cp e(int paramInt)
  {
    if ((paramInt != 39) || (!a(au.d)))
      b(paramInt, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
    char[] arrayOfChar1 = this.m.i();
    int i = this.m.j();
    char[] arrayOfChar2 = arrayOfChar1;
    int j = i;
    if ((this.c >= this.d) && (!a()))
      b(": was expecting closing quote for a string value");
    char[] arrayOfChar3 = this.a;
    int k = this.c;
    this.c = (k + 1);
    int m = arrayOfChar3[k];
    if (m <= 92)
    {
      if (m != 92)
        break label156;
      m = v();
    }
    while (true)
    {
      if (j >= arrayOfChar2.length)
      {
        arrayOfChar2 = this.m.k();
        j = 0;
      }
      int n = j + 1;
      arrayOfChar2[j] = m;
      j = n;
      break;
      label156: if (m <= 39)
      {
        if (m == 39)
          break label188;
        if (m < 32)
          c(m, "string value");
      }
    }
    label188: this.m.a(j);
    return cp.g;
  }

  private void r()
  {
    if (((this.c < this.d) || (a())) && (this.a[this.c] == '\n'))
      this.c = (1 + this.c);
    this.f = (1 + this.f);
    this.g = this.c;
  }

  private void s()
  {
    this.f = (1 + this.f);
    this.g = this.c;
  }

  private final int t()
  {
    while ((this.c < this.d) || (a()))
    {
      char[] arrayOfChar = this.a;
      int i = this.c;
      this.c = (i + 1);
      int j = arrayOfChar[i];
      if (j > 32)
      {
        if (j != 47)
          return j;
        u();
      }
      else if (j != 32)
      {
        if (j == 10)
          s();
        else if (j == 13)
          r();
        else if (j != 9)
          a(j);
      }
    }
    throw d("Unexpected end-of-input within/between " + this.k.d() + " entries");
  }

  private final void u()
  {
    if (!a(au.b))
      b(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
    if ((this.c >= this.d) && (!a()))
      b(" in a comment");
    char[] arrayOfChar1 = this.a;
    int i = this.c;
    this.c = (i + 1);
    int j = arrayOfChar1[i];
    if (j == 47)
      while (true)
      {
        int i1;
        if ((this.c < this.d) || (a()))
        {
          char[] arrayOfChar3 = this.a;
          int n = this.c;
          this.c = (n + 1);
          i1 = arrayOfChar3[n];
          if (i1 < 32)
            if (i1 == 10)
              s();
        }
        else
        {
          return;
          if (i1 == 13)
          {
            r();
            return;
          }
          if (i1 != 9)
            a(i1);
        }
      }
    if (j == 42)
    {
      while ((this.c < this.d) || (a()))
      {
        char[] arrayOfChar2 = this.a;
        int k = this.c;
        this.c = (k + 1);
        int m = arrayOfChar2[k];
        if (m <= 42)
          if (m == 42)
          {
            if ((this.c >= this.d) && (!a()))
              break;
            if (this.a[this.c] == '/')
              this.c = (1 + this.c);
          }
          else if (m < 32)
          {
            if (m == 10)
              s();
            else if (m == 13)
              r();
            else if (m != 9)
              a(m);
          }
      }
      b(" in a comment");
      return;
    }
    b(j, "was expecting either '*' or '/' for a comment");
  }

  private char v()
  {
    if ((this.c >= this.d) && (!a()))
      b(" in character escape sequence");
    char[] arrayOfChar1 = this.a;
    int i = this.c;
    this.c = (i + 1);
    char c = arrayOfChar1[i];
    switch (c)
    {
    default:
      c = a(c);
    case '"':
    case '/':
    case '\\':
      return c;
    case 'b':
      return '\b';
    case 't':
      return '\t';
    case 'n':
      return '\n';
    case 'f':
      return '\f';
    case 'r':
      return '\r';
    case 'u':
    }
    int j = 0;
    int k = 0;
    while (j < 4)
    {
      if ((this.c >= this.d) && (!a()))
        b(" in character escape sequence");
      char[] arrayOfChar2 = this.a;
      int m = this.c;
      this.c = (m + 1);
      int n = arrayOfChar2[m];
      int i1 = e.a(n);
      if (i1 < 0)
        b(n, "expected a hex-digit for character escape sequence");
      k = i1 | k << 4;
      j++;
    }
    return (char)k;
  }

  public final void close()
  {
    super.close();
    this.s.b();
  }

  public final cp g()
  {
    if (this.q == cp.e)
    {
      this.n = false;
      cp localcp4 = this.l;
      this.l = null;
      if (localcp4 == cp.c)
        this.k = this.k.a(this.i, this.j);
      while (true)
      {
        this.q = localcp4;
        return localcp4;
        if (localcp4 == cp.a)
          this.k = this.k.b(this.i, this.j);
      }
    }
    int i1;
    int i3;
    int i4;
    label257: int j;
    if (this.t)
    {
      this.t = false;
      int m = this.c;
      int n = this.d;
      char[] arrayOfChar2 = this.a;
      i1 = m;
      int i6;
      for (int i2 = n; ; i2 = i6)
      {
        if (i1 >= i2)
        {
          this.c = i1;
          if (!a())
            b(": was expecting closing quote for a string value");
          int i7 = this.c;
          int i8 = this.d;
          i1 = i7;
          i2 = i8;
        }
        i3 = i1 + 1;
        i4 = arrayOfChar2[i1];
        if (i4 > 92)
          break label344;
        if (i4 != 92)
          break;
        this.c = i3;
        v();
        int i5 = this.c;
        i6 = this.d;
        i1 = i5;
      }
      if (i4 > 34)
        break label344;
      if (i4 == 34)
        this.c = i3;
    }
    else
    {
      if ((this.c >= this.d) && (!a()))
        break label404;
      char[] arrayOfChar1 = this.a;
      int i = this.c;
      this.c = (i + 1);
      j = arrayOfChar1[i];
      if (j <= 32)
        break label358;
      if (j == 47)
        break label351;
    }
    while (true)
    {
      if (j >= 0)
        break label413;
      close();
      this.q = null;
      return null;
      if (i4 < 32)
      {
        this.c = i3;
        c(i4, "string value");
      }
      label344: i1 = i3;
      break;
      label351: u();
      break label257;
      label358: if (j == 32)
        break label257;
      if (j == 10)
      {
        s();
        break label257;
      }
      if (j == 13)
      {
        r();
        break label257;
      }
      if (j == 9)
        break label257;
      a(j);
      break label257;
      label404: i();
      j = -1;
    }
    label413: this.h = (this.e + this.c - 1L);
    this.i = this.f;
    this.j = (this.c - this.g - 1);
    this.o = null;
    if (j == 93)
    {
      if (!this.k.a())
        a(j, (char)'}');
      this.k = this.k.g();
      cp localcp3 = cp.d;
      this.q = localcp3;
      return localcp3;
    }
    if (j == 125)
    {
      if (!this.k.c())
        a(j, (char)']');
      this.k = this.k.g();
      cp localcp2 = cp.b;
      this.q = localcp2;
      return localcp2;
    }
    if (this.k.h())
    {
      if (j != 44)
        b(j, "was expecting comma to separate " + this.k.d() + " entries");
      j = t();
    }
    boolean bool = this.k.c();
    if (bool)
    {
      String str = d(j);
      this.k.a(str);
      this.q = cp.e;
      int k = t();
      if (k != 58)
        b(k, "was expecting a colon to separate field name and value");
      j = t();
    }
    cp localcp1;
    switch (j)
    {
    default:
      localcp1 = e(j);
    case 34:
    case 91:
    case 123:
    case 93:
    case 125:
    case 116:
    case 102:
    case 110:
    case 45:
    case 48:
    case 49:
    case 50:
    case 51:
    case 52:
    case 53:
    case 54:
    case 55:
    case 56:
    case 57:
    }
    while (bool)
    {
      this.l = localcp1;
      return this.q;
      this.t = true;
      localcp1 = cp.g;
      continue;
      if (!bool)
        this.k = this.k.a(this.i, this.j);
      localcp1 = cp.c;
      continue;
      if (!bool)
        this.k = this.k.b(this.i, this.j);
      localcp1 = cp.a;
      continue;
      b(j, "expected a value");
      a(cp.j);
      localcp1 = cp.j;
      continue;
      a(cp.k);
      localcp1 = cp.k;
      continue;
      a(cp.l);
      localcp1 = cp.l;
      continue;
      localcp1 = c(j);
    }
    this.q = localcp1;
    return localcp1;
  }

  public final String j()
  {
    cp localcp = this.q;
    if (localcp == cp.g)
    {
      int i;
      int j;
      if (this.t)
      {
        this.t = false;
        i = this.c;
        j = this.d;
        if (i >= j)
          break label123;
        int[] arrayOfInt = e.a();
        int i3 = arrayOfInt.length;
        int i4 = this.a[i];
        if ((i4 >= i3) || (arrayOfInt[i4] == 0))
          break label115;
        if (i4 != 34)
          break label123;
        this.m.a(this.a, this.c, i - this.c);
        this.c = (i + 1);
      }
      while (true)
      {
        return this.m.e();
        label115: i++;
        if (i < j)
          break;
        label123: this.m.b(this.a, this.c, i - this.c);
        this.c = i;
        char[] arrayOfChar1 = this.m.h();
        int k = this.m.j();
        char[] arrayOfChar2 = arrayOfChar1;
        int m = k;
        if ((this.c >= this.d) && (!a()))
          b(": was expecting closing quote for a string value");
        char[] arrayOfChar3 = this.a;
        int n = this.c;
        this.c = (n + 1);
        int i1 = arrayOfChar3[n];
        if (i1 <= 92)
        {
          if (i1 != 92)
            break label286;
          i1 = v();
        }
        while (true)
        {
          if (m >= arrayOfChar2.length)
          {
            arrayOfChar2 = this.m.k();
            m = 0;
          }
          int i2 = m + 1;
          arrayOfChar2[m] = i1;
          m = i2;
          break;
          label286: if (i1 <= 34)
          {
            if (i1 == 34)
              break label318;
            if (i1 < 32)
              c(i1, "string value");
          }
        }
        label318: this.m.a(m);
      }
    }
    if (localcp == null)
      return null;
    switch (br.a[localcp.ordinal()])
    {
    default:
      return localcp.a();
    case 1:
      return this.k.f();
    case 2:
    case 3:
    case 4:
    }
    return this.m.e();
  }
}

/* Location:
 * Qualified Name:     da
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
