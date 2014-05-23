package com.spotify.mobile.android.ui.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;

public class UserHeaderView extends LinearLayout
{
  public UserHeaderView(Context paramContext)
  {
    super(paramContext);
  }

  public UserHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  @TargetApi(11)
  public UserHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getDefaultSize(getSuggestedMinimumWidth(), paramInt1);
    int j = getResources().getDimensionPixelOffset(2131427493);
    View localView = findViewById(2131362223);
    ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
    localLayoutParams.width = j;
    localLayoutParams.height = j;
    localView.setLayoutParams(localLayoutParams);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(j, 1073741824));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.UserHeaderView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
