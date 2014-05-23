package com.spotify.mobile.android.ui;

import android.app.Application;
import android.content.Intent;
import com.spotify.mobile.android.devtools.MethodTraceScope;
import com.spotify.mobile.android.mobileapptracker.MobileAppTrackerIntentService;
import com.spotify.mobile.android.spotlets.common.persistence.g;
import com.spotify.mobile.android.spotlets.common.persistence.h;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.ui.actions.b;
import com.spotify.mobile.android.ui.cell.e;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.ProcessIdentifier;
import com.spotify.mobile.android.util.ProcessIdentifier.ProcessType;
import com.spotify.mobile.android.util.ProcessIdentifier.UnidentifiableProcessException;
import com.spotify.mobile.android.util.ad;
import com.spotify.mobile.android.util.ai;
import com.spotify.mobile.android.util.ap;
import com.spotify.mobile.android.util.bl;
import com.spotify.mobile.android.util.da;
import com.spotify.mobile.android.util.dd;
import com.spotify.mobile.android.util.dk;

public class SpotifyApplication extends Application
{
  public SpotifyApplication()
  {
  }

  private static boolean a()
  {
    ap localap = (ap)com.spotify.mobile.android.c.c.a(ap.class);
    if (!localap.f());
    for (boolean bool = true; ; bool = false)
    {
      if (bool)
        localap.h();
      return bool;
    }
  }

  public void onCreate()
  {
    com.spotify.mobile.android.devtools.a.a(MethodTraceScope.a);
    com.spotify.mobile.android.c.c.a(dk.class, new dk(this));
    if (!((dk)com.spotify.mobile.android.c.c.a(dk.class)).b())
      setTheme(2131755257);
    super.onCreate();
    net.hockeyapp.android.a.a(this);
    com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class, new com.spotify.mobile.android.ui.actions.a());
    com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.d.class, new com.spotify.mobile.android.ui.actions.d());
    com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.c.class, new com.spotify.mobile.android.ui.actions.c());
    com.spotify.mobile.android.c.c.a(b.class, new com.spotify.mobile.android.ui.actions.a.a(getContentResolver()));
    com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.menus.d.class, new com.spotify.mobile.android.ui.menus.d());
    com.spotify.mobile.android.c.c.a(g.class, new h());
    com.spotify.mobile.android.c.c.a(bl.class, new bl());
    com.spotify.mobile.android.c.c.a(ClientInfo.class, new ClientInfo(this));
    com.spotify.mobile.android.c.c.a(ap.class, new ap(this));
    com.spotify.mobile.android.c.c.a(ai.class, new com.spotify.mobile.android.util.d(this));
    com.spotify.mobile.android.c.c.a(da.class, new da());
    com.spotify.mobile.android.c.c.a(FollowManager.class, new FollowManager(this));
    com.spotify.mobile.android.c.c.a(e.class, new e());
    com.spotify.mobile.android.c.c.a(ad.class, new ad());
    com.spotify.mobile.android.c.c.a(dd.class, new dd(this));
    com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.util.b.a.class, new com.spotify.mobile.android.util.b.a());
    try
    {
      new ProcessIdentifier();
      ProcessIdentifier.ProcessType localProcessType = ProcessIdentifier.a();
      int i = SpotifyApplication.1.a[localProcessType.ordinal()];
      switch (i)
      {
      default:
      case 1:
      }
      while (true)
      {
        com.spotify.mobile.android.devtools.a.b(MethodTraceScope.a);
        return;
        if (0.001D > Math.random())
          Assertion.b("baseline crash, periodicity 1000");
        boolean bool = a();
        Intent localIntent = MobileAppTrackerIntentService.a(this, "com.spotify.mobile.android.service.mat.application.init");
        localIntent.putExtra("installation_id_new", bool);
        startService(localIntent);
      }
    }
    catch (ProcessIdentifier.UnidentifiableProcessException localUnidentifiableProcessException)
    {
      while (true)
      {
        Assertion.a("Could not determine our process", localUnidentifiableProcessException);
        a();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.SpotifyApplication
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
