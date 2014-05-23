package com.twitter.android;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.twitter.android.client.g;

public class ActivitiesActivity extends BaseFragmentActivity
{
  public ActivitiesActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903064, true);
    if (!this.e.h());
    do
    {
      return;
      c(getString(2131427648));
    }
    while (paramBundle != null);
    ActivityFragment localActivityFragment = new ActivityFragment();
    localActivityFragment.a(this);
    localActivityFragment.setArguments(ActivityFragment.a(getIntent(), true));
    getSupportFragmentManager().beginTransaction().add(2131165243, localActivityFragment).commit();
  }

  protected void onResume()
  {
    super.onResume();
    if (!this.e.h());
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ActivitiesActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
