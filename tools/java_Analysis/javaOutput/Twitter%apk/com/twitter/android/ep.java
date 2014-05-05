package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.twitter.android.client.g;

final class ep
  implements DialogInterface.OnClickListener
{
  ep(PostActivity paramPostActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a(true);
    this.a.b();
    this.a.a.b(true);
    this.a.e = true;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ep
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
