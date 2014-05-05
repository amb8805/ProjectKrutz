package com.twitter.android.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class i extends Binder
  implements a
{
  public i()
  {
    attachInterface(this, "com.twitter.android.service.ITwitterSessionCallback");
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
      paramParcel2.writeString("com.twitter.android.service.ITwitterSessionCallback");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.twitter.android.service.ITwitterSessionCallback");
    if (paramParcel1.readInt() != 0);
    for (Intent localIntent = (Intent)Intent.CREATOR.createFromParcel(paramParcel1); ; localIntent = null)
    {
      a(localIntent);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.service.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
