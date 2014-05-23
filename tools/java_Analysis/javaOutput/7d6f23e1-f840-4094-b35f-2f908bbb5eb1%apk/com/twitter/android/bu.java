package com.twitter.android;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;

final class bu extends AsyncQueryHandler
{
  public bu(HomeTabActivity paramHomeTabActivity, ContentResolver paramContentResolver)
  {
    super(paramContentResolver);
  }

  protected final void onQueryComplete(int paramInt, Object paramObject, Cursor paramCursor)
  {
    if (paramCursor == null)
      return;
    boolean bool1;
    boolean bool2;
    label41: boolean bool3;
    if (paramCursor.moveToFirst())
    {
      if (paramCursor.getInt(1) != 1)
        break label116;
      bool1 = true;
      if (paramCursor.getInt(2) == 0)
        break label122;
      bool2 = true;
      if (paramCursor.getInt(3) != 1)
        break label128;
      bool3 = true;
      label55: if (paramCursor.getInt(4) != 1)
        break label134;
    }
    label128: label134: for (boolean bool4 = true; ; bool4 = false)
    {
      this.a.a(0, bool1);
      this.a.a(1, bool2);
      this.a.a(3, bool3);
      this.a.a(2, bool4);
      paramCursor.close();
      return;
      label116: bool1 = false;
      break;
      label122: bool2 = false;
      break label41;
      bool3 = false;
      break label55;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
