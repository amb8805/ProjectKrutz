package com.spotify.mobile.android.ui.menus;

import android.content.Context;
import android.view.ContextMenu;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.model.m;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.cc;

public final class TrackMenuDelegate
{
  private g a;
  private TrackMenuDelegate.CanBrowseAlbum b;
  private TrackMenuDelegate.CanBrowseArtist c;
  private TrackMenuDelegate.CanRemoveFromCollection d;
  private TrackMenuDelegate.CanRemoveTrack e;
  private d f = (d)c.a(d.class);

  public TrackMenuDelegate(TrackMenuDelegate.CanBrowseAlbum paramCanBrowseAlbum, TrackMenuDelegate.CanBrowseArtist paramCanBrowseArtist, TrackMenuDelegate.CanRemoveFromCollection paramCanRemoveFromCollection, TrackMenuDelegate.CanRemoveTrack paramCanRemoveTrack, g paramg)
  {
    this.b = ((TrackMenuDelegate.CanBrowseAlbum)cc.a(paramCanBrowseAlbum));
    this.c = ((TrackMenuDelegate.CanBrowseArtist)cc.a(paramCanBrowseArtist));
    this.d = ((TrackMenuDelegate.CanRemoveFromCollection)cc.a(paramCanRemoveFromCollection));
    this.e = ((TrackMenuDelegate.CanRemoveTrack)cc.a(paramCanRemoveTrack));
    this.a = ((g)cc.a(paramg));
  }

  public final g a()
  {
    return this.a;
  }

  public final void a(ContextMenu paramContextMenu, m paramm)
  {
    boolean bool1 = true;
    Context localContext = this.a.a();
    paramContextMenu.clear();
    if ((FeatureFragment.h.a()) && (FeatureFragment.ai.a()))
    {
      this.a.b();
      this.a.c();
      paramm.h();
      d.a(localContext, paramContextMenu);
      this.f.a(localContext, paramContextMenu, this.a.b(), this.a.c(), paramm.h());
    }
    if (paramm.e())
      this.f.a(localContext, paramContextMenu, this.a.b(), this.a.c(), paramm.f());
    d locald1 = this.f;
    ViewUri.Verified localVerified1 = this.a.b();
    ViewUri.SubView localSubView1 = this.a.c();
    boolean bool2 = paramm.g();
    if (this.d == TrackMenuDelegate.CanRemoveFromCollection.c)
      throw new UnsupportedOperationException();
    boolean bool3;
    boolean bool4;
    label349: boolean bool5;
    label366: boolean bool6;
    label420: boolean bool7;
    if (this.d == TrackMenuDelegate.CanRemoveFromCollection.a)
    {
      bool3 = bool1;
      locald1.a(localContext, paramContextMenu, localVerified1, localSubView1, bool2, bool3, paramm.h());
      this.f.e(localContext, paramContextMenu, this.a.b(), this.a.c(), paramm.h());
      if (paramm.j())
        this.f.f(localContext, paramContextMenu, this.a.b(), this.a.c(), paramm.h());
      if (paramm.k())
        this.f.d(localContext, paramContextMenu, this.a.b(), this.a.c(), paramm.h());
      if (this.c != TrackMenuDelegate.CanBrowseArtist.a)
        break label630;
      bool4 = bool1;
      if ((!bool4) || (!paramm.s()))
        break label636;
      bool5 = bool1;
      if (bool5)
        this.f.b(localContext, paramContextMenu, this.a.b(), this.a.c(), paramm.l(), paramm.m());
      if (this.b != TrackMenuDelegate.CanBrowseAlbum.a)
        break label642;
      bool6 = bool1;
      if ((!bool6) || (!paramm.d()))
        break label648;
      bool7 = bool1;
      label437: if (bool7)
        this.f.a(localContext, paramContextMenu, this.a.b(), this.a.c(), paramm.n(), paramm.o());
      d locald2 = this.f;
      ViewUri.Verified localVerified2 = this.a.b();
      ViewUri.SubView localSubView2 = this.a.c();
      String str = paramm.p();
      Object[] arrayOfObject = new Object[bool1];
      arrayOfObject[0] = paramm.m();
      locald2.a(localContext, paramContextMenu, localVerified2, localSubView2, str, localContext.getString(2131690251, arrayOfObject), paramm.h());
      if (this.e != TrackMenuDelegate.CanRemoveTrack.c)
        break label654;
      bool1 = this.a.e();
    }
    while (true)
    {
      if ((bool1) && (!paramm.q()))
        this.f.a(localContext, paramContextMenu, this.a.b(), this.a.c(), this.a.d(), paramm.f());
      return;
      bool3 = false;
      break;
      label630: bool4 = false;
      break label349;
      label636: bool5 = false;
      break label366;
      label642: bool6 = false;
      break label420;
      label648: bool7 = false;
      break label437;
      label654: if (this.e != TrackMenuDelegate.CanRemoveTrack.a)
        bool1 = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.menus.TrackMenuDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
