package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.google.common.base.i;
import com.spotify.mobile.android.util.cc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class q extends BaseAdapter
{
  private final DataSetObserver a = new q.1(this);
  private final Context b;
  private u c;
  private final ArrayList<s> d = new ArrayList();
  private final SparseArray<s> e = new SparseArray();
  private int f;
  private int g = 3;
  private final u h;
  private s i;

  public q(Context paramContext)
  {
    this.b = paramContext;
    q.2 local2 = new q.2(this);
    this.h = local2;
    this.c = local2;
  }

  private void b()
  {
    Iterator localIterator1 = this.d.iterator();
    int j = 0;
    while (localIterator1.hasNext())
    {
      s locals2 = (s)localIterator1.next();
      locals2.g = j;
      if (locals2.f)
        j += locals2.a.getCount() + locals2.b() + locals2.c() + locals2.d();
      locals2.h = j;
    }
    this.f = j;
    this.i = null;
    int k = this.g;
    Iterator localIterator2 = this.d.iterator();
    int m = k;
    s locals1;
    if (localIterator2.hasNext())
    {
      locals1 = (s)localIterator2.next();
      if (locals1.i != -1)
        break label182;
      locals1.i = m;
    }
    label182: for (int n = m + locals1.a.getViewTypeCount(); ; n = m)
    {
      m = n;
      break;
      this.g = m;
      notifyDataSetChanged();
      return;
    }
  }

  private s f(int paramInt)
  {
    if ((this.i != null) && (this.i.g <= paramInt) && (paramInt < this.i.h))
      return this.i;
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      s locals = (s)localIterator.next();
      if (paramInt < locals.h)
      {
        this.i = locals;
        return locals;
      }
    }
    if (this.f == 0)
      throw new IndexOutOfBoundsException("No section found, adapter is empty");
    throw new IndexOutOfBoundsException("No section found for global position=" + paramInt + ", should be between 0 and " + this.f);
  }

  private s g(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    s locals;
    if (paramInt != -2147483648)
    {
      bool2 = bool1;
      i.a(bool2, "Invalid section id: SECTION_ID_NONE");
      locals = (s)this.e.get(paramInt, null);
      if (locals == null)
        break label63;
    }
    while (true)
    {
      i.a(bool1, "No section with id: " + paramInt);
      return locals;
      bool2 = false;
      break;
      label63: bool1 = false;
    }
  }

  public final int a(int paramInt1, int paramInt2)
  {
    return g(paramInt2).e(paramInt1);
  }

  protected final Context a()
  {
    return this.b;
  }

  public final void a(ListAdapter paramListAdapter, int paramInt1, int paramInt2)
  {
    a(paramListAdapter, paramInt1, paramInt2, null, null);
  }

  public final void a(ListAdapter paramListAdapter, int paramInt1, int paramInt2, t paramt, View paramView)
  {
    a(paramListAdapter, this.b.getString(paramInt1), paramInt2, paramt, paramView);
  }

  public final void a(ListAdapter paramListAdapter, t paramt)
  {
    a(paramListAdapter, this.b.getString(2131690155), 2, paramt, null);
  }

  public final void a(ListAdapter paramListAdapter, String paramString, int paramInt)
  {
    a(paramListAdapter, paramString, paramInt, null, null);
  }

  public final void a(ListAdapter paramListAdapter, String paramString, int paramInt, t paramt, View paramView)
  {
    cc.a(paramListAdapter);
    if (paramInt != -2147483648)
      if (this.e.get(paramInt, null) != null)
        break label119;
    label119: for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      i.a(bool, "Section id %d is already in use!", arrayOfObject);
      s locals = new s(paramListAdapter, paramString, paramInt, paramt, paramView, (byte)0);
      locals.d = this.d.size();
      this.d.add(locals);
      if (paramInt != -2147483648)
        this.e.put(paramInt, locals);
      paramListAdapter.registerDataSetObserver(this.a);
      b();
      return;
    }
  }

  public final void a(u paramu)
  {
    this.c = paramu;
  }

  public final void a(String paramString)
  {
    g(3).b = paramString;
    b();
  }

  public final void a(boolean paramBoolean)
  {
    if (g(2).l != paramBoolean)
    {
      g(2).l = paramBoolean;
      b();
    }
  }

  public final void a(int[] paramArrayOfInt)
  {
    int j = 0;
    boolean[] arrayOfBoolean = new boolean[this.d.size()];
    s[] arrayOfs = new s[paramArrayOfInt.length];
    int k = -1;
    int m = 0;
    int n = 0;
    if (n < paramArrayOfInt.length)
    {
      arrayOfs[n] = g(paramArrayOfInt[n]);
      int i2 = arrayOfs[n].d;
      if (arrayOfBoolean[i2] != 0)
        throw new IllegalArgumentException("duplicate section id " + paramArrayOfInt[n]);
      arrayOfBoolean[i2] = true;
      if (k > i2);
      for (int i3 = 1; ; i3 = 0)
      {
        int i4 = i3 | m;
        n++;
        m = i4;
        k = i2;
        break;
      }
    }
    if (m != 0)
    {
      for (int i1 = 0; j < paramArrayOfInt.length; i1++)
        if (arrayOfBoolean[i1] != 0)
        {
          arrayOfs[j].d = i1;
          this.d.set(i1, arrayOfs[j]);
          j++;
        }
      b();
    }
  }

  public final boolean a(int paramInt)
  {
    return g(paramInt).a();
  }

  public boolean areAllItemsEnabled()
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      s locals = (s)localIterator.next();
      if ((locals.f) && (!locals.a.areAllItemsEnabled()))
        return false;
    }
    return true;
  }

  public final int b(int paramInt)
  {
    s locals = f(paramInt);
    int j = locals.d(paramInt);
    if (locals.a(j));
    while ((locals.b(j)) || (locals.c(j)))
      return -2147483648;
    return locals.c;
  }

  public final void b(int[] paramArrayOfInt)
  {
    int j = paramArrayOfInt.length;
    int k = 0;
    int m = 0;
    while (k < j)
    {
      int n = paramArrayOfInt[k];
      if (g(n).f)
        m = 1;
      g(n).f = false;
      k++;
    }
    if (m != 0)
      b();
  }

  public final void c(int[] paramArrayOfInt)
  {
    int j = 0;
    Iterator localIterator = this.d.iterator();
    int k = 0;
    while (localIterator.hasNext())
    {
      s locals = (s)localIterator.next();
      if (locals.f)
        k = 1;
      locals.f = false;
    }
    int m = k;
    while (j <= 0)
    {
      int n = paramArrayOfInt[j];
      if (!g(n).f)
        m = 1;
      g(n).f = true;
      j++;
    }
    if (m != 0)
      b();
  }

  public final boolean c(int paramInt)
  {
    return this.e.get(paramInt, null) != null;
  }

  public final void d(int[] paramArrayOfInt)
  {
    int j = 0;
    int k = 0;
    while (j <= 0)
    {
      int m = paramArrayOfInt[0];
      if (!g(m).f)
        k = 1;
      g(m).f = true;
      j++;
    }
    if (k != 0)
      b();
  }

  public final boolean d(int paramInt)
  {
    s locals = g(paramInt);
    boolean bool1 = locals.f;
    if (locals.a.getCount() > 0);
    for (boolean bool2 = true; ; bool2 = false)
    {
      locals.f = bool2;
      if (bool1 != locals.f)
        b();
      return locals.f;
    }
  }

  public final int e(int paramInt)
  {
    s locals = g(paramInt);
    i.b(locals.f, "cannot get position of hidden section");
    return locals.g;
  }

  public int getCount()
  {
    return this.f;
  }

  public Object getItem(int paramInt)
  {
    s locals = f(paramInt);
    int j = locals.d(paramInt);
    if (locals.a(j))
      return locals.b;
    if (locals.b(j))
      return locals.j;
    if (locals.c(j))
      return locals.k;
    return locals.a.getItem(locals.e(paramInt));
  }

  public long getItemId(int paramInt)
  {
    s locals = f(paramInt);
    int j = locals.d(paramInt);
    if (locals.a(j))
      return -1L;
    if (locals.b(j))
      return -2L;
    if (locals.c(j))
      return -3L;
    int k = locals.e(paramInt);
    return locals.a.getItemId(k);
  }

  public int getItemViewType(int paramInt)
  {
    int j = -1;
    s locals = f(paramInt);
    int k = locals.d(paramInt);
    if (locals.a(k))
      j = 0;
    int n;
    do
    {
      return j;
      if (locals.b(k))
        return 1;
      if (locals.c(k))
        return 2;
      int m = locals.e(paramInt);
      n = locals.a.getItemViewType(m);
    }
    while ((n == j) || (n == -2));
    return n + locals.i;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    s locals = f(paramInt);
    int j = locals.d(paramInt);
    if (locals.a(j))
    {
      String str = locals.b.toUpperCase(Locale.getDefault());
      t localt = locals.e;
      int k = locals.c;
      View localView = this.c.a();
      this.c.a(k, localView, str, localt);
      return localView;
    }
    if (locals.b(j))
      return (View)i.a(locals.j);
    if (locals.c(j))
      return (View)i.a(locals.k);
    return (View)i.a(locals.a.getView(locals.e(paramInt), paramView, paramViewGroup));
  }

  public int getViewTypeCount()
  {
    return this.g;
  }

  public boolean hasStableIds()
  {
    return false;
  }

  public boolean isEmpty()
  {
    return this.f == 0;
  }

  public boolean isEnabled(int paramInt)
  {
    s locals = f(paramInt);
    int j = locals.d(paramInt);
    if (locals.a(j));
    while ((locals.b(j)) || (locals.c(j)))
      return false;
    return locals.a.isEnabled(locals.e(paramInt));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
