package android.support.v4.app;

import android.app.Notification;

final class ad
  implements ac
{
  ad()
  {
  }

  public final Notification a(aa paramaa)
  {
    Notification localNotification = paramaa.r;
    localNotification.setLatestEventInfo(paramaa.a, paramaa.b, paramaa.c, paramaa.d);
    if (paramaa.j > 0)
      localNotification.flags = (0x80 | localNotification.flags);
    return localNotification;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.ad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
