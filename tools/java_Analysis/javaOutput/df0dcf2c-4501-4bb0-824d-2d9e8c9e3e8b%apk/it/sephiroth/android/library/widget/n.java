package it.sephiroth.android.library.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.util.Log;
import android.widget.Adapter;

class n extends DataSetObserver
{
  private Parcelable a = null;

  n(AdapterView paramAdapterView)
  {
  }

  public void onChanged()
  {
    Log.i("View", "onChanged");
    this.b.ai = true;
    this.b.ao = this.b.an;
    this.b.an = this.b.q().getCount();
    if ((this.b.q().hasStableIds()) && (this.a != null) && (this.b.ao == 0) && (this.b.an > 0))
    {
      Log.d("View", "calling onRestoreInstanceState");
      AdapterView.a(this.b, this.a);
      this.a = null;
    }
    while (true)
    {
      this.b.w();
      this.b.requestLayout();
      return;
      Log.d("View", "else calling rememberSyncState");
      this.b.z();
    }
  }

  public void onInvalidated()
  {
    Log.i("View", "onInvalidated");
    this.b.ai = true;
    if (this.b.q().hasStableIds())
      this.a = AdapterView.a(this.b);
    this.b.ao = this.b.an;
    this.b.an = 0;
    this.b.al = -1;
    this.b.am = -9223372036854775808L;
    this.b.aj = -1;
    this.b.ak = -9223372036854775808L;
    this.b.ac = false;
    this.b.w();
    this.b.requestLayout();
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
