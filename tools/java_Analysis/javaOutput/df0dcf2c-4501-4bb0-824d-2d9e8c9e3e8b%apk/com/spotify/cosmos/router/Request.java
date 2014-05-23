package com.spotify.cosmos.router;

import com.spotify.cosmos.annotations.UsedFromNativeCode;
import java.util.HashMap;
import java.util.Map;

public class Request
{
  public static final String DELETE = "DELETE";
  public static final byte[] EMPTY_BODY = new byte[0];
  public static final String GET = "GET";
  public static final String POST = "POST";
  public static final String PUT = "PUT";
  public static final String SUB = "SUB";
  private String mAction;
  private byte[] mBody;
  private Map<String, String> mHeaders;
  private String mUri;

  public Request()
  {
  }

  public Request(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, new HashMap(), EMPTY_BODY);
  }

  public Request(String paramString1, String paramString2, Map<String, String> paramMap, byte[] paramArrayOfByte)
  {
    if (paramString2 == null)
      throw new IllegalArgumentException("URI cannot be null");
    if (paramString2.length() == 0)
      throw new IllegalArgumentException("URI cannot be empty");
    this.mHeaders = paramMap;
    this.mAction = paramString1;
    this.mUri = paramString2;
    this.mBody = paramArrayOfByte;
  }

  @UsedFromNativeCode
  private byte[] getHeadersArray()
  {
    return NativeHelpers.mapToByteArray(this.mHeaders);
  }

  public String getAction()
  {
    return this.mAction;
  }

  public byte[] getBody()
  {
    return this.mBody;
  }

  public Map<String, String> getHeaders()
  {
    return this.mHeaders;
  }

  public String getUri()
  {
    return this.mUri;
  }

  public void setAction(String paramString)
  {
    this.mAction = paramString;
  }

  public void setBody(byte[] paramArrayOfByte)
  {
    this.mBody = paramArrayOfByte;
  }

  public void setHeaders(Map<String, String> paramMap)
  {
    this.mHeaders = paramMap;
  }

  public void setUri(String paramString)
  {
    this.mUri = paramString;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.router.Request
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
