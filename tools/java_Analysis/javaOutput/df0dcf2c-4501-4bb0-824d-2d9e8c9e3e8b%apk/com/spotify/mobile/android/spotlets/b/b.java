package com.spotify.mobile.android.spotlets.b;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.model.m;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.adapter.AlbumsAdapter;
import com.spotify.mobile.android.ui.adapter.AlbumsAdapter.Options;
import com.spotify.mobile.android.ui.adapter.aa;
import com.spotify.mobile.android.ui.adapter.ab;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.adapter.r;
import com.spotify.mobile.android.ui.adapter.t;
import com.spotify.mobile.android.ui.adapter.w;
import com.spotify.mobile.android.ui.adapter.z;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.menus.AlbumMenuDelegate;
import com.spotify.mobile.android.ui.menus.AlbumMenuDelegate.CanBrowseArtist;
import com.spotify.mobile.android.ui.menus.AlbumMenuDelegate.CanDownload;
import com.spotify.mobile.android.ui.menus.AlbumMenuDelegate.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseAlbum;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseArtist;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveTrack;
import com.spotify.mobile.android.ui.page.i;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.Collection.State;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.dg;
import com.spotify.mobile.android.util.dm;
import com.spotify.mobile.android.util.do;
import com.spotify.mobile.android.util.dp;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.dx;

public class b extends i
{
  private static final String b = b.class.getSimpleName();
  private static final AlbumsAdapter.Options u = new b.3();
  private static final ab v = new b.4();
  private dp A = new b.9(this);
  private d c;
  private TextView d;
  private n e;
  private do f;
  private q g;
  private aa h;
  private z i;
  private AlbumsAdapter j;
  private String k;
  private String l;
  private String m;
  private boolean n;
  private ViewUri.Verified o;
  private dt p;
  private com.spotify.mobile.android.ui.actions.a q = (com.spotify.mobile.android.ui.actions.a)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
  private com.spotify.mobile.android.ui.actions.d r = (com.spotify.mobile.android.ui.actions.d)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.d.class);
  private TrackMenuDelegate s = new TrackMenuDelegate(TrackMenuDelegate.CanBrowseAlbum.b, TrackMenuDelegate.CanBrowseArtist.a, TrackMenuDelegate.CanRemoveFromCollection.a, TrackMenuDelegate.CanRemoveTrack.b, new b.1(this));
  private AlbumMenuDelegate t = new AlbumMenuDelegate(AlbumMenuDelegate.CanBrowseArtist.a, AlbumMenuDelegate.CanRemoveFromCollection.a, AlbumMenuDelegate.CanDownload.b, new b.2(this));
  private r w = new b.5(this);
  private o<Cursor> x = new b.6(this);
  private o<Cursor> y = new b.7(this);
  private o<Cursor> z = new b.8(this);

  public b(Context paramContext, ViewGroup paramViewGroup, n paramn, String paramString, ViewUri.Verified paramVerified)
  {
    super(paramContext, paramViewGroup);
    this.k = paramString;
    this.o = paramVerified;
    this.p = dv.a(paramContext, ViewUri.E.a(this.k));
    this.e = paramn;
    this.f = new do(paramContext, this.e, 2131362087, this.A);
    this.d = ((TextView)f().inflate(2130903089, c(), false));
    this.h = new aa(paramContext, v);
    this.j = new AlbumsAdapter(paramContext, u);
    this.g = new q(d());
    this.g.a(this.h, null, 1);
    if ((FeatureFragment.an.a()) && (FeatureFragment.h.a()))
    {
      boolean bool = dg.a(paramContext);
      this.i = new z(paramContext, this.s);
      this.g.a(this.i, new t(this.w, bool));
      if (bool)
        paramn.a(2131362144, null, this.x);
    }
    this.g.a(this.j, null, 3);
    this.g.a(new w(this.d, (byte)0), null, 4);
    a(this.g);
    paramn.a(2131362088, null, this.y);
  }

  public final void a()
  {
    super.a();
    this.p.a();
  }

  protected final void a(Context paramContext, ViewGroup paramViewGroup)
  {
    this.c = new d(paramContext, new c(this));
  }

  public final void a(View paramView, int paramInt, long paramLong)
  {
    int i1 = paramInt - c().getHeaderViewsCount();
    Uri localUri = com.spotify.mobile.android.provider.a.b(this.k);
    ViewUri.Verified localVerified = ViewUri.E.a(this.k);
    switch (this.g.b(i1))
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    Object localObject;
    do
    {
      return;
      if (FeatureFragment.h.a())
      {
        this.c.a();
        com.spotify.mobile.android.ui.actions.a.a(d(), localVerified, ViewUri.SubView.a, ClientEvent.b(localUri, paramLong));
        return;
      }
      com.spotify.mobile.android.ui.actions.d.a(d(), localVerified, ViewUri.SubView.a, this.o, localUri, paramLong, false);
      com.spotify.mobile.android.ui.actions.a.a(d(), localVerified, ViewUri.SubView.a, ClientEvent.a(localUri, paramLong));
      return;
      this.c.a();
      com.spotify.mobile.android.ui.actions.a.a(d(), localVerified, ViewUri.SubView.a, ClientEvent.b(localUri, paramLong));
      return;
      localObject = paramView.getTag();
    }
    while (!(localObject instanceof com.spotify.mobile.android.model.a));
    com.spotify.mobile.android.model.a locala = (com.spotify.mobile.android.model.a)localObject;
    if (locala.m())
    {
      d().startActivity(MainActivity.a(d(), locala.s_(), locala.t_()));
      return;
    }
    dm.b(d());
  }

  public final void a(Collection.State paramState)
  {
    this.c.a(paramState);
  }

  public final void a(String paramString)
  {
    this.g.a(d().getString(2131689501, new Object[] { paramString }));
    this.c.a(paramString);
  }

  public final void a(String paramString1, String paramString2)
  {
    this.c.a(paramString1, paramString2);
  }

  public final void a(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }

  public final void b()
  {
    super.b();
    this.p.b();
  }

  public final void b(String paramString)
  {
    this.l = paramString;
    this.c.b(paramString);
    this.e.a(2131362085, null, this.z);
  }

  public final void b(boolean paramBoolean)
  {
    this.c.a(paramBoolean);
  }

  public final void c(String paramString)
  {
    this.c.c(paramString);
  }

  public final void d(String paramString)
  {
    this.c.d(paramString);
  }

  public final void e(String paramString)
  {
    this.c.e(paramString);
  }

  public final void f(String paramString)
  {
    this.d.setText(paramString);
  }

  public final void g(String paramString)
  {
    this.m = paramString;
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    View localView = ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView;
    if (!(localView instanceof ListItemView));
    Object localObject;
    do
    {
      return;
      localObject = localView.getTag();
      if ((localObject instanceof com.spotify.mobile.android.model.a))
        this.t.a(paramContextMenu, (com.spotify.mobile.android.model.a)localObject);
    }
    while (!(localObject instanceof m));
    this.s.a(paramContextMenu, (m)localObject);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
