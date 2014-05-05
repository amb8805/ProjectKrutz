public abstract class cm
{
  private static final ThreadLocal a = new ax();

  public cm()
  {
  }

  private static final char[] a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    char[] arrayOfChar = new char[paramInt2];
    if (paramInt1 > 0)
      System.arraycopy(paramArrayOfChar, 0, arrayOfChar, 0, paramInt1);
    return arrayOfChar;
  }

  private static int b(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2)
    {
      int i = paramInt1 + 1;
      int j = paramCharSequence.charAt(paramInt1);
      if ((j < 55296) || (j > 57343))
        return j;
      if (j <= 56319)
      {
        if (i == paramInt2)
          return -j;
        char c = paramCharSequence.charAt(i);
        if (Character.isLowSurrogate(c))
          return Character.toCodePoint(j, c);
        throw new IllegalArgumentException("Expected low surrogate but got char '" + c + "' with value " + c + " at index " + i);
      }
      throw new IllegalArgumentException("Unexpected low surrogate character '" + j + "' with value " + j + " at index " + (i - 1));
    }
    throw new IndexOutOfBoundsException("Index exceeds specified range");
  }

  protected int a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (i < paramInt2)
    {
      int j = b(paramCharSequence, i, paramInt2);
      if ((j >= 0) && (a(j) == null))
      {
        if (Character.isSupplementaryCodePoint(j));
        for (int k = 2; ; k = 1)
        {
          i += k;
          break;
        }
      }
    }
    return i;
  }

  public String a(String paramString)
  {
    int i = paramString.length();
    int j = a(paramString, 0, i);
    if (j == i)
      return paramString;
    return a(paramString, j);
  }

  protected final String a(String paramString, int paramInt)
  {
    int i = paramString.length();
    char[] arrayOfChar1 = (char[])a.get();
    int j = 0;
    Object localObject1 = arrayOfChar1;
    int k = paramInt;
    int m = 0;
    int i3;
    int i4;
    label141: Object localObject3;
    if (k < i)
    {
      i3 = b(paramString, k, i);
      if (i3 < 0)
        throw new IllegalArgumentException("Trailing high surrogate at end of input");
      char[] arrayOfChar2 = a(i3);
      if (arrayOfChar2 == null)
        break label315;
      int i7 = k - m;
      int i8 = j + i7 + arrayOfChar2.length;
      if (localObject1.length < i8)
        localObject1 = a((char[])localObject1, j, 32 + (i8 + (i - k)));
      if (i7 <= 0)
        break label308;
      paramString.getChars(m, k, (char[])localObject1, j);
      i4 = j + i7;
      if (arrayOfChar2.length <= 0)
        break label301;
      System.arraycopy(arrayOfChar2, 0, localObject1, i4, arrayOfChar2.length);
      i4 += arrayOfChar2.length;
      localObject3 = localObject1;
    }
    while (true)
    {
      if (Character.isSupplementaryCodePoint(i3));
      for (int i5 = 2; ; i5 = 1)
      {
        int i6 = i5 + k;
        k = a(paramString, i6, i);
        localObject1 = localObject3;
        j = i4;
        m = i6;
        break;
      }
      int n = i - m;
      int i1;
      if (n > 0)
      {
        int i2 = n + j;
        if (localObject1.length < i2)
          localObject1 = a((char[])localObject1, j, i2);
        paramString.getChars(m, i, (char[])localObject1, j);
        i1 = i2;
      }
      for (Object localObject2 = localObject1; ; localObject2 = localObject1)
      {
        return new String(localObject2, 0, i1);
        i1 = j;
      }
      label301: localObject3 = localObject1;
      continue;
      label308: i4 = j;
      break label141;
      label315: i4 = j;
      localObject3 = localObject1;
    }
  }

  protected abstract char[] a(int paramInt);
}

/* Location:
 * Qualified Name:     cm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
