package com.twitter.android;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Intent;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RemoteViews;
import com.twitter.android.client.g;
import com.twitter.android.client.h;
import com.twitter.android.client.j;
import com.twitter.android.provider.q;
import java.util.ArrayList;

public class WidgetSettingsActivity extends PreferenceActivity
  implements OnAccountsUpdateListener, Preference.OnPreferenceChangeListener, View.OnClickListener
{
  private int a = 0;
  private String b = "";
  private int c = 0;

  public WidgetSettingsActivity()
  {
  }

  private void a()
  {
    AppWidgetManager localAppWidgetManager = AppWidgetManager.getInstance(this);
    int i = localAppWidgetManager.getAppWidgetInfo(this.a).initialLayout;
    int k;
    int j;
    switch (i)
    {
    default:
      k = 1;
      j = 2131034114;
      if (TextUtils.isEmpty(this.b))
        this.b = g.a(this).d();
      String str = this.b;
      q.a(this).a(this.a, k, str, this.c);
      RemoteViews localRemoteViews = new RemoteViews(getPackageName(), i);
      localAppWidgetManager.updateAppWidget(this.a, localRemoteViews);
      Intent localIntent = new Intent();
      localIntent.putExtra("appWidgetId", this.a);
      setResult(-1, localIntent);
      if (!TextUtils.isEmpty(str))
      {
        g localg = g.a(this);
        j localj = localg.b(str);
        localg.a(localj.e(), localj.g(), false);
      }
    case 2130903128:
    }
    while (true)
    {
      finish();
      return;
      j = 2131034115;
      k = 0;
      break;
      h.a(this, j);
    }
  }

  public void onAccountsUpdated(Account[] paramArrayOfAccount)
  {
    if ((paramArrayOfAccount == null) || (paramArrayOfAccount.length == 0) || (getPreferenceScreen() == null));
    ArrayList localArrayList;
    int k;
    int m;
    do
    {
      return;
      this.b = g.a(this).d();
      localArrayList = new ArrayList();
      int i = paramArrayOfAccount.length;
      int j = 0;
      k = -1;
      while (j < i)
      {
        Account localAccount = paramArrayOfAccount[j];
        if ("com.twitter.android.auth.login".equals(localAccount.type))
        {
          localArrayList.add(localAccount.name);
          if ((k == -1) && (localAccount.name.equals(this.b)))
            k = localArrayList.size() - 1;
        }
        j++;
      }
      m = localArrayList.size();
    }
    while ((m <= 1) || (k < 0));
    ListPreference localListPreference = new ListPreference(this);
    localListPreference.setKey("widget_account");
    localListPreference.setDialogTitle(2131427482);
    localListPreference.setPersistent(false);
    CharSequence[] arrayOfCharSequence = new CharSequence[m];
    localArrayList.toArray(arrayOfCharSequence);
    localListPreference.setEntries(arrayOfCharSequence);
    localListPreference.setEntryValues(arrayOfCharSequence);
    localListPreference.setValueIndex(k);
    localListPreference.setTitle(this.b);
    localListPreference.setSummary(null);
    localListPreference.setOnPreferenceChangeListener(this);
    PreferenceCategory localPreferenceCategory = new PreferenceCategory(this);
    localPreferenceCategory.setTitle(2131427482);
    localPreferenceCategory.setOrder(0);
    getPreferenceScreen().addPreference(localPreferenceCategory);
    localPreferenceCategory.addPreference(localListPreference);
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165392:
    }
    a();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903132);
    setResult(0);
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null)
      this.a = localBundle.getInt("appWidgetId", 0);
    if (this.a == 0)
      finish();
    if (!g.a(this).h())
      a();
    while (true)
    {
      AccountManager.get(this).addOnAccountsUpdatedListener(this, null, true);
      return;
      addPreferencesFromResource(2131034123);
      findPreference("widget_content_tweets").setOnPreferenceChangeListener(this);
      findPreference("widget_content_mentions").setOnPreferenceChangeListener(this);
      ((Button)findViewById(2131165392)).setOnClickListener(this);
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    AccountManager.get(this).removeOnAccountsUpdatedListener(this);
  }

  public boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    String str1 = paramPreference.getKey();
    if ("widget_account".equals(str1))
    {
      this.b = ((String)paramObject);
      ListPreference localListPreference = (ListPreference)paramPreference;
      String str2 = this.b;
      CharSequence[] arrayOfCharSequence = localListPreference.getEntries();
      int i = localListPreference.findIndexOfValue(str2);
      if (i != -1)
        localListPreference.setTitle(arrayOfCharSequence[i]);
      return true;
    }
    if ("widget_content_tweets".equals(str1))
    {
      this.c = 0;
      ((RadioButtonPreference)findPreference("widget_content_mentions")).setChecked(false);
      return true;
    }
    if ("widget_content_mentions".equals(str1))
    {
      this.c = 1;
      ((RadioButtonPreference)findPreference("widget_content_tweets")).setChecked(false);
      return true;
    }
    return false;
  }

  public boolean onSearchRequested()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.WidgetSettingsActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
