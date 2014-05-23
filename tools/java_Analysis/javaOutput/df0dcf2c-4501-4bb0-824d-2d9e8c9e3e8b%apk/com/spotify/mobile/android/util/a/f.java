package com.spotify.mobile.android.util.a;

import android.annotation.TargetApi;
import android.view.View;
import android.widget.AbsListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(11)
public final class f extends d
{
  private final List<View> a = new ArrayList(3);
  private int b = 0;

  public f(View[] paramArrayOfView)
  {
    while (i < 3)
    {
      View localView = paramArrayOfView[i];
      if (localView != null)
      {
        this.a.add(localView);
        localView.addOnLayoutChangeListener(new f.1(this, localView));
      }
      i++;
    }
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramAbsListView == null) || (paramAbsListView.getChildAt(0) == null))
      return;
    int i = Math.abs(paramAbsListView.getChildAt(0).getTop() / 2) - this.b;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((View)localIterator.next()).offsetTopAndBottom(i);
    this.b = (i + this.b);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
