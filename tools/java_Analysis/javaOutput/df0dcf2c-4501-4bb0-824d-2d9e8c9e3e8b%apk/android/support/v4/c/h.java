package android.support.v4.c;

import java.util.Iterator;

final class h<T>
  implements Iterator<T>
{
  final int a;
  int b;
  int c;
  boolean d = false;

  h(g paramg, int paramInt)
  {
    this.a = paramInt;
    this.b = paramg.a();
  }

  public final boolean hasNext()
  {
    return this.c < this.b;
  }

  public final T next()
  {
    Object localObject = this.e.a(this.c, this.a);
    this.c = (1 + this.c);
    this.d = true;
    return localObject;
  }

  public final void remove()
  {
    if (!this.d)
      throw new IllegalStateException();
    this.c = (-1 + this.c);
    this.b = (-1 + this.b);
    this.d = false;
    this.e.a(this.c);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.c.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
