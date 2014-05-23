package com.spotify.mobile.android.spotlets.artist.model;

import android.content.ContentResolver;
import android.database.Cursor;

final class c extends f
{
  private Cursor d;

  public c(a parama, ContentResolver paramContentResolver)
  {
    super(parama, paramContentResolver);
  }

  public final void a(Cursor paramCursor)
  {
    this.d = paramCursor;
  }

  protected final void onQueryComplete(int paramInt, Object paramObject, Cursor paramCursor)
  {
    super.onQueryComplete(paramInt, paramObject, paramCursor);
    if ((this.d != null) && (!this.d.isClosed()))
      this.d.close();
    a.a(this.a, paramCursor, this.b);
    paramCursor.close();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.model.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
