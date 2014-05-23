package com.spotify.mobile.android.spotlets.browse.a;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.spotlets.browse.view.g;
import java.util.ArrayList;
import java.util.List;

public final class e extends d<Playlist>
{
  private List<Playlist> c = new ArrayList();

  public e(int paramInt, com.spotify.mobile.android.a.d paramd)
  {
    super(paramInt, paramd);
  }

  public final int a()
  {
    return this.c.size();
  }

  public final Playlist a(int paramInt)
  {
    return (Playlist)this.c.get(paramInt);
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
    return b(this.c);
  }

  public final Object getItem(int paramInt)
  {
    return a(paramInt);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView == null) || (!(paramView instanceof g)));
    for (g localg = new g(paramViewGroup.getContext(), paramViewGroup, this.b); ; localg = (g)paramView)
    {
      if (getCount() > 0)
        localg.a(a(paramInt, this.c), this.a);
      return localg;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
