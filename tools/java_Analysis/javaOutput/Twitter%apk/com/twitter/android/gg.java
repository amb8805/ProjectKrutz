package com.twitter.android;

import android.database.DataSetObserver;

final class gg extends DataSetObserver
{
  gg(bv parambv)
  {
  }

  public final void onChanged()
  {
    if (this.a.a)
      this.a.notifyDataSetChanged();
  }

  public final void onInvalidated()
  {
    if (this.a.getCount() == 0)
    {
      this.a.notifyDataSetInvalidated();
      return;
    }
    onChanged();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.gg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
