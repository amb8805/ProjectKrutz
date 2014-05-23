package com.spotify.mobile.android.service.flow.login;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class m extends Handler
{
  private final WeakReference<NewStartFragment> a;

  private m(NewStartFragment paramNewStartFragment)
  {
    this.a = new WeakReference(paramNewStartFragment);
  }

  public final void handleMessage(Message paramMessage)
  {
    NewStartFragment localNewStartFragment = (NewStartFragment)this.a.get();
    if ((localNewStartFragment == null) || (localNewStartFragment.o_()) || (localNewStartFragment.v() == null));
    do
    {
      return;
      if (paramMessage.what == 1)
      {
        NewStartFragment.j(localNewStartFragment);
        return;
      }
    }
    while (paramMessage.what != 2);
    NewStartFragment.l(localNewStartFragment);
    localNewStartFragment.D();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.login.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
