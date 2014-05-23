public enum au
{
  private boolean i;

  static
  {
    au[] arrayOfau = new au[8];
    arrayOfau[0] = a;
    arrayOfau[1] = b;
    arrayOfau[2] = c;
    arrayOfau[3] = d;
    arrayOfau[4] = e;
    arrayOfau[5] = f;
    arrayOfau[6] = g;
    arrayOfau[7] = h;
  }

  private au(boolean arg3)
  {
    boolean bool;
    this.i = bool;
  }

  public static int a()
  {
    int k = 0;
    au[] arrayOfau = values();
    int m = arrayOfau.length;
    int n = 0;
    while (k < m)
    {
      au localau = arrayOfau[k];
      if (localau.i)
        n |= 1 << localau.ordinal();
      k++;
    }
    return n;
  }

  public final boolean a(int paramInt)
  {
    return (paramInt & 1 << ordinal()) != 0;
  }

  public final int b()
  {
    return 1 << ordinal();
  }
}

/* Location:
 * Qualified Name:     au
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
