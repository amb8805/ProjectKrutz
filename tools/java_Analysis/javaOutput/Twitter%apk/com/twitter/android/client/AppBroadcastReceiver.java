package com.twitter.android.client;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;

public class AppBroadcastReceiver extends BroadcastReceiver
{
  private static final HashMap a;

  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("com.twitter.android.poll.data", Integer.valueOf(1));
    a.put("com.twitter.android.widget.button.next", Integer.valueOf(2));
    a.put("com.twitter.android.widget.button.prev", Integer.valueOf(3));
  }

  public AppBroadcastReceiver()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    g localg = g.a(paramContext);
    Integer localInteger;
    if (localg.h())
    {
      String str = paramIntent.getAction();
      localInteger = (Integer)a.get(str);
      if (localInteger == null)
        break label73;
    }
    label73: for (int i = localInteger.intValue(); ; i = 0)
      switch (i)
      {
      default:
        return;
      case 1:
      case 2:
      case 3:
      }
    localg.a(paramIntent);
    return;
    localg.c(paramIntent);
    return;
    localg.d(paramIntent);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.client.AppBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
