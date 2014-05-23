package com.twitter.android;

import android.database.DataSetObserver;

final class cd extends DataSetObserver
{
  private cd(eq parameq)
  {
  }

  public final void onChanged()
  {
    this.a.notifyDataSetChanged();
  }

  public final void onInvalidated()
  {
    this.a.notifyDataSetInvalidated();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.cd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
