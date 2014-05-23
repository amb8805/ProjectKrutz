package com.spotify.mobile.android.spotlets.artist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.fragments.g;

public final class j
{
  public static Intent a(Context paramContext, String paramString1, String paramString2)
  {
    Intent localIntent = MainActivity.a(paramContext, paramString1, paramString2);
    localIntent.putExtra("artist_uri", paramString1);
    return localIntent;
  }

  public static g a(String paramString, Bundle paramBundle)
  {
    b localb = new b();
    a(paramString, paramBundle, localb);
    return localb;
  }

  public static g a(String paramString1, String paramString2, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("track_uri", paramString2);
    localBundle.putBoolean("autoplay", paramBoolean);
    i locali = new i();
    a(paramString1, localBundle, locali);
    return locali;
  }

  private static void a(String paramString, Bundle paramBundle, g paramg)
  {
    ArtistModel localArtistModel;
    String str1;
    label26: int i;
    label38: String str2;
    if (paramBundle != null)
    {
      localArtistModel = (ArtistModel)paramBundle.getParcelable("artist_model");
      if (paramBundle == null)
        break label144;
      str1 = paramBundle.getString("artist_name");
      if (paramBundle == null)
        break label150;
      i = paramBundle.getInt("concert_id");
      str2 = null;
      if (paramBundle != null)
        str2 = paramBundle.getString("track_uri");
      if (paramBundle == null)
        break label156;
    }
    label144: label150: label156: for (boolean bool = paramBundle.getBoolean("autoplay", false); ; bool = false)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("artist_uri", paramString);
      localBundle.putParcelable("artist_model", localArtistModel);
      localBundle.putString("artist_name", str1);
      localBundle.putInt("concert_id", i);
      localBundle.putString("track_uri", str2);
      localBundle.putBoolean("autoplay", bool);
      paramg.C().b_(localBundle);
      return;
      localArtistModel = null;
      break;
      str1 = null;
      break label26;
      i = 0;
      break label38;
    }
  }

  public static g b(String paramString, Bundle paramBundle)
  {
    h localh = new h();
    a(paramString, paramBundle, localh);
    return localh;
  }

  public static g c(String paramString, Bundle paramBundle)
  {
    c localc = new c();
    a(paramString, paramBundle, localc);
    return localc;
  }

  public static g d(String paramString, Bundle paramBundle)
  {
    k localk = new k();
    a(paramString, paramBundle, localk);
    return localk;
  }

  public static g e(String paramString, Bundle paramBundle)
  {
    l locall = new l();
    a(paramString, paramBundle, locall);
    return locall;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
