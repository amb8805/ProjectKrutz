package com.mixpanel.android.surveys;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.animation.Animation;
import android.widget.CheckedTextView;

class SurveyChoiceView extends CheckedTextView
{
  private Drawable a;
  private float b;
  private float c;

  public SurveyChoiceView(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public SurveyChoiceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  public SurveyChoiceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }

  private void a()
  {
    this.b = 0.0F;
    this.c = 1.5F;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    Drawable localDrawable = this.a;
    float f = getResources().getDisplayMetrics().density;
    if ((localDrawable != null) && (isChecked()));
    for (int i = (int)(14.0F * f); ; i = 0)
    {
      int j = (int)(12.0F * f);
      int k = (int)(f * 22.0F);
      setCheckMarkDrawable(null);
      setPadding((int)(k + this.c * i), j, k, j);
      super.onDraw(paramCanvas);
      int m = (int)(k + this.b * i);
      setPadding(m, j, k, j);
      setCheckMarkDrawable(localDrawable);
      int i1;
      if (localDrawable != null)
      {
        int n = 0x70 & getGravity();
        i1 = 0;
        switch (n)
        {
        default:
        case 80:
        case 16:
        }
      }
      while (true)
      {
        int i2 = i1 + i;
        int i3 = i + m;
        localDrawable.setBounds(m + getScrollX(), i1, i3 + getScrollX(), i2);
        localDrawable.draw(paramCanvas);
        setPadding(k, j, k, j);
        return;
        i1 = getHeight() - i;
        continue;
        i1 = (getHeight() - i) / 2;
      }
    }
  }

  public void setCheckMarkDrawable(Drawable paramDrawable)
  {
    super.setCheckMarkDrawable(paramDrawable);
    this.a = paramDrawable;
  }

  public void setChecked(boolean paramBoolean)
  {
    boolean bool = isChecked();
    super.setChecked(paramBoolean);
    if ((isChecked()) && (!bool))
    {
      d locald = new d(this, (byte)0);
      locald.setDuration(300L);
      startAnimation(locald);
    }
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.surveys.SurveyChoiceView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
