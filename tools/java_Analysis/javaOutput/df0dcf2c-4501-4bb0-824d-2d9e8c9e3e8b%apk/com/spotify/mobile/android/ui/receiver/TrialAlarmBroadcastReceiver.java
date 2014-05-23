package com.spotify.mobile.android.ui.receiver;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.aa;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.util.cc;

public class TrialAlarmBroadcastReceiver extends BroadcastReceiver
{
  public TrialAlarmBroadcastReceiver()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Resources localResources1 = ((Context)cc.a(paramContext)).getResources();
    PendingIntent localPendingIntent = PendingIntent.getActivity(paramContext, 1337, new Intent(paramContext, MainActivity.class).addFlags(268435456), 268435456);
    aa localaa1 = new aa(paramContext);
    aa localaa2 = localaa1.a(paramContext.getString(2131690084));
    Resources localResources2 = paramContext.getResources();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(24);
    localaa2.b(localResources2.getQuantityString(2131623951, 24, arrayOfObject)).a(localPendingIntent).a().c(paramContext.getString(2131690083)).a(System.currentTimeMillis()).d().a(localResources1.getColor(2131296456), localResources1.getInteger(2131558424), localResources1.getInteger(2131558423));
    ((NotificationManager)paramContext.getSystemService("notification")).notify(0, localaa1.g());
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.receiver.TrialAlarmBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
