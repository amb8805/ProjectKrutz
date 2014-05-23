import java.io.Serializable;

public final class bd
  implements Serializable
{
  private static bd a = new bd("N/A", -1L, -1L, -1, -1);
  private long b;
  private long c;
  private int d;
  private int e;
  private Object f;

  public bd(Object paramObject, long paramLong, int paramInt1, int paramInt2)
  {
    this(paramObject, -1L, paramLong, paramInt1, paramInt2);
  }

  private bd(Object paramObject, long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    this.f = paramObject;
    this.b = -1L;
    this.c = paramLong2;
    this.d = paramInt1;
    this.e = paramInt2;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (paramObject == null)
      return false;
    if (!(paramObject instanceof bd))
      return false;
    bd localbd = (bd)paramObject;
    if (this.f == null)
    {
      if (localbd.f != null)
        return false;
    }
    else if (!this.f.equals(localbd.f))
      return false;
    return (this.d == localbd.d) && (this.e == localbd.e) && (this.c == localbd.c) && (this.b == localbd.b);
  }

  public final int hashCode()
  {
    if (this.f == null);
    for (int i = 1; ; i = this.f.hashCode())
      return ((i ^ this.d) + this.e ^ (int)this.c) + (int)this.b;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(80);
    localStringBuilder.append("[Source: ");
    if (this.f == null)
      localStringBuilder.append("UNKNOWN");
    while (true)
    {
      localStringBuilder.append("; line: ");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", column: ");
      localStringBuilder.append(this.e);
      localStringBuilder.append((char)']');
      return localStringBuilder.toString();
      localStringBuilder.append(this.f.toString());
    }
  }
}

/* Location:
 * Qualified Name:     bd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
