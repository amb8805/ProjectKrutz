package com.spotify.mobile.android.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.widget.SpotifyWidget;
import com.spotify.mobile.android.ui.widget.a;
import com.spotify.mobile.android.util.PlaybackListener;
import com.spotify.mobile.android.util.PlaybackListener.Change;
import com.spotify.mobile.android.util.bx;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ao
  implements Handler.Callback, bx
{
  private Service a;
  private PlaybackListener b;
  private Uri c;
  private Bitmap d;
  private Handler e;
  private Intent f;
  private ap g;
  private final Object h = new Object();
  private a i;
  private AtomicBoolean j = new AtomicBoolean(false);

  public ao(Service paramService, PlaybackListener paramPlaybackListener, HandlerThread paramHandlerThread, a parama)
  {
    this.i = parama;
    this.e = new Handler(paramHandlerThread.getLooper(), this);
    this.g = new ap(this, (byte)0);
    this.a = paramService;
    this.b = paramPlaybackListener;
    this.f = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
    this.f.setComponent(new ComponentName(this.a, SpotifyWidget.class));
  }

  private void d()
  {
    Bundle localBundle = this.f.getExtras();
    if (localBundle != null)
      localBundle.clear();
    this.f.putExtra("track_uri", this.b.d());
    this.f.putExtra("track_name", this.b.e());
    this.f.putExtra("artist_name", this.b.g());
    this.f.putExtra("album_name", this.b.f());
    this.f.putExtra("paused", this.b.l());
    if (this.d != null)
      this.f.putExtra("cover", this.d);
    this.f.putExtra("is_prev_enabled", this.b.m());
    this.f.putExtra("is_next_enabled", this.b.n());
    this.f.putExtra("is_ad_playing", this.b.o());
    this.f.putExtra("is_suggested_track", this.b.p());
    this.i.a(this.a, this.f);
  }

  public final void a()
  {
    this.j.set(true);
    this.b.a(this);
  }

  public final void a(PlaybackListener paramPlaybackListener, EnumSet<PlaybackListener.Change> paramEnumSet)
  {
    if (this.j.get())
    {
      this.e.removeMessages(1001);
      this.e.sendEmptyMessage(1001);
    }
  }

  public final void b()
  {
    this.j.set(false);
    this.b.b(this);
    Intent localIntent = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
    localIntent.setComponent(new ComponentName(this.a, SpotifyWidget.class));
    localIntent.putExtra("track_uri", null);
    localIntent.putExtra("track_name", null);
    localIntent.putExtra("artist_name", null);
    localIntent.putExtra("album_name", null);
    localIntent.putExtra("paused", true);
    localIntent.putExtra("cover", null);
    localIntent.putExtra("is_prev_enabled", false);
    localIntent.putExtra("is_next_enabled", false);
    localIntent.putExtra("is_ad_playing", false);
    localIntent.putExtra("is_suggested_track", false);
    this.i.a(this.a, localIntent);
  }

  public final void c()
  {
    if (this.j.get())
    {
      this.e.removeMessages(1001);
      this.e.sendEmptyMessage(1001);
    }
  }

  public final boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1001)
      synchronized (this.h)
      {
        Uri localUri = this.b.h();
        if ((localUri != null) && (!localUri.equals(this.c)))
        {
          this.c = localUri;
          this.d = null;
          this.g.a(localUri);
          ((dd)c.a(dd.class)).a().a(localUri).a(2131427495, 2131427495).b().a(this.g);
        }
        else
        {
          d();
        }
      }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.ao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
