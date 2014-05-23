package com.spotify.mobile.android.spotlets.artist.view.c;

import android.content.Context;
import com.spotify.mobile.android.util.ac;
import com.spotify.mobile.android.util.ds;

public class e
  implements com.spotify.mobile.android.c.a
{
  public e()
  {
  }

  public static a a(Context paramContext, com.spotify.mobile.android.spotlets.artist.b.a parama)
  {
    if (ds.b(paramContext))
    {
      if (com.spotify.android.paste.widget.f.a(paramContext))
        return new g(paramContext, parama);
      return new c(paramContext, parama);
    }
    if (com.spotify.android.paste.widget.f.a(paramContext))
    {
      if (ac.a)
        return new f(paramContext, parama);
      return new h(paramContext, parama);
    }
    return new d(paramContext, parama);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.c.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
