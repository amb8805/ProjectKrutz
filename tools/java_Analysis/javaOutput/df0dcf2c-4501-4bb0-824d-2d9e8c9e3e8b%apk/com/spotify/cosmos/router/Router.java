package com.spotify.cosmos.router;

public abstract interface Router
{
  public abstract void destroy();

  public abstract void resolve(Request paramRequest, ResolveCallback paramResolveCallback);
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.router.Router
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
