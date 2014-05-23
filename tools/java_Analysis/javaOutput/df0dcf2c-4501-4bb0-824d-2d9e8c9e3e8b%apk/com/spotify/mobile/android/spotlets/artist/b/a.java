package com.spotify.mobile.android.spotlets.artist.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType;
import com.spotify.mobile.android.ui.activity.MainActivity;
import java.util.regex.Pattern;

public final class a extends b
{
  static final Pattern a = Pattern.compile("spotify:artist:([a-zA-Z0-9]+)");

  a(String paramString)
  {
    super(paramString);
  }

  public final Intent a(Context paramContext, ArtistModel.ReleaseType paramReleaseType, Bundle paramBundle)
  {
    return MainActivity.a(paramContext, new g(e(), paramReleaseType).f(), null, paramBundle);
  }

  protected final String a()
  {
    return "";
  }

  public final String b()
  {
    return new c(e()).f();
  }

  public final String c()
  {
    return f() + ":gallery";
  }

  public final String d()
  {
    return new f(e()).f();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
