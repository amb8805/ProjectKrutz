package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.client.g;
import com.twitter.android.provider.ax;

final class ey
  implements DialogInterface.OnClickListener
{
  ey(TweetFragment paramTweetFragment, boolean paramBoolean, g paramg, ax paramax, long paramLong, FragmentActivity paramFragmentActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
      if (this.a)
      {
        this.b.b(this.f.a, this.c.z);
        this.e.finish();
      }
    while (paramInt != -3)
      while (true)
      {
        return;
        this.b.a(this.f.a, this.c.o, this.f.d);
        this.b.a(this.d, com.twitter.android.service.j.r, com.twitter.android.service.j.q);
      }
    TweetFragment localTweetFragment1 = this.f;
    Intent localIntent = new Intent(this.e, PostActivity.class);
    TweetFragment localTweetFragment2 = this.f;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.c.p;
    arrayOfObject[1] = this.c.d;
    localTweetFragment1.startActivity(localIntent.putExtra("android.intent.extra.TEXT", localTweetFragment2.getString(2131427328, arrayOfObject)).putExtra("account_name", this.f.a.e()).setAction("com.twitter.android.post.quote"));
    this.b.a(this.d, com.twitter.android.service.j.t, com.twitter.android.service.j.q);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
