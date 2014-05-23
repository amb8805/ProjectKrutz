package com.spotify.mobile.android.spotlets.browse.b;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.util.ViewUri;

public final class b
{
  protected a a;

  public b(e parame)
  {
    this.a = new a(parame);
  }

  public final void a(Context paramContext, String paramString)
  {
    Intent localIntent = MainActivity.a(paramContext, "spotify:internal:discover", paramString);
    localIntent.putExtra("referer", ViewUri.g);
    paramContext.startActivity(localIntent);
    this.a.a(paramContext, -1, paramString, "spotify:internal:discover", null);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
