public final class ea extends ak
{
  public String c;
  public long d;

  public ea()
  {
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass()))
      return false;
    if (!super.equals(paramObject))
      return false;
    ea localea = (ea)paramObject;
    return this.d == localea.d;
  }

  public final int hashCode()
  {
    return 31 * super.hashCode() + (int)(this.d ^ this.d >>> 32);
  }
}

/* Location:
 * Qualified Name:     ea
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
