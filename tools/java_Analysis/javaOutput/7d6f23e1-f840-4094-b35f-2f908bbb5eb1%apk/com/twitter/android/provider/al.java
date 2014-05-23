package com.twitter.android.provider;

import android.database.Cursor;
import android.os.Bundle;
import java.util.ArrayList;

public final class al extends am
{
  public al(Cursor paramCursor, int paramInt)
  {
    super(paramCursor, paramInt);
  }

  public final void a()
  {
    Cursor localCursor = this.d;
    if (localCursor != null)
    {
      ArrayList localArrayList = new ArrayList();
      int i = this.a;
      for (int j = 0; (localCursor.moveToNext()) && (j < i); j++)
      {
        int k = localCursor.getPosition();
        if (!localCursor.isNull(9))
        {
          long l = localCursor.getLong(2);
          while ((localCursor.moveToNext()) && (l == localCursor.getLong(2)));
          localCursor.moveToPrevious();
        }
        localArrayList.add(Integer.valueOf(k));
      }
      this.b = localArrayList;
      return;
    }
    this.b = null;
  }

  public final Bundle getExtras()
  {
    Cursor localCursor = this.d;
    if (localCursor.isNull(9))
      return Bundle.EMPTY;
    Bundle localBundle = new Bundle();
    ArrayList localArrayList = new ArrayList();
    int i = ((Integer)b()).intValue();
    long l = localCursor.getLong(2);
    do
    {
      if (l != localCursor.getLong(2))
        break;
      localArrayList.add(localCursor.getString(9));
    }
    while (localCursor.moveToNext());
    localCursor.moveToPosition(i);
    localBundle.putStringArrayList("conn_names", localArrayList);
    return localBundle;
  }

  public final boolean moveToPosition(int paramInt)
  {
    return (super.moveToPosition(paramInt)) && (this.d.moveToPosition(((Integer)b()).intValue()));
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.al
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
