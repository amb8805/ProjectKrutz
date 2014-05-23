package com.spotify.mobile.android.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class s extends Binder
  implements r
{
  public s()
  {
    attachInterface(this, "com.spotify.mobile.android.service.ISession");
  }

  public static r a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.spotify.mobile.android.service.ISession");
    if ((localIInterface != null) && ((localIInterface instanceof r)))
      return (r)localIInterface;
    return new t(paramIBinder);
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
      paramParcel2.writeString("com.spotify.mobile.android.service.ISession");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.ISession");
      a(paramParcel1.readString(), paramParcel1.readString());
      return true;
    case 2:
      paramParcel1.enforceInterface("com.spotify.mobile.android.service.ISession");
      b(paramParcel1.readString(), paramParcel1.readString());
      return true;
    case 3:
    }
    paramParcel1.enforceInterface("com.spotify.mobile.android.service.ISession");
    a();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
