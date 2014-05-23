package com.spotify.mobile.android.spotlets.browse.a;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.browse.model.Artist;
import com.spotify.mobile.android.spotlets.browse.view.a;
import java.util.ArrayList;
import java.util.List;

public final class g extends d<Artist>
{
  private List<Artist> c = new ArrayList();

  public g(int paramInt, com.spotify.mobile.android.a.d paramd)
  {
    super(paramInt, paramd);
  }

  public final int a()
  {
    return this.c.size();
  }

  public final Artist a(int paramInt)
  {
    return (Artist)this.c.get(paramInt);
  }

  public final void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, this.c);
    notifyDataSetChanged();
  }

  public final void a(List<Artist> paramList)
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
    if ((paramView instanceof a));
    for (a locala = (a)paramView; ; locala = new a(paramViewGroup.getContext(), paramViewGroup, this.b))
    {
      if (getCount() > 0)
        locala.a(a(paramInt, this.c), this.a);
      return locala;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
