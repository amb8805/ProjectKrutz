public final class v extends cs
{
  private static v a = new v("", 0, 0);
  private int b;

  v(String paramString, int paramInt1, int paramInt2)
  {
    super(paramString, paramInt1);
    this.b = paramInt2;
  }

  static final v a()
  {
    return a;
  }

  public final boolean a(int paramInt)
  {
    return paramInt == this.b;
  }

  public final boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 == this.b) && (paramInt2 == 0);
  }

  public final boolean a(int[] paramArrayOfInt, int paramInt)
  {
    return (paramInt == 1) && (paramArrayOfInt[0] == this.b);
  }
}

/* Location:
 * Qualified Name:     v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
