final class eb
{
  private final String a;
  private final eb b;

  public eb(String paramString, eb parameb)
  {
    this.a = paramString;
    this.b = parameb;
  }

  public final String a()
  {
    return this.a;
  }

  public final String a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    String str1 = this.a;
    eb localeb1 = this.b;
    String str2 = str1;
    for (eb localeb2 = localeb1; ; localeb2 = localeb2.b)
    {
      if (str2.length() == paramInt2)
      {
        int i = 0;
        do
        {
          if (str2.charAt(i) != paramArrayOfChar[(paramInt1 + i)])
            break;
          i++;
        }
        while (i < paramInt2);
        if (i == paramInt2)
          return str2;
      }
      if (localeb2 == null)
        break;
      str2 = localeb2.a;
    }
    return null;
  }

  public final eb b()
  {
    return this.b;
  }
}

/* Location:
 * Qualified Name:     eb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
