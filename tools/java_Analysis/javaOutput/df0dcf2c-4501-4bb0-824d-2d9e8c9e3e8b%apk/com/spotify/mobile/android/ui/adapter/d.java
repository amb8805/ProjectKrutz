package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public final class d extends LinearLayout
{
  public d(b paramb, Context paramContext)
  {
    super(paramContext);
    setEnabled(false);
    setOnClickListener(null);
    while (i < paramb.j)
    {
      addView(paramb.a(this), i, new LinearLayout.LayoutParams(-1, -1, 1.0F));
      i++;
    }
  }

  public final void a(Cursor paramCursor, int paramInt)
  {
    paramCursor.moveToPosition(paramInt);
    int i = 0;
    if (i < this.a.j)
    {
      View localView = getChildAt(i);
      if (!paramCursor.isAfterLast())
      {
        this.a.a(localView, paramCursor);
        localView.setVisibility(0);
        paramCursor.moveToNext();
        if (this.a.k != null)
        {
          localView.setOnClickListener(new d.1(this, paramInt + i));
          localView.setOnLongClickListener(new d.2(this));
        }
      }
      while (true)
      {
        i++;
        break;
        localView.setVisibility(4);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
