package com.spotify.mobile.android.spotlets.artist;

import android.view.View;
import android.widget.TextView;
import com.spotify.mobile.android.ui.b.a;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.Locale;

final class d
  implements g
{
  private d(c paramc)
  {
  }

  public final int a()
  {
    return 2130903196;
  }

  public final void a(String paramString)
  {
    c.b(this.a).setText(paramString.toUpperCase(Locale.getDefault()));
  }

  public final View b()
  {
    return c.a(this.a);
  }

  public final void b(String paramString)
  {
    ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a().a(paramString).a(a.a()).a(c.c(this.a));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
