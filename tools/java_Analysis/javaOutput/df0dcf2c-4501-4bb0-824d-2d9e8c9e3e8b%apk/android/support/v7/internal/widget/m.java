package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.Adapter;

final class m extends DataSetObserver
{
  private Parcelable b = null;

  m(l paraml)
  {
  }

  public final void onChanged()
  {
    this.a.u = true;
    this.a.A = this.a.z;
    this.a.z = this.a.c().getCount();
    if ((this.a.c().hasStableIds()) && (this.b != null) && (this.a.A == 0) && (this.a.z > 0))
    {
      l.a(this.a, this.b);
      this.b = null;
    }
    while (true)
    {
      this.a.d();
      this.a.requestLayout();
      return;
      this.a.g();
    }
  }

  public final void onInvalidated()
  {
    this.a.u = true;
    if (this.a.c().hasStableIds())
      this.b = l.a(this.a);
    this.a.A = this.a.z;
    this.a.z = 0;
    this.a.x = -1;
    this.a.y = -9223372036854775808L;
    this.a.v = -1;
    this.a.w = -9223372036854775808L;
    this.a.p = false;
    this.a.d();
    this.a.requestLayout();
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
