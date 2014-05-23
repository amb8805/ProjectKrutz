package com.spotify.mobile.android.ui.stuff;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.graphics.e;
import com.spotify.android.paste.widget.h;
import java.util.Locale;

public final class f
{
  public static Button a(Context paramContext, ViewGroup paramViewGroup)
  {
    return a(paramContext, paramViewGroup, SpotifyIcon.bD, 2131689999);
  }

  public static Button a(Context paramContext, ViewGroup paramViewGroup, SpotifyIcon paramSpotifyIcon, int paramInt)
  {
    Button localButton = h.d(paramContext, paramViewGroup);
    e locale = new e(paramContext, paramSpotifyIcon);
    locale.a(localButton.getTextColors());
    locale.a(d.b(18.0F, paramContext.getResources()));
    int i = d.a(48.0F, paramContext.getResources());
    localButton.setPadding(i, 0, i, 0);
    localButton.setCompoundDrawablesWithIntrinsicBounds(locale, null, null, null);
    localButton.setCompoundDrawablePadding(d.a(8.0F, paramContext.getResources()));
    localButton.setText(paramContext.getString(paramInt).toUpperCase(Locale.getDefault()));
    return localButton;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.stuff.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
