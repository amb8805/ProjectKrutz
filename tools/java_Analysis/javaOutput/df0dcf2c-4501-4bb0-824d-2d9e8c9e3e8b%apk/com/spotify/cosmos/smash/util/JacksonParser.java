package com.spotify.cosmos.smash.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.smash.TransportMessage;
import java.lang.reflect.Constructor;

public class JacksonParser<T extends JacksonModel> extends HttpParser<T>
{
  private Class<T> mObjectClass;
  private ObjectMapper mObjectMapper;

  public JacksonParser(ObjectMapper paramObjectMapper, Class<T> paramClass)
  {
    this.mObjectMapper = paramObjectMapper;
    this.mObjectClass = paramClass;
  }

  public JacksonParser(Class<T> paramClass)
  {
    this(new ObjectMapper(), paramClass);
  }

  public static <T extends JacksonModel> JacksonParser<T> create(ObjectMapper paramObjectMapper, Class<T> paramClass)
  {
    return new JacksonParser(paramObjectMapper, paramClass);
  }

  public static <T extends JacksonModel> JacksonParser<T> create(Class<T> paramClass)
  {
    return new JacksonParser(paramClass);
  }

  protected T onTransportSuccess(TransportMessage paramTransportMessage)
  {
    if (paramTransportMessage.getBody() == null)
      return null;
    try
    {
      if (paramTransportMessage.getBody().length == 0)
        return (JacksonModel)this.mObjectClass.getConstructor(new Class[0]).newInstance(new Object[0]);
      JacksonModel localJacksonModel = (JacksonModel)this.mObjectMapper.readValue(paramTransportMessage.getBody(), this.mObjectClass);
      return localJacksonModel;
    }
    catch (Exception localException)
    {
      throw new ParserException(localException);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.util.JacksonParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
