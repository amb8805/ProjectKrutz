package com.google.android.gms.internal;

import android.os.Handler;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.b;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import java.util.ArrayList;

public abstract class cr<T extends IInterface>
  implements b
{
  public static final String[] c = { "service_esmobile", "service_googleme" };
  final Handler a;
  final ArrayList<c> b;
  private T d;
  private ArrayList<c> e;
  private boolean f;
  private ArrayList<d> g;
  private boolean h;
  private final ArrayList<cr<T>.cs<?>> i;

  public final void a(c paramc)
  {
    f.a(paramc);
    synchronized (this.e)
    {
      if (this.e.contains(paramc))
      {
        Log.w("GmsClient", "registerConnectionCallbacks(): listener " + paramc + " is already registered");
        if (a())
          this.a.sendMessage(this.a.obtainMessage(4, paramc));
        return;
      }
      if (this.f)
        this.e = new ArrayList(this.e);
      this.e.add(paramc);
    }
  }

  public final void a(d paramd)
  {
    f.a(paramd);
    synchronized (this.g)
    {
      if (this.g.contains(paramd))
      {
        Log.w("GmsClient", "registerConnectionFailedListener(): listener " + paramd + " is already registered");
        return;
      }
      if (this.h)
        this.g = new ArrayList(this.g);
      this.g.add(paramd);
    }
  }

  public final void a(cr<T>.cs<?> paramcr)
  {
    synchronized (this.i)
    {
      this.i.add(paramcr);
      this.a.sendMessage(this.a.obtainMessage(2, paramcr));
      return;
    }
  }

  public final boolean a()
  {
    return this.d != null;
  }

  protected final void b()
  {
    if (!a())
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
  }

  public final boolean b(c paramc)
  {
    f.a(paramc);
    synchronized (this.e)
    {
      boolean bool = this.e.contains(paramc);
      return bool;
    }
  }

  public final boolean b(d paramd)
  {
    f.a(paramd);
    synchronized (this.g)
    {
      boolean bool = this.g.contains(paramd);
      return bool;
    }
  }

  protected final T c()
  {
    b();
    return this.d;
  }

  public final void c(c paramc)
  {
    f.a(paramc);
    synchronized (this.e)
    {
      if (this.e != null)
      {
        if (this.f)
          this.e = new ArrayList(this.e);
        if (this.e.remove(paramc))
          break label82;
        Log.w("GmsClient", "unregisterConnectionCallbacks(): listener " + paramc + " not found");
      }
      label82: 
      while ((!this.f) || (this.b.contains(paramc)))
        return;
      this.b.add(paramc);
    }
  }

  public final void c(d paramd)
  {
    f.a(paramd);
    synchronized (this.g)
    {
      if (this.g != null)
      {
        if (this.h)
          this.g = new ArrayList(this.g);
        if (!this.g.remove(paramd))
          Log.w("GmsClient", "unregisterConnectionFailedListener(): listener " + paramd + " not found");
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.cr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
