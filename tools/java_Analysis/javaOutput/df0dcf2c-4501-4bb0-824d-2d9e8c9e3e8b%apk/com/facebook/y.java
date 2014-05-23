package com.facebook;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.internal.v;
import java.util.Date;

final class y
  implements ServiceConnection
{
  final Messenger a = new Messenger(new z(this.c, this));
  Messenger b = null;

  y(Session paramSession)
  {
  }

  private void b()
  {
    if (Session.d(this.c) == this)
      Session.e(this.c);
  }

  public final void a()
  {
    Intent localIntent = v.a(Session.i());
    if ((localIntent != null) && (Session.m().bindService(localIntent, this, 1)))
    {
      this.c.a(new Date());
      return;
    }
    b();
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.b = new Messenger(paramIBinder);
    Bundle localBundle = new Bundle();
    localBundle.putString("access_token", this.c.l().a());
    Message localMessage = Message.obtain();
    localMessage.setData(localBundle);
    localMessage.replyTo = this.a;
    try
    {
      this.b.send(localMessage);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      b();
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    b();
    Session.m().unbindService(this);
  }
}

/* Location:
 * Qualified Name:     com.facebook.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
