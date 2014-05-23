package com.spotify.cosmos.router;

public abstract interface ResolveCallback
{
  public abstract void onError(Throwable paramThrowable);

  public abstract boolean onResolved(Response paramResponse);
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.router.ResolveCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
