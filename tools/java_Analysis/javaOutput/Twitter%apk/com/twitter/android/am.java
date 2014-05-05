package com.twitter.android;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.twitter.android.client.g;
import com.twitter.android.provider.ax;
import com.twitter.android.service.j;

final class am
  implements DialogInterface.OnClickListener
{
  am(bo parambo, boolean paramBoolean, ax paramax, g paramg, String paramString, long paramLong, Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
      if (this.a)
        if (this.b.D > 0L)
          this.g.a.b(this.c.b(this.c.f(), this.b.D));
    while (paramInt != -3)
    {
      return;
      this.g.a.b(this.c.b(this.c.f(), this.b.z));
      return;
      this.g.a.b(this.c.a(this.c.f(), this.b.o, this.d));
      this.c.a(this.e, j.r);
      return;
    }
    Intent localIntent = new Intent(this.f, PostActivity.class);
    TweetListFragment localTweetListFragment = this.g.a;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.b.p;
    arrayOfObject[1] = this.b.d;
    localIntent.putExtra("android.intent.extra.TEXT", localTweetListFragment.getString(2131427328, arrayOfObject));
    localIntent.setAction("com.twitter.android.post.quote");
    this.g.a.startActivity(localIntent);
    this.c.a(this.e, j.t);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.am
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
