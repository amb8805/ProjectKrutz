public final class dj
{
  private static String a = String.valueOf(-9223372036854775808L).substring(1);
  private static String b = String.valueOf(9223372036854775807L);

  public dj()
  {
  }

  public static final int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfChar[paramInt1] - '0';
    int j = paramInt2 + paramInt1;
    int k = paramInt1 + 1;
    if (k < j)
    {
      i = i * 10 + (paramArrayOfChar[k] - '0');
      int m = k + 1;
      if (m < j)
      {
        i = i * 10 + (paramArrayOfChar[m] - '0');
        int n = m + 1;
        if (n < j)
        {
          i = i * 10 + (paramArrayOfChar[n] - '0');
          int i1 = n + 1;
          if (i1 < j)
          {
            i = i * 10 + (paramArrayOfChar[i1] - '0');
            int i2 = i1 + 1;
            if (i2 < j)
            {
              i = i * 10 + (paramArrayOfChar[i2] - '0');
              int i3 = i2 + 1;
              if (i3 < j)
              {
                i = i * 10 + (paramArrayOfChar[i3] - '0');
                int i4 = i3 + 1;
                if (i4 < j)
                {
                  i = i * 10 + (paramArrayOfChar[i4] - '0');
                  int i5 = i4 + 1;
                  if (i5 < j)
                    i = i * 10 + (paramArrayOfChar[i5] - '0');
                }
              }
            }
          }
        }
      }
    }
    return i;
  }

  public static final boolean a(char[] paramArrayOfChar, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean);
    int i;
    for (String str = a; ; str = b)
    {
      i = str.length();
      if (paramInt2 >= i)
        break;
      return true;
    }
    if (paramInt2 > i)
      return false;
    for (int j = 0; j < i; j++)
      if (paramArrayOfChar[(paramInt1 + j)] > str.charAt(j))
        return false;
    return true;
  }

  public static final long b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = paramInt2 - 9;
    return 1000000000L * a(paramArrayOfChar, paramInt1, i) + a(paramArrayOfChar, i + paramInt1, 9);
  }
}

/* Location:
 * Qualified Name:     dj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
