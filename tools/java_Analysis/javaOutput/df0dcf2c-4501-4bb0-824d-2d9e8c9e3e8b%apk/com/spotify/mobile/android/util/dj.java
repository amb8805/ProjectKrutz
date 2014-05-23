package com.spotify.mobile.android.util;

import android.text.TextPaint;
import android.widget.TextView;

public final class dj
{
  public static int a(TextPaint paramTextPaint)
  {
    float f = 0.0F;
    float[] arrayOfFloat = new float["01234567890".length()];
    paramTextPaint.getTextWidths("01234567890", arrayOfFloat);
    for (int i = 0; i < "01234567890".length(); i++)
      if (arrayOfFloat[i] > f)
        f = arrayOfFloat[i];
    return (int)(0.5F + 1.0F * f);
  }

  public static String a(TextView paramTextView)
  {
    if (paramTextView == null)
      return "";
    CharSequence localCharSequence = paramTextView.getText();
    if (localCharSequence == null)
      return "";
    return localCharSequence.toString();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
