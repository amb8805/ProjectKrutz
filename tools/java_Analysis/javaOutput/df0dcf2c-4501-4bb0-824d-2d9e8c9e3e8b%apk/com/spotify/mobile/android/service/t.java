package com.spotify.mobile.android.service;

import android.os.IBinder;
import android.os.Parcel;

final class t
  implements r
{
  private IBinder a;

  t(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a()
  {
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.ISession");
      this.a.transact(3, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final void a(String paramString1, String paramString2)
  {
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.ISession");
      localParcel.writeString(paramString1);
      localParcel.writeString(paramString2);
      this.a.transact(1, localParcel, null, 1);
      return;
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

  public final void b(String paramString1, String paramString2)
  {
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.ISession");
      localParcel.writeString(paramString1);
      localParcel.writeString(paramString2);
      this.a.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
