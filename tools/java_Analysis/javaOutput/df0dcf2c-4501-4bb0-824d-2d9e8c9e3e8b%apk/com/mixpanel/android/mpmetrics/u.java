package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class u
  implements Callable<SharedPreferences>
{
  private final Context a;
  private final String b;
  private final v c;

  public u(Context paramContext, String paramString, v paramv)
  {
    this.a = paramContext;
    this.b = paramString;
    this.c = paramv;
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
