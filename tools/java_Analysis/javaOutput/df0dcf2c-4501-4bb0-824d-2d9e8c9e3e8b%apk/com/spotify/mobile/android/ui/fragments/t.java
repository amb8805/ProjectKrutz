package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.cc;

public final class t
{
  private final Bundle a = new Bundle();

  public t()
  {
  }

  public final Intent a(Context paramContext)
  {
    String str = this.a.getString("playlist_uri");
    cc.a(str, "playlistUri must be set");
    Intent localIntent = MainActivity.a(paramContext, str);
    localIntent.putExtras(this.a);
    return localIntent;
  }

  public final t a()
  {
    this.a.putBoolean("is_sub_fragment", true);
    return this;
  }

  public final t a(ViewUri.Verified paramVerified)
  {
    this.a.putParcelable("referer", paramVerified);
    return this;
  }

  public final t a(String paramString)
  {
    this.a.putString("playlist_uri", paramString);
    return this;
  }

  public final t a(boolean paramBoolean)
  {
    this.a.putBoolean("autoplay", paramBoolean);
    return this;
  }

  public final PlaylistFragment b()
  {
    cc.a(this.a.getString("playlist_uri"), "playlistUri must be set");
    PlaylistFragment localPlaylistFragment = new PlaylistFragment();
    localPlaylistFragment.b_(this.a);
    return localPlaylistFragment;
  }

  public final t b(String paramString)
  {
    this.a.putString("sort_order", paramString);
    return this;
  }

  public final t c(String paramString)
  {
    this.a.putString("title", paramString);
    return this;
  }

  public final t d(String paramString)
  {
    this.a.putString("lookup_track_uri", paramString);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
