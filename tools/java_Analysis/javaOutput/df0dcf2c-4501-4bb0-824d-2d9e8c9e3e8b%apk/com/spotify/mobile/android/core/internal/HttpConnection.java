package com.spotify.mobile.android.core.internal;

import android.net.http.AndroidHttpClient;
import android.text.TextUtils;
import com.spotify.mobile.android.util.bp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class HttpConnection
{
  protected static final int kDelete = 8;
  protected static final int kErrorClassHttp = 300;
  protected static final int kErrorHttpAborted = 311;
  protected static final int kErrorHttpBadRange = 305;
  protected static final int kErrorHttpBadReply = 304;
  protected static final int kErrorHttpBadTransferEncoding = 307;
  protected static final int kErrorHttpConnectFail = 302;
  protected static final int kErrorHttpConnectTimeout = 301;
  protected static final int kErrorHttpFail = 309;
  protected static final int kErrorHttpGzipDecode = 310;
  protected static final int kErrorHttpInvalidUrl = 303;
  protected static final int kErrorHttpTimeout = 308;
  protected static final int kErrorHttpTooManyRedirects = 306;
  protected static final int kErrorSuccess = 0;
  protected static final int kGet = 1;
  protected static final int kMethodFlagMask = 15;
  protected static final int kPost = 2;
  protected static final int kUpdate = 4;
  private String mContentType = null;
  private int mErrorCode = 0;
  private int mFlags;
  private int mFrom = 0;
  private AndroidHttpClient mHttpClient;
  private HttpParams mParams;
  private String mPostData = null;
  private HttpUriRequest mRequest;
  private Map<String, String> mRequestHeaders = null;
  private HttpResponse mResponse;
  protected byte[] mResultData;
  private int mTo = 0;
  private String mUserAgent = null;
  private int nThis;

  public HttpConnection(int paramInt)
  {
    this.mFlags = paramInt;
    this.mHttpClient = AndroidHttpClient.newInstance("");
    this.mParams = new BasicHttpParams();
  }

  private native void notifyComplete();

  private int readBytes(byte[] paramArrayOfByte)
  {
    if ((this.mResponse == null) || (this.mResponse.getEntity() == null))
      return 0;
    try
    {
      InputStream localInputStream = this.mResponse.getEntity().getContent();
      localByteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte[8192];
      while (true)
      {
        int i = localInputStream.read(arrayOfByte, 0, 8192);
        if (i == -1)
          break;
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
    }
    catch (Exception localException)
    {
      ByteArrayOutputStream localByteArrayOutputStream;
      localException.printStackTrace();
      this.mErrorCode = 309;
      return 0;
      System.arraycopy(localByteArrayOutputStream.toByteArray(), 0, paramArrayOfByte, 0, paramArrayOfByte.length);
      int j = localByteArrayOutputStream.size();
      return j;
    }
    finally
    {
      this.mResponse.setEntity(null);
    }
  }

  public void abort()
  {
    this.mRequest.abort();
    this.mErrorCode = 311;
  }

  public int getErrorCode()
  {
    return this.mErrorCode;
  }

  public String getLocation()
  {
    if (this.mRequest != null)
      return this.mRequest.getURI().toString();
    return "";
  }

  public int getResourceSize()
  {
    if ((this.mResponse == null) || (this.mResponse.getEntity() == null))
      return 0;
    return (int)this.mResponse.getEntity().getContentLength();
  }

  public String getResponseHeader(String paramString)
  {
    if (this.mResponse != null)
    {
      Header localHeader = this.mResponse.getFirstHeader(paramString);
      if (localHeader != null)
        return localHeader.getValue();
    }
    return "";
  }

  public int getResultCode()
  {
    return this.mResponse.getStatusLine().getStatusCode();
  }

  public byte[] getResultData()
  {
    i = 0;
    if (this.mResultData != null)
      return this.mResultData;
    if ((this.mResponse == null) || (this.mResponse.getEntity() == null))
      return null;
    try
    {
      InputStream localInputStream = this.mResponse.getEntity().getContent();
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte1 = new byte[8192];
      while (true)
      {
        int j = localInputStream.read(arrayOfByte1, 0, 8192);
        if (j == -1)
          break;
        localByteArrayOutputStream.write(arrayOfByte1, 0, j);
        i += j;
      }
      if (i > 0)
      {
        byte[] arrayOfByte2 = localByteArrayOutputStream.toByteArray();
        return arrayOfByte2;
      }
      return null;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        this.mErrorCode = 309;
        this.mResponse.setEntity(null);
        this.mHttpClient.close();
      }
    }
    finally
    {
      this.mResponse.setEntity(null);
      this.mHttpClient.close();
    }
  }

  public boolean isRequestStarted()
  {
    return this.mRequest != null;
  }

  public void openUrl(String paramString)
  {
    if ((0xF & this.mFlags) == 0)
    {
      if (this.mPostData != null)
        this.mFlags = (0x2 | this.mFlags);
    }
    else
      label27: if ((0x3 & this.mFlags) == 3)
        if (TextUtils.isEmpty(this.mPostData))
          break label137;
    label137: for (this.mFlags = (0xFFFFFFFE & this.mFlags); ; this.mFlags = (0xFFFFFFFD & this.mFlags))
      switch (0xF & this.mFlags)
      {
      case 3:
      case 5:
      case 6:
      case 7:
      default:
        this.mErrorCode = 309;
        notifyComplete();
        return;
        this.mFlags = (0x1 | this.mFlags);
        break label27;
      case 1:
      case 2:
      case 4:
      case 8:
      }
    while (true)
    {
      try
      {
        this.mRequest = new HttpGet(paramString);
        if ((this.mFrom != 0) || (this.mTo != 0))
        {
          localHttpUriRequest = this.mRequest;
          arrayOfObject = new Object[2];
          arrayOfObject[0] = Integer.valueOf(this.mFrom);
          arrayOfObject[1] = Integer.valueOf(this.mTo);
          localHttpUriRequest.setHeader("Range", String.format("bytes=%d-%d", arrayOfObject));
        }
        if (this.mUserAgent != null)
          this.mRequest.setHeader("User-Agent", this.mUserAgent);
        if (this.mRequestHeaders == null)
          break label546;
        localIterator = this.mRequestHeaders.entrySet().iterator();
        while (localIterator.hasNext())
        {
          localEntry = (Map.Entry)localIterator.next();
          this.mRequest.setHeader((String)localEntry.getKey(), (String)localEntry.getValue());
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException4)
      {
        bp.a(localIllegalArgumentException4, "Error when trying to create HttpGet(%s).", new Object[] { paramString });
        this.mErrorCode = 303;
        notifyComplete();
        return;
      }
      try
      {
        HttpUriRequest localHttpUriRequest;
        Object[] arrayOfObject;
        Iterator localIterator;
        Map.Entry localEntry;
        HttpPost localHttpPost = new HttpPost(paramString);
        this.mRequest = localHttpPost;
        try
        {
          localHttpPost.setEntity(new StringEntity(this.mPostData));
          if (this.mContentType == null)
            continue;
          this.mRequest.setHeader("Content-Type", this.mContentType);
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          this.mErrorCode = 309;
          notifyComplete();
          return;
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException3)
      {
        bp.a(localIllegalArgumentException3, "Error when trying to create HttpPost(%s).", new Object[] { paramString });
        this.mErrorCode = 303;
        notifyComplete();
        return;
      }
      try
      {
        this.mRequest = new HttpConnection.1(this, paramString);
      }
      catch (IllegalArgumentException localIllegalArgumentException2)
      {
        bp.a(localIllegalArgumentException2, "Error when trying to create UPDATE HttpGet(%s).", new Object[] { paramString });
        this.mErrorCode = 303;
        notifyComplete();
        return;
      }
      try
      {
        this.mRequest = new HttpDelete(paramString);
      }
      catch (IllegalArgumentException localIllegalArgumentException1)
      {
        bp.a(localIllegalArgumentException1, "Error when trying to create HttpDelete(%s).", new Object[] { paramString });
        this.mErrorCode = 303;
        notifyComplete();
        return;
      }
    }
    label546: this.mRequest.setParams(this.mParams);
    new HttpConnection.2(this).start();
  }

  public void setConnectTimeout(int paramInt)
  {
    HttpConnectionParams.setConnectionTimeout(this.mParams, paramInt);
  }

  public void setContentType(String paramString)
  {
    this.mContentType = paramString;
  }

  public void setPostData(String paramString)
  {
    this.mPostData = paramString;
  }

  public void setRequestHeader(String paramString1, String paramString2)
  {
    if (this.mRequestHeaders == null)
      this.mRequestHeaders = new HashMap();
    this.mRequestHeaders.put(paramString1, paramString2);
  }

  public void setRequestRange(int paramInt1, int paramInt2)
  {
    this.mFrom = paramInt1;
    this.mTo = paramInt2;
  }

  public void setTimeout(int paramInt)
  {
    HttpConnectionParams.setSoTimeout(this.mParams, paramInt);
  }

  public void setUserAgent(String paramString)
  {
    this.mUserAgent = paramString;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.core.internal.HttpConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
