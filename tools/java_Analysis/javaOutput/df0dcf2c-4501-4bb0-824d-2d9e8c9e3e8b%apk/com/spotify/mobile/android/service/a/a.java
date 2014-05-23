package com.spotify.mobile.android.service.a;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.util.SparseArray;

public final class a
{
  private Service a;
  private SparseArray<Notification> b = new SparseArray();
  private int c = -1;
  private final NotificationManager d;

  public a(Service paramService)
  {
    this.a = paramService;
    this.d = ((NotificationManager)paramService.getSystemService("notification"));
  }

  private void b(int paramInt, Notification paramNotification)
  {
    this.a.startForeground(paramInt, paramNotification);
    this.c = paramInt;
  }

  public final void a(int paramInt)
  {
    try
    {
      this.b.remove(paramInt);
      if (this.c == paramInt)
      {
        this.a.stopForeground(true);
        this.c = -1;
        if (this.b.size() > 0)
        {
          int i = this.b.keyAt(0);
          Notification localNotification = (Notification)this.b.get(i);
          this.d.cancel(i);
          b(i, localNotification);
        }
      }
      while (true)
      {
        return;
        this.d.cancel(paramInt);
      }
    }
    finally
    {
    }
  }

  public final void a(int paramInt, Notification paramNotification)
  {
    try
    {
      if (this.c == -1)
        b(paramInt, paramNotification);
      while (true)
      {
        this.b.put(paramInt, paramNotification);
        return;
        this.d.notify(paramInt, paramNotification);
      }
    }
    finally
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
