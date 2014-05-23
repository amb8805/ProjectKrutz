package com.spotify.mobile.android.spotlets.browse.a;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.spotlets.browse.view.CoverCardHorizontal;
import java.util.ArrayList;
import java.util.List;

public final class a extends d<Playlist>
{
  private ArrayList<Playlist> c = new ArrayList();

  public a(com.spotify.mobile.android.a.d paramd)
  {
    super(1, paramd);
  }

  private Playlist a(int paramInt)
  {
    return (Playlist)this.c.get(paramInt);
  }

  public final void a()
  {
    this.c.clear();
  }

  public final void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, this.c);
    notifyDataSetChanged();
  }

  public final void a(List<Playlist> paramList)
  {
    this.c.addAll(paramList);
    a(this.a.a(), this.a.b());
  }

  public final int getCount()
  {
    return this.c.size();
  }

  public final Object getItem(int paramInt)
  {
    return a(paramInt);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView == null) || (!(paramView instanceof CoverCardHorizontal)));
    for (CoverCardHorizontal localCoverCardHorizontal = CoverCardHorizontal.a(paramViewGroup.getContext(), paramViewGroup); ; localCoverCardHorizontal = (CoverCardHorizontal)paramView)
    {
      if (getCount() > 0)
      {
        Playlist localPlaylist = a(paramInt);
        localCoverCardHorizontal.a(localPlaylist);
      }
      return localCoverCardHorizontal;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
