package com.spotify.mobile.android.ui.fragments.logic;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.n;
import com.spotify.mobile.android.provider.w;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.mobile.android.util.SpotifyLink;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class i extends o
{
  private int Y = 0;
  private int Z = 0;
  private final String[] a = { "context_uri", "is_suggested_track" };
  private Intent aa;
  private String ab = "";
  private boolean ac = false;
  private boolean ad = false;
  private boolean ae = false;
  private boolean af = false;
  private Handler ag = new Handler();
  private android.support.v4.app.o<Cursor> ah = new i.2(this);
  private android.support.v4.app.o<Cursor> ai = new i.3(this);
  private android.support.v4.app.o<Cursor> aj = new i.4(this);
  private Runnable ak = new i.5(this);
  private final String[] b = { "is_own", "playable_item_count" };
  private final String[] d = { "should_show_mft_nux_introduction_dialog", "should_show_mft_nux_suggested_song_dialog", "should_show_mft_nux_short_playlist_dialog" };
  private final String[] e = { "current_user", "streaming_rule_shuffle" };
  private Executor f;
  private SpotifyLink g;
  private boolean h = false;
  private int i = 0;

  public i()
  {
  }

  private void E()
  {
    this.ag.post(new i.1(this));
  }

  private boolean b()
  {
    return (this.ad) && (this.ae) && (this.af);
  }

  protected final void C()
  {
    this.i = this.c.c(this);
    this.Y = this.c.c(this);
    this.Z = this.c.c(this);
  }

  public final void D()
  {
    Intent localIntent = this.aa;
    int j = this.aa.getIntExtra("type", -1);
    int k;
    switch (j)
    {
    default:
      Assertion.a("Bad MFT NUX activity type: " + j);
      k = 0;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      a(localIntent, k);
      return;
      k = this.i;
      continue;
      k = this.Y;
      continue;
      k = this.Z;
    }
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    ContentValues localContentValues = new ContentValues();
    if (paramInt1 == this.i)
    {
      this.af = true;
      localContentValues.put("should_show_mft_nux_suggested_song_dialog", Boolean.valueOf(false));
    }
    while (true)
    {
      i().getContentResolver().update(w.a, localContentValues, null, null);
      this.h = false;
      if (b())
        E();
      return;
      if (paramInt1 == this.Y)
      {
        this.ae = true;
        localContentValues.put("should_show_mft_nux_short_playlist_dialog", Boolean.valueOf(false));
      }
      else if (paramInt1 == this.Z)
      {
        this.ad = true;
        localContentValues.put("should_show_mft_nux_introduction_dialog", Boolean.valueOf(false));
      }
    }
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.f = Executors.newSingleThreadExecutor();
    if (paramBundle != null)
    {
      this.h = paramBundle.getBoolean("queued", false);
      this.i = paramBundle.getInt("suggested_song_request_code");
      this.Y = paramBundle.getInt("min_tracks_in_playlist_request_code");
      this.Z = paramBundle.getInt("mft_introduction_request_code");
    }
    t().a(2131362132, null, this.ai);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putBoolean("queued", this.h);
    paramBundle.putInt("suggested_song_request_code", this.i);
    paramBundle.putInt("min_tracks_in_playlist_request_code", this.Y);
    paramBundle.putInt("mft_introduction_request_code", this.Z);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
