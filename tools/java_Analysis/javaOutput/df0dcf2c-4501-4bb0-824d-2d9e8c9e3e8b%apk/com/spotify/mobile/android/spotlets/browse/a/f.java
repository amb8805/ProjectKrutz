package com.spotify.mobile.android.spotlets.browse.a;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.spotlets.browse.view.PlaylistCellHorizontal;
import java.util.ArrayList;
import java.util.List;

public final class f extends d<Playlist>
{
  private ArrayList<Playlist> c = new ArrayList();

  public f(com.spotify.mobile.android.a.d paramd)
  {
    super(1, paramd);
  }

  public final Playlist a(int paramInt)
  {
    return (Playlist)this.c.get(paramInt);
  }

  public final ArrayList<Playlist> a()
  {
    return this.c;
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
    if ((paramView == null) || (!(paramView instanceof PlaylistCellHorizontal)));
    for (PlaylistCellHorizontal localPlaylistCellHorizontal = PlaylistCellHorizontal.a(paramViewGroup.getContext(), paramViewGroup); ; localPlaylistCellHorizontal = (PlaylistCellHorizontal)paramView)
    {
      if (getCount() > 0)
      {
        Playlist localPlaylist = a(paramInt);
        localPlaylistCellHorizontal.a(localPlaylist);
      }
      return localPlaylistCellHorizontal;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
