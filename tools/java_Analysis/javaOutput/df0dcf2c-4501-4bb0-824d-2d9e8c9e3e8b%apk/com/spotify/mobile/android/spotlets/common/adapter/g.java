package com.spotify.mobile.android.spotlets.common.adapter;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ListView.FixedViewInfo;
import com.google.common.base.Optional;
import com.google.common.base.i;

public final class g
{
  private final ListView a;
  private h b;
  private ListAdapter c;
  private ListView.FixedViewInfo d;
  private ListView.FixedViewInfo e;
  private Optional<Boolean> f = Optional.d();
  private Optional<Boolean> g = Optional.d();

  public g(ListView paramListView)
  {
    this.a = ((ListView)i.a(paramListView, "must provide a valid ListView"));
  }

  private ListView.FixedViewInfo a(View paramView, Object paramObject, boolean paramBoolean)
  {
    ListView localListView = this.a;
    localListView.getClass();
    ListView.FixedViewInfo localFixedViewInfo = new ListView.FixedViewInfo(localListView);
    localFixedViewInfo.view = ((View)i.a(paramView, "view cannot be null"));
    localFixedViewInfo.data = paramObject;
    localFixedViewInfo.isSelectable = paramBoolean;
    return localFixedViewInfo;
  }

  public final g a()
  {
    if ((!this.f.a()) && (!this.g.a()));
    for (boolean bool = true; ; bool = false)
    {
      i.b(bool, "hiding headers already set");
      this.f = Optional.b(Boolean.valueOf(true));
      this.g = Optional.b(Boolean.valueOf(true));
      return this;
    }
  }

  public final g a(View paramView, Object paramObject)
  {
    if (this.d == null);
    for (boolean bool = true; ; bool = false)
    {
      i.b(bool, "header already set");
      this.d = a(paramView, paramObject, false);
      return this;
    }
  }

  public final g a(ListAdapter paramListAdapter)
  {
    if (this.c == null);
    for (boolean bool = true; ; bool = false)
    {
      i.b(bool, "adapter already set");
      this.c = paramListAdapter;
      return this;
    }
  }

  public final SimpleHeaderViewListAdapter b()
  {
    SimpleHeaderViewListAdapter localSimpleHeaderViewListAdapter = new SimpleHeaderViewListAdapter(this.d, this.e, this.c, ((Boolean)this.f.a(Boolean.valueOf(false))).booleanValue(), ((Boolean)this.f.a(Boolean.valueOf(false))).booleanValue());
    if (this.b != null)
      localSimpleHeaderViewListAdapter.a(this.b);
    return localSimpleHeaderViewListAdapter;
  }

  public final g b(View paramView, Object paramObject)
  {
    if (this.e == null);
    for (boolean bool = true; ; bool = false)
    {
      i.b(bool, "footer already set");
      this.e = a(paramView, paramObject, true);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.adapter.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
