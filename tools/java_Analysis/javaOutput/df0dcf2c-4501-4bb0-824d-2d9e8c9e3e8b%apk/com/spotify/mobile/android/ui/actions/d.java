package com.spotify.mobile.android.ui.actions;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.spotify.mobile.android.c.a;
import com.spotify.mobile.android.provider.m;
import com.spotify.mobile.android.provider.n;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.ui.activity.PlayerActivity;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.ui.fragments.p;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.cc;
import java.util.List;

public class d
  implements a
{
  public d()
  {
  }

  public static void a(Context paramContext)
  {
    cc.a(paramContext);
    Assertion.a(paramContext instanceof Activity, "Don't pass non-Activity contexts here: " + paramContext.getClass().getSimpleName());
    paramContext.startActivity(new Intent(paramContext, PlayerActivity.class).setFlags(67108864));
  }

  public static void a(Context paramContext, int paramInt)
  {
    cc.a(paramContext);
    Intent localIntent = SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.player.SEEK");
    localIntent.putExtra("position", paramInt);
    paramContext.startService(localIntent);
  }

  public static void a(Context paramContext, ViewUri.Verified paramVerified, Uri paramUri, long paramLong)
  {
    a(paramContext, paramVerified, ViewUri.SubView.a, paramUri, paramLong, false);
  }

  public static void a(Context paramContext, ViewUri.Verified paramVerified, Uri paramUri, boolean paramBoolean)
  {
    a(paramContext, paramVerified, ViewUri.SubView.a, paramUri, -1L, paramBoolean);
  }

  public static void a(Context paramContext, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, Uri paramUri)
  {
    a(paramContext, paramVerified, paramSubView, ViewUri.aV, paramUri);
  }

  private static void a(Context paramContext, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, Uri paramUri, long paramLong, boolean paramBoolean)
  {
    a(paramContext, paramVerified, paramSubView, ViewUri.aV, paramUri, paramLong, paramBoolean);
  }

  public static void a(Context paramContext, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, Uri paramUri, boolean paramBoolean)
  {
    a(paramContext, paramVerified, paramSubView, paramUri, -1L, paramBoolean);
  }

  public static void a(Context paramContext, ViewUri.Verified paramVerified1, ViewUri.SubView paramSubView, ViewUri.Verified paramVerified2, Uri paramUri)
  {
    cc.a(paramContext);
    cc.a(paramVerified1);
    cc.a(paramSubView);
    cc.a(paramVerified2);
    cc.a(paramUri);
    Intent localIntent = SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.player.PLAY_CONTENT");
    localIntent.setData(paramUri);
    localIntent.putExtra("shuffle", true);
    localIntent.putExtra("uri", paramVerified1.toString());
    localIntent.putExtra("context", paramSubView.toString());
    localIntent.putExtra("referer", paramVerified2.toString());
    paramContext.startService(localIntent);
    if (FeatureFragment.ak.a())
      a(paramContext);
  }

  public static void a(Context paramContext, ViewUri.Verified paramVerified1, ViewUri.SubView paramSubView, ViewUri.Verified paramVerified2, Uri paramUri, long paramLong, boolean paramBoolean)
  {
    cc.a(paramContext);
    cc.a(paramUri);
    cc.a(paramVerified2);
    if ((FeatureFragment.h.a()) && (paramLong != -1L))
      if (p.b())
      {
        Intent localIntent2 = new Intent("com.spotify.mobile.android.service.broadcast.session.PLAYBACK_ERROR");
        localIntent2.putExtra("error_code", 16);
        localIntent2.putExtra("content_uri", paramUri.toString());
        paramContext.sendBroadcast(localIntent2);
      }
    do
    {
      return;
      Intent localIntent3 = new Intent("com.spotify.mobile.android.service.broadcast.session.PLAYBACK_ERROR");
      localIntent3.putExtra("error_code", 17);
      localIntent3.putExtra("content_uri", paramUri.toString());
      paramContext.sendBroadcast(localIntent3);
      return;
      cc.a(paramVerified1);
      cc.a(paramSubView);
      Intent localIntent1 = SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.player.PLAY_CONTENT");
      localIntent1.setData(paramUri);
      localIntent1.putExtra("row_id", paramLong);
      localIntent1.putExtra("uri", paramVerified1.toString());
      localIntent1.putExtra("context", paramSubView.toString());
      localIntent1.putExtra("referer", paramVerified2.toString());
      paramContext.startService(localIntent1);
    }
    while (!paramBoolean);
    a(paramContext);
  }

  public static void a(Context paramContext, ViewUri.Verified paramVerified1, ViewUri.Verified paramVerified2, Uri paramUri)
  {
    a(paramContext, paramVerified1, ViewUri.SubView.a, paramVerified2, paramUri, -1L, false);
  }

  public static void a(Context paramContext, String paramString)
  {
    cc.a(paramContext);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("uri", paramString);
    paramContext.getContentResolver().insert(m.a, localContentValues);
  }

  public static void a(Context paramContext, List<String> paramList)
  {
    cc.a(paramContext);
    cc.a(paramList);
    if (paramList.size() > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assertion.a(bool, "Don't call PlayerActions.playPreview with an empty list of track uris");
      Intent localIntent = SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.player.PLAY_PREVIEW");
      localIntent.putExtra("preview_track_uris", (String[])paramList.toArray(new String[paramList.size()]));
      paramContext.startService(localIntent);
      return;
    }
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    cc.a(paramContext);
    ContentValues localContentValues = new ContentValues();
    if (paramBoolean);
    for (String str = "up"; ; str = "down")
    {
      localContentValues.put("radio_thumb_state", str);
      paramContext.getContentResolver().update(n.a, localContentValues, null, null);
      return;
    }
  }

  public static void b(Context paramContext)
  {
    cc.a(paramContext);
    paramContext.startService(SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.player.CLEAR_QUEUE"));
  }

  public static void b(Context paramContext, int paramInt)
  {
    cc.a(paramContext);
    Intent localIntent = SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.player.SKIP_N_TRACKS_BACKWARDS");
    localIntent.putExtra("n_tracks_to_skip", paramInt);
    paramContext.startService(localIntent);
  }

  public static void b(Context paramContext, boolean paramBoolean)
  {
    cc.a(paramContext);
    Intent localIntent = SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.player.PREVIOUS");
    localIntent.putExtra("force_previous", paramBoolean);
    paramContext.startService(localIntent);
  }

  public static void c(Context paramContext)
  {
    cc.a(paramContext);
    paramContext.startService(SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.player.TOGGLE_PAUSED"));
  }

  public static void c(Context paramContext, int paramInt)
  {
    cc.a(paramContext);
    Intent localIntent = SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.player.SKIP_N_TRACKS_FORWARDS");
    localIntent.putExtra("n_tracks_to_skip", paramInt);
    paramContext.startService(localIntent);
  }

  public static void c(Context paramContext, boolean paramBoolean)
  {
    cc.a(paramContext);
    ContentValues localContentValues = new ContentValues();
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      localContentValues.put("shuffle", Integer.valueOf(i));
      paramContext.getContentResolver().update(n.a, localContentValues, null, null);
      return;
    }
  }

  public static void d(Context paramContext)
  {
    cc.a(paramContext);
    paramContext.startService(SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.player.NEXT"));
  }

  public static void e(Context paramContext)
  {
    cc.a(paramContext);
    paramContext.startService(SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.player.STOP_PREVIEW"));
  }

  public final void a(Activity paramActivity)
  {
    cc.a(paramActivity);
    PlayerActions.1 local1 = new PlayerActions.1(this, new Handler(), paramActivity);
    Intent localIntent = SpotifyService.a(paramActivity, "com.spotify.mobile.android.service.action.player.REQUEST_AUDIO_SESSION");
    localIntent.putExtra("callback", local1);
    paramActivity.startService(localIntent);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.actions.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
