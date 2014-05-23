package com.spotify.mobile.android.spotlets.collection.adapter;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.model.m;
import com.spotify.mobile.android.provider.i;
import com.spotify.mobile.android.ui.stuff.g;
import com.spotify.mobile.android.ui.view.DownloadIndicatorView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.ArrayList;
import java.util.List;

public final class AlbumsWithTracksAdapter extends BaseAdapter
{
  private static final int d = AlbumsWithTracksAdapter.Type.values().length;
  private List<Object> a = new ArrayList();
  private List<AlbumsWithTracksAdapter.Type> b = new ArrayList();
  private String c;
  private Context e;
  private Cursor f;
  private boolean g;

  public AlbumsWithTracksAdapter(Context paramContext, boolean paramBoolean)
  {
    this.e = paramContext;
    this.g = paramBoolean;
  }

  public final Cursor a()
  {
    return this.f;
  }

  public final void a(Cursor paramCursor)
  {
    this.a.clear();
    this.b.clear();
    this.f = paramCursor;
    if ((paramCursor == null) || (!paramCursor.moveToFirst()))
    {
      notifyDataSetInvalidated();
      return;
    }
    Object localObject = null;
    int i = 0;
    if (i < paramCursor.getCount())
    {
      com.spotify.mobile.android.model.h localh = new com.spotify.mobile.android.model.h();
      localh.a(paramCursor, this.c);
      if (!TextUtils.equals((java.lang.CharSequence)localObject, localh.n()));
      for (int j = 1; ; j = 0)
      {
        if ((i > 0) && (j != 0))
        {
          this.a.add(this.a.get(-1 + this.a.size()));
          this.b.add(AlbumsWithTracksAdapter.Type.c);
        }
        if (j != 0)
        {
          this.a.add(new a(this, localh));
          this.b.add(AlbumsWithTracksAdapter.Type.b);
        }
        this.a.add(localh);
        this.b.add(AlbumsWithTracksAdapter.Type.a);
        localObject = localh.n();
        paramCursor.moveToNext();
        i++;
        break;
      }
    }
    notifyDataSetChanged();
  }

  public final void a(String paramString)
  {
    this.c = paramString;
  }

  public final int getCount()
  {
    return this.b.size();
  }

  public final Object getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    if (this.b.get(paramInt) == AlbumsWithTracksAdapter.Type.b)
      return ((a)this.a.get(paramInt)).a();
    return ((m)this.a.get(paramInt)).f();
  }

  public final int getItemViewType(int paramInt)
  {
    return ((AlbumsWithTracksAdapter.Type)this.b.get(paramInt)).ordinal();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AlbumsWithTracksAdapter.Type localType = (AlbumsWithTracksAdapter.Type)this.b.get(paramInt);
    ListItemView localListItemView;
    if ((paramView == null) || (!(paramView instanceof ListItemView)))
      if ((this.g) && (localType == AlbumsWithTracksAdapter.Type.a))
      {
        localListItemView = com.spotify.android.paste.widget.h.i(this.e, paramViewGroup);
        label51: if ((localType == AlbumsWithTracksAdapter.Type.b) || (localType == AlbumsWithTracksAdapter.Type.a))
          localListItemView.b(g.a(this.e));
        if (localType == AlbumsWithTracksAdapter.Type.a)
        {
          DownloadIndicatorView localDownloadIndicatorView = (DownloadIndicatorView)LayoutInflater.from(this.e).inflate(2130903123, null);
          localListItemView.c(localDownloadIndicatorView);
          localDownloadIndicatorView.a(true);
        }
        if (localType == AlbumsWithTracksAdapter.Type.b)
          localListItemView.b().setTypeface(localListItemView.b().getTypeface(), 1);
      }
    while (true)
      switch (AlbumsWithTracksAdapter.1.a[localType.ordinal()])
      {
      default:
        Assertion.a("Unknown type " + localType);
        return localListItemView;
        if (localType == AlbumsWithTracksAdapter.Type.c)
        {
          localListItemView = com.spotify.android.paste.widget.h.j(this.e, paramViewGroup);
          break label51;
        }
        localListItemView = com.spotify.android.paste.widget.h.h(this.e, paramViewGroup);
        break label51;
        localListItemView = (ListItemView)paramView;
      case 1:
      case 2:
      case 3:
      }
    a locala = (a)this.a.get(paramInt);
    localListItemView.b(true);
    localListItemView.a(locala.b());
    ((dd)c.a(dd.class)).a().a(i.a(locala.e())).a(2130837634).a(localListItemView.a());
    localListItemView.a().setVisibility(0);
    localListItemView.setTag(locala);
    return localListItemView;
    m localm = (m)this.a.get(paramInt);
    localListItemView.b(true);
    localListItemView.a(localm.p());
    localListItemView.b(localm.m());
    localListItemView.c(localm.a());
    localListItemView.setEnabled(localm.c());
    if (!this.g);
    for (boolean bool = true; ; bool = false)
    {
      localListItemView.a(bool);
      ((DownloadIndicatorView)localListItemView.h()).a(localm.i());
      localListItemView.setTag(localm);
      return localListItemView;
    }
    localListItemView.d();
    return localListItemView;
  }

  public final int getViewTypeCount()
  {
    return d;
  }

  public final boolean isEnabled(int paramInt)
  {
    return AlbumsWithTracksAdapter.Type.values()[getItemViewType(paramInt)] != AlbumsWithTracksAdapter.Type.c;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.collection.adapter.AlbumsWithTracksAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
