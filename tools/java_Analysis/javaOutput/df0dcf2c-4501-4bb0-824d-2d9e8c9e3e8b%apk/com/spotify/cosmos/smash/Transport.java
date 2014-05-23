package com.spotify.cosmos.smash;

public abstract interface Transport
{
  public abstract void connect();

  public abstract void disconnect();

  public abstract void subscribe(Request paramRequest, TransportListener paramTransportListener);

  public abstract void unsubscribe(TransportListener paramTransportListener);
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.Transport
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
