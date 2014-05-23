package com.spotify.mobile.android.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;

final class n
  implements l
{
  private IBinder a;

  n(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final int a(String paramString)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.spotify.mobile.android.service.IMetadata");
      localParcel1.writeString(paramString);
      this.a.transact(3, localParcel1, localParcel2, 0);
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

  public final String a(String paramString, String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.spotify.mobile.android.service.IMetadata");
      localParcel1.writeString(paramString);
      localParcel1.writeStringArray(paramArrayOfString);
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      this.a.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final String a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.spotify.mobile.android.service.IMetadata");
      localParcel1.writeString(paramString);
      localParcel1.writeStringArray(paramArrayOfString1);
      localParcel1.writeStringArray(paramArrayOfString2);
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final void a(ServiceShutdownReceiver paramServiceShutdownReceiver)
  {
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.IMetadata");
      if (paramServiceShutdownReceiver != null)
      {
        localParcel.writeInt(1);
        paramServiceShutdownReceiver.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.a.transact(9, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
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
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.IMetadata");
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

  public final void a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String[] paramArrayOfString4)
  {
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.IMetadata");
      localParcel.writeString(paramString);
      localParcel.writeStringArray(paramArrayOfString1);
      localParcel.writeStringArray(paramArrayOfString2);
      localParcel.writeStringArray(paramArrayOfString3);
      localParcel.writeStringArray(paramArrayOfString4);
      this.a.transact(5, localParcel, null, 1);
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

  public final void b(String paramString)
  {
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.IMetadata");
      localParcel.writeString(paramString);
      this.a.transact(7, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final void b(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.spotify.mobile.android.service.IMetadata");
      localParcel.writeString(paramString);
      localParcel.writeStringArray(paramArrayOfString1);
      localParcel.writeStringArray(paramArrayOfString2);
      this.a.transact(6, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final ParcelFileDescriptor c(String paramString)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.spotify.mobile.android.service.IMetadata");
      localParcel1.writeString(paramString);
      this.a.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        localParcelFileDescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(localParcel2);
        return localParcelFileDescriptor;
      }
      ParcelFileDescriptor localParcelFileDescriptor = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
