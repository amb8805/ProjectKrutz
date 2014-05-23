package com.spotify.mobile.android.spotlets.collection.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.model.m;
import com.spotify.mobile.android.ui.stuff.g;
import com.spotify.mobile.android.ui.view.DownloadIndicatorView;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.List;

public final class AlbumTracksAdapter extends BaseAdapter
{
  private static final int b = AlbumTracksAdapter.Type.values().length;
  private List<m> a = new ArrayList();
  private Context c;
  private Cursor d;
  private boolean e;
  private String f;

  public AlbumTracksAdapter(Context paramContext, boolean paramBoolean)
  {
    this.c = paramContext;
    this.e = paramBoolean;
  }

  public final Cursor a()
  {
    return this.d;
  }

  public final void a(Cursor paramCursor)
  {
    this.a.clear();
    this.d = paramCursor;
    if ((paramCursor == null) || (!paramCursor.moveToFirst()))
    {
      notifyDataSetInvalidated();
      return;
    }
    do
    {
      com.spotify.mobile.android.model.h localh = new com.spotify.mobile.android.model.h();
      localh.a(paramCursor, this.f);
      this.a.add(localh);
    }
    while (paramCursor.moveToNext());
    notifyDataSetChanged();
  }

  public final void a(String paramString)
  {
    this.f = paramString;
  }

  public final int getCount()
  {
    return this.a.size();
  }

  public final Object getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return ((m)this.a.get(paramInt)).f();
  }

  public final int getItemViewType(int paramInt)
  {
    return AlbumTracksAdapter.Type.a.ordinal();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AlbumTracksAdapter.Type localType = AlbumTracksAdapter.Type.values()[getItemViewType(paramInt)];
    ListItemView localListItemView1;
    ListItemView localListItemView2;
    if ((paramView == null) || (!(paramView instanceof ListItemView)))
      if ((this.e) && (localType == AlbumTracksAdapter.Type.a))
      {
        localListItemView1 = com.spotify.android.paste.widget.h.i(this.c, paramViewGroup);
        if (localType != AlbumTracksAdapter.Type.a)
          break label293;
        localListItemView1.b(g.a(this.c));
        DownloadIndicatorView localDownloadIndicatorView = (DownloadIndicatorView)LayoutInflater.from(this.c).inflate(2130903123, null);
        localListItemView1.c(localDownloadIndicatorView);
        localDownloadIndicatorView.a(true);
        localListItemView2 = localListItemView1;
      }
    while (true)
      switch (AlbumTracksAdapter.1.a[localType.ordinal()])
      {
      default:
        Assertion.a("Unknown type " + localType);
        return localListItemView2;
        localListItemView1 = com.spotify.android.paste.widget.h.h(this.c, paramViewGroup);
        break;
        localListItemView2 = (ListItemView)paramView;
        break;
      case 1:
        m localm = (m)this.a.get(paramInt);
        localListItemView2.b(true);
        localListItemView2.a(localm.p());
        localListItemView2.b(localm.m());
        localListItemView2.c(localm.a());
        localListItemView2.setEnabled(localm.c());
        if (!this.e);
        for (boolean bool = true; ; bool = false)
        {
          localListItemView2.a(bool);
          ((DownloadIndicatorView)localListItemView2.h()).a(localm.i());
          localListItemView2.setTag(localm);
          return localListItemView2;
        }
        label293: localListItemView2 = localListItemView1;
      }
  }

  public final int getViewTypeCount()
  {
    return b;
  }

  public final boolean isEnabled(int paramInt)
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.collection.adapter.AlbumTracksAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
