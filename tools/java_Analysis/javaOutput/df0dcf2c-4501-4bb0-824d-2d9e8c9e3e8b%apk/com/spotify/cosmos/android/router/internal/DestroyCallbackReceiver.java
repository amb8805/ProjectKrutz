package com.spotify.cosmos.android.router.internal;

import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public class DestroyCallbackReceiver
  implements Parcelable
{
  public static final Parcelable.Creator<DestroyCallbackReceiver> CREATOR = new DestroyCallbackReceiver.1();
  private Handler mHandler;
  private boolean mLocal;
  private IDestroyCallbackReceiver mReceiver;
  private final Object mReceiverLock = new Object();

  public DestroyCallbackReceiver(Handler paramHandler)
  {
    this.mLocal = true;
    this.mHandler = paramHandler;
  }

  private DestroyCallbackReceiver(Parcel paramParcel)
  {
    this.mLocal = false;
    this.mHandler = null;
    this.mReceiver = IDestroyCallbackReceiver.Stub.asInterface(paramParcel.readStrongBinder());
  }

  public int describeContents()
  {
    return 0;
  }

  protected void onDestroy()
  {
  }

  public void sendOnDestroy()
  {
    if (this.mLocal)
    {
      if (this.mHandler != null)
      {
        this.mHandler.post(new DestroyCallbackReceiver.LocalRunnable(this, null));
        return;
      }
      onDestroy();
      return;
    }
    synchronized (this.mReceiverLock)
    {
      IDestroyCallbackReceiver localIDestroyCallbackReceiver = this.mReceiver;
      if (localIDestroyCallbackReceiver != null);
      try
      {
        this.mReceiver.onDestroy();
        label62: return;
        localObject2 = finally;
        throw localObject2;
      }
      catch (RemoteException localRemoteException)
      {
        break label62;
      }
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    synchronized (this.mReceiverLock)
    {
      if (this.mReceiver == null)
        this.mReceiver = new DestroyCallbackReceiver.LocalDestroyCallbackReceiver(this, null);
      paramParcel.writeStrongBinder(this.mReceiver.asBinder());
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.router.internal.DestroyCallbackReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
