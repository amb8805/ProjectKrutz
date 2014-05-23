package com.spotify.mobile.android.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

public class MediaButtonReceiver extends BroadcastReceiver
{
  public MediaButtonReceiver()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Intent localIntent = SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.media_button");
    localIntent.putExtra("android.intent.extra.KEY_EVENT", (KeyEvent)paramIntent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
    paramContext.startService(localIntent);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.MediaButtonReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
