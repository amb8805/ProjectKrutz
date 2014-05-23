package com.spotify.mobile.android.ui.prettylist;

import android.app.Activity;
import android.view.View;
import com.spotify.android.paste.widget.g;
import com.spotify.mobile.android.ui.activity.MainActivity;

public final class e
{
  public static c a(Activity paramActivity)
  {
    return a(paramActivity, new d(paramActivity));
  }

  private static c a(Activity paramActivity, c paramc)
  {
    int i = g.a(paramActivity, 16842836);
    paramc.i().setBackgroundColor(i);
    paramc.a(i);
    if ((paramActivity instanceof MainActivity))
    {
      paramc.a(new e.1((MainActivity)paramActivity));
      return paramc;
    }
    paramc.a(a.a);
    return paramc;
  }

  public static c b(Activity paramActivity)
  {
    return a(paramActivity, new b(paramActivity));
  }

  public static c c(Activity paramActivity)
  {
    return a(paramActivity, new f(paramActivity));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.prettylist.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
