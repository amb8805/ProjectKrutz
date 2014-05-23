package com.squareup.wire;

public final class e<T extends ExtendableMessage<?>, E>
  implements Comparable<e<?, ?>>
{
  private final Class<T> a;
  private final Class<? extends Message> b;
  private final Class<? extends Enum> c;
  private final String d;
  private final int e;
  private final Message.Datatype f;
  private final Message.Label g;

  private int a(e<?, ?> parame)
  {
    if (parame == this);
    do
    {
      return 0;
      if (this.e != parame.e)
        return this.e - parame.e;
      if (this.f != parame.f)
        return this.f.a() - parame.f.a();
      if (this.g != parame.g)
        return this.g.a() - parame.g.a();
      if ((this.a != null) && (!this.a.equals(parame.a)))
        return this.a.getName().compareTo(parame.a.getName());
      if ((this.b != null) && (!this.b.equals(parame.b)))
        return this.b.getName().compareTo(parame.b.getName());
    }
    while ((this.c == null) || (this.c.equals(parame.c)));
    return this.c.getName().compareTo(parame.c.getName());
  }

  public final Class<T> a()
  {
    return this.a;
  }

  public final Class<? extends Message> b()
  {
    return this.b;
  }

  public final Class<? extends Enum> c()
  {
    return this.c;
  }

  public final String d()
  {
    return this.d;
  }

  public final int e()
  {
    return this.e;
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof e)) && (a((e)paramObject) == 0);
  }

  public final Message.Datatype f()
  {
    return this.f;
  }

  public final Message.Label g()
  {
    return this.g;
  }

  public final int hashCode()
  {
    int i = 37 * (37 * (37 * (37 * this.e + this.f.a()) + this.g.a()) + this.a.hashCode());
    if (this.b != null);
    for (int j = this.b.hashCode(); ; j = 0)
    {
      int k = 37 * (j + i);
      Class localClass = this.c;
      int m = 0;
      if (localClass != null)
        m = this.c.hashCode();
      return k + m;
    }
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.g;
    arrayOfObject[1] = this.f;
    arrayOfObject[2] = this.d;
    arrayOfObject[3] = Integer.valueOf(this.e);
    return String.format("[%s %s %s = %d]", arrayOfObject);
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
