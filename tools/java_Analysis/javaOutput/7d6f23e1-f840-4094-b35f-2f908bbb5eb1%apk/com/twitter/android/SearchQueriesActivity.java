package com.twitter.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class SearchQueriesActivity extends BaseFragmentActivity
{
  public SearchQueriesActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903064, false);
    Intent localIntent = getIntent();
    switch (localIntent.getIntExtra("q_type", 0))
    {
    default:
    case 6:
    case 1:
    }
    while (true)
    {
      if (paramBundle == null)
      {
        SearchQueriesFragment localSearchQueriesFragment = new SearchQueriesFragment();
        localSearchQueriesFragment.setArguments(SearchQueriesFragment.a(localIntent, false));
        getSupportFragmentManager().beginTransaction().add(2131165243, localSearchQueriesFragment).commit();
      }
      return;
      c(2131427683);
      continue;
      c(2131427532);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.SearchQueriesActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
