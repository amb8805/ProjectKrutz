package com.c.a.a;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.http.HttpEntity;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.SyncBasicHttpContext;

public final class a
{
  private static int a = 10;
  private static int b = 10000;
  private final DefaultHttpClient c;
  private final HttpContext d;
  private ThreadPoolExecutor e;
  private final Map<Context, List<WeakReference<Future<?>>>> f;
  private final Map<String, String> g;

  public a()
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    ConnManagerParams.setTimeout(localBasicHttpParams, b);
    ConnManagerParams.setMaxConnectionsPerRoute(localBasicHttpParams, new ConnPerRouteBean(a));
    ConnManagerParams.setMaxTotalConnections(localBasicHttpParams, 10);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, b);
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, b);
    HttpConnectionParams.setTcpNoDelay(localBasicHttpParams, true);
    HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, 8192);
    HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
    HttpProtocolParams.setUserAgent(localBasicHttpParams, String.format("android-async-http/%s (http://loopj.com/android-async-http)", new Object[] { "1.4.1" }));
    SchemeRegistry localSchemeRegistry = new SchemeRegistry();
    localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    localSchemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
    ThreadSafeClientConnManager localThreadSafeClientConnManager = new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry);
    this.d = new SyncBasicHttpContext(new BasicHttpContext());
    this.c = new DefaultHttpClient(localThreadSafeClientConnManager, localBasicHttpParams);
    this.c.addRequestInterceptor(new a.1(this));
    this.c.addResponseInterceptor(new a.2(this));
    this.c.setHttpRequestRetryHandler(new i());
    this.e = ((ThreadPoolExecutor)Executors.newCachedThreadPool());
    this.f = new WeakHashMap();
    this.g = new HashMap();
  }

  private void a(DefaultHttpClient paramDefaultHttpClient, HttpContext paramHttpContext, HttpUriRequest paramHttpUriRequest, d paramd)
  {
    this.e.submit(new c(paramDefaultHttpClient, paramHttpContext, paramHttpUriRequest, paramd));
  }

  private void c(String paramString, g paramg, d paramd)
  {
    DefaultHttpClient localDefaultHttpClient = this.c;
    HttpContext localHttpContext = this.d;
    if (paramg != null)
    {
      String str = paramg.b();
      paramString = paramString + "?" + str;
    }
    a(localDefaultHttpClient, localHttpContext, new HttpGet(paramString), paramd);
  }

  private void d(String paramString, g paramg, d paramd)
  {
    HttpEntity localHttpEntity = null;
    if (paramg != null)
      localHttpEntity = paramg.a();
    DefaultHttpClient localDefaultHttpClient = this.c;
    HttpContext localHttpContext = this.d;
    HttpPost localHttpPost = new HttpPost(paramString);
    if (localHttpEntity != null)
      localHttpPost.setEntity(localHttpEntity);
    a(localDefaultHttpClient, localHttpContext, localHttpPost, paramd);
  }

  public final HttpClient a()
  {
    return this.c;
  }

  public final void a(String paramString, d paramd)
  {
    c(paramString, null, paramd);
  }

  public final void a(String paramString, g paramg, d paramd)
  {
    c(paramString, paramg, paramd);
  }

  public final void b(String paramString, d paramd)
  {
    d(paramString, null, paramd);
  }

  public final void b(String paramString, g paramg, d paramd)
  {
    d(paramString, paramg, paramd);
  }
}

/* Location:
 * Qualified Name:     com.c.a.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
