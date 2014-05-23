package com.spotify.mobile.android.service;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

final class h
  implements f
{
  private IBinder a;

  h(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(List<ConnectDevice> paramList, int paramInt)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.spotify.mobile.android.service.IConnectDeviceListObserver");
      localParcel1.writeTypedList(paramList);
      localParcel1.writeInt(paramInt);
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localParcel2.readTypedList(paramList, ConnectDevice.CREATOR);
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
