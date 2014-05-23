package com.spotify.cosmos.android.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonParser<T extends JacksonModel>
{
  private Class<T> mObjectClass;
  private ObjectMapper mObjectMapper;

  public JacksonParser(ObjectMapper paramObjectMapper, Class<T> paramClass)
  {
    this.mObjectMapper = paramObjectMapper;
    this.mObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
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

  ObjectMapper getObjectMapper()
  {
    return this.mObjectMapper;
  }

  public T parseFromBytes(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    try
    {
      JacksonModel localJacksonModel = (JacksonModel)this.mObjectMapper.readValue(paramArrayOfByte, this.mObjectClass);
      return localJacksonModel;
    }
    catch (Exception localException)
    {
      throw new ParserException(localException);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.util.JacksonParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
