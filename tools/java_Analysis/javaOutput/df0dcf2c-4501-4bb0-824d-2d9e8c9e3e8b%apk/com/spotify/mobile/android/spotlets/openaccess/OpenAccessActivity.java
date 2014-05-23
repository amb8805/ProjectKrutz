package com.spotify.mobile.android.spotlets.openaccess;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.g;
import android.support.v4.app.l;
import com.spotify.android.paste.app.FontSupport;
import com.spotify.mobile.android.spotlets.openaccess.b.a;
import com.spotify.mobile.android.spotlets.openaccess.b.b;
import com.spotify.mobile.android.ui.ActionBarManager;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;

public class OpenAccessActivity extends FragmentActivity
{
  public OpenAccessActivity()
  {
  }

  private void a(Intent paramIntent)
  {
    Intent localIntent = (Intent)paramIntent.getParcelableExtra("intent");
    SpotifyLink localSpotifyLink = new SpotifyLink(localIntent.getDataString());
    if (localSpotifyLink.a() == SpotifyLink.LinkType.g)
      c().a().b(2131362263, b.a(localIntent.getDataString())).b();
    while (localSpotifyLink.a() != SpotifyLink.LinkType.c)
      return;
    c().a().b(2131362263, a.a(localIntent.getDataString())).b();
  }

  protected void onCreate(Bundle paramBundle)
  {
    FontSupport.a(this);
    super.onCreate(paramBundle);
    ActionBarManager.a(this);
    setContentView(2130903071);
    a(getIntent());
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.openaccess.OpenAccessActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
