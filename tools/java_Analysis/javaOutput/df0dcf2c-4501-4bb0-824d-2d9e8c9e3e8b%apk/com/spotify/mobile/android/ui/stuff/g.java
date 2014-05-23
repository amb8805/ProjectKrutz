package com.spotify.mobile.android.ui.stuff;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.c;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.graphics.e;

public final class g
{
  public static View a(Context paramContext)
  {
    ImageButton localImageButton = a(paramContext, SpotifyIcon.cM);
    localImageButton.setOnClickListener(new g.1());
    return localImageButton;
  }

  public static ImageButton a(Context paramContext, SpotifyIcon paramSpotifyIcon)
  {
    e locale = new e(paramContext, paramSpotifyIcon);
    locale.a(com.spotify.android.paste.widget.g.b(paramContext, 2130772374));
    locale.a(d.b(24.0F, paramContext.getResources()));
    ImageButton localImageButton = new ImageButton(paramContext, null, 2130772420);
    localImageButton.setFocusable(false);
    localImageButton.setImageDrawable(locale);
    localImageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    localImageButton.setPadding(paramContext.getResources().getDimensionPixelSize(2131427471), 0, 0, 0);
    localImageButton.setMinimumWidth(0);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
    localLayoutParams.setMargins(0, 0, 0, 0);
    localImageButton.setLayoutParams(localLayoutParams);
    return localImageButton;
  }

  public static c a(Context paramContext, Drawable paramDrawable)
  {
    c localc = new c(paramDrawable, 0.6F);
    localc.a(paramContext.getResources().getColorStateList(2131296577));
    localc.a(d.b(2.0F, paramContext.getResources()));
    return localc;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.stuff.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
