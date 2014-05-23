package com.twitter.android;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import com.twitter.android.client.g;
import cr;

public class SettingsActivity extends PreferenceActivity
  implements OnAccountsUpdateListener, Preference.OnPreferenceChangeListener
{
  public SettingsActivity()
  {
  }

  public void onAccountsUpdated(Account[] paramArrayOfAccount)
  {
    int i = 0;
    PreferenceGroup localPreferenceGroup = (PreferenceGroup)findPreference("accounts");
    Preference localPreference1 = localPreferenceGroup.findPreference("add_account");
    localPreferenceGroup.removeAll();
    int j = paramArrayOfAccount.length;
    int k = 0;
    while (i < j)
    {
      Account localAccount = paramArrayOfAccount[i];
      if ("com.twitter.android.auth.login".equals(localAccount.type))
      {
        Preference localPreference2 = new Preference(this);
        localPreference2.setTitle(localAccount.name);
        int m = k + 1;
        localPreference2.setOrder(k);
        localPreference2.setIntent(new Intent(this, AccountSettingsActivity.class).putExtra("account", localAccount));
        localPreferenceGroup.addPreference(localPreference2);
        k = m;
      }
      i++;
    }
    localPreference1.setOrder(k);
    localPreference1.setIntent(new Intent(this, LoginActivity.class).putExtra("add_account", true));
    localPreferenceGroup.addPreference(localPreference1);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    addPreferencesFromResource(2131034119);
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
    Preference localPreference1 = findPreference("photo_service");
    cr.a((ListPreference)localPreference1, localSharedPreferences.getString("photo_service", Integer.toString(2)));
    localPreference1.setOnPreferenceChangeListener(this);
    Preference localPreference2 = findPreference("font_size");
    cr.a((ListPreference)localPreference2, localSharedPreferences.getString("font_size", "14"));
    localPreference2.setOnPreferenceChangeListener(this);
    findPreference("about").setIntent(new Intent(this, AboutActivity.class));
    AccountManager.get(this).addOnAccountsUpdatedListener(this, null, true);
  }

  protected void onDestroy()
  {
    super.onDestroy();
    AccountManager.get(this).removeOnAccountsUpdatedListener(this);
  }

  public boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    cr.a((ListPreference)paramPreference, (String)paramObject);
    return true;
  }

  protected void onResume()
  {
    super.onResume();
    if (!g.a(this).h())
      finish();
  }

  public boolean onSearchRequested()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.SettingsActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
