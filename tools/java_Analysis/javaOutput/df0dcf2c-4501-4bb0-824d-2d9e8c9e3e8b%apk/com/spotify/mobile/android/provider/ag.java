package com.spotify.mobile.android.provider;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

final class ag extends Handler
{
  private WeakReference<ae> a;

  public ag(Looper paramLooper, ae paramae)
  {
    super(paramLooper);
    this.a = new WeakReference(paramae);
  }

  public final void handleMessage(Message paramMessage)
  {
    ae localae = (ae)this.a.get();
    if (localae == null)
      return;
    ae.a(localae, paramMessage.what);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
