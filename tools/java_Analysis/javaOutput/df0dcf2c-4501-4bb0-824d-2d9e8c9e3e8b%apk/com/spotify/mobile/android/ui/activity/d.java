package com.spotify.mobile.android.ui.activity;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.c;
import android.support.v4.content.k;
import com.spotify.mobile.android.provider.f;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;

final class d
  implements android.support.v4.app.o<Cursor>
{
  String a;

  public d(CreateRenamePlaylistActivity paramCreateRenamePlaylistActivity, String paramString)
  {
    this.a = paramString;
  }

  public final k<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (new SpotifyLink(this.a).a() == SpotifyLink.LinkType.E)
      return new c(this.b, f.a(this.a), CreateRenamePlaylistActivity.d(this.b), null, null, null);
    return new c(this.b, com.spotify.mobile.android.provider.o.a(this.a), CreateRenamePlaylistActivity.d(this.b), null, null, null);
  }

  public final void a(k<Cursor> paramk)
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
