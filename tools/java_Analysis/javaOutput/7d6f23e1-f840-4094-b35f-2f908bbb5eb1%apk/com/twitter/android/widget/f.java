package com.twitter.android.widget;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import dl;

final class f extends URLSpan
{
  private int a;
  private final o b;
  private final dl c;

  public f(int paramInt, o paramo, dl paramdl)
  {
    super(paramdl.c);
    this.a = paramInt;
    this.b = paramo;
    this.c = paramdl;
  }

  public final void onClick(View paramView)
  {
    if (this.b != null)
      this.b.a(this.c);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    if (this.b == null)
    {
      paramTextPaint.setColor(this.a);
      return;
    }
    paramTextPaint.setColor(paramTextPaint.linkColor);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
