package com.spotify.mobile.android.service;

import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public class ServiceShutdownReceiver
  implements Parcelable
{
  public static final Parcelable.Creator<ServiceShutdownReceiver> CREATOR = new ServiceShutdownReceiver.1();
  private boolean a;
  private Handler b;
  private final Object c = new Object();
  private o d;

  public ServiceShutdownReceiver()
  {
    this.a = true;
    this.b = null;
  }

  private ServiceShutdownReceiver(Parcel paramParcel)
  {
    this.a = false;
    this.b = null;
    this.d = p.a(paramParcel.readStrongBinder());
  }

  public final void a()
  {
    if (this.a)
    {
      if (this.b != null)
      {
        this.b.post(new ab(this, (byte)0));
        return;
      }
      b();
      return;
    }
    synchronized (this.c)
    {
      o localo = this.d;
      if (localo != null);
      try
      {
        this.d.a();
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

  protected void b()
  {
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    synchronized (this.c)
    {
      if (this.d == null)
        this.d = new ac(this, (byte)0);
      paramParcel.writeStrongBinder(this.d.asBinder());
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.ServiceShutdownReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
