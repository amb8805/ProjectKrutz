package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public abstract class w
  implements ServiceConnection
{
  private final Context a;
  private final Handler b;
  private x c;
  private boolean d;
  private Messenger e;
  private int f;
  private int g;
  private final String h;
  private final int i;

  public w(Context paramContext, String paramString)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null)
      paramContext = localContext;
    this.a = paramContext;
    this.f = 65536;
    this.g = 65537;
    this.h = paramString;
    this.i = 20121101;
    this.b = new w.1(this);
  }

  private void a(Bundle paramBundle)
  {
    if (!this.d);
    x localx;
    do
    {
      return;
      this.d = false;
      localx = this.c;
    }
    while (localx == null);
    localx.a(paramBundle);
  }

  protected final void a(Message paramMessage)
  {
    Bundle localBundle;
    if (paramMessage.what == this.g)
    {
      localBundle = paramMessage.getData();
      if (localBundle.getString("com.facebook.platform.status.ERROR_TYPE") == null)
        break label39;
      a(null);
    }
    while (true)
    {
      this.a.unbindService(this);
      return;
      label39: a(localBundle);
    }
  }

  public final void a(x paramx)
  {
    this.c = paramx;
  }

  public final boolean a()
  {
    if (this.d);
    Intent localIntent;
    do
    {
      do
        return false;
      while (v.a(this.a, this.i) == -1);
      localIntent = v.b(this.a);
    }
    while (localIntent == null);
    this.d = true;
    this.a.bindService(localIntent, this, 1);
    return true;
  }

  public final void b()
  {
    this.d = false;
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.e = new Messenger(paramIBinder);
    Bundle localBundle = new Bundle();
    localBundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.h);
    Message localMessage = Message.obtain(null, this.f);
    localMessage.arg1 = this.i;
    localMessage.setData(localBundle);
    localMessage.replyTo = new Messenger(this.b);
    try
    {
      this.e.send(localMessage);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      a(null);
    }
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.e = null;
    this.a.unbindService(this);
    a(null);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
