public enum cc
{
  private boolean g;
  private int h;

  static
  {
    d = new cc("WRITE_NUMBERS_AS_STRINGS", 4, false);
    e = new cc("FLUSH_PASSED_TO_STREAM", 5, true);
    cc[] arrayOfcc = new cc[6];
    arrayOfcc[0] = a;
    arrayOfcc[1] = b;
    arrayOfcc[2] = c;
    arrayOfcc[3] = f;
    arrayOfcc[4] = d;
    arrayOfcc[5] = e;
  }

  private cc(boolean arg3)
  {
    boolean bool;
    this.g = bool;
    this.h = (1 << ordinal());
  }

  public static int a()
  {
    int j = 0;
    cc[] arrayOfcc = values();
    int k = arrayOfcc.length;
    int m = 0;
    while (j < k)
    {
      cc localcc = arrayOfcc[j];
      if (localcc.g)
        m |= localcc.h;
      j++;
    }
    return m;
  }

  public final int b()
  {
    return this.h;
  }
}

/* Location:
 * Qualified Name:     cc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
