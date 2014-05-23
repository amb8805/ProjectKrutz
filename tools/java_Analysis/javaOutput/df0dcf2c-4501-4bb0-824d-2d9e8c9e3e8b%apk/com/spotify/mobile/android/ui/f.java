package com.spotify.mobile.android.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.l;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.util.cc;
import java.util.ArrayList;
import java.util.Iterator;

public final class f
{
  private android.support.v4.app.g a;
  private ArrayList<k> b = new ArrayList();
  private ViewGroup c;
  private int d;
  private ArrayList<j> e = new ArrayList();
  private Context f;

  public f(Context paramContext, android.support.v4.app.g paramg, ViewGroup paramViewGroup)
  {
    this.f = ((Context)cc.a(paramContext));
    this.a = ((android.support.v4.app.g)cc.a(paramg));
    this.c = ((ViewGroup)cc.a(paramViewGroup));
    this.d = ((ViewGroup)cc.a(paramViewGroup)).getId();
    paramViewGroup.setOnHierarchyChangeListener(new f.1(this));
  }

  private void a(l paraml)
  {
    int i = 1;
    int j = -1 + this.e.size();
    int k = i;
    if (j >= 0)
    {
      j localj = (j)this.e.get(j);
      int n;
      int m;
      if (k > 0)
      {
        this.e.set(j, localj.c(paraml));
        int i1 = k - 1;
        int i2 = i;
        n = i1;
        m = i2;
      }
      while (true)
      {
        j--;
        k = n;
        i = m;
        break;
        if (i > 0)
        {
          this.e.set(j, localj.b(paraml));
          m = i - 1;
          n = k;
        }
        else
        {
          this.e.set(j, localj.a(paraml));
          m = i;
          n = k;
        }
      }
    }
  }

  private g e()
  {
    if (this.e.size() == 0)
      return null;
    j localj = (j)this.e.get(-1 + this.e.size());
    if (localj.a() != 2)
      return null;
    return localj.c(null);
  }

  private void f()
  {
    a();
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      ((k)localIterator.next()).E();
  }

  public final ActionBarTitle a()
  {
    g localg = e();
    if (localg != null)
      return localg.f();
    return new ActionBarTitle(this.f, "");
  }

  public final Class<? extends Fragment> a(View paramView)
  {
    for (int i = -1 + this.e.size(); i >= 0; i--)
    {
      j localj = (j)this.e.get(i);
      if (localj.a() == 0)
        break;
      if (localj.b() == paramView)
        return localj.c();
    }
    return null;
  }

  public final void a(Bundle paramBundle)
  {
    Parcelable[] arrayOfParcelable = paramBundle.getParcelableArray("entries");
    int i = arrayOfParcelable.length;
    int j = 0;
    if (j < i)
    {
      Bundle localBundle = (Bundle)arrayOfParcelable[j];
      localBundle.setClassLoader(this.f.getClassLoader());
      switch (localBundle.getInt("type"))
      {
      default:
      case 0:
      case 1:
      case 2:
      }
      while (true)
      {
        j++;
        break;
        this.e.add(new i(this, localBundle));
        continue;
        this.e.add(new h(this, localBundle));
        continue;
        this.e.add(new g(this, localBundle));
      }
    }
  }

  public final void a(Fragment paramFragment, ActionBarTitle paramActionBarTitle)
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if (localj.a() == 2)
      {
        g localg = localj.c(null);
        if (localg.d() == paramFragment)
          localg.a(paramActionBarTitle);
      }
    }
  }

  public final void a(Fragment paramFragment, String paramString)
  {
    ActionBarTitle localActionBarTitle = new ActionBarTitle(this.f, paramString);
    l locall = this.a.a();
    this.e.add(new g(this, locall, paramFragment, localActionBarTitle));
    a(locall);
    locall.b();
    this.a.b();
    f();
  }

  public final void a(k paramk)
  {
    this.b.add(paramk);
  }

  public final Fragment b()
  {
    g localg = e();
    if (localg != null)
      return localg.d();
    return null;
  }

  public final void b(k paramk)
  {
    this.b.remove(paramk);
  }

  public final boolean c()
  {
    if (this.e.size() <= 1)
      return false;
    l locall = this.a.a();
    ((j)this.e.remove(-1 + this.e.size())).d(locall);
    a(locall);
    locall.b();
    this.a.b();
    f();
    return true;
  }

  public final Bundle d()
  {
    Bundle localBundle = new Bundle();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
      localArrayList.add(((j)localIterator.next()).e());
    localBundle.putParcelableArray("entries", (Parcelable[])localArrayList.toArray(new Bundle[localArrayList.size()]));
    return localBundle;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
      localStringBuilder.append((j)localIterator.next()).append((char)'\n');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
