package com.spotify.mobile.android.spotlets.artist.adapters;

import android.content.Context;
import android.text.Html;
import android.widget.ListAdapter;
import com.google.common.base.Optional;
import com.google.common.base.c;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release;
import com.spotify.mobile.android.spotlets.artist.view.b.f;
import com.spotify.mobile.android.ui.adapter.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ArtistPageAdapter extends q
{
  private h a;

  public ArtistPageAdapter(Context paramContext)
  {
    super(paramContext);
  }

  private void a(ListAdapter paramListAdapter, ArtistPageAdapter.Section paramSection)
  {
    a(paramListAdapter, ArtistPageAdapter.Section.a(paramSection), paramSection.ordinal());
  }

  private void a(ArtistPageAdapter.ReleasesSection paramReleasesSection, ArtistModel paramArtistModel, a parama)
  {
    if (!paramArtistModel.hasReleasesOfType(ArtistPageAdapter.ReleasesSection.a(paramReleasesSection)))
      return;
    a(parama.a(paramArtistModel.getReleases(ArtistPageAdapter.ReleasesSection.a(paramReleasesSection))), ArtistPageAdapter.ReleasesSection.b(paramReleasesSection));
  }

  public final void a(com.spotify.mobile.android.spotlets.artist.a.a parama)
  {
    if (this.a != null)
      this.a.a(parama);
  }

  public final void a(ArtistModel paramArtistModel)
  {
    a locala = new a(a());
    if (paramArtistModel.latestRelease.a())
    {
      ArtistModel.Release[] arrayOfRelease = new ArtistModel.Release[1];
      arrayOfRelease[0] = ((ArtistModel.Release)paramArtistModel.latestRelease.b());
      com.google.common.base.i.a(arrayOfRelease);
      com.google.common.base.i.a(true);
      ArrayList localArrayList = new ArrayList(com.google.common.a.a.a(6L));
      Collections.addAll(localArrayList, arrayOfRelease);
      a(new g(a(), localArrayList), ArtistPageAdapter.Section.a);
    }
    if (!paramArtistModel.topTracks.isEmpty())
    {
      this.a = locala.a(paramArtistModel.topTracks);
      a(this.a, ArtistPageAdapter.Section.b);
    }
    if (!paramArtistModel.relatedArtists.isEmpty())
    {
      Context localContext = a();
      List localList = paramArtistModel.relatedArtists;
      a(new i(localContext, c.a(", ").a(localList), new f()), ArtistPageAdapter.Section.c);
    }
    if (!paramArtistModel.upcomingConcerts.isEmpty())
      a(new b(a(), paramArtistModel.upcomingConcerts), ArtistPageAdapter.Section.d);
    a(ArtistPageAdapter.ReleasesSection.a, paramArtistModel, locala);
    a(ArtistPageAdapter.ReleasesSection.b, paramArtistModel, locala);
    a(ArtistPageAdapter.ReleasesSection.c, paramArtistModel, locala);
    a(ArtistPageAdapter.ReleasesSection.d, paramArtistModel, locala);
    if (paramArtistModel.biography.a())
    {
      String str = Html.fromHtml((String)paramArtistModel.biography.b()).toString();
      a(new i(a(), str, new com.spotify.mobile.android.spotlets.artist.view.b.a()), ArtistPageAdapter.Section.i);
    }
    for (ArtistPageAdapter.Section localSection : ArtistPageAdapter.Section.values())
      if (c(localSection.ordinal()))
        d(localSection.ordinal());
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.adapters.ArtistPageAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
