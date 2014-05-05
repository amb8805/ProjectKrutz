package com.twitter.android.service;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public final class e
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new d();
  private a a;

  public e(Parcel paramParcel)
  {
    IBinder localIBinder = paramParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
      localObject = null;
    while (true)
    {
      this.a = ((a)localObject);
      return;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.twitter.android.service.ITwitterSessionCallback");
      if ((localIInterface != null) && ((localIInterface instanceof a)))
        localObject = (a)localIInterface;
      else
        localObject = new b(localIBinder);
    }
  }

  public e(a parama)
  {
    this.a = parama;
  }

  public final void a(Intent paramIntent)
  {
    try
    {
      this.a.a(paramIntent);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStrongBinder(this.a.asBinder());
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.service.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
