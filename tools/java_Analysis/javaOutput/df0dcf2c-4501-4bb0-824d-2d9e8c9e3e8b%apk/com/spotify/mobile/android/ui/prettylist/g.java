package com.spotify.mobile.android.ui.prettylist;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsListView.OnScrollListener;

final class g extends HidingHeaderListView
{
  public g(StickyListView paramStickyListView, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    super.setOnScrollListener(StickyListView.d(paramStickyListView));
  }

  public final void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    StickyListView.d(this.a).a(paramOnScrollListener);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.prettylist.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
