package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.spotify.android.paste.widget.ListItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class v extends BaseAdapter
{
  private Context a;
  private List<ResolveInfo> b;

  public v(Context paramContext, Intent paramIntent)
  {
    this.a = paramContext;
    this.b = a(paramContext, paramIntent);
  }

  private static List<ResolveInfo> a(Context paramContext, Intent paramIntent)
  {
    List localList = paramContext.getPackageManager().queryIntentActivities(paramIntent, 0);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = localList.iterator();
    while (localIterator1.hasNext())
    {
      ResolveInfo localResolveInfo3 = (ResolveInfo)localIterator1.next();
      if ("com.facebook.katana".equals(localResolveInfo3.activityInfo.packageName))
        localArrayList.add(localResolveInfo3);
    }
    Iterator localIterator2 = localList.iterator();
    while (localIterator2.hasNext())
    {
      ResolveInfo localResolveInfo2 = (ResolveInfo)localIterator2.next();
      if ("com.twitter.android".equals(localResolveInfo2.activityInfo.packageName))
        localArrayList.add(localResolveInfo2);
    }
    Iterator localIterator3 = localList.iterator();
    while (localIterator3.hasNext())
    {
      ResolveInfo localResolveInfo1 = (ResolveInfo)localIterator3.next();
      if ("com.google.android.gm".equals(localResolveInfo1.activityInfo.packageName))
        localArrayList.add(localResolveInfo1);
    }
    localList.removeAll(localArrayList);
    localArrayList.addAll(localList);
    return localArrayList;
  }

  public final int getCount()
  {
    return this.b.size();
  }

  public final Object getItem(int paramInt)
  {
    return this.b.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ListItemView localListItemView = (ListItemView)paramView;
    if (localListItemView == null)
      localListItemView = new ListItemView(this.a);
    ResolveInfo localResolveInfo = (ResolveInfo)this.b.get(paramInt);
    PackageManager localPackageManager = this.a.getPackageManager();
    localListItemView.a(localResolveInfo.loadLabel(localPackageManager));
    localListItemView.a().setImageDrawable(localResolveInfo.loadIcon(localPackageManager));
    return localListItemView;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
