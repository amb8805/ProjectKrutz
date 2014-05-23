package com.spotify.mobile.android.ui.stuff;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable;;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.c;
import com.spotify.android.paste.graphics.e;
import com.spotify.android.paste.widget.g;
import com.spotify.mobile.android.ui.b.d;
import com.spotify.mobile.android.util.bp;

public final class i
{
  public static Drawable a(Context paramContext)
  {
    return b(paramContext, SpotifyIcon.d);
  }

  private static Drawable a(Context paramContext, Drawable paramDrawable, SpotifyIcon paramSpotifyIcon)
  {
    switch (i.1.a[paramSpotifyIcon.ordinal()])
    {
    default:
      return paramDrawable;
    case 1:
    case 2:
    case 3:
    case 4:
      int i = g.a(paramContext, 2130772378);
      c localc = new c(paramDrawable, 0.6F);
      localc.a(i);
      return localc;
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
      return new d(paramDrawable, 0.66F);
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    }
    return new d(paramDrawable, 0.75F);
  }

  public static Drawable a(Context paramContext, SpotifyIcon paramSpotifyIcon)
  {
    return a(paramContext, c(paramContext, paramSpotifyIcon), paramSpotifyIcon);
  }

  public static Drawable b(Context paramContext)
  {
    return b(paramContext, SpotifyIcon.b);
  }

  public static Drawable b(Context paramContext, SpotifyIcon paramSpotifyIcon)
  {
    int i;
    switch (i.1.a[paramSpotifyIcon.ordinal()])
    {
    case 11:
    case 12:
    case 15:
    case 16:
    case 17:
    default:
      i = 0;
      if (i != 0);
    case 1:
    case 2:
    case 13:
    case 14:
    case 18:
    case 19:
    case 20:
    case 21:
    case 9:
    case 10:
    case 7:
    case 8:
    case 22:
    case 23:
    case 5:
    case 6:
    case 3:
    case 4:
    case 24:
    case 25:
    case 26:
    case 27:
    case 28:
    case 29:
    case 30:
    case 31:
    }
    for (Object localObject = null; ; localObject = paramContext.getResources().getDrawable(i))
    {
      if (localObject == null)
      {
        bp.d("No placeholder was pre-rendered for icon " + paramSpotifyIcon + "! Using createSpotifyIconDrawable.", new Object[0]);
        localObject = c(paramContext, paramSpotifyIcon);
        ((e)localObject).a();
      }
      return a(paramContext, (Drawable)localObject, paramSpotifyIcon);
      i = 2130837884;
      break;
      i = 2130837883;
      break;
      i = 2130837886;
      break;
      i = 2130837890;
      break;
      i = 2130837889;
      break;
      i = 2130837891;
      break;
      i = 2130837892;
      break;
      i = 2130837893;
      break;
      i = 2130837894;
      break;
      i = 2130837888;
      break;
      i = 2130837885;
      break;
      i = 2130837895;
      break;
      i = 2130837887;
      break;
    }
  }

  public static Drawable c(Context paramContext)
  {
    return b(paramContext, SpotifyIcon.Z);
  }

  private static e c(Context paramContext, SpotifyIcon paramSpotifyIcon)
  {
    e locale = new e(paramContext, paramSpotifyIcon);
    locale.a(g.a(paramContext, 2130772376));
    return locale;
  }

  public static Drawable d(Context paramContext)
  {
    return b(paramContext, SpotifyIcon.aL);
  }

  public static Drawable e(Context paramContext)
  {
    return a(paramContext, SpotifyIcon.d);
  }

  public static Drawable f(Context paramContext)
  {
    return a(paramContext, SpotifyIcon.Z);
  }

  public static Drawable g(Context paramContext)
  {
    return a(paramContext, SpotifyIcon.aL);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.stuff.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
