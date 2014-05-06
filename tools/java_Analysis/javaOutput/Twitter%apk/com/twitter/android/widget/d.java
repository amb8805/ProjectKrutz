package com.twitter.android.widget;

import ag;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageButton;
import android.widget.TextView;
import be;
import com.twitter.android.client.j;
import com.twitter.android.provider.ax;
import dl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d
{
  public static void a(Resources paramResources, TextView paramTextView, String paramString, be parambe, o paramo)
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(paramString);
    int i = paramResources.getColor(2131361797);
    if (paramo == null);
    for (int j = i; ; j = paramResources.getColor(2131361805))
    {
      Matcher localMatcher1 = ag.c.matcher(paramString);
      while (localMatcher1.find())
      {
        int i5 = localMatcher1.start();
        int i6 = localMatcher1.end();
        localSpannableStringBuilder.setSpan(new ForegroundColorSpan(j), i5, i5 + 1, 33);
        localSpannableStringBuilder.setSpan(new a(i, paramString.substring(i5, i6), paramo), i5 + 1, i6, 33);
      }
    }
    Matcher localMatcher2;
    if ((parambe == null) || (parambe.a == null) || (parambe.a.isEmpty()))
      localMatcher2 = ag.a.matcher(paramString);
    int k;
    dl localdl2;
    int m;
    int n;
    int i4;
    int i1;
    while (localMatcher2.find())
    {
      dl localdl1 = new dl();
      localdl1.c = localMatcher2.group();
      localSpannableStringBuilder.setSpan(new f(i, paramo, localdl1), localMatcher2.start(), localMatcher2.end(), 33);
      continue;
      k = 0;
      Iterator localIterator = parambe.a.iterator();
      while (localIterator.hasNext())
      {
        localdl2 = (dl)localIterator.next();
        m = localdl2.a - k;
        n = localdl2.b - k;
        if ((m >= 0) && (n <= localSpannableStringBuilder.length()))
        {
          String str = localdl2.e;
          if (TextUtils.isEmpty(str))
            break label381;
          localSpannableStringBuilder.replace(m, n, str);
          int i3 = n - (m + str.length());
          i4 = n - i3;
          i1 = k + i3;
        }
      }
    }
    for (int i2 = i4; ; i2 = n)
    {
      localSpannableStringBuilder.setSpan(new f(i, paramo, localdl2), m, i2, 33);
      k = i1;
      break;
      paramTextView.setText(localSpannableStringBuilder);
      return;
      label381: i1 = k;
    }
  }

  public static void a(j paramj, ax paramax, ImageButton paramImageButton1, ImageButton paramImageButton2, ImageButton paramImageButton3, ImageButton paramImageButton4)
  {
    if (paramax.l)
      paramImageButton1.setImageResource(2130837625);
    while (paramax.q == paramj.g())
      if (paramax.r)
      {
        paramImageButton3.setImageResource(2130837642);
        return;
        paramImageButton1.setImageResource(2130837621);
      }
      else
      {
        paramImageButton2.setVisibility(0);
        paramImageButton3.setVisibility(8);
        return;
      }
    paramImageButton2.setVisibility(8);
    if (paramax.D > 0L);
    for (int i = 2130837642; ; i = 2130837638)
    {
      paramImageButton3.setImageResource(i);
      paramImageButton3.setVisibility(0);
      if (!paramax.m)
        break;
      paramImageButton3.setEnabled(false);
      paramImageButton4.setEnabled(false);
      return;
    }
    paramImageButton3.setEnabled(true);
    paramImageButton4.setEnabled(true);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
