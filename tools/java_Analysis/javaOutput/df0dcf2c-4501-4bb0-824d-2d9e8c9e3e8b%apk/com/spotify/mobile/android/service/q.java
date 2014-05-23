package com.spotify.mobile.android.service;

import android.os.IBinder;
import android.os.Parcel;

final class q
  implements o
{
  private IBinder a;

  q(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a()
  {
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.IServiceShutdownReceiver");
      this.a.transact(1, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
