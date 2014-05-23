package com.mixpanel.android.surveys;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.Button;

class FadeOnPressButton extends Button
{
  private boolean a;

  public FadeOnPressButton(Context paramContext)
  {
    super(paramContext);
  }

  public FadeOnPressButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public FadeOnPressButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void a(float paramFloat)
  {
    if (Build.VERSION.SDK_INT >= 11)
      setAlpha(paramFloat);
  }

  protected void drawableStateChanged()
  {
    int[] arrayOfInt = getDrawableState();
    int i = arrayOfInt.length;
    for (int j = 0; ; j++)
    {
      int k = 0;
      if (j < i)
      {
        if (arrayOfInt[j] == 16842919)
        {
          if (!this.a)
            a(0.5F);
          k = 1;
        }
      }
      else
      {
        if ((this.a) && (k == 0))
        {
          a(1.0F);
          this.a = true;
        }
        super.drawableStateChanged();
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.surveys.FadeOnPressButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
