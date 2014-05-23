package com.spotify.mobile.android.util.a;

import android.annotation.TargetApi;
import android.view.View;
import com.spotify.mobile.android.util.ac;

public final class k
{
  @TargetApi(11)
  public static void a(View paramView)
  {
    if (ac.g)
    {
      m.a();
      paramView.setLayerType(1, null);
    }
  }

  public static void a(View paramView, int paramInt)
  {
    if (ac.g)
    {
      m.a();
      paramView.setLayerType(paramInt, null);
    }
  }

  @TargetApi(11)
  public static int b(View paramView)
  {
    if (ac.g)
    {
      m.a();
      return paramView.getLayerType();
    }
    return 1;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.a.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
