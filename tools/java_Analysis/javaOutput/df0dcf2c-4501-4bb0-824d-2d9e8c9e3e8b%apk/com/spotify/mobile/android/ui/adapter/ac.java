package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.model.h;
import com.spotify.mobile.android.provider.i;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.ui.stuff.g;
import com.spotify.mobile.android.ui.view.DownloadIndicatorView;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public final class ac
{
  public static void a(Context paramContext, ListItemView paramListItemView, h paramh, ab paramab)
  {
    paramListItemView.b(true);
    paramListItemView.b(g.a(paramContext));
    paramListItemView.setTag(paramh);
    ImageView localImageView = paramListItemView.a();
    int i;
    if (paramab.a())
    {
      ((dd)c.a(dd.class)).a().a(i.a(paramh.g)).a(2130837634).a(localImageView);
      if (f.a(paramContext))
      {
        if (!paramh.p)
          break label261;
        i = 1;
        label81: paramListItemView.b().setTypeface(null, i);
        paramListItemView.c().setTypeface(null, i);
      }
      paramListItemView.a(paramh.p());
      if (!paramab.b())
        break label267;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramh.m());
      localStringBuilder.append(" • ");
      localStringBuilder.append(paramh.o());
      paramListItemView.b(localStringBuilder.toString());
    }
    while (true)
    {
      paramListItemView.c(paramh.p);
      paramListItemView.setEnabled(paramh.c());
      boolean bool1 = FeatureFragment.h.a();
      boolean bool2 = false;
      if (!bool1)
        bool2 = true;
      paramListItemView.a(bool2);
      DownloadIndicatorView localDownloadIndicatorView = (DownloadIndicatorView)LayoutInflater.from(paramContext).inflate(2130903123, null);
      paramListItemView.c(localDownloadIndicatorView);
      localDownloadIndicatorView.a(true);
      localDownloadIndicatorView.a(paramh.i());
      return;
      ((dd)c.a(dd.class)).a().a(localImageView);
      break;
      label261: i = 0;
      break label81;
      label267: paramListItemView.b(paramh.m());
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.ac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
