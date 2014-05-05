public final class dm
{
  private static int a = 1000000;
  private static int b = 1000000000;
  private static long c = 10000000000L;
  private static long d = 1000L;
  private static long e = -2147483648L;
  private static long f = 2147483647L;
  private static String g = String.valueOf(-9223372036854775808L);
  private static char[] h = new char[4000];
  private static char[] i = new char[4000];
  private static byte[] j;
  private static String[] k = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
  private static String[] l = { "-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10" };

  static
  {
    int m = 0;
    int i4;
    for (int n = 0; m < 10; n = i4)
    {
      int i2 = (char)(m + 48);
      int i3;
      int i5;
      if (m == 0)
      {
        i3 = 0;
        i4 = n;
        i5 = 0;
      }
      while (true)
      {
        if (i5 >= 10)
          break label224;
        int i6 = (char)(i5 + 48);
        if ((m == 0) && (i5 == 0));
        int i8;
        for (int i7 = 0; ; i7 = i6)
        {
          i8 = i4;
          for (int i9 = 0; i9 < 10; i9++)
          {
            int i10 = (char)(i9 + 48);
            h[i8] = i3;
            h[(i8 + 1)] = i7;
            h[(i8 + 2)] = i10;
            i[i8] = i2;
            i[(i8 + 1)] = i6;
            i[(i8 + 2)] = i10;
            i8 += 4;
          }
          i3 = i2;
          break;
        }
        i5++;
        i4 = i8;
      }
      label224: m++;
    }
    j = new byte[4000];
    for (int i1 = 0; i1 < 4000; i1++)
      j[i1] = (byte)i[i1];
  }

  public dm()
  {
  }

  public static int a(int paramInt1, char[] paramArrayOfChar, int paramInt2)
  {
    int m;
    if (paramInt1 < 0)
    {
      if (paramInt1 == -2147483648)
        return a(paramInt1, paramArrayOfChar, paramInt2);
      m = paramInt2 + 1;
      paramArrayOfChar[paramInt2] = '-';
    }
    for (int n = -paramInt1; ; n = paramInt1)
    {
      if (n < a)
      {
        if (n < 1000)
        {
          if (n < 10)
          {
            int i10 = m + 1;
            paramArrayOfChar[m] = (char)(n + 48);
            return i10;
          }
          return b(n, paramArrayOfChar, m);
        }
        int i9 = n / 1000;
        return c(n - i9 * 1000, paramArrayOfChar, b(i9, paramArrayOfChar, m));
      }
      int i1;
      label161: int i3;
      int i4;
      int i5;
      if (n >= b)
      {
        i1 = 1;
        if (i1 != 0)
        {
          n -= b;
          if (n < b)
            break label234;
          n -= b;
          int i8 = m + 1;
          paramArrayOfChar[m] = '2';
          m = i8;
        }
        int i2 = n / 1000;
        i3 = n - i2 * 1000;
        i4 = i2 / 1000;
        i5 = i2 - i4 * 1000;
        if (i1 == 0)
          break label250;
      }
      label234: label250: for (int i6 = c(i4, paramArrayOfChar, m); ; i6 = b(i4, paramArrayOfChar, m))
      {
        return c(i3, paramArrayOfChar, c(i5, paramArrayOfChar, i6));
        i1 = 0;
        break;
        int i7 = m + 1;
        paramArrayOfChar[m] = '1';
        m = i7;
        break label161;
      }
      m = paramInt2;
    }
  }

  public static int a(long paramLong, char[] paramArrayOfChar, int paramInt)
  {
    int m;
    if (paramLong < 0L)
    {
      if (paramLong > e)
        return a((int)paramLong, paramArrayOfChar, paramInt);
      if (paramLong == -9223372036854775808L)
      {
        int i7 = g.length();
        g.getChars(0, i7, paramArrayOfChar, paramInt);
        return i7 + paramInt;
      }
      m = paramInt + 1;
      paramArrayOfChar[paramInt] = '-';
    }
    for (long l1 = -paramLong; ; l1 = paramLong)
    {
      long l2 = c;
      int n = 10;
      long l3 = l2;
      while ((l1 >= l3) && (n != 19))
      {
        n++;
        l3 = (l3 << 3) + (l3 << 1);
        continue;
        if (paramLong > f)
          break label255;
        return a((int)paramLong, paramArrayOfChar, paramInt);
      }
      int i1 = m + n;
      long l4 = l1;
      int i2 = i1;
      while (l4 > f)
      {
        i2 -= 3;
        long l5 = l4 / d;
        c((int)(l4 - l5 * d), paramArrayOfChar, i2);
        l4 = l5;
      }
      int i3 = (int)l4;
      int i4 = i2;
      int i6;
      for (int i5 = i3; i5 >= 1000; i5 = i6)
      {
        i4 -= 3;
        i6 = i5 / 1000;
        c(i5 - i6 * 1000, paramArrayOfChar, i4);
      }
      b(i5, paramArrayOfChar, m);
      return i1;
      label255: m = paramInt;
    }
  }

  private static int b(int paramInt1, char[] paramArrayOfChar, int paramInt2)
  {
    int m = paramInt1 << 2;
    char[] arrayOfChar1 = h;
    int n = m + 1;
    int i1 = arrayOfChar1[m];
    int i7;
    if (i1 != 0)
    {
      i7 = paramInt2 + 1;
      paramArrayOfChar[paramInt2] = i1;
    }
    for (int i2 = i7; ; i2 = paramInt2)
    {
      char[] arrayOfChar2 = h;
      int i3 = n + 1;
      int i4 = arrayOfChar2[n];
      if (i4 != 0)
      {
        int i6 = i2 + 1;
        paramArrayOfChar[i2] = i4;
        i2 = i6;
      }
      int i5 = i2 + 1;
      paramArrayOfChar[i2] = h[i3];
      return i5;
    }
  }

  private static int c(int paramInt1, char[] paramArrayOfChar, int paramInt2)
  {
    int m = paramInt1 << 2;
    int n = paramInt2 + 1;
    char[] arrayOfChar1 = i;
    int i1 = m + 1;
    paramArrayOfChar[paramInt2] = arrayOfChar1[m];
    int i2 = n + 1;
    char[] arrayOfChar2 = i;
    int i3 = i1 + 1;
    paramArrayOfChar[n] = arrayOfChar2[i1];
    int i4 = i2 + 1;
    paramArrayOfChar[i2] = i[i3];
    return i4;
  }
}

/* Location:
 * Qualified Name:     dm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
