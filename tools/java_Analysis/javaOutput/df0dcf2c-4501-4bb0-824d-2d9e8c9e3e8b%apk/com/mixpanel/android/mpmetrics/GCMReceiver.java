package com.mixpanel.android.mpmetrics;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;

public class GCMReceiver extends BroadcastReceiver
{
  String a = "MPGCMReceiver";

  public GCMReceiver()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str1 = paramIntent.getAction();
    String str3;
    if ("com.google.android.c2dm.intent.REGISTRATION".equals(str1))
    {
      str3 = paramIntent.getStringExtra("registration_id");
      if (paramIntent.getStringExtra("error") != null)
        Log.e(this.a, "Error when registering for GCM: " + paramIntent.getStringExtra("error"));
    }
    String str2;
    do
    {
      do
      {
        do
        {
          return;
          if (str3 != null)
          {
            l.a(new GCMReceiver.1(this, str3));
            return;
          }
        }
        while (paramIntent.getStringExtra("unregistered") == null);
        l.a(new GCMReceiver.2(this));
        return;
      }
      while (!"com.google.android.c2dm.intent.RECEIVE".equals(str1));
      str2 = paramIntent.getExtras().getString("mp_message");
    }
    while (str2 == null);
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = localPackageManager.getLaunchIntentForPackage(paramContext.getPackageName());
    Object localObject1 = "";
    try
    {
      ApplicationInfo localApplicationInfo = localPackageManager.getApplicationInfo(paramContext.getPackageName(), 0);
      localObject1 = localPackageManager.getApplicationLabel(localApplicationInfo);
      int j = localApplicationInfo.icon;
      localObject2 = localObject1;
      i = j;
      localPendingIntent = PendingIntent.getActivity(paramContext.getApplicationContext(), 0, localIntent, 134217728);
      if (Build.VERSION.SDK_INT < 11)
      {
        NotificationManager localNotificationManager2 = (NotificationManager)paramContext.getSystemService("notification");
        Notification localNotification2 = new Notification(i, str2, System.currentTimeMillis());
        localNotification2.flags = (0x10 | localNotification2.flags);
        localNotification2.setLatestEventInfo(paramContext, localObject2, str2, localPendingIntent);
        localNotificationManager2.notify(0, localNotification2);
        return;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Object localObject2;
      int i;
      PendingIntent localPendingIntent;
      while (true)
      {
        localObject2 = localObject1;
        i = 17301651;
      }
      localNotificationManager1 = (NotificationManager)paramContext.getSystemService("notification");
      localBuilder = new Notification.Builder(paramContext).setSmallIcon(i).setTicker(str2).setWhen(System.currentTimeMillis()).setContentTitle(localObject2).setContentText(str2).setContentIntent(localPendingIntent);
      if (Build.VERSION.SDK_INT >= 16);
    }
    NotificationManager localNotificationManager1;
    Notification.Builder localBuilder;
    for (Notification localNotification1 = localBuilder.getNotification(); ; localNotification1 = localBuilder.build())
    {
      localNotification1.flags = (0x10 | localNotification1.flags);
      localNotificationManager1.notify(0, localNotification1);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.GCMReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
