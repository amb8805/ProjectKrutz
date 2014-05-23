package com.spotify.mobile.android.ui.activity;

import android.content.ContentResolver;
import android.content.ContentValues;
import com.spotify.mobile.android.provider.f;
import com.spotify.mobile.android.provider.p;
import com.spotify.mobile.android.util.Assertion;

class b
  implements e
{
  protected ContentValues b = new ContentValues();
  protected String c;

  public b(CreateRenamePlaylistActivity paramCreateRenamePlaylistActivity)
  {
    this(paramCreateRenamePlaylistActivity, null);
  }

  public b(CreateRenamePlaylistActivity paramCreateRenamePlaylistActivity, String paramString)
  {
    this.c = paramString;
  }

  public final e a(String paramString)
  {
    Assertion.a(paramString, "Don't set the playlist or folder name to null, underlying layers don't like it");
    if (paramString.length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assertion.a(bool, "Don't set the playlist or folder name to empty, underlying layers don't like it");
      this.b.put("name", paramString);
      return this;
    }
  }

  public void a()
  {
    Assertion.a(this.b.getAsString("name"), "Must set the new name of the playlist or folder.");
    if (this.c != null)
    {
      this.d.getContentResolver().insert(f.b(this.c), this.b);
      return;
    }
    this.d.getContentResolver().insert(p.a(), this.b);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
