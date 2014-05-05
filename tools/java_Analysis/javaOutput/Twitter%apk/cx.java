import java.util.Arrays;

public final class cx
{
  private static cx a = new cx();
  private cx b;
  private boolean c;
  private boolean d;
  private String[] e;
  private eb[] f;
  private int g;
  private int h;
  private int i;
  private boolean j;

  private cx()
  {
    this.d = true;
    this.c = true;
    this.j = true;
    a(64);
  }

  private cx(cx paramcx, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString, eb[] paramArrayOfeb, int paramInt)
  {
    this.b = paramcx;
    this.d = paramBoolean1;
    this.c = paramBoolean2;
    this.e = paramArrayOfString;
    this.f = paramArrayOfeb;
    this.g = paramInt;
    int k = paramArrayOfString.length;
    this.h = (k - (k >> 2));
    this.i = (k - 1);
    this.j = false;
  }

  private static int a(String paramString)
  {
    int k = paramString.charAt(0);
    int m = paramString.length();
    int n = k;
    for (int i1 = 1; i1 < m; i1++)
      n = n * 31 + paramString.charAt(i1);
    return n;
  }

  private static int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int k = paramArrayOfChar[0];
    for (int m = 1; m < paramInt2; m++)
      k = k * 31 + paramArrayOfChar[m];
    return k;
  }

  public static cx a()
  {
    cx localcx = a;
    return new cx(null, true, true, localcx.e, localcx.f, localcx.g);
  }

  private void a(int paramInt)
  {
    this.e = new String[64];
    this.f = new eb[32];
    this.i = 63;
    this.g = 0;
    this.h = 48;
  }

  private void a(cx paramcx)
  {
    try
    {
      if (paramcx.g > 12000)
        a(64);
      while (true)
      {
        this.j = false;
        do
          return;
        while (paramcx.g <= this.g);
        this.e = paramcx.e;
        this.f = paramcx.f;
        this.g = paramcx.g;
        this.h = paramcx.h;
        this.i = paramcx.i;
      }
    }
    finally
    {
    }
  }

  private void c()
  {
    int k = this.e.length;
    int m = k + k;
    if (m > 65536)
    {
      this.g = 0;
      Arrays.fill(this.e, null);
      Arrays.fill(this.f, null);
      this.j = true;
    }
    label155: int i4;
    do
    {
      return;
      String[] arrayOfString = this.e;
      eb[] arrayOfeb = this.f;
      this.e = new String[m];
      this.f = new eb[m >> 1];
      this.i = (m - 1);
      this.h += this.h;
      int n = 0;
      int i1 = 0;
      if (n < k)
      {
        String str2 = arrayOfString[n];
        int i8;
        if (str2 != null)
        {
          i1++;
          i8 = a(str2) & this.i;
          if (this.e[i8] != null)
            break label155;
          this.e[i8] = str2;
        }
        while (true)
        {
          n++;
          break;
          int i9 = i8 >> 1;
          this.f[i9] = new eb(str2, this.f[i9]);
        }
      }
      int i2 = k >> 1;
      int i3 = 0;
      int i5;
      for (i4 = i1; i3 < i2; i4 = i5)
      {
        eb localeb1 = arrayOfeb[i3];
        i5 = i4;
        eb localeb2 = localeb1;
        if (localeb2 != null)
        {
          i5++;
          String str1 = localeb2.a();
          int i6 = a(str1) & this.i;
          if (this.e[i6] == null)
            this.e[i6] = str1;
          while (true)
          {
            localeb2 = localeb2.b();
            break;
            int i7 = i6 >> 1;
            this.f[i7] = new eb(str1, this.f[i7]);
          }
        }
        i3++;
      }
    }
    while (i4 == this.g);
    throw new Error("Internal error on SymbolTable.rehash(): had " + this.g + " entries; now have " + i4 + ".");
  }

  public final cx a(boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      cx localcx = new cx(this, paramBoolean1, paramBoolean2, this.e, this.f, this.g);
      return localcx;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String a(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 <= 0)
      return "";
    if (!this.d)
      return new String(paramArrayOfChar, paramInt1, paramInt2);
    int k = paramInt3 & this.i;
    String str1 = this.e[k];
    if (str1 != null)
    {
      if (str1.length() == paramInt2)
      {
        int i2 = 0;
        do
        {
          if (str1.charAt(i2) != paramArrayOfChar[(paramInt1 + i2)])
            break;
          i2++;
        }
        while (i2 < paramInt2);
        if (i2 == paramInt2)
          return str1;
      }
      eb localeb = this.f[(k >> 1)];
      if (localeb != null)
      {
        String str3 = localeb.a(paramArrayOfChar, paramInt1, paramInt2);
        if (str3 != null)
          return str3;
      }
    }
    String str2;
    if (!this.j)
    {
      String[] arrayOfString = this.e;
      int n = arrayOfString.length;
      this.e = new String[n];
      System.arraycopy(arrayOfString, 0, this.e, 0, n);
      eb[] arrayOfeb = this.f;
      int i1 = arrayOfeb.length;
      this.f = new eb[i1];
      System.arraycopy(arrayOfeb, 0, this.f, 0, i1);
      this.j = true;
      this.g = (1 + this.g);
      str2 = new String(paramArrayOfChar, paramInt1, paramInt2);
      if (this.c)
        str2 = g.a.a(str2);
      if (this.e[k] != null)
        break label298;
      this.e[k] = str2;
    }
    while (true)
    {
      return str2;
      if (this.g < this.h)
        break;
      c();
      k = a(paramArrayOfChar, paramInt1, paramInt2) & this.i;
      break;
      label298: int m = k >> 1;
      this.f[m] = new eb(str2, this.f[m]);
    }
  }

  public final void b()
  {
    if (!this.j);
    while (this.b == null)
      return;
    this.b.a(this);
    this.j = false;
  }
}

/* Location:
 * Qualified Name:     cx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
