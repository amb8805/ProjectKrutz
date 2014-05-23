package com.spotify.mobile.android.ui.page;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.o;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.spotify.mobile.android.provider.w;

public final class n extends j
  implements RadioGroup.OnCheckedChangeListener
{
  private int b;
  private RadioButton c;
  private RadioButton d;
  private RadioButton e;
  private o<Cursor> f = new n.1(this);

  public n(Context paramContext, ViewGroup paramViewGroup, android.support.v4.app.n paramn)
  {
    super(paramContext, paramViewGroup);
    b(2130903220);
    ((TextView)c(2131362227)).setText(2131689869);
    RadioGroup localRadioGroup = (RadioGroup)c(2131362570);
    this.c = ((RadioButton)c(2131362589));
    this.d = ((RadioButton)c(2131362571));
    this.e = ((RadioButton)c(2131362572));
    localRadioGroup.setOnCheckedChangeListener(this);
    paramn.a(2131362169, null, this.f);
  }

  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    switch (paramInt)
    {
    default:
    case 2131362589:
    case 2131362571:
    case 2131362572:
    }
    while (true)
    {
      d().getContentResolver().update(w.a, localContentValues, null, null);
      return;
      localContentValues.put("use_dfp_ad_stack", Integer.valueOf(0));
      continue;
      localContentValues.put("use_dfp_ad_stack", Integer.valueOf(2));
      continue;
      localContentValues.put("use_dfp_ad_stack", Integer.valueOf(1));
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
