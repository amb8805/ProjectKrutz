package com.spotify.mobile.android.d;

import android.os.Handler;
import android.os.Message;
import com.spotify.mobile.android.service.v;
import java.lang.ref.WeakReference;

final class f extends Handler
{
  private WeakReference<e> a;

  public f(e parame)
  {
    this.a = new WeakReference(parame);
  }

  public final void a()
  {
    e locale = (e)this.a.get();
    if (locale != null)
      e.g(locale).sendEmptyMessageDelayed(0, 120000L);
  }

  public final void handleMessage(Message paramMessage)
  {
    e locale = (e)this.a.get();
    if ((locale != null) && (paramMessage.what == 0))
    {
      locale.c();
      e.d(locale).b();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.d.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
