package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class fk
  implements DialogInterface.OnClickListener
{
  fk(HomeTabActivity paramHomeTabActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.startActivity(new Intent(this.a, SettingsActivity.class));
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.fk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
