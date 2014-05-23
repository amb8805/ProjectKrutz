package com.spotify.mobile.android.spotlets.browse.b;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.util.ViewUri;

public final class d
{
  protected a a;

  public d(e parame)
  {
    this.a = new a(parame);
  }

  public final void a(Context paramContext, String paramString)
  {
    Intent localIntent = MainActivity.a(paramContext, "spotify:app:browse", paramString);
    localIntent.putExtra("referer", ViewUri.k);
    paramContext.startActivity(localIntent);
    this.a.a(paramContext, -1, paramString, "spotify:app:browse", null);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
