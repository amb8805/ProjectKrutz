package com.spotify.mobile.android.util.tracking;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TrackingService extends Service
{
  private List<b> a = new LinkedList();
  private e b;

  public TrackingService()
  {
  }

  public static void a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    Intent localIntent = new Intent(paramContext, TrackingService.class);
    localIntent.putExtra("EXTRA_TYPE", paramString1);
    localIntent.putExtra("EXTRA_EVENT", paramString2);
    localIntent.putExtra("EXTRA_ARGS", paramBundle);
    paramContext.startService(localIntent);
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    this.b = new e(this);
    this.a.add(new f(this));
    this.a.add(new a(this));
  }

  public void onDestroy()
  {
    super.onDestroy();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).a();
    bp.b("Successfully stopped service.", new Object[0]);
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    String str1 = paramIntent.getStringExtra("EXTRA_TYPE");
    String str2 = paramIntent.getStringExtra("EXTRA_EVENT");
    Bundle localBundle = (Bundle)paramIntent.getParcelableExtra("EXTRA_ARGS");
    cc.a(str1, "Tracked view id must not be null");
    bp.b("Received %s event of type %s. Args: %s", new Object[] { str2, str1, localBundle });
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).a(str1, str2, localBundle);
    this.b.removeMessages(0);
    this.b.sendEmptyMessageDelayed(0, 60000L);
    return 2;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.tracking.TrackingService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
