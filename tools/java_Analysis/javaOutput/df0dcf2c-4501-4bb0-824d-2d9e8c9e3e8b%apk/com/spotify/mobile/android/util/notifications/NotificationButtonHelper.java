package com.spotify.mobile.android.util.notifications;

import android.widget.RemoteViews;
import com.spotify.mobile.android.util.Assertion;

public final class NotificationButtonHelper
{
  private int a;
  private int b;
  private int c;

  public NotificationButtonHelper(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = 0;
  }

  public NotificationButtonHelper(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }

  public final void a(RemoteViews paramRemoteViews, NotificationButtonHelper.Visibility paramVisibility)
  {
    switch (NotificationButtonHelper.1.a[paramVisibility.ordinal()])
    {
    default:
      Assertion.a("Invalid NotificationButtonHelper visibility");
    case 1:
    case 2:
    case 3:
    }
    do
    {
      do
      {
        do
        {
          return;
          paramRemoteViews.setViewVisibility(this.a, 0);
          paramRemoteViews.setViewVisibility(this.b, 8);
        }
        while (this.c <= 0);
        paramRemoteViews.setViewVisibility(this.c, 8);
        return;
        paramRemoteViews.setViewVisibility(this.a, 8);
        paramRemoteViews.setViewVisibility(this.b, 0);
      }
      while (this.c <= 0);
      paramRemoteViews.setViewVisibility(this.c, 8);
      return;
    }
    while (this.c <= 0);
    paramRemoteViews.setViewVisibility(this.a, 8);
    paramRemoteViews.setViewVisibility(this.b, 8);
    paramRemoteViews.setViewVisibility(this.c, 0);
  }

  public final void a(RemoteViews paramRemoteViews, boolean paramBoolean)
  {
    if (paramBoolean);
    for (NotificationButtonHelper.Visibility localVisibility = NotificationButtonHelper.Visibility.a; ; localVisibility = NotificationButtonHelper.Visibility.b)
    {
      a(paramRemoteViews, localVisibility);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.notifications.NotificationButtonHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
