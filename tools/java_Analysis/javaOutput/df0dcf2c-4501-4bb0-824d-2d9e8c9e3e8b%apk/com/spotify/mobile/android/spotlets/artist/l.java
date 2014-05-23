package com.spotify.mobile.android.spotlets.artist;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.artist.adapters.f;
import com.spotify.mobile.android.spotlets.artist.b.b;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.util.Releases;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.h;
import com.spotify.mobile.android.util.ad;
import com.spotify.mobile.android.util.ae;

public final class l extends a
  implements AdapterView.OnItemClickListener, ae
{
  private ListView b;
  private String c;
  private FilterHeaderView d;
  private f e;
  private q f;
  private com.spotify.mobile.android.spotlets.artist.view.a.a g;
  private h h = new l.1(this);

  public l()
  {
  }

  protected final View D()
  {
    View localView = LayoutInflater.from(i()).inflate(2130903186, null, false);
    this.b = ((ListView)localView.findViewById(16908298));
    this.b.setOnCreateContextMenuListener(this);
    i();
    this.d = FilterHeaderView.a(LayoutInflater.from(i()), "", Releases.a, Releases.b, this.h, this.b);
    this.d.setBackgroundColor(j().getColor(2131296272));
    this.d.a(2131689975);
    this.b.setOnCreateContextMenuListener(this);
    return localView;
  }

  protected final void E()
  {
    FilterHeaderView.a(this.d);
  }

  public final void G()
  {
    this.g.a();
  }

  public final String a(Context paramContext)
  {
    if (this.c == null)
      return paramContext.getString(2131689505);
    return this.c;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.c = g().getString("artist_name");
    this.g = new com.spotify.mobile.android.spotlets.artist.view.a.a(i(), b().f());
  }

  protected final void b(ArtistModel paramArtistModel)
  {
    com.spotify.mobile.android.spotlets.artist.b.g localg1 = (com.spotify.mobile.android.spotlets.artist.b.g)b();
    this.e = new com.spotify.mobile.android.spotlets.artist.adapters.a(i()).a(paramArtistModel.getReleases(localg1.b()));
    this.f = new q(i());
    q localq = this.f;
    f localf = this.e;
    com.spotify.mobile.android.spotlets.artist.b.g localg2 = (com.spotify.mobile.android.spotlets.artist.b.g)b();
    String str;
    switch (l.2.a[localg2.b().ordinal()])
    {
    default:
      str = i().getString(2131689510);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      localq.a(localf, str, 0);
      this.f.d(0);
      this.b.setAdapter(this.f);
      this.b.setOnItemClickListener(this);
      return;
      str = i().getString(2131689510);
      continue;
      str = i().getString(2131689513);
      continue;
      str = i().getString(2131689511);
      continue;
      str = i().getString(2131689512);
    }
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.g.a(paramContextMenu, ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView);
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    com.spotify.mobile.android.spotlets.artist.view.b.g localg = (com.spotify.mobile.android.spotlets.artist.view.b.g)paramView.getTag();
    Intent localIntent = MainActivity.a(i(), localg.a(), null, null);
    i().startActivity(localIntent);
  }

  public final void w()
  {
    super.w();
    ((ad)c.a(ad.class)).a(this);
    if (this.c != null)
      ((com.spotify.mobile.android.ui.activity.l)i()).a(this, this.c);
  }

  public final void x()
  {
    super.x();
    ((ad)c.a(ad.class)).a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
