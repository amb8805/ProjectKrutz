package com.spotify.cosmos.router;

import com.spotify.cosmos.annotations.UsedFromNativeCode;

public class NativeRouter
  implements Router
{

  @UsedFromNativeCode
  private long nPtr;

  static
  {
    System.loadLibrary("CosmosRouterJni");
  }

  public NativeRouter()
  {
    init(new RouterParams());
  }

  public NativeRouter(RouterParams paramRouterParams)
  {
    init(paramRouterParams);
  }

  private native void init(RouterParams paramRouterParams);

  public native void destroy();

  public native void resolve(Request paramRequest, ResolveCallback paramResolveCallback);
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.router.NativeRouter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
