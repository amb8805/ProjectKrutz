public abstract class cf
{
  protected int a;
  protected int b;

  protected cf()
  {
  }

  public final boolean a()
  {
    return this.a == 1;
  }

  public final boolean b()
  {
    return this.a == 0;
  }

  public final boolean c()
  {
    return this.a == 2;
  }

  public final String d()
  {
    switch (this.a)
    {
    default:
      return "?";
    case 0:
      return "ROOT";
    case 1:
      return "ARRAY";
    case 2:
    }
    return "OBJECT";
  }

  public final int e()
  {
    if (this.b < 0)
      return 0;
    return this.b;
  }
}

/* Location:
 * Qualified Name:     cf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
