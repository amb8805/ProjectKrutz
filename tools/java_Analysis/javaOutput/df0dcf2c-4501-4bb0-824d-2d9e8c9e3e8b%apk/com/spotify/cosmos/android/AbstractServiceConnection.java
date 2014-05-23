package com.spotify.cosmos.android;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import com.spotify.cosmos.router.RouterParams;
import com.spotify.cosmos.router.RouterParams.SerializationException;
import com.spotify.cosmos.router.util.RouterParamsBuilder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class AbstractServiceConnection<T extends IInterface>
  implements ServiceConnection
{
  private static final double BASELINE_CRASH_FREQUENCY = 10000.0D;
  public static final int CONNECT_TIMEOUT_IN_SEC = 2;
  private Context mContext;
  private String mIdentifier;
  private List<AbstractServiceConnection.ServiceConnectionListener<T>> mListeners = new LinkedList();
  private T mServiceInterface;

  public AbstractServiceConnection(String paramString, Context paramContext, Class<? extends Service> paramClass)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("Invalid identifier");
    this.mIdentifier = paramString;
    this.mContext = paramContext;
  }

  private void doConnect()
  {
    localIntent = new Intent("com.spotify.mobile.service.action.COSMOS_PROXY");
    localIntent.setPackage(this.mContext.getPackageName());
    try
    {
      String str = RouterParamsBuilder.create().identifier(this.mIdentifier).build().serializeToEncodedJson();
      localIntent.setData(Uri.parse("cosmos://proxy-service?params=" + str));
      if (!this.mContext.bindService(localIntent, this, 1))
        notifyOnDisconnected();
      return;
    }
    catch (RouterParams.SerializationException localSerializationException)
    {
      throw new RuntimeException(localSerializationException.getMessage());
    }
  }

  private void doDisconnect()
  {
    if (this.mServiceInterface != null);
    try
    {
      this.mContext.unbindService(this);
      this.mServiceInterface = null;
      return;
    }
    catch (Exception localException)
    {
      while (0.0001D <= Math.random());
      throw new RuntimeException(localException);
    }
  }

  private void notifyOnConnected()
  {
    Iterator localIterator = this.mListeners.iterator();
    while (localIterator.hasNext())
      ((AbstractServiceConnection.ServiceConnectionListener)localIterator.next()).onServiceConnected(this.mServiceInterface);
  }

  private void notifyOnDisconnected()
  {
    Iterator localIterator = this.mListeners.iterator();
    while (localIterator.hasNext())
      ((AbstractServiceConnection.ServiceConnectionListener)localIterator.next()).onServiceDisconnected();
  }

  public void addListener(AbstractServiceConnection.ServiceConnectionListener<T> paramServiceConnectionListener)
  {
    try
    {
      this.mListeners.add(paramServiceConnectionListener);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected abstract T asInterface(IBinder paramIBinder);

  public void connect()
  {
    try
    {
      if (!hasService())
        doConnect();
      while (true)
      {
        return;
        notifyOnConnected();
      }
    }
    finally
    {
    }
  }

  public void disconnect()
  {
    try
    {
      if (hasService())
        doDisconnect();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public String getIdentifier()
  {
    return this.mIdentifier;
  }

  protected abstract Class<T> getInterfaceClass();

  public T getService()
  {
    return this.mServiceInterface;
  }

  public boolean hasService()
  {
    return this.mServiceInterface != null;
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.mServiceInterface = asInterface(paramIBinder);
    notifyOnConnected();
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.mServiceInterface = null;
    notifyOnDisconnected();
  }

  public void removeListener(AbstractServiceConnection.ServiceConnectionListener<T> paramServiceConnectionListener)
  {
    try
    {
      this.mListeners.remove(paramServiceConnectionListener);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.AbstractServiceConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
