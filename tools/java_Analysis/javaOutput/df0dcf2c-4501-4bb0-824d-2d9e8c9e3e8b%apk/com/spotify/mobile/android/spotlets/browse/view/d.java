package com.spotify.mobile.android.spotlets.browse.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.mobile.android.spotlets.browse.b.c;
import com.spotify.mobile.android.spotlets.browse.b.e;
import com.spotify.mobile.android.spotlets.browse.model.Genre;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import java.util.List;

@SuppressLint({"ViewConstructor"})
public final class d extends LinearLayout
{
  private final c a = new c(new e(ClientEvent.SubEvent.O, ViewUri.j, ViewUri.SubView.g), true);
  private int b;

  public d(Context paramContext, ViewGroup paramViewGroup, int paramInt)
  {
    super(paramContext);
    setOrientation(0);
    setBackgroundResource(2130838194);
    int j = (int)getResources().getDimension(2131427358);
    setPadding(j, 0, j, j);
    this.b = paramInt;
    while (i < paramInt)
    {
      if (i > 0)
      {
        LinearLayout localLinearLayout = new LinearLayout(getContext());
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1, 0.0F);
        localLayoutParams.width = (int)getResources().getDimension(2131427358);
        addView(localLinearLayout, localLayoutParams);
      }
      GenreCell localGenreCell = GenreCell.a(paramContext, paramViewGroup);
      localGenreCell.setOnClickListener(new d.1(this));
      addView(localGenreCell, new LinearLayout.LayoutParams(-1, -1, 1.0F));
      i++;
    }
  }

  public final void a(List<Genre> paramList)
  {
    int i = 0;
    if (i < this.b)
    {
      GenreCell localGenreCell = (GenreCell)getChildAt(i * 2);
      if (i < paramList.size())
      {
        localGenreCell.a((Genre)paramList.get(i));
        localGenreCell.setVisibility(0);
      }
      while (true)
      {
        i++;
        break;
        localGenreCell.setVisibility(4);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
