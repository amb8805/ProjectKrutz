package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.a;
import android.view.View;
import android.widget.Filter;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public final class af extends a
{
  private Filter j;
  private final String k;

  public af(Context paramContext)
  {
    super(paramContext);
    this.k = paramContext.getString(2131690130);
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    ListItemView localListItemView = (ListItemView)paramView;
    com.spotify.mobile.android.model.i locali1 = (com.spotify.mobile.android.model.i)paramView.getTag();
    com.spotify.mobile.android.model.i locali3;
    if (locali1 == null)
    {
      locali3 = com.spotify.mobile.android.model.i.a(paramCursor, this.k);
      localListItemView.setTag(locali3);
    }
    for (com.spotify.mobile.android.model.i locali2 = locali3; ; locali2 = locali1)
    {
      localListItemView.a(locali2.a());
      ((dd)c.a(dd.class)).a().a(com.spotify.mobile.android.provider.i.a(locali2.d())).a(2130837640).b(2130837640).a(localListItemView.a());
      localListItemView.setEnabled(locali2.c());
      return;
      locali1.b(paramCursor, this.k);
    }
  }

  public final void a(Filter paramFilter)
  {
    this.j = paramFilter;
  }

  public final Filter getFilter()
  {
    return this.j;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
