package com.spotify.mobile.android.spotlets.artist.model;

import android.content.ContentResolver;
import android.database.Cursor;

final class d extends f
{
  public d(a parama, ContentResolver paramContentResolver)
  {
    super(parama, paramContentResolver);
  }

  protected final void onQueryComplete(int paramInt, Object paramObject, Cursor paramCursor)
  {
    super.onQueryComplete(paramInt, paramObject, paramCursor);
    if (paramCursor.getCount() > 0)
    {
      a.a(this.a, paramCursor, this.b);
      paramCursor.close();
      return;
    }
    a.c(this.a).a(paramCursor, this.b);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.model.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
