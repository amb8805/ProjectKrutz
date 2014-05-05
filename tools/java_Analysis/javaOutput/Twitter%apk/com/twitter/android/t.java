package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.twitter.android.client.g;

final class t
  implements DialogInterface.OnClickListener
{
  t(DialogActivity paramDialogActivity, long paramLong)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
      this.b.a.a(this.a, false);
    this.b.finish();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
