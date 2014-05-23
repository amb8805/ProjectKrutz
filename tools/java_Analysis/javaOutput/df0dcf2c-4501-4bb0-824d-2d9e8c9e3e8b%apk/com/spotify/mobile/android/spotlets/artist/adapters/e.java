package com.spotify.mobile.android.spotlets.artist.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import com.spotify.android.paste.widget.CardView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistInfo;
import com.spotify.mobile.android.ui.b.b;
import com.spotify.mobile.android.ui.cell.ArtistPortraitCell;
import com.spotify.mobile.android.ui.cell.a;
import com.spotify.mobile.android.ui.menus.ArtistMenuDelegate;
import com.spotify.mobile.android.ui.stuff.i;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.List;

public final class e extends BaseAdapter
{
  ArtistMenuDelegate a;
  private final List<ArtistModel.ArtistInfo> b;
  private final Context c;
  private final Drawable d;
  private a e;

  public e(List<ArtistModel.ArtistInfo> paramList, Context paramContext, ArtistMenuDelegate paramArtistMenuDelegate, a parama)
  {
    this.b = paramList;
    this.c = paramContext;
    this.a = paramArtistMenuDelegate;
    this.e = parama;
    this.d = b.a(i.a(paramContext));
  }

  public final ArtistModel.ArtistInfo a(int paramInt)
  {
    return (ArtistModel.ArtistInfo)this.b.get(paramInt);
  }

  public final int getCount()
  {
    return this.b.size();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ArtistModel.ArtistInfo localArtistInfo = a(paramInt);
    if (f.a(this.c))
    {
      if (paramView == null);
      for (ArtistPortraitCell localArtistPortraitCell = ArtistPortraitCell.a(this.c, paramViewGroup, this.a, this.e); ; localArtistPortraitCell = (ArtistPortraitCell)paramView)
      {
        localArtistPortraitCell.a(localArtistInfo.name, localArtistInfo.uri, localArtistInfo.getDefaultPortraitUri());
        return localArtistPortraitCell;
      }
    }
    CardView localCardView = (CardView)paramView;
    if (localCardView == null)
    {
      localCardView = new CardView(this.c);
      localCardView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
    }
    localCardView.setFocusable(false);
    localCardView.setFocusableInTouchMode(false);
    localCardView.setClickable(false);
    localCardView.a(localArtistInfo.name);
    ((dd)c.a(dd.class)).a().a(localArtistInfo.getDefaultPortraitUri()).a(b.a()).a(this.d).a(localCardView.c());
    return localCardView;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.adapters.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
