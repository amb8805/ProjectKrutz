package com.spotify.mobile.android.service;

import android.os.Handler;
import com.spotify.cosmos.android.router.IRemoteRouter.Stub;
import com.spotify.cosmos.android.router.RemotableNativeRouter;
import com.spotify.cosmos.android.router.internal.DestroyCallbackReceiver;
import com.spotify.cosmos.android.router.internal.ResolveCallbackReceiver;
import java.util.Map;

final class z extends IRemoteRouter.Stub
{
  private RemotableNativeRouter b;

  z(RemotableNativeRouterProxy paramRemotableNativeRouterProxy)
  {
  }

  public final void a(RemotableNativeRouter paramRemotableNativeRouter)
  {
    this.b = paramRemotableNativeRouter;
  }

  public final void registerDestroyCallback(DestroyCallbackReceiver paramDestroyCallbackReceiver)
  {
    z.1 local1 = new z.1(this, paramDestroyCallbackReceiver);
    RemotableNativeRouterProxy.b(this.a).post(local1);
  }

  public final int resolve(String paramString1, String paramString2, Map paramMap, byte[] paramArrayOfByte, ResolveCallbackReceiver paramResolveCallbackReceiver)
  {
    this.a.a();
    return this.b.resolve(paramString1, paramString2, paramMap, paramArrayOfByte, paramResolveCallbackReceiver);
  }

  public final int subscribe(String paramString1, String paramString2, Map paramMap, byte[] paramArrayOfByte, ResolveCallbackReceiver paramResolveCallbackReceiver)
  {
    this.a.a();
    return this.b.subscribe(paramString1, paramString2, paramMap, paramArrayOfByte, paramResolveCallbackReceiver);
  }

  public final void unsubscribe(int paramInt)
  {
    this.a.a();
    this.b.unsubscribe(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
