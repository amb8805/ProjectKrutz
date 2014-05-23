package com.c.a.a;

import java.io.IOException;
import java.net.ConnectException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.protocol.HttpContext;

final class c
  implements Runnable
{
  private final AbstractHttpClient a;
  private final HttpContext b;
  private final HttpUriRequest c;
  private final d d;
  private boolean e;
  private int f;

  public c(AbstractHttpClient paramAbstractHttpClient, HttpContext paramHttpContext, HttpUriRequest paramHttpUriRequest, d paramd)
  {
    this.a = paramAbstractHttpClient;
    this.b = paramHttpContext;
    this.c = paramHttpUriRequest;
    this.d = paramd;
    if ((paramd instanceof e))
      this.e = true;
  }

  public final void run()
  {
    try
    {
      if (this.d != null)
        this.d.a();
      HttpRequestRetryHandler localHttpRequestRetryHandler = this.a.getHttpRequestRetryHandler();
      boolean bool = true;
      Object localObject1 = null;
      Object localObject2;
      while (bool)
        try
        {
          if (!Thread.currentThread().isInterrupted())
          {
            HttpResponse localHttpResponse = this.a.execute(this.c, this.b);
            if ((!Thread.currentThread().isInterrupted()) && (this.d != null))
              this.d.a(localHttpResponse);
          }
          if (this.d == null)
            return;
          this.d.b();
          return;
        }
        catch (IOException localIOException2)
        {
          int j = 1 + this.f;
          this.f = j;
          bool = localHttpRequestRetryHandler.retryRequest(localIOException2, j, this.b);
        }
        catch (NullPointerException localNullPointerException)
        {
          IOException localIOException3 = new IOException("NPE in HttpClient" + localNullPointerException.getMessage());
          int i = 1 + this.f;
          this.f = i;
          bool = localHttpRequestRetryHandler.retryRequest(localIOException3, i, this.b);
          localObject2 = localIOException3;
        }
      ConnectException localConnectException = new ConnectException();
      localConnectException.initCause(localObject2);
      throw localConnectException;
    }
    catch (IOException localIOException1)
    {
      if (this.d != null)
      {
        this.d.b();
        if (this.e)
        {
          this.d.a(localIOException1, null);
          return;
        }
        this.d.b(localIOException1, null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.c.a.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
