import java.io.Serializable;

public class ak
  implements Serializable
{
  public int a = -1;
  public int b = -1;

  public ak()
  {
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass()))
      return false;
    ak localak = (ak)paramObject;
    return (this.b == localak.b) && (this.a == localak.a);
  }

  public int hashCode()
  {
    return 31 * this.a + this.b;
  }
}

/* Location:
 * Qualified Name:     ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
