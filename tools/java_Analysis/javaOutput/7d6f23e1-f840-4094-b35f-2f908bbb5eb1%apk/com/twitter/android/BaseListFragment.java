package com.twitter.android;

import android.app.Dialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ar;
import com.twitter.android.client.g;
import com.twitter.android.client.i;
import com.twitter.android.widget.RefreshableListView;
import com.twitter.android.widget.p;
import com.twitter.android.widget.r;
import dz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class BaseListFragment extends Fragment
  implements LoaderManager.LoaderCallbacks, AbsListView.OnScrollListener, ar, p
{
  private boolean a;
  private eu b;
  private int c;
  private int d;
  private int e;
  private int f;
  private View g;
  private View h;
  protected boolean i;
  protected g j;
  protected i k;
  protected CursorAdapter l;
  protected int m;
  protected boolean n;
  protected long o;
  protected ListView p;
  protected int q;
  private ProgressBar r;
  private fn s;
  private ArrayList t;
  private fs u;
  private final AdapterView.OnItemClickListener v = new fy(this);
  private final Handler w = new Handler();
  private final Runnable x = new fx(this);

  public BaseListFragment()
  {
  }

  public static Bundle a(Intent paramIntent, boolean paramBoolean)
  {
    Bundle localBundle = paramIntent.getExtras();
    if (localBundle == null)
      localBundle = new Bundle();
    localBundle.putParcelable("data", paramIntent.getData());
    localBundle.putBoolean("refresh", paramBoolean);
    return localBundle;
  }

  private void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.p.setVisibility(8);
      this.g.setVisibility(0);
      this.h.setVisibility(8);
      this.r.setVisibility(0);
    }
    ListView localListView;
    do
    {
      return;
      this.h.setVisibility(0);
      this.r.setVisibility(8);
      localListView = this.p;
    }
    while (d_());
    this.g.setVisibility(8);
    localListView.setVisibility(0);
  }

  protected Dialog a(int paramInt)
  {
    return null;
  }

  protected final View a(LayoutInflater paramLayoutInflater, int paramInt, ViewGroup paramViewGroup)
  {
    View localView1 = paramLayoutInflater.inflate(paramInt, paramViewGroup, false);
    View localView2 = localView1.findViewById(16908292);
    this.h = localView2.findViewById(2131165241);
    this.r = ((ProgressBar)localView2.findViewById(2131165242));
    this.g = localView2;
    ListView localListView = (ListView)localView1.findViewById(16908298);
    localListView.setOnItemClickListener(this.v);
    localListView.setEmptyView(localView2);
    localListView.setScrollbarFadingEnabled(true);
    localListView.setOnScrollListener(this);
    localListView.setChoiceMode(this.q);
    int i1 = this.d;
    if (i1 != 0)
    {
      localView2.setBackgroundColor(i1);
      localListView.setBackgroundColor(i1);
      localListView.setCacheColorHint(i1);
    }
    if (this.a)
      ((RefreshableListView)localListView).a(this);
    if (this.c > 0)
    {
      View localView3 = paramLayoutInflater.inflate(2130903091, localListView, false);
      ((TextView)localView3.findViewById(2131165240)).setHint(this.c);
      localListView.addHeaderView(localView3, null, false);
      ((TextView)localView2.findViewById(2131165240)).setHint(this.c);
    }
    this.p = localListView;
    return localView1;
  }

  public final void a()
  {
    g(0);
  }

  protected final void a(int paramInt, ar paramar)
  {
    this.j.a(paramInt, paramar);
  }

  public void a(long paramLong)
  {
    this.o = paramLong;
  }

  protected void a(Cursor paramCursor)
  {
  }

  public void a(Loader paramLoader, Cursor paramCursor)
  {
    Cursor localCursor = this.l.getCursor();
    if (localCursor != null)
      localCursor.unregisterContentObserver(this.u);
    if (paramCursor != null)
      paramCursor.registerContentObserver(this.u);
    this.l.swapCursor(paramCursor);
  }

  protected void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
  }

  final void a(fn paramfn)
  {
    this.s = paramfn;
  }

  protected void a(r paramr)
  {
  }

  protected void a(r paramr, boolean paramBoolean)
  {
  }

  public void a(dz paramdz, HashMap paramHashMap)
  {
    if (this.m == 2)
    {
      this.n = true;
      return;
    }
    b_();
    this.n = false;
  }

  protected final void a(String paramString, int paramInt)
  {
    this.t.add(new dp(paramString, paramInt));
  }

  protected void a(boolean paramBoolean)
  {
  }

  protected void a_()
  {
  }

  public final void a_(boolean paramBoolean)
  {
    if (paramBoolean)
      a_();
  }

  public int b(long paramLong)
  {
    int i1 = d();
    if (i1 >= 0)
    {
      Cursor localCursor = this.l.getCursor();
      if ((localCursor != null) && (localCursor.moveToFirst()))
        do
          if (localCursor.getLong(i1) == paramLong)
          {
            int i2 = localCursor.getPosition() + this.p.getHeaderViewsCount();
            if (this.i)
              i2++;
            return i2;
          }
        while (localCursor.moveToNext());
    }
    return 0;
  }

  public final void b()
  {
    g(2);
  }

  protected final void b(int paramInt, ar paramar)
  {
    this.j.b(paramInt, paramar);
  }

  protected final void b(String paramString)
  {
    this.t.add(new dp(paramString));
  }

  protected void b_()
  {
    if (this.l != null)
      this.l.notifyDataSetChanged();
  }

  protected final dp c(String paramString)
  {
    ArrayList localArrayList = this.t;
    int i1 = 0;
    int i2 = localArrayList.size();
    while (i1 < i2)
    {
      if (((dp)localArrayList.get(i1)).a.equals(paramString))
        return (dp)localArrayList.remove(i1);
      i1++;
    }
    return null;
  }

  public final void c()
  {
    CursorAdapter localCursorAdapter = this.l;
    if (localCursorAdapter != null)
    {
      Cursor localCursor = localCursorAdapter.getCursor();
      if (localCursor != null)
        localCursor.requery();
    }
  }

  protected void c(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 3:
    case 2:
    case 4:
    case 1:
    }
    do
    {
      do
      {
        return;
        b(false);
        return;
      }
      while (!this.a);
      ((RefreshableListView)this.p).b();
      g(2);
      this.i = false;
      return;
    }
    while (!this.a);
    ((RefreshableListView)this.p).a(false);
  }

  protected void c_()
  {
    this.p.setSelectionFromTop(this.e, this.f);
  }

  protected int d()
  {
    return -1;
  }

  protected boolean d_()
  {
    ListView localListView = this.p;
    return localListView.getCount() - localListView.getHeaderViewsCount() - localListView.getFooterViewsCount() == 0;
  }

  protected final boolean e(int paramInt)
  {
    if (paramInt != 0)
    {
      Iterator localIterator = this.t.iterator();
      while (localIterator.hasNext())
        if (((dp)localIterator.next()).b == paramInt)
          return true;
    }
    return false;
  }

  protected void f()
  {
    if (this.u == null)
      this.u = new fs(this, this.w);
    getLoaderManager().initLoader(0, null, this);
  }

  protected void f(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 4:
      do
      {
        do
          return;
        while (!this.a);
        ((RefreshableListView)this.p).a(true);
        return;
      }
      while (!this.a);
      ((RefreshableListView)this.p).a();
      g(1);
      this.i = true;
      return;
    case 3:
    }
    b(true);
  }

  protected final int g(int paramInt)
  {
    if ((!isRemoving()) && (this.j.a()))
    {
      if (this.b == null)
        this.b = eu.a(getActivity());
      return this.b.a(paramInt);
    }
    return 0;
  }

  public r g()
  {
    ListView localListView = this.p;
    int i1 = localListView.getFirstVisiblePosition();
    int i2 = localListView.getHeaderViewsCount();
    if (this.i)
      i2++;
    View localView1;
    long l1;
    if (i1 < i2)
    {
      View localView2 = localListView.getChildAt(i2 - i1);
      int i4 = i2;
      localView1 = localView2;
      i1 = i4;
      l1 = localListView.getItemIdAtPosition(i1);
      if (localView1 == null)
        break label91;
    }
    label91: for (int i3 = localView1.getTop(); ; i3 = 0)
    {
      return new r(i1, l1, i3);
      localView1 = localListView.getChildAt(0);
      break;
    }
  }

  public final void h(int paramInt)
  {
    Dialog localDialog = a(paramInt);
    if (localDialog != null)
      localDialog.show();
  }

  protected final boolean i()
  {
    if (this.u == null)
      return false;
    getLoaderManager().restartLoader(0, null, this);
    return true;
  }

  protected final boolean j()
  {
    return !this.t.isEmpty();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.j = g.a(getActivity());
    if (paramBundle != null)
    {
      this.e = paramBundle.getInt("scroll_pos");
      this.f = paramBundle.getInt("scroll_off");
    }
    for (this.t = paramBundle.getParcelableArrayList("pending_reqs"); ; this.t = new ArrayList(5))
    {
      Bundle localBundle = getArguments();
      if (localBundle == null)
        break;
      this.a = localBundle.getBoolean("refresh", true);
      this.o = localBundle.getLong("owner_id", this.j.j());
      if (localBundle.containsKey("chmode"))
        this.q = localBundle.getInt("chmode", 0);
      this.c = localBundle.getInt("search_hint", 0);
      this.d = localBundle.getInt("bg_color", 0);
      return;
      this.e = 0;
      this.f = 0;
    }
    this.a = true;
    this.o = this.j.j();
    this.q = 0;
    this.c = 0;
    this.d = 0;
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return null;
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.c > 0)
      return a(paramLayoutInflater, 2130903053, paramViewGroup);
    return a(paramLayoutInflater, 2130903052, paramViewGroup);
  }

  public void onDestroy()
  {
    if (this.b != null)
      this.b.a();
    if (this.l != null)
    {
      Cursor localCursor = this.l.swapCursor(null);
      if ((localCursor != null) && (this.u != null))
        localCursor.unregisterContentObserver(this.u);
    }
    super.onDestroy();
  }

  public void onDestroyView()
  {
    this.w.removeCallbacks(this.x);
    super.onDestroyView();
  }

  public void onLoaderReset(Loader paramLoader)
  {
    Cursor localCursor = this.l.getCursor();
    if (localCursor != null)
      localCursor.unregisterContentObserver(this.u);
    this.l.swapCursor(null);
  }

  public void onPause()
  {
    super.onPause();
    g localg = this.j;
    if ((localg != null) && (this.k != null))
      localg.b(this.k);
    ListView localListView = this.p;
    int i1 = localListView.getFirstVisiblePosition();
    View localView = localListView.getChildAt(0);
    if (localView != null);
    for (int i2 = localView.getTop(); ; i2 = 0)
    {
      this.e = i1;
      this.f = i2;
      a(g());
      return;
    }
  }

  public void onResume()
  {
    super.onResume();
    if (this.k != null)
      this.j.a(this.k);
    int i1 = this.t.size() - 1;
    if (i1 >= 0)
    {
      dp localdp = (dp)this.t.get(i1);
      if (this.j.h(localdp.a))
        f(localdp.b);
      while (true)
      {
        i1--;
        break;
        c(localdp.b);
        this.t.remove(localdp);
      }
    }
    c_();
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putParcelableArrayList("pending_reqs", this.t);
    paramBundle.putInt("scroll_pos", this.e);
    paramBundle.putInt("scroll_off", this.f);
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 == 0);
    Cursor localCursor;
    do
    {
      do
      {
        return;
        if ((paramInt1 == 0) && (this.s != null))
          this.s.b();
      }
      while ((paramInt1 <= 0) || (this.l == null) || (paramInt1 + paramInt2 < paramInt3) || (this.l.getCount() <= 0));
      localCursor = this.l.getCursor();
    }
    while ((localCursor == null) || (!localCursor.moveToLast()));
    a(localCursor);
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    this.m = paramInt;
    if ((paramInt != 2) && (this.n))
    {
      b_();
      this.n = false;
    }
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.w.post(this.x);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.BaseListFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
