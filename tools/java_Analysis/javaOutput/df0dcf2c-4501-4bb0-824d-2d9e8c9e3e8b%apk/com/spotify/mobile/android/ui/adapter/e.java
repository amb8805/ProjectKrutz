package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.f;
import com.spotify.android.paste.widget.g;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.provider.i;
import com.spotify.mobile.android.util.am;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public final class e extends b
{
  public static final String[] l = { "_id", "name", "uri", "image_uri" };
  private dd m = (dd)com.spotify.mobile.android.c.c.a(dd.class);
  private final boolean n;

  public e(Context paramContext, int paramInt, c paramc)
  {
    super(paramContext, paramInt, paramc);
    this.n = f.a(paramContext);
  }

  public final View a(ViewGroup paramViewGroup)
  {
    Context localContext = paramViewGroup.getContext();
    ListItemView localListItemView = h.j(localContext, paramViewGroup);
    if (!this.n)
    {
      com.spotify.android.paste.graphics.e locale = new com.spotify.android.paste.graphics.e(localContext, SpotifyIcon.ah);
      locale.a(g.b(localContext, 2130772374));
      ImageView localImageView = localListItemView.a();
      int i = d.b(18.0F, localContext.getResources());
      ViewGroup.LayoutParams localLayoutParams = localImageView.getLayoutParams();
      localLayoutParams.width = i;
      localLayoutParams.height = i;
      localImageView.setImageDrawable(locale);
      localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
      int j = localListItemView.getPaddingLeft();
      int k = localListItemView.getPaddingTop();
      int i1 = localListItemView.getPaddingRight();
      int i2 = localListItemView.getPaddingBottom();
      g.a(localListItemView, this.d.getResources().getDrawable(2130837865));
      localListItemView.setPadding(j, k, i1, i2);
    }
    localListItemView.c().setVisibility(8);
    localListItemView.setFocusable(false);
    return localListItemView;
  }

  public final void a(View paramView, Cursor paramCursor)
  {
    ListItemView localListItemView = (ListItemView)paramView;
    String str1 = am.a(paramCursor, 1, localListItemView.getContext().getString(2131690130));
    String str2 = am.a(paramCursor, 2, "");
    String str3 = am.a(paramCursor, 3, "");
    localListItemView.setTag(str2);
    localListItemView.a(str1);
    ImageView localImageView;
    if (this.n)
    {
      localImageView = localListItemView.a();
      if (!TextUtils.isEmpty(str3))
      {
        localImageView.setVisibility(0);
        this.m.a().a(i.a(str3)).a(2130838181).a(localImageView);
      }
    }
    else
    {
      return;
    }
    localImageView.setVisibility(8);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
