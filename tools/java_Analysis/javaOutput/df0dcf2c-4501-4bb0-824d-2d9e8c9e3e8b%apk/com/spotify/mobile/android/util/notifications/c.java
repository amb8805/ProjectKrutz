package com.spotify.mobile.android.util.notifications;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.aa;
import android.widget.RemoteViews;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.service.a.b;
import com.spotify.mobile.android.service.a.e;
import com.spotify.mobile.android.service.a.f;
import com.spotify.mobile.android.ui.activity.AddToPlaylistActivity;
import com.spotify.mobile.android.util.ac;

final class c extends a
{
  private NotificationButtonHelper d = new NotificationButtonHelper(2131362473, 2131362474);
  private NotificationButtonHelper e = new NotificationButtonHelper(2131362549, 2131362550);
  private NotificationButtonHelper f = new NotificationButtonHelper(2131362270, 2131362559);
  private NotificationButtonHelper g = new NotificationButtonHelper(2131362547, 2131362548);

  c(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }

  private void a(RemoteViews paramRemoteViews)
  {
    boolean bool1 = this.c.c;
    boolean bool2 = this.c.f;
    boolean bool3 = this.c.e;
    boolean bool4 = this.c.h;
    boolean bool5 = this.c.a.e;
    this.d.a(paramRemoteViews, bool1);
    NotificationButtonHelper localNotificationButtonHelper1;
    NotificationButtonHelper localNotificationButtonHelper2;
    if (bool4)
    {
      this.e.a(paramRemoteViews, false);
      this.f.a(paramRemoteViews, false);
      localNotificationButtonHelper1 = this.g;
      localNotificationButtonHelper2 = localNotificationButtonHelper1;
    }
    for (boolean bool6 = false; ; bool6 = true)
    {
      localNotificationButtonHelper2.a(paramRemoteViews, bool6);
      return;
      this.e.a(paramRemoteViews, bool3);
      this.f.a(paramRemoteViews, bool2);
      localNotificationButtonHelper1 = this.g;
      if (bool5)
        break;
      localNotificationButtonHelper2 = localNotificationButtonHelper1;
    }
  }

  @TargetApi(16)
  protected final void a(Notification paramNotification)
  {
    a(paramNotification.contentView);
    if (!ac.d)
      a(paramNotification.bigContentView);
  }

  @TargetApi(16)
  protected final Notification b()
  {
    RemoteViews localRemoteViews1 = c();
    Notification localNotification = this.b.h();
    localNotification.contentView = localRemoteViews1;
    if (!ac.d)
    {
      RemoteViews localRemoteViews2 = new RemoteViews(this.a.getPackageName(), 2130903206);
      f localf = this.c.a;
      e locale = localf.c();
      localRemoteViews2.setTextViewText(2131362557, locale.a());
      localRemoteViews2.setTextViewText(2131362558, locale.b());
      localRemoteViews2.setTextViewText(2131362545, locale.c());
      PendingIntent.getActivity(this.a, 0, new Intent(this.a, AddToPlaylistActivity.class).setData(Uri.parse(localf.a)).addFlags(268435456), 0);
      Intent localIntent = SpotifyService.a(this.a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_ADD_TO_COLLECTION");
      localIntent.putExtra("uri", localf.a);
      PendingIntent localPendingIntent1 = PendingIntent.getService(this.a, 0, localIntent, 134217728);
      localRemoteViews2.setImageViewResource(2131362548, 2130837747);
      PendingIntent localPendingIntent2 = PendingIntent.getService(this.a, 0, SpotifyService.a(this.a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"), 134217728);
      PendingIntent localPendingIntent3 = PendingIntent.getService(this.a, 0, SpotifyService.a(this.a, "com.spotify.mobile.android.service.action.player.PREVIOUS"), 134217728);
      PendingIntent localPendingIntent4 = PendingIntent.getService(this.a, 0, SpotifyService.a(this.a, "com.spotify.mobile.android.service.action.player.TOGGLE_PAUSED"), 134217728);
      PendingIntent localPendingIntent5 = PendingIntent.getService(this.a, 0, SpotifyService.a(this.a, "com.spotify.mobile.android.service.action.player.NEXT"), 134217728);
      localRemoteViews2.setOnClickPendingIntent(2131362547, localPendingIntent1);
      localRemoteViews2.setOnClickPendingIntent(2131362549, localPendingIntent3);
      localRemoteViews2.setOnClickPendingIntent(2131362473, localPendingIntent4);
      localRemoteViews2.setOnClickPendingIntent(2131362474, localPendingIntent4);
      localRemoteViews2.setOnClickPendingIntent(2131362270, localPendingIntent5);
      localRemoteViews2.setOnClickPendingIntent(2131362273, localPendingIntent2);
      localNotification.bigContentView = localRemoteViews2;
    }
    return localNotification;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.notifications.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
