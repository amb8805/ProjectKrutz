package com.spotify.mobile.android.util;

import android.content.Context;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;

public final class dg
{
  private static final cy a = cy.a("suggested_tracks_turned_on");

  public static void a(Context paramContext, boolean paramBoolean)
  {
    cw.a(paramContext).a().a(a, paramBoolean).a();
  }

  public static boolean a(Context paramContext)
  {
    if (FeatureFragment.h.a())
      return true;
    return cw.a(paramContext).a(a, true);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
