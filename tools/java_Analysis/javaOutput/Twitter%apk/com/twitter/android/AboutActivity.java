package com.twitter.android;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;

public class AboutActivity extends PreferenceActivity
{
  public AboutActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    addPreferencesFromResource(2131034112);
    localPreference1 = findPreference("vers");
    try
    {
      localPreference1.setSummary(getPackageManager().getPackageInfo(getPackageName(), 0).versionName);
      Intent localIntent1 = new Intent(this, ProfileActivity.class);
      localIntent1.putExtra("screen_name", getString(2131427631));
      findPreference("support_account").setIntent(localIntent1);
      Preference localPreference2 = findPreference("legal");
      Intent localIntent2 = new Intent(this, WebViewActivity.class);
      localIntent2.setData(Uri.parse("file:///android_asset/legal.html"));
      localPreference2.setIntent(localIntent2);
      findPreference("tos").setIntent(new Intent("android.intent.action.VIEW", Uri.parse("http://twitter.com/tos")));
      findPreference("pp").setIntent(new Intent("android.intent.action.VIEW", Uri.parse("http://twitter.com/privacy")));
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        localPreference1.setSummary(2131427343);
    }
  }

  public boolean onSearchRequested()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.AboutActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
