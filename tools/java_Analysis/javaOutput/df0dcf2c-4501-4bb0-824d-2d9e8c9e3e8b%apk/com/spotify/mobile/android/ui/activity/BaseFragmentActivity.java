package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.spotify.android.paste.app.FontSupport;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.util.dt;

public abstract class BaseFragmentActivity extends FragmentActivity
{
  private dt n = null;

  public BaseFragmentActivity()
  {
  }

  public final void a(dt paramdt)
  {
    this.n = paramdt;
  }

  protected void onCreate(Bundle paramBundle)
  {
    FontSupport.a(this);
    super.onCreate(paramBundle);
  }

  protected void onPause()
  {
    super.onPause();
    if (this.n != null)
      this.n.b();
    startService(SpotifyService.a(this, "com.spotify.mobile.android.service.action.client.BACKGROUND"));
  }

  protected void onResume()
  {
    super.onResume();
    if (this.n != null)
      this.n.a();
    startService(SpotifyService.a(this, "com.spotify.mobile.android.service.action.client.FOREGROUND"));
  }

  protected void onStart()
  {
    super.onStart();
    i.a(this).a();
  }

  protected void onStop()
  {
    i.a(this).b();
    super.onStop();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.BaseFragmentActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
