package com.twitter.android;

import android.support.v4.app.FragmentManager;
import com.twitter.android.client.i;
import com.twitter.android.client.j;

final class bq extends i
{
  private bq(MessagesActivity paramMessagesActivity)
  {
  }

  public final void a(j paramj)
  {
    MessagesFragment localMessagesFragment = (MessagesFragment)this.a.getSupportFragmentManager().findFragmentById(2131165243);
    if (localMessagesFragment != null)
    {
      localMessagesFragment.a(paramj.g());
      localMessagesFragment.c_();
      localMessagesFragment.a(true);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
