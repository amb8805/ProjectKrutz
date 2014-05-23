package com.spotify.cosmos.android.router.internal;

import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.spotify.cosmos.router.Response;

public class ResolveCallbackReceiver
  implements Parcelable
{
  public static final Parcelable.Creator<ResolveCallbackReceiver> CREATOR = new ResolveCallbackReceiver.2();
  private Handler mHandler;
  private boolean mLocal;
  private IResolveCallbackReceiver mReceiver;
  private final Object mReceiverLock = new Object();

  public ResolveCallbackReceiver()
  {
    this.mLocal = true;
    this.mHandler = null;
  }

  public ResolveCallbackReceiver(Handler paramHandler)
  {
    this.mLocal = true;
    this.mHandler = paramHandler;
  }

  private ResolveCallbackReceiver(Parcel paramParcel)
  {
    this.mLocal = false;
    this.mHandler = null;
    this.mReceiver = IResolveCallbackReceiver.Stub.asInterface(paramParcel.readStrongBinder());
  }

  public int describeContents()
  {
    return 0;
  }

  protected void onError(Throwable paramThrowable)
  {
  }

  protected void onResolved(Response paramResponse)
  {
  }

  public void sendOnError(Throwable paramThrowable)
  {
    if (this.mLocal)
    {
      if (this.mHandler != null)
      {
        this.mHandler.post(new ResolveCallbackReceiver.1(this, paramThrowable));
        return;
      }
      onError(paramThrowable);
      return;
    }
    synchronized (this.mReceiverLock)
    {
      IResolveCallbackReceiver localIResolveCallbackReceiver = this.mReceiver;
      if (localIResolveCallbackReceiver != null);
      try
      {
        this.mReceiver.onError(paramThrowable.getMessage());
        label69: return;
        localObject2 = finally;
        throw localObject2;
      }
      catch (RemoteException localRemoteException)
      {
        break label69;
      }
    }
  }

  public void sendOnResolved(Response paramResponse)
  {
    if (this.mLocal)
    {
      if (this.mHandler != null)
      {
        this.mHandler.post(new ResolveCallbackReceiver.LocalRunnable(this, paramResponse));
        return;
      }
      onResolved(paramResponse);
      return;
    }
    synchronized (this.mReceiverLock)
    {
      IResolveCallbackReceiver localIResolveCallbackReceiver = this.mReceiver;
      if (localIResolveCallbackReceiver != null);
      try
      {
        this.mReceiver.onResolved(paramResponse.getStatus(), paramResponse.getUri(), paramResponse.getHeaders(), paramResponse.getBody());
        label81: return;
        localObject2 = finally;
        throw localObject2;
      }
      catch (RemoteException localRemoteException)
      {
        break label81;
      }
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    synchronized (this.mReceiverLock)
    {
      if (this.mReceiver == null)
        this.mReceiver = new ResolveCallbackReceiver.LocalResolveCallbackReceiver(this, null);
      paramParcel.writeStrongBinder(this.mReceiver.asBinder());
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.router.internal.ResolveCallbackReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
