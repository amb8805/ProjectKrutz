public final class x extends cs
{
  private int a;
  private int b;
  private int c;

  x(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramString, paramInt1);
    this.a = paramInt2;
    this.b = paramInt3;
    this.c = paramInt4;
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
    return (paramInt == 3) && (paramArrayOfInt[0] == this.a) && (paramArrayOfInt[1] == this.b) && (paramArrayOfInt[2] == this.c);
  }
}

/* Location:
 * Qualified Name:     x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
