package com.spotify.mobile.android.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.Spanned;
import com.spotify.android.paste.graphics.g;
import com.spotify.android.paste.graphics.h;
import com.spotify.android.paste.widget.f;

public final class ActionBarTitle
  implements Spanned, CharSequence
{
  private SpannableString a;
  private float b = 1.0F;
  private float c = 1.0F;

  public ActionBarTitle(Context paramContext, String paramString)
  {
    this(paramContext, paramString, false);
  }

  public ActionBarTitle(Context paramContext, String paramString, boolean paramBoolean)
  {
    if (paramString == null)
      paramString = "";
    if ((!f.a(paramContext)) && (!paramBoolean))
      paramString = paramString.toUpperCase(paramContext.getResources().getConfiguration().locale);
    if (paramBoolean);
    for (Typeface localTypeface = g.b(paramContext, 2130772386); ; localTypeface = g.b(paramContext, 2130772397))
    {
      SpannableString localSpannableString = new SpannableString(paramString);
      localSpannableString.setSpan(new h(localTypeface), 0, paramString.length(), 33);
      localSpannableString.setSpan(new ActionBarTitle.AlphaSpan(this), 0, paramString.length(), 33);
      this.a = localSpannableString;
      return;
    }
  }

  public final float a()
  {
    return this.b;
  }

  public final void a(float paramFloat)
  {
    this.b = paramFloat;
  }

  public final void b(float paramFloat)
  {
    this.c = paramFloat;
  }

  public final char charAt(int paramInt)
  {
    return this.a.charAt(paramInt);
  }

  public final int getSpanEnd(Object paramObject)
  {
    return this.a.getSpanEnd(paramObject);
  }

  public final int getSpanFlags(Object paramObject)
  {
    return this.a.getSpanFlags(paramObject);
  }

  public final int getSpanStart(Object paramObject)
  {
    return this.a.getSpanStart(paramObject);
  }

  public final <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass)
  {
    return this.a.getSpans(paramInt1, paramInt2, paramClass);
  }

  public final int length()
  {
    return this.a.length();
  }

  public final int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    return this.a.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }

  public final CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return this.a.subSequence(paramInt1, paramInt2);
  }

  public final String toString()
  {
    return this.a.toString();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.ActionBarTitle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
