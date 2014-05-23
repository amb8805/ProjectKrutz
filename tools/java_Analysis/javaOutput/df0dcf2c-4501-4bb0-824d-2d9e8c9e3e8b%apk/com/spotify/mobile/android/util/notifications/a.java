package com.spotify.mobile.android.util.notifications;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.aa;
import android.widget.RemoteViews;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.service.a.f;
import com.spotify.mobile.android.service.a.g;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.util.ac;

public abstract class a
{
  protected final Context a;
  protected final aa b;
  protected final com.spotify.mobile.android.service.a.b c;

  protected a(Context paramContext, com.spotify.mobile.android.service.a.b paramb)
  {
    this.a = paramContext;
    this.c = paramb;
    f localf = paramb.a;
    this.b = new aa(this.a);
    aa localaa = this.b;
    Intent localIntent = new Intent(this.a, MainActivity.class);
    localIntent.setFlags(805306368);
    localIntent.setAction("com.spotify.mobile.android.ui.action.player.SHOW");
    localaa.a(PendingIntent.getActivity(this.a, 0, localIntent, 134217728)).a(localf.b).a().b().c().a(0L).f().c(localf.a().a());
  }

  public static a a(Context paramContext, com.spotify.mobile.android.service.a.b paramb)
  {
    if (ac.a)
      return new d(paramContext, paramb);
    if (paramb.d)
      return new b(paramContext, paramb);
    return new c(paramContext, paramb);
  }

  public final Notification a()
  {
    Notification localNotification = b();
    a(localNotification);
    return localNotification;
  }

  protected abstract void a(Notification paramNotification);

  protected abstract Notification b();

  protected final RemoteViews c()
  {
    RemoteViews localRemoteViews = new RemoteViews(this.a.getPackageName(), 2130903211);
    g localg = this.c.a.b();
    localRemoteViews.setTextViewText(2131362227, localg.a());
    localRemoteViews.setTextViewText(2131362282, localg.b());
    PendingIntent localPendingIntent1 = PendingIntent.getService(this.a, 0, SpotifyService.a(this.a, "com.spotify.mobile.android.service.action.player.TOGGLE_PAUSED"), 134217728);
    PendingIntent localPendingIntent2 = PendingIntent.getService(this.a, 0, SpotifyService.a(this.a, "com.spotify.mobile.android.service.action.player.NEXT"), 134217728);
    PendingIntent localPendingIntent3 = PendingIntent.getService(this.a, 0, SpotifyService.a(this.a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"), 134217728);
    if (this.c.c)
      localRemoteViews.setOnClickPendingIntent(2131362473, localPendingIntent1);
    while (true)
    {
      localRemoteViews.setOnClickPendingIntent(2131362270, localPendingIntent2);
      localRemoteViews.setOnClickPendingIntent(2131362273, localPendingIntent3);
      return localRemoteViews;
      localRemoteViews.setOnClickPendingIntent(2131362474, localPendingIntent1);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.notifications.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
