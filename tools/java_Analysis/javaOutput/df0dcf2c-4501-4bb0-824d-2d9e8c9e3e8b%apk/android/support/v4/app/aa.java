package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class aa
{
  Context a;
  CharSequence b;
  CharSequence c;
  PendingIntent d;
  PendingIntent e;
  RemoteViews f;
  Bitmap g;
  CharSequence h;
  int i;
  int j;
  boolean k;
  ah l;
  CharSequence m;
  int n;
  int o;
  boolean p;
  ArrayList<x> q = new ArrayList();
  Notification r = new Notification();

  public aa(Context paramContext)
  {
    this.a = paramContext;
    this.r.when = System.currentTimeMillis();
    this.r.audioStreamType = -1;
    this.j = 0;
  }

  private void a(int paramInt)
  {
    Notification localNotification = this.r;
    localNotification.flags = (paramInt | localNotification.flags);
  }

  public final aa a()
  {
    this.r.icon = 2130838051;
    return this;
  }

  public final aa a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = 1;
    this.r.ledARGB = paramInt1;
    this.r.ledOnMS = paramInt2;
    this.r.ledOffMS = paramInt3;
    int i2;
    Notification localNotification;
    int i3;
    if ((this.r.ledOnMS != 0) && (this.r.ledOffMS != 0))
    {
      i2 = i1;
      localNotification = this.r;
      i3 = 0xFFFFFFFE & this.r.flags;
      if (i2 == 0)
        break label92;
    }
    while (true)
    {
      localNotification.flags = (i3 | i1);
      return this;
      i2 = 0;
      break;
      label92: i1 = 0;
    }
  }

  public final aa a(long paramLong)
  {
    this.r.when = paramLong;
    return this;
  }

  public final aa a(PendingIntent paramPendingIntent)
  {
    this.d = paramPendingIntent;
    return this;
  }

  public final aa a(ah paramah)
  {
    if (this.l != paramah)
    {
      this.l = paramah;
      if (this.l != null)
      {
        ah localah = this.l;
        if (localah.d != this)
        {
          localah.d = this;
          if (localah.d != null)
            localah.d.a(localah);
        }
      }
    }
    return this;
  }

  public final aa a(CharSequence paramCharSequence)
  {
    this.b = paramCharSequence;
    return this;
  }

  public final aa b()
  {
    a(2);
    return this;
  }

  public final aa b(PendingIntent paramPendingIntent)
  {
    this.r.deleteIntent = paramPendingIntent;
    return this;
  }

  public final aa b(CharSequence paramCharSequence)
  {
    this.c = paramCharSequence;
    return this;
  }

  public final aa c()
  {
    a(8);
    return this;
  }

  public final aa c(CharSequence paramCharSequence)
  {
    this.r.tickerText = paramCharSequence;
    return this;
  }

  public final aa d()
  {
    a(16);
    return this;
  }

  public final aa e()
  {
    this.r.defaults = -1;
    Notification localNotification = this.r;
    localNotification.flags = (0x1 | localNotification.flags);
    return this;
  }

  public final aa f()
  {
    this.j = 0;
    return this;
  }

  @Deprecated
  public final Notification g()
  {
    return w.a().a(this);
  }

  public final Notification h()
  {
    return w.a().a(this);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
