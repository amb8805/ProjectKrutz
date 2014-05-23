package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

final class c
  implements a
{
  private IBinder a;

  c(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final ac a(ac paramac, int paramInt1, int paramInt2)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
      if (paramac != null);
      for (IBinder localIBinder = paramac.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt1);
        localParcel1.writeInt(paramInt2);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        ac localac = ad.a(localParcel2.readStrongBinder());
        return localac;
      }
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
 * Qualified Name:     com.google.android.gms.internal.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
