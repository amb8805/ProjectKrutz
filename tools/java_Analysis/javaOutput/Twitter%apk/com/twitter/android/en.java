package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class en
  implements DialogInterface.OnClickListener
{
  en(PostActivity paramPostActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS").setFlags(268435456));
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.en
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
