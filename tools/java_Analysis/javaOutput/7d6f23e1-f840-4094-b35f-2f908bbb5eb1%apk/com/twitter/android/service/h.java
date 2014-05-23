package com.twitter.android.service;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class h extends Handler
{
  h(TwitterService paramTwitterService, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    Intent localIntent = (Intent)paramMessage.obj;
    e locale = (e)localIntent.getParcelableExtra("ibinder");
    if (locale != null)
      locale.a(localIntent);
    this.a.a(paramMessage.what);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.service.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
