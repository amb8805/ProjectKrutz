package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import com.twitter.android.client.g;

final class ai
  implements DialogInterface.OnClickListener
{
  ai(MessagesThreadActivity paramMessagesThreadActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Cursor localCursor = this.a.c.getCursor();
    long[] arrayOfLong;
    int i;
    if (localCursor != null)
    {
      arrayOfLong = new long[localCursor.getCount()];
      i = 0;
      localCursor.moveToFirst();
    }
    while (true)
    {
      int j = i + 1;
      arrayOfLong[i] = localCursor.getLong(1);
      if (!localCursor.moveToNext())
      {
        this.a.c(this.a.a.a(arrayOfLong));
        this.a.b(true);
        return;
      }
      i = j;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
