import java.io.Serializable;

public final class cj
  implements Serializable
{
  public String a;

  public cj()
  {
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass()))
      return false;
    cj localcj = (cj)paramObject;
    if (this.a != null)
    {
      if (this.a.equals(localcj.a));
    }
    else
      while (localcj.a != null)
        return false;
    return true;
  }

  public final int hashCode()
  {
    if (this.a != null)
      return this.a.hashCode();
    return 0;
  }
}

/* Location:
 * Qualified Name:     cj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
