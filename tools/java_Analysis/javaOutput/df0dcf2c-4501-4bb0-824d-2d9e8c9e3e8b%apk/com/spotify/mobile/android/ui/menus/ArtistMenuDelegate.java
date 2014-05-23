package com.spotify.mobile.android.ui.menus;

import android.content.Context;
import android.view.ContextMenu;
import com.spotify.mobile.android.model.b;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.cc;

public final class ArtistMenuDelegate
{
  private c a;
  private ArtistMenuDelegate.CanDownload b;
  private d c = (d)com.spotify.mobile.android.c.c.a(d.class);

  public ArtistMenuDelegate(ArtistMenuDelegate.CanDownload paramCanDownload, c paramc)
  {
    this.b = ((ArtistMenuDelegate.CanDownload)cc.a(paramCanDownload));
    this.a = ((c)cc.a(paramc));
  }

  public final void a(ContextMenu paramContextMenu, b paramb)
  {
    Context localContext = this.a.a();
    paramContextMenu.clear();
    if (this.b == ArtistMenuDelegate.CanDownload.a);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        this.c.a(localContext, paramContextMenu, this.a.b(), this.a.c(), com.spotify.mobile.android.provider.c.a(paramb.d()), new SpotifyLink(paramb.d()).a(), paramb.a(), paramb.c());
      if (paramb.e())
        this.c.f(localContext, paramContextMenu, this.a.b(), this.a.c(), paramb.s_());
      this.c.a(localContext, paramContextMenu, this.a.b(), this.a.c(), paramb.t_(), "", paramb.s_());
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.menus.ArtistMenuDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
