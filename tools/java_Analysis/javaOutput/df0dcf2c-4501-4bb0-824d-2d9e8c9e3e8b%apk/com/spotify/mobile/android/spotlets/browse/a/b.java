package com.spotify.mobile.android.spotlets.browse.a;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.browse.model.Genre;
import java.util.ArrayList;
import java.util.List;

public final class b extends d<Genre>
{
  private ArrayList<Genre> c = new ArrayList();

  public b(int paramInt, com.spotify.mobile.android.a.d paramd)
  {
    super(paramInt, paramd);
  }

  public final Genre a(int paramInt)
  {
    return (Genre)this.c.get(paramInt);
  }

  public final void a()
  {
    this.c.clear();
  }

  public final void a(List<Genre> paramList)
  {
    this.c.addAll(paramList);
  }

  public final ArrayList<Genre> b()
  {
    return this.c;
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
    if ((paramView == null) || (!(paramView instanceof com.spotify.mobile.android.spotlets.browse.view.d)));
    for (com.spotify.mobile.android.spotlets.browse.view.d locald = new com.spotify.mobile.android.spotlets.browse.view.d(paramViewGroup.getContext(), paramViewGroup, this.b); ; locald = (com.spotify.mobile.android.spotlets.browse.view.d)paramView)
    {
      if (getCount() > 0)
        locald.a(a(paramInt, this.c));
      return locald;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
