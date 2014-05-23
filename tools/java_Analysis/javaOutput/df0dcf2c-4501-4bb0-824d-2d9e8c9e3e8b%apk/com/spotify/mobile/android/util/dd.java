package com.spotify.mobile.android.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.spotify.mobile.android.c.a;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.squareup.picasso.w;

public class dd
  implements a
{
  private final Picasso a;

  public dd(Context paramContext)
  {
    cc.b();
    w localw = new w(paramContext);
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    int i = localActivityManager.getMemoryClass();
    if ((ac.g) && ((0x100000 & paramContext.getApplicationInfo().flags) != 0));
    for (int j = localActivityManager.getLargeMemoryClass(); ; j = i)
    {
      this.a = localw.a(new s(j * 1048576 / 7 / 2)).a();
      return;
    }
  }

  public final Picasso a()
  {
    return this.a;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
