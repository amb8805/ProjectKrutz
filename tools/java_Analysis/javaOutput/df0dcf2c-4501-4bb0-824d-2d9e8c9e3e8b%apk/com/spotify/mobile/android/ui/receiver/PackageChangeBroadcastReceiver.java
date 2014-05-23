package com.spotify.mobile.android.ui.receiver;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v4.app.aa;
import android.support.v4.app.y;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;
import com.spotify.mobile.android.util.ac;

public class PackageChangeBroadcastReceiver extends BroadcastReceiver
{
  public PackageChangeBroadcastReceiver()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool1 = true;
    boolean bool2;
    if (ac.b)
    {
      bool2 = paramIntent.getBooleanExtra("android.intent.extra.REPLACING", false);
      bool1 = paramContext.getPackageName().equals(paramIntent.getData().getSchemeSpecificPart());
    }
    while (true)
    {
      if ((bool2) && (bool1))
      {
        Resources localResources = paramContext.getResources();
        NotificationManager localNotificationManager = (NotificationManager)paramContext.getSystemService("notification");
        String str1 = localResources.getString(2131690369);
        String str2 = localResources.getString(2131690368);
        Bitmap localBitmap = BitmapFactory.decodeResource(localResources, 2130838179);
        Uri localUri = Uri.parse("spotify:");
        Intent localIntent = new Intent(paramContext, MainActivity.class);
        if (new SpotifyLink(localUri.toString()).a() != SpotifyLink.LinkType.D)
          localIntent = MainActivity.a(paramContext, localUri.toString());
        localIntent.addFlags(268435456);
        localIntent.putExtra("notification_id", 0);
        PendingIntent localPendingIntent = PendingIntent.getActivity(paramContext, 0, localIntent, 0);
        aa localaa = new aa(paramContext);
        localaa.a(new y().a(localBitmap).a(str2)).a(str1).b(str2).d().a().c(str1 + " - " + str2).a(localPendingIntent).e();
        localNotificationManager.notify(0, localaa.h());
      }
      return;
      bool2 = bool1;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.receiver.PackageChangeBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
