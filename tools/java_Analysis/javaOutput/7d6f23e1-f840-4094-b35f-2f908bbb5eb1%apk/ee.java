import java.io.InputStream;

public final class ee extends b
{
  private static final int[] r = e.b();
  private static final int[] s = e.a();
  private am t;
  private dv u;
  private int[] v = new int[16];
  private boolean w = false;
  private int x;

  public ee(q paramq, int paramInt1, InputStream paramInputStream, am paramam, dv paramdv, byte[] paramArrayOfByte, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    super(paramq, paramInt1, paramInputStream, paramArrayOfByte, paramInt2, paramInt3, paramBoolean);
    this.t = paramam;
    this.u = paramdv;
    if (!au.h.a(paramInt1))
      l();
  }

  private final cp a(char[] paramArrayOfChar, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    int i = 0;
    int k;
    char[] arrayOfChar1;
    int j;
    int i17;
    label50: int n;
    int m;
    if (paramInt2 == 46)
    {
      int i15 = paramInt1 + 1;
      paramArrayOfChar[paramInt1] = (char)paramInt2;
      k = i15;
      arrayOfChar1 = paramArrayOfChar;
      j = paramInt2;
      if ((this.c >= this.d) && (!a()))
      {
        i17 = 1;
        if (i == 0)
          a(j, "Decimal point not followed by a digit");
        int i19 = i17;
        n = i;
        m = i19;
      }
    }
    while (true)
    {
      int i1;
      int i3;
      int i4;
      label203: int i7;
      int i8;
      char[] arrayOfChar2;
      int i9;
      label274: int i13;
      int i12;
      int i11;
      if ((j == 101) || (j == 69))
      {
        if (k >= arrayOfChar1.length)
        {
          arrayOfChar1 = this.m.k();
          k = 0;
        }
        i1 = k + 1;
        arrayOfChar1[k] = (char)j;
        if (this.c >= this.d)
          o();
        byte[] arrayOfByte1 = this.a;
        int i2 = this.c;
        this.c = (i2 + 1);
        i3 = 0xFF & arrayOfByte1[i2];
        if ((i3 == 45) || (i3 == 43))
          if (i1 >= arrayOfChar1.length)
          {
            arrayOfChar1 = this.m.k();
            i4 = 0;
            int i5 = i4 + 1;
            arrayOfChar1[i4] = (char)i3;
            if (this.c >= this.d)
              o();
            byte[] arrayOfByte2 = this.a;
            int i6 = this.c;
            this.c = (i6 + 1);
            i7 = 0xFF & arrayOfByte2[i6];
            i8 = 0;
            arrayOfChar2 = arrayOfChar1;
            i9 = i5;
            if ((i7 <= 57) && (i7 >= 48))
            {
              i8++;
              if (i9 >= arrayOfChar2.length)
              {
                arrayOfChar2 = this.m.k();
                i9 = 0;
              }
              i13 = i9 + 1;
              arrayOfChar2[i9] = (char)i7;
              if ((this.c >= this.d) && (!a()))
              {
                i9 = i13;
                i12 = i8;
                i11 = 1;
                label354: if (i12 == 0)
                  a(i7, "Exponent indicator not followed by a digit");
                k = i9;
              }
            }
          }
      }
      while (true)
      {
        if (i11 == 0)
          this.c -= 1;
        this.m.a(k);
        return b(paramBoolean, paramInt3, n, i12);
        byte[] arrayOfByte4 = this.a;
        int i16 = this.c;
        this.c = (i16 + 1);
        j = 0xFF & arrayOfByte4[i16];
        i17 = 0;
        if (j < 48)
          break label50;
        i17 = 0;
        if (j > 57)
          break label50;
        i++;
        if (k >= arrayOfChar1.length)
        {
          arrayOfChar1 = this.m.k();
          k = 0;
        }
        int i18 = k + 1;
        arrayOfChar1[k] = (char)j;
        k = i18;
        break;
        byte[] arrayOfByte3 = this.a;
        int i14 = this.c;
        this.c = (i14 + 1);
        i7 = 0xFF & arrayOfByte3[i14];
        i9 = i13;
        break label274;
        int i10 = i8;
        i11 = m;
        i12 = i10;
        break label354;
        i4 = i1;
        break label203;
        i7 = i3;
        arrayOfChar2 = arrayOfChar1;
        i9 = i1;
        i8 = 0;
        break label274;
        i11 = m;
        i12 = 0;
      }
      j = paramInt2;
      k = paramInt1;
      arrayOfChar1 = paramArrayOfChar;
      m = 0;
      n = 0;
    }
  }

  private final cp a(char[] paramArrayOfChar, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i = paramInt2;
    int j = paramInt1;
    char[] arrayOfChar = paramArrayOfChar;
    if ((this.c >= this.d) && (!a()))
    {
      this.m.a(j);
      return a(paramBoolean, i);
    }
    byte[] arrayOfByte = this.a;
    int k = this.c;
    this.c = (k + 1);
    int m = 0xFF & arrayOfByte[k];
    if ((m > 57) || (m < 48))
    {
      if ((m == 46) || (m == 101) || (m == 69))
        return a(arrayOfChar, j, m, paramBoolean, i);
    }
    else
    {
      if (j < arrayOfChar.length)
        break label192;
      arrayOfChar = this.m.k();
    }
    label192: for (int n = 0; ; n = j)
    {
      j = n + 1;
      arrayOfChar[n] = (char)m;
      i++;
      break;
      this.c -= 1;
      this.m.a(j);
      return a(paramBoolean, i);
    }
  }

  private final cs a(int paramInt1, int paramInt2)
  {
    cs localcs = this.u.a(paramInt1);
    if (localcs != null)
      return localcs;
    this.v[0] = paramInt1;
    return a(this.v, 1, paramInt2);
  }

  private final cs a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a(this.v, 0, paramInt1, paramInt2, paramInt3);
  }

  private final cs a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.v[0] = paramInt1;
    return a(this.v, 1, paramInt2, paramInt3, paramInt4);
  }

  private final cs a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = paramInt2 + ((paramInt1 << 2) - 4);
    int j;
    int k;
    Object localObject1;
    int m;
    label53: int n;
    int i1;
    int i7;
    int i6;
    label116: int i9;
    int i10;
    int i12;
    int i4;
    label315: int i3;
    Object localObject2;
    int i2;
    if (paramInt2 < 4)
    {
      j = paramArrayOfInt[(paramInt1 - 1)];
      paramArrayOfInt[(paramInt1 - 1)] = (j << (4 - paramInt2 << 3));
      char[] arrayOfChar = this.m.i();
      k = 0;
      localObject1 = arrayOfChar;
      m = 0;
      if (m >= i)
        break label506;
      n = 0xFF & paramArrayOfInt[(m >> 2)] >> (3 - (m & 0x3) << 3);
      i1 = m + 1;
      if (n <= 127)
        break label574;
      if ((n & 0xE0) != 192)
        break label440;
      i7 = n & 0x1F;
      i6 = 1;
      if (i1 + i6 > i)
        b(" in field name");
      int i8 = paramArrayOfInt[(i1 >> 2)] >> (3 - (i1 & 0x3) << 3);
      i9 = i1 + 1;
      if ((i8 & 0xC0) != 128)
        n(i8);
      i10 = i7 << 6 | i8 & 0x3F;
      if (i6 <= 1)
        break label559;
      int i15 = paramArrayOfInt[(i9 >> 2)] >> (3 - (i9 & 0x3) << 3);
      i9++;
      if ((i15 & 0xC0) != 128)
        n(i15);
      i10 = i10 << 6 | i15 & 0x3F;
      if (i6 <= 2)
        break label559;
      int i16 = paramArrayOfInt[(i9 >> 2)] >> (3 - (i9 & 0x3) << 3);
      int i17 = i9 + 1;
      if ((i16 & 0xC0) != 128)
        n(i16 & 0xFF);
      int i18 = i10 << 6 | i16 & 0x3F;
      i12 = i17;
      i4 = i18;
      if (i6 <= 2)
        break label544;
      int i13 = i4 - 65536;
      if (k >= localObject1.length)
        localObject1 = this.m.l();
      int i14 = k + 1;
      localObject1[k] = (char)(55296 + (i13 >> 10));
      i4 = 0xDC00 | i13 & 0x3FF;
      i3 = i12;
      localObject2 = localObject1;
      i2 = i14;
    }
    while (true)
    {
      if (i2 >= localObject2.length)
        localObject2 = this.m.l();
      int i5 = i2 + 1;
      localObject2[i2] = (char)i4;
      m = i3;
      localObject1 = localObject2;
      k = i5;
      break label53;
      j = 0;
      break;
      label440: if ((n & 0xF0) == 224)
      {
        i7 = n & 0xF;
        i6 = 2;
        break label116;
      }
      if ((n & 0xF8) == 240)
      {
        i7 = n & 0x7;
        i6 = 3;
        break label116;
      }
      m(n);
      i6 = 1;
      i7 = i6;
      break label116;
      label506: String str = new String((char[])localObject1, 0, k);
      if (paramInt2 < 4)
        paramArrayOfInt[(paramInt1 - 1)] = j;
      return this.u.a(str, paramArrayOfInt, paramInt1);
      label544: localObject2 = localObject1;
      i2 = k;
      i3 = i12;
      continue;
      label559: int i11 = i10;
      i12 = i9;
      i4 = i11;
      break label315;
      label574: localObject2 = localObject1;
      i2 = k;
      i3 = i1;
      i4 = n;
    }
  }

  private final cs a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    int[] arrayOfInt;
    if (paramInt1 >= paramArrayOfInt.length)
    {
      arrayOfInt = a(paramArrayOfInt, paramArrayOfInt.length);
      this.v = arrayOfInt;
    }
    while (true)
    {
      int i = paramInt1 + 1;
      arrayOfInt[paramInt1] = paramInt2;
      cs localcs = this.u.a(arrayOfInt, i);
      if (localcs == null)
        return a(arrayOfInt, i, paramInt3);
      return localcs;
      arrayOfInt = paramArrayOfInt;
    }
  }

  private cs a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int[] arrayOfInt = s;
    int i = paramInt4;
    int j = paramInt3;
    int k = paramInt2;
    int m = paramInt1;
    Object localObject1 = paramArrayOfInt;
    label52: Object localObject7;
    if (arrayOfInt[j] != 0)
    {
      if (j == 34)
        break label425;
      if (j == 92)
        break label256;
      c(j, "name");
      if (j > 127)
        if (i >= 4)
        {
          if (m < localObject1.length)
            break label539;
          localObject7 = a((int[])localObject1, localObject1.length);
          this.v = ((int[])localObject7);
        }
    }
    while (true)
    {
      int i9 = m + 1;
      localObject7[m] = k;
      k = 0;
      m = i9;
      localObject1 = localObject7;
      i = 0;
      int i1;
      Object localObject3;
      if (j < 2048)
      {
        k = k << 8 | (0xC0 | j >> 6);
        i++;
        j = 0x80 | j & 0x3F;
        if (i >= 4)
          break label374;
        i++;
        j |= k << 8;
        i1 = m;
        localObject3 = localObject1;
        if ((this.c >= this.d) && (!a()))
          b(" in field name");
        byte[] arrayOfByte = this.a;
        int i2 = this.c;
        this.c = (i2 + 1);
        int i3 = 0xFF & arrayOfByte[i2];
        localObject1 = localObject3;
        m = i1;
        k = j;
        j = i3;
        break;
        label256: j = t();
        break label52;
      }
      int i6 = k << 8 | (0xE0 | j >> 12);
      int i7 = i + 1;
      Object localObject6;
      if (i7 >= 4)
      {
        if (m < localObject1.length)
          break label532;
        localObject6 = a((int[])localObject1, localObject1.length);
        this.v = ((int[])localObject6);
      }
      while (true)
      {
        int i8 = m + 1;
        localObject6[m] = i6;
        i6 = 0;
        m = i8;
        localObject1 = localObject6;
        i7 = 0;
        k = i6 << 8 | (0x80 | 0x3F & j >> 6);
        i = i7 + 1;
        break;
        label374: Object localObject2;
        if (m >= localObject1.length)
        {
          localObject2 = a((int[])localObject1, localObject1.length);
          this.v = ((int[])localObject2);
        }
        while (true)
        {
          int n = m + 1;
          localObject2[m] = k;
          localObject3 = localObject2;
          i = 1;
          i1 = n;
          break;
          label425: Object localObject5;
          Object localObject4;
          int i4;
          if (i > 0)
            if (m >= localObject1.length)
            {
              localObject5 = a((int[])localObject1, localObject1.length);
              this.v = ((int[])localObject5);
              int i5 = m + 1;
              localObject5[m] = k;
              localObject4 = localObject5;
              i4 = i5;
            }
          while (true)
          {
            cs localcs = this.u.a(localObject4, i4);
            if (localcs == null)
              return a(localObject4, i4, i);
            return localcs;
            localObject5 = localObject1;
            break;
            i4 = m;
            localObject4 = localObject1;
          }
          localObject2 = localObject1;
        }
        label532: localObject6 = localObject1;
      }
      label539: localObject7 = localObject1;
    }
  }

  private void a(cp paramcp)
  {
    byte[] arrayOfByte1 = paramcp.b();
    int i = 1;
    int j = arrayOfByte1.length;
    while (i < j)
    {
      if (this.c >= this.d)
        o();
      if (arrayOfByte1[i] != this.a[this.c])
      {
        StringBuilder localStringBuilder = new StringBuilder(paramcp.a().substring(0, i));
        while ((this.c < this.d) || (a()))
        {
          byte[] arrayOfByte2 = this.a;
          int k = this.c;
          this.c = (k + 1);
          char c = (char)g(arrayOfByte2[k]);
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

  private static int[] a(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt == null)
      return new int[paramInt];
    int i = paramArrayOfInt.length;
    int[] arrayOfInt = new int[i + paramInt];
    System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, i);
    return arrayOfInt;
  }

  private final cs b(int paramInt1, int paramInt2, int paramInt3)
  {
    cs localcs = this.u.a(paramInt1, paramInt2);
    if (localcs != null)
      return localcs;
    this.v[0] = paramInt1;
    this.v[1] = paramInt2;
    return a(this.v, 2, paramInt3);
  }

  private void b(int paramInt1, int paramInt2)
  {
    this.c = paramInt2;
    n(paramInt1);
  }

  private cp c(int paramInt)
  {
    char[] arrayOfChar = this.m.i();
    boolean bool;
    int j;
    int i;
    if (paramInt == 45)
    {
      bool = true;
      if (!bool)
        break label373;
      j = 0 + 1;
      arrayOfChar[0] = '-';
      if (this.c >= this.d)
        o();
      byte[] arrayOfByte2 = this.a;
      int i5 = this.c;
      this.c = (i5 + 1);
      i = 0xFF & arrayOfByte2[i5];
      if ((i < 48) || (i > 57))
        a("Missing integer part (next char " + b(i) + ")");
    }
    while (true)
    {
      if ((i == 48) && ((this.c < this.d) || (a())) && (this.a[this.c] == 0))
        a("Leading zeroes not allowed");
      int k = j + 1;
      arrayOfChar[j] = (char)i;
      int m = this.c + arrayOfChar.length;
      int n;
      int i1;
      if (m > this.d)
      {
        m = this.d;
        n = 1;
        i1 = k;
      }
      while (true)
      {
        if (this.c >= m)
        {
          return a(arrayOfChar, i1, bool, n);
          bool = false;
          break;
        }
        byte[] arrayOfByte1 = this.a;
        int i2 = this.c;
        this.c = (i2 + 1);
        int i3 = 0xFF & arrayOfByte1[i2];
        if ((i3 >= 48) && (i3 <= 57))
        {
          n++;
          int i4 = i1 + 1;
          arrayOfChar[i1] = (char)i3;
          i1 = i4;
        }
        else
        {
          if ((i3 == 46) || (i3 == 101) || (i3 == 69))
            return a(arrayOfChar, i1, i3, bool, n);
          this.c -= 1;
          this.m.a(i1);
          return a(bool, n);
          n = 1;
          i1 = k;
        }
      }
      label373: i = paramInt;
      j = 0;
    }
  }

  private cs d(int paramInt)
  {
    int[] arrayOfInt1 = s;
    int i = 2;
    int j = paramInt;
    while (true)
    {
      if (this.d - this.c < 4)
        return a(this.v, i, 0, j, 0);
      byte[] arrayOfByte1 = this.a;
      int k = this.c;
      this.c = (k + 1);
      int m = 0xFF & arrayOfByte1[k];
      if (arrayOfInt1[m] != 0)
      {
        if (m == 34)
          return a(this.v, i, j, 1);
        return a(this.v, i, j, m, 1);
      }
      int n = m | j << 8;
      byte[] arrayOfByte2 = this.a;
      int i1 = this.c;
      this.c = (i1 + 1);
      int i2 = 0xFF & arrayOfByte2[i1];
      if (arrayOfInt1[i2] != 0)
      {
        if (i2 == 34)
          return a(this.v, i, n, 2);
        return a(this.v, i, n, i2, 2);
      }
      int i3 = i2 | n << 8;
      byte[] arrayOfByte3 = this.a;
      int i4 = this.c;
      this.c = (i4 + 1);
      int i5 = 0xFF & arrayOfByte3[i4];
      if (arrayOfInt1[i5] != 0)
      {
        if (i5 == 34)
          return a(this.v, i, i3, 3);
        return a(this.v, i, i3, i5, 3);
      }
      int i6 = i5 | i3 << 8;
      byte[] arrayOfByte4 = this.a;
      int i7 = this.c;
      this.c = (i7 + 1);
      j = 0xFF & arrayOfByte4[i7];
      if (arrayOfInt1[j] != 0)
      {
        if (j == 34)
          return a(this.v, i, i6, 4);
        return a(this.v, i, i6, j, 4);
      }
      if (i >= this.v.length)
        this.v = a(this.v, i);
      int[] arrayOfInt2 = this.v;
      int i8 = i + 1;
      arrayOfInt2[i] = i6;
      i = i8;
    }
  }

  private cs e(int paramInt)
  {
    int i5;
    Object localObject5;
    int i6;
    int i7;
    int i8;
    label147: Object localObject9;
    if ((paramInt == 39) && (a(au.d)))
    {
      if ((this.c >= this.d) && (!a()))
        b(": was expecting closing ''' for name");
      byte[] arrayOfByte1 = this.a;
      int i3 = this.c;
      this.c = (i3 + 1);
      int i4 = 0xFF & arrayOfByte1[i3];
      if (i4 == 39)
        return dv.c();
      int[] arrayOfInt3 = this.v;
      int[] arrayOfInt4 = s;
      i5 = 0;
      localObject5 = arrayOfInt3;
      i6 = i4;
      i7 = 0;
      i8 = 0;
      if (i6 != 39)
        if ((i6 != 34) && (arrayOfInt4[i6] != 0))
        {
          if (i6 == 92)
            break label327;
          c(i6, "name");
          if (i6 > 127)
            if (i8 >= 4)
            {
              if (i5 < localObject5.length)
                break label901;
              localObject9 = a((int[])localObject5, localObject5.length);
            }
        }
    }
    label901: for (this.v = ((int[])localObject9); ; localObject9 = localObject5)
    {
      int i16 = i5 + 1;
      localObject9[i5] = i7;
      i7 = 0;
      i5 = i16;
      localObject5 = localObject9;
      i8 = 0;
      if (i6 < 2048)
      {
        i7 = i7 << 8 | (0xC0 | i6 >> 6);
        i8++;
        i6 = 0x80 | i6 & 0x3F;
        if (i8 >= 4)
          break label445;
        i8++;
        i7 = i6 | i7 << 8;
        if ((this.c >= this.d) && (!a()))
          b(" in field name");
        byte[] arrayOfByte2 = this.a;
        int i12 = this.c;
        this.c = (i12 + 1);
        i6 = 0xFF & arrayOfByte2[i12];
        break;
        label327: i6 = t();
        break label147;
      }
      int i13 = i7 << 8 | (0xE0 | i6 >> 12);
      int i14 = i8 + 1;
      Object localObject8;
      if (i14 >= 4)
      {
        if (i5 < localObject5.length)
          break label894;
        localObject8 = a((int[])localObject5, localObject5.length);
        this.v = ((int[])localObject8);
      }
      while (true)
      {
        int i15 = i5 + 1;
        localObject8[i5] = i13;
        i13 = 0;
        i5 = i15;
        localObject5 = localObject8;
        i14 = 0;
        i7 = i13 << 8 | (0x80 | 0x3F & i6 >> 6);
        i8 = i14 + 1;
        break;
        label445: Object localObject7;
        if (i5 >= localObject5.length)
        {
          localObject7 = a((int[])localObject5, localObject5.length);
          this.v = ((int[])localObject7);
        }
        while (true)
        {
          int i11 = i5 + 1;
          localObject7[i5] = i7;
          i7 = i6;
          i5 = i11;
          localObject5 = localObject7;
          i8 = 1;
          break;
          Object localObject6;
          int i9;
          if (i8 > 0)
            if (i5 >= localObject5.length)
            {
              localObject6 = a((int[])localObject5, localObject5.length);
              this.v = ((int[])localObject6);
              int i10 = i5 + 1;
              localObject6[i5] = i7;
              i9 = i10;
            }
          while (true)
          {
            cs localcs = this.u.a((int[])localObject6, i9);
            int i;
            int j;
            Object localObject1;
            int k;
            int m;
            Object localObject2;
            if (localcs == null)
            {
              return a((int[])localObject6, i9, i8);
              if (!a(au.c))
                b(paramInt, "was expecting double-quote to start field name");
              int[] arrayOfInt1 = e.d();
              if (arrayOfInt1[paramInt] != 0)
                b(paramInt, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
              int[] arrayOfInt2 = this.v;
              i = 0;
              j = 0;
              localObject1 = arrayOfInt2;
              k = paramInt;
              m = 0;
              while (m < 4)
              {
                m++;
                i = k | i << 8;
                if ((this.c >= this.d) && (!a()))
                  b(" in field name");
                k = 0xFF & this.a[this.c];
                if (arrayOfInt1[k] != 0)
                  break label762;
                this.c = (1 + this.c);
              }
              if (j < localObject1.length)
                break label862;
              localObject2 = a((int[])localObject1, localObject1.length);
              this.v = ((int[])localObject2);
            }
            while (true)
            {
              int n = j + 1;
              localObject2[j] = i;
              i = k;
              j = n;
              localObject1 = localObject2;
              m = 1;
              break;
              label762: Object localObject4;
              Object localObject3;
              int i1;
              if (m > 0)
                if (j >= localObject1.length)
                {
                  localObject4 = a((int[])localObject1, localObject1.length);
                  this.v = ((int[])localObject4);
                  int i2 = j + 1;
                  localObject4[j] = i;
                  localObject3 = localObject4;
                  i1 = i2;
                }
              while (true)
              {
                localcs = this.u.a(localObject3, i1);
                if (localcs == null)
                  return a(localObject3, i1, m);
                return localcs;
                localObject4 = localObject1;
                break;
                i1 = j;
                localObject3 = localObject1;
              }
              label862: localObject2 = localObject1;
            }
            localObject6 = localObject5;
            break;
            i9 = i5;
            localObject6 = localObject5;
          }
          localObject7 = localObject5;
        }
        label894: localObject8 = localObject5;
      }
    }
  }

  private cp f(int paramInt)
  {
    if ((paramInt != 39) || (!a(au.d)))
      b(paramInt, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
    char[] arrayOfChar = this.m.i();
    int[] arrayOfInt = r;
    byte[] arrayOfByte = this.a;
    int i = 0;
    if (this.c >= this.d)
      o();
    if (i >= arrayOfChar.length)
    {
      arrayOfChar = this.m.k();
      i = 0;
    }
    int j = this.d;
    int k = this.c + (arrayOfChar.length - i);
    int m;
    int n;
    if (k < j)
    {
      m = i;
      n = k;
    }
    while (true)
    {
      int i2;
      if (this.c < n)
      {
        int i1 = this.c;
        this.c = (i1 + 1);
        i2 = 0xFF & arrayOfByte[i1];
        if ((i2 != 39) && (arrayOfInt[i2] == 0))
        {
          int i19 = m + 1;
          arrayOfChar[m] = (char)i2;
          m = i19;
        }
      }
      else
      {
        i = m;
        break;
        label249: int i9;
        int i8;
        int i3;
        int i4;
        if (i2 != 39)
        {
          switch (arrayOfInt[i2])
          {
          default:
            if (i2 < 32)
              c(i2, "string value");
            l(i2);
            i9 = m;
            i8 = i2;
          case 1:
          case 2:
          case 3:
            while (true)
            {
              if (i9 >= arrayOfChar.length)
              {
                arrayOfChar = this.m.k();
                i9 = 0;
              }
              int i10 = i9 + 1;
              arrayOfChar[i9] = (char)i8;
              i = i10;
              break;
              if (i2 == 34)
                break label249;
              int i17 = t();
              int i18 = m;
              i8 = i17;
              i9 = i18;
              continue;
              int i15 = h(i2);
              int i16 = m;
              i8 = i15;
              i9 = i16;
              continue;
              if (this.d - this.c >= 2)
              {
                int i13 = j(i2);
                int i14 = m;
                i8 = i13;
                i9 = i14;
              }
              else
              {
                int i11 = i(i2);
                int i12 = m;
                i8 = i11;
                i9 = i12;
              }
            }
          case 4:
          }
          i3 = k(i2);
          i4 = m + 1;
          arrayOfChar[m] = (char)(0xD800 | i3 >> 10);
          if (i4 < arrayOfChar.length)
            break label489;
          arrayOfChar = this.m.k();
        }
        label489: for (int i5 = 0; ; i5 = i4)
        {
          int i6 = 0xDC00 | i3 & 0x3FF;
          int i7 = i5;
          i8 = i6;
          i9 = i7;
          break;
          this.m.a(m);
          return cp.g;
        }
        m = i;
        n = j;
      }
    }
  }

  private int g(int paramInt)
  {
    if (paramInt < 0)
    {
      int i;
      int j;
      if ((paramInt & 0xE0) == 192)
      {
        i = paramInt & 0x1F;
        j = 1;
      }
      while (true)
      {
        int k = w();
        if ((k & 0xC0) != 128)
          n(k & 0xFF);
        int m = i << 6 | k & 0x3F;
        if (j > 1)
        {
          int n = w();
          if ((n & 0xC0) != 128)
            n(n & 0xFF);
          m = m << 6 | n & 0x3F;
          if (j > 2)
          {
            int i1 = w();
            if ((i1 & 0xC0) != 128)
              n(i1 & 0xFF);
            m = m << 6 | i1 & 0x3F;
          }
        }
        return m;
        if ((paramInt & 0xF0) == 224)
        {
          i = paramInt & 0xF;
          j = 2;
        }
        else if ((paramInt & 0xF8) == 240)
        {
          i = paramInt & 0x7;
          j = 3;
        }
        else
        {
          m(paramInt & 0xFF);
          i = paramInt;
          j = 1;
        }
      }
    }
    return paramInt;
  }

  private final int h(int paramInt)
  {
    if (this.c >= this.d)
      o();
    byte[] arrayOfByte = this.a;
    int i = this.c;
    this.c = (i + 1);
    int j = arrayOfByte[i];
    if ((j & 0xC0) != 128)
      b(j & 0xFF, this.c);
    return (paramInt & 0x1F) << 6 | j & 0x3F;
  }

  private final int i(int paramInt)
  {
    if (this.c >= this.d)
      o();
    int i = paramInt & 0xF;
    byte[] arrayOfByte1 = this.a;
    int j = this.c;
    this.c = (j + 1);
    int k = arrayOfByte1[j];
    if ((k & 0xC0) != 128)
      b(k & 0xFF, this.c);
    int m = i << 6 | k & 0x3F;
    if (this.c >= this.d)
      o();
    byte[] arrayOfByte2 = this.a;
    int n = this.c;
    this.c = (n + 1);
    int i1 = arrayOfByte2[n];
    if ((i1 & 0xC0) != 128)
      b(i1 & 0xFF, this.c);
    return m << 6 | i1 & 0x3F;
  }

  private final int j(int paramInt)
  {
    int i = paramInt & 0xF;
    byte[] arrayOfByte1 = this.a;
    int j = this.c;
    this.c = (j + 1);
    int k = arrayOfByte1[j];
    if ((k & 0xC0) != 128)
      b(k & 0xFF, this.c);
    int m = i << 6 | k & 0x3F;
    byte[] arrayOfByte2 = this.a;
    int n = this.c;
    this.c = (n + 1);
    int i1 = arrayOfByte2[n];
    if ((i1 & 0xC0) != 128)
      b(i1 & 0xFF, this.c);
    return m << 6 | i1 & 0x3F;
  }

  private final int k(int paramInt)
  {
    if (this.c >= this.d)
      o();
    byte[] arrayOfByte1 = this.a;
    int i = this.c;
    this.c = (i + 1);
    int j = arrayOfByte1[i];
    if ((j & 0xC0) != 128)
      b(j & 0xFF, this.c);
    int k = (paramInt & 0x7) << 6 | j & 0x3F;
    if (this.c >= this.d)
      o();
    byte[] arrayOfByte2 = this.a;
    int m = this.c;
    this.c = (m + 1);
    int n = arrayOfByte2[m];
    if ((n & 0xC0) != 128)
      b(n & 0xFF, this.c);
    int i1 = k << 6 | n & 0x3F;
    if (this.c >= this.d)
      o();
    byte[] arrayOfByte3 = this.a;
    int i2 = this.c;
    this.c = (i2 + 1);
    int i3 = arrayOfByte3[i2];
    if ((i3 & 0xC0) != 128)
      b(i3 & 0xFF, this.c);
    return (i1 << 6 | i3 & 0x3F) - 65536;
  }

  private void l(int paramInt)
  {
    if (paramInt < 32)
      a(paramInt);
    m(paramInt);
  }

  private void m(int paramInt)
  {
    c("Invalid UTF-8 start byte 0x" + Integer.toHexString(paramInt));
  }

  private void n(int paramInt)
  {
    c("Invalid UTF-8 middle byte 0x" + Integer.toHexString(paramInt));
  }

  private final int r()
  {
    while ((this.c < this.d) || (a()))
    {
      byte[] arrayOfByte = this.a;
      int i = this.c;
      this.c = (i + 1);
      int j = 0xFF & arrayOfByte[i];
      if (j > 32)
      {
        if (j != 47)
          return j;
        s();
      }
      else if (j != 32)
      {
        if (j == 10)
          v();
        else if (j == 13)
          u();
        else if (j != 9)
          a(j);
      }
    }
    throw d("Unexpected end-of-input within/between " + this.k.d() + " entries");
  }

  private final void s()
  {
    if (!a(au.b))
      b(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
    if ((this.c >= this.d) && (!a()))
      b(" in a comment");
    byte[] arrayOfByte1 = this.a;
    int i = this.c;
    this.c = (i + 1);
    int j = 0xFF & arrayOfByte1[i];
    if (j == 47)
    {
      int[] arrayOfInt2 = e.e();
      while ((this.c < this.d) || (a()))
      {
        byte[] arrayOfByte3 = this.a;
        int i1 = this.c;
        this.c = (i1 + 1);
        int i2 = 0xFF & arrayOfByte3[i1];
        int i3 = arrayOfInt2[i2];
        if (i3 != 0)
          switch (i3)
          {
          case 42:
          default:
            l(i2);
            break;
          case 10:
            v();
          case 13:
          }
      }
      return;
      u();
      return;
    }
    if (j == 42)
    {
      int[] arrayOfInt1 = e.e();
      while ((this.c < this.d) || (a()))
      {
        byte[] arrayOfByte2 = this.a;
        int k = this.c;
        this.c = (k + 1);
        int m = 0xFF & arrayOfByte2[k];
        int n = arrayOfInt1[m];
        if (n != 0)
          switch (n)
          {
          default:
            l(m);
            break;
          case 42:
            if (this.a[this.c] == 47)
            {
              this.c = (1 + this.c);
              return;
            }
          case 10:
            v();
            break;
          case 13:
            u();
          }
      }
      b(" in a comment");
      return;
    }
    b(j, "was expecting either '*' or '/' for a comment");
  }

  private char t()
  {
    if ((this.c >= this.d) && (!a()))
      b(" in character escape sequence");
    byte[] arrayOfByte1 = this.a;
    int i = this.c;
    this.c = (i + 1);
    int j = arrayOfByte1[i];
    switch (j)
    {
    default:
      return a((char)g(j));
    case 98:
      return '\b';
    case 116:
      return '\t';
    case 110:
      return '\n';
    case 102:
      return '\f';
    case 114:
      return '\r';
    case 34:
    case 47:
    case 92:
      return (char)j;
    case 117:
    }
    int k = 0;
    int m = 0;
    while (k < 4)
    {
      if ((this.c >= this.d) && (!a()))
        b(" in character escape sequence");
      byte[] arrayOfByte2 = this.a;
      int n = this.c;
      this.c = (n + 1);
      int i1 = arrayOfByte2[n];
      int i2 = e.a(i1);
      if (i2 < 0)
        b(i1, "expected a hex-digit for character escape sequence");
      m = i2 | m << 4;
      k++;
    }
    return (char)m;
  }

  private void u()
  {
    if (((this.c < this.d) || (a())) && (this.a[this.c] == 10))
      this.c = (1 + this.c);
    this.f = (1 + this.f);
    this.g = this.c;
  }

  private void v()
  {
    this.f = (1 + this.f);
    this.g = this.c;
  }

  private int w()
  {
    if (this.c >= this.d)
      o();
    byte[] arrayOfByte = this.a;
    int i = this.c;
    this.c = (i + 1);
    return 0xFF & arrayOfByte[i];
  }

  public final void close()
  {
    super.close();
    this.u.b();
  }

  public final cp g()
  {
    if (this.q == cp.e)
    {
      this.n = false;
      cp localcp12 = this.l;
      this.l = null;
      if (localcp12 == cp.c)
        this.k = this.k.a(this.i, this.j);
      while (true)
      {
        this.q = localcp12;
        return localcp12;
        if (localcp12 == cp.a)
          this.k = this.k.b(this.i, this.j);
      }
    }
    int[] arrayOfInt2;
    byte[] arrayOfByte8;
    int i26;
    int i27;
    int i28;
    int i29;
    if (this.w)
    {
      this.w = false;
      arrayOfInt2 = r;
      arrayOfByte8 = this.a;
      i26 = this.c;
      i27 = this.d;
      if (i26 < i27)
        break label2563;
      o();
      int i42 = this.c;
      int i43 = this.d;
      i28 = i42;
      i29 = i43;
    }
    while (true)
    {
      int i30;
      int i31;
      if (i28 < i29)
      {
        i30 = i28 + 1;
        i31 = 0xFF & arrayOfByte8[i28];
        if (arrayOfInt2[i31] == 0)
          break label2556;
        this.c = i30;
        if (i31 == 34);
      }
      else
      {
        switch (arrayOfInt2[i31])
        {
        default:
          if (i31 < 32)
          {
            c(i31, "string value");
            break;
            this.c = i28;
          }
          break;
        case 1:
          t();
          break;
        case 2:
          if (this.c >= this.d)
            o();
          byte[] arrayOfByte13 = this.a;
          int i40 = this.c;
          this.c = (i40 + 1);
          int i41 = arrayOfByte13[i40];
          if ((i41 & 0xC0) == 128)
            break;
          b(i41 & 0xFF, this.c);
          break;
        case 3:
          if (this.c >= this.d)
            o();
          byte[] arrayOfByte11 = this.a;
          int i36 = this.c;
          this.c = (i36 + 1);
          int i37 = arrayOfByte11[i36];
          if ((i37 & 0xC0) != 128)
            b(i37 & 0xFF, this.c);
          if (this.c >= this.d)
            o();
          byte[] arrayOfByte12 = this.a;
          int i38 = this.c;
          this.c = (i38 + 1);
          int i39 = arrayOfByte12[i38];
          if ((i39 & 0xC0) == 128)
            break;
          b(i39 & 0xFF, this.c);
          break;
        case 4:
          if (this.c >= this.d)
            o();
          byte[] arrayOfByte9 = this.a;
          int i32 = this.c;
          this.c = (i32 + 1);
          int i33 = arrayOfByte9[i32];
          if ((i33 & 0xC0) != 128)
            b(i33 & 0xFF, this.c);
          if (this.c >= this.d)
            o();
          if ((i33 & 0xC0) != 128)
            b(i33 & 0xFF, this.c);
          if (this.c >= this.d)
            o();
          byte[] arrayOfByte10 = this.a;
          int i34 = this.c;
          this.c = (i34 + 1);
          int i35 = arrayOfByte10[i34];
          if ((i35 & 0xC0) == 128)
            break;
          b(i35 & 0xFF, this.c);
          break;
          l(i31);
          break;
        }
      }
      int j;
      do
      {
        s();
        if ((this.c >= this.d) && (!a()))
          break label794;
        byte[] arrayOfByte1 = this.a;
        int i = this.c;
        this.c = (i + 1);
        j = 0xFF & arrayOfByte1[i];
        if (j <= 32)
          break;
      }
      while (j == 47);
      while (true)
      {
        if (j >= 0)
          break label803;
        close();
        this.q = null;
        return null;
        if (j == 32)
          break;
        if (j == 10)
        {
          v();
          break;
        }
        if (j == 13)
        {
          u();
          break;
        }
        if (j == 9)
          break;
        a(j);
        break;
        label794: i();
        j = -1;
      }
      label803: this.h = (this.e + this.c - 1L);
      this.i = this.f;
      this.j = (this.c - this.g - 1);
      this.o = null;
      if (j == 93)
      {
        if (!this.k.a())
          a(j, (char)'}');
        this.k = this.k.g();
        cp localcp11 = cp.d;
        this.q = localcp11;
        return localcp11;
      }
      if (j == 125)
      {
        if (!this.k.c())
          a(j, (char)']');
        this.k = this.k.g();
        cp localcp10 = cp.b;
        this.q = localcp10;
        return localcp10;
      }
      if (this.k.h())
      {
        if (j != 44)
          b(j, "was expecting comma to separate " + this.k.d() + " entries");
        j = r();
      }
      if (!this.k.c())
      {
        if (j == 34)
        {
          this.w = true;
          cp localcp9 = cp.g;
          this.q = localcp9;
          return localcp9;
        }
        switch (j)
        {
        default:
          cp localcp8 = f(j);
          this.q = localcp8;
          return localcp8;
        case 91:
          this.k = this.k.a(this.i, this.j);
          cp localcp7 = cp.c;
          this.q = localcp7;
          return localcp7;
        case 123:
          this.k = this.k.b(this.i, this.j);
          cp localcp6 = cp.a;
          this.q = localcp6;
          return localcp6;
        case 93:
        case 125:
          b(j, "expected a value");
        case 116:
          a(cp.j);
          cp localcp5 = cp.j;
          this.q = localcp5;
          return localcp5;
        case 102:
          a(cp.k);
          cp localcp4 = cp.k;
          this.q = localcp4;
          return localcp4;
        case 110:
          a(cp.l);
          cp localcp3 = cp.l;
          this.q = localcp3;
          return localcp3;
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
        cp localcp2 = c(j);
        this.q = localcp2;
        return localcp2;
      }
      cs localcs;
      if (j != 34)
        localcs = e(j);
      int i1;
      while (true)
      {
        this.k.a(localcs.b());
        this.q = cp.e;
        int n = r();
        if (n != 58)
          b(n, "was expecting a colon to separate field name and value");
        i1 = r();
        if (i1 != 34)
          break;
        this.w = true;
        this.l = cp.g;
        return this.q;
        if (9 + this.c > this.d)
        {
          if ((this.c >= this.d) && (!a()))
            b(": was expecting closing '\"' for name");
          byte[] arrayOfByte7 = this.a;
          int i24 = this.c;
          this.c = (i24 + 1);
          int i25 = 0xFF & arrayOfByte7[i24];
          if (i25 == 34)
            localcs = dv.c();
          else
            localcs = a(this.v, 0, 0, i25, 0);
        }
        else
        {
          byte[] arrayOfByte2 = this.a;
          int[] arrayOfInt1 = s;
          int k = this.c;
          this.c = (k + 1);
          int m = 0xFF & arrayOfByte2[k];
          if (arrayOfInt1[m] == 0)
          {
            int i2 = this.c;
            this.c = (i2 + 1);
            int i3 = 0xFF & arrayOfByte2[i2];
            if (arrayOfInt1[i3] == 0)
            {
              int i4 = i3 | m << 8;
              int i5 = this.c;
              this.c = (i5 + 1);
              int i6 = 0xFF & arrayOfByte2[i5];
              if (arrayOfInt1[i6] == 0)
              {
                int i7 = i6 | i4 << 8;
                int i8 = this.c;
                this.c = (i8 + 1);
                int i9 = 0xFF & arrayOfByte2[i8];
                if (arrayOfInt1[i9] == 0)
                {
                  int i10 = i9 | i7 << 8;
                  int i11 = this.c;
                  this.c = (i11 + 1);
                  int i12 = 0xFF & arrayOfByte2[i11];
                  if (arrayOfInt1[i12] == 0)
                  {
                    this.x = i10;
                    byte[] arrayOfByte3 = this.a;
                    int i13 = this.c;
                    this.c = (i13 + 1);
                    int i14 = 0xFF & arrayOfByte3[i13];
                    if (arrayOfInt1[i14] != 0)
                    {
                      if (i14 == 34)
                        localcs = b(this.x, i12, 1);
                      else
                        localcs = a(this.x, i12, i14, 1);
                    }
                    else
                    {
                      int i15 = i14 | i12 << 8;
                      byte[] arrayOfByte4 = this.a;
                      int i16 = this.c;
                      this.c = (i16 + 1);
                      int i17 = 0xFF & arrayOfByte4[i16];
                      if (arrayOfInt1[i17] != 0)
                      {
                        if (i17 == 34)
                          localcs = b(this.x, i15, 2);
                        else
                          localcs = a(this.x, i15, i17, 2);
                      }
                      else
                      {
                        int i18 = i17 | i15 << 8;
                        byte[] arrayOfByte5 = this.a;
                        int i19 = this.c;
                        this.c = (i19 + 1);
                        int i20 = 0xFF & arrayOfByte5[i19];
                        if (arrayOfInt1[i20] != 0)
                        {
                          if (i20 == 34)
                            localcs = b(this.x, i18, 3);
                          else
                            localcs = a(this.x, i18, i20, 3);
                        }
                        else
                        {
                          int i21 = i20 | i18 << 8;
                          byte[] arrayOfByte6 = this.a;
                          int i22 = this.c;
                          this.c = (i22 + 1);
                          int i23 = 0xFF & arrayOfByte6[i22];
                          if (arrayOfInt1[i23] != 0)
                          {
                            if (i23 == 34)
                              localcs = b(this.x, i21, 4);
                            else
                              localcs = a(this.x, i21, i23, 4);
                          }
                          else
                          {
                            this.v[0] = this.x;
                            this.v[1] = i21;
                            localcs = d(i23);
                          }
                        }
                      }
                    }
                  }
                  else if (i12 == 34)
                  {
                    localcs = a(i10, 4);
                  }
                  else
                  {
                    localcs = a(i10, i12, 4);
                  }
                }
                else if (i9 == 34)
                {
                  localcs = a(i7, 3);
                }
                else
                {
                  localcs = a(i7, i9, 3);
                }
              }
              else if (i6 == 34)
              {
                localcs = a(i4, 2);
              }
              else
              {
                localcs = a(i4, i6, 2);
              }
            }
            else if (i3 == 34)
            {
              localcs = a(m, 1);
            }
            else
            {
              localcs = a(m, i3, 1);
            }
          }
          else if (m == 34)
          {
            localcs = dv.c();
          }
          else
          {
            localcs = a(0, m, 0);
          }
        }
      }
      cp localcp1;
      switch (i1)
      {
      default:
        localcp1 = f(i1);
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
      while (true)
      {
        this.l = localcp1;
        return this.q;
        localcp1 = cp.c;
        continue;
        localcp1 = cp.a;
        continue;
        b(i1, "expected a value");
        a(cp.j);
        localcp1 = cp.j;
        continue;
        a(cp.k);
        localcp1 = cp.k;
        continue;
        a(cp.l);
        localcp1 = cp.l;
        continue;
        localcp1 = c(i1);
      }
      label2556: i28 = i30;
      continue;
      label2563: i28 = i26;
      i29 = i27;
    }
  }

  public final String j()
  {
    cp localcp = this.q;
    Object localObject1;
    int k;
    int m;
    int i18;
    if (localcp == cp.g)
      if (this.w)
      {
        this.w = false;
        int i = this.c;
        if (i >= this.d)
        {
          o();
          i = this.c;
        }
        localObject1 = this.m.i();
        int[] arrayOfInt1 = r;
        int j = Math.min(this.d, i + localObject1.length);
        byte[] arrayOfByte1 = this.a;
        k = i;
        m = 0;
        if (k >= j)
          break label169;
        i18 = 0xFF & arrayOfByte1[k];
        if (arrayOfInt1[i18] == 0)
          break label146;
        if (i18 != 34)
          break label169;
        this.c = (k + 1);
      }
    for (ee localee = this; ; localee = this)
    {
      localee.m.a(m);
      return this.m.e();
      label146: k++;
      int i19 = m + 1;
      localObject1[m] = (char)i18;
      m = i19;
      break;
      label169: this.c = k;
      int[] arrayOfInt2 = r;
      byte[] arrayOfByte2 = this.a;
      int n = this.c;
      if (n >= this.d)
      {
        o();
        n = this.c;
      }
      if (m >= localObject1.length)
      {
        localObject1 = this.m.k();
        m = 0;
      }
      int i1 = Math.min(this.d, n + (localObject1.length - m));
      int i2 = n;
      int i3 = m;
      int i4 = i2;
      label258: int i5;
      int i6;
      if (i4 < i1)
      {
        i5 = i4 + 1;
        i6 = 0xFF & arrayOfByte2[i4];
        if (arrayOfInt2[i6] != 0)
        {
          this.c = i5;
          if (i6 == 34)
            break label703;
        }
      }
      Object localObject2;
      int i8;
      int i9;
      switch (arrayOfInt2[i6])
      {
      default:
        if (i6 < 32)
        {
          c(i6, "string value");
          int i17 = i3;
          localObject2 = localObject1;
          i10 = i17;
        }
      case 1:
      case 2:
      case 3:
        while (true)
        {
          if (i10 >= localObject2.length)
          {
            localObject2 = this.m.k();
            i10 = 0;
          }
          int i11 = i10 + 1;
          localObject2[i10] = (char)i6;
          m = i11;
          localObject1 = localObject2;
          break;
          int i7 = i3 + 1;
          localObject1[i3] = (char)i6;
          i4 = i5;
          i3 = i7;
          break label258;
          this.c = i4;
          m = i3;
          break;
          i6 = t();
          int i15 = i3;
          localObject2 = localObject1;
          i10 = i15;
          continue;
          i6 = h(i6);
          int i14 = i3;
          localObject2 = localObject1;
          i10 = i14;
          continue;
          if (this.d - this.c >= 2)
          {
            i6 = j(i6);
            int i13 = i3;
            localObject2 = localObject1;
            i10 = i13;
          }
          else
          {
            i6 = i(i6);
            int i12 = i3;
            localObject2 = localObject1;
            i10 = i12;
          }
        }
      case 4:
        i8 = k(i6);
        i9 = i3 + 1;
        localObject1[i3] = (char)(0xD800 | i8 >> 10);
        if (i9 >= localObject1.length)
          localObject2 = this.m.k();
      }
      for (int i10 = 0; ; i10 = i9)
      {
        i6 = 0xDC00 | i8 & 0x3FF;
        break;
        l(i6);
        int i16 = i3;
        localObject2 = localObject1;
        i10 = i16;
        break;
        if (localcp == null)
          return null;
        switch (av.a[localcp.ordinal()])
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
        localObject2 = localObject1;
      }
      label703: m = i3;
    }
  }
}

/* Location:
 * Qualified Name:     ee
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
