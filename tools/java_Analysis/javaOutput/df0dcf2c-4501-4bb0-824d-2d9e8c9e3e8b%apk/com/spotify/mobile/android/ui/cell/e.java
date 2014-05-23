package com.spotify.mobile.android.ui.cell;

import android.content.Context;
import android.view.LayoutInflater;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.c.a;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.ui.stuff.g;
import com.spotify.mobile.android.ui.view.DownloadIndicatorView;

public class e
  implements a
{
  public e()
  {
  }

  public static ListItemView a(Context paramContext)
  {
    if (FeatureFragment.h.a());
    for (ListItemView localListItemView = h.i(paramContext, null); ; localListItemView = h.h(paramContext, null))
    {
      localListItemView.b(g.a(paramContext));
      localListItemView.c((DownloadIndicatorView)LayoutInflater.from(paramContext).inflate(2130903123, null));
      return localListItemView;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
