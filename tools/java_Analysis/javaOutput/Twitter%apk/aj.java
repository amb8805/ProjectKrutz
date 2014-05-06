final class aj
{
  protected final cs a;
  protected final aj b;

  aj(cs paramcs, aj paramaj)
  {
    this.a = paramcs;
    this.b = paramaj;
  }

  public final int a()
  {
    aj localaj1 = this.b;
    int i = 1;
    for (aj localaj2 = localaj1; localaj2 != null; localaj2 = localaj2.b)
      i++;
    return i;
  }

  public final cs a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.a.hashCode() == paramInt1) && (this.a.a(paramInt2, paramInt3)))
      return this.a;
    for (aj localaj = this.b; localaj != null; localaj = localaj.b)
    {
      cs localcs = localaj.a;
      if ((localcs.hashCode() == paramInt1) && (localcs.a(paramInt2, paramInt3)))
        return localcs;
    }
    return null;
  }

  public final cs a(int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    if ((this.a.hashCode() == paramInt1) && (this.a.a(paramArrayOfInt, paramInt2)))
      return this.a;
    for (aj localaj = this.b; localaj != null; localaj = localaj.b)
    {
      cs localcs = localaj.a;
      if ((localcs.hashCode() == paramInt1) && (localcs.a(paramArrayOfInt, paramInt2)))
        return localcs;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
