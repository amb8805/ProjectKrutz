package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.g;
import android.support.v4.app.l;
import com.spotify.mobile.android.ui.fragments.j;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dv;

public class NotificationWebViewActivity extends BaseFragmentActivity
{
  public NotificationWebViewActivity()
  {
  }

  public static Intent a(Context paramContext, SpotifyLink paramSpotifyLink)
  {
    Intent localIntent = new Intent(paramContext, NotificationWebViewActivity.class);
    localIntent.setData(paramSpotifyLink.k());
    return localIntent;
  }

  public void onBackPressed()
  {
    j localj = (j)c().a("notification_webview");
    if ((localj != null) && (localj.C()))
      return;
    super.onBackPressed();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903070);
    if (paramBundle == null)
      c().a().a(2131362261, new j(), "notification_webview").b();
    a(dv.a(this, ViewUri.aO));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.NotificationWebViewActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
