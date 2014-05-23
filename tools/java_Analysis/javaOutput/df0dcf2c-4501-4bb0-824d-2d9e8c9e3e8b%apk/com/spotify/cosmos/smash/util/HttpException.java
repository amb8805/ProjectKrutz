package com.spotify.cosmos.smash.util;

public class HttpException extends ParserException
{
  private int mStatus;

  public HttpException(int paramInt)
  {
    super("HTTP status code " + paramInt);
    this.mStatus = paramInt;
    if ((paramInt >= 200) && (paramInt <= 299))
      throw new IllegalArgumentException("Status code " + paramInt + " is not an error");
  }

  public int getStatus()
  {
    return this.mStatus;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.util.HttpException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
