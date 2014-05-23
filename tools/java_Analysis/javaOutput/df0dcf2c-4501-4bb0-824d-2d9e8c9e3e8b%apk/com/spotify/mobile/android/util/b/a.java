package com.spotify.mobile.android.util.b;

import android.content.Context;
import android.content.Intent;
import com.mixpanel.android.mpmetrics.l;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ap;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class a
  implements com.spotify.mobile.android.c.a
{
  private b a = new a.1(this);
  private b b = new a.2(this);

  public a()
  {
  }

  private void a(Context paramContext, SpotifyLink paramSpotifyLink, ClientEvent paramClientEvent, boolean paramBoolean)
  {
    cc.a(paramSpotifyLink);
    if (!paramSpotifyLink.g())
    {
      Assertion.b("link is not tracked: " + paramSpotifyLink.toString());
      return;
    }
    paramClientEvent.a("device-id", ((ap)c.a(ap.class)).e());
    paramClientEvent.a("tracking-id", paramSpotifyLink.f());
    if (paramBoolean)
      this.a.a(paramContext, paramClientEvent);
    while (true)
    {
      a(paramContext, paramSpotifyLink.f(), paramClientEvent);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramClientEvent.b();
      arrayOfObject[1] = paramSpotifyLink.toString();
      bp.b("Link tracking type %s, link %s", arrayOfObject);
      return;
      this.b.a(paramContext, paramClientEvent);
    }
  }

  private static void a(Context paramContext, String paramString, ClientEvent paramClientEvent)
  {
    l locall = l.a(paramContext, "6220470886a584968d7466d2d0953005");
    locall.a(paramString);
    JSONObject localJSONObject;
    try
    {
      localJSONObject = new JSONObject();
      HashMap localHashMap = paramClientEvent.c();
      Iterator localIterator = localHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!"tracking-id".equals(str))
          localJSONObject.put(str, localHashMap.get(str));
      }
    }
    catch (JSONException localJSONException)
    {
      Assertion.a("Exception while building tracking request", localJSONException);
      return;
    }
    locall.a(paramClientEvent.b(), localJSONObject);
  }

  public final void a(Context paramContext, Intent paramIntent, ClientEvent paramClientEvent)
  {
    if (!"android.intent.action.VIEW".equals(paramIntent.getAction()));
    SpotifyLink localSpotifyLink;
    do
    {
      String str;
      do
      {
        return;
        str = paramIntent.getDataString();
      }
      while (str == null);
      localSpotifyLink = new SpotifyLink(str);
    }
    while (!localSpotifyLink.g());
    a(paramContext, localSpotifyLink, paramClientEvent, false);
  }

  public final void a(Context paramContext, SpotifyLink paramSpotifyLink, ClientEvent paramClientEvent)
  {
    a(paramContext, paramSpotifyLink, paramClientEvent, true);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
