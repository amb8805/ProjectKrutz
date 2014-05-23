package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.c;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.graphics.e;
import com.spotify.android.paste.widget.f;

public final class k
{
  public static Drawable a(Context paramContext)
  {
    if (!f.a(paramContext))
      return a(paramContext, 60, 2);
    return paramContext.getResources().getDrawable(2130837755);
  }

  private static Drawable a(Context paramContext, int paramInt1, int paramInt2)
  {
    ColorStateList localColorStateList = paramContext.getResources().getColorStateList(2131296575);
    e locale = new e(paramContext, SpotifyIcon.X, d.b(paramInt1, paramContext.getResources()));
    locale.a(localColorStateList);
    return a(paramContext, paramInt2, localColorStateList, locale, 0.6F);
  }

  private static Drawable a(Context paramContext, SpotifyIcon paramSpotifyIcon, int paramInt)
  {
    return a(paramContext, paramSpotifyIcon, paramInt, paramContext.getResources().getColorStateList(2131296575));
  }

  private static Drawable a(Context paramContext, SpotifyIcon paramSpotifyIcon, int paramInt1, int paramInt2)
  {
    e locale = new e(paramContext, paramSpotifyIcon, paramInt1);
    locale.a(paramContext.getResources().getColor(paramInt2));
    return locale;
  }

  private static Drawable a(Context paramContext, SpotifyIcon paramSpotifyIcon, int paramInt, ColorStateList paramColorStateList)
  {
    e locale = new e(paramContext, paramSpotifyIcon, paramInt);
    locale.a(paramColorStateList);
    return locale;
  }

  private static c a(Context paramContext, int paramInt, ColorStateList paramColorStateList, Drawable paramDrawable, float paramFloat)
  {
    c localc = new c(paramDrawable, paramFloat);
    localc.a(d.b(paramInt, paramContext.getResources()));
    localc.a(paramColorStateList);
    localc.a(paramContext.getResources().getColor(2131296491));
    return localc;
  }

  public static Drawable b(Context paramContext)
  {
    if (!f.a(paramContext))
      return b(paramContext, 60, 2);
    return paramContext.getResources().getDrawable(2130837752);
  }

  private static Drawable b(Context paramContext, int paramInt1, int paramInt2)
  {
    ColorStateList localColorStateList = paramContext.getResources().getColorStateList(2131296575);
    e locale = new e(paramContext, SpotifyIcon.V, d.b(paramInt1, paramContext.getResources()));
    locale.a(localColorStateList);
    return a(paramContext, paramInt2, localColorStateList, locale, 0.6F);
  }

  private static Drawable b(Context paramContext, SpotifyIcon paramSpotifyIcon, int paramInt)
  {
    return a(paramContext, paramSpotifyIcon, paramInt, paramContext.getResources().getColorStateList(2131296571));
  }

  public static Drawable c(Context paramContext)
  {
    if (!f.a(paramContext))
      return a(paramContext, 16, 1);
    return paramContext.getResources().getDrawable(2130837780);
  }

  public static Drawable d(Context paramContext)
  {
    if (!f.a(paramContext))
      return b(paramContext, 16, 1);
    return paramContext.getResources().getDrawable(2130837779);
  }

  public static Drawable e(Context paramContext)
  {
    if (!f.a(paramContext))
      return a(paramContext, SpotifyIcon.ar, d.b(24.0F, paramContext.getResources()));
    return paramContext.getResources().getDrawable(2130837758);
  }

  public static Drawable f(Context paramContext)
  {
    if (!f.a(paramContext))
      return a(paramContext, SpotifyIcon.at, d.b(24.0F, paramContext.getResources()));
    return paramContext.getResources().getDrawable(2130837749);
  }

  public static Drawable g(Context paramContext)
  {
    if (!f.a(paramContext))
      return a(paramContext, SpotifyIcon.as, d.b(16.0F, paramContext.getResources()));
    return paramContext.getResources().getDrawable(2130837749);
  }

  public static Drawable h(Context paramContext)
  {
    if (!f.a(paramContext))
      return b(paramContext, SpotifyIcon.af, d.b(24.0F, paramContext.getResources()));
    return paramContext.getResources().getDrawable(2130838062);
  }

  public static Drawable i(Context paramContext)
  {
    if (!f.a(paramContext))
      return a(paramContext, SpotifyIcon.aP, d.b(24.0F, paramContext.getResources()), 2131296428);
    return paramContext.getResources().getDrawable(2130838018);
  }

  public static Drawable j(Context paramContext)
  {
    if (!f.a(paramContext))
      return a(paramContext, SpotifyIcon.ap, d.b(22.0F, paramContext.getResources()), 2131296434);
    return paramContext.getResources().getDrawable(2130837765);
  }

  public static Drawable k(Context paramContext)
  {
    if (!f.a(paramContext))
      return b(paramContext, SpotifyIcon.cL, d.b(24.0F, paramContext.getResources()));
    return paramContext.getResources().getDrawable(2130837786);
  }

  public static Drawable l(Context paramContext)
  {
    if (!f.a(paramContext))
    {
      int i = d.b(24.0F, paramContext.getResources());
      e locale1 = new e(paramContext, SpotifyIcon.l, i);
      e locale2 = new e(paramContext, SpotifyIcon.l, i);
      e locale3 = new e(paramContext, SpotifyIcon.ad, i);
      e locale4 = new e(paramContext, SpotifyIcon.ad, i);
      locale1.a(paramContext.getResources().getColor(2131296432));
      locale2.a(paramContext.getResources().getColor(2131296434));
      locale3.a(paramContext.getResources().getColor(2131296432));
      locale4.a(paramContext.getResources().getColor(2131296434));
      StateListDrawable localStateListDrawable = new StateListDrawable();
      localStateListDrawable.addState(new int[] { 16842912, 16842919 }, locale1);
      localStateListDrawable.addState(new int[] { 16842912 }, locale2);
      localStateListDrawable.addState(new int[] { 16842919 }, locale3);
      localStateListDrawable.addState(new int[0], locale4);
      return a(paramContext, 1, paramContext.getResources().getColorStateList(2131296572), localStateListDrawable, 0.8F);
    }
    return paramContext.getResources().getDrawable(2130837746);
  }

  public static Drawable m(Context paramContext)
  {
    if (!f.a(paramContext))
      return a(paramContext, SpotifyIcon.ap, d.b(22.0F, paramContext.getResources()), 2131296389);
    return paramContext.getResources().getDrawable(2130837764);
  }

  public static Drawable n(Context paramContext)
  {
    if (!f.a(paramContext))
      return a(paramContext, SpotifyIcon.aB, d.b(26.0F, paramContext.getResources()), paramContext.getResources().getColorStateList(2131296574));
    return paramContext.getResources().getDrawable(2130837773);
  }

  public static Drawable o(Context paramContext)
  {
    if (!f.a(paramContext))
      return a(paramContext, SpotifyIcon.az, d.b(26.0F, paramContext.getResources()), paramContext.getResources().getColorStateList(2131296573));
    return paramContext.getResources().getDrawable(2130837769);
  }

  public static Drawable p(Context paramContext)
  {
    if (!f.a(paramContext))
      return a(paramContext, SpotifyIcon.aj, d.b(22.0F, paramContext.getResources()), 2131296434);
    return paramContext.getResources().getDrawable(2130837762);
  }

  public static Drawable q(Context paramContext)
  {
    if (!f.a(paramContext))
      return a(paramContext, SpotifyIcon.aj, d.b(22.0F, paramContext.getResources()), 2131296389);
    return paramContext.getResources().getDrawable(2130837761);
  }

  public static Drawable r(Context paramContext)
  {
    if (!f.a(paramContext))
      return a(paramContext, SpotifyIcon.ct, d.b(22.0F, paramContext.getResources()), 2131296389);
    return paramContext.getResources().getDrawable(2130837763);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
