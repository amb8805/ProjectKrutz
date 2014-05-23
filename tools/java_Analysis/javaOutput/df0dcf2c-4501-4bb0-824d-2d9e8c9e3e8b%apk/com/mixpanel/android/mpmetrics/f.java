package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.graphics.Color;

final class f
{
  private static final int a = Color.argb(186, 28, 28, 28);

  public static void a(Activity paramActivity, h paramh)
  {
    paramActivity.runOnUiThread(new f.1(paramActivity, paramh));
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
