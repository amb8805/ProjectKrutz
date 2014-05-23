package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.model.j;
import com.spotify.mobile.android.ui.view.DownloadIndicatorView;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public final class a extends android.support.v4.widget.a
{
  private String j;
  private Drawable k;
  private Drawable l;
  private Drawable m;

  public a(Context paramContext)
  {
    super(paramContext);
    this.j = paramContext.getString(2131690130);
    this.k = com.spotify.mobile.android.ui.stuff.i.a(paramContext, SpotifyIcon.ab);
    this.l = com.spotify.mobile.android.ui.stuff.i.a(paramContext, SpotifyIcon.av);
    this.m = com.spotify.mobile.android.ui.stuff.i.f(paramContext);
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    ListItemView localListItemView = (ListItemView)paramView;
    com.spotify.mobile.android.model.f localf = new com.spotify.mobile.android.model.f();
    localf.a(paramCursor, this.j);
    localListItemView.b(true);
    localListItemView.setTag(localf);
    ImageView localImageView = localListItemView.a();
    StringBuilder localStringBuilder1;
    if ((localf.k()) || ((localf.m()) && (localf.r_())))
    {
      ((dd)c.a(dd.class)).a().a(localImageView);
      localImageView.setScaleType(ImageView.ScaleType.CENTER);
      if (localf.k())
        if (com.spotify.android.paste.widget.f.a(paramContext))
        {
          localImageView.setImageResource(2130838065);
          localListItemView.a(localf.a(paramContext));
          ((DownloadIndicatorView)localListItemView.h()).a(localf.f(), localf.g());
          localStringBuilder1 = new StringBuilder();
          if ((!localf.r_()) && (!TextUtils.isEmpty(localf.a())))
          {
            Context localContext = this.d;
            Object[] arrayOfObject4 = new Object[1];
            arrayOfObject4[0] = localf.a();
            localStringBuilder1.append(localContext.getString(2131690151, arrayOfObject4));
            localStringBuilder1.append(" — ");
          }
          if (!localf.k())
            break label500;
          Resources localResources2 = this.d.getResources();
          int n = localf.d();
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(localf.d());
          localStringBuilder1.append(localResources2.getQuantityString(2131623954, n, arrayOfObject2));
          if (localf.e() > 0)
          {
            StringBuilder localStringBuilder2 = localStringBuilder1.append(", ");
            Resources localResources3 = this.d.getResources();
            int i1 = localf.e();
            Object[] arrayOfObject3 = new Object[1];
            arrayOfObject3[0] = Integer.valueOf(localf.e());
            localStringBuilder2.append(localResources3.getQuantityString(2131623953, i1, arrayOfObject3));
          }
        }
    }
    while (true)
    {
      localListItemView.b(localStringBuilder1.toString());
      localListItemView.setEnabled(true);
      return;
      localImageView.setImageDrawable(this.k);
      break;
      if (com.spotify.android.paste.widget.f.a(paramContext))
      {
        localImageView.setImageResource(2130838066);
        break;
      }
      localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
      localImageView.setImageDrawable(this.l);
      break;
      ae localae = ((dd)c.a(dd.class)).a().a(com.spotify.mobile.android.provider.i.a(localf.c()));
      if (com.spotify.android.paste.widget.f.a(paramContext))
        localae.a(2130837638);
      while (true)
      {
        localae.a(localImageView);
        localImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        break;
        localae.a(this.m);
      }
      label500: Resources localResources1 = this.d.getResources();
      int i = localf.d();
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(localf.d());
      localStringBuilder1.append(localResources1.getQuantityString(2131623955, i, arrayOfObject1));
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
