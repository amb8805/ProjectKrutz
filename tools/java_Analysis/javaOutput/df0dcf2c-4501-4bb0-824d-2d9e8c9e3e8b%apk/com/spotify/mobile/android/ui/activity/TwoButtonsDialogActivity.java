package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import android.view.View;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.dv;

public abstract class TwoButtonsDialogActivity extends BaseFragmentActivity
{
  private a n = (a)c.a(a.class);

  public TwoButtonsDialogActivity()
  {
  }

  protected abstract ViewUri.Verified e();

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903076);
    findViewById(2131362445).setOnClickListener(new TwoButtonsDialogActivity.1(this));
    findViewById(2131362446).setOnClickListener(new TwoButtonsDialogActivity.2(this));
    a(dv.a(this, e()));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.TwoButtonsDialogActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
