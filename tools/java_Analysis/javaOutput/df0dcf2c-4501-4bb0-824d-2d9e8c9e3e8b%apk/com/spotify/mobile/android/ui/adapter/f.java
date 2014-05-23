package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.spotify.mobile.android.a.d;
import com.spotify.mobile.android.model.Story;
import com.spotify.mobile.android.ui.cell.b;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.de;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;

public final class f extends BaseAdapter
{
  private final int a;
  private Context b;
  private LinkedHashMap<Long, Story> c;
  private List<Long> d;
  private d e;
  private int f = 0;
  private de g;

  public f(Context paramContext, int paramInt, d paramd, de paramde)
  {
    boolean bool = false;
    if (paramInt > 0)
      bool = true;
    Assertion.a(bool, "Each row should have at least one item");
    this.b = paramContext;
    this.e = paramd;
    this.g = paramde;
    this.c = new LinkedHashMap();
    this.a = paramInt;
    this.d = new ArrayList();
  }

  public final int a()
  {
    return this.c.size();
  }

  public final void a(int paramInt)
  {
    int k;
    if (this.f != paramInt)
    {
      this.f = paramInt;
      if (this.f <= 0)
        break label87;
      Iterator localIterator2 = this.c.values().iterator();
      k = 0;
      if (localIterator2.hasNext())
        if (!((Story)localIterator2.next()).c(this.f))
          break label150;
    }
    label144: label150: for (int m = 1; ; m = k)
    {
      k = m;
      break;
      if (k != 0)
        notifyDataSetChanged();
      return;
      label87: Iterator localIterator1 = this.c.values().iterator();
      int i = 0;
      label102: if (localIterator1.hasNext())
        if (!((Story)localIterator1.next()).r())
          break label144;
      for (int j = 1; ; j = i)
      {
        i = j;
        break label102;
        if (i == 0)
          break;
        notifyDataSetChanged();
        return;
      }
    }
  }

  public final void a(Cursor paramCursor)
  {
    int i = 0;
    paramCursor.moveToPosition(-1);
    while (paramCursor.moveToNext())
      try
      {
        Story localStory = Story.a(paramCursor);
        if (localStory.a() <= 0L)
        {
          if (this.f > 0)
            localStory.c(this.f);
          if (this.c.put(Long.valueOf(localStory.d()), localStory) == null)
          {
            i = 1;
            this.d.add(Long.valueOf(localStory.d()));
          }
        }
      }
      catch (JSONException localJSONException)
      {
        Assertion.a("Could not parse Discover story!", localJSONException);
      }
    if (i != 0)
      notifyDataSetChanged();
  }

  public final void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    cc.a(paramString1, "Don't call setCurrentPlayingContext with null current context URI");
    cc.a(paramString2, "Don't call setCurrentPlayingContext with null current track URI");
    Iterator localIterator = this.c.values().iterator();
    if (localIterator.hasNext())
    {
      Story localStory = (Story)localIterator.next();
      boolean bool;
      if (!paramBoolean)
        bool = false;
      while (true)
      {
        localStory.a(bool);
        break;
        if (SpotifyLink.LinkType.ag.equals(localStory.g().a()))
          bool = paramString2.equals(localStory.g().d());
        else
          bool = paramString1.equals(localStory.g().d());
      }
    }
  }

  public final int getCount()
  {
    return (int)Math.ceil(this.c.size() / this.a);
  }

  public final Object getItem(int paramInt)
  {
    return this.c.get(this.d.get(paramInt));
  }

  public final long getItemId(int paramInt)
  {
    return ((Long)this.d.get(paramInt)).longValue();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof b));
    for (b localb = (b)paramView; ; localb = new b(this.b, this.a, this.g))
    {
      int i = paramInt * this.a;
      if (i < this.d.size())
      {
        int j = i + this.a;
        if (j > this.d.size())
          j = this.d.size();
        localb.a(this.c, this.d.subList(i, j), this.e);
      }
      return localb;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
