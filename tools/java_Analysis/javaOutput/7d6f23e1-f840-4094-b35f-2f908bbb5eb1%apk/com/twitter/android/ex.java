package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.client.g;
import com.twitter.android.provider.ax;

final class ex
  implements DialogInterface.OnClickListener
{
  ex(TweetFragment paramTweetFragment, FragmentActivity paramFragmentActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.j.b(this.b.a, this.b.b.z);
    this.a.finish();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ex
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
