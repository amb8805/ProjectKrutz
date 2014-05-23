package com.applovin.impl.sdk;

public class ab
{
  private static int a = 0;
  private final int b;
  private final String c;
  private final Object d;

  private ab(String paramString, Object paramObject)
  {
    if (paramString == null)
      throw new IllegalArgumentException("No name specified");
    if (paramObject == null)
      throw new IllegalArgumentException("No default value specified");
    this.c = paramString;
    this.d = paramObject;
    this.b = a;
    a = 1 + a;
  }

  public int a()
  {
    return this.b;
  }

  Object a(Object paramObject)
  {
    return this.d.getClass().cast(paramObject);
  }

  public String b()
  {
    return this.c;
  }

  public Object c()
  {
    return this.d;
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.ab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
