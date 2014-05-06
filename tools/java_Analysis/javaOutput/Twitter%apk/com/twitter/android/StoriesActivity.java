package com.twitter.android;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class StoriesActivity extends BaseFragmentActivity
{
  public StoriesActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903064, true);
    c(2131427676);
    if (paramBundle == null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("refresh", false);
      StoriesFragment localStoriesFragment = new StoriesFragment();
      localStoriesFragment.setArguments(localBundle);
      getSupportFragmentManager().beginTransaction().add(2131165243, localStoriesFragment).commit();
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.StoriesActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
