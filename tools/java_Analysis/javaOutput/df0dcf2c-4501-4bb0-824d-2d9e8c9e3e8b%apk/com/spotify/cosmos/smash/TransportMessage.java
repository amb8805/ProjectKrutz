package com.spotify.cosmos.smash;

import java.util.Map;

public class TransportMessage
{
  private final byte[] mBody;
  private final Map<String, String> mHeaders;
  private final int mStatus;

  public TransportMessage(int paramInt, Map<String, String> paramMap, byte[] paramArrayOfByte)
  {
    this.mStatus = paramInt;
    this.mHeaders = paramMap;
    this.mBody = paramArrayOfByte;
  }

  public byte[] getBody()
  {
    return this.mBody;
  }

  public Map<String, String> getHeaders()
  {
    return this.mHeaders;
  }

  public int getStatus()
  {
    return this.mStatus;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.TransportMessage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
