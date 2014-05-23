package com.twitter.android;

import android.content.AsyncQueryHandler;
import android.content.Context;
import android.database.Cursor;
import com.twitter.android.provider.ax;

final class gb extends AsyncQueryHandler
{
  public gb(PostActivity paramPostActivity, Context paramContext)
  {
    super(paramContext.getContentResolver());
  }

  protected final void onQueryComplete(int paramInt, Object paramObject, Cursor paramCursor)
  {
    if (paramCursor == null)
      return;
    if (paramCursor.moveToFirst())
      switch (paramInt)
      {
      default:
      case 1:
      }
    while (true)
    {
      paramCursor.close();
      return;
      PostActivity localPostActivity = this.a;
      ax[] arrayOfax = new ax[1];
      arrayOfax[0] = new ax(paramCursor);
      localPostActivity.a(arrayOfax);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.gb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
