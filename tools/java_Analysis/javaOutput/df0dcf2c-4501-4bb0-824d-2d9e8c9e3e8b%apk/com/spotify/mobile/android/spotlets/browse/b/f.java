package com.spotify.mobile.android.spotlets.browse.b;

import android.content.Context;
import com.spotify.mobile.android.ui.fragments.t;
import com.spotify.mobile.android.util.ViewUri;

public final class f
{
  protected a a;

  public f(e parame)
  {
    this.a = new a(parame);
  }

  public final void a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    paramContext.startActivity(new t().a(paramString3).a(ViewUri.k).c(paramString2).a(paramContext));
    this.a.a(paramContext, paramInt, paramString2, paramString3, paramString1);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.b.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
