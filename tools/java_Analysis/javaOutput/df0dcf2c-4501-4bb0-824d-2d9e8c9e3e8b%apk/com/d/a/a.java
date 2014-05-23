package com.d.a;

import java.util.ArrayList;

public abstract class a
  implements Cloneable
{
  ArrayList<b> a = null;

  public a()
  {
  }

  public abstract a a(long paramLong);

  public void a()
  {
  }

  public final void a(b paramb)
  {
    if (this.a == null)
      this.a = new ArrayList();
    this.a.add(paramb);
  }

  public void b()
  {
  }

  public void c()
  {
  }

  public final void d()
  {
    if (this.a != null)
    {
      this.a.clear();
      this.a = null;
    }
  }

  public a e()
  {
    a locala;
    try
    {
      locala = (a)super.clone();
      if (this.a != null)
      {
        ArrayList localArrayList = this.a;
        locala.a = new ArrayList();
        int i = localArrayList.size();
        for (int j = 0; j < i; j++)
          locala.a.add(localArrayList.get(j));
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError();
    }
    return locala;
  }
}

/* Location:
 * Qualified Name:     com.d.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
