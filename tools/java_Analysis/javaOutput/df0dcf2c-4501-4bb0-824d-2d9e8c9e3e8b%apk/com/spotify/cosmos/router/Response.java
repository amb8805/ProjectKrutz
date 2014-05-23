package com.spotify.cosmos.router;

import com.spotify.cosmos.annotations.CalledFromTestCases;
import com.spotify.cosmos.annotations.UsedFromNativeCode;
import java.util.Map;

public class Response
{
  private byte[] mBody;
  private Map<String, String> mHeaders;
  private int mStatus;
  private String mUri;

  @CalledFromTestCases
  public Response(int paramInt, String paramString, Map<String, String> paramMap, byte[] paramArrayOfByte)
  {
    this.mStatus = paramInt;
    this.mUri = paramString;
    this.mHeaders = paramMap;
    this.mBody = paramArrayOfByte;
  }

  @UsedFromNativeCode
  private Response(int paramInt, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    this.mStatus = paramInt;
    this.mUri = paramString;
    this.mHeaders = NativeHelpers.byteArrayToMap(paramArrayOfByte1);
    this.mBody = paramArrayOfByte2;
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

  public String getUri()
  {
    return this.mUri;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.router.Response
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
