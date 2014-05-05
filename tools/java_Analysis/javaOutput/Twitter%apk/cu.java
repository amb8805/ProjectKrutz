public final class cu extends cf
{
  private cu c;
  private String d;
  private cu e = null;

  private cu(int paramInt, cu paramcu)
  {
    this.a = paramInt;
    this.c = paramcu;
    this.b = -1;
  }

  private final cu a(int paramInt)
  {
    this.a = paramInt;
    this.b = -1;
    this.d = null;
    return this;
  }

  public static cu f()
  {
    return new cu(0, null);
  }

  public final int a(String paramString)
  {
    if (this.a == 2)
    {
      if (this.d != null)
        return 4;
      this.d = paramString;
      if (this.b < 0)
        return 0;
      return 1;
    }
    return 4;
  }

  public final cu g()
  {
    cu localcu1 = this.e;
    if (localcu1 == null)
    {
      cu localcu2 = new cu(1, this);
      this.e = localcu2;
      return localcu2;
    }
    return localcu1.a(1);
  }

  public final cu h()
  {
    cu localcu1 = this.e;
    if (localcu1 == null)
    {
      cu localcu2 = new cu(2, this);
      this.e = localcu2;
      return localcu2;
    }
    return localcu1.a(2);
  }

  public final cu i()
  {
    return this.c;
  }

  public final int j()
  {
    if (this.a == 2)
    {
      if (this.d == null)
        return 5;
      this.d = null;
      this.b = (1 + this.b);
      return 2;
    }
    if (this.a == 1)
    {
      int i = this.b;
      this.b = (1 + this.b);
      if (i < 0)
        return 0;
      return 1;
    }
    this.b = (1 + this.b);
    if (this.b == 0)
      return 0;
    return 3;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    if (this.a == 2)
    {
      localStringBuilder.append((char)'{');
      if (this.d != null)
      {
        localStringBuilder.append((char)'"');
        localStringBuilder.append(this.d);
        localStringBuilder.append((char)'"');
        localStringBuilder.append((char)']');
      }
    }
    while (true)
    {
      return localStringBuilder.toString();
      localStringBuilder.append((char)'?');
      break;
      if (this.a == 1)
      {
        localStringBuilder.append((char)'[');
        localStringBuilder.append(e());
        localStringBuilder.append((char)']');
      }
      else
      {
        localStringBuilder.append("/");
      }
    }
  }
}

/* Location:
 * Qualified Name:     cu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
