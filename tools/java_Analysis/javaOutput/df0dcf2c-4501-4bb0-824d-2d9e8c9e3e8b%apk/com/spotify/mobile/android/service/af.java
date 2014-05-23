package com.spotify.mobile.android.service;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.os.Handler;
import android.support.v4.app.aa;
import com.spotify.mobile.android.provider.n;
import com.spotify.mobile.android.service.a.a;
import com.spotify.mobile.android.service.a.c;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.util.bs;
import com.spotify.mobile.android.util.bt;
import com.spotify.mobile.android.util.bu;

public final class af
  implements bu
{
  ContentObserver a = new af.1(this, this.i);
  private Context b;
  private ContentResolver c;
  private a d;
  private bt e;
  private c f;
  private boolean g = false;
  private boolean h;
  private Handler i = new Handler();

  public af(Service paramService, bt parambt)
  {
    this.b = paramService;
    this.c = paramService.getContentResolver();
    this.d = new a(paramService);
    this.e = parambt;
    this.f = new c(paramService, this.d);
  }

  private void a(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, int paramInt3)
  {
    Resources localResources = this.b.getResources();
    a(localResources.getString(paramInt1), localResources.getString(paramInt2), paramPendingIntent, paramInt3);
  }

  private void a(String paramString1, String paramString2, PendingIntent paramPendingIntent, int paramInt)
  {
    aa localaa = new aa(this.b);
    localaa.a(paramPendingIntent);
    localaa.a(paramString1);
    localaa.c(paramString1);
    localaa.b(paramString2);
    localaa.a();
    localaa.d();
    ((NotificationManager)this.b.getSystemService("notification")).notify(paramInt, localaa.h());
  }

  private void h()
  {
    aa localaa = new aa(this.b);
    int j = this.e.c();
    int k = this.e.d();
    int m = this.e.e();
    Intent localIntent = new Intent(this.b, MainActivity.class);
    PendingIntent localPendingIntent = PendingIntent.getActivity(this.b, 0, localIntent, 0);
    Resources localResources = this.b.getResources();
    localaa.a(localPendingIntent);
    localaa.a(localResources.getString(2131690080));
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(j);
    arrayOfObject[1] = Integer.valueOf(k);
    arrayOfObject[2] = Integer.valueOf(m);
    localaa.b(localResources.getQuantityString(2131623950, k, arrayOfObject));
    localaa.c(localResources.getString(2131690080));
    localaa.a();
    localaa.b();
    localaa.c();
    this.d.a(2, localaa.h());
  }

  private void i()
  {
    this.d.a(2);
  }

  private void j()
  {
    if (this.g)
      this.f.a();
  }

  public final void a()
  {
    this.e.a(this);
    this.c.registerContentObserver(n.a, true, this.a);
  }

  public final void a(PendingIntent paramPendingIntent)
  {
    a(2131690082, 2131690081, paramPendingIntent, 3);
  }

  public final void b()
  {
    this.f.b();
    this.e.b(this);
    this.c.unregisterContentObserver(this.a);
    i();
  }

  public final void b(PendingIntent paramPendingIntent)
  {
    a(2131690079, 2131690078, paramPendingIntent, 4);
  }

  public final void c()
  {
    if (this.h)
      h();
  }

  public final void c(PendingIntent paramPendingIntent)
  {
    a(2131690077, 2131690076, paramPendingIntent, 5);
  }

  public final void d()
  {
    this.g = true;
    j();
  }

  public final void d(PendingIntent paramPendingIntent)
  {
    a(bs.c, bs.b, paramPendingIntent, 6);
  }

  public final void e()
  {
    this.g = false;
    this.f.b();
  }

  public final void f()
  {
    this.h = true;
    h();
  }

  public final void g()
  {
    this.h = false;
    i();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
