package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.k;

final class at
  implements aq
{
  private IBinder a;

  at(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final Tile a(int paramInt1, int paramInt2, int paramInt3)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeInt(paramInt3);
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        Tile localTile2 = k.a(localParcel2);
        localTile1 = localTile2;
        return localTile1;
      }
      Tile localTile1 = null;
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
 * Qualified Name:     com.google.android.gms.internal.at
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
