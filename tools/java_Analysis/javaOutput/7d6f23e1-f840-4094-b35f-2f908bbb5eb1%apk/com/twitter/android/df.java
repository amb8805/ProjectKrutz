package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.twitter.android.client.g;
import com.twitter.android.service.j;

final class df
  implements DialogInterface.OnClickListener
{
  df(ProfileFragment paramProfileFragment)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ProfileFragment localProfileFragment = this.a;
    localProfileFragment.c = (0xFFFFFFFE & localProfileFragment.c);
    this.a.a(true, 2131427534);
    g localg = this.a.j;
    this.a.b(localg.c(this.a.b));
    localg.a(localg.e(), j.z);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.df
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
