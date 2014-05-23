package com.spotify.cosmos.smash.util;

import com.spotify.cosmos.smash.Parser;
import com.spotify.cosmos.smash.TransportMessage;

public abstract class HttpParser<T>
  implements Parser<T>
{
  public HttpParser()
  {
  }

  protected boolean isHttpError(TransportMessage paramTransportMessage)
  {
    if (paramTransportMessage == null);
    int i;
    do
    {
      return false;
      i = paramTransportMessage.getStatus();
    }
    while ((i >= 200) && (i <= 299));
    return true;
  }

  protected T onTransportFailure(TransportMessage paramTransportMessage)
  {
    throw new HttpException(paramTransportMessage.getStatus());
  }

  protected abstract T onTransportSuccess(TransportMessage paramTransportMessage);

  public final T parseTransportMessage(TransportMessage paramTransportMessage)
  {
    if (isHttpError(paramTransportMessage))
      return onTransportFailure(paramTransportMessage);
    return onTransportSuccess(paramTransportMessage);
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.util.HttpParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
