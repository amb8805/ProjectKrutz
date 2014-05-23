package com.spotify.mobile.android.spotlets.browse.a;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.browse.model.NewRelease;
import com.spotify.mobile.android.spotlets.browse.view.e;
import java.util.ArrayList;
import java.util.List;

public final class c extends d<NewRelease>
{
  private List<NewRelease> c = new ArrayList();

  public c(int paramInt, com.spotify.mobile.android.a.d paramd)
  {
    super(paramInt, paramd);
  }

  public final int a()
  {
    return this.c.size();
  }

  public final NewRelease a(int paramInt)
  {
    return (NewRelease)this.c.get(paramInt);
  }

  public final void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, this.c);
    notifyDataSetChanged();
  }

  public final void a(List<NewRelease> paramList)
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
    if ((paramView == null) || (!(paramView instanceof e)));
    for (e locale = new e(paramViewGroup.getContext(), paramViewGroup, this.b); ; locale = (e)paramView)
    {
      if (getCount() > 0)
      {
        List localList = a(paramInt, this.c);
        locale.a(localList);
      }
      return locale;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
