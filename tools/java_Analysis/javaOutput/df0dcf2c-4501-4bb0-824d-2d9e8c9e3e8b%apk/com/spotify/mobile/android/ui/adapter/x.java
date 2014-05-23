package com.spotify.mobile.android.ui.adapter;

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
import com.spotify.mobile.android.util.cv;
import java.util.List;

public final class x extends ArrayAdapter<cv>
{
  private int a = -1;

  public x(Context paramContext, List<cv> paramList, int paramInt)
  {
    super(paramContext, 17367043, paramList);
    this.a = paramInt;
  }

  private View a(SpotifyIcon paramSpotifyIcon)
  {
    e locale = new e(getContext(), paramSpotifyIcon, getContext().getResources().getDimension(2131427415));
    if (f.a(getContext()))
      locale.a(getContext().getResources().getColor(2131296458));
    while (true)
    {
      ImageView localImageView = new ImageView(getContext());
      localImageView.setImageDrawable(locale);
      return localImageView;
      locale.a(getContext().getResources().getColor(2131296378));
    }
  }

  public final int a()
  {
    return this.a;
  }

  public final void a(int paramInt)
  {
    if (this.a != paramInt)
    {
      this.a = paramInt;
      notifyDataSetChanged();
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ListItemView localListItemView;
    cv localcv;
    if (paramView == null)
    {
      localListItemView = h.k(getContext(), paramViewGroup);
      localcv = (cv)getItem(paramInt);
      localListItemView.d();
      if (this.a == paramInt)
      {
        if (localcv.d())
          break label92;
        localListItemView.b(a(SpotifyIcon.k));
      }
    }
    while (true)
    {
      localListItemView.a(getContext().getString(localcv.c()));
      localListItemView.a(false);
      return localListItemView;
      localListItemView = (ListItemView)paramView;
      break;
      label92: if (localcv.e())
        localListItemView.b(a(SpotifyIcon.bU));
      else
        localListItemView.b(a(SpotifyIcon.bW));
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
