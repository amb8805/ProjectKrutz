package com.spotify.mobile.android.ui.widget;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.d;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;

public class SpotifyWidget extends AppWidgetProvider
{
  public SpotifyWidget()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str1;
    b localb;
    if (paramIntent != null)
    {
      str1 = paramIntent.getAction();
      c.a(d.class);
      c.a(com.spotify.mobile.android.ui.actions.a.class);
      localb = new b();
      if (!"android.appwidget.action.APPWIDGET_UPDATE".equals(str1))
        break label63;
      localb.a(paramContext, paramIntent);
    }
    label63: 
    do
    {
      while ("com.spotify.mobile.android.ui.widget.PREVIOUS".equals(str1))
      {
        d.b(paramContext, false);
        return;
        if ("android.appwidget.action.APPWIDGET_ENABLED".equals(str1))
          localb.a(paramContext);
      }
      if ("com.spotify.mobile.android.ui.widget.PLAY".equals(str1))
      {
        d.c(paramContext);
        return;
      }
    }
    while (!"com.spotify.mobile.android.ui.widget.NEXT".equals(str1));
    boolean bool = paramIntent.getBooleanExtra("is_suggested_track", false);
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.U, ClientEvent.SubEvent.ak);
    if (bool);
    for (String str2 = "true"; ; str2 = "false")
    {
      localClientEvent.a("suggested_track", str2);
      com.spotify.mobile.android.ui.actions.a.a(paramContext, ViewUri.w, localClientEvent);
      d.d(paramContext);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.widget.SpotifyWidget
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
