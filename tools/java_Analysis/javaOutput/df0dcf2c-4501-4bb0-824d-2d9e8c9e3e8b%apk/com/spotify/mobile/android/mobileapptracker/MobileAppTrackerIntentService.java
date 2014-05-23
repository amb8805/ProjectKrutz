package com.spotify.mobile.android.mobileapptracker;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mobileapptracker.Tracker;
import com.mobileapptracker.b;
import com.mobileapptracker.h;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.Launcher;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ap;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import com.spotify.mobile.android.util.cy;

public class MobileAppTrackerIntentService extends IntentService
{
  static final cy a = cy.a("install_referrer");
  static final cy b = cy.a("account_creation_source");
  protected a c;
  private cw d;

  public MobileAppTrackerIntentService()
  {
    super(MobileAppTrackerIntentService.class.getSimpleName());
  }

  public static Intent a(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent(paramContext, MobileAppTrackerIntentService.class);
    localIntent.setAction(paramString);
    return localIntent;
  }

  private void a(String paramString)
  {
    this.d = cw.a(this);
    this.d.b(b, paramString);
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    if (paramIntent == null)
      Assertion.a("Intent should not be null here.");
    String str1;
    label381: String str2;
    do
    {
      String str4;
      do
      {
        return;
        str1 = paramIntent.getAction();
        try
        {
          this.c = new a();
          Assertion.a(this, "We need a context for the MobileAppTracker SDK.");
          h.a(this, "3672", "bdc82f3d1e0cfe058f2fd9ffa24c977f");
          h localh1 = h.a();
          localh1.a("11556");
          localh1.h();
          localh1.b(((ap)c.a(ap.class)).e());
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = localh1.g();
          bp.b("User id: %s", arrayOfObject1);
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = localh1.f();
          bp.b("Site id: %s", arrayOfObject2);
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = localh1.e();
          bp.b("Avertiser id: %s", arrayOfObject3);
          if ("com.spotify.mobile.android.service.mat.application.init".equals(str1))
          {
            boolean bool = paramIntent.getBooleanExtra("installation_id_new", false);
            h localh2 = h.a();
            if (!bool)
              localh2.a(true);
            localh2.c();
            return;
          }
        }
        catch (Exception localException)
        {
          Assertion.a(localException);
          return;
        }
        if ("com.spotify.mobile.android.service.mat.existing.user".equals(str1))
        {
          h.a().a(true);
          return;
        }
        if (!"com.spotify.mobile.android.service.mat.user.created".equals(str1))
          break;
        this.d = cw.a(this);
        str4 = this.d.a(b, "");
      }
      while (TextUtils.isEmpty(str4));
      h.a().a(false);
      b localb = new b("referrer", this.d.a(a, ""), "", "", "", "");
      String str5;
      if (str4.equals("fb"))
      {
        str5 = "323920558";
        if (!TextUtils.isEmpty(str5))
          break label381;
        Assertion.b("Expected a non-empty event string for tracking");
      }
      while (true)
      {
        cw localcw = this.d;
        cy localcy = b;
        localcw.a().a(localcy).a();
        return;
        if (str4.equals("email"))
        {
          str5 = "323910306";
          break;
        }
        Assertion.a("Expected one of ACCOUNT_CREATION_SOURCE_FB or ACCOUNT_CREATION_SOURCE_EMAIL. Is the ACCOUNT_CREATION_SOURCE_PREF not set properly?");
        str5 = "";
        break;
        h.a().a(str5, localb);
      }
      if ("com.spotify.mobile.android.service.mat.facebook".equals(str1))
      {
        a("fb");
        return;
      }
      if ("com.spotify.mobile.android.service.mat.email".equals(str1))
      {
        a("email");
        return;
      }
      if (!"com.spotify.mobile.android.service.mat.install.referrer".equals(str1))
        break;
      if (paramIntent.getExtras() == null)
      {
        Assertion.b("Intent's extras is null");
        return;
      }
      if (!paramIntent.hasExtra("referrer"))
      {
        Assertion.b("Intent has no referrer extra");
        return;
      }
      str2 = paramIntent.getStringExtra("referrer");
    }
    while (str2 == null);
    this.d = cw.a(this);
    this.d.b(a, str2);
    String str3 = "https://r.spotify.com/" + Uri.decode(str2);
    if (new SpotifyLink(str3).g())
    {
      Intent localIntent = new Intent(this, Launcher.class);
      localIntent.setAction("android.intent.action.VIEW");
      localIntent.setData(Uri.parse(str3));
      localIntent.setFlags(268435456);
      startActivity(localIntent);
      return;
    }
    new Tracker().onReceive(this, paramIntent);
    return;
    Assertion.a("Action not supported: " + str1);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.mobileapptracker.MobileAppTrackerIntentService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
