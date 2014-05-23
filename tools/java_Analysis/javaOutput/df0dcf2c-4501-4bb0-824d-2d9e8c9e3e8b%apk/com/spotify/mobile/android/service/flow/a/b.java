package com.spotify.mobile.android.service.flow.a;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.mobileapptracker.MobileAppTrackerIntentService;
import com.spotify.mobile.android.provider.w;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ap;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.cd;

final class b
{
  private final com.spotify.mobile.android.ui.actions.a a = (com.spotify.mobile.android.ui.actions.a)c.a(com.spotify.mobile.android.ui.actions.a.class);
  private final com.spotify.mobile.android.util.b.a b = (com.spotify.mobile.android.util.b.a)c.a(com.spotify.mobile.android.util.b.a.class);
  private final Context c;
  private final Intent d;
  private int e;

  b(Context paramContext, Intent paramIntent)
  {
    this.c = paramContext;
    this.d = paramIntent;
  }

  private static void a(ClientEvent paramClientEvent, int paramInt)
  {
    switch (paramInt)
    {
    default:
      Assertion.a("unsupported account type: " + paramInt);
      return;
    case 1:
      paramClientEvent.a("account-type", "facebook");
      return;
    case 0:
      paramClientEvent.a("account-type", "spotify");
      return;
    case -1:
    }
    paramClientEvent.a("account-type", "unknown");
  }

  private void a(String paramString1, String paramString2)
  {
    cc.a(paramString1, "referralCode must be set");
    ContentValues localContentValues = new ContentValues();
    if ((paramString2 != null) && (!paramString2.isEmpty()))
      localContentValues.put("created_by_partner", paramString2);
    localContentValues.put("referral", paramString1);
    this.c.getContentResolver().update(w.a, localContentValues, null, null);
  }

  final void a()
  {
    com.spotify.mobile.android.ui.actions.a.a(this.c, "", ((ap)c.a(ap.class)).e());
    cd localcd = new cd();
    if (localcd.c())
      a(localcd.b(), localcd.a());
    Intent localIntent = MobileAppTrackerIntentService.a(this.c, "com.spotify.mobile.android.service.mat.user.created");
    this.c.startService(localIntent);
    if (this.d != null)
    {
      ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.al, ClientEvent.SubEvent.aQ);
      a(localClientEvent, this.e);
      this.b.a(this.c, this.d, localClientEvent);
    }
  }

  final void a(int paramInt)
  {
    com.spotify.mobile.android.ui.actions.a.a(this.c, "", ((ap)c.a(ap.class)).e());
    cd localcd = new cd();
    if (localcd.c())
    {
      String str = localcd.b();
      cc.a(str, "referralCode must be set");
      a(str, null);
    }
    Intent localIntent = MobileAppTrackerIntentService.a(this.c, "com.spotify.mobile.android.service.mat.existing.user");
    this.c.startService(localIntent);
    if (this.d != null)
    {
      ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.al, ClientEvent.SubEvent.aP);
      a(localClientEvent, paramInt);
      this.b.a(this.c, this.d, localClientEvent);
    }
  }

  final void b(int paramInt)
  {
    this.e = paramInt;
    String str;
    if (paramInt == 1)
      str = "com.spotify.mobile.android.service.mat.facebook";
    while (true)
    {
      if (str != null)
      {
        Intent localIntent = MobileAppTrackerIntentService.a(this.c, str);
        this.c.startService(localIntent);
      }
      return;
      str = null;
      if (paramInt == 0)
        str = "com.spotify.mobile.android.service.mat.email";
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
