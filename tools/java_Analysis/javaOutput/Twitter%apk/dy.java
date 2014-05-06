public final class dy extends dl
{
  public long f;
  public String g;
  public int h;

  public dy()
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
    dy localdy = (dy)paramObject;
    return this.f == localdy.f;
  }

  public final int hashCode()
  {
    return 31 * super.hashCode() + (int)(this.f ^ this.f >>> 32);
  }
}

/* Location:
 * Qualified Name:     dy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
