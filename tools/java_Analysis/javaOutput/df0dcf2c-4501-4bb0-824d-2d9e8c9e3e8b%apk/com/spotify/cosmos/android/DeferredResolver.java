package com.spotify.cosmos.android;

import android.content.Context;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.RouterParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DeferredResolver extends Resolver
{
  private final Object mConnectionMutex = new Object();
  private final List<DeferredResolver.StateObserver> mResolverCallbacks = Collections.synchronizedList(new ArrayList());

  public DeferredResolver(RouterParams paramRouterParams, Context paramContext)
  {
    super(paramRouterParams, paramContext);
  }

  public DeferredResolver(String paramString, Context paramContext)
  {
    super(paramString, paramContext);
  }

  private void deliverResolverConnected()
  {
    synchronized (this.mConnectionMutex)
    {
      Iterator localIterator = this.mResolverCallbacks.iterator();
      if (localIterator.hasNext())
        ((DeferredResolver.StateObserver)localIterator.next()).onConnected();
    }
    this.mResolverCallbacks.clear();
  }

  private void deliverResolverConnectionFailed(Resolver.ConnectionError paramConnectionError)
  {
    synchronized (this.mConnectionMutex)
    {
      Iterator localIterator = this.mResolverCallbacks.iterator();
      if (localIterator.hasNext())
        ((DeferredResolver.StateObserver)localIterator.next()).onConnectionFailed(paramConnectionError);
    }
    this.mResolverCallbacks.clear();
  }

  private void registerResolverCallbacks(DeferredResolver.StateObserver paramStateObserver)
  {
    localObject1 = this.mConnectionMutex;
    if (paramStateObserver != null);
    try
    {
      this.mResolverCallbacks.add(paramStateObserver);
      return;
    }
    finally
    {
    }
  }

  public void connect(DeferredResolver.StateObserver paramStateObserver)
  {
    if (paramStateObserver != null)
      registerResolverCallbacks(paramStateObserver);
    if (isConnected())
      deliverResolverConnected();
    super.connect();
  }

  public void destroy()
  {
    this.mResolverCallbacks.clear();
    super.destroy();
  }

  protected void notifyOnConnected()
  {
    super.notifyOnConnected();
    deliverResolverConnected();
  }

  protected void notifyOnConnectionFailed(Resolver.ConnectionError paramConnectionError)
  {
    super.notifyOnConnectionFailed(paramConnectionError);
    deliverResolverConnectionFailed(paramConnectionError);
  }

  public boolean resolve(Request paramRequest, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    if (isConnected())
      return super.resolve(paramRequest, paramCallbackReceiver);
    registerResolverCallbacks(new DeferredResolver.1(this, paramRequest, paramCallbackReceiver));
    return true;
  }

  public Subscription subscribe(Request paramRequest, Resolver.CallbackReceiver paramCallbackReceiver)
  {
    if (isConnected())
      return new DeferredResolver.SubscriptionProxy(super.subscribe(paramRequest, paramCallbackReceiver));
    DeferredResolver.SubscriptionProxy localSubscriptionProxy = new DeferredResolver.SubscriptionProxy(null);
    registerResolverCallbacks(new DeferredResolver.2(this, localSubscriptionProxy, paramRequest, paramCallbackReceiver));
    return localSubscriptionProxy;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.DeferredResolver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
