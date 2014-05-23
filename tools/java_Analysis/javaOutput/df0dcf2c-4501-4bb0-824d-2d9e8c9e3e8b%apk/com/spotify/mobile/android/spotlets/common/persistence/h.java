package com.spotify.mobile.android.spotlets.common.persistence;

import android.support.v4.app.Fragment;
import android.support.v4.app.l;
import com.spotify.mobile.android.util.cc;

public final class h
  implements g
{
  public h()
  {
  }

  public final <T extends Fragment,  extends d> void a(T paramT, String paramString1, String paramString2)
  {
    android.support.v4.app.g localg = paramT.l();
    cc.b();
    e locale = (e)localg.a("feature_persistence_fragment");
    if (locale == null)
    {
      locale = e.a(paramString1, paramString2);
      localg.a().a(locale, "feature_persistence_fragment").c();
      localg.b();
    }
    locale.a(new h.1(this, locale, paramT, paramString2));
    if (paramT.p())
      locale.C().a(paramT);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.persistence.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
