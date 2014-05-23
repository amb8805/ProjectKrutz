package com.spotify.android.paste.graphics;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class h extends MetricAffectingSpan
{
  private Typeface a;

  public h(Typeface paramTypeface)
  {
    this.a = paramTypeface;
  }

  private void a(TextPaint paramTextPaint)
  {
    Typeface localTypeface1 = this.a;
    Typeface localTypeface2 = paramTextPaint.getTypeface();
    if (localTypeface1 == null)
      return;
    if (localTypeface2 != null)
    {
      int i = localTypeface2.getStyle();
      if (localTypeface1.getStyle() != i)
        localTypeface1 = Typeface.create(localTypeface1, i);
      this.a = localTypeface1;
    }
    paramTextPaint.setTypeface(localTypeface1);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    a(paramTextPaint);
  }

  public final void updateMeasureState(TextPaint paramTextPaint)
  {
    a(paramTextPaint);
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.graphics.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
