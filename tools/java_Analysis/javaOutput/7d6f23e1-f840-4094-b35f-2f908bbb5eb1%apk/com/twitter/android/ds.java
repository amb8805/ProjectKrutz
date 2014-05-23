package com.twitter.android;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class ds extends Filter
{
  ds(em paramem, Activity paramActivity, Uri paramUri)
  {
  }

  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (paramCharSequence != null)
    {
      Cursor localCursor = this.a.getContentResolver().query(this.b, fd.a, "username LIKE " + DatabaseUtils.sqlEscapeString(new StringBuilder().append(paramCharSequence.toString()).append("%").toString()), null, "LOWER(username) ASC");
      localFilterResults.count = localCursor.getCount();
      localFilterResults.values = localCursor;
    }
    return localFilterResults;
  }

  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    if (paramFilterResults.values != null)
    {
      Cursor localCursor1 = this.c.getCursor();
      if (localCursor1 != null)
        this.a.stopManagingCursor(localCursor1);
      Cursor localCursor2 = (Cursor)paramFilterResults.values;
      this.a.startManagingCursor(localCursor2);
      this.c.changeCursor(localCursor2);
    }
    this.c.notifyDataSetChanged();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ds
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
