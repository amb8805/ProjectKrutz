package com.twitter.android;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

public class ff extends CharacterStyle
  implements UpdateAppearance
{
  private final int a;

  public final int a()
  {
    return this.a;
  }

  public void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.setColor(paramTextPaint.linkColor);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ff
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
