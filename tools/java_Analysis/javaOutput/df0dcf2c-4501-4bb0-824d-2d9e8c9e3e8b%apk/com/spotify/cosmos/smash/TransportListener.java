package com.spotify.cosmos.smash;

public abstract interface TransportListener
{
  public abstract void onError(Throwable paramThrowable);

  public abstract void onTransportMessage(TransportMessage paramTransportMessage);
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.TransportListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
