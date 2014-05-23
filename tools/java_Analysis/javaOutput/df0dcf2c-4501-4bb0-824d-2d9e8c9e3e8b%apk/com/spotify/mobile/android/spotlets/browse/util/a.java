package com.spotify.mobile.android.spotlets.browse.util;

import android.content.Context;
import android.content.res.Resources;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.paste.widget.CardView;

public final class a
{
  public static CardView a(Context paramContext)
  {
    CardView localCardView = new CardView(paramContext);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0F);
    int i = paramContext.getResources().getDimensionPixelSize(2131427361);
    localLayoutParams.leftMargin = i;
    localLayoutParams.rightMargin = i;
    localCardView.setLayoutParams(localLayoutParams);
    return localCardView;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.util.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
