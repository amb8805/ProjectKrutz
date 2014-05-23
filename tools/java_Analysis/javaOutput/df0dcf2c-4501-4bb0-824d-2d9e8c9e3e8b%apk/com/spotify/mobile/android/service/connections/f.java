package com.spotify.mobile.android.service.connections;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class f<T extends IInterface>
{
  private final ServiceConnection a = new f.1(this);
  private final Context b;
  private final Class<? extends Service> c;
  private final String d;
  private final Set<g> e = Collections.synchronizedSet(new HashSet());
  private final Set f = Collections.synchronizedSet(new HashSet());
  private T g;
  private boolean h;

  protected f(Context paramContext, Class<? extends Service> paramClass, String paramString)
  {
    this.b = paramContext;
    this.c = paramClass;
    this.d = paramString;
  }

  private void a()
  {
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
      localIterator.next();
  }

  protected abstract T a(IBinder paramIBinder);

  public final void a(g paramg)
  {
    this.e.add(paramg);
  }

  public final void e()
  {
    if ((this.g != null) || (this.h));
    Intent localIntent;
    do
    {
      return;
      localIntent = new Intent(this.b, this.c);
      if (this.d != null)
        localIntent.setAction(this.d);
    }
    while (this.b.bindService(localIntent, this.a, 1));
    a();
  }

  public final void f()
  {
    if (this.h)
    {
      this.h = false;
      a();
    }
    if (this.g != null)
    {
      this.g = null;
      this.b.unbindService(this.a);
    }
  }

  public final boolean g()
  {
    return (this.g != null) && (!this.h);
  }

  protected final T h()
  {
    if ((this.g == null) || (!this.g.asBinder().pingBinder()))
      throw new RemoteException();
    return this.g;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.connections.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
