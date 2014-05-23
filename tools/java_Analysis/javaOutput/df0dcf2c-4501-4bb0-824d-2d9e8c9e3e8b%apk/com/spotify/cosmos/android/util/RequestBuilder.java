package com.spotify.cosmos.android.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Request;
import java.util.HashMap;
import java.util.Map;

public class RequestBuilder
{
  private final Request mRequest;

  private RequestBuilder(String paramString1, String paramString2)
  {
    this.mRequest = new Request(paramString1, paramString2, new HashMap(), Request.EMPTY_BODY);
  }

  private RequestBuilder(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    this.mRequest = new Request(paramString1, paramString2, new HashMap(), paramArrayOfByte);
  }

  public static RequestBuilder delete(String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Cannot call delete with null URI");
    return new RequestBuilder("DELETE", paramString);
  }

  public static RequestBuilder get(String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Cannot call get with null URI");
    return new RequestBuilder("GET", paramString);
  }

  public static RequestBuilder post(String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Cannot call post with null URI");
    return new RequestBuilder("POST", paramString);
  }

  public static <T extends JacksonModel> RequestBuilder post(String paramString, T paramT)
  {
    return post(paramString, paramT, null);
  }

  public static <T extends JacksonModel> RequestBuilder post(String paramString, T paramT, ObjectMapper paramObjectMapper)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Cannot call post with null URI");
    if (paramT == null)
      throw new IllegalArgumentException("Cannot call post with null object");
    return new RequestBuilder("POST", paramString, JacksonSerializer.toBytes(paramT, paramObjectMapper));
  }

  public static RequestBuilder postBytes(String paramString, byte[] paramArrayOfByte)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Cannot call postBytes with null URI");
    return new RequestBuilder("POST", paramString, paramArrayOfByte);
  }

  public static RequestBuilder put(String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Cannot call put with null URI");
    return new RequestBuilder("PUT", paramString);
  }

  public static <T extends JacksonModel> RequestBuilder put(String paramString, T paramT)
  {
    return put(paramString, paramT, null);
  }

  public static <T extends JacksonModel> RequestBuilder put(String paramString, T paramT, ObjectMapper paramObjectMapper)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Cannot call put with null URI");
    if (paramT == null)
      throw new IllegalArgumentException("Cannot call put with null object");
    return new RequestBuilder("PUT", paramString, JacksonSerializer.toBytes(paramT, paramObjectMapper));
  }

  public static RequestBuilder putBytes(String paramString, byte[] paramArrayOfByte)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Cannot call putBytes with null URI");
    return new RequestBuilder("PUT", paramString, paramArrayOfByte);
  }

  public static RequestBuilder subscribe(String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Cannot call subscribe with null URI");
    return new RequestBuilder("SUB", paramString);
  }

  public static <T extends JacksonModel> RequestBuilder subscribe(String paramString, T paramT)
  {
    return subscribe(paramString, paramT, null);
  }

  public static <T extends JacksonModel> RequestBuilder subscribe(String paramString, T paramT, ObjectMapper paramObjectMapper)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Cannot call subscribe with null URI");
    if (paramT == null)
      throw new IllegalArgumentException("Cannot call subscribe with null object");
    return new RequestBuilder("SUB", paramString, JacksonSerializer.toBytes(paramT, paramObjectMapper));
  }

  public static RequestBuilder subscribeBytes(String paramString, byte[] paramArrayOfByte)
  {
    return new RequestBuilder("SUB", paramString, paramArrayOfByte);
  }

  public Request build()
  {
    return this.mRequest;
  }

  public RequestBuilder with(String paramString1, String paramString2)
  {
    this.mRequest.getHeaders().put(paramString1, paramString2);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.util.RequestBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
