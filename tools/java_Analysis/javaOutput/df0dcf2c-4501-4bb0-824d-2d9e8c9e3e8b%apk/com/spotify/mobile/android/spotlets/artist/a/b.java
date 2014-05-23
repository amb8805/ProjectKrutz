package com.spotify.mobile.android.spotlets.artist.a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.spotify.mobile.android.provider.n;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class b
{
  static final String[] b = { "paused", "is_prev_enabled", "is_next_enabled", "is_radio", "radio_thumb_state", "is_ad_playing", "context_uri" };
  private static final String[] h = { "uri", "name", "album_name", "artist_name", "album_image_uri", "focused_row" };
  ContentObserver a = new b.1(this, this.f);
  private final Context c;
  private final Executor d = Executors.newSingleThreadExecutor();
  private final c e;
  private Handler f = new Handler();
  private Runnable g = new b.2(this);

  public b(Context paramContext, c paramc)
  {
    this.c = paramContext;
    this.e = paramc;
  }

  public final void a()
  {
    c();
    this.c.getContentResolver().registerContentObserver(n.a, true, this.a);
  }

  public final void b()
  {
    this.c.getContentResolver().unregisterContentObserver(this.a);
  }

  public final void c()
  {
    this.d.execute(this.g);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
