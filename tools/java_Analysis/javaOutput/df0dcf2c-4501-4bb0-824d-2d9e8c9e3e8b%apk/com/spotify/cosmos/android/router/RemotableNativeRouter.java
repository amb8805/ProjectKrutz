package com.spotify.cosmos.android.router;

import android.util.SparseArray;
import com.spotify.cosmos.android.router.internal.DestroyCallbackReceiver;
import com.spotify.cosmos.android.router.internal.ResolveCallbackReceiver;
import com.spotify.cosmos.annotations.CalledFromTestCases;
import com.spotify.cosmos.router.NativeRouter;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.ResolveCallback;;
import com.spotify.cosmos.router.Router;
import com.spotify.cosmos.router.RouterParams;
import com.spotify.cosmos.router.util.RouterParamsBuilder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RemotableNativeRouter extends IRemoteRouter.Stub
{
  public static final String INTENT_EXTRA_IDENTIFIER = "com.spotify.cosmos.android.router.IDENTIFIER";
  private final List<DestroyCallbackReceiver> mDestroyCallbackReceivers = new LinkedList();
  private final Router mNativeRouter;
  private boolean mRouterDestroyed;
  private final Object mSubscriptionMutex = new Object();
  private final SparseArray<RemotableNativeRouter.SubscriptionResolveCallback> mSubscriptions = new SparseArray();

  public RemotableNativeRouter()
  {
    this.mNativeRouter = new NativeRouter(RouterParamsBuilder.create().identifier("Default").build());
    this.mRouterDestroyed = false;
  }

  @CalledFromTestCases
  public RemotableNativeRouter(Router paramRouter)
  {
    this.mRouterDestroyed = false;
    this.mNativeRouter = paramRouter;
  }

  public RemotableNativeRouter(RouterParams paramRouterParams)
  {
    this.mNativeRouter = new NativeRouter(paramRouterParams);
    this.mRouterDestroyed = false;
  }

  public void destroy()
  {
    synchronized (this.mDestroyCallbackReceivers)
    {
      if (this.mRouterDestroyed)
        throw new IllegalStateException("Router already destroyed");
    }
    this.mSubscriptions.clear();
    this.mNativeRouter.destroy();
    this.mRouterDestroyed = true;
    Iterator localIterator = this.mDestroyCallbackReceivers.iterator();
    while (localIterator.hasNext())
      ((DestroyCallbackReceiver)localIterator.next()).sendOnDestroy();
    this.mDestroyCallbackReceivers.clear();
  }

  public Router getNativeRouter()
  {
    return this.mNativeRouter;
  }

  public void registerDestroyCallback(DestroyCallbackReceiver paramDestroyCallbackReceiver)
  {
    synchronized (this.mDestroyCallbackReceivers)
    {
      if (this.mRouterDestroyed)
        throw new IllegalStateException("Router already destroyed");
    }
    this.mDestroyCallbackReceivers.add(paramDestroyCallbackReceiver);
  }

  public int resolve(String paramString1, String paramString2, Map paramMap, byte[] paramArrayOfByte, ResolveCallbackReceiver paramResolveCallbackReceiver)
  {
    if (this.mRouterDestroyed)
      throw new IllegalStateException("Router already destroyed");
    Request localRequest = new Request(paramString1, paramString2, paramMap, paramArrayOfByte);
    Object localObject1;
    if (paramResolveCallbackReceiver == null)
      localObject1 = new RemotableNativeRouter.NullResolveCallback(this);
    while (true)
    {
      int i = ((RemotableNativeRouter.SubscriptionResolveCallback)localObject1).getId();
      synchronized (this.mSubscriptionMutex)
      {
        this.mSubscriptions.put(i, localObject1);
        this.mNativeRouter.resolve(localRequest, (com.spotify.cosmos.router.ResolveCallback)localObject1);
        return i;
        localObject1 = new RemotableNativeRouter.CancellingResolveCallback(this, paramResolveCallbackReceiver, null);
      }
    }
  }

  public int subscribe(String paramString1, String paramString2, Map paramMap, byte[] paramArrayOfByte, ResolveCallbackReceiver paramResolveCallbackReceiver)
  {
    if (this.mRouterDestroyed)
      throw new IllegalStateException("Router already destroyed");
    if (paramResolveCallbackReceiver == null)
      throw new IllegalArgumentException("Cannot call subscribe with null callback receiver");
    Request localRequest = new Request(paramString1, paramString2, paramMap, paramArrayOfByte);
    RemotableNativeRouter.SubscriptionResolveCallback localSubscriptionResolveCallback = new RemotableNativeRouter.SubscriptionResolveCallback(this, paramResolveCallbackReceiver, null);
    int i = localSubscriptionResolveCallback.getId();
    synchronized (this.mSubscriptionMutex)
    {
      this.mSubscriptions.put(i, localSubscriptionResolveCallback);
      this.mNativeRouter.resolve(localRequest, localSubscriptionResolveCallback);
      return i;
    }
  }

  public void unsubscribe(int paramInt)
  {
    synchronized (this.mSubscriptionMutex)
    {
      RemotableNativeRouter.SubscriptionResolveCallback localSubscriptionResolveCallback = (RemotableNativeRouter.SubscriptionResolveCallback)this.mSubscriptions.get(paramInt);
      if (localSubscriptionResolveCallback != null)
      {
        RemotableNativeRouter.SubscriptionResolveCallback.access$502(localSubscriptionResolveCallback, true);
        this.mSubscriptions.remove(paramInt);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.router.RemotableNativeRouter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
