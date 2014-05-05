package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;

final class ef
  implements DialogInterface.OnClickListener
{
  ef(EditProfileActivity paramEditProfileActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bh localbh = new bh(this.a);
    Uri[] arrayOfUri = new Uri[1];
    arrayOfUri[0] = this.a.e;
    localbh.execute(arrayOfUri);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
