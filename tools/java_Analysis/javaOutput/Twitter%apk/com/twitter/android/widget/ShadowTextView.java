package com.twitter.android.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.TextView;
import com.twitter.android.fq;

public class ShadowTextView extends TextView
  implements Checkable
{
  private static final int[] a = { 16842912 };
  private ColorStateList b;
  private final float c;
  private final float d;
  private final float e;
  private int f;
  private boolean g;

  public ShadowTextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ShadowTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130771981);
  }

  public ShadowTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, fq.ShadowTextView, paramInt, 0);
    this.b = localTypedArray.getColorStateList(3);
    this.d = localTypedArray.getDimension(1, 0.0F);
    this.c = localTypedArray.getDimension(2, 0.0F);
    this.e = localTypedArray.getDimension(0, 0.0F);
    localTypedArray.recycle();
    a();
  }

  private void a()
  {
    ColorStateList localColorStateList = this.b;
    if ((localColorStateList != null) && (localColorStateList.isStateful()))
    {
      int i = localColorStateList.getColorForState(getDrawableState(), 0);
      if (i != this.f)
      {
        this.f = i;
        setShadowLayer(this.e, this.d, this.c, i);
      }
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    a();
  }

  public boolean isChecked()
  {
    return this.g;
  }

  public int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked())
      mergeDrawableStates(arrayOfInt, a);
    return arrayOfInt;
  }

  public void setChecked(boolean paramBoolean)
  {
    if (this.g != paramBoolean)
    {
      this.g = paramBoolean;
      refreshDrawableState();
    }
  }

  public void toggle()
  {
    if (!this.g);
    for (boolean bool = true; ; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.ShadowTextView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
