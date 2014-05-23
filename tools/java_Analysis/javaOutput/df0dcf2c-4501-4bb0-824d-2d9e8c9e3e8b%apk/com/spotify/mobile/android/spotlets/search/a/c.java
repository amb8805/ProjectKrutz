package com.spotify.mobile.android.spotlets.search.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.g;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public final class c extends BaseAdapter
{
  private final Context a;
  private final int b;
  private LinkedList<String> c;
  private final Set<String> d = new HashSet();
  private ListItemView e;

  public c(Context paramContext)
  {
    this.a = paramContext;
    this.b = 10;
    this.c = new LinkedList();
  }

  private void c()
  {
    try
    {
      if (this.c.size() > this.b)
        this.c.removeLast();
    }
    finally
    {
    }
  }

  private void d()
  {
    try
    {
      com.google.common.collect.h.a(this.c, new c.1(this));
      this.d.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final CharSequence a(int paramInt)
  {
    try
    {
      if (paramInt < this.c.size())
      {
        str = (String)this.c.get(paramInt);
        return str;
      }
      String str = "";
    }
    finally
    {
    }
  }

  public final void a(String paramString)
  {
    try
    {
      this.c.push(paramString);
      d();
      c();
      notifyDataSetChanged();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(String[] paramArrayOfString)
  {
    try
    {
      Collections.addAll(this.c, paramArrayOfString);
      d();
      c();
      notifyDataSetChanged();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String[] a()
  {
    try
    {
      String[] arrayOfString = (String[])this.c.toArray(new String[this.c.size()]);
      return arrayOfString;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void b()
  {
    try
    {
      this.c.clear();
      notifyDataSetChanged();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int getCount()
  {
    try
    {
      boolean bool = this.c.isEmpty();
      if (bool);
      int i;
      for (int j = 0; ; j = i + 1)
      {
        return j;
        i = this.c.size();
      }
    }
    finally
    {
    }
  }

  public final long getItemId(int paramInt)
  {
    return a(paramInt).hashCode();
  }

  public final int getItemViewType(int paramInt)
  {
    if (paramInt == -1 + getCount())
      return 1;
    return 0;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramInt == this.c.size())
    {
      if (this.e == null)
      {
        this.e = com.spotify.android.paste.widget.h.j(this.a, paramViewGroup);
        this.e.a(this.a.getText(2131689809));
        this.e.b().setTextColor(g.a(this.a, 2130772383));
      }
      return this.e;
    }
    ListItemView localListItemView;
    if (paramView == null)
    {
      localListItemView = com.spotify.android.paste.widget.h.j(this.a, paramViewGroup);
      ImageView localImageView = new ImageView(this.a);
      localImageView.setImageResource(2130838021);
      localListItemView.b(localImageView);
    }
    while (true)
    {
      localListItemView.a(a(paramInt));
      return localListItemView;
      localListItemView = (ListItemView)paramView;
      localListItemView.b(true);
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }

  public final boolean hasStableIds()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
