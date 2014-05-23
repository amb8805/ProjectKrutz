package com.spotify.mobile.android.ui.activity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import com.spotify.mobile.android.provider.o;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;

final class f extends b
{
  private Uri e;

  public f(CreateRenamePlaylistActivity paramCreateRenamePlaylistActivity, String paramString)
  {
    super(paramCreateRenamePlaylistActivity);
    SpotifyLink localSpotifyLink = new SpotifyLink(paramString);
    switch (CreateRenamePlaylistActivity.4.a[localSpotifyLink.a().ordinal()])
    {
    default:
      Assertion.a("Trying to rename playlist or folder, but link is of different type: " + localSpotifyLink.a());
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      Assertion.a(this.e, "uri is neither a playlist nor a folder uri.");
      return;
      this.e = com.spotify.mobile.android.provider.f.a(paramString);
      continue;
      this.e = o.a(paramString);
    }
  }

  public final void a()
  {
    Assertion.a(this.b.getAsString("name"), "Must set the new name of the playlist or folder");
    Assertion.a(this.e, "mContentUri must be set.");
    this.a.getContentResolver().update(this.e, this.b, null, null);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
