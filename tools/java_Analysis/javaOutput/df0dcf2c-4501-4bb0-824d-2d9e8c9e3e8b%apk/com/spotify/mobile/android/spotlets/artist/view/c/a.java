package com.spotify.mobile.android.spotlets.artist.view.c;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.spotlets.artist.adapters.ArtistPageAdapter;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.ui.actions.d;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.adapter.w;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.bp;
import java.util.List;

public abstract class a
  implements AdapterView.OnItemClickListener, com.spotify.mobile.android.spotlets.artist.a.c
{
  protected b a;
  private final Context b;
  private View c;
  private final com.spotify.mobile.android.spotlets.artist.b.a d;
  private ArtistModel e;
  private d f = (d)com.spotify.mobile.android.c.c.a(d.class);
  private com.spotify.mobile.android.ui.actions.a g = (com.spotify.mobile.android.ui.actions.a)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
  private ArtistPageAdapter h;
  private com.spotify.mobile.android.spotlets.artist.view.headers.a i;
  private com.spotify.mobile.android.spotlets.artist.a.a j;
  private boolean k = false;
  private ShufflePlayHeaderView l;
  private View m;
  private View.OnClickListener n = new a.1(this);

  protected a(Context paramContext, com.spotify.mobile.android.spotlets.artist.b.a parama)
  {
    this.b = paramContext;
    this.d = parama;
  }

  private void b(com.spotify.mobile.android.spotlets.artist.a.a parama)
  {
    if (this.j == null);
    while (this.h == null)
      return;
    this.h.a(parama);
  }

  public final int a()
  {
    if (this.k)
      return this.i.b();
    return 0;
  }

  public final int a(int paramInt1, int paramInt2)
  {
    if (!this.h.c(paramInt1))
      return -1;
    if (this.h.a(paramInt1));
    for (int i1 = 1; ; i1 = 0)
      return i1 + (paramInt2 + this.h.e(paramInt1));
  }

  public abstract com.spotify.mobile.android.spotlets.artist.view.headers.a a(ArtistModel paramArtistModel);

  public final void a(int paramInt)
  {
    if (this.k)
      this.i.a(paramInt);
  }

  public abstract void a(View.OnCreateContextMenuListener paramOnCreateContextMenuListener);

  public final void a(View paramView)
  {
    this.m = paramView;
  }

  public final void a(com.spotify.mobile.android.spotlets.artist.a.a parama)
  {
    this.j = parama;
    b(parama);
  }

  public final void a(b paramb)
  {
    this.a = paramb;
  }

  public void a(boolean paramBoolean)
  {
  }

  public void a(boolean paramBoolean, int paramInt)
  {
  }

  public abstract ListView b();

  public final void b(int paramInt)
  {
    View localView = this.h.getView(paramInt, null, b());
    long l1 = this.h.getItemId(paramInt);
    onItemClick(b(), localView, paramInt, l1);
  }

  protected final void b(View paramView)
  {
    this.c = paramView;
  }

  public final void b(ArtistModel paramArtistModel)
  {
    this.e = paramArtistModel;
    this.i = a(paramArtistModel);
    this.l = ShufflePlayHeaderView.a(this.b, b(), this.n);
    this.h = new ArtistPageAdapter(this.b);
    if ((f.a(this.b)) && (FeatureFragment.h.a()))
    {
      this.h.a(new w(this.l.c(), (byte)0), null, 99);
      this.l.a(paramArtistModel.topTracks.size());
      if (this.l.c().getVisibility() != 0)
        this.h.b(new int[] { 99 });
    }
    ArtistPageAdapter localArtistPageAdapter = this.h;
    localArtistPageAdapter.a(paramArtistModel);
    b().setAdapter(this.h);
    b().setOnItemClickListener(this);
    b(this.j);
    this.k = true;
  }

  public final View c()
  {
    return this.c;
  }

  protected final Context d()
  {
    return this.b;
  }

  protected final View e()
  {
    return this.c;
  }

  protected View f()
  {
    return this.l;
  }

  public final boolean g()
  {
    if (this.k)
      return h();
    return false;
  }

  protected abstract boolean h();

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    com.spotify.mobile.android.spotlets.artist.view.b.c localc = (com.spotify.mobile.android.spotlets.artist.view.b.c)paramView.getTag();
    if (localc == null)
    {
      bp.b("ListItemTag for view is null", new Object[0]);
      if (!(paramView instanceof SectionHeaderView))
        Assertion.b("onItemClick called with a null tag item for the view");
      return;
    }
    localc.a(new a.2(this, paramLong));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
