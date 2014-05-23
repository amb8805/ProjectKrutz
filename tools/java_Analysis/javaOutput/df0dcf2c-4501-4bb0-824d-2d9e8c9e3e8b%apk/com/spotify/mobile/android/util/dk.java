package com.spotify.mobile.android.util;

import android.content.Context;
import android.os.Environment;
import com.spotify.mobile.android.c.a;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.ui.page.DebugFlag;
import java.io.File;

public class dk
  implements a
{
  protected static final cy a = cy.a("android-cat-enabled");
  private final cw b;
  private final boolean c;

  public dk(Context paramContext)
  {
    this.b = cw.a(paramContext);
    if (("ta".equals("release")) && (new File(Environment.getExternalStorageDirectory(), "spotify.force.legacy").exists()))
    {
      this.c = false;
      return;
    }
    DebugFlag.a();
    this.c = this.b.a(a, true);
  }

  public final void a()
  {
    this.b.a().a(a, FeatureFragment.aw.a()).b();
  }

  public final boolean b()
  {
    return this.c;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
