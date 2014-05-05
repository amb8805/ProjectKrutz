package com.twitter.android.client;

import android.accounts.Account;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.twitter.android.platform.C2DMService;
import com.twitter.android.platform.TwitterDataSyncService;
import com.twitter.android.platform.d;
import java.util.HashMap;

public class AppService extends Service
{
  private static final HashMap a;

  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("com.twitter.android.poll.alarm", Integer.valueOf(1));
  }

  public AppService()
  {
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    Integer localInteger = (Integer)a.get(paramIntent.getAction());
    int i;
    if (localInteger != null)
    {
      i = localInteger.intValue();
      switch (i)
      {
      default:
      case 1:
      }
    }
    while (true)
    {
      stopSelf(paramInt2);
      return 3;
      i = 0;
      break;
      Bundle localBundle = new Bundle();
      if (C2DMService.a)
        localBundle.putBoolean("messages", false);
      Account localAccount = d.a(this, paramIntent.getStringExtra("account_name"));
      if (localAccount != null)
        TwitterDataSyncService.a(this, localBundle, false, localAccount);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.client.AppService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
