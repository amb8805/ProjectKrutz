package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.support.v4.widget.a;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.model.d;
import com.spotify.mobile.android.provider.i;
import com.spotify.mobile.android.ui.view.DownloadIndicatorView;
import com.spotify.mobile.android.util.Collection;
import com.spotify.mobile.android.util.am;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public final class AlbumsAdapter extends a
{
  private AlbumsAdapter.Options j;
  private String k;
  private String l;
  private dd m = (dd)c.a(dd.class);

  public AlbumsAdapter(Context paramContext, AlbumsAdapter.Options paramOptions)
  {
    super(paramContext);
    this.j = paramOptions;
    this.k = this.d.getResources().getString(2131690130);
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    ListItemView localListItemView = (ListItemView)paramView;
    d locald = new d();
    locald.b = paramCursor.getInt(0);
    locald.c = am.a(paramCursor, 1, "");
    locald.d = paramCursor.getString(2);
    locald.e = paramCursor.getString(3);
    locald.h = am.a(paramCursor, 9);
    locald.i = am.a(paramCursor, 10);
    locald.j = am.a(paramCursor, 11);
    locald.k = am.a(paramCursor, 12);
    locald.o = am.a(paramCursor, 15);
    locald.p = am.a(paramCursor, 16);
    locald.l = am.a(paramCursor, 19);
    locald.m = paramCursor.getInt(17);
    locald.n = paramCursor.getInt(18);
    locald.f = am.a(paramCursor, 4, "");
    locald.g = paramCursor.getString(5);
    locald.u = am.a(paramCursor, 7, "");
    locald.q = paramCursor.getInt(13);
    locald.r = paramCursor.getInt(14);
    locald.v = Collection.a(locald.q, locald.r);
    locald.s = paramCursor.getString(21);
    locald.t = paramCursor.getString(6);
    localListItemView.b(true);
    localListItemView.a(locald.t_());
    localListItemView.c(locald.o);
    boolean bool1;
    boolean bool2;
    if ((this.l != null) && (this.l.equals(locald.e())))
    {
      bool1 = true;
      localListItemView.setActivated(bool1);
      if ((!locald.m()) && (!this.j.b()))
        break label556;
      bool2 = true;
      label354: localListItemView.setEnabled(bool2);
      localListItemView.setTag(locald);
      this.m.a().a(i.a(locald.s)).a(2130837634).a(localListItemView.a());
      localListItemView.a().setVisibility(0);
      switch (AlbumsAdapter.1.a[this.j.a().ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      DownloadIndicatorView localDownloadIndicatorView = (DownloadIndicatorView)localListItemView.h();
      localListItemView.c(localDownloadIndicatorView);
      localDownloadIndicatorView.a(this.j.c());
      localDownloadIndicatorView.a(locald.c(), locald.n);
      if (localDownloadIndicatorView.a())
      {
        Context localContext = this.d;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(locald.n);
        localListItemView.c(localContext.getString(2131689974, arrayOfObject2));
      }
      return;
      bool1 = false;
      break;
      label556: bool2 = false;
      break label354;
      if (TextUtils.isEmpty(locald.g()));
      for (String str2 = this.k; ; str2 = locald.g())
      {
        localListItemView.b(str2);
        break;
      }
      if (TextUtils.isEmpty(locald.u));
      for (String str1 = this.k; ; str1 = locald.u)
      {
        localListItemView.b(str1);
        break;
      }
      if (locald.q <= 0)
      {
        Resources localResources2 = this.d.getResources();
        int n = locald.r;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(locald.r);
        localListItemView.c(localResources2.getQuantityString(2131623943, n, arrayOfObject3));
      }
      else if (locald.r == locald.q)
      {
        localListItemView.c(this.d.getResources().getString(2131689653));
      }
      else
      {
        Resources localResources1 = this.d.getResources();
        int i = locald.q;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(locald.r);
        arrayOfObject1[1] = Integer.valueOf(locald.q);
        localListItemView.c(localResources1.getQuantityString(2131623941, i, arrayOfObject1));
      }
    }
  }

  public final void a(String paramString)
  {
    this.l = paramString;
    notifyDataSetChanged();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.AlbumsAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
