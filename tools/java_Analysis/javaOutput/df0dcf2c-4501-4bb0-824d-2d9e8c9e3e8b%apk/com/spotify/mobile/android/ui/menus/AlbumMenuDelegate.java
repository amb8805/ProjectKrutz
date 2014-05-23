package com.spotify.mobile.android.ui.menus;

import android.content.Context;
import android.view.ContextMenu;
import com.spotify.mobile.android.model.a;
import com.spotify.mobile.android.provider.Metadata.OfflineSync;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.Collection.State;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.i;

public final class AlbumMenuDelegate
{
  private AlbumMenuDelegate.CanBrowseArtist a;
  private AlbumMenuDelegate.CanRemoveFromCollection b;
  private AlbumMenuDelegate.CanDownload c;
  private b d;
  private d e = (d)com.spotify.mobile.android.c.c.a(d.class);

  public AlbumMenuDelegate(AlbumMenuDelegate.CanBrowseArtist paramCanBrowseArtist, AlbumMenuDelegate.CanRemoveFromCollection paramCanRemoveFromCollection, AlbumMenuDelegate.CanDownload paramCanDownload, b paramb)
  {
    this.a = ((AlbumMenuDelegate.CanBrowseArtist)cc.a(paramCanBrowseArtist));
    this.b = ((AlbumMenuDelegate.CanRemoveFromCollection)cc.a(paramCanRemoveFromCollection));
    this.c = ((AlbumMenuDelegate.CanDownload)cc.a(paramCanDownload));
    this.d = ((b)cc.a(paramb));
  }

  public final void a(ContextMenu paramContextMenu, a parama)
  {
    Context localContext = this.d.b();
    Assertion.a(localContext);
    paramContextMenu.clear();
    d locald1 = this.e;
    ViewUri.Verified localVerified1 = this.d.a();
    ViewUri.SubView localSubView1 = this.d.c();
    Collection.State localState = parama.a();
    boolean bool;
    int i;
    if (this.b == AlbumMenuDelegate.CanRemoveFromCollection.a)
    {
      bool = true;
      locald1.a(localContext, paramContextMenu, localVerified1, localSubView1, localState, bool, parama.s_());
      if (this.c != AlbumMenuDelegate.CanDownload.a)
        break label444;
      i = 1;
      label97: if ((i != 0) && ((Metadata.OfflineSync.a(parama.c())) || (parama.d())))
        this.e.a(localContext, paramContextMenu, this.d.a(), this.d.c(), com.spotify.mobile.android.provider.c.c(parama.e()), new SpotifyLink(parama.e()).a(), parama.c(), parama.f());
      if (this.a != AlbumMenuDelegate.CanBrowseArtist.a)
        break label450;
    }
    label444: label450: for (int j = 1; ; j = 0)
    {
      if ((j != 0) && (!i.a(parama.g())) && (parama.h()))
        this.e.b(localContext, paramContextMenu, this.d.a(), this.d.c(), parama.i(), parama.g());
      this.e.b(localContext, paramContextMenu, this.d.a(), this.d.c(), parama.s_());
      if (parama.j())
        this.e.f(localContext, paramContextMenu, this.d.a(), this.d.c(), parama.s_());
      if (parama.k())
        this.e.d(localContext, paramContextMenu, this.d.a(), this.d.c(), parama.s_());
      d locald2 = this.e;
      ViewUri.Verified localVerified2 = this.d.a();
      ViewUri.SubView localSubView2 = this.d.c();
      String str = parama.t_();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = parama.g();
      locald2.a(localContext, paramContextMenu, localVerified2, localSubView2, str, localContext.getString(2131690252, arrayOfObject), parama.s_());
      return;
      bool = false;
      break;
      i = 0;
      break label97;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.menus.AlbumMenuDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
