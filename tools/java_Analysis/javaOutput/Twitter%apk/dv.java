import java.util.Arrays;

public final class dv
{
  private dv a;
  private boolean b;
  private int c;
  private int d;
  private int[] e;
  private cs[] f;
  private aj[] g;
  private int h;
  private int i;
  private transient boolean j;
  private boolean k;
  private boolean l;
  private boolean m;

  private dv(int paramInt, boolean paramBoolean)
  {
    this.a = null;
    this.b = true;
    b(64);
  }

  private dv(dv paramdv, boolean paramBoolean)
  {
    this.a = paramdv;
    this.b = paramBoolean;
    this.c = paramdv.c;
    this.d = paramdv.d;
    this.e = paramdv.e;
    this.f = paramdv.f;
    this.g = paramdv.g;
    this.h = paramdv.h;
    this.i = paramdv.i;
    this.j = false;
    this.k = true;
    this.l = true;
    this.m = true;
  }

  public static dv a()
  {
    return new dv(64, true);
  }

  private void a(dv paramdv)
  {
    try
    {
      int n = paramdv.c;
      int i1 = this.c;
      if (n <= i1);
      while (true)
      {
        return;
        if (paramdv.c <= 6000)
          break;
        b(64);
      }
    }
    finally
    {
    }
    while (true)
    {
      this.c = paramdv.c;
      this.e = paramdv.e;
      this.f = paramdv.f;
      this.k = true;
      this.l = true;
      this.d = paramdv.d;
      this.g = paramdv.g;
      this.h = paramdv.h;
      this.i = paramdv.i;
    }
  }

  private static int b(int[] paramArrayOfInt, int paramInt)
  {
    int n = paramArrayOfInt[0];
    for (int i1 = 1; i1 < paramInt; i1++)
      n = n * 31 + paramArrayOfInt[i1];
    int i2 = n ^ n >>> 16;
    return i2 ^ i2 >>> 8;
  }

  private void b(int paramInt)
  {
    this.c = 0;
    this.e = new int[64];
    this.f = new cs[64];
    this.k = false;
    this.l = false;
    this.d = 63;
    this.m = true;
    this.g = null;
    this.i = 0;
    this.j = false;
  }

  public static cs c()
  {
    return v.a();
  }

  private int d()
  {
    aj[] arrayOfaj = this.g;
    int n = -1;
    int i1 = this.i;
    int i2 = 2147483647;
    for (int i3 = 0; i3 < i1; i3++)
    {
      int i4 = arrayOfaj[i3].a();
      if (i4 < i2)
      {
        if (i4 == 1)
          return i3;
        n = i3;
        i2 = i4;
      }
    }
    return n;
  }

  private void e()
  {
    aj[] arrayOfaj = this.g;
    int n = arrayOfaj.length;
    this.g = new aj[n + n];
    System.arraycopy(arrayOfaj, 0, this.g, 0, n);
  }

  public final cs a(int paramInt)
  {
    int n = paramInt ^ paramInt >>> 16;
    int i1 = n ^ n >>> 8;
    int i2 = i1 & this.d;
    int i3 = this.e[i2];
    if ((i1 ^ i3 >> 8) << 8 == 0)
    {
      cs localcs = this.f[i2];
      if (localcs == null)
        return null;
      if (localcs.a(paramInt))
        return localcs;
    }
    else if (i3 == 0)
    {
      return null;
    }
    int i4 = i3 & 0xFF;
    if (i4 > 0)
    {
      int i5 = i4 - 1;
      aj localaj = this.g[i5];
      if (localaj != null)
        return localaj.a(i1, paramInt, 0);
    }
    return null;
  }

  public final cs a(int paramInt1, int paramInt2)
  {
    int n = paramInt2 + paramInt1 * 31;
    int i1 = n ^ n >>> 16;
    int i2 = i1 ^ i1 >>> 8;
    int i3 = i2 & this.d;
    int i4 = this.e[i3];
    if ((i2 ^ i4 >> 8) << 8 == 0)
    {
      cs localcs = this.f[i3];
      if (localcs == null)
        return null;
      if (localcs.a(paramInt1, paramInt2))
        return localcs;
    }
    else if (i4 == 0)
    {
      return null;
    }
    int i5 = i4 & 0xFF;
    if (i5 > 0)
    {
      int i6 = i5 - 1;
      aj localaj = this.g[i6];
      if (localaj != null)
        return localaj.a(i2, paramInt1, paramInt2);
    }
    return null;
  }

  public final cs a(String paramString, int[] paramArrayOfInt, int paramInt)
  {
    if (this.b);
    for (String str = g.a.a(paramString); ; str = paramString)
    {
      int n = b(paramArrayOfInt, paramInt);
      if (paramInt < 4);
      int[] arrayOfInt1;
      int i1;
      Object localObject;
      int i11;
      int i12;
      label224: int i2;
      int i7;
      switch (paramInt)
      {
      default:
        arrayOfInt1 = new int[paramInt];
        i1 = 0;
      case 1:
        while (true)
          if (i1 < paramInt)
          {
            arrayOfInt1[i1] = paramArrayOfInt[i1];
            i1++;
            continue;
            localObject = new v(str, n, paramArrayOfInt[0]);
            if (this.k)
            {
              int[] arrayOfInt2 = this.e;
              int i26 = this.e.length;
              this.e = new int[i26];
              System.arraycopy(arrayOfInt2, 0, this.e, 0, i26);
              this.k = false;
            }
            if (this.j)
            {
              this.j = false;
              this.l = false;
              i11 = this.e.length;
              i12 = i11 + i11;
              if (i12 <= 65536)
                break label433;
              this.c = 0;
              Arrays.fill(this.e, 0);
              Arrays.fill(this.f, null);
              Arrays.fill(this.g, null);
              this.h = 0;
              this.i = 0;
            }
            this.c = (1 + this.c);
            i2 = n & this.d;
            if (this.f[i2] != null)
              break label879;
            this.e[i2] = (n << 8);
            if (this.l)
            {
              cs[] arrayOfcs1 = this.f;
              int i10 = arrayOfcs1.length;
              this.f = new cs[i10];
              System.arraycopy(arrayOfcs1, 0, this.f, 0, i10);
              this.l = false;
            }
            this.f[i2] = localObject;
            int i6 = this.e.length;
            if (this.c > i6 >> 1)
            {
              i7 = i6 >> 2;
              if (this.c <= i6 - i7)
                break label1079;
              this.j = true;
            }
          }
      case 2:
      case 3:
      }
      label433: label750: label879: 
      while (this.h < i7)
      {
        return localObject;
        localObject = new w(str, n, paramArrayOfInt[0], paramArrayOfInt[1]);
        break;
        localObject = new x(str, n, paramArrayOfInt[0], paramArrayOfInt[1], paramArrayOfInt[2]);
        break;
        r localr = new r(str, n, arrayOfInt1, paramInt);
        localObject = localr;
        break;
        this.e = new int[i12];
        this.d = (i12 - 1);
        cs[] arrayOfcs2 = this.f;
        this.f = new cs[i12];
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++)
        {
          cs localcs2 = arrayOfcs2[i14];
          if (localcs2 != null)
          {
            i13++;
            int i24 = localcs2.hashCode();
            int i25 = i24 & this.d;
            this.f[i25] = localcs2;
            this.e[i25] = (i24 << 8);
          }
        }
        int i15 = this.i;
        if (i15 == 0)
          break label224;
        this.h = 0;
        this.i = 0;
        this.m = false;
        aj[] arrayOfaj2 = this.g;
        this.g = new aj[arrayOfaj2.length];
        int i16 = 0;
        while (i16 < i15)
        {
          aj localaj1 = arrayOfaj2[i16];
          int i17 = i13;
          aj localaj2 = localaj1;
          while (localaj2 != null)
          {
            i17++;
            cs localcs1 = localaj2.a;
            int i18 = localcs1.hashCode();
            int i19 = i18 & this.d;
            int i20 = this.e[i19];
            if (this.f[i19] == null)
            {
              this.e[i19] = (i18 << 8);
              this.f[i19] = localcs1;
              localaj2 = localaj2.b;
            }
            else
            {
              this.h = (1 + this.h);
              int i21 = i20 & 0xFF;
              int i22;
              if (i21 == 0)
                if (this.i <= 254)
                {
                  i22 = this.i;
                  this.i = (1 + this.i);
                  int i23 = this.g.length;
                  if (i22 >= i23)
                    e();
                  this.e[i19] = (i20 & 0xFFFFFF00 | i22 + 1);
                }
              while (true)
              {
                aj[] arrayOfaj3 = this.g;
                aj localaj3 = new aj(localcs1, this.g[i22]);
                arrayOfaj3[i22] = localaj3;
                break;
                i22 = d();
                break label750;
                i22 = i21 - 1;
              }
            }
          }
          i16++;
          i13 = i17;
        }
        if (i13 == this.c)
          break label224;
        throw new RuntimeException("Internal error: count after rehash " + i13 + "; should be " + this.c);
        aj[] arrayOfaj1;
        int i4;
        int i8;
        if (this.m)
        {
          arrayOfaj1 = this.g;
          if (arrayOfaj1 == null)
          {
            this.g = new aj[32];
            this.m = false;
          }
        }
        else
        {
          this.h = (1 + this.h);
          int i3 = this.e[i2];
          i4 = i3 & 0xFF;
          if (i4 != 0)
            break label1070;
          if (this.i > 254)
            break label1061;
          i8 = this.i;
          this.i = (1 + this.i);
          if (i8 >= this.g.length)
            e();
          this.e[i2] = (i3 & 0xFFFFFF00 | i8 + 1);
        }
        for (int i5 = i8; ; i5 = i4 - 1)
        {
          this.g[i5] = new aj((cs)localObject, this.g[i5]);
          break;
          int i9 = arrayOfaj1.length;
          this.g = new aj[i9];
          System.arraycopy(arrayOfaj1, 0, this.g, 0, i9);
          break label906;
          i8 = d();
          break label983;
        }
      }
      label906: label983: this.j = true;
      label1061: label1070: label1079: return localObject;
    }
  }

  public final cs a(int[] paramArrayOfInt, int paramInt)
  {
    int n = b(paramArrayOfInt, paramInt);
    int i1 = n & this.d;
    int i2 = this.e[i1];
    if ((n ^ i2 >> 8) << 8 == 0)
    {
      cs localcs = this.f[i1];
      if ((localcs == null) || (localcs.a(paramArrayOfInt, paramInt)))
        return localcs;
    }
    else if (i2 == 0)
    {
      return null;
    }
    int i3 = i2 & 0xFF;
    if (i3 > 0)
    {
      int i4 = i3 - 1;
      aj localaj = this.g[i4];
      if (localaj != null)
        return localaj.a(n, paramArrayOfInt, paramInt);
    }
    return null;
  }

  public final dv a(boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      dv localdv = new dv(this, paramBoolean2);
      return localdv;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void b()
  {
    if (!this.k);
    for (int n = 1; ; n = 0)
    {
      if ((n != 0) && (this.a != null))
      {
        this.a.a(this);
        this.k = true;
        this.l = true;
        this.m = true;
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     dv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
