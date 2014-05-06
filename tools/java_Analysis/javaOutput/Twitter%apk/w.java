public final class w extends cs
{
  private int a;
  private int b;

  w(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramString, paramInt1);
    this.a = paramInt2;
    this.b = paramInt3;
  }

  public final boolean a(int paramInt)
  {
    return false;
  }

  public final boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 == this.a) && (paramInt2 == this.b);
  }

  public final boolean a(int[] paramArrayOfInt, int paramInt)
  {
    return (paramInt == 2) && (paramArrayOfInt[0] == this.a) && (paramArrayOfInt[1] == this.b);
  }
}

/* Location:
 * Qualified Name:     w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
