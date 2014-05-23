package com.spotify.mobile.android.ui.fragments;

import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemLongClickListener;
import com.spotify.mobile.android.model.k;

final class w
  implements View.OnCreateContextMenuListener, AdapterView.OnItemLongClickListener
{
  private w(v paramv)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    if (paramContextMenuInfo == null);
    k localk;
    MenuItem localMenuItem2;
    do
    {
      return;
      this.a.i().getMenuInflater().inflate(2131820544, paramContextMenu);
      localk = (k)((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView.getTag();
      MenuItem localMenuItem1 = paramContextMenu.findItem(2131362664);
      if (localMenuItem1 != null)
        localMenuItem1.setOnMenuItemClickListener(new w.1(this, localk));
      localMenuItem2 = paramContextMenu.findItem(2131362665);
    }
    while (localMenuItem2 == null);
    localMenuItem2.setOnMenuItemClickListener(new w.2(this, localk));
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    v.o(this.a).a(paramView, paramInt, paramLong);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
