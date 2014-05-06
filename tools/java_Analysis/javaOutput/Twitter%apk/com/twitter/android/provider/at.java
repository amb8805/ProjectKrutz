package com.twitter.android.provider;

import android.database.Cursor;
import android.database.DataSetObservable;
import android.database.DataSetObserver;

public final class at extends DataSetObservable
{
  private final DataSetObserver a = new y(this, null);
  private final Cursor b;
  private boolean c = true;
  private int d = 0;

  public at(am paramam, Cursor paramCursor)
  {
    this.b = paramCursor;
  }

  public final void a(DataSetObserver paramDataSetObserver)
  {
    super.registerObserver(paramDataSetObserver);
    this.d = (1 + this.d);
    if (this.d == 1)
      this.b.registerDataSetObserver(this.a);
  }

  public final void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  public final void b(DataSetObserver paramDataSetObserver)
  {
    super.unregisterObserver(paramDataSetObserver);
    this.d -= 1;
    if (this.d == 0)
      this.b.unregisterDataSetObserver(this.a);
  }

  public final void notifyChanged()
  {
    if (this.c)
      super.notifyChanged();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.at
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
