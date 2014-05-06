package com.twitter.android;

import android.accounts.Account;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.twitter.android.client.g;
import com.twitter.android.platform.d;

final class fl
  implements DialogInterface.OnClickListener
{
  fl(AccountSettingsActivity paramAccountSettingsActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = this.a.b.name;
    this.a.b = null;
    this.a.c.b(this.a.c.b(str));
    d.b(this.a, str);
    this.a.showDialog(2);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.fl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
