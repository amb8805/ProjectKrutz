package com.spotify.cosmos.router.util;

import com.spotify.cosmos.router.RouterParams;

public class RouterParamsBuilder
{
  private RouterParams mRouterParams = new RouterParams();

  private RouterParamsBuilder()
  {
  }

  public static RouterParamsBuilder create()
  {
    return new RouterParamsBuilder();
  }

  public RouterParams build()
  {
    return this.mRouterParams;
  }

  public RouterParamsBuilder cacheIdentifier(String paramString)
  {
    this.mRouterParams.cacheIdentifier = paramString;
    return this;
  }

  public RouterParamsBuilder disableEcho(boolean paramBoolean)
  {
    this.mRouterParams.disableEcho = paramBoolean;
    return this;
  }

  public RouterParamsBuilder disableGzip(boolean paramBoolean)
  {
    this.mRouterParams.disableGzip = paramBoolean;
    return this;
  }

  public RouterParamsBuilder disableLog(boolean paramBoolean)
  {
    this.mRouterParams.disableLog = paramBoolean;
    return this;
  }

  public RouterParamsBuilder disableMessages(boolean paramBoolean)
  {
    this.mRouterParams.disableMessages = paramBoolean;
    return this;
  }

  public RouterParamsBuilder disableProtobuf(boolean paramBoolean)
  {
    this.mRouterParams.disableProtobuf = paramBoolean;
    return this;
  }

  public RouterParamsBuilder disableThreads(boolean paramBoolean)
  {
    this.mRouterParams.disableThreads = paramBoolean;
    return this;
  }

  public RouterParamsBuilder identifier(String paramString)
  {
    this.mRouterParams.identifier = paramString;
    return this;
  }

  public RouterParamsBuilder session(String paramString)
  {
    this.mRouterParams.session = paramString;
    return this;
  }

  public RouterParamsBuilder version(String paramString)
  {
    this.mRouterParams.version = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.router.util.RouterParamsBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
