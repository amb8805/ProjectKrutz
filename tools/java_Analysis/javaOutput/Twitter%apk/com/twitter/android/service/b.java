package com.twitter.android.service;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

final class b
  implements a
{
  private IBinder a;

  b(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(Intent paramIntent)
  {
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.twitter.android.service.ITwitterSessionCallback");
      if (paramIntent != null)
      {
        localParcel.writeInt(1);
        paramIntent.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.a.transact(1, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
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
}

/* Location:
 * Qualified Name:     com.twitter.android.service.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
