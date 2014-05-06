package com.twitter.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.ProgressBar;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import com.twitter.android.widget.IconTabHost;
import com.twitter.android.widget.RefreshableListView;
import com.twitter.android.widget.n;
import java.util.HashMap;

public abstract class TabFragmentActivity extends BaseFragmentActivity
  implements TabHost.OnTabChangeListener, n
{
  private TabWidget a;
  private final HashMap b = new HashMap();
  private fa c;
  protected IconTabHost d;

  public TabFragmentActivity()
  {
  }

  protected abstract Fragment a(String paramString);

  public final void a()
  {
    RefreshableListView localRefreshableListView = (RefreshableListView)findViewById(16908298);
    if (localRefreshableListView != null)
      localRefreshableListView.e();
  }

  protected final void a(Bundle paramBundle, int paramInt, boolean paramBoolean)
  {
    super.a(paramBundle, paramInt, paramBoolean);
    IconTabHost localIconTabHost = (IconTabHost)findViewById(16908306);
    localIconTabHost.setup();
    localIconTabHost.setOnTabChangedListener(this);
    localIconTabHost.a(this);
    this.a = ((TabWidget)localIconTabHost.findViewById(16908307));
    this.d = localIconTabHost;
  }

  public final void a(TabHost.TabSpec paramTabSpec)
  {
    paramTabSpec.setContent(new i(this));
    String str = paramTabSpec.getTag();
    fa localfa = new fa(str);
    localfa.b = getSupportFragmentManager().findFragmentByTag(str);
    if ((localfa.b != null) && (!localfa.b.isDetached()))
      getSupportFragmentManager().beginTransaction().detach(localfa.b).commitAllowingStateLoss();
    this.b.put(str, localfa);
    this.d.addTab(paramTabSpec);
  }

  protected final void a(boolean paramBoolean)
  {
    IconTabHost localIconTabHost = this.d;
    ProgressBar localProgressBar = (ProgressBar)findViewById(2131165269);
    if (paramBoolean)
    {
      localIconTabHost.setVisibility(8);
      localProgressBar.setVisibility(0);
      return;
    }
    localIconTabHost.setVisibility(0);
    localProgressBar.setVisibility(8);
  }

  public void onTabChanged(String paramString)
  {
    fa localfa = (fa)this.b.get(paramString);
    FragmentManager localFragmentManager;
    FragmentTransaction localFragmentTransaction;
    if (this.c != localfa)
    {
      localFragmentManager = getSupportFragmentManager();
      localFragmentTransaction = localFragmentManager.beginTransaction();
      if ((this.c != null) && (this.c.b != null))
        localFragmentTransaction.detach(this.c.b);
      if (localfa != null)
      {
        if (localfa.b != null)
          break label122;
        localfa.b = a(paramString);
        localfa.b.setRetainInstance(true);
        localFragmentTransaction.add(2131165195, localfa.b, localfa.a);
      }
    }
    while (true)
    {
      this.c = localfa;
      localFragmentTransaction.commitAllowingStateLoss();
      localFragmentManager.executePendingTransactions();
      return;
      label122: localFragmentTransaction.attach(localfa.b);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.TabFragmentActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
