package com.spotify.mobile.android.util.notifications;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.app.aa;
import android.widget.RemoteViews;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.service.a.e;
import com.spotify.mobile.android.service.a.f;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ac;

final class b extends a
{
  private NotificationButtonHelper d = new NotificationButtonHelper(2131362473, 2131362474);
  private NotificationButtonHelper e = new NotificationButtonHelper(2131362549, 2131362550);
  private NotificationButtonHelper f = new NotificationButtonHelper(2131362270, 2131362559);
  private NotificationButtonHelper g = new NotificationButtonHelper(2131362554, 2131362555, 2131362556);
  private NotificationButtonHelper h = new NotificationButtonHelper(2131362551, 2131362552, 2131362553);

  b(Context paramContext, com.spotify.mobile.android.service.a.b paramb)
  {
    super(paramContext, paramb);
  }

  private void a(RemoteViews paramRemoteViews)
  {
    boolean bool1 = this.c.c;
    boolean bool2 = this.c.e;
    boolean bool3 = this.c.f;
    boolean bool4 = this.c.d;
    String str = (String)this.c.g.c(null);
    boolean bool5 = this.c.h;
    this.d.a(paramRemoteViews, bool1);
    if (bool5)
    {
      this.e.a(paramRemoteViews, false);
      this.f.a(paramRemoteViews, false);
      if (bool4)
      {
        this.g.a(paramRemoteViews, false);
        this.h.a(paramRemoteViews, false);
      }
    }
    do
    {
      return;
      this.e.a(paramRemoteViews, bool2);
      this.f.a(paramRemoteViews, bool3);
    }
    while (!bool4);
    if ((str != null) && (str.length() != 0))
    {
      if (str.equals("up"))
      {
        this.g.a(paramRemoteViews, NotificationButtonHelper.Visibility.c);
        this.h.a(paramRemoteViews, false);
        return;
      }
      if (str.equals("down"))
      {
        this.g.a(paramRemoteViews, false);
        this.h.a(paramRemoteViews, NotificationButtonHelper.Visibility.c);
        return;
      }
      Assertion.a("Invalid radio thumbs state");
    }
    this.g.a(paramRemoteViews, true);
    this.h.a(paramRemoteViews, true);
  }

  @TargetApi(16)
  protected final void a(Notification paramNotification)
  {
    a(paramNotification.contentView);
    if (!ac.d)
      a(paramNotification.bigContentView);
  }

  @TargetApi(16)
  public final Notification b()
  {
    RemoteViews localRemoteViews1 = c();
    Notification localNotification = this.b.h();
    localNotification.contentView = localRemoteViews1;
    if (!ac.d)
    {
      RemoteViews localRemoteViews2 = new RemoteViews(this.a.getPackageName(), 2130903207);
      e locale = this.c.a.c();
      localRemoteViews2.setTextViewText(2131362557, locale.a());
      localRemoteViews2.setTextViewText(2131362558, locale.b());
      localRemoteViews2.setTextViewText(2131362545, locale.c());
      PendingIntent localPendingIntent1 = PendingIntent.getService(this.a, 0, SpotifyService.a(this.a, "com.spotify.mobile.android.service.action.player.THUMB_UP"), 134217728);
      PendingIntent localPendingIntent2 = PendingIntent.getService(this.a, 0, SpotifyService.a(this.a, "com.spotify.mobile.android.service.action.player.THUMB_DOWN"), 134217728);
      PendingIntent localPendingIntent3 = PendingIntent.getService(this.a, 0, SpotifyService.a(this.a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"), 134217728);
      PendingIntent localPendingIntent4 = PendingIntent.getService(this.a, 0, SpotifyService.a(this.a, "com.spotify.mobile.android.service.action.player.TOGGLE_PAUSED"), 134217728);
      PendingIntent localPendingIntent5 = PendingIntent.getService(this.a, 0, SpotifyService.a(this.a, "com.spotify.mobile.android.service.action.player.NEXT"), 134217728);
      localRemoteViews2.setOnClickPendingIntent(2131362554, localPendingIntent1);
      localRemoteViews2.setOnClickPendingIntent(2131362551, localPendingIntent2);
      localRemoteViews2.setOnClickPendingIntent(2131362473, localPendingIntent4);
      localRemoteViews2.setOnClickPendingIntent(2131362474, localPendingIntent4);
      localRemoteViews2.setOnClickPendingIntent(2131362270, localPendingIntent5);
      localRemoteViews2.setOnClickPendingIntent(2131362273, localPendingIntent3);
      localNotification.bigContentView = localRemoteViews2;
    }
    return localNotification;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.notifications.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
