package com.spotify.mobile.android.spotlets.common.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.common.base.i;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a<D> extends BaseAdapter
{
  private static final d a = new a.1();
  private d<D> b;
  private final int c;
  private final Map<Class<? extends D>, f<? extends View, ? extends D>> d;
  private final Map<f<?, ? extends D>, Integer> e;

  public a(d<D> paramd, List<f<? extends View, ? extends D>> paramList, boolean paramBoolean)
  {
    HashMap localHashMap;
    boolean bool2;
    label35: int i;
    label91: f localf1;
    Class localClass;
    if (paramBoolean)
    {
      localHashMap = null;
      if (((List)i.a(paramList, "null binders list!")).isEmpty())
        break label225;
      bool2 = bool1;
      i.a(bool2, "cannot create DelegableAdapter with no binders!");
      this.e = new HashMap(paramList.size());
      this.d = new LinkedHashMap(paramList.size(), 0.75F, bool1);
      Iterator localIterator = paramList.iterator();
      i = -1;
      if (!localIterator.hasNext())
        break label246;
      localf1 = (f)localIterator.next();
      f localf2 = (f)i.a(localf1);
      a(localf2.b(), localf2);
      localClass = (Class)i.a(localf1.a());
      if (!paramBoolean)
        break label231;
    }
    label225: label231: for (Integer localInteger = null; ; localInteger = (Integer)localHashMap.get(localClass))
    {
      if (localInteger == null)
      {
        i++;
        localInteger = Integer.valueOf(i);
        if (localHashMap != null)
          localHashMap.put(localClass, localInteger);
      }
      int k = i;
      this.e.put(localf1, localInteger);
      i = k;
      break label91;
      localHashMap = new HashMap();
      break;
      bool2 = false;
      break label35;
    }
    label246: int j = i + 1;
    this.c = j;
    if (j > 0);
    while (true)
    {
      i.b(bool1);
      a(paramd);
      return;
      bool1 = false;
    }
  }

  private f<View, D> a(D paramD)
  {
    Class localClass = paramD.getClass();
    Object localObject1 = (f)this.d.get(localClass);
    Object localObject2;
    if (localObject1 == null)
    {
      Iterator localIterator = this.d.values().iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (f)localIterator.next();
        if (((f)localObject2).b().isAssignableFrom(localClass))
          a(localClass, (f)localObject2);
      }
    }
    while (true)
    {
      if (localObject2 != null);
      for (boolean bool = true; ; bool = false)
      {
        i.b(bool, "No mapping for item type " + localClass.getName());
        localObject1 = localObject2;
        return localObject1;
      }
      localObject2 = localObject1;
    }
  }

  private void a(Class<? extends D> paramClass, f<?, ? extends D> paramf)
  {
    if (this.d.put(i.a(paramClass, "null class!"), paramf) == null);
    for (boolean bool = true; ; bool = false)
    {
      i.a(bool, "More than one binder for class " + paramClass.getName());
      return;
    }
  }

  public final void a(d<D> paramd)
  {
    if (paramd == null);
    for (Object localObject = a; ; localObject = paramd)
    {
      if (this.b != localObject)
      {
        if ((this.b instanceof b))
          ((b)this.b).b(this);
        if ((localObject instanceof b))
          ((b)localObject).a(this);
        this.b = ((d)localObject);
      }
      return;
    }
  }

  public final int getCount()
  {
    return this.b.getCount();
  }

  public final D getItem(int paramInt)
  {
    Object localObject = this.b.getItem(paramInt);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    return i.a(localObject, "illegal null item at position %s", arrayOfObject);
  }

  public final long getItemId(int paramInt)
  {
    return this.b.getItemId(paramInt);
  }

  public final int getItemViewType(int paramInt)
  {
    return ((Integer)this.e.get(a(getItem(paramInt)))).intValue();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject = getItem(paramInt);
    f localf = a(localObject);
    if (paramView == null)
      paramView = localf.a(paramInt, paramViewGroup);
    localf.a(paramInt, paramView, localObject, paramViewGroup);
    return paramView;
  }

  public final int getViewTypeCount()
  {
    return this.c;
  }

  public final boolean hasStableIds()
  {
    return this.b.hasStableIds();
  }

  public final boolean isEnabled(int paramInt)
  {
    return this.b.isEnabled(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.adapter.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
