package com.spotify.cosmos.smash.util;

import com.spotify.cosmos.smash.TransportMessage;

public class VoidParser extends HttpParser<Void>
{
  public VoidParser()
  {
  }

  protected Void onTransportSuccess(TransportMessage paramTransportMessage)
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.util.VoidParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
