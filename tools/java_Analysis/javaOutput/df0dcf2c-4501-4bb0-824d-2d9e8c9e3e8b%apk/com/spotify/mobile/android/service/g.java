package com.spotify.mobile.android.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

public abstract class g extends Binder
  implements f
{
  public g()
  {
    attachInterface(this, "com.spotify.mobile.android.service.IConnectDeviceListObserver");
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.spotify.mobile.android.service.IConnectDeviceListObserver");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.spotify.mobile.android.service.IConnectDeviceListObserver");
    ArrayList localArrayList = paramParcel1.createTypedArrayList(ConnectDevice.CREATOR);
    a(localArrayList, paramParcel1.readInt());
    paramParcel2.writeNoException();
    paramParcel2.writeTypedList(localArrayList);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
