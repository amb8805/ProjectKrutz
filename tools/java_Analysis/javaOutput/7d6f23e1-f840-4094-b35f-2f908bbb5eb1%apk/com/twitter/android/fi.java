package com.twitter.android;

import android.content.AsyncQueryHandler;
import android.content.Context;
import android.database.Cursor;
import com.twitter.android.client.g;

final class fi extends AsyncQueryHandler
{
  public fi(ListTabActivity paramListTabActivity, Context paramContext)
  {
    super(paramContext.getContentResolver());
  }

  protected final void onQueryComplete(int paramInt, Object paramObject, Cursor paramCursor)
  {
    if (paramCursor == null)
      return;
    if (this.a.isFinishing())
    {
      paramCursor.close();
      return;
    }
    switch (paramInt)
    {
    default:
      return;
    case 1:
      if (paramCursor.moveToFirst())
      {
        do
          this.a.c = paramCursor.getInt(0);
        while ((this.a.c == 0) && (paramCursor.moveToNext()));
        switch (this.a.c)
        {
        default:
        case 0:
        }
      }
      while (true)
      {
        paramCursor.close();
        return;
        if ((this.a.e.h()) && (this.a.b != this.a.e.j()))
          this.a.e.a(5, this.a.b, this.a.a, this.a.e.j());
      }
    case 2:
    }
    if (paramCursor.moveToFirst())
      do
        this.a.c = paramCursor.getInt(0);
      while ((this.a.c == 0) && (paramCursor.moveToNext()));
    paramCursor.close();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.fi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
