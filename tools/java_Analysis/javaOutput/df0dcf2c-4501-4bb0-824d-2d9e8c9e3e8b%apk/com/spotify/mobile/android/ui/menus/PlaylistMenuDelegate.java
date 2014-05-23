package com.spotify.mobile.android.ui.menus;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ContextMenu;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.model.j;
import com.spotify.mobile.android.provider.o;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.cc;

public final class PlaylistMenuDelegate
{
  private f a;
  private PlaylistMenuDelegate.CanDownload b;
  private PlaylistMenuDelegate.CanRemovePlaylist c;
  private Uri d;
  private d e = (d)c.a(d.class);

  public PlaylistMenuDelegate(Uri paramUri, PlaylistMenuDelegate.CanDownload paramCanDownload, PlaylistMenuDelegate.CanRemovePlaylist paramCanRemovePlaylist, f paramf)
  {
    this.d = paramUri;
    this.b = ((PlaylistMenuDelegate.CanDownload)cc.a(paramCanDownload));
    this.c = ((PlaylistMenuDelegate.CanRemovePlaylist)cc.a(paramCanRemovePlaylist));
    this.a = ((f)cc.a(paramf));
  }

  public PlaylistMenuDelegate(PlaylistMenuDelegate.CanDownload paramCanDownload, PlaylistMenuDelegate.CanRemovePlaylist paramCanRemovePlaylist, f paramf)
  {
    this(null, paramCanDownload, paramCanRemovePlaylist, paramf);
  }

  public final void a(ContextMenu paramContextMenu, j paramj)
  {
    Context localContext = this.a.a();
    paramContextMenu.clear();
    int i;
    int j;
    if ((paramj.s()) && (!TextUtils.isEmpty(paramj.s_())))
    {
      if ((!paramj.r_()) && (!paramj.k()))
        this.e.a(localContext, paramContextMenu, this.a.b(), this.a.c(), paramj.s_(), paramj.j());
      if (this.b != PlaylistMenuDelegate.CanDownload.a)
        break label621;
      i = 1;
      if ((i == 0) || (!paramj.o()))
        break label627;
      j = 1;
      label118: if (j != 0)
        this.e.a(localContext, paramContextMenu, this.a.b(), this.a.c(), o.a(paramj.s_()), new SpotifyLink(paramj.s_()).a(), paramj.f(), paramj.g());
      if (!paramj.k())
        this.e.a(localContext, paramContextMenu, this.a.b(), this.a.c(), paramj.a(localContext), "", paramj.s_());
      if ((paramj.p()) && (!paramj.n()) && ((!paramj.m()) || (paramj.r_())) && (!paramj.k()))
        this.e.f(localContext, paramContextMenu, this.a.b(), this.a.c(), paramj.s_());
      if ((paramj.r_()) && (!paramj.n()) && (!paramj.m()) && (!paramj.k()))
        this.e.b(localContext, paramContextMenu, this.a.b(), this.a.c(), paramj.s_(), paramj.q());
      if ((paramj.r_()) && (!paramj.n()) && (!paramj.m()) && (!paramj.k()))
        this.e.c(localContext, paramContextMenu, this.a.b(), this.a.c(), paramj.s_());
      if ((paramj.r_()) && (!paramj.n()) && (!paramj.q()) && (!paramj.k()))
        this.e.c(localContext, paramContextMenu, this.a.b(), this.a.c(), paramj.s_(), paramj.r());
      if (this.c != PlaylistMenuDelegate.CanRemovePlaylist.a)
        break label633;
    }
    label621: label627: label633: for (int k = 1; ; k = 0)
    {
      if ((k != 0) && (paramj.r_()) && (!paramj.n()) && (!paramj.m()) && (!paramj.k()))
      {
        Assertion.a(this.d, "Playlists or folders can be removed from this content, but no content uri specified. You need to call the PlaylistMenuDelegate(Uri contentUri) constructor.");
        this.e.a(localContext, paramContextMenu, this.a.b(), this.a.c(), paramj.a(localContext), this.d, paramj.h(), paramj.s_());
      }
      return;
      i = 0;
      break;
      j = 0;
      break label118;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.menus.PlaylistMenuDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
