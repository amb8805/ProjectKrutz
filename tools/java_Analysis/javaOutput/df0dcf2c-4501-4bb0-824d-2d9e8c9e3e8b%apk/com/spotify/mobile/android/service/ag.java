package com.spotify.mobile.android.service;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.provider.w;
import com.spotify.mobile.android.util.PlaybackListener;
import com.spotify.mobile.android.util.PlaybackListener.Change;
import com.spotify.mobile.android.util.a.g;
import com.spotify.mobile.android.util.a.g;;
import com.spotify.mobile.android.util.a.h;
import com.spotify.mobile.android.util.a.i;
import com.spotify.mobile.android.util.a.j;
import com.spotify.mobile.android.util.ac;
import com.spotify.mobile.android.util.bx;
import com.spotify.mobile.android.util.cr;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cy;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ag
  implements Handler.Callback, bx
{
  public static final cy a = cy.a("send_playback_broadcasts");
  private final ah b;
  private Context c;
  private PlaybackListener d;
  private g e;
  private AudioManager f;
  private cr g;
  private Uri h;
  private Bitmap i;
  private Handler j;
  private final Object k = new Object();
  private cw l;
  private AtomicBoolean m = new AtomicBoolean(false);

  public ag(Context paramContext, cw paramcw, PlaybackListener paramPlaybackListener, HandlerThread paramHandlerThread)
  {
    this.c = paramContext;
    this.l = paramcw;
    this.j = new Handler(paramHandlerThread.getLooper(), this);
    this.b = new ah(this, (byte)0);
    Intent localIntent = new Intent("android.intent.action.MEDIA_BUTTON");
    localIntent.setComponent(new ComponentName(paramContext.getPackageName(), MediaButtonReceiver.class.getName()));
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(paramContext.getApplicationContext(), 0, localIntent, 0);
    this.f = ((AudioManager)paramContext.getSystemService("audio"));
    Looper localLooper = paramHandlerThread.getLooper();
    if (ac.i);
    for (Object localObject = new j(localPendingIntent, localLooper); ; localObject = new i())
    {
      this.e = ((g)localObject);
      this.e.b(137);
      this.d = paramPlaybackListener;
      return;
    }
  }

  private void e()
  {
    int n;
    int i2;
    if (!this.d.o())
    {
      n = 8;
      int i1 = n | 0x0;
      if (!this.d.m())
        break label197;
      i2 = 1;
      label29: int i3 = i2 | i1;
      boolean bool = this.d.n();
      int i4 = 0;
      if (bool)
        i4 = 128;
      int i5 = i3 | i4;
      this.e.b(i5);
      h localh = this.e.a();
      localh.a(7, this.d.e());
      localh.a(1, this.d.f());
      localh.a(2, this.d.g());
      localh.a(13, this.d.g());
      localh.a(this.d.j());
      if (this.i != null)
        localh.a(this.i);
      localh.a();
      if (!this.d.l())
        break label202;
    }
    label197: label202: for (int i6 = 2; ; i6 = 3)
    {
      this.e.a(i6);
      return;
      n = 0;
      break;
      i2 = 0;
      break label29;
    }
  }

  private boolean f()
  {
    try
    {
      boolean bool2;
      if (!this.l.a(a))
      {
        cr localcr = this.g;
        bool2 = false;
        if (localcr == null)
        {
          this.g = new cr(this.c, new ag.1(this));
          this.g.a(w.a, new String[] { "post_to_facebook" }, null);
        }
      }
      while (true)
      {
        return bool2;
        boolean bool1 = this.l.a(a, false);
        bool2 = bool1;
      }
    }
    finally
    {
    }
  }

  public final void a()
  {
    this.m.set(true);
    this.d.a(this);
    if (this.m.get())
      this.j.sendEmptyMessage(1001);
  }

  public final void a(PlaybackListener paramPlaybackListener, EnumSet<PlaybackListener.Change> paramEnumSet)
  {
    if (this.m.get())
    {
      this.j.removeMessages(1001);
      this.j.sendEmptyMessage(1001);
      long l1 = System.currentTimeMillis();
      if ((f()) && (!this.d.o()))
      {
        Iterator localIterator = paramEnumSet.iterator();
        if (localIterator.hasNext())
        {
          PlaybackListener.Change localChange = (PlaybackListener.Change)localIterator.next();
          Intent localIntent = new Intent();
          switch (ag.2.a[localChange.ordinal()])
          {
          case 4:
          default:
          case 1:
          case 2:
          case 3:
          }
          while (true)
          {
            localIntent.putExtra("timeSent", l1);
            this.c.sendStickyBroadcast(localIntent);
            break;
            localIntent.putExtra("id", this.d.d());
            localIntent.putExtra("artist", this.d.g());
            localIntent.putExtra("album", this.d.f());
            localIntent.putExtra("track", this.d.e());
            localIntent.putExtra("length", this.d.j());
            localIntent.setAction("com.spotify.mobile.android.metadatachanged");
            continue;
            if (!this.d.l());
            for (boolean bool = true; ; bool = false)
            {
              localIntent.putExtra("playing", bool);
              localIntent.putExtra("playbackPosition", this.d.k());
              localIntent.setAction("com.spotify.mobile.android.playbackstatechanged");
              break;
            }
            localIntent.setAction("com.spotify.mobile.android.queuechanged");
          }
        }
      }
    }
  }

  public final void b()
  {
    this.m.set(false);
    this.d.b(this);
  }

  public final void c()
  {
    this.e.a(this.f);
  }

  public final void d()
  {
    this.e.b(this.f);
  }

  public final boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1001)
    {
      if (this.d.d() == null)
      {
        this.h = null;
        this.e.a().a();
        this.e.a(1);
      }
    }
    else
      return true;
    while (true)
    {
      synchronized (this.k)
      {
        Uri localUri = this.d.i();
        if ((localUri != null) && (!localUri.equals(this.h)))
        {
          this.h = localUri;
          this.i = null;
          this.b.a(localUri);
          ((dd)c.a(dd.class)).a().a(localUri).a(this.b);
          return true;
        }
      }
      e();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
