package com.twitter.android.platform;

import android.accounts.Account;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.preference.PreferenceManager;
import com.twitter.android.service.TwitterService;

public class TwitterDataSyncService extends Service
{
  private static final Object a = new Object();
  private static o b = null;

  public TwitterDataSyncService()
  {
  }

  public static void a(Context paramContext, Bundle paramBundle, boolean paramBoolean, Account paramAccount)
  {
    if ((ContentResolver.getMasterSyncAutomatically()) && (ContentResolver.getIsSyncable(paramAccount, "com.twitter.android.provider.TwitterProvider") > 0) && (ContentResolver.getSyncAutomatically(paramAccount, "com.twitter.android.provider.TwitterProvider")))
      ContentResolver.requestSync(paramAccount, "com.twitter.android.provider.TwitterProvider", paramBundle);
    while (!paramBoolean)
      return;
    paramContext.startService(new Intent(paramContext, TwitterService.class).setAction("REFRESH").putExtra("account", paramAccount).putExtra("_data", paramBundle));
  }

  public static boolean a(Context paramContext)
  {
    return 60000L + b(paramContext) < System.currentTimeMillis();
  }

  public static long b(Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("last_sync", 0L);
  }

  public IBinder onBind(Intent paramIntent)
  {
    return b.getSyncAdapterBinder();
  }

  public void onCreate()
  {
    synchronized (a)
    {
      if (b == null)
        b = new o(getApplicationContext());
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.TwitterDataSyncService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
