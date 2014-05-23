package com.spotify.mobile.android.service.connections;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public abstract class a
  implements ServiceConnection
{
  protected Context a;
  private Semaphore b = new Semaphore(1);

  public a(Context paramContext)
  {
    this.a = paramContext;
  }

  public final void a()
  {
    try
    {
      a(false);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.b.acquire();
    if (!c())
    {
      d();
      if (paramBoolean)
        try
        {
          boolean bool = this.b.tryAcquire(2L, TimeUnit.SECONDS);
          if (!bool)
          {
            return;
            f();
            this.b.release();
            return;
          }
          this.b.release();
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
        }
    }
  }

  public final void b()
  {
    if (c())
      e();
  }

  public abstract boolean c();

  public abstract void d();

  public abstract void e();

  public abstract void f();

  public abstract void g();

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    f();
    this.b.release();
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    e();
    g();
    this.b.release();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.connections.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
