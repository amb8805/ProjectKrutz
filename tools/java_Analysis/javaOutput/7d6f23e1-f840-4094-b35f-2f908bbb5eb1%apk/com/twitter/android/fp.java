package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.twitter.android.client.g;

final class fp
  implements DialogInterface.OnClickListener
{
  fp(DraftsActivity paramDraftsActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.e.c(this.a.a);
    this.a.setResult(2, null);
    this.a.finish();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.fp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
