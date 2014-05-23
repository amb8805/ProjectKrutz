package com.spotify.mobile.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.e;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.f;
import com.spotify.android.paste.widget.h;
import java.util.List;

public final class aw extends ArrayAdapter<ax>
{
  public aw(Context paramContext, List<ax> paramList)
  {
    super(paramContext, 17367043, paramList);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ListItemView localListItemView;
    ax localax;
    e locale;
    if (paramView == null)
    {
      localListItemView = h.k(getContext(), paramViewGroup);
      localax = (ax)getItem(paramInt);
      localListItemView.d();
      if (localax.a())
      {
        SpotifyIcon localSpotifyIcon = SpotifyIcon.k;
        locale = new e(getContext(), localSpotifyIcon, getContext().getResources().getDimensionPixelSize(2131427415));
        if (!f.a(getContext()))
          break label153;
        locale.a(getContext().getResources().getColor(2131296458));
      }
    }
    while (true)
    {
      ImageView localImageView = new ImageView(getContext());
      localImageView.setImageDrawable(locale);
      localListItemView.b(localImageView);
      localListItemView.a(getContext().getString(localax.b()));
      return localListItemView;
      localListItemView = (ListItemView)paramView;
      break;
      label153: locale.a(getContext().getResources().getColor(2131296378));
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.aw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
