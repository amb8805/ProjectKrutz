package com.spotify.mobile.android.spotlets.collection.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.model.e;
import com.spotify.mobile.android.ui.view.DownloadIndicatorView;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public final class b extends android.support.v4.widget.a
{
  private String j;
  private Drawable k;
  private boolean l;

  public b(Context paramContext)
  {
    super(paramContext);
    this.k = com.spotify.mobile.android.ui.stuff.i.e(paramContext);
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    ListItemView localListItemView = (ListItemView)paramView;
    e locale = new e();
    locale.a(paramCursor);
    localListItemView.b(true);
    localListItemView.a(locale.t_());
    localListItemView.setTag(locale);
    localListItemView.c(locale.i());
    localListItemView.setEnabled(true);
    boolean bool;
    int i;
    if ((this.j != null) && (this.j.equals(locale.d())))
    {
      bool = true;
      localListItemView.setActivated(bool);
      ae localae = ((dd)c.a(dd.class)).a().a(com.spotify.mobile.android.provider.i.a(locale.f()));
      localae.a(com.spotify.mobile.android.ui.b.a.a());
      localae.a(this.k);
      localae.a(localListItemView.a());
      localListItemView.a().setVisibility(0);
      i = locale.g();
      if (this.l)
        i = locale.h();
      if (!locale.j())
        break label307;
      Resources localResources2 = this.d.getResources();
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(i);
      localListItemView.c(localResources2.getQuantityString(2131623944, i, arrayOfObject3));
    }
    while (true)
    {
      DownloadIndicatorView localDownloadIndicatorView = (DownloadIndicatorView)localListItemView.h();
      localDownloadIndicatorView.a(true);
      localDownloadIndicatorView.a(locale.a(), locale.c());
      if (localDownloadIndicatorView.a())
      {
        Context localContext = this.d;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(locale.c());
        localListItemView.c(localContext.getString(2131689974, arrayOfObject2));
      }
      return;
      bool = false;
      break;
      label307: Resources localResources1 = this.d.getResources();
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(i);
      localListItemView.c(localResources1.getQuantityString(2131623943, i, arrayOfObject1));
    }
  }

  public final void a(String paramString)
  {
    this.j = paramString;
    notifyDataSetChanged();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.collection.adapter.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
