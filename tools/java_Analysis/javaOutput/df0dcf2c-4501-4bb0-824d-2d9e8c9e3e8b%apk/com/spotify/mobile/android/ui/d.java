package com.spotify.mobile.android.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.spotlets.artist.j;
import com.spotify.mobile.android.spotlets.collection.fragments.CollectionFragment;
import com.spotify.mobile.android.spotlets.user.ProfilesListFragment;
import com.spotify.mobile.android.spotlets.user.ProfilesListFragment.Type;
import com.spotify.mobile.android.ui.fragments.CosmosTestFragment;
import com.spotify.mobile.android.ui.fragments.PlaylistFragment;
import com.spotify.mobile.android.ui.fragments.PushNotificationSettingsFragment;
import com.spotify.mobile.android.ui.fragments.f;
import com.spotify.mobile.android.ui.fragments.g;;
import com.spotify.mobile.android.ui.fragments.h;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.t;
import com.spotify.mobile.android.ui.fragments.v;
import com.spotify.mobile.android.ui.fragments.z;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;
import com.spotify.mobile.android.util.cc;

public final class d
{
  public static final com.spotify.mobile.android.ui.fragments.g a = new e();

  public d()
  {
  }

  public static com.spotify.mobile.android.ui.fragments.g a(SpotifyLink paramSpotifyLink, Intent paramIntent, String paramString1, String paramString2)
  {
    Object localObject;
    switch (d.1.a[paramSpotifyLink.a().ordinal()])
    {
    default:
      localObject = null;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                return localObject;
                localObject = com.spotify.mobile.android.spotlets.b.a.a(paramSpotifyLink.j(), paramString1, paramSpotifyLink.i(), paramSpotifyLink.h());
              }
              while (!com.spotify.mobile.android.spotlets.b.a.b(paramIntent));
              a((com.spotify.mobile.android.ui.fragments.g)localObject, paramIntent);
              return localObject;
              localObject = j.a(paramSpotifyLink.j(), paramSpotifyLink.i(), paramSpotifyLink.h());
              cc.a(paramIntent);
            }
            while (!paramIntent.hasExtra("artist_uri"));
            a((com.spotify.mobile.android.ui.fragments.g)localObject, paramIntent);
            return localObject;
            return j.b(paramSpotifyLink.d(), paramIntent.getExtras());
            return j.c(paramSpotifyLink.d(), paramIntent.getExtras());
            return j.a(paramSpotifyLink.d(), paramIntent.getExtras());
            return j.d(paramSpotifyLink.d(), paramIntent.getExtras());
            return j.e(paramSpotifyLink.d(), paramIntent.getExtras());
            localObject = new t().a(paramSpotifyLink.d()).b("time_added").c(paramString1).b();
          }
          while (!PlaylistFragment.b(paramIntent));
          a((com.spotify.mobile.android.ui.fragments.g)localObject, paramIntent);
          return localObject;
          localObject = com.spotify.mobile.android.ui.fragments.e.a(paramSpotifyLink.d(), paramString1, false);
        }
        while (!com.spotify.mobile.android.ui.fragments.e.b(paramIntent));
        a((com.spotify.mobile.android.ui.fragments.g)localObject, paramIntent);
        return localObject;
        return f.a(paramSpotifyLink.d(), paramString1);
        localObject = new t().a(paramSpotifyLink.j()).c(paramString1).d(paramSpotifyLink.i()).a(paramSpotifyLink.h()).b();
      }
      while (!PlaylistFragment.b(paramIntent));
      a((com.spotify.mobile.android.ui.fragments.g)localObject, paramIntent);
      return localObject;
    case 19:
      return com.spotify.mobile.android.spotlets.user.c.a(paramSpotifyLink.d(), paramString1);
    case 20:
      return ProfilesListFragment.a(paramSpotifyLink.d(), ProfilesListFragment.Type.a);
    case 21:
      return ProfilesListFragment.a(paramSpotifyLink.d(), ProfilesListFragment.Type.b);
    case 22:
      return com.spotify.mobile.android.spotlets.user.b.a(paramSpotifyLink.d());
    case 23:
      if (paramIntent.getExtras().containsKey("artists-json"))
      {
        com.spotify.mobile.android.spotlets.user.g localg = new com.spotify.mobile.android.spotlets.user.g();
        a(localg, paramIntent);
        return localg;
      }
      return com.spotify.mobile.android.spotlets.user.g.a(paramSpotifyLink.d());
    case 24:
      return new com.spotify.mobile.android.spotlets.follow.d();
    case 25:
      return ProfilesListFragment.a(paramSpotifyLink.d(), ProfilesListFragment.Type.c);
    case 26:
      return ProfilesListFragment.a(paramSpotifyLink.d(), ProfilesListFragment.Type.d);
    case 27:
      return new com.spotify.mobile.android.spotlets.phoenixinbox.c();
    case 28:
      return com.spotify.mobile.android.spotlets.browse.b.a(paramString2, paramString1);
    case 29:
      return com.spotify.mobile.android.spotlets.browse.a.a(paramString1, paramString2);
    case 30:
      return com.spotify.mobile.android.spotlets.browse.c.a(paramString1, paramString2);
    case 31:
      return com.spotify.mobile.android.spotlets.browse.e.a(paramString1, paramString2);
    case 32:
      return com.spotify.mobile.android.spotlets.browse.d.a(paramString1, paramString2, paramIntent);
    case 33:
      return v.a(paramString1);
    case 34:
      return com.spotify.mobile.android.ui.fragments.c.D();
    case 35:
    case 36:
      if ((paramSpotifyLink.a() == SpotifyLink.LinkType.L) && (FeatureFragment.g.a()))
        return com.spotify.mobile.android.spotlets.browse.a.a(paramString1, paramString2);
      if (FeatureFragment.a.a())
        return com.spotify.mobile.android.ui.fragments.d.a(paramString1);
      Assertion.b("Falling through to BrowseStartFragment");
      return com.spotify.mobile.android.spotlets.browse.a.a(paramString1, paramString2);
    case 37:
      if (FeatureFragment.aq.a())
        return new com.spotify.mobile.android.spotlets.socialchart.b();
      return a;
    case 38:
      if (FeatureFragment.ar.a())
        return new com.spotify.mobile.android.spotlets.a.a();
      return a;
    case 39:
      return new z();
    case 40:
      return CollectionFragment.b();
    case 41:
    case 42:
    case 43:
    case 44:
      return CollectionFragment.b();
    case 45:
      return com.spotify.mobile.android.spotlets.collection.fragments.a.a(paramSpotifyLink.d(), paramString1, false);
    case 46:
      return com.spotify.mobile.android.spotlets.collection.fragments.c.a(paramSpotifyLink.d(), paramString1, false);
    case 47:
      return new PushNotificationSettingsFragment();
    case 48:
      return new h();
    case 49:
      return new com.spotify.mobile.android.ui.fragments.b();
    case 50:
    }
    return new CosmosTestFragment();
  }

  private static void a(com.spotify.mobile.android.ui.fragments.g paramg, Intent paramIntent)
  {
    paramg.C().b_(paramIntent.getExtras());
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
