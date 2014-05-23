package com.google.android.gms.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.el;

public final class PlusOneButton extends ViewGroup
{
  private final el a;

  public PlusOneButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = new el(paramContext, paramAttributeSet);
    addView(this.a);
    if (isInEditMode())
      return;
    this.a.a();
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    el localel = this.a;
    measureChild(localel, paramInt1, paramInt2);
    setMeasuredDimension(localel.getMeasuredWidth(), localel.getMeasuredHeight());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.PlusOneButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
