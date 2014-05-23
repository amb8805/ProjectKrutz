package com.spotify.mobile.android.util;

import android.text.Spannable;
import android.text.style.URLSpan;

public final class HtmlUtil
{
  public static void a(Spannable paramSpannable, bd parambd)
  {
    for (URLSpan localURLSpan : (URLSpan[])paramSpannable.getSpans(0, paramSpannable.length(), URLSpan.class))
    {
      int k = paramSpannable.getSpanStart(localURLSpan);
      int m = paramSpannable.getSpanEnd(localURLSpan);
      paramSpannable.removeSpan(localURLSpan);
      paramSpannable.setSpan(new HtmlUtil.UnderlineFreeClickableSpan(localURLSpan.getURL(), parambd), k, m, 0);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.HtmlUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
