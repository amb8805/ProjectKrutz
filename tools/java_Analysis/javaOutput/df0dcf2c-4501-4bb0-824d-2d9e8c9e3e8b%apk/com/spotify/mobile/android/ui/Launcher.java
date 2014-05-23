package com.spotify.mobile.android.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.b.a;

public class Launcher extends Activity
{
  public Launcher()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    localIntent.setClass(this, MainActivity.class);
    ((a)c.a(a.class)).a(this, localIntent, new ClientEvent(ClientEvent.Event.al, ClientEvent.SubEvent.aM));
    startActivity(localIntent);
    finish();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.Launcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
