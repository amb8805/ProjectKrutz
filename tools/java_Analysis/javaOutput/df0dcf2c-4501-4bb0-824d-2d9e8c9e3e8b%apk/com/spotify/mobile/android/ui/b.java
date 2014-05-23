package com.spotify.mobile.android.ui;

import android.content.Context;
import com.spotify.mobile.android.util.ds;

final class b
{
  private final boolean a;
  private final boolean b;

  private b(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramBoolean1;
    this.b = paramBoolean2;
  }

  public final boolean a(Context paramContext)
  {
    return ((ds.b(paramContext)) && (this.a)) || ((ds.a(paramContext)) && (this.b));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
