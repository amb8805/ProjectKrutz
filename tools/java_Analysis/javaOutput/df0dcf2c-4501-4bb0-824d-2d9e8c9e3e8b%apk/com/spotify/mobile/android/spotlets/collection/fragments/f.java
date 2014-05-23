package com.spotify.mobile.android.spotlets.collection.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.g;
import android.support.v4.app.j;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.spotify.mobile.android.util.Assertion;

final class f extends j
{
  g a;
  private SparseArray<String> c = new SparseArray();

  public f(CollectionFragment paramCollectionFragment, g paramg, Bundle paramBundle)
  {
    super(paramg);
    this.a = paramg;
    if (paramBundle != null)
    {
      int j = paramBundle.getInt("pager_size", 0);
      while (i < j)
      {
        int k = paramBundle.getInt("pager_key" + i);
        String str = paramBundle.getString("pager_value" + i);
        this.c.put(k, str);
        i++;
      }
    }
  }

  public final Fragment a(int paramInt)
  {
    switch (CollectionFragment.2.a[CollectionFragment.a(this.b, paramInt).ordinal()])
    {
    default:
      Assertion.a("Invalid page requested from page adapter");
      return null;
    case 1:
      return h.F();
    case 2:
      return i.F();
    case 3:
      return b.b();
    case 4:
    }
    return d.b();
  }

  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    Fragment localFragment = (Fragment)super.a(paramViewGroup, paramInt);
    this.c.put(paramInt, localFragment.k_());
    return localFragment;
  }

  public final void a(Bundle paramBundle)
  {
    for (int i = 0; i < this.c.size(); i++)
    {
      paramBundle.putInt("pager_key" + i, this.c.keyAt(i));
      paramBundle.putString("pager_value" + i, (String)this.c.valueAt(i));
    }
    paramBundle.putInt("pager_size", this.c.size());
  }

  public final int b()
  {
    return CollectionFragment.d(this.b).length;
  }

  public final CharSequence b(int paramInt)
  {
    switch (CollectionFragment.2.a[CollectionFragment.a(this.b, paramInt).ordinal()])
    {
    default:
      Assertion.a("Invalid page provided to getPageTitle in page adapter");
      return "";
    case 1:
      return this.b.a(2131689685);
    case 4:
      return this.b.a(2131689678);
    case 2:
      return this.b.a(2131689686);
    case 3:
    }
    return this.b.a(2131689675);
  }

  public final Fragment d(int paramInt)
  {
    return this.a.a((String)this.c.get(paramInt));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.collection.fragments.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
