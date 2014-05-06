package com.twitter.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.twitter.android.widget.RefreshableListView;
import com.twitter.android.widget.SegmentedControl;
import com.twitter.android.widget.e;
import java.util.ArrayList;

public class HomeActivity extends FragmentActivity
  implements ViewPager.OnPageChangeListener, AdapterView.OnItemSelectedListener, fn, e
{
  private BaseListFragment a;
  private String b;
  private ArrayList c;
  private dy[] d;
  private boolean[] e;
  private int f;
  private SegmentedControl g;

  public HomeActivity()
  {
  }

  public final int a()
  {
    return this.f;
  }

  public final void a(int paramInt)
  {
    b(paramInt);
  }

  public final void a(long paramLong)
  {
    dy[] arrayOfdy = this.d;
    int i = arrayOfdy.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      dy localdy = arrayOfdy[j];
      if (this.e[k] != 0)
      {
        BaseListFragment localBaseListFragment = (BaseListFragment)localdy.a(this);
        localBaseListFragment.a(paramLong);
        localBaseListFragment.c_();
        localBaseListFragment.a(true);
      }
      m = k + 1;
      j++;
    }
  }

  public final void b()
  {
    if (this.c.contains(this.b))
      ((HomeTabActivity)getParent()).a(false);
  }

  public final void b(int paramInt)
  {
    int i = Math.min(paramInt, this.d.length - 1);
    dy localdy = this.d[i];
    BaseListFragment localBaseListFragment1 = (BaseListFragment)localdy.a(this);
    BaseListFragment localBaseListFragment2 = this.a;
    String str = localdy.a;
    int j;
    if (localBaseListFragment2 == localBaseListFragment1)
    {
      j = 0;
      if (j != 0)
      {
        ((HomeTabActivity)getParent()).a(i);
        this.f = i;
      }
      this.e[i] = true;
      if (this.g != null)
        this.g.a(i);
      return;
    }
    FragmentManager localFragmentManager = getSupportFragmentManager();
    FragmentTransaction localFragmentTransaction = localFragmentManager.beginTransaction();
    if ((localBaseListFragment2 != null) && (!localBaseListFragment2.isDetached()))
      localFragmentTransaction.detach(localBaseListFragment2);
    if (localBaseListFragment1.isDetached())
      localFragmentTransaction.attach(localBaseListFragment1);
    while (true)
    {
      localFragmentTransaction.setTransition(4099);
      localFragmentTransaction.commitAllowingStateLoss();
      localFragmentManager.executePendingTransactions();
      this.a = localBaseListFragment1;
      this.b = str;
      j = 1;
      break;
      localBaseListFragment1.a(this);
      localFragmentTransaction.add(2131165243, localBaseListFragment1, str);
    }
  }

  public final void c()
  {
    View localView = this.a.getView();
    if (localView != null)
    {
      RefreshableListView localRefreshableListView = (RefreshableListView)localView.findViewById(16908298);
      if ((localRefreshableListView != null) && (!localRefreshableListView.e()))
        b();
    }
  }

  public final void d()
  {
    View localView = this.a.getView();
    if (localView != null)
      ((RefreshableListView)localView.findViewById(16908298)).setSelection(0);
  }

  public void onClickHandler(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165240:
    }
    onSearchRequested();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    int i = localIntent.getIntExtra("type", 0);
    int j;
    if (paramBundle == null)
    {
      j = localIntent.getIntExtra("home_item", 0);
      switch (i)
      {
      default:
        label31: setContentView(2130903065);
      case 2:
      }
    }
    while (true)
    {
      this.c = new ArrayList();
      switch (i)
      {
      default:
        throw new IllegalArgumentException("Invalid type");
        this.b = paramBundle.getString("cur_item");
        j = paramBundle.getInt("state_home_item");
        this.a = ((BaseListFragment)getSupportFragmentManager().findFragmentByTag(this.b));
        this.a.a(this);
        break label31;
        setContentView(2130903054);
        SegmentedControl localSegmentedControl = (SegmentedControl)findViewById(2131165244);
        localSegmentedControl.a(this);
        this.g = localSegmentedControl;
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    String str5 = getString(2131427357);
    this.c.add(str5);
    Bundle localBundle5 = new Bundle();
    localBundle5.putInt("type", 0);
    dy[] arrayOfdy3 = new dy[1];
    arrayOfdy3[0] = new dy(localBundle5, TimelineFragment.class, str5);
    Object localObject = arrayOfdy3;
    while (true)
    {
      this.d = ((dy[])localObject);
      this.e = new boolean[localObject.length];
      b(j);
      return;
      localObject = new dy[2];
      String str3 = getString(2131427648);
      this.c.add(str3);
      Bundle localBundle3 = new Bundle();
      localBundle3.putInt("activity_type", 0);
      localBundle3.putInt("search_hint", 2131427460);
      localObject[0] = new dy(localBundle3, ActivityFragment.class, str3);
      String str4 = getString(2131427358);
      this.c.add(str4);
      Bundle localBundle4 = new Bundle();
      localBundle4.putInt("type", 5);
      localBundle4.putInt("search_hint", 2131427460);
      localObject[1] = new dy(localBundle4, TimelineFragment.class, str4);
      continue;
      String str2 = getString(2131427676);
      this.c.add(str2);
      Bundle localBundle2 = new Bundle();
      localBundle2.putBoolean("refresh", false);
      localBundle2.putInt("search_hint", 2131427461);
      dy[] arrayOfdy2 = new dy[1];
      arrayOfdy2[0] = new dy(localBundle2, DiscoverFragment.class, str2);
      localObject = arrayOfdy2;
      continue;
      String str1 = getString(2131427634);
      this.c.add(str1);
      Bundle localBundle1 = new Bundle();
      localBundle1.putBoolean("refresh", false);
      dy[] arrayOfdy1 = new dy[1];
      arrayOfdy1[0] = new dy(localBundle1, AccountFragment.class, str1);
      localObject = arrayOfdy1;
    }
  }

  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
  }

  public void onNothingSelected(AdapterView paramAdapterView)
  {
  }

  public void onPageScrollStateChanged(int paramInt)
  {
  }

  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public void onPageSelected(int paramInt)
  {
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putString("cur_item", this.b);
    paramBundle.putInt("state_home_item", this.f);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.HomeActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
