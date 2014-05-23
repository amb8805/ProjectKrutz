package com.spotify.mobile.android.service.gcm;

import android.content.Context;
import com.spotify.mobile.android.orbit.OrbitPushNotificationsInterface;
import com.spotify.mobile.android.provider.v;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cr;

public final class a
  implements h
{
  private final Context a;
  private final OrbitPushNotificationsInterface b;
  private com.google.android.gms.a.a c;
  private cr d;
  private cr e;
  private g f;
  private Boolean g;
  private String h;

  public a(Context paramContext, OrbitPushNotificationsInterface paramOrbitPushNotificationsInterface)
  {
    this.a = paramContext;
    this.b = paramOrbitPushNotificationsInterface;
    if (a(paramContext, true))
    {
      this.c = com.google.android.gms.a.a.a(this.a);
      this.d = new cr(this.a, new b(this));
      this.e = new cr(this.a, new c(this));
    }
  }

  public static boolean a(Context paramContext, boolean paramBoolean)
  {
    int i = com.google.android.gms.common.e.a(paramContext);
    if (paramBoolean)
    {
      ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.aa);
      localClientEvent.a("availability", Integer.toString(i));
      com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
      com.spotify.mobile.android.ui.actions.a.a(paramContext, ViewUri.aL, localClientEvent);
    }
    if (i == 0)
      return true;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    bp.d("Google Play Services not available, push messages disabled: %d", arrayOfObject);
    return false;
  }

  private void c()
  {
    if (this.g == null)
      return;
    if ((this.g.booleanValue()) && (this.h != null));
    for (int i = 1; ; i = 0)
    {
      if ((i != 0) && (this.f == null))
      {
        this.f = new g(this.a, this, this.c, this.h);
        this.f.a();
      }
      if ((i != 0) || (this.f == null))
        break;
      new g.2(this.f).execute(new Void[0]);
      this.f.b();
      this.f = null;
      return;
    }
  }

  public final void a()
  {
    if (this.c != null)
    {
      this.d.a(com.spotify.mobile.android.provider.e.a, b.b(), null);
      this.e.a(v.a, c.b(), null);
    }
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b.setPreviousGcmRegistrationId(paramString);
      return;
    }
    this.b.registerGcmDevice(paramString);
  }

  public final void b()
  {
    if (this.c != null)
    {
      this.c.a();
      this.c = null;
    }
    if (this.d != null)
    {
      this.d.b();
      this.d = null;
    }
    if (this.e != null)
    {
      this.e.b();
      this.e = null;
    }
    if (this.f != null)
    {
      this.f.b();
      this.f = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.gcm.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
