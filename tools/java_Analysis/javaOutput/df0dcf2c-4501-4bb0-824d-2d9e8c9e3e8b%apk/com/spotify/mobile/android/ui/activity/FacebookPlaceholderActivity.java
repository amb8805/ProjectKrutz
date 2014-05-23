package com.spotify.mobile.android.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.ad;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.util.av;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.ct;
import com.spotify.mobile.android.util.dm;

public class FacebookPlaceholderActivity extends Activity
{
  private Session a;
  private ad b;

  public FacebookPlaceholderActivity()
  {
  }

  protected final void a(SessionState paramSessionState, Exception paramException)
  {
    bp.b("%s %s", new Object[] { paramSessionState, paramException });
    if (paramException != null)
    {
      dm.a(this, paramException);
      finish();
    }
    do
    {
      return;
      if (paramSessionState.a())
      {
        ct.a(this, this.a.e());
        ct.a(this, 1);
        finish();
        return;
      }
    }
    while (!paramSessionState.b());
    finish();
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.b.a(paramInt1, paramInt2, paramIntent);
    this.a = Session.h();
    if ((this.a == null) || (!this.a.a()));
    while ((paramInt1 != 100) || (av.a(av.b)))
      return;
    av.b(this);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.b = new ad(this, new FacebookPlaceholderActivity.1(this));
    this.b.a(paramBundle);
    this.a = Session.h();
    if ((this.a == null) || (this.a.c().b()))
    {
      Session localSession = new Session(this);
      Session.a(localSession);
      this.a = localSession;
    }
    if (this.a.a())
    {
      finish();
      return;
    }
    try
    {
      av.a(this);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      bp.a(localUnsupportedOperationException, "error requesting read permissions");
      dm.i(this);
      finish();
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  protected void onPause()
  {
    super.onPause();
    this.b.b();
    startService(SpotifyService.a(this, "com.spotify.mobile.android.service.action.client.BACKGROUND"));
  }

  protected void onResume()
  {
    super.onResume();
    this.b.a();
    startService(SpotifyService.a(this, "com.spotify.mobile.android.service.action.client.FOREGROUND"));
    Session localSession = Session.h();
    if ((localSession != null) && ((localSession.a()) || (localSession.b())))
      a(localSession.c(), null);
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    this.b.b(paramBundle);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.FacebookPlaceholderActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
