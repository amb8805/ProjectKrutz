package com.twitter.android;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.MovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

public final class s extends ArrowKeyMovementMethod
{
  private static final s a = new s();

  public s()
  {
  }

  public static MovementMethod getInstance()
  {
    return a;
  }

  public final boolean onKeyDown(TextView paramTextView, Spannable paramSpannable, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = super.onKeyDown(paramTextView, paramSpannable, paramInt, paramKeyEvent);
    switch (paramInt)
    {
    default:
      return bool;
    case 19:
    case 20:
    case 21:
    case 22:
    }
    int i = paramTextView.getSelectionStart();
    int j = paramTextView.getSelectionEnd();
    ff[] arrayOfff = (ff[])paramSpannable.getSpans(j, j, ff.class);
    int k = arrayOfff.length;
    for (int m = 0; ; m++)
    {
      int n;
      int i1;
      if (m < k)
      {
        ff localff = arrayOfff[m];
        n = paramSpannable.getSpanStart(localff);
        i1 = paramSpannable.getSpanEnd(localff);
        if ((i != j) || (j <= n) || (j >= i1))
          break label152;
        Selection.setSelection(paramSpannable, n, i1);
      }
      while (true)
      {
        return bool | false;
        label152: if ((i <= n) && (j > n))
        {
          Selection.setSelection(paramSpannable, Math.min(n, i), Math.max(i1, j));
        }
        else
        {
          if ((i < i1) || (j >= i1))
            break;
          Selection.setSelection(paramSpannable, Math.max(i1, i), Math.min(n, j));
        }
      }
    }
  }

  public final boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if ((i == 1) || (i == 0))
    {
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      int m = j - paramTextView.getTotalPaddingLeft();
      int n = k - paramTextView.getTotalPaddingTop();
      int i1 = m + paramTextView.getScrollX();
      int i2 = n + paramTextView.getScrollY();
      Layout localLayout = paramTextView.getLayout();
      int i3 = localLayout.getOffsetForHorizontal(localLayout.getLineForVertical(i2), i1);
      ff[] arrayOfff = (ff[])paramSpannable.getSpans(i3, i3, ff.class);
      if (arrayOfff.length != 0)
      {
        if (i == 0)
          Selection.setSelection(paramSpannable, paramSpannable.getSpanStart(arrayOfff[0]), paramSpannable.getSpanEnd(arrayOfff[0]));
        return true;
      }
    }
    return super.onTouchEvent(paramTextView, paramSpannable, paramMotionEvent);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
