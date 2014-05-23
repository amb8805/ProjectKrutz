package com.twitter.android;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.twitter.android.widget.CardRowView;

public final class j extends CursorAdapter
{
  public j(Context paramContext)
  {
    super(paramContext, null, 0);
  }

  public final void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    al localal = (al)paramView.getTag();
    localal.a.setText(paramCursor.getString(1));
    if (paramCursor.getInt(3) == 1)
      if (paramCursor.getLong(2) > 0L)
        localal.b.setVisibility(0);
    while (true)
    {
      ((CardRowView)paramView).a(paramCursor.getPosition(), paramCursor.getCount());
      return;
      localal.b.setVisibility(8);
      continue;
      localal.b.setVisibility(8);
    }
  }

  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903092, null);
    localView.setTag(new al(localView));
    return localView;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
