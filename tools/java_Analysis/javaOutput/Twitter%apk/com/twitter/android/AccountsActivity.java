package com.twitter.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.twitter.android.client.g;
import com.twitter.android.widget.Navbar;

public class AccountsActivity extends BaseFragmentActivity
  implements c
{
  public AccountsActivity()
  {
  }

  public final void a(ce paramce)
  {
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903064, true);
    if (!this.e.h());
    Intent localIntent;
    do
    {
      return;
      localIntent = getIntent();
      c(getString(localIntent.getIntExtra("title", 2131427633)));
      this.f.a(8, new int[] { 2131165255, 2131165284 });
    }
    while (paramBundle != null);
    AccountsFragment localAccountsFragment = new AccountsFragment();
    localAccountsFragment.a(this);
    localAccountsFragment.setArguments(AccountsFragment.a(localIntent, false));
    getSupportFragmentManager().beginTransaction().add(2131165243, localAccountsFragment).commit();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.AccountsActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
