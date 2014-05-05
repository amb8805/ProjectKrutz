public class dl extends ak
{
  public String c;
  public String d;
  public String e;

  public dl()
  {
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass()))
      return false;
    if (!super.equals(paramObject))
      return false;
    dl localdl = (dl)paramObject;
    if (this.c != null)
    {
      if (this.c.equals(localdl.c));
    }
    else
      while (localdl.c != null)
        return false;
    return true;
  }

  public int hashCode()
  {
    int i = 31 * super.hashCode();
    if (this.c != null);
    for (int j = this.c.hashCode(); ; j = 0)
      return i + j;
  }

  public String toString()
  {
    if (this.e != null)
      return this.e;
    if (this.d != null)
      return this.d;
    return this.c;
  }
}

/* Location:
 * Qualified Name:     dl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
