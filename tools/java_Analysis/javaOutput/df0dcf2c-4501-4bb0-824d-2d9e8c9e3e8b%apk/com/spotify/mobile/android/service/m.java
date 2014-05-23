package com.spotify.mobile.android.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;

public abstract class m extends Binder
  implements l
{
  public m()
  {
    attachInterface(this, "com.spotify.mobile.android.service.IMetadata");
  }

  public static l a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.spotify.mobile.android.service.IMetadata");
    if ((localIInterface != null) && ((localIInterface instanceof l)))
      return (l)localIInterface;
    return new n(paramIBinder);
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
      paramParcel2.writeString("com.spotify.mobile.android.service.IMetadata");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IMetadata");
      String str2 = a(paramParcel1.readString(), paramParcel1.createStringArray(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IMetadata");
      a(paramParcel1.readString(), paramParcel1.readString());
      return true;
    case 3:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IMetadata");
      int i = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IMetadata");
      String str1 = a(paramParcel1.readString(), paramParcel1.createStringArray(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IMetadata");
      a(paramParcel1.readString(), paramParcel1.createStringArray(), paramParcel1.createStringArray(), paramParcel1.createStringArray(), paramParcel1.createStringArray());
      return true;
    case 6:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IMetadata");
      b(paramParcel1.readString(), paramParcel1.createStringArray(), paramParcel1.createStringArray());
      return true;
    case 7:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IMetadata");
      b(paramParcel1.readString());
      return true;
    case 8:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.IMetadata");
      ParcelFileDescriptor localParcelFileDescriptor = c(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localParcelFileDescriptor != null)
      {
        paramParcel2.writeInt(1);
        localParcelFileDescriptor.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 9:
    }
    paramParcel1.enforceInterface("com.spotify.mobile.android.service.IMetadata");
    if (paramParcel1.readInt() != 0);
    for (ServiceShutdownReceiver localServiceShutdownReceiver = (ServiceShutdownReceiver)ServiceShutdownReceiver.CREATOR.createFromParcel(paramParcel1); ; localServiceShutdownReceiver = null)
    {
      a(localServiceShutdownReceiver);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
