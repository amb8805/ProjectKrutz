package com.spotify.mobile.android.service.gcm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v4.app.z;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.bp;

public class GcmBroadcastReceiver extends BroadcastReceiver
{
  public GcmBroadcastReceiver()
  {
  }

  private static com.spotify.mobile.android.ui.actions.a a()
  {
    return (com.spotify.mobile.android.ui.actions.a)c.a(com.spotify.mobile.android.ui.actions.a.class);
  }

  static ClientEvent a(ClientEvent.Event paramEvent, String paramString)
  {
    ClientEvent localClientEvent = new ClientEvent(paramEvent);
    if (paramString != null);
    while (true)
    {
      localClientEvent.a("tag", paramString);
      return localClientEvent;
      paramString = "";
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    com.google.android.gms.a.a.a(paramContext);
    Object localObject;
    Bundle localBundle;
    String str1;
    if (!"com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction()))
    {
      localObject = null;
      localBundle = paramIntent.getExtras();
      if (!"gcm".equals(localObject))
        break label561;
      if (!"notification".equals(localBundle.getString("type")))
        break label544;
      bp.a("Got notification: %s", new Object[] { localBundle });
      str1 = localBundle.getString("title");
      if (str1 != null)
        break label664;
    }
    label664: for (String str2 = ""; ; str2 = str1)
    {
      String str3 = localBundle.getString("message");
      if (str3 == null);
      for (String str4 = ""; ; str4 = str3)
      {
        String str5 = localBundle.getString("uri");
        if (str5 == null);
        for (String str6 = ""; ; str6 = str5)
        {
          try
          {
            String str9 = localBundle.getString("prio");
            if (str9 != null)
            {
              m = Integer.parseInt(str9);
              n = m;
              i = n;
              bool = "true".equals(localBundle.getString("sales"));
              str7 = localBundle.getString("tag");
              if (str7 == null)
              {
                str8 = "";
                if ((bool) && (!((ClientInfo)c.a(ClientInfo.class)).d()))
                {
                  a();
                  com.spotify.mobile.android.ui.actions.a.a(paramContext, ViewUri.aL, a(ClientEvent.Event.o, str8));
                  bp.d("Don't show notification since it's marked as sales and we're not allowed to show those on this device.", new Object[0]);
                  setResultCode(-1);
                  return;
                  localObject = paramIntent.getStringExtra("message_type");
                  if (localObject != null)
                    break;
                  localObject = "gcm";
                }
              }
            }
          }
          catch (NumberFormatException localNumberFormatException)
          {
            while (true)
              i = -1;
            localaa = new aa(paramContext);
            localaa.a(str2).b(str4).a(new z().a(str4)).a().a(System.currentTimeMillis()).d();
            localIntent = new Intent(paramContext, SpotifyService.class);
            localIntent.setAction("com.spotify.mobile.android.service.action.push_notification.OPEN");
            localUri = null;
            if (str6 != null)
            {
              k = str6.length();
              localUri = null;
              if (k != 0)
                break label506;
            }
          }
          while (true)
          {
            int m;
            int n;
            int i;
            boolean bool;
            String str7;
            String str8;
            aa localaa;
            Intent localIntent;
            Uri localUri;
            int k;
            label354: localIntent.setData(localUri);
            localIntent.putExtra("tag", str8);
            localaa.a(PendingIntent.getService(paramContext, 0, localIntent, 0));
            ClientEvent localClientEvent = a(ClientEvent.Event.g, str8);
            a();
            localaa.b(PendingIntent.getService(paramContext, 0, com.spotify.mobile.android.ui.actions.a.b(paramContext, ViewUri.aL, ViewUri.SubView.a, localClientEvent), 0));
            NotificationManager localNotificationManager = (NotificationManager)paramContext.getSystemService("notification");
            int j;
            switch (i)
            {
            default:
              j = 11;
            case 1:
            case 2:
            case 3:
            case 4:
            }
            while (true)
            {
              localNotificationManager.notify(j, localaa.h());
              a();
              com.spotify.mobile.android.ui.actions.a.a(paramContext, ViewUri.aL, a(ClientEvent.Event.f, str8));
              break;
              label506: localUri = Uri.parse(str6);
              break label354;
              j = 7;
              continue;
              j = 8;
              continue;
              j = 9;
              continue;
              j = 10;
            }
            label544: bp.d("Received message with unknown type: %s", new Object[] { localBundle });
            continue;
            label561: if ("send_error".equals(localObject))
            {
              bp.d("Send error: %s", new Object[] { localBundle });
            }
            else if ("deleted_messages".equals(localObject))
            {
              bp.d("Deleted on server: %s", new Object[] { localBundle });
            }
            else
            {
              bp.a("Received unknown gcm type: %s, extras: %s", new Object[] { localObject, localBundle });
              continue;
              str8 = str7;
              continue;
              n = -1;
            }
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.gcm.GcmBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
