package com.spotify.mobile.android.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

final class k
  implements i
{
  private IBinder a;

  k(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final int a(f paramf)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.spotify.mobile.android.service.IConnectManager");
      if (paramf != null);
      for (IBinder localIBinder = paramf.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final List<ConnectDevice> a()
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.spotify.mobile.android.service.IConnectManager");
      this.a.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      ArrayList localArrayList = localParcel2.createTypedArrayList(ConnectDevice.CREATOR);
      return localArrayList;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final void a(float paramFloat)
  {
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.IConnectManager");
      localParcel.writeFloat(paramFloat);
      this.a.transact(10, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final void a(int paramInt)
  {
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.IConnectManager");
      localParcel.writeInt(paramInt);
      this.a.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final void a(String paramString)
  {
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.IConnectManager");
      localParcel.writeString(paramString);
      this.a.transact(8, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final void a(boolean paramBoolean)
  {
    i = 1;
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.IConnectManager");
      if (paramBoolean);
      while (true)
      {
        localParcel.writeInt(i);
        this.a.transact(11, localParcel, null, 1);
        return;
        i = 0;
      }
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

  public final int b()
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.spotify.mobile.android.service.IConnectManager");
      this.a.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final ConnectDevice c()
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.spotify.mobile.android.service.IConnectManager");
      this.a.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        localConnectDevice = (ConnectDevice)ConnectDevice.CREATOR.createFromParcel(localParcel2);
        return localConnectDevice;
      }
      ConnectDevice localConnectDevice = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final ConnectDevice d()
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.spotify.mobile.android.service.IConnectManager");
      this.a.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        localConnectDevice = (ConnectDevice)ConnectDevice.CREATOR.createFromParcel(localParcel2);
        return localConnectDevice;
      }
      ConnectDevice localConnectDevice = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final void e()
  {
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.IConnectManager");
      this.a.transact(7, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final void f()
  {
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.IConnectManager");
      this.a.transact(9, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
