package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.a;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.model.j;
import com.spotify.mobile.android.ui.view.DownloadIndicatorView;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public final class o extends a
{
  private String j;
  private String k;
  private Drawable l;
  private Drawable m;
  private Drawable n;

  public o(Context paramContext)
  {
    super(paramContext);
    this.k = paramContext.getString(2131690130);
    this.l = com.spotify.mobile.android.ui.stuff.i.a(paramContext, SpotifyIcon.ab);
    this.m = com.spotify.mobile.android.ui.stuff.i.a(paramContext, SpotifyIcon.av);
    this.n = com.spotify.mobile.android.ui.stuff.i.f(paramContext);
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    int i = 1;
    ListItemView localListItemView = (ListItemView)paramView;
    com.spotify.mobile.android.model.f localf = new com.spotify.mobile.android.model.f();
    localf.a(paramCursor, this.k);
    localListItemView.b(i);
    localListItemView.setTag(localf);
    View localView = localListItemView.f();
    int i1;
    label87: ImageView localImageView;
    ae localae;
    label179: label194: String str;
    boolean bool;
    if (localf.k())
    {
      i1 = 8;
      localView.setVisibility(i1);
      if (com.spotify.android.paste.widget.f.a(paramContext))
      {
        if (!localf.i())
          break label359;
        int i5 = i;
        localListItemView.b().setTypeface(null, i5);
        localListItemView.c().setTypeface(null, i5);
      }
      localImageView = localListItemView.a();
      if ((localf.k()) || ((localf.m()) && (localf.r_())))
        break label378;
      localae = ((dd)c.a(dd.class)).a().a(com.spotify.mobile.android.provider.i.a(localf.c()));
      if (!com.spotify.android.paste.widget.f.a(paramContext))
        break label365;
      localae.a(2130837638);
      localae.a(localImageView);
      localImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
      localListItemView.a(localf.a(paramContext));
      DownloadIndicatorView localDownloadIndicatorView = (DownloadIndicatorView)localListItemView.h();
      localDownloadIndicatorView.a(localf.f(), localf.g());
      if (!localDownloadIndicatorView.a())
        break label524;
      Context localContext2 = this.d;
      Object[] arrayOfObject5 = new Object[i];
      arrayOfObject5[0] = Integer.valueOf(localf.g());
      str = localContext2.getString(2131689974, arrayOfObject5);
      localListItemView.b(str);
      if ((!localf.s()) || (TextUtils.isEmpty(localf.s_())))
        break label819;
      bool = i;
      label306: localListItemView.setEnabled(bool);
      if ((this.j == null) || (!this.j.equals(localf.s_())))
        break label825;
    }
    while (true)
    {
      localListItemView.setActivated(i);
      localListItemView.c(localf.i());
      return;
      i1 = 0;
      break;
      label359: int i6 = 0;
      break label87;
      label365: localae.a(this.n);
      break label179;
      label378: ((dd)c.a(dd.class)).a().a(localImageView);
      localImageView.setScaleType(ImageView.ScaleType.CENTER);
      if (localf.q())
      {
        localImageView.setImageResource(2130838064);
        break label194;
      }
      if (localf.k())
      {
        if (com.spotify.android.paste.widget.f.a(paramContext))
        {
          localImageView.setImageResource(2130838065);
          break label194;
        }
        localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        localImageView.setImageDrawable(this.l);
        break label194;
      }
      if (localf.m())
      {
        if (com.spotify.android.paste.widget.f.a(paramContext))
        {
          localImageView.setImageResource(2130838066);
          break label194;
        }
        localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        localImageView.setImageDrawable(this.m);
        break label194;
      }
      localImageView.setImageResource(2130838063);
      break label194;
      label524: StringBuilder localStringBuilder1 = new StringBuilder();
      if ((!localf.r_()) && (!TextUtils.isEmpty(localf.a())))
      {
        Context localContext1 = this.d;
        Object[] arrayOfObject4 = new Object[i];
        arrayOfObject4[0] = localf.a();
        localStringBuilder1.append(localContext1.getString(2131690151, arrayOfObject4));
        localStringBuilder1.append(" • ");
      }
      if (localf.k())
      {
        Resources localResources2 = this.d.getResources();
        int i3 = localf.d();
        Object[] arrayOfObject2 = new Object[i];
        arrayOfObject2[0] = Integer.valueOf(localf.d());
        localStringBuilder1.append(localResources2.getQuantityString(2131623954, i3, arrayOfObject2));
        if (localf.e() > 0)
        {
          StringBuilder localStringBuilder2 = localStringBuilder1.append(", ");
          Resources localResources3 = this.d.getResources();
          int i4 = localf.e();
          Object[] arrayOfObject3 = new Object[i];
          arrayOfObject3[0] = Integer.valueOf(localf.e());
          localStringBuilder2.append(localResources3.getQuantityString(2131623953, i4, arrayOfObject3));
        }
      }
      while (true)
      {
        str = localStringBuilder1.toString();
        break;
        Resources localResources1 = this.d.getResources();
        int i2 = localf.d();
        Object[] arrayOfObject1 = new Object[i];
        arrayOfObject1[0] = Integer.valueOf(localf.d());
        localStringBuilder1.append(localResources1.getQuantityString(2131623955, i2, arrayOfObject1));
      }
      label819: bool = false;
      break label306;
      label825: i = 0;
    }
  }

  public final void a(String paramString)
  {
    this.j = paramString;
    notifyDataSetChanged();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
