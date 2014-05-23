package com.google.common.collect;

import com.google.common.base.i;
import java.util.NoSuchElementException;

public abstract class AbstractIterator<T> extends aq<T>
{
  private AbstractIterator.State a = AbstractIterator.State.b;
  private T b;

  protected AbstractIterator()
  {
  }

  protected abstract T a();

  protected final T b()
  {
    this.a = AbstractIterator.State.c;
    return null;
  }

  public final boolean hasNext()
  {
    if (this.a != AbstractIterator.State.d);
    for (boolean bool1 = true; ; bool1 = false)
    {
      i.b(bool1);
      int i = AbstractIterator.1.a[this.a.ordinal()];
      boolean bool2 = false;
      switch (i)
      {
      default:
        this.a = AbstractIterator.State.d;
        this.b = a();
        AbstractIterator.State localState1 = this.a;
        AbstractIterator.State localState2 = AbstractIterator.State.c;
        bool2 = false;
        if (localState1 != localState2)
        {
          this.a = AbstractIterator.State.a;
          bool2 = true;
        }
      case 1:
        return bool2;
      case 2:
      }
    }
    return true;
  }

  public final T next()
  {
    if (!hasNext())
      throw new NoSuchElementException();
    this.a = AbstractIterator.State.b;
    return this.b;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.AbstractIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
