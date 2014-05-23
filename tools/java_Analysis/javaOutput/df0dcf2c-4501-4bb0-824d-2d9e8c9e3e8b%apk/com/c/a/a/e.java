package com.c.a.a;

import android.os.Message;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.util.EntityUtils;

public final class e extends d
{
  private static String[] a = { "image/jpeg", "image/png" };

  public e()
  {
  }

  protected final void a(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      super.a(paramMessage);
      return;
    case 0:
    case 1:
    }
  }

  protected final void a(Throwable paramThrowable, byte[] paramArrayOfByte)
  {
    b(a(1, new Object[] { paramThrowable, paramArrayOfByte }));
  }

  final void a(HttpResponse paramHttpResponse)
  {
    StatusLine localStatusLine = paramHttpResponse.getStatusLine();
    Header[] arrayOfHeader = paramHttpResponse.getHeaders("Content-Type");
    if (arrayOfHeader.length != 1)
    {
      a(new HttpResponseException(localStatusLine.getStatusCode(), "None, or more than one, Content-Type Header found!"), null);
      return;
    }
    Header localHeader = arrayOfHeader[0];
    String[] arrayOfString = a;
    int i = arrayOfString.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      if (arrayOfString[j].equals(localHeader.getValue()))
        k = 1;
      j++;
    }
    if (k == 0)
    {
      a(new HttpResponseException(localStatusLine.getStatusCode(), "Content-Type not allowed!"), null);
      return;
    }
    try
    {
      HttpEntity localHttpEntity = paramHttpResponse.getEntity();
      if (localHttpEntity != null)
      {
        localBufferedHttpEntity = new BufferedHttpEntity(localHttpEntity);
        arrayOfByte2 = EntityUtils.toByteArray(localBufferedHttpEntity);
        arrayOfByte1 = arrayOfByte2;
        if (localStatusLine.getStatusCode() >= 300)
        {
          a(new HttpResponseException(localStatusLine.getStatusCode(), localStatusLine.getReasonPhrase()), arrayOfByte1);
          return;
        }
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        a(localIOException, null);
        arrayOfByte1 = null;
      }
      b(a(0, arrayOfByte1));
      return;
    }
    while (true)
    {
      byte[] arrayOfByte2;
      byte[] arrayOfByte1;
      BufferedHttpEntity localBufferedHttpEntity = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.c.a.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
