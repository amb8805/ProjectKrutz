package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ax
  implements DialogInterface.OnClickListener
{
  ax(ListCreateEditActivity paramListCreateEditActivity, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.a == 2)
    {
      ListCreateEditActivity.a(this.b);
      return;
    }
    this.b.finish();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ax
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
