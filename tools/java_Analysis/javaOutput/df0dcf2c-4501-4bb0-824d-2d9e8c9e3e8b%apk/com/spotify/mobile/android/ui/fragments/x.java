package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import com.devsmart.android.ui.HorizontalListView;

final class x extends HorizontalListView
{
  private AdapterView.AdapterContextMenuInfo h;

  public x(v paramv, Context paramContext)
  {
    super(paramContext, null);
  }

  public final void a(View paramView, int paramInt, long paramLong)
  {
    this.h = new AdapterView.AdapterContextMenuInfo(paramView, paramInt, paramLong);
    showContextMenu();
  }

  protected final ContextMenu.ContextMenuInfo getContextMenuInfo()
  {
    return this.h;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
