package com.spotify.mobile.android.service.gcm;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;
import com.spotify.mobile.android.util.ViewUri;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public final class d
{
  public static e a(Uri paramUri)
  {
    e locale = new e();
    locale.b = paramUri;
    String str1 = paramUri.getScheme();
    boolean bool2;
    Uri.Builder localBuilder;
    label140: NameValuePair localNameValuePair;
    String str3;
    if (!"http".equals(str1))
    {
      boolean bool4 = "https".equals(str1);
      bool2 = false;
      if (!bool4)
      {
        locale.a = bool2;
        if ((!paramUri.isHierarchical()) || (paramUri.getQueryParameter("sp_req_login_token") == null))
          break label289;
        locale.a = true;
        Uri localUri = locale.b;
        localBuilder = new Uri.Builder();
        localBuilder.scheme(localUri.getScheme()).authority(localUri.getAuthority()).path(localUri.getPath()).fragment(localUri.getFragment());
        Iterator localIterator = URLEncodedUtils.parse(URI.create(localUri.toString()), "UTF-8").iterator();
        do
        {
          if (!localIterator.hasNext())
            break;
          localNameValuePair = (NameValuePair)localIterator.next();
        }
        while (localNameValuePair.getName().equals("sp_req_login_token"));
        str3 = localNameValuePair.getName();
        if (localNameValuePair.getValue() != null)
          break label268;
      }
    }
    label268: for (String str4 = ""; ; str4 = localNameValuePair.getValue())
    {
      localBuilder.appendQueryParameter(str3, str4);
      break label140;
      String str2 = paramUri.getHost();
      if (!"spotify.com".equals(str2))
      {
        boolean bool3 = "www.spotify.com".equals(str2);
        bool2 = false;
        if (!bool3)
          break;
      }
      boolean bool1 = paramUri.toString().contains("notoken");
      bool2 = false;
      if (bool1)
        break;
      bool2 = true;
      break;
    }
    locale.b = localBuilder.build();
    label289: return locale;
  }

  public static void a(Service paramService, Uri paramUri, String paramString)
  {
    Intent localIntent;
    if (paramUri != null)
      if (new SpotifyLink(paramUri.toString()).a() != SpotifyLink.LinkType.D)
        localIntent = MainActivity.a(paramService, paramUri.toString());
    while (true)
    {
      if (localIntent != null)
      {
        localIntent.addFlags(268435456);
        paramService.startActivity(localIntent);
      }
      ClientEvent localClientEvent = GcmBroadcastReceiver.a(ClientEvent.Event.S, paramString);
      c.a(a.class);
      a.a(paramService, ViewUri.aL, localClientEvent);
      return;
      e locale = a(paramUri);
      Uri localUri = locale.b;
      if (locale.a)
      {
        new f(paramService, localUri);
        localIntent = null;
      }
      else
      {
        localIntent = new Intent("android.intent.action.VIEW", localUri);
        continue;
        localIntent = new Intent(paramService, MainActivity.class);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.gcm.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
