package com.spotify.cosmos.android.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonSerializer
{
  private static ObjectMapper sObjectMapper = null;

  public JacksonSerializer()
  {
  }

  private static ObjectMapper getObjectMapper()
  {
    if (sObjectMapper == null)
    {
      ObjectMapper localObjectMapper = new ObjectMapper();
      sObjectMapper = localObjectMapper;
      localObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
    return sObjectMapper;
  }

  public static <T extends JacksonModel> byte[] toBytes(T paramT)
  {
    return toBytes(paramT, null);
  }

  public static <T extends JacksonModel> byte[] toBytes(T paramT, ObjectMapper paramObjectMapper)
  {
    if (paramObjectMapper == null)
      paramObjectMapper = getObjectMapper();
    return paramObjectMapper.writeValueAsString(paramT).getBytes();
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.util.JacksonSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
