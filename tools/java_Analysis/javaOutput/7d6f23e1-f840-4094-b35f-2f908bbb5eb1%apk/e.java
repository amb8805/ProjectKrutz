import java.util.Arrays;

public final class e
{
  private static final char[] a;
  private static final byte[] b;
  private static int[] c;
  private static int[] d;
  private static int[] e;
  private static int[] f;
  private static int[] g;
  private static int[] h;
  private static int[] i;

  static
  {
    char[] arrayOfChar = "0123456789ABCDEF".toCharArray();
    a = arrayOfChar;
    int j = arrayOfChar.length;
    b = new byte[j];
    for (int k = 0; k < j; k++)
      b[k] = (byte)a[k];
    int[] arrayOfInt1 = new int[256];
    for (int m = 0; m < 32; m++)
      arrayOfInt1[m] = -1;
    arrayOfInt1[34] = 1;
    arrayOfInt1[92] = 1;
    c = arrayOfInt1;
    int[] arrayOfInt2 = new int[arrayOfInt1.length];
    System.arraycopy(c, 0, arrayOfInt2, 0, c.length);
    int n = 128;
    if (n < 256)
    {
      int i5;
      if ((n & 0xE0) == 192)
        i5 = 2;
      while (true)
      {
        arrayOfInt2[n] = i5;
        n++;
        break;
        if ((n & 0xF0) == 224)
          i5 = 3;
        else if ((n & 0xF8) == 240)
          i5 = 4;
        else
          i5 = -1;
      }
    }
    d = arrayOfInt2;
    int[] arrayOfInt3 = new int[256];
    Arrays.fill(arrayOfInt3, -1);
    for (int i1 = 33; i1 < 256; i1++)
      if (Character.isJavaIdentifierPart((char)i1))
        arrayOfInt3[i1] = 0;
    arrayOfInt3[64] = 0;
    arrayOfInt3[35] = 0;
    arrayOfInt3[42] = 0;
    arrayOfInt3[45] = 0;
    arrayOfInt3[43] = 0;
    e = arrayOfInt3;
    int[] arrayOfInt4 = new int[256];
    System.arraycopy(e, 0, arrayOfInt4, 0, e.length);
    Arrays.fill(arrayOfInt4, 128, 128, 0);
    f = arrayOfInt4;
    g = new int[256];
    System.arraycopy(d, 128, g, 128, 128);
    Arrays.fill(g, 0, 32, -1);
    g[9] = 0;
    g[10] = 10;
    g[13] = 13;
    g[42] = 42;
    int[] arrayOfInt5 = new int[256];
    for (int i2 = 0; i2 < 32; i2++)
      arrayOfInt5[i2] = (-(i2 + 1));
    arrayOfInt5[34] = 34;
    arrayOfInt5[92] = 92;
    arrayOfInt5[8] = 98;
    arrayOfInt5[9] = 116;
    arrayOfInt5[12] = 102;
    arrayOfInt5[10] = 110;
    arrayOfInt5[13] = 114;
    h = arrayOfInt5;
    int[] arrayOfInt6 = new int[''];
    i = arrayOfInt6;
    Arrays.fill(arrayOfInt6, -1);
    for (int i3 = 0; i3 < 10; i3++)
      i[(i3 + 48)] = i3;
    for (int i4 = 0; i4 < 6; i4++)
    {
      i[(i4 + 97)] = (i4 + 10);
      i[(i4 + 65)] = (i4 + 10);
    }
  }

  public e()
  {
  }

  public static int a(int paramInt)
  {
    if (paramInt > 127)
      return -1;
    return i[paramInt];
  }

  public static void a(StringBuilder paramStringBuilder, String paramString)
  {
    int[] arrayOfInt = h;
    int j = arrayOfInt.length;
    int k = 0;
    int m = paramString.length();
    if (k < m)
    {
      int n = paramString.charAt(k);
      if ((n >= j) || (arrayOfInt[n] == 0))
        paramStringBuilder.append(n);
      while (true)
      {
        k++;
        break;
        paramStringBuilder.append((char)'\\');
        int i1 = arrayOfInt[n];
        if (i1 < 0)
        {
          paramStringBuilder.append((char)'u');
          paramStringBuilder.append((char)'0');
          paramStringBuilder.append((char)'0');
          int i2 = -(i1 + 1);
          paramStringBuilder.append(a[(i2 >> 4)]);
          paramStringBuilder.append(a[(i2 & 0xF)]);
        }
        else
        {
          paramStringBuilder.append((char)i1);
        }
      }
    }
  }

  public static final int[] a()
  {
    return c;
  }

  public static final int[] b()
  {
    return d;
  }

  public static final int[] c()
  {
    return e;
  }

  public static final int[] d()
  {
    return f;
  }

  public static final int[] e()
  {
    return g;
  }

  public static final int[] f()
  {
    return h;
  }

  public static char[] g()
  {
    return (char[])a.clone();
  }
}

/* Location:
 * Qualified Name:     e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
