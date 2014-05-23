package com.spotify.cosmos.smash.util;

import com.spotify.cosmos.smash.TransportMessage;
import java.nio.charset.Charset;

public class StringParser extends HttpParser<String>
{
  public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
  private Charset mCharset;

  public StringParser()
  {
    this(DEFAULT_CHARSET);
  }

  public StringParser(Charset paramCharset)
  {
    this.mCharset = paramCharset;
  }

  protected String onTransportSuccess(TransportMessage paramTransportMessage)
  {
    if (paramTransportMessage.getBody() == null)
      return null;
    return new String(paramTransportMessage.getBody(), this.mCharset);
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.util.StringParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
