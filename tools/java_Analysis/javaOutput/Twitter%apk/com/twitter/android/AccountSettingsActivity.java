package com.twitter.android;

import ad;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import com.twitter.android.client.g;
import com.twitter.android.client.i;
import cr;
import do;
import java.io.IOException;
import org.json.JSONException;

public class AccountSettingsActivity extends PreferenceActivity
  implements Preference.OnPreferenceChangeListener, Preference.OnPreferenceClickListener
{
  boolean a;
  Account b;
  g c;
  Integer d;
  Integer e;
  Integer f;
  int g;
  String h;
  private i i;

  public AccountSettingsActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    addPreferencesFromResource(2131034113);
    this.b = ((Account)getIntent().getParcelableExtra("account"));
    setTitle(this.b.name);
    findPreference("polling_interval").setOnPreferenceChangeListener(this);
    findPreference("sync_contacts").setOnPreferenceChangeListener(this);
    findPreference("edit_profile").setOnPreferenceClickListener(this);
    findPreference("remove_account").setOnPreferenceClickListener(this);
    findPreference("ringtone").setOnPreferenceChangeListener(new fm(this));
    this.i = new at(this, null);
    this.c = g.a(this);
    this.c.a(this.i);
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return super.onCreateDialog(paramInt);
    case 1:
      fl localfl = new fl(this);
      return new AlertDialog.Builder(this).setTitle(2131427360).setMessage(2131427361).setIcon(17301659).setPositiveButton(17039379, localfl).setNegativeButton(17039369, null).create();
    case 2:
    }
    ProgressDialog localProgressDialog = new ProgressDialog(this);
    localProgressDialog.setProgressStyle(0);
    localProgressDialog.setMessage(getText(2131427362));
    localProgressDialog.setIndeterminate(true);
    localProgressDialog.setCancelable(false);
    return localProgressDialog;
  }

  protected void onDestroy()
  {
    super.onDestroy();
    this.c.b(this.i);
  }

  public boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    cr.a((ListPreference)paramPreference, (String)paramObject);
    return true;
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    String str = paramPreference.getKey();
    if ("remove_account".equals(str))
    {
      showDialog(1);
      return true;
    }
    if ("edit_profile".equals(str))
      try
      {
        ad localad = do.c(AccountManager.get(this).getUserData(this.b, "account_user_info"));
        startActivity(new Intent(this, EditProfileActivity.class).putExtra("user", localad));
        return true;
      }
      catch (IOException localIOException)
      {
        return false;
      }
      catch (JSONException localJSONException)
      {
        break label73;
      }
  }

  public boolean onSearchRequested()
  {
    return false;
  }

  public void onStart()
  {
    super.onStart();
    if (this.b != null)
      new dl(this, this.b).execute(new Void[0]);
  }

  public void onStop()
  {
    super.onStop();
    if (this.b != null)
      new fv(this, this.b).execute(new Void[0]);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.AccountSettingsActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
