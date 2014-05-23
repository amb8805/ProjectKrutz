package com.spotify.mobile.android.spotlets.artist.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.common.collect.ak;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseList;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType;
import com.spotify.mobile.android.spotlets.artist.view.b.i;
import java.util.List;
import java.util.Map;

public final class ReleasesAdapterWithViewAll extends f
{
  private final Map<ArtistModel.ReleaseType, i> e = ak.a();
  private ArtistModel.ReleaseType f;
  private final Object g = new Object();

  ReleasesAdapterWithViewAll(Context paramContext, ArtistModel.ReleaseList paramReleaseList)
  {
    super(paramContext, paramReleaseList.releases);
    this.f = paramReleaseList.releaseType;
  }

  public final int getCount()
  {
    return 1 + this.c.size();
  }

  public final Object getItem(int paramInt)
  {
    if (paramInt < this.c.size())
      return this.c.get(paramInt);
    return this.g;
  }

  public final int getItemViewType(int paramInt)
  {
    if (paramInt == this.c.size())
      return ReleasesAdapterWithViewAll.ViewTypes.b.ordinal();
    return ReleasesAdapterWithViewAll.ViewTypes.a.ordinal();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    if (paramInt < this.c.size())
    {
      localObject = super.getView(paramInt, paramView, paramViewGroup);
      return localObject;
    }
    label39: String str;
    if (paramView == null)
    {
      localObject = h.j(this.a, null);
      ((ListItemView)localObject).d();
      ArtistModel.ReleaseType localReleaseType = this.f;
      switch (ReleasesAdapterWithViewAll.1.a[localReleaseType.ordinal()])
      {
      default:
        str = this.a.getString(2131690072);
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      ((ListItemView)localObject).a(str);
      if (!this.e.containsKey(this.f))
        this.e.put(this.f, new i(this.f));
      ((ListItemView)localObject).setTag(this.e.get(this.f));
      if (!com.spotify.android.paste.widget.f.a(this.a))
        break;
      ImageView localImageView = new ImageView(this.a);
      localImageView.setImageResource(2130838096);
      ((ListItemView)localObject).b(localImageView);
      return localObject;
      localObject = (ListItemView)paramView;
      break label39;
      str = this.a.getString(2131690073);
      continue;
      str = this.a.getString(2131690074);
      continue;
      str = this.a.getString(2131690072);
      continue;
      str = this.a.getString(2131690072);
    }
  }

  public final int getViewTypeCount()
  {
    return ReleasesAdapterWithViewAll.ViewTypes.a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.adapters.ReleasesAdapterWithViewAll
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
