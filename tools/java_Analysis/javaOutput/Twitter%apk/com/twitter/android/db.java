package com.twitter.android;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.twitter.android.client.g;
import com.twitter.android.client.j;
import com.twitter.android.platform.C2DMService;
import com.twitter.android.platform.TwitterDataSyncService;
import com.twitter.android.platform.d;

final class db extends e
{
  public db(TimelineFragment paramTimelineFragment, Context paramContext)
  {
    super(paramTimelineFragment, paramContext);
  }

  public final void a(j paramj, String paramString1, int paramInt1, String paramString2, long paramLong, int paramInt2)
  {
    dp localdp = this.b.c(paramString1);
    if (localdp != null)
    {
      this.b.c(localdp.b);
      if (paramInt1 != 401)
        break label48;
      Toast.makeText(this.a, 2131427388, 1).show();
    }
    label48: 
    while (paramInt1 == 200)
      return;
    Toast.makeText(this.a, 2131427387, 1).show();
  }

  public final void a(j paramj, String paramString1, int paramInt1, String paramString2, long paramLong1, long paramLong2, int paramInt2, int paramInt3)
  {
    dp localdp = this.b.c(paramString1);
    if (localdp != null)
    {
      this.b.c(localdp.b);
      if (paramInt1 != 200)
        Toast.makeText(this.a, 2131427387, 1).show();
    }
    else
    {
      return;
    }
    switch (localdp.b)
    {
    case 3:
    default:
      return;
    case 2:
    case 4:
    }
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("home", false);
    if (!C2DMService.a);
    for (boolean bool = true; ; bool = false)
    {
      localBundle.putBoolean("show_notif", bool);
      TwitterDataSyncService.a(this.a, localBundle, true, d.a(this.a, this.b.j.d()));
      return;
    }
  }

  public final void b(j paramj, String paramString1, int paramInt1, String paramString2, long paramLong1, long paramLong2, int paramInt2, int paramInt3)
  {
    dp localdp = this.b.c(paramString1);
    if (localdp != null)
    {
      this.b.c(localdp.b);
      if (paramInt1 != 200)
        Toast.makeText(this.a, 2131427387, 1).show();
    }
    else
    {
      return;
    }
    switch (localdp.b)
    {
    case 3:
    default:
      return;
    case 2:
    case 4:
    }
    Bundle localBundle = new Bundle();
    if (!C2DMService.a);
    for (boolean bool = true; ; bool = false)
    {
      localBundle.putBoolean("show_notif", bool);
      TwitterDataSyncService.a(this.a, localBundle, true, d.a(this.a, this.b.j.d()));
      return;
    }
  }

  public final void e(j paramj, String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    dp localdp = this.b.c(paramString1);
    if (localdp != null)
    {
      this.b.c(localdp.b);
      if (paramInt1 != 200)
        Toast.makeText(this.a, 2131427387, 1).show();
    }
  }

  public final void i(j paramj, String paramString1, int paramInt, String paramString2, long paramLong)
  {
    dp localdp = this.b.c(paramString1);
    if (localdp != null)
    {
      this.b.c(localdp.b);
      if (paramInt != 200)
        Toast.makeText(this.a, 2131427387, 1).show();
    }
  }

  public final void j(j paramj, String paramString1, int paramInt, String paramString2, long paramLong)
  {
    dp localdp = this.b.c(paramString1);
    if (localdp != null)
    {
      this.b.c(localdp.b);
      if (paramInt != 200)
        Toast.makeText(this.a, 2131427387, 1).show();
    }
  }

  public final void k(j paramj, String paramString1, int paramInt, String paramString2)
  {
    dp localdp = this.b.c(paramString1);
    if (localdp != null)
    {
      this.b.c(localdp.b);
      if (paramInt != 200)
        Toast.makeText(this.a, 2131427387, 1).show();
    }
  }

  public final void l(j paramj, String paramString1, int paramInt, String paramString2)
  {
    dp localdp = this.b.c(paramString1);
    if (localdp != null)
    {
      this.b.c(localdp.b);
      if (paramInt != 200)
        Toast.makeText(this.a, 2131427387, 1).show();
    }
  }

  public final void m(j paramj, String paramString1, int paramInt, String paramString2)
  {
    dp localdp = this.b.c(paramString1);
    if (localdp != null)
    {
      this.b.c(localdp.b);
      if (paramInt != 200)
        Toast.makeText(this.a, 2131427387, 1).show();
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.db
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
