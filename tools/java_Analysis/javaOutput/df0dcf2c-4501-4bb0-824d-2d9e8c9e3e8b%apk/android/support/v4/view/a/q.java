package android.support.v4.view.a;

import android.os.Build.VERSION;

public final class q
{
  private static final t a = new v();
  private final Object b;

  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new u();
      return;
    }
    if (Build.VERSION.SDK_INT >= 15)
    {
      a = new s();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new r();
      return;
    }
  }

  private q(Object paramObject)
  {
    this.b = paramObject;
  }

  public static q a()
  {
    return new q(a.a());
  }

  public final void a(int paramInt)
  {
    a.b(this.b, paramInt);
  }

  public final void a(boolean paramBoolean)
  {
    a.a(this.b, paramBoolean);
  }

  public final void b(int paramInt)
  {
    a.a(this.b, paramInt);
  }

  public final void c(int paramInt)
  {
    a.c(this.b, paramInt);
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    q localq;
    do
    {
      do
      {
        return true;
        if (paramObject == null)
          return false;
        if (getClass() != paramObject.getClass())
          return false;
        localq = (q)paramObject;
        if (this.b != null)
          break;
      }
      while (localq.b == null);
      return false;
    }
    while (this.b.equals(localq.b));
    return false;
  }

  public final int hashCode()
  {
    if (this.b == null)
      return 0;
    return this.b.hashCode();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.a.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
