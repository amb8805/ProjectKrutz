package com.spotify.cosmos.android.router;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.spotify.cosmos.android.AbstractServiceConnection;

public class RemoteRouterConnection extends AbstractServiceConnection<IRemoteRouter>
{
  private Handler mHandler = new Handler(Looper.getMainLooper());

  public RemoteRouterConnection(String paramString, Context paramContext, Class<? extends Service> paramClass)
  {
    super(paramString, paramContext, paramClass);
  }

  protected IRemoteRouter asInterface(IBinder paramIBinder)
  {
    return IRemoteRouter.Stub.asInterface(paramIBinder);
  }

  protected Class<IRemoteRouter> getInterfaceClass()
  {
    return IRemoteRouter.class;
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    super.onServiceConnected(paramComponentName, paramIBinder);
    if (!hasService())
      return;
    try
    {
      ((IRemoteRouter)getService()).registerDestroyCallback(new RemoteRouterConnection.1(this, this.mHandler));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException("failed to register destroy callback", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.router.RemoteRouterConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
