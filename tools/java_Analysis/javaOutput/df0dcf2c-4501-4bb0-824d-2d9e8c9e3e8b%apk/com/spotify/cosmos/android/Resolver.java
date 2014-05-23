package com.spotify.cosmos.android;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.spotify.cosmos.android.router.IRemoteRouter;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.RouterParams;
import com.spotify.cosmos.router.RouterParams.SerializationException;
import com.spotify.cosmos.router.util.RouterParamsBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Resolver
{
  public static final String ACTION_COSMOS_PROXY = "com.spotify.mobile.service.action.COSMOS_PROXY";
  public static final String BASE_URI = "cosmos://proxy-service";
  public static final String PARAMS_KEY_NAME = "params";
  private final Map<Resolver.ConnectionCallback, Handler> mConnectionCallbacks = Collections.synchronizedMap(new HashMap());
  private final Object mConnectionMutex = new Object();
  private final Context mContext;
  private IRemoteRouter mRemoteRouter;
  private RouterParams mRouterParams;
  private final Resolver.InternalServiceConnection mServiceConnection = new Resolver.InternalServiceConnection(this, null);
  private Resolver.State mState;
  private final Set<Integer> mSubscriptions = new HashSet();

  public Resolver(RouterParams paramRouterParams, Context paramContext)
  {
    if (TextUtils.isEmpty(paramRouterParams.identifier))
      throw new IllegalArgumentException("Invalid identifier");
    this.mState = Resolver.State.DISCONNECTED;
    this.mRouterParams = paramRouterParams;
    this.mContext = paramContext;
  }

  public Resolver(String paramString, Context paramContext)
  {
    this(RouterParamsBuilder.create().identifier(paramString).build(), paramContext);
  }

  private void closeAllSubscriptions()
  {
    Iterator localIterator = this.mSubscriptions.iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      try
      {
        this.mRemoteRouter.unsubscribe(localInteger.intValue());
      }
      catch (RemoteException localRemoteException)
      {
      }
    }
    this.mSubscriptions.clear();
  }

  private void deliverOnConnected(Resolver paramResolver, Resolver.ConnectionCallback paramConnectionCallback, Handler paramHandler)
  {
    if (paramHandler != null)
    {
      paramHandler.post(new Resolver.1(this, paramConnectionCallback, paramResolver));
      return;
    }
    paramConnectionCallback.onServiceConnected(paramResolver);
  }

  private void doConnect()
  {
    this.mState = Resolver.State.CONNECTING;
    localIntent = new Intent("com.spotify.mobile.service.action.COSMOS_PROXY");
    localIntent.setPackage(this.mContext.getPackageName());
    try
    {
      String str = this.mRouterParams.serializeToEncodedJson();
      localIntent.setData(Uri.parse("cosmos://proxy-service?params=" + str));
      if (!this.mContext.bindService(localIntent, this.mServiceConnection, 1))
      {
        notifyOnConnectionFailed(Resolver.ConnectionError.BIND_SERVICE_FAILED);
        this.mState = Resolver.State.DISCONNECTED;
      }
      return;
    }
    catch (RouterParams.SerializationException localSerializationException)
    {
      throw new RuntimeException(localSerializationException.getMessage());
    }
  }

  private void doDisconnect()
  {
    closeAllSubscriptions();
    this.mContext.unbindService(this.mServiceConnection);
    this.mRemoteRouter = null;
    this.mState = Resolver.State.DISCONNECTED;
  }

  private void notifyOnDisconnected()
  {
    while (true)
    {
      Resolver.ConnectionCallback localConnectionCallback;
      synchronized (this.mConnectionMutex)
      {
        Iterator localIterator = this.mConnectionCallbacks.keySet().iterator();
        if (!localIterator.hasNext())
          break;
        localConnectionCallback = (Resolver.ConnectionCallback)localIterator.next();
        Handler localHandler = (Handler)this.mConnectionCallbacks.get(localConnectionCallback);
        if (localHandler != null)
          localHandler.post(new Resolver.2(this, localConnectionCallback));
      }
      localConnectionCallback.onServiceDisconnected(this);
    }
  }

  public void connect()
  {
    synchronized (this.mConnectionMutex)
    {
      switch (Resolver.4.$SwitchMap$com$spotify$cosmos$android$Resolver$State[this.mState.ordinal()])
      {
      default:
        return;
      case 1:
      }
      doConnect();
    }
  }

  public void destroy()
  {
    synchronized (this.mConnectionMutex)
    {
      this.mConnectionCallbacks.clear();
      disconnect();
      return;
    }
  }

  public void disconnect()
  {
    synchronized (this.mConnectionMutex)
    {
      switch (Resolver.4.$SwitchMap$com$spotify$cosmos$android$Resolver$State[this.mState.ordinal()])
      {
      default:
        this.mState = Resolver.State.DISCONNECTED;
      case 1:
        return;
      case 2:
      }
      doDisconnect();
    }
  }

  public boolean get(String paramString, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return resolve(new Request("GET", paramString), paramCallbackReceiver);
  }

  public boolean isConnected()
  {
    return this.mState == Resolver.State.CONNECTED;
  }

  public boolean isConnecting()
  {
    return this.mState == Resolver.State.CONNECTING;
  }

  protected void notifyOnConnected()
  {
    synchronized (this.mConnectionMutex)
    {
      Iterator localIterator = this.mConnectionCallbacks.keySet().iterator();
      if (localIterator.hasNext())
      {
        Resolver.ConnectionCallback localConnectionCallback = (Resolver.ConnectionCallback)localIterator.next();
        deliverOnConnected(this, localConnectionCallback, (Handler)this.mConnectionCallbacks.get(localConnectionCallback));
      }
    }
  }

  protected void notifyOnConnectionFailed(Resolver.ConnectionError paramConnectionError)
  {
    while (true)
    {
      Resolver.ConnectionCallback localConnectionCallback;
      synchronized (this.mConnectionMutex)
      {
        Iterator localIterator = this.mConnectionCallbacks.keySet().iterator();
        if (!localIterator.hasNext())
          break;
        localConnectionCallback = (Resolver.ConnectionCallback)localIterator.next();
        Handler localHandler = (Handler)this.mConnectionCallbacks.get(localConnectionCallback);
        if (localHandler != null)
          localHandler.post(new Resolver.3(this, localConnectionCallback, paramConnectionError));
      }
      localConnectionCallback.onServiceConnectionFailed(this, paramConnectionError);
    }
  }

  public boolean post(String paramString, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return resolve(new Request("POST", paramString), paramCallbackReceiver);
  }

  public void registerConnectionCallback(Resolver.ConnectionCallback paramConnectionCallback)
  {
    synchronized (this.mConnectionMutex)
    {
      this.mConnectionCallbacks.put(paramConnectionCallback, null);
      if (isConnected())
        deliverOnConnected(this, paramConnectionCallback, null);
      return;
    }
  }

  public void registerConnectionCallback(Resolver.ConnectionCallback paramConnectionCallback, Handler paramHandler)
  {
    synchronized (this.mConnectionMutex)
    {
      this.mConnectionCallbacks.put(paramConnectionCallback, paramHandler);
      if (isConnected())
        deliverOnConnected(this, paramConnectionCallback, paramHandler);
      return;
    }
  }

  public boolean resolve(Request paramRequest, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    if (this.mRemoteRouter != null)
      try
      {
        int i = this.mRemoteRouter.resolve(paramRequest.getAction(), paramRequest.getUri(), paramRequest.getHeaders(), paramRequest.getBody(), paramCallbackReceiver);
        synchronized (this.mConnectionMutex)
        {
          this.mSubscriptions.add(Integer.valueOf(i));
          return true;
        }
      }
      catch (RemoteException localRemoteException)
      {
        if (paramCallbackReceiver != null)
          paramCallbackReceiver.sendOnError(new ResolverException("Could not resolve service: " + localRemoteException.getMessage()));
      }
    return false;
  }

  public Subscription subscribe(Request paramRequest, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    if (paramCallbackReceiver == null)
      throw new IllegalArgumentException("Cannot call subscribe with a null receiver");
    if (this.mRemoteRouter != null)
      try
      {
        int i = this.mRemoteRouter.subscribe(paramRequest.getAction(), paramRequest.getUri(), paramRequest.getHeaders(), paramRequest.getBody(), paramCallbackReceiver);
        synchronized (this.mConnectionMutex)
        {
          this.mSubscriptions.add(Integer.valueOf(i));
          return new RemoteRouterSubscription(this, i);
        }
      }
      catch (RemoteException localRemoteException)
      {
        paramCallbackReceiver.sendOnError(new ResolverException("Could not subscribe to service: " + localRemoteException.getMessage()));
      }
    return null;
  }

  public Subscription subscribe(String paramString, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    return subscribe(new Request("SUB", paramString), paramCallbackReceiver);
  }

  public void unregisterConnectionCallback(Resolver.ConnectionCallback paramConnectionCallback)
  {
    synchronized (this.mConnectionMutex)
    {
      this.mConnectionCallbacks.remove(paramConnectionCallback);
      return;
    }
  }

  boolean unsubscribe(int paramInt)
  {
    try
    {
      this.mRemoteRouter.unsubscribe(paramInt);
      synchronized (this.mConnectionMutex)
      {
        this.mSubscriptions.remove(Integer.valueOf(paramInt));
        return true;
      }
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.Resolver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
