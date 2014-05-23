package com.spotify.mobile.android.ui.actions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.ui.activity.ShareActivity;
import com.spotify.mobile.android.ui.activity.upsell.PremiumSignupActivity;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.bj;
import com.spotify.mobile.android.util.cc;

public class a
  implements com.spotify.mobile.android.c.a
{
  public a()
  {
  }

  public static Intent a(Context paramContext, String paramString1, String paramString2, ClientEvent paramClientEvent)
  {
    Intent localIntent = SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.session.LOG_EVENT");
    localIntent.putExtra("uri", paramString1);
    localIntent.putExtra("context", paramString2);
    localIntent.putExtra("event", paramClientEvent.a());
    localIntent.putExtra("event_version", paramClientEvent.b());
    localIntent.putExtra("test_version", paramClientEvent.d());
    localIntent.putExtra("data", paramClientEvent.c());
    return localIntent;
  }

  public static void a(Context paramContext)
  {
    paramContext.startService(SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.session.ERASE_OFFLINE_USER"));
  }

  public static void a(Context paramContext, Uri paramUri, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString)
  {
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.c);
    if (paramString != null)
      localClientEvent.a("reason", paramString);
    a(paramContext, paramVerified, paramSubView, localClientEvent);
    paramContext.startActivity(PremiumSignupActivity.a(paramContext, paramUri));
  }

  public static void a(Context paramContext, ViewUri.Verified paramVerified, long paramLong)
  {
    Intent localIntent = SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.session.LOG_VIEW");
    localIntent.putExtra("uri", paramVerified.toString());
    localIntent.putExtra("duration", paramLong);
    paramContext.startService(localIntent);
  }

  public static void a(Context paramContext, ViewUri.Verified paramVerified, ClientEvent paramClientEvent)
  {
    a(paramContext, paramVerified, ViewUri.SubView.a, paramClientEvent);
  }

  public static void a(Context paramContext, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView)
  {
    a(paramContext, null, paramVerified, paramSubView, null);
  }

  public static void a(Context paramContext, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, ClientEvent paramClientEvent)
  {
    paramContext.startService(b(paramContext, paramVerified, paramSubView, paramClientEvent));
  }

  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    Intent localIntent = SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.log.REFERRAL");
    localIntent.putExtra("referrer", paramString1);
    localIntent.putExtra("deviceid", paramString2);
    paramContext.startService(localIntent);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent1 = new Intent("android.intent.action.SEND");
    localIntent1.setType("text/plain");
    localIntent1.putExtra("android.intent.extra.SUBJECT", paramString1);
    localIntent1.putExtra("android.intent.extra.TEXT", new SpotifyLink(paramString3).e());
    localIntent1.addFlags(524288);
    Intent localIntent2 = new Intent(paramContext, ShareActivity.class);
    localIntent2.addFlags(1073741824);
    localIntent2.putExtra("title", paramString1);
    localIntent2.putExtra("subtitle", paramString2);
    localIntent2.putExtra("android.intent.extra.INTENT", localIntent1);
    paramContext.startActivity(localIntent2);
  }

  public static void a(ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, ClientEvent paramClientEvent)
  {
    bj.a(paramVerified, paramSubView, paramClientEvent);
  }

  public static Intent b(Context paramContext, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, ClientEvent paramClientEvent)
  {
    return a(paramContext, paramVerified.toString(), paramSubView.toString(), paramClientEvent);
  }

  public static void b(Context paramContext)
  {
    cc.a(paramContext, "Don't call PlayerActions.reportAdUrlClicked with a null context");
    paramContext.startService(SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.session.REPORT_AD_URL_CLICKED"));
  }

  public static void b(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.session.SEND_TO_INBOX");
    localIntent.setData(Uri.parse(paramString3));
    localIntent.putExtra("username", paramString1);
    localIntent.putExtra("message", paramString2);
    paramContext.startService(localIntent);
  }

  public final void a(Context paramContext, ViewUri.Verified paramVerified, ClientEvent.SubEvent paramSubEvent)
  {
    a(paramContext, paramVerified, new ClientEvent(ClientEvent.Event.d, paramSubEvent));
    paramContext.startService(SpotifyService.a(paramContext, "com.spotify.mobile.android.service.action.session.LOGOUT"));
    new Thread(new a.1(this, paramContext)).start();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.actions.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
