package com.twitter.android.widget;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

final class a extends ClickableSpan
{
  private final String a;
  private final o b;
  private final int c;

  public a(int paramInt, String paramString, o paramo)
  {
    this.c = paramInt;
    this.a = paramString;
    this.b = paramo;
  }

  public final void onClick(View paramView)
  {
    if (this.b != null)
      this.b.a(this.a);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    if (this.b == null)
    {
      paramTextPaint.setColor(this.c);
      return;
    }
    paramTextPaint.setColor(paramTextPaint.linkColor);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
