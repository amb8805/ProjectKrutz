package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;
import com.spotify.mobile.android.util.cc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TouchInterceptableListView extends ListView
{
  private List<Integer> a = new ArrayList();
  private u b = new TouchInterceptableListView.1(this);

  public TouchInterceptableListView(Context paramContext)
  {
    super(paramContext);
  }

  public TouchInterceptableListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public TouchInterceptableListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(u paramu, Integer[] paramArrayOfInteger)
  {
    cc.a(paramu, "Don't call setTouchCallback with null callback");
    cc.a(paramArrayOfInteger, "Don't call setTouchCallback with null events");
    this.b = paramu;
    this.a = Arrays.asList(paramArrayOfInteger);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a.contains(Integer.valueOf(paramMotionEvent.getAction())))
      this.b.a();
    return super.onInterceptTouchEvent(paramMotionEvent);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a.contains(Integer.valueOf(paramMotionEvent.getAction())))
      this.b.a();
    return super.onTouchEvent(paramMotionEvent);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.TouchInterceptableListView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
