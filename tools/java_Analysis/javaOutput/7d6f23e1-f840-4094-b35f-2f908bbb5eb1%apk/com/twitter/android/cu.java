package com.twitter.android;

import android.app.LocalActivityManager;
import com.twitter.android.client.g;
import com.twitter.android.client.i;
import com.twitter.android.client.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

final class cu extends i
{
  private cu(HomeTabActivity paramHomeTabActivity)
  {
  }

  public final void a(j paramj)
  {
    long l = this.a.b.j();
    LocalActivityManager localLocalActivityManager = this.a.getLocalActivityManager();
    Iterator localIterator = HomeTabActivity.a.keySet().iterator();
    while (localIterator.hasNext())
    {
      HomeActivity localHomeActivity = (HomeActivity)localLocalActivityManager.getActivity((String)localIterator.next());
      if (localHomeActivity != null)
        localHomeActivity.a(l);
    }
    this.a.c = paramj.e();
    this.a.b();
    this.a.a("home", 0);
  }

  public final void a(j paramj, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
      this.a.e = false;
      this.a.a(0, false);
      return;
    case 5:
    }
    this.a.f = false;
    this.a.a(1, false);
  }

  public final void a(j paramj, String paramString1, int paramInt1, String paramString2, int paramInt2, long paramLong1, long paramLong2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramLong2 == 0L) && (paramInt3 > 0))
      this.a.a(1, true);
  }

  public final void a(j paramj, String paramString1, int paramInt1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    HomeTabActivity localHomeTabActivity = this.a;
    if ((paramInt2 > 0) && (paramBoolean));
    for (boolean bool = true; ; bool = false)
    {
      localHomeTabActivity.d = bool;
      if (paramInt2 >= 3)
        this.a.a(2, true);
      return;
    }
  }

  public final void a(j paramj, String paramString1, int paramInt1, String paramString2, long paramLong1, long paramLong2, int paramInt2, int paramInt3)
  {
    if ((paramLong2 == 0L) && (paramInt2 > 0))
      this.a.a(0, true);
  }

  public final void b(j paramj)
  {
    this.a.a(3, false);
  }

  public final void b(j paramj, String paramString1, int paramInt1, String paramString2, long paramLong1, long paramLong2, int paramInt2, int paramInt3)
  {
    if ((paramLong2 == 0L) && (paramInt2 > 0))
      this.a.a(1, true);
  }

  public final void j(j paramj, String paramString1, int paramInt, String paramString2)
  {
    if ((paramInt == 200) && (paramj.equals(this.a.b.f())))
      this.a.a(0, true);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.cu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
