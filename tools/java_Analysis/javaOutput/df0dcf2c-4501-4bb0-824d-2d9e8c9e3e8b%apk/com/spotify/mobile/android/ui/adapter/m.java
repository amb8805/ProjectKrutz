package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.NavigationItemView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.spotlets.collection.fragments.CollectionFragment;
import com.spotify.mobile.android.ui.NavigationItem.NavigationGroup;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.dx;
import java.util.ArrayList;

public final class m extends BaseAdapter
{
  private Context a;
  private SpotifyLink b;
  private NavigationItem.NavigationGroup c = NavigationItem.NavigationGroup.a;
  private ArrayList<Integer> d = new ArrayList();

  public m(Context paramContext)
  {
    this.a = paramContext;
  }

  private void a(NavigationItemView paramNavigationItemView, int paramInt1, NavigationItem.NavigationGroup paramNavigationGroup, int paramInt2, SpotifyIcon paramSpotifyIcon, String paramString)
  {
    paramNavigationItemView.a();
    paramNavigationItemView.setId(paramInt1);
    if (f.a(this.a))
    {
      TextView localTextView = (TextView)paramNavigationItemView.getChildAt(0);
      Drawable[] arrayOfDrawable = new Drawable[1];
      arrayOfDrawable[0] = this.a.getResources().getDrawable(paramInt2);
      LayerDrawable localLayerDrawable = new LayerDrawable(arrayOfDrawable);
      paramNavigationItemView.a(SpotifyIcon.b);
      int i = localTextView.getCompoundDrawables()[0].getIntrinsicWidth();
      int j = (i - arrayOfDrawable[0].getIntrinsicWidth()) / 2;
      int k = (i - arrayOfDrawable[0].getIntrinsicHeight()) / 2;
      localLayerDrawable.setLayerInset(0, j, k, j, k);
      localLayerDrawable.setBounds(0, 0, i, i);
      localTextView.setCompoundDrawablesWithIntrinsicBounds(localLayerDrawable, null, null, null);
      paramNavigationItemView.a(paramString);
      if ((this.c == NavigationItem.NavigationGroup.a) || (paramNavigationGroup != this.c))
        break label187;
    }
    label187: for (boolean bool = true; ; bool = false)
    {
      paramNavigationItemView.a(bool);
      return;
      paramNavigationItemView.a(paramSpotifyIcon);
      break;
    }
  }

  public final String a(int paramInt)
  {
    switch (((Integer)this.d.get(paramInt)).intValue())
    {
    default:
      return null;
    case 0:
      return "spotify:search";
    case 9:
      return "spotify:app:genesis";
    case 1:
      return "spotify:app:browse";
    case 2:
      return "spotify:internal:discover";
    case 10:
      return "spotify:internal:social_chart";
    case 11:
      return "spotify:internal:activity_feed";
    case 3:
      return "spotify:internal:startpage";
    case 5:
      return CollectionFragment.a;
    case 7:
      return this.b.d();
    case 6:
      return "spotify:internal:inbox";
    case 4:
      return "spotify:internal:radio";
    case 8:
    }
    return "spotify:internal:preferences";
  }

  public final void a(NavigationItem.NavigationGroup paramNavigationGroup)
  {
    if (this.c != paramNavigationGroup)
    {
      this.c = paramNavigationGroup;
      notifyDataSetChanged();
    }
  }

  public final void a(String paramString)
  {
    this.b = SpotifyLink.a(paramString);
  }

  public final ViewUri.Verified b(int paramInt)
  {
    switch (((Integer)this.d.get(paramInt)).intValue())
    {
    default:
      return null;
    case 0:
      return ViewUri.y;
    case 9:
      return ViewUri.j;
    case 1:
      return ViewUri.k;
    case 2:
      return ViewUri.g;
    case 10:
      return ViewUri.h;
    case 11:
      return ViewUri.i;
    case 3:
      return ViewUri.f;
    case 5:
      return ViewUri.az;
    case 7:
      return ViewUri.A.a(this.b.d());
    case 6:
      return ViewUri.o;
    case 4:
      return ViewUri.e;
    case 8:
    }
    return ViewUri.q;
  }

  public final int getCount()
  {
    this.d.clear();
    this.d.add(Integer.valueOf(0));
    if ((FeatureFragment.b.a()) || (FeatureFragment.c.a()))
      this.d.add(Integer.valueOf(9));
    while (true)
    {
      if (FeatureFragment.aq.a())
        this.d.add(Integer.valueOf(10));
      if (FeatureFragment.ar.a())
        this.d.add(Integer.valueOf(11));
      this.d.add(Integer.valueOf(4));
      this.d.add(Integer.valueOf(5));
      if (f.a(this.a))
      {
        this.d.add(Integer.valueOf(6));
        this.d.add(Integer.valueOf(7));
      }
      this.d.add(Integer.valueOf(8));
      return this.d.size();
      if (FeatureFragment.e.a())
        this.d.add(Integer.valueOf(1));
      if (FeatureFragment.a.a())
        this.d.add(Integer.valueOf(2));
      else
        this.d.add(Integer.valueOf(3));
    }
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return ((Integer)this.d.get(paramInt)).intValue();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    NavigationItemView localNavigationItemView = null;
    if (paramView != null)
    {
      boolean bool = paramView instanceof NavigationItemView;
      localNavigationItemView = null;
      if (bool)
        localNavigationItemView = (NavigationItemView)paramView;
    }
    if (localNavigationItemView == null)
      localNavigationItemView = new NavigationItemView(this.a);
    switch (((Integer)this.d.get(paramInt)).intValue())
    {
    default:
      return localNavigationItemView;
    case 0:
      a(localNavigationItemView, 2131362187, NavigationItem.NavigationGroup.b, 2130838048, SpotifyIcon.al, this.a.getString(2131690188));
      return localNavigationItemView;
    case 9:
      a(localNavigationItemView, 2131362183, NavigationItem.NavigationGroup.o, 2130838043, SpotifyIcon.bt, this.a.getString(2131689964));
      return localNavigationItemView;
    case 1:
      if ((FeatureFragment.b.a()) || (FeatureFragment.c.a()))
      {
        a(localNavigationItemView, 2131362179, NavigationItem.NavigationGroup.c, 2130838041, SpotifyIcon.j, this.a.getString(2131689639));
        return localNavigationItemView;
      }
      a(localNavigationItemView, 2131362179, NavigationItem.NavigationGroup.c, 2130838041, SpotifyIcon.j, this.a.getString(2131689646));
      return localNavigationItemView;
    case 2:
      a(localNavigationItemView, 2131362182, NavigationItem.NavigationGroup.d, 2130838042, SpotifyIcon.aT, this.a.getString(2131689919));
      return localNavigationItemView;
    case 10:
      a(localNavigationItemView, 2131362188, NavigationItem.NavigationGroup.e, 2130838041, SpotifyIcon.aJ, this.a.getString(2131690291));
      return localNavigationItemView;
    case 11:
      a(localNavigationItemView, 2131362178, NavigationItem.NavigationGroup.f, 2130838041, SpotifyIcon.aB, this.a.getString(2131689495));
      return localNavigationItemView;
    case 3:
      a(localNavigationItemView, 2131362189, NavigationItem.NavigationGroup.g, 2130838050, SpotifyIcon.aT, this.a.getString(2131690003));
      return localNavigationItemView;
    case 5:
      a(localNavigationItemView, 2131362180, NavigationItem.NavigationGroup.i, 2130838045, SpotifyIcon.x, this.a.getString(2131689687));
      return localNavigationItemView;
    case 7:
      a(localNavigationItemView, 2131362185, NavigationItem.NavigationGroup.m, 2130838046, SpotifyIcon.aL, this.a.getString(2131690173));
      return localNavigationItemView;
    case 6:
      a(localNavigationItemView, 2131362184, NavigationItem.NavigationGroup.k, 2130838044, SpotifyIcon.J, this.a.getString(2131690010));
      return localNavigationItemView;
    case 4:
      a(localNavigationItemView, 2131362186, NavigationItem.NavigationGroup.h, 2130838047, SpotifyIcon.ah, this.a.getString(2131690182));
      return localNavigationItemView;
    case 8:
    }
    a(localNavigationItemView, 2131362181, NavigationItem.NavigationGroup.n, 2130838049, SpotifyIcon.H, this.a.getString(2131690248));
    return localNavigationItemView;
  }

  public final void notifyDataSetChanged()
  {
    if (Looper.getMainLooper() == Looper.myLooper());
    for (boolean bool = true; ; bool = false)
    {
      Assertion.a(bool, "notifyDataSetChanged must be called from main thread");
      super.notifyDataSetChanged();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
