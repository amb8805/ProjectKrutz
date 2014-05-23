package com.spotify.mobile.android.spotlets.browse.b;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.artist.j;
import com.spotify.mobile.android.util.ViewUri;

public final class g
{
  protected a a;

  public g(e parame)
  {
    this.a = new a(parame);
  }

  public final void a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = j.a(paramContext, paramString3, paramString2);
    localIntent.putExtra("referer", ViewUri.k);
    paramContext.startActivity(localIntent);
    this.a.a(paramContext, paramInt, paramString2, paramString3, paramString1);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.b.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
