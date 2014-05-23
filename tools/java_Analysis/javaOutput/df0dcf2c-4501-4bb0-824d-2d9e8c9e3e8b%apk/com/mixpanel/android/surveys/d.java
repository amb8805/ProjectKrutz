package com.mixpanel.android.surveys;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class d extends Animation
{
  private d(SurveyChoiceView paramSurveyChoiceView)
  {
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    float f1 = 1.0F;
    if (paramFloat <= 0.5F);
    for (float f2 = paramFloat - 0.5F; ; f2 = 0.0F)
    {
      SurveyChoiceView.a(this.a, f2);
      SurveyChoiceView.b(this.a, f1);
      this.a.requestLayout();
      return;
      f1 += 2.0F * (paramFloat - 0.5F);
    }
  }

  public final boolean willChangeBounds()
  {
    return false;
  }

  public final boolean willChangeTransformationMatrix()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.surveys.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
