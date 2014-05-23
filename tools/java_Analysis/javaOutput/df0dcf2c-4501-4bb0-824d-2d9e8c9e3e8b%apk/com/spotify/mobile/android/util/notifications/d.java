package com.spotify.mobile.android.util.notifications;

import android.app.Notification;
import android.content.Context;
import android.support.v4.app.aa;
import android.widget.RemoteViews;
import com.spotify.mobile.android.service.a.b;

final class d extends a
{
  d(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }

  protected final void a(Notification paramNotification)
  {
    RemoteViews localRemoteViews = paramNotification.contentView;
    localRemoteViews.setViewVisibility(2131362473, 8);
    localRemoteViews.setViewVisibility(2131362474, 8);
    localRemoteViews.setViewVisibility(2131362270, 8);
    localRemoteViews.setViewVisibility(2131362559, 8);
    localRemoteViews.setViewVisibility(2131362273, 8);
  }

  protected final Notification b()
  {
    RemoteViews localRemoteViews = c();
    Notification localNotification = this.b.h();
    localNotification.contentView = localRemoteViews;
    return localNotification;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.notifications.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
