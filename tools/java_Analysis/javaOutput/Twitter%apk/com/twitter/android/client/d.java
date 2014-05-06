package com.twitter.android.client;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

final class d
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  d(g paramg)
  {
  }

  public final void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    if ("sound_effects".equals(paramString))
      this.a.a = paramSharedPreferences.getBoolean(paramString, true);
    while (!"font_size".equals(paramString))
      return;
    this.a.b = Float.parseFloat(paramSharedPreferences.getString("font_size", "14"));
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.client.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
