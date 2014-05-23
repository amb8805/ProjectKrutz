package com.spotify.mobile.android.spotlets.browse.b;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.browse.d;
import com.spotify.mobile.android.ui.activity.MainActivity;

public final class c
{
  protected a a;
  private final boolean b;

  public c(e parame, boolean paramBoolean)
  {
    this.a = new a(parame);
    this.b = paramBoolean;
  }

  public final void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    String str1;
    Intent localIntent;
    a locala;
    if ("new_releases".equals(paramString1))
    {
      str1 = "spotify:app:browse:new_releases";
      localIntent = MainActivity.a(paramContext, str1, paramString2);
      paramContext.startActivity(localIntent);
      locala = this.a;
      if (!this.b)
        break label122;
    }
    label122: for (String str2 = "root"; ; str2 = "overview")
    {
      locala.a(paramContext, -1, paramString2, str1, str2);
      return;
      str1 = d.a(paramString1);
      localIntent = MainActivity.a(paramContext, str1, paramString2 + " — " + paramContext.getString(2131689520));
      localIntent.putExtra("genre", paramString1);
      localIntent.putExtra("eternalScroll", paramBoolean);
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
