package com.spotify.mobile.android.service.connections;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.service.ConnectManagerProxy;
import com.spotify.mobile.android.service.i;
import com.spotify.mobile.android.service.managers.ConnectManager.DeviceState;
import com.spotify.mobile.android.util.bp;
import java.util.List;

public final class b extends f<i>
{
  private final Handler a = new Handler(Looper.getMainLooper());
  private int b = -1;
  private c c;
  private List<ConnectDevice> d;
  private ConnectManager.DeviceState e = ConnectManager.DeviceState.a;

  public b(Context paramContext)
  {
    super(paramContext, ConnectManagerProxy.class, i.class.getName());
  }

  private List<ConnectDevice> i()
  {
    try
    {
      List localList = ((i)h()).a();
      return localList;
    }
    catch (RemoteException localRemoteException)
    {
      bp.e("Not connected to the service", new Object[0]);
    }
    return null;
  }

  private ConnectManager.DeviceState j()
  {
    try
    {
      i locali = (i)h();
      ConnectManager.DeviceState localDeviceState = ConnectManager.DeviceState.values()[locali.b()];
      return localDeviceState;
    }
    catch (RemoteException localRemoteException)
    {
      bp.e("Not connected to the service", new Object[0]);
    }
    return null;
  }

  public final void a(float paramFloat)
  {
    try
    {
      ((i)h()).a(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      bp.e("Not connected to the service", new Object[0]);
    }
  }

  public final void a(String paramString)
  {
    try
    {
      ((i)h()).a(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      bp.e("Not connected to the service", new Object[0]);
    }
  }

  public final boolean a()
  {
    if (this.b != -1)
      try
      {
        ((i)h()).a(this.b);
        this.c = null;
        return true;
      }
      catch (RemoteException localRemoteException)
      {
        bp.e("Not connected to the service", new Object[0]);
        return false;
      }
    return false;
  }

  public final boolean a(c paramc)
  {
    try
    {
      i locali = (i)h();
      this.c = paramc;
      this.b = locali.a(new b.1(this));
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      bp.e("Not connected to the service", new Object[0]);
      this.c = null;
    }
    return false;
  }

  public final ConnectDevice b()
  {
    try
    {
      ConnectDevice localConnectDevice = ((i)h()).c();
      return localConnectDevice;
    }
    catch (RemoteException localRemoteException)
    {
      bp.e("Not connected to the service", new Object[0]);
    }
    return null;
  }

  public final void c()
  {
    try
    {
      ((i)h()).e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      bp.e("Not connected to the service", new Object[0]);
    }
  }

  public final void d()
  {
    ConnectManager.DeviceState localDeviceState = j();
    if ((this.c != null) && (g()) && (localDeviceState != null))
      this.c.a(i(), localDeviceState);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.connections.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
