package com.spotify.cosmos.smash;

public abstract interface Subscriber<T>
{
  public abstract void onData(T paramT);

  public abstract void onError(Throwable paramThrowable);
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.Subscriber
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
