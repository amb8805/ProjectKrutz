package com.facebook;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

final class z extends Handler
{
  private WeakReference<Session> a;
  private WeakReference<y> b;

  z(Session paramSession, y paramy)
  {
    super(Looper.getMainLooper());
    this.a = new WeakReference(paramSession);
    this.b = new WeakReference(paramy);
  }

  public final void handleMessage(Message paramMessage)
  {
    String str = paramMessage.getData().getString("access_token");
    Session localSession = (Session)this.a.get();
    if ((localSession != null) && (str != null))
      localSession.a(paramMessage.getData());
    y localy = (y)this.b.get();
    if (localy != null)
    {
      Session.m().unbindService(localy);
      y.a(localy);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
