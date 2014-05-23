package com.spotify.mobile.android.service.a;

import android.app.Notification;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.squareup.picasso.aj;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class c
{
  private static final String[] a = { "paused", "is_prev_enabled", "is_next_enabled", "is_radio", "radio_thumb_state", "is_ad_playing" };
  private static final String[] b = { "uri", "name", "album_name", "artist_name", "album_image_uri", "focused_row", "is_in_collection" };
  private final Context c;
  private final a d;
  private final Handler e;
  private com.spotify.mobile.android.e.a<b> f = com.spotify.mobile.android.e.a.a();
  private Notification g;
  private Executor h = Executors.newSingleThreadExecutor();
  private aj i = new c.1(this);
  private Runnable j = new c.2(this);

  public c(Context paramContext, a parama)
  {
    this.c = paramContext;
    this.d = parama;
    this.e = new Handler(Looper.getMainLooper());
  }

  public final void a()
  {
    this.h.execute(this.j);
  }

  public final void b()
  {
    this.d.a(1);
    this.f = com.spotify.mobile.android.e.a.a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
