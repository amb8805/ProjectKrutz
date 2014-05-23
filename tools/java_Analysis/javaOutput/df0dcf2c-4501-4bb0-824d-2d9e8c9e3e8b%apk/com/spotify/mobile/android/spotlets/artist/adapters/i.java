package com.spotify.mobile.android.spotlets.artist.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.spotlets.artist.view.b.c;

public final class i extends BaseAdapter
{
  private final Context a;
  private final String b;
  private final c c;

  public i(Context paramContext, String paramString, c paramc)
  {
    this.b = paramString;
    this.a = paramContext;
    this.c = paramc;
  }

  public final int getCount()
  {
    if (TextUtils.isEmpty(this.b))
      return 0;
    return 1;
  }

  public final Object getItem(int paramInt)
  {
    return this.b;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (ListItemView localListItemView = new ListItemView(this.a); ; localListItemView = (ListItemView)paramView)
    {
      localListItemView.d();
      localListItemView.a(this.b);
      localListItemView.b().setSingleLine(false);
      localListItemView.b().setMaxLines(2);
      localListItemView.setTag(this.c);
      ImageView localImageView = new ImageView(this.a);
      localImageView.setImageResource(2130838096);
      localListItemView.b(localImageView);
      return localListItemView;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.adapters.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
