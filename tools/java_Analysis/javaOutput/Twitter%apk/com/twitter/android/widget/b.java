package com.twitter.android.widget;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

final class b extends ClickableSpan
{
  private final o a;
  private final long b;

  public b(o paramo, long paramLong)
  {
    this.a = paramo;
    this.b = paramLong;
  }

  public final void onClick(View paramView)
  {
    if (this.a != null)
      this.a.b_(this.b);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.setColor(paramTextPaint.linkColor);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
