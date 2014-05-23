package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.support.v4.widget.a;
import android.view.View;
import android.widget.TextView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.g;
import com.spotify.mobile.android.model.h;

public final class ae extends a
{
  private static final ab j = new ae.1();
  private final String k;
  private boolean l;
  private final int m;
  private final ColorStateList n;
  private final ColorStateList o;
  private final ColorStateList p;

  public ae(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    this.k = paramContext.getResources().getString(2131690130);
    this.l = paramBoolean;
    this.n = paramContext.getResources().getColorStateList(2130838196);
    this.o = paramContext.getResources().getColorStateList(2130838195);
    this.p = g.b(paramContext, 2130772382);
    Resources localResources = paramContext.getResources();
    if (this.l);
    for (int i = 2131296395; ; i = 2131296527)
    {
      this.m = localResources.getColor(i);
      return;
    }
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    ListItemView localListItemView = (ListItemView)paramView;
    h localh = new h();
    localh.a(paramCursor, this.k);
    ac.a(paramContext, localListItemView, localh, j);
    if (!this.l)
    {
      localListItemView.b().setTextColor(this.n);
      localListItemView.c().setTextColor(this.o);
    }
    if (localh.e())
    {
      localListItemView.b().setTextColor(this.m);
      return;
    }
    localListItemView.b().setTextColor(this.p);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
