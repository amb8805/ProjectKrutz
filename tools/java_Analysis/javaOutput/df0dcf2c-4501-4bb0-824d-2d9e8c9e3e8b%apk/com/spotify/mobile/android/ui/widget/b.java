package com.spotify.mobile.android.ui.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.util.bp;

public final class b
  implements a
{
  private static final int[] a = { 2130837796, 2130837797 };
  private static final int[] b = { 2130837798, 2130837799 };

  public b()
  {
  }

  private static void a(Context paramContext, RemoteViews paramRemoteViews, String paramString, int paramInt, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, SpotifyWidget.class);
    localIntent.setAction(paramString);
    localIntent.putExtra("is_suggested_track", paramBoolean);
    paramRemoteViews.setOnClickPendingIntent(paramInt, PendingIntent.getBroadcast(paramContext, 1, localIntent, 134217728));
  }

  public final void a(Context paramContext)
  {
    paramContext.startService(SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.request.update.WIDGET"));
  }

  public final void a(Context paramContext, Intent paramIntent)
  {
    if (!paramIntent.hasExtra("track_uri"))
    {
      a(paramContext);
      return;
    }
    String str1 = paramIntent.getStringExtra("track_uri");
    String str2 = paramIntent.getStringExtra("track_name");
    String str3 = paramIntent.getStringExtra("artist_name");
    String str4 = paramIntent.getStringExtra("album_name");
    if (str3 != null)
      label51: if ((str4 == null) || (str4.length() <= 0))
        break label579;
    label543: label549: label560: label567: label579: for (String str5 = str3 + " — " + str4; ; str5 = str3)
    {
      boolean bool1 = paramIntent.getBooleanExtra("paused", true);
      Bitmap localBitmap = (Bitmap)paramIntent.getParcelableExtra("cover");
      boolean bool2 = paramIntent.getBooleanExtra("is_prev_enabled", false);
      boolean bool3 = paramIntent.getBooleanExtra("is_next_enabled", false);
      boolean bool4 = paramIntent.getBooleanExtra("is_ad_playing", false);
      boolean bool5 = paramIntent.getBooleanExtra("is_suggested_track", false);
      ComponentName localComponentName = new ComponentName(paramContext, SpotifyWidget.class);
      AppWidgetManager localAppWidgetManager = AppWidgetManager.getInstance(paramContext);
      RemoteViews localRemoteViews = new RemoteViews(paramContext.getPackageName(), 2130903264);
      localRemoteViews.setViewVisibility(2131362661, 8);
      localRemoteViews.setViewVisibility(2131362659, 8);
      localRemoteViews.setViewVisibility(2131362663, 8);
      localRemoteViews.setViewVisibility(2131362660, 0);
      localRemoteViews.setViewVisibility(2131362658, 0);
      localRemoteViews.setViewVisibility(2131362662, 0);
      int i = 2131362660;
      int j;
      label254: int m;
      label336: int n;
      label349: String str6;
      if ((str1 != null) && (str1.length() > 0) && (!bool4))
      {
        j = 1;
        if (j != 0)
        {
          i = 2131362661;
          localRemoteViews.setViewVisibility(2131362660, 8);
          localRemoteViews.setViewVisibility(2131362661, 0);
          if (bool2)
          {
            localRemoteViews.setViewVisibility(2131362658, 8);
            localRemoteViews.setViewVisibility(2131362659, 0);
          }
          if (bool3)
          {
            localRemoteViews.setViewVisibility(2131362662, 8);
            localRemoteViews.setViewVisibility(2131362663, 0);
          }
        }
        int k = i;
        if (j == 0)
          break label543;
        m = 1;
        if (!bool1)
          break label549;
        n = b[m];
        localRemoteViews.setImageViewResource(k, n);
        if (str2 == null)
          break label560;
        str6 = str2;
        label367: localRemoteViews.setTextViewText(2131362227, str6);
        localRemoteViews.setTextViewText(2131362314, str5);
        a(paramContext, localRemoteViews, "com.spotify.mobile.android.ui.widget.PREVIOUS", 2131362659, bool5);
        a(paramContext, localRemoteViews, "com.spotify.mobile.android.ui.widget.PLAY", 2131362661, bool5);
        a(paramContext, localRemoteViews, "com.spotify.mobile.android.ui.widget.NEXT", 2131362663, bool5);
        if (localBitmap != null)
          break label567;
        localRemoteViews.setImageViewResource(2131362546, 2130837634);
      }
      while (true)
      {
        Intent localIntent = new Intent(paramContext, MainActivity.class);
        localIntent.setFlags(805306368);
        if (str1 != null)
          localIntent.setAction("com.spotify.mobile.android.ui.action.player.SHOW");
        PendingIntent localPendingIntent = PendingIntent.getActivity(paramContext, 2, localIntent, 134217728);
        localRemoteViews.setOnClickPendingIntent(2131362546, localPendingIntent);
        localRemoteViews.setOnClickPendingIntent(2131362227, localPendingIntent);
        localRemoteViews.setOnClickPendingIntent(2131362314, localPendingIntent);
        if (localAppWidgetManager == null)
          break;
        try
        {
          localAppWidgetManager.updateAppWidget(localComponentName, localRemoteViews);
          return;
        }
        catch (RuntimeException localRuntimeException)
        {
          bp.b(localRuntimeException, "failing to update widget");
          return;
        }
        str3 = "";
        break label51;
        j = 0;
        break label254;
        m = 0;
        break label336;
        n = a[m];
        break label349;
        str6 = "";
        break label367;
        localRemoteViews.setImageViewBitmap(2131362546, localBitmap);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.widget.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
