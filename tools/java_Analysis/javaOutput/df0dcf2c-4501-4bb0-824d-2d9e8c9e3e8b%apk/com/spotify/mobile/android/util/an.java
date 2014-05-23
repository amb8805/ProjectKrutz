package com.spotify.mobile.android.util;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

public abstract class an extends Filter
{
  private n a;
  private int b;
  private o<Cursor> c;
  private Bundle d = new Bundle();

  public an(n paramn, o<Cursor> paramo)
  {
    this.a = paramn;
    this.b = 2131362172;
    this.c = paramo;
  }

  public abstract CharSequence a(Cursor paramCursor);

  public final void a()
  {
    this.a.a(this.b, this.d, this.c);
  }

  public CharSequence convertResultToString(Object paramObject)
  {
    return a((Cursor)paramObject);
  }

  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
      this.d.putString("filter", paramCharSequence.toString());
    this.a.b(this.b, this.d, this.c);
    return null;
  }

  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.an
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
