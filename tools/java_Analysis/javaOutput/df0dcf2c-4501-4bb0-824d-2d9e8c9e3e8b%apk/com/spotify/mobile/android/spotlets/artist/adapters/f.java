package com.spotify.mobile.android.spotlets.artist.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.common.collect.ak;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Image;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release;
import com.spotify.mobile.android.spotlets.artist.util.Releases;
import com.spotify.mobile.android.util.cv;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.HashMap;
import java.util.List;

public abstract class f extends BaseAdapter
{
  protected final Context a;
  protected List<ArtistModel.Release> b;
  protected List<ArtistModel.Release> c;
  protected final HashMap<String, com.spotify.mobile.android.spotlets.artist.view.b.g> d = ak.a();
  private cv e = Releases.b;
  private String f = "";

  f(Context paramContext, List<ArtistModel.Release> paramList)
  {
    this.a = paramContext;
    this.b = paramList;
    this.c = paramList;
  }

  private void a()
  {
    this.c = Releases.a(this.b, this.e, this.f);
    notifyDataSetChanged();
  }

  public final void a(cv paramcv)
  {
    this.e = paramcv;
    a();
  }

  public final void a(String paramString)
  {
    this.f = paramString;
    a();
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (ListItemView localListItemView = new ListItemView(this.a); ; localListItemView = (ListItemView)paramView)
    {
      localListItemView.d();
      ArtistModel.Release localRelease = (ArtistModel.Release)this.c.get(paramInt);
      if ((localRelease.cover != null) && (localRelease.cover.uri != null))
        ((dd)c.a(dd.class)).a().a(localRelease.cover.uri).a(2130837634).b(2130837634).a(localListItemView.a());
      localListItemView.a(localRelease.name);
      Resources localResources = this.a.getResources();
      int i = localRelease.trackCount;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(localRelease.trackCount);
      arrayOfObject[1] = Integer.valueOf(localRelease.year);
      localListItemView.c(localResources.getQuantityString(2131623949, i, arrayOfObject));
      if (!this.d.containsKey(localRelease.uri))
        this.d.put(localRelease.uri, new com.spotify.mobile.android.spotlets.artist.view.b.g(localRelease.uri));
      localListItemView.setTag(this.d.get(localRelease.uri));
      localListItemView.b(com.spotify.mobile.android.ui.stuff.g.a(this.a));
      return localListItemView;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.adapters.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
