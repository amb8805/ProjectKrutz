package com.spotify.cosmos.smash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Connection
{
  private final Object mCancellationMutex = new Object();
  private final Dispatcher mDispatcher;
  private boolean mIsStarted;
  private final Map<Subscription<?>, Connection.SubscriptionEntry<?>> mSubscriptions = new HashMap();
  private final Transport mTransport;

  public Connection(Transport paramTransport, Dispatcher paramDispatcher)
  {
    this.mTransport = paramTransport;
    this.mDispatcher = paramDispatcher;
    connect();
  }

  private void cancelSubscription(Subscription<?> paramSubscription)
  {
    paramSubscription.setCancelled(true);
    paramSubscription.setConnection(null);
  }

  private void connect()
  {
    this.mIsStarted = true;
    this.mTransport.connect();
  }

  void cancel(Subscription<?> paramSubscription)
  {
    synchronized (this.mCancellationMutex)
    {
      if ((paramSubscription.isCancelled()) && (isStarted()))
        throw new IllegalStateException("Subscription has already been cancelled");
    }
    if (!isStarted())
      throw new IllegalStateException("Cannot cancel subscription on stopped connection");
    cancelSubscription(paramSubscription);
    this.mDispatcher.postCancel(this, paramSubscription);
  }

  public void disconnect()
  {
    if (!this.mIsStarted)
      throw new IllegalStateException("Cannot disconnect a connection that is not connected");
    synchronized (this.mSubscriptions)
    {
      Iterator localIterator = this.mSubscriptions.keySet().iterator();
      if (localIterator.hasNext())
      {
        Subscription localSubscription = (Subscription)localIterator.next();
        cancelSubscription(localSubscription);
        this.mDispatcher.postCancel(this, localSubscription);
      }
    }
    this.mTransport.disconnect();
    this.mIsStarted = false;
  }

  public boolean hasSubscriptions()
  {
    synchronized (this.mSubscriptions)
    {
      if (this.mSubscriptions.size() > 0)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  public boolean isStarted()
  {
    return this.mIsStarted;
  }

  <T> void onParseMessage(Subscription<T> paramSubscription, TransportMessage paramTransportMessage)
  {
    synchronized (this.mCancellationMutex)
    {
      if (paramSubscription.isCancelled())
        return;
      try
      {
        Object localObject3 = paramSubscription.parseTransportMessage(paramTransportMessage);
        this.mDispatcher.postDeliverMessage(paramSubscription, localObject3);
        return;
        localObject2 = finally;
        throw localObject2;
      }
      catch (Throwable localThrowable)
      {
        while (true)
          this.mDispatcher.postDeliverError(paramSubscription, localThrowable);
      }
    }
  }

  <T> void onTransportCancel(Subscription<T> paramSubscription)
  {
    Connection.SubscriptionEntry localSubscriptionEntry;
    synchronized (this.mSubscriptions)
    {
      localSubscriptionEntry = (Connection.SubscriptionEntry)this.mSubscriptions.remove(paramSubscription);
      if (localSubscriptionEntry == null)
        return;
    }
    this.mTransport.unsubscribe(localSubscriptionEntry);
  }

  <T> void onTransportSubscribe(Subscription<T> paramSubscription, Request paramRequest)
  {
    paramSubscription.setConnection(this);
    Connection.SubscriptionEntry localSubscriptionEntry = new Connection.SubscriptionEntry(this, paramSubscription);
    synchronized (this.mSubscriptions)
    {
      this.mSubscriptions.put(paramSubscription, localSubscriptionEntry);
      this.mTransport.subscribe(paramRequest, localSubscriptionEntry);
      return;
    }
  }

  public <T> Subscription<T> resolve(Request paramRequest, Parser<T> paramParser, Subscriber<T> paramSubscriber)
  {
    Value localValue = Value.create();
    localValue.set(subscribe(paramRequest, paramParser, new Connection.1(this, paramSubscriber, localValue)));
    return (Subscription)localValue.get();
  }

  public <T> Subscription<T> subscribe(Request paramRequest, Parser<T> paramParser, Subscriber<T> paramSubscriber)
  {
    if (!isStarted())
      throw new IllegalStateException("Cannot subscribe to a stopped connection");
    Subscription localSubscription = new Subscription(paramParser, paramSubscriber);
    localSubscription.setConnection(this);
    this.mDispatcher.postSubscribe(this, localSubscription, paramRequest);
    return localSubscription;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.Connection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
