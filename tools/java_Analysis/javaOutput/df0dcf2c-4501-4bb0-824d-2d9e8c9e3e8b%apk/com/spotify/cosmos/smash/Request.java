package com.spotify.cosmos.smash;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class Request
{
  public static final String DELETE = "DELETE";
  public static final byte[] EMPTY_BODY = new byte[0];
  public static final String GET = "GET";
  public static final String POST = "POST";
  public static final String SUBSCRIBE = "SUB";
  public static final String UPDATE = "UPDATE";
  private final byte[] mBody;
  private final Map<String, String> mHeaders;
  private final String mMethod;
  private final String mUri;

  public Request(String paramString1, String paramString2)
  {
    this.mMethod = paramString1;
    this.mUri = paramString2;
    this.mHeaders = Collections.emptyMap();
    this.mBody = EMPTY_BODY;
  }

  public Request(String paramString1, String paramString2, Map<String, String> paramMap, byte[] paramArrayOfByte)
  {
    this.mMethod = paramString1;
    this.mUri = paramString2;
    this.mHeaders = paramMap;
    this.mBody = paramArrayOfByte;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    Request localRequest;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localRequest = (Request)paramObject;
      if (!Arrays.equals(this.mBody, localRequest.mBody))
        return false;
      if (!this.mHeaders.equals(localRequest.mHeaders))
        return false;
      if (!this.mMethod.equals(localRequest.mMethod))
        return false;
    }
    while (this.mUri.equals(localRequest.mUri));
    return false;
  }

  public byte[] getBody()
  {
    return this.mBody;
  }

  public Map<String, String> getHeaders()
  {
    return this.mHeaders;
  }

  public String getMethod()
  {
    return this.mMethod;
  }

  public String getUri()
  {
    return this.mUri;
  }

  public int hashCode()
  {
    return 31 * (31 * (31 * this.mMethod.hashCode() + this.mUri.hashCode()) + this.mHeaders.hashCode()) + Arrays.hashCode(this.mBody);
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.smash.Request
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
