package com.spotify.mobile.android.util.soft;

public final class SoftObject
{
  protected final String a;
  protected final int b;
  protected int c;
  protected boolean d;
  protected int[] e;
  protected int[] f;
  protected int[] g;
  protected SoftObject[] h;
  private int i;
  private int j;
  private int k;

  public SoftObject(String paramString)
  {
    this.a = paramString;
    this.b = this.a.length();
    a(0, 0, false);
  }

  private int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int m = 0;
    switch (j(paramInt1))
    {
    default:
      throw new SoftObject.InvalidTypeException("invalid or broken soft object");
    case 64:
      int i24 = paramInt1 + 1;
      if (paramBoolean)
      {
        this.e[paramInt2] = paramInt1;
        this.f[paramInt2] = i24;
        this.g[paramInt2] = 0;
        return i24;
      }
      this.i = paramInt1;
      this.j = i24;
      this.k = 0;
      this.c = 0;
      return i24;
    case 33:
      int i22 = paramInt1 + 1;
      int i23 = i22 + 1;
      if (paramBoolean)
      {
        this.e[paramInt2] = paramInt1;
        this.f[paramInt2] = i22;
        this.g[paramInt2] = 1;
        return i23;
      }
      this.i = paramInt1;
      this.j = i22;
      this.k = 1;
      this.c = 1;
      return i23;
    case 35:
      int i18 = paramInt1 + 1;
      int i19 = this.a.charAt(i18);
      int i20 = i18;
      while (((i19 >= 48) && (i19 <= 57)) || (i19 == 45))
      {
        i20++;
        if (i20 >= this.b)
          break;
        i19 = this.a.charAt(i20);
      }
      int i21 = i20 - i18;
      if (paramBoolean)
      {
        this.e[paramInt2] = paramInt1;
        this.f[paramInt2] = i18;
        this.g[paramInt2] = i21;
        return i20;
      }
      this.i = paramInt1;
      this.j = i18;
      this.k = i21;
      this.c = 1;
      return i20;
    case 126:
      int i14 = paramInt1 + 1;
      int i15 = this.a.charAt(i14);
      int i16 = i14;
      while (((i15 >= 48) && (i15 <= 57)) || (i15 == 45) || (i15 == 46))
      {
        i16++;
        if (i16 >= this.b)
          break;
        i15 = this.a.charAt(i16);
      }
      int i17 = i16 - i14;
      if (paramBoolean)
      {
        this.e[paramInt2] = paramInt1;
        this.f[paramInt2] = i14;
        this.g[paramInt2] = i17;
        return i16;
      }
      this.i = paramInt1;
      this.j = i14;
      this.k = i17;
      this.c = 1;
      return i16;
    case 40:
    case 91:
    case 123:
    }
    int i10;
    for (int i9 = paramInt1 + 1; ; i9 = i10)
    {
      String str2 = this.a;
      i10 = i9 + 1;
      int i11 = str2.charAt(i9);
      if ((i11 >= 48) && (i11 <= 57))
      {
        m = -48 + (i11 + m * 10);
        if (i10 < this.b);
      }
      else
      {
        int i12 = this.a.offsetByCodePoints(i10, m) - i10;
        int i13 = i10 + i12;
        if (paramBoolean)
        {
          this.e[paramInt2] = paramInt1;
          this.f[paramInt2] = i10;
          this.g[paramInt2] = i12;
          return i13;
        }
        this.i = paramInt1;
        this.j = i10;
        this.k = i12;
        this.c = 1;
        return i13;
        int n = paramInt1 + 1;
        int i1 = 0;
        while (true)
        {
          String str1 = this.a;
          int i2 = n + 1;
          int i3 = str1.charAt(n);
          if ((i3 >= 48) && (i3 <= 57))
          {
            i1 = -48 + (i3 + i1 * 10);
            if (i2 < this.b);
          }
          else
          {
            int i4 = i1;
            if (paramBoolean)
            {
              this.e[paramInt2] = paramInt1;
              this.f[paramInt2] = i2;
              this.h[paramInt2] = new SoftObject(this.a.substring(paramInt1));
              int i8 = paramInt1 + this.h[paramInt2].k;
              this.g[paramInt2] = i8;
              return i8;
            }
            this.i = paramInt1;
            this.j = i2;
            this.c = i4;
            this.d = true;
            this.e = new int[i4];
            this.f = new int[i4];
            this.g = new int[i4];
            this.h = new SoftObject[i4];
            int i5 = 0;
            int i7;
            for (int i6 = i2; i5 < i4; i6 = i7)
            {
              i7 = a(i6, i5, true);
              i5++;
            }
            this.k = i6;
            return i6;
            throw new SoftObject.InvalidTypeException("dictionaries are not supported yet");
          }
          n = i2;
        }
      }
    }
  }

  private boolean f(int paramInt)
  {
    int m = this.j;
    if (this.d)
      m = this.f[paramInt];
    return this.a.charAt(m) == '1';
  }

  private long g(int paramInt)
  {
    int m = this.j;
    int n = m + this.k;
    if (this.d)
    {
      m = this.f[paramInt];
      n = m + this.g[paramInt];
    }
    try
    {
      long l = Long.parseLong(this.a.substring(m, n));
      return l;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    throw new NumberFormatException("Invalid int: " + this.a.substring(m, n) + " - " + paramInt + " (" + m + ", " + n + ") - " + this.a);
  }

  private double h(int paramInt)
  {
    int m;
    if (this.d)
      m = this.f[paramInt];
    for (int n = m + this.g[paramInt]; ; n = m + this.k)
    {
      return Double.parseDouble(this.a.substring(m, n));
      m = this.j;
    }
  }

  private String i(int paramInt)
  {
    int m;
    if (this.d)
      m = this.f[paramInt];
    for (int n = m + this.g[paramInt]; ; n = m + this.k)
    {
      return this.a.substring(m, n);
      m = this.j;
    }
  }

  private int j(int paramInt)
  {
    return this.a.charAt(paramInt);
  }

  public final int a(int paramInt)
  {
    if (this.d)
      return j(this.e[paramInt]);
    return j(this.i);
  }

  public final long b(int paramInt)
  {
    switch (a(paramInt))
    {
    default:
      throw new SoftObject.InvalidTypeException("can't get as number");
    case 33:
      if (f(paramInt))
        return 1L;
      return 0L;
    case 35:
      return g(paramInt);
    case 126:
      return Math.round(h(paramInt));
    case 40:
    }
    return Long.parseLong(i(paramInt));
  }

  public final double c(int paramInt)
  {
    switch (a(paramInt))
    {
    default:
      throw new SoftObject.InvalidTypeException("can't get as float");
    case 33:
      if (f(paramInt))
        return 1.0D;
      return 0.0D;
    case 35:
      return g(paramInt);
    case 126:
      return h(paramInt);
    case 40:
    }
    return Double.parseDouble(i(paramInt));
  }

  public final String d(int paramInt)
  {
    switch (a(paramInt))
    {
    default:
      throw new SoftObject.InvalidTypeException("can't get as string");
    case 64:
      return "null";
    case 33:
      if (f(paramInt))
        return "true";
      return "false";
    case 35:
      return String.valueOf(g(paramInt));
    case 126:
      return String.valueOf(h(paramInt));
    case 40:
    }
    return i(paramInt);
  }

  public final SoftObject e(int paramInt)
  {
    if ((!this.d) || (paramInt >= this.c))
      return null;
    return this.h[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.soft.SoftObject
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
