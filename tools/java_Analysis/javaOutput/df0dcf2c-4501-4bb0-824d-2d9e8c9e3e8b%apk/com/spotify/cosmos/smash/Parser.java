package com.spotify.cosmos.smash;

public abstract interface Parser<T>
{
  public abstract T parseTransportMessage(TransportMessage paramTransportMessage);
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.Parser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
