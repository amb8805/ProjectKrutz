package com.spotify.mobile.android.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class p extends Binder
  implements o
{
  public p()
  {
    attachInterface(this, "com.spotify.mobile.android.service.IServiceShutdownReceiver");
  }

  public static o a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.spotify.mobile.android.service.IServiceShutdownReceiver");
    if ((localIInterface != null) && ((localIInterface instanceof o)))
      return (o)localIInterface;
    return new q(paramIBinder);
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
      paramParcel2.writeString("com.spotify.mobile.android.service.IServiceShutdownReceiver");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.spotify.mobile.android.service.IServiceShutdownReceiver");
    a();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
