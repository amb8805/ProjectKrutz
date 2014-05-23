package com.spotify.mobile.android.spotlets.artist.view.a;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;

final class d extends AsyncQueryHandler
{
  public d(c paramc, ContentResolver paramContentResolver)
  {
    super(paramContentResolver);
  }

  protected final void onQueryComplete(int paramInt, Object paramObject, Cursor paramCursor)
  {
    super.onQueryComplete(paramInt, paramObject, paramCursor);
    String str = (String)paramObject;
    if (paramCursor.getCount() == 0)
      this.a.a(str);
    while (true)
    {
      paramCursor.close();
      return;
      c.a(this.a, paramCursor, str);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
