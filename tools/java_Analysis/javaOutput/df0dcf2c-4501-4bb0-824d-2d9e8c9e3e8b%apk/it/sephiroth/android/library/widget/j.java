package it.sephiroth.android.library.widget;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.support.v4.c.n;
import android.view.View;
import android.widget.ListAdapter;
import java.util.ArrayList;

public final class j
{
  private k b;
  private int c;
  private View[] d = new View[0];
  private ArrayList<View>[] e;
  private int f;
  private ArrayList<View> g;
  private ArrayList<View> h;
  private n<View> i;

  public j(AbsHListView paramAbsHListView)
  {
  }

  public final void a()
  {
    int j = 0;
    if (this.f == 1)
    {
      ArrayList localArrayList2 = this.g;
      int i3 = localArrayList2.size();
      for (int i4 = 0; i4 < i3; i4++)
        ((View)localArrayList2.get(i4)).forceLayout();
    }
    int k = this.f;
    for (int m = 0; m < k; m++)
    {
      ArrayList localArrayList1 = this.e[m];
      int i1 = localArrayList1.size();
      for (int i2 = 0; i2 < i1; i2++)
        ((View)localArrayList1.get(i2)).forceLayout();
    }
    if (this.i != null)
    {
      int n = this.i.a();
      while (j < n)
      {
        ((View)this.i.e(j)).forceLayout();
        j++;
      }
    }
  }

  public final void a(int paramInt)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("Can't have a viewTypeCount < 1");
    ArrayList[] arrayOfArrayList = new ArrayList[paramInt];
    for (int j = 0; j < paramInt; j++)
      arrayOfArrayList[j] = new ArrayList();
    this.f = paramInt;
    this.g = arrayOfArrayList[0];
    this.e = arrayOfArrayList;
  }

  public final void a(int paramInt1, int paramInt2)
  {
    if (this.d.length < paramInt1)
      this.d = new View[paramInt1];
    this.c = paramInt2;
    View[] arrayOfView = this.d;
    for (int j = 0; j < paramInt1; j++)
    {
      View localView = this.a.getChildAt(j);
      AbsHListView.LayoutParams localLayoutParams = (AbsHListView.LayoutParams)localView.getLayoutParams();
      if ((localLayoutParams != null) && (localLayoutParams.a != -2))
        arrayOfView[j] = localView;
    }
  }

  @SuppressLint({"NewApi"})
  public final void a(View paramView, int paramInt)
  {
    AbsHListView.LayoutParams localLayoutParams = (AbsHListView.LayoutParams)paramView.getLayoutParams();
    if (localLayoutParams == null)
      return;
    localLayoutParams.d = paramInt;
    int j = localLayoutParams.a;
    boolean bool;
    if (Build.VERSION.SDK_INT >= 16)
    {
      bool = paramView.hasTransientState();
      label38: if (j < 0)
        break label138;
    }
    label138: for (int k = 1; ; k = 0)
    {
      if ((k != 0) && (!bool))
        break label144;
      if ((j != -2) || (bool))
      {
        if (this.h == null)
          this.h = new ArrayList();
        this.h.add(paramView);
      }
      if (!bool)
        break;
      if (this.i == null)
        this.i = new n();
      paramView.onStartTemporaryDetach();
      this.i.a(paramInt, paramView);
      return;
      bool = false;
      break label38;
    }
    label144: paramView.onStartTemporaryDetach();
    if (this.f == 1)
      this.g.add(paramView);
    while (true)
    {
      if (Build.VERSION.SDK_INT >= 14)
        paramView.setAccessibilityDelegate(null);
      if (this.b == null)
        break;
      return;
      this.e[j].add(paramView);
    }
  }

  public final View b(int paramInt)
  {
    int j = paramInt - this.c;
    View[] arrayOfView = this.d;
    if ((j >= 0) && (j < arrayOfView.length))
    {
      View localView = arrayOfView[j];
      arrayOfView[j] = null;
      return localView;
    }
    return null;
  }

  public final void b()
  {
    int j = 0;
    if (this.f == 1)
    {
      ArrayList localArrayList2 = this.g;
      int i2 = localArrayList2.size();
      while (j < i2)
      {
        AbsHListView.a(this.a, (View)localArrayList2.remove(i2 - 1 - j));
        j++;
      }
    }
    int k = this.f;
    for (int m = 0; m < k; m++)
    {
      ArrayList localArrayList1 = this.e[m];
      int n = localArrayList1.size();
      for (int i1 = 0; i1 < n; i1++)
        AbsHListView.b(this.a, (View)localArrayList1.remove(n - 1 - i1));
    }
    if (this.i != null)
      this.i.b();
  }

  final View c(int paramInt)
  {
    if (this.i == null);
    int j;
    do
    {
      return null;
      j = this.i.f(paramInt);
    }
    while (j < 0);
    View localView = (View)this.i.e(j);
    this.i.c(j);
    return localView;
  }

  final void c()
  {
    if (this.i != null)
      this.i.b();
  }

  final View d(int paramInt)
  {
    if (this.f == 1)
      return AbsHListView.a(this.g, paramInt);
    int j = this.a.j.getItemViewType(paramInt);
    if ((j >= 0) && (j < this.e.length))
      return AbsHListView.a(this.e[j], paramInt);
    return null;
  }

  public final void d()
  {
    if (this.h == null)
      return;
    int j = this.h.size();
    for (int k = 0; k < j; k++)
      AbsHListView.c(this.a, (View)this.h.get(k));
    this.h.clear();
  }

  @SuppressLint({"NewApi"})
  public final void e()
  {
    View[] arrayOfView = this.d;
    int j;
    int k;
    label24: ArrayList localArrayList1;
    int m;
    label36: View localView;
    AbsHListView.LayoutParams localLayoutParams;
    int i9;
    boolean bool;
    label89: int i10;
    if (this.b != null)
    {
      j = 1;
      if (this.f <= 1)
        break label178;
      k = 1;
      localArrayList1 = this.g;
      m = -1 + arrayOfView.length;
      if (m < 0)
        break label259;
      localView = arrayOfView[m];
      if (localView != null)
      {
        localLayoutParams = (AbsHListView.LayoutParams)localView.getLayoutParams();
        i9 = localLayoutParams.a;
        arrayOfView[m] = null;
        if (Build.VERSION.SDK_INT < 16)
          break label183;
        bool = localView.hasTransientState();
        if (i9 < 0)
          break label189;
        i10 = 1;
        label97: if ((i10 != 0) && (!bool))
          break label195;
        if ((i9 != -2) || (bool))
          AbsHListView.d(this.a, localView);
        if (bool)
        {
          if (this.i == null)
            this.i = new n();
          this.i.a(m + this.c, localView);
        }
      }
    }
    while (true)
    {
      m--;
      break label36;
      j = 0;
      break;
      label178: k = 0;
      break label24;
      label183: bool = false;
      break label89;
      label189: i10 = 0;
      break label97;
      label195: if (k != 0)
        localArrayList1 = this.e[i9];
      localView.onStartTemporaryDetach();
      localLayoutParams.d = (m + this.c);
      localArrayList1.add(localView);
      if (Build.VERSION.SDK_INT >= 14)
        localView.setAccessibilityDelegate(null);
      if (j == 0);
    }
    label259: int n = this.d.length;
    int i1 = this.f;
    ArrayList[] arrayOfArrayList = this.e;
    for (int i2 = 0; i2 < i1; i2++)
    {
      ArrayList localArrayList2 = arrayOfArrayList[i2];
      int i4 = localArrayList2.size();
      int i5 = i4 - n;
      int i6 = i4 - 1;
      int i7 = 0;
      while (i7 < i5)
      {
        AbsHListView localAbsHListView = this.a;
        int i8 = i6 - 1;
        AbsHListView.e(localAbsHListView, (View)localArrayList2.remove(i6));
        i7++;
        i6 = i8;
      }
    }
    n localn = this.i;
    int i3 = 0;
    if (localn != null)
      while (i3 < this.i.a())
      {
        if (!((View)this.i.e(i3)).hasTransientState())
        {
          this.i.c(i3);
          i3--;
        }
        i3++;
      }
  }

  final void e(int paramInt)
  {
    if (this.f == 1)
    {
      ArrayList localArrayList2 = this.g;
      int i3 = localArrayList2.size();
      for (int i4 = 0; i4 < i3; i4++)
        ((View)localArrayList2.get(i4)).setDrawingCacheBackgroundColor(paramInt);
    }
    int j = this.f;
    for (int k = 0; k < j; k++)
    {
      ArrayList localArrayList1 = this.e[k];
      int i1 = localArrayList1.size();
      for (int i2 = 0; i2 < i1; i2++)
        ((View)localArrayList1.get(i2)).setDrawingCacheBackgroundColor(paramInt);
    }
    for (View localView : this.d)
      if (localView != null)
        localView.setDrawingCacheBackgroundColor(paramInt);
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
