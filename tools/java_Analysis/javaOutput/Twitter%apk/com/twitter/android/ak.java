package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import com.twitter.android.client.g;

final class ak
  implements DialogInterface.OnClickListener
{
  ak(MessagesThreadActivity paramMessagesThreadActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Cursor localCursor = this.a.c.getCursor();
    if (localCursor != null)
    {
      long l = localCursor.getLong(1);
      this.a.c(this.a.a.b(l));
      this.a.b(true);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
