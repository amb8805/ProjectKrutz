package com.mixpanel.android.a;

public final class a
{
  private static char[] a = new char[64];
  private static byte[] b;

  static
  {
    int i = 65;
    int i6;
    for (int j = 0; i <= 90; j = i6)
    {
      char[] arrayOfChar4 = a;
      i6 = j + 1;
      arrayOfChar4[j] = i;
      i = (char)(i + 1);
    }
    int k = 97;
    while (k <= 122)
    {
      char[] arrayOfChar3 = a;
      int i5 = j + 1;
      arrayOfChar3[j] = k;
      k = (char)(k + 1);
      j = i5;
    }
    int m = 48;
    while (m <= 57)
    {
      char[] arrayOfChar2 = a;
      int i4 = j + 1;
      arrayOfChar2[j] = m;
      m = (char)(m + 1);
      j = i4;
    }
    char[] arrayOfChar1 = a;
    int n = j + 1;
    arrayOfChar1[j] = '+';
    a[n] = '/';
    b = new byte[''];
    int i3;
    for (int i1 = 0; ; i1++)
    {
      int i2 = b.length;
      i3 = 0;
      if (i1 >= i2)
        break;
      b[i1] = -1;
    }
    while (i3 < 64)
    {
      b[a[i3]] = (byte)i3;
      i3++;
    }
  }

  public static String a(String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes();
    return new String(a(arrayOfByte, arrayOfByte.length));
  }

  private static char[] a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = (2 + paramInt * 4) / 3;
    char[] arrayOfChar = new char[4 * ((paramInt + 2) / 3)];
    int j = 0;
    int k = 0;
    if (k < paramInt)
    {
      int m = k + 1;
      int n = 0xFF & paramArrayOfByte[k];
      int i1;
      label72: int i2;
      label94: int i6;
      int i9;
      label181: int i10;
      if (m < paramInt)
      {
        int i12 = m + 1;
        i1 = 0xFF & paramArrayOfByte[m];
        m = i12;
        if (m >= paramInt)
          break label228;
        k = m + 1;
        i2 = 0xFF & paramArrayOfByte[m];
        int i3 = n >>> 2;
        int i4 = (n & 0x3) << 4 | i1 >>> 4;
        int i5 = (i1 & 0xF) << 2 | i2 >>> 6;
        i6 = i2 & 0x3F;
        int i7 = j + 1;
        arrayOfChar[j] = a[i3];
        int i8 = i7 + 1;
        arrayOfChar[i7] = a[i4];
        if (i8 >= i)
          break label238;
        i9 = a[i5];
        arrayOfChar[i8] = i9;
        i10 = i8 + 1;
        if (i10 >= i)
          break label245;
      }
      label228: label238: label245: for (int i11 = a[i6]; ; i11 = 61)
      {
        arrayOfChar[i10] = i11;
        j = i10 + 1;
        break;
        i1 = 0;
        break label72;
        k = m;
        i2 = 0;
        break label94;
        i9 = 61;
        break label181;
      }
    }
    return arrayOfChar;
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
