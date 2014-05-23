package com.spotify.mobile.android.spotlets.collection.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.br;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.widget.SlidingTabLayout;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.NavigationItem.NavigationGroup;
import com.spotify.mobile.android.ui.activity.l;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.ba;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import com.spotify.mobile.android.util.cy;

public final class CollectionFragment extends Fragment
  implements NavigationItem, com.spotify.mobile.android.ui.fragments.g
{
  public static final String a = ViewUri.az.toString();
  private static final cy d = cy.a("page");
  private static final CollectionFragment.Page[] e = arrayOfPage;
  Handler b = new e(this);
  br c = new CollectionFragment.1(this);
  private CollectionFragment.Page[] f;
  private ViewPager g;
  private f h;
  private g i = null;

  static
  {
    CollectionFragment.Page[] arrayOfPage = new CollectionFragment.Page[4];
    arrayOfPage[0] = CollectionFragment.Page.d;
    arrayOfPage[1] = CollectionFragment.Page.a;
    arrayOfPage[2] = CollectionFragment.Page.b;
    arrayOfPage[3] = CollectionFragment.Page.c;
  }

  public CollectionFragment()
  {
  }

  private CollectionFragment.Page b(int paramInt)
  {
    if (paramInt < this.f.length)
      return this.f[paramInt];
    return CollectionFragment.Page.d;
  }

  public static CollectionFragment b()
  {
    Bundle localBundle = new Bundle();
    CollectionFragment localCollectionFragment = new CollectionFragment();
    localCollectionFragment.b_(localBundle);
    return localCollectionFragment;
  }

  public final Fragment C()
  {
    return this;
  }

  public final NavigationItem.NavigationGroup D()
  {
    return NavigationItem.NavigationGroup.i;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    ViewGroup localViewGroup = (ViewGroup)paramLayoutInflater.inflate(2130903132, paramViewGroup, false);
    this.f = e;
    this.h = new f(this, l(), paramBundle);
    this.g = ((ViewPager)localViewGroup.findViewById(2131362363));
    this.g.a(this.h);
    this.g.b(this.h.b());
    SlidingTabLayout localSlidingTabLayout = (SlidingTabLayout)localViewGroup.findViewById(2131362362);
    localSlidingTabLayout.a(this.g);
    localSlidingTabLayout.a(this.c);
    int j = cw.a(i()).a(d, CollectionFragment.Page.d.ordinal(), CollectionFragment.Page.a.ordinal(), CollectionFragment.Page.d.ordinal());
    Handler localHandler = this.b;
    CollectionFragment.Page localPage = CollectionFragment.Page.values()[j];
    int k = 0;
    if (k < this.f.length)
      if (localPage != this.f[k]);
    while (true)
    {
      localHandler.sendEmptyMessage(k);
      return localViewGroup;
      k++;
      break;
      k = 0;
    }
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131689687);
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Fragment localFragment = this.h.d(this.g.b());
    if (localFragment != null)
      localFragment.a(paramInt1, paramInt2, paramIntent);
  }

  public final void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      paramString = i().getString(2131689687);
    ((l)i()).a(this, paramString);
    ((l)i()).h();
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    this.h.a(paramBundle);
  }

  public final void d_()
  {
    super.d_();
    ba.a(this);
  }

  public final void w()
  {
    super.w();
    g localg = (g)this.h.d(this.g.b());
    if (localg != null)
      localg.D();
  }

  public final void x()
  {
    super.x();
    if (this.i != null)
      this.i.E();
    CollectionFragment.Page localPage = b(this.g.b());
    cw.a(i()).a().a(d, localPage.ordinal()).b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.collection.fragments.CollectionFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
