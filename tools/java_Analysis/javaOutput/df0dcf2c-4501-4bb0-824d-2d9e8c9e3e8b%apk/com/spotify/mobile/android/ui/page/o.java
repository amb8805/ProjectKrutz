package com.spotify.mobile.android.ui.page;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.n;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.spotify.mobile.android.provider.w;

public final class o extends j
  implements RadioGroup.OnCheckedChangeListener
{
  private boolean b;
  private RadioButton c;
  private RadioButton d;
  private android.support.v4.app.o<Cursor> e = new o.1(this);

  public o(Context paramContext, ViewGroup paramViewGroup, n paramn)
  {
    super(paramContext, paramViewGroup);
    b(2130903216);
    ((TextView)c(2131362227)).setText("Use New Context Player");
    ((TextView)c(2131362569)).setText("The app needs to be restarted after this for the change to take place.");
    RadioGroup localRadioGroup = (RadioGroup)c(2131362570);
    this.c = ((RadioButton)c(2131362571));
    this.d = ((RadioButton)c(2131362572));
    localRadioGroup.setOnCheckedChangeListener(this);
    paramn.a(2131362168, null, this.e);
  }

  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    switch (paramInt)
    {
    default:
    case 2131362571:
    case 2131362572:
    }
    while (true)
    {
      d().getContentResolver().update(w.a, localContentValues, null, null);
      return;
      localContentValues.put("use_new_context_player", Boolean.valueOf(true));
      continue;
      localContentValues.put("use_new_context_player", Boolean.valueOf(false));
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
