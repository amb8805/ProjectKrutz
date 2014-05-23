package com.spotify.cosmos.android.router;

import android.app.Service;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.spotify.cosmos.android.AbstractServiceConnection.ServiceConnectionListener;
import com.spotify.cosmos.smash.Request;
import com.spotify.cosmos.smash.Transport;
import com.spotify.cosmos.smash.TransportListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CosmosTransport
  implements AbstractServiceConnection.ServiceConnectionListener<IRemoteRouter>, Transport
{
  private static final int CORE_POOL_SIZE = 3;
  private static final int MAX_POOL_SIZE = 10;
  private static final long POOL_THREAD_KEEP_ALIVE_SECONDS = 60L;
  private boolean mConnected;
  private final Object mConnectedMutex = new Object();
  private Handler mHandler = new Handler(Looper.getMainLooper());
  private final LinkedBlockingQueue<CosmosTransport.QueuedRequest> mQueuedRequests;
  private int mRefCount = 0;
  private RemoteRouterConnection mRouterConnection;
  private Map<TransportListener, CosmosTransport.SubscriberData> mSubscribers;
  private ThreadPoolExecutor mTransportExecutor;

  public CosmosTransport(String paramString, Context paramContext, Class<? extends Service> paramClass)
  {
    this.mRouterConnection = new RemoteRouterConnection(paramString, paramContext, paramClass);
    this.mRouterConnection.addListener(this);
    this.mSubscribers = new HashMap();
    this.mTransportExecutor = new ThreadPoolExecutor(3, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    this.mQueuedRequests = new LinkedBlockingQueue();
  }

  private void performSubscribe(Request paramRequest, TransportListener paramTransportListener, IRemoteRouter paramIRemoteRouter)
  {
    try
    {
      CosmosTransport.1 local1 = new CosmosTransport.1(this, this.mHandler, paramTransportListener);
      int i = paramIRemoteRouter.subscribe(paramRequest.getMethod(), paramRequest.getUri(), paramRequest.getHeaders(), paramRequest.getBody(), local1);
      this.mSubscribers.put(paramTransportListener, new CosmosTransport.SubscriberData(this, i, local1, null));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public void connect()
  {
    if (this.mRouterConnection == null)
      throw new IllegalStateException("Cannot reuse transport after disconnecting");
    this.mRouterConnection.connect();
    synchronized (this.mConnectedMutex)
    {
      this.mConnected = true;
      this.mRefCount = (1 + this.mRefCount);
      return;
    }
  }

  public void disconnect()
  {
    synchronized (this.mConnectedMutex)
    {
      if (!this.mConnected)
        throw new IllegalStateException("Channel is not connected");
    }
    this.mRefCount = (-1 + this.mRefCount);
    if (this.mRefCount > 0)
      return;
    this.mConnected = false;
    this.mRouterConnection.disconnect();
    if ((this.mTransportExecutor != null) && (!this.mTransportExecutor.isShutdown()) && (!this.mTransportExecutor.isTerminated()))
    {
      this.mTransportExecutor.shutdown();
      this.mTransportExecutor = null;
    }
  }

  public ThreadPoolExecutor getTransportExecutor()
  {
    return this.mTransportExecutor;
  }

  public boolean isConnected()
  {
    return this.mConnected;
  }

  public void onServiceConnected(IRemoteRouter paramIRemoteRouter)
  {
    while (true)
    {
      int j;
      synchronized (this.mConnectedMutex)
      {
        int i = this.mQueuedRequests.size();
        j = 0;
        if (j < i)
        {
          CosmosTransport.QueuedRequest localQueuedRequest = (CosmosTransport.QueuedRequest)this.mQueuedRequests.poll();
          if (localQueuedRequest != null)
            performSubscribe(localQueuedRequest.request, localQueuedRequest.listener, paramIRemoteRouter);
        }
        else
        {
          return;
        }
      }
      j++;
    }
  }

  public void onServiceDisconnected()
  {
  }

  public void subscribe(Request paramRequest, TransportListener paramTransportListener)
  {
    synchronized (this.mConnectedMutex)
    {
      if ((!this.mRouterConnection.hasService()) || (!this.mConnected))
      {
        this.mQueuedRequests.add(new CosmosTransport.QueuedRequest(this, paramRequest, paramTransportListener));
        return;
      }
      performSubscribe(paramRequest, paramTransportListener, (IRemoteRouter)this.mRouterConnection.getService());
      return;
    }
  }

  public void unsubscribe(TransportListener paramTransportListener)
  {
    Object localObject1 = this.mConnectedMutex;
    if (paramTransportListener == null)
      try
      {
        throw new IllegalStateException("Listener cannot be null!");
      }
      finally
      {
      }
    int i;
    if (isConnected())
      i = this.mQueuedRequests.size();
    for (int j = 0; ; j++)
      if (j < i)
      {
        CosmosTransport.QueuedRequest localQueuedRequest = (CosmosTransport.QueuedRequest)this.mQueuedRequests.poll();
        if ((localQueuedRequest != null) && (localQueuedRequest.listener != paramTransportListener))
          this.mQueuedRequests.add(localQueuedRequest);
      }
      else
      {
        IRemoteRouter localIRemoteRouter = (IRemoteRouter)this.mRouterConnection.getService();
        CosmosTransport.SubscriberData localSubscriberData;
        if (localIRemoteRouter != null)
          localSubscriberData = (CosmosTransport.SubscriberData)this.mSubscribers.get(paramTransportListener);
        try
        {
          localIRemoteRouter.unsubscribe(localSubscriberData.id);
          this.mSubscribers.remove(paramTransportListener);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          throw new RuntimeException(localRemoteException);
        }
      }
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.router.CosmosTransport
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
