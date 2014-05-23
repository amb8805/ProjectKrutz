package com.spotify.mobile.android.ui.page;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public final class e extends j
  implements RadioGroup.OnCheckedChangeListener
{
  private final String b;
  private SharedPreferences c;

  public e(Context paramContext, ViewGroup paramViewGroup, String paramString, int paramInt1, int paramInt2)
  {
    super(paramContext, paramViewGroup);
    this.b = paramString;
    b(2130903216);
    ((TextView)c(2131362227)).setText(paramInt1);
    ((TextView)c(2131362569)).setText(paramInt2);
    this.c = PreferenceManager.getDefaultSharedPreferences(d());
    RadioGroup localRadioGroup = (RadioGroup)c(2131362570);
    RadioButton localRadioButton1 = (RadioButton)c(2131362571);
    RadioButton localRadioButton2 = (RadioButton)c(2131362572);
    localRadioButton1.setChecked(this.c.getBoolean(this.b, false));
    if (!localRadioButton1.isChecked());
    for (boolean bool = true; ; bool = false)
    {
      localRadioButton2.setChecked(bool);
      localRadioGroup.setOnCheckedChangeListener(this);
      return;
    }
  }

  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    boolean bool = false;
    switch (paramInt)
    {
    case 2131362572:
    default:
    case 2131362571:
    }
    while (true)
    {
      this.c.edit().putBoolean(this.b, bool).commit();
      return;
      bool = true;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
