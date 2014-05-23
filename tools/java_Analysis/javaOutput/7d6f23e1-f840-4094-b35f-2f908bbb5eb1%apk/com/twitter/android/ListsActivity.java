package com.twitter.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.twitter.android.client.g;
import com.twitter.android.service.j;

public class ListsActivity extends BaseFragmentActivity
  implements dn
{
  private long a;

  public ListsActivity()
  {
  }

  public final void a(long paramLong, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("list_id", paramLong);
    localIntent.putExtra("list_name", paramString);
    localIntent.putExtra("user_id", getIntent().getLongExtra("inquire_user_id", -1L));
    setResult(-1, localIntent);
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903064, false);
    Intent localIntent = getIntent();
    this.a = localIntent.getLongExtra("owner_id", this.e.j());
    int i = localIntent.getIntExtra("type", -1);
    String str = localIntent.getAction();
    if (i != -1)
      switch (i)
      {
      default:
        c(2131427364);
      case 0:
      case 1:
      case 2:
      }
    while (true)
    {
      if (paramBundle == null)
      {
        ListsFragment localListsFragment = new ListsFragment();
        Bundle localBundle = ListsFragment.a(localIntent, true);
        if ("android.intent.action.PICK".equals(str))
          localBundle.putInt("chmode", 1);
        localListsFragment.setArguments(localBundle);
        localListsFragment.a(this);
        getSupportFragmentManager().beginTransaction().add(2131165243, localListsFragment).commit();
      }
      return;
      if ("android.intent.action.PICK".equals(str))
      {
        c(2131427444);
      }
      else
      {
        c(2131427364);
        continue;
        c(2131427366);
        continue;
        c(2131427365);
        continue;
        c(2131427364);
      }
    }
  }

  protected void onStart()
  {
    super.onStart();
    if (this.a == this.e.j())
      this.e.a(this.a, j.g);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ListsActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
