package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.support.v4.widget.a;
import android.view.View;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.model.h;

public final class aa extends a
{
  private final String j;
  private ab k;

  public aa(Context paramContext, ab paramab)
  {
    super(paramContext);
    this.k = paramab;
    this.j = paramContext.getResources().getString(2131690130);
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    ListItemView localListItemView = (ListItemView)paramView;
    h localh = new h();
    localh.a(paramCursor, this.j);
    ac.a(this.d, localListItemView, localh, this.k);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
