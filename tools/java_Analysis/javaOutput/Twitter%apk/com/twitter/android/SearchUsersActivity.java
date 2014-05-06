package com.twitter.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.twitter.android.client.g;
import com.twitter.android.service.j;

public class SearchUsersActivity extends BaseFragmentActivity
{
  public SearchUsersActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903064, false);
    Intent localIntent = getIntent();
    String str = localIntent.getStringExtra("query");
    if ("com.twitter.android.action.USER_SHOW".equals(localIntent.getAction()))
    {
      startActivity(new Intent(this, ProfileActivity.class).putExtra("screen_name", str));
      finish();
    }
    do
    {
      return;
      if (paramBundle == null)
      {
        localIntent.putExtra("type", 3);
        Bundle localBundle = UsersFragment.a(localIntent, true);
        localBundle.putBoolean("follow", true);
        UsersFragment localUsersFragment = new UsersFragment();
        localUsersFragment.setArguments(localBundle);
        getSupportFragmentManager().beginTransaction().add(2131165243, localUsersFragment).commit();
      }
    }
    while (str == null);
    c(str);
  }

  protected void onStart()
  {
    super.onStart();
    this.e.a(this.e.e(), j.c);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.SearchUsersActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
