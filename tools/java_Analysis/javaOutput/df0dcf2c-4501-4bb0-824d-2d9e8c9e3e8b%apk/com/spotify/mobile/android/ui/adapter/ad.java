package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.support.v4.widget.a;
import android.view.View;
import android.widget.TextView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.model.h;

public final class ad extends a
{
  private static final ab k = new ad.1();
  private String j = this.d.getResources().getString(2131690130);

  public ad(Context paramContext)
  {
    super(paramContext);
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    ListItemView localListItemView = (ListItemView)paramView;
    h localh = new h();
    localh.a(paramCursor, this.j);
    ac.a(paramContext, localListItemView, localh, k);
    localListItemView.b().setTextColor(paramContext.getResources().getColorStateList(2130838196));
    localListItemView.c().setTextColor(paramContext.getResources().getColorStateList(2130838195));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.ad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
