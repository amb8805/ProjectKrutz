package com.spotify.mobile.android.spotlets.browse.a;

import android.widget.BaseAdapter;
import com.spotify.mobile.android.spotlets.browse.model.Playable;
import com.spotify.mobile.android.util.cc;
import java.util.Iterator;
import java.util.List;

public abstract class d<T> extends BaseAdapter
{
  final com.spotify.mobile.android.a.d a;
  final int b;

  public d(int paramInt, com.spotify.mobile.android.a.d paramd)
  {
    cc.a(paramd, "contextUriProvider must not be null!");
    if (paramInt > 0);
    for (boolean bool = true; ; bool = false)
    {
      cc.a(bool, "itemsPerRow must be larger than 0!");
      this.b = paramInt;
      this.a = paramd;
      return;
    }
  }

  public final List<T> a(int paramInt, List<T> paramList)
  {
    int i = paramInt * this.b;
    int j = i + this.b;
    if (j > paramList.size())
      j = paramList.size();
    return paramList.subList(i, j);
  }

  public final void a(String paramString1, String paramString2, List<? extends Playable> paramList)
  {
    cc.a(paramString1, "Don't call updateStateForPlayingItems with null current context URI");
    cc.a(paramString2, "Don't call updateStateForPlayingItems with null current track URI");
    cc.a(paramList, "Don't call setCurrentPlayingContext with null items");
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      Playable localPlayable = (Playable)localIterator.next();
      boolean bool1 = localPlayable.d().equals(this.a.a());
      if ((this.a.c()) && (bool1));
      for (boolean bool2 = true; ; bool2 = false)
      {
        localPlayable.a(bool2);
        break;
      }
    }
  }

  public final int b(List<T> paramList)
  {
    return (-1 + (paramList.size() + this.b)) / this.b;
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
