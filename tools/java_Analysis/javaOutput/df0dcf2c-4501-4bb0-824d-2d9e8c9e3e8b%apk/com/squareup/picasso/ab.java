package com.squareup.picasso;

import android.net.NetworkInfo;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class ab extends ThreadPoolExecutor
{
  ab()
  {
    super(3, 3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ap());
  }

  private void a(int paramInt)
  {
    setCorePoolSize(paramInt);
    setMaximumPoolSize(paramInt);
  }

  final void a(NetworkInfo paramNetworkInfo)
  {
    if ((paramNetworkInfo == null) || (!paramNetworkInfo.isConnectedOrConnecting()))
    {
      a(3);
      return;
    }
    switch (paramNetworkInfo.getType())
    {
    default:
      a(3);
      return;
    case 1:
    case 6:
    case 9:
      a(4);
      return;
    case 0:
    }
    switch (paramNetworkInfo.getSubtype())
    {
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    default:
      a(3);
      return;
    case 13:
    case 14:
    case 15:
      a(3);
      return;
    case 3:
    case 4:
    case 5:
    case 6:
    case 12:
      a(2);
      return;
    case 1:
    case 2:
    }
    a(1);
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.ab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
