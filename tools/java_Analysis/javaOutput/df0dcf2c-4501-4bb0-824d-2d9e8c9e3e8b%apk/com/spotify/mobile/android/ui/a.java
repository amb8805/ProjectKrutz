package com.spotify.mobile.android.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.google.common.collect.ak;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.spotlets.artist.h;
import com.spotify.mobile.android.spotlets.artist.i;
import com.spotify.mobile.android.spotlets.browse.d;
import com.spotify.mobile.android.ui.fragments.PlaylistFragment;
import java.util.Map;

public final class a
{
  private static Map<Class<? extends Fragment>, b> a = ak.a();

  static
  {
    c.a(PlaylistFragment.class).a().b();
    c.a(d.class).a().b();
    c.a(i.class).a().b();
    c.a(com.spotify.mobile.android.spotlets.collection.fragments.a.class).a().b();
    c.a(com.spotify.mobile.android.spotlets.collection.fragments.c.class).a().b();
    c.a(com.spotify.mobile.android.spotlets.user.c.class).a().b();
    c.a(com.spotify.mobile.android.spotlets.b.a.class).a().b();
    c.a(h.class).a().b();
    c.a(com.spotify.mobile.android.spotlets.socialchart.b.class).a().b();
  }

  public a()
  {
  }

  public static boolean a(Context paramContext, Class<? extends Fragment> paramClass)
  {
    if ((paramContext == null) || (paramClass == null));
    while ((f.a(paramContext)) || (!a.containsKey(paramClass)))
      return false;
    return ((b)a.get(paramClass)).a(paramContext);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
