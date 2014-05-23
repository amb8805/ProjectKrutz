package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;

public abstract class bb extends Binder
  implements ba
{
  public bb()
  {
    attachInterface(this, "com.google.android.gms.plus.internal.IPlusCallbacks");
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
      paramParcel2.writeString("com.google.android.gms.plus.internal.IPlusCallbacks");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i = paramParcel1.readInt();
      Bundle localBundle;
      if (paramParcel1.readInt() != 0)
      {
        localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label293;
      }
      for (ParcelFileDescriptor localParcelFileDescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel1); ; localParcelFileDescriptor = null)
      {
        a(i, localBundle, localParcelFileDescriptor);
        paramParcel2.writeNoException();
        return true;
        localBundle = null;
        break;
      }
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      if (paramParcel1.readInt() != 0)
        cg.a(paramParcel1);
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() != 0)
        v.a(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      if (paramParcel1.readInt() != 0)
        cg.a(paramParcel1);
      paramParcel1.readString();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      if (paramParcel1.readInt() != 0)
        cg.a(paramParcel1);
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel1.readString();
      paramParcel1.createStringArrayList();
      paramParcel1.createStringArrayList();
      paramParcel1.createStringArrayList();
      paramParcel2.writeNoException();
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        bj.a(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() != 0)
        ca.a(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 14:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() != 0)
        cb.a(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 15:
      label293: paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 16:
    }
    paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
    paramParcel1.readInt();
    if (paramParcel1.readInt() != 0)
      Bundle.CREATOR.createFromParcel(paramParcel1);
    paramParcel1.createTypedArrayList(ak.a);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
