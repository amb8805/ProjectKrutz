package com.spotify.mobile.android.ui.page;

import android.content.Context;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.spotify.mobile.android.util.ds;

public class i extends j
  implements View.OnCreateContextMenuListener
{
  private ListView b;
  private ListAdapter c;
  private LinearLayout d;

  public i(Context paramContext, ViewGroup paramViewGroup)
  {
    super(paramContext, paramViewGroup);
    a(paramContext, paramViewGroup);
    this.b.setOnCreateContextMenuListener(this);
    this.b.setOnItemClickListener(new i.1(this));
    a(this.b.getId());
  }

  protected void a(Context paramContext, ViewGroup paramViewGroup)
  {
    ViewGroup localViewGroup = (ViewGroup)f().inflate(2130903186, paramViewGroup, false);
    if (ds.b(paramContext))
      this.d = ((LinearLayout)localViewGroup);
    this.b = ((ListView)localViewGroup.findViewById(16908298));
    a(localViewGroup);
  }

  public void a(View paramView, int paramInt, long paramLong)
  {
  }

  public final void a(ListAdapter paramListAdapter)
  {
    this.c = paramListAdapter;
    this.b.setAdapter(this.c);
  }

  protected final void a(ListView paramListView)
  {
    this.b = paramListView;
  }

  public final ListView c()
  {
    return this.b;
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
