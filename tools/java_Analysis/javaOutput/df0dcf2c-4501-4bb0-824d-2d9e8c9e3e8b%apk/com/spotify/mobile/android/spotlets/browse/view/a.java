package com.spotify.mobile.android.spotlets.browse.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.mobile.android.a.d;
import com.spotify.mobile.android.spotlets.browse.model.Artist;
import java.util.List;

@SuppressLint({"ViewConstructor"})
public final class a extends LinearLayout
{
  private int a;

  public a(Context paramContext, ViewGroup paramViewGroup, int paramInt)
  {
    super(paramContext);
    setOrientation(0);
    setBackgroundResource(2130838194);
    int j = getResources().getDimensionPixelSize(2131427383);
    setPadding(j, j, j, j);
    this.a = paramInt;
    while (i < paramInt)
    {
      addView(ArtistCell.a(paramContext, paramViewGroup), i, new LinearLayout.LayoutParams(-1, -1, 1.0F));
      i++;
    }
  }

  public final void a(List<Artist> paramList, d paramd)
  {
    int i = 0;
    if (i < this.a)
    {
      ArtistCell localArtistCell = (ArtistCell)getChildAt(i);
      if (i < paramList.size())
      {
        localArtistCell.a((Artist)paramList.get(i), i, paramd);
        localArtistCell.setVisibility(0);
      }
      while (true)
      {
        i++;
        break;
        localArtistCell.setVisibility(4);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
