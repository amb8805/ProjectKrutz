package com.spotify.mobile.android.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class j extends Binder
  implements i
{
  public j()
  {
    attachInterface(this, "com.spotify.mobile.android.service.IConnectManager");
  }

  public static i a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.spotify.mobile.android.service.IConnectManager");
    if ((localIInterface != null) && ((localIInterface instanceof i)))
      return (i)localIInterface;
    return new k(paramIBinder);
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
      paramParcel2.writeString("com.spotify.mobile.android.service.IConnectManager");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IConnectManager");
      IBinder localIBinder = paramParcel1.readStrongBinder();
      Object localObject;
      if (localIBinder == null)
        localObject = null;
      while (true)
      {
        int k = a((f)localObject);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(k);
        return true;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.spotify.mobile.android.service.IConnectDeviceListObserver");
        if ((localIInterface != null) && ((localIInterface instanceof f)))
          localObject = (f)localIInterface;
        else
          localObject = new h(localIBinder);
      }
    case 2:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IConnectManager");
      a(paramParcel1.readInt());
      return true;
    case 3:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IConnectManager");
      List localList = a();
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(localList);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IConnectManager");
      int j = b();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(j);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IConnectManager");
      ConnectDevice localConnectDevice2 = c();
      paramParcel2.writeNoException();
      if (localConnectDevice2 != null)
      {
        paramParcel2.writeInt(1);
        localConnectDevice2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 6:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IConnectManager");
      ConnectDevice localConnectDevice1 = d();
      paramParcel2.writeNoException();
      if (localConnectDevice1 != null)
      {
        paramParcel2.writeInt(1);
        localConnectDevice1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 7:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IConnectManager");
      e();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IConnectManager");
      a(paramParcel1.readString());
      return true;
    case 9:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IConnectManager");
      f();
      return true;
    case 10:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IConnectManager");
      a(paramParcel1.readFloat());
      return true;
    case 11:
    }
    paramParcel1.enforceInterface("com.spotify.mobile.android.service.IConnectManager");
    int i = paramParcel1.readInt();
    boolean bool = false;
    if (i != 0)
      bool = true;
    a(bool);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
