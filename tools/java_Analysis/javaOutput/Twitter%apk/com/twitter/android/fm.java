package com.twitter.android;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

final class fm
  implements Preference.OnPreferenceChangeListener
{
  fm(AccountSettingsActivity paramAccountSettingsActivity)
  {
  }

  public final boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    this.a.h = ((String)paramObject);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.fm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
