package com.spotify.mobile.android.util.a;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;

public class a
{
  protected a()
  {
  }

  public static a a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 14)
      return new c(paramContext);
    return new a();
  }

  public void a(b paramb, Activity paramActivity)
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
