public final class r extends cs
{
  private int[] a;
  private int b;

  r(String paramString, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    super(paramString, paramInt1);
    if (paramInt2 < 3)
      throw new IllegalArgumentException("Qlen must >= 3");
    this.a = paramArrayOfInt;
    this.b = paramInt2;
  }

  public final boolean a(int paramInt)
  {
    return false;
  }

  public final boolean a(int paramInt1, int paramInt2)
  {
    return false;
  }

  public final boolean a(int[] paramArrayOfInt, int paramInt)
  {
    if (paramInt != this.b)
      return false;
    for (int i = 0; i < paramInt; i++)
      if (paramArrayOfInt[i] != this.a[i])
        return false;
    return true;
  }
}

/* Location:
 * Qualified Name:     r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
