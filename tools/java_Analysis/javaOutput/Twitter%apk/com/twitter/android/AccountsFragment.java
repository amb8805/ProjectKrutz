package com.twitter.android;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ListView;
import ar;
import com.twitter.android.client.g;
import do;
import dz;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;

public class AccountsFragment extends BaseListFragment
  implements OnAccountsUpdateListener, ar
{
  private c a;
  private bz b;
  private String c;
  private int d;

  public AccountsFragment()
  {
  }

  private static ce a(AccountManager paramAccountManager, Account paramAccount)
  {
    try
    {
      ce localce = new ce(paramAccount, do.c(paramAccountManager.getUserData(paramAccount, "account_user_info")));
      return localce;
    }
    catch (IOException localIOException)
    {
      return new ce(paramAccount, null);
    }
    catch (JSONException localJSONException)
    {
      break label23;
    }
  }

  private ce[] a(Account[] paramArrayOfAccount)
  {
    if ((paramArrayOfAccount == null) || (paramArrayOfAccount.length == 0))
      return null;
    AccountManager localAccountManager = AccountManager.get(getActivity());
    int i = paramArrayOfAccount.length;
    ce[] arrayOfce = new ce[i];
    for (int j = 0; j < i; j++)
      arrayOfce[j] = a(localAccountManager, paramArrayOfAccount[j]);
    return arrayOfce;
  }

  protected final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    if (paramLong > 0L)
      if (this.o != paramLong)
      {
        ce localce = (ce)paramListView.getItemAtPosition(paramInt);
        this.j.a(localce.a.name);
        this.a.a(localce);
      }
    Intent localIntent;
    do
    {
      return;
      localIntent = (Intent)paramListView.getItemAtPosition(paramInt);
    }
    while (localIntent == null);
    startActivity(localIntent);
  }

  public final void a(dz paramdz, HashMap paramHashMap)
  {
    if (this.b != null)
      this.b.notifyDataSetChanged();
  }

  public void onAccountsUpdated(Account[] paramArrayOfAccount)
  {
    AccountManager localAccountManager = AccountManager.get(getActivity());
    Account[] arrayOfAccount = localAccountManager.getAccountsByType("com.twitter.android.auth.login");
    int i = this.d;
    int j;
    if (arrayOfAccount != null)
    {
      this.d = arrayOfAccount.length;
      int n = arrayOfAccount.length;
      int i1 = 0;
      int i2 = 0;
      while (i1 < n)
      {
        Account localAccount2 = arrayOfAccount[i1];
        if ((i2 == 0) && (localAccount2.name.equals(this.c)))
          i2 = 1;
        i1++;
      }
      j = i2;
      if ((j != 0) || (this.d <= 0))
        break label135;
      this.c = null;
    }
    while (true)
    {
      if (this.b != null)
        this.b.a(a(arrayOfAccount));
      return;
      this.d = 0;
      j = 0;
      break;
      label135: if ((i == 1) && (this.d == 2))
      {
        int k = arrayOfAccount.length;
        for (int m = 0; m < k; m++)
        {
          Account localAccount1 = arrayOfAccount[m];
          if (!localAccount1.name.equals(this.c))
          {
            this.j.a(localAccount1.name);
            this.a.a(a(localAccountManager, localAccount1));
            return;
          }
        }
      }
    }
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    FragmentActivity localFragmentActivity = getActivity();
    g localg = this.j;
    ce[] arrayOfce;
    if (this.b == null)
    {
      arrayOfce = a(AccountManager.get(localFragmentActivity).getAccountsByType("com.twitter.android.auth.login"));
      if (arrayOfce == null)
        break label80;
    }
    label80: for (this.d = arrayOfce.length; ; this.d = 0)
    {
      this.b = new bz(localFragmentActivity, localg, arrayOfce, this.c);
      this.p.setAdapter(this.b);
      return;
    }
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.a = ((c)paramActivity);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.c = this.j.d();
    this.o = this.j.e();
    a(1, this);
    AccountManager.get(getActivity()).addOnAccountsUpdatedListener(this, null, true);
  }

  public void onDestroy()
  {
    super.onDestroy();
    b(1, this);
    AccountManager.get(getActivity()).removeOnAccountsUpdatedListener(this);
  }

  public void onResume()
  {
    super.onResume();
    if (this.c == null)
    {
      g localg = this.j;
      String str = localg.d();
      localg.a(str);
      this.c = str;
      this.b.a(this.c);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.AccountsFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
