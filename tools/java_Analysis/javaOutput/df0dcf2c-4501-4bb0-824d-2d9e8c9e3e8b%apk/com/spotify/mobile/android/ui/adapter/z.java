package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.widget.TextView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.model.h;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate;

public final class z extends android.support.v4.widget.a
{
  protected com.spotify.mobile.android.ui.actions.a j = (com.spotify.mobile.android.ui.actions.a)c.a(com.spotify.mobile.android.ui.actions.a.class);
  private final String k;
  private boolean l;
  private TrackMenuDelegate m;

  public z(Context paramContext, TrackMenuDelegate paramTrackMenuDelegate)
  {
    super(paramContext);
    this.m = paramTrackMenuDelegate;
    this.k = paramContext.getResources().getString(2131690130);
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    int i = 1;
    ListItemView localListItemView = (ListItemView)paramView;
    h localh = new h();
    localh.a(paramCursor, this.k);
    localh.w = i;
    localListItemView.a(localh.p());
    localListItemView.b(localh.m() + " • " + localh.o());
    localListItemView.c(localh.p);
    localListItemView.setTag(localh);
    View localView;
    if (!FeatureFragment.h.a())
    {
      int n = i;
      localListItemView.a(n);
      localView = localListItemView.f();
      if (!this.l)
        break label197;
      localView.setVisibility(0);
      localView.setOnClickListener(new z.1(this, localh));
      label153: if (f.a(paramContext))
        if (!localh.p)
          break label207;
    }
    while (true)
    {
      localListItemView.b().setTypeface(null, i);
      localListItemView.c().setTypeface(null, i);
      return;
      int i1 = 0;
      break;
      label197: localView.setVisibility(8);
      break label153;
      label207: i = 0;
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
