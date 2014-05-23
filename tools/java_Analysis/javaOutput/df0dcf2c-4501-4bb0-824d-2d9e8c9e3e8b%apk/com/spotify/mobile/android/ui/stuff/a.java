package com.spotify.mobile.android.ui.stuff;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.c;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.graphics.e;
import com.spotify.android.paste.widget.g;

public final class a
{
  private static final int[] a = { 16842914 };
  private static final int[] b = new int[0];

  public static ImageButton a(Context paramContext)
  {
    SpotifyIcon localSpotifyIcon1 = SpotifyIcon.V;
    SpotifyIcon localSpotifyIcon2 = SpotifyIcon.ah;
    int i = d.b(32.0F, paramContext.getResources());
    e locale1 = new e(paramContext, localSpotifyIcon1);
    e locale2 = new e(paramContext, localSpotifyIcon2);
    StateListDrawable localStateListDrawable = new StateListDrawable();
    localStateListDrawable.addState(a, a(paramContext, locale1));
    localStateListDrawable.addState(b, a(paramContext, locale2));
    ImageButton localImageButton = new ImageButton(paramContext);
    localImageButton.setBackgroundResource(0);
    localImageButton.setFocusable(false);
    localImageButton.setLayoutParams(new LinearLayout.LayoutParams(i, i));
    localImageButton.setImageDrawable(localStateListDrawable);
    localImageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
    localImageButton.setPadding(0, 0, 0, 0);
    localImageButton.setDuplicateParentStateEnabled(true);
    return localImageButton;
  }

  private static c a(Context paramContext, Drawable paramDrawable)
  {
    c localc = new c(paramDrawable, 0.6F);
    localc.a(g.a(paramContext, 2130772375));
    localc.b(g.a(paramContext, 2130772382));
    localc.a(d.b(2.0F, paramContext.getResources()));
    return localc;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.stuff.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
