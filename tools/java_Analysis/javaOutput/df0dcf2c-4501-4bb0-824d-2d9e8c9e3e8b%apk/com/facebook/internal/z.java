package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.content.n;
import com.facebook.Session;
import com.facebook.x;

public final class z
{
  private Session a;
  private final x b;
  private final BroadcastReceiver c;
  private final n d;
  private boolean e = false;

  public z(Context paramContext, x paramx)
  {
    this.b = new ab(this, paramx);
    this.a = null;
    this.c = new aa(this, (byte)0);
    this.d = n.a(paramContext);
  }

  private void g()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.facebook.sdk.ACTIVE_SESSION_SET");
    localIntentFilter.addAction("com.facebook.sdk.ACTIVE_SESSION_UNSET");
    this.d.a(this.c, localIntentFilter);
  }

  public final Session a()
  {
    if (this.a == null)
      return Session.h();
    return this.a;
  }

  public final Session b()
  {
    Session localSession = a();
    if ((localSession != null) && (localSession.a()))
      return localSession;
    return null;
  }

  public final void c()
  {
    if (this.a != null)
    {
      this.a.b(this.b);
      this.a = null;
      g();
      if (a() != null)
        a().a(this.b);
    }
  }

  public final void d()
  {
    if (this.e)
      return;
    if (this.a == null)
      g();
    if (a() != null)
      a().a(this.b);
    this.e = true;
  }

  public final void e()
  {
    if (!this.e)
      return;
    Session localSession = a();
    if (localSession != null)
      localSession.b(this.b);
    this.d.a(this.c);
    this.e = false;
  }

  public final boolean f()
  {
    return this.e;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
