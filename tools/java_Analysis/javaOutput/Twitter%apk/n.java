import android.util.Log;
import java.io.Closeable;;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.RequestAddCookies;
import org.apache.http.client.protocol.ResponseProcessCookies;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class n
{
  public static final SchemeRegistry a;
  public static final HttpParams b;
  private static final boolean g = Log.isLoggable("HttpOperation", 3);
  private static final bv h;
  private static AtomicLong i;
  private static final aq[] j;
  public int c;
  public String d;
  public Exception e;
  public ao f;
  private final HttpRequestBase k;
  private final HttpClient l;
  private final byte[] m = new byte[2048];
  private final OutputStream n;
  private final bf o;
  private aq[] p;

  static
  {
    a = new SchemeRegistry();
    b = new BasicHttpParams();
    h = new bv("EEE, dd MMM yyyy HH:mm:ss zzz");
    i = new AtomicLong(0L);
    j = new aq[0];
    HttpConnectionParams.setSoTimeout(b, 90000);
    HttpConnectionParams.setConnectionTimeout(b, 20000);
    HttpConnectionParams.setSocketBufferSize(b, 8192);
    a.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    a.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
  }

  public n(HttpClient paramHttpClient, HttpRequestBase paramHttpRequestBase, OutputStream paramOutputStream)
  {
    this(paramHttpClient, paramHttpRequestBase, paramOutputStream, null);
  }

  public n(HttpClient paramHttpClient, HttpRequestBase paramHttpRequestBase, OutputStream paramOutputStream, bf parambf)
  {
    paramHttpRequestBase.addHeader("Accept-Encoding", "gzip");
    this.l = paramHttpClient;
    this.k = paramHttpRequestBase;
    this.n = paramOutputStream;
    this.o = parambf;
  }

  public static n a(ai paramai, HttpClient paramHttpClient, CharSequence paramCharSequence, cl paramcl, OutputStream paramOutputStream)
  {
    return a(paramai, paramHttpClient, paramCharSequence, paramcl, null, paramOutputStream);
  }

  public static n a(ai paramai, HttpClient paramHttpClient, CharSequence paramCharSequence, cl paramcl, ArrayList paramArrayList, OutputStream paramOutputStream)
  {
    if (paramArrayList != null)
      try
      {
        UrlEncodedFormEntity localUrlEncodedFormEntity2 = new UrlEncodedFormEntity(paramArrayList, "UTF-8");
        localUrlEncodedFormEntity1 = localUrlEncodedFormEntity2;
        return a(paramai, paramHttpClient, paramCharSequence, paramcl, localUrlEncodedFormEntity1, paramOutputStream);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
      }
    while (true)
      UrlEncodedFormEntity localUrlEncodedFormEntity1 = null;
  }

  public static n a(ai paramai, HttpClient paramHttpClient, CharSequence paramCharSequence, cl paramcl, HttpEntity paramHttpEntity, OutputStream paramOutputStream)
  {
    HttpPost localHttpPost = new HttpPost(paramCharSequence.toString());
    if (paramHttpEntity != null)
      localHttpPost.setEntity(paramHttpEntity);
    bu localbu = new bu(paramHttpClient, localHttpPost, paramcl, paramOutputStream);
    paramai.a(localbu);
    return localbu;
  }

  public static n a(ai paramai, HttpClient paramHttpClient, CharSequence paramCharSequence, cl paramcl, boolean paramBoolean, OutputStream paramOutputStream)
  {
    dc localdc = new dc(paramHttpClient, new HttpGet(paramCharSequence.toString()), paramcl, paramOutputStream);
    if (paramBoolean)
    {
      localdc.k.addHeader("X-Twitter-Polling", "True");
      paramai.a(localdc);
      return localdc;
    }
    paramai.a(localdc);
    return localdc;
  }

  public static n a(ai paramai, HttpClient paramHttpClient, CharSequence paramCharSequence, OutputStream paramOutputStream)
  {
    n localn = new n(paramHttpClient, new HttpGet(paramCharSequence.toString()), paramOutputStream);
    paramai.a(localn);
    return localn;
  }

  public static HttpClient a(ClientConnectionManager paramClientConnectionManager)
  {
    DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient(paramClientConnectionManager, b);
    localDefaultHttpClient.removeRequestInterceptorByClass(RequestAddCookies.class);
    localDefaultHttpClient.removeResponseInterceptorByClass(ResponseProcessCookies.class);
    localDefaultHttpClient.setKeepAliveStrategy(new cw());
    return localDefaultHttpClient;
  }

  private void a(HttpResponse paramHttpResponse, OutputStream paramOutputStream)
  {
    HttpEntity localHttpEntity = paramHttpResponse.getEntity();
    if ((localHttpEntity == null) || (!localHttpEntity.isStreaming()));
    label43: label698: label702: 
    while (true)
    {
      return;
      String str1;
      InputStream localInputStream;
      String str2;
      int i1;
      if (localHttpEntity.getContentEncoding() != null)
      {
        str1 = localHttpEntity.getContentEncoding().getValue();
        localInputStream = localHttpEntity.getContent();
        str2 = localHttpEntity.getContentType().getValue();
        i1 = (int)localHttpEntity.getContentLength();
        if (g)
          Log.d("HttpOperation", "read: Encoding: " + str1 + ", type: " + str2 + ", length: " + i1);
        if ((paramOutputStream == null) || (this.o == null))
          break label698;
      }
      for (Object localObject1 = new de(paramOutputStream, i1, this.o); ; localObject1 = paramOutputStream)
      {
        if (str2 == null)
          break label702;
        int i2;
        Object localObject2;
        if ((str2.startsWith("application/octet-stream")) || (str2.startsWith("binary/octet-stream")))
        {
          i2 = i1;
          localObject2 = localInputStream;
        }
        byte[] arrayOfByte;
        while (true)
          while (true)
          {
            arrayOfByte = this.m;
            if (i2 < 0)
            {
              int i4 = 0;
              try
              {
                do
                {
                  int i5 = ((InputStream)localObject2).read(arrayOfByte, 0, arrayOfByte.length);
                  if (i5 == -1)
                    break;
                  if (localObject1 != null)
                    ((OutputStream)localObject1).write(arrayOfByte, 0, i5);
                  i4 += i5;
                }
                while (i4 <= 500000);
                throw new af("Content too large (length unknown): " + i4 + " (" + str2 + ")");
              }
              finally
              {
                while (((InputStream)localObject2).read(arrayOfByte, 0, arrayOfByte.length) != -1);
                cr.a((java.io.Closeable)localObject2);
                if (localObject1 == null);
              }
              try
              {
                ((OutputStream)localObject1).flush();
                ((OutputStream)localObject1).close();
                label336: throw localObject3;
                str1 = null;
                break label43;
                if (str2.startsWith("application/json"))
                {
                  if ((str1 != null) && (str1.equals("gzip")))
                  {
                    localObject2 = new GZIPInputStream(localInputStream);
                    i2 = -1;
                  }
                }
                else if ((str2.startsWith("text/html")) || (str2.startsWith("text/plain")) || (str2.startsWith("text/xml")) || (str2.startsWith("application/xml")))
                {
                  if ((str1 != null) && (str1.equals("gzip")))
                  {
                    localObject2 = new GZIPInputStream(localInputStream);
                    i2 = -1;
                  }
                }
                else if (!str2.startsWith("image/"))
                {
                  throw new IllegalArgumentException("Unsupported content type: " + str2);
                  if (i2 > 500000)
                    throw new af("Content too large: " + i2 + " (" + str2 + ")");
                  int i3;
                  do
                  {
                    if (i3 > 0)
                    {
                      i2 -= i3;
                      if (localObject1 != null)
                        ((OutputStream)localObject1).write(arrayOfByte, 0, i3);
                    }
                    if (i2 <= 0)
                      break;
                    i3 = ((InputStream)localObject2).read(arrayOfByte, 0, Math.min(i2, arrayOfByte.length));
                  }
                  while (i3 != -1);
                  throw new IOException("Invalid content length: " + i2);
                  while (((InputStream)localObject2).read(arrayOfByte, 0, arrayOfByte.length) != -1);
                  cr.a((java.io.Closeable)localObject2);
                  if (localObject1 == null)
                    break;
                  try
                  {
                    ((OutputStream)localObject1).flush();
                    ((OutputStream)localObject1).close();
                    return;
                  }
                  catch (IOException localIOException2)
                  {
                    return;
                  }
                }
              }
              catch (IOException localIOException1)
              {
                break label336;
                i2 = i1;
                localObject2 = localInputStream;
              }
            }
          }
      }
    }
  }

  public final n a()
  {
    return a(1);
  }

  public final n a(int paramInt)
  {
    Object localObject1 = null;
    SingleClientConnManager localSingleClientConnManager;
    HttpClient localHttpClient;
    OutputStream localOutputStream;
    HttpRequestBase localHttpRequestBase;
    ArrayList localArrayList;
    int i1;
    long l1;
    int i3;
    if (this.l == null)
    {
      localSingleClientConnManager = new SingleClientConnManager(b, a);
      localHttpClient = a(localSingleClientConnManager);
      while (true)
      {
        localOutputStream = this.n;
        localHttpRequestBase = this.k;
        localArrayList = new ArrayList(1 + Math.max(paramInt, 1));
        i1 = paramInt;
        a(i.get());
        if (g)
          Log.d("HttpOperation", localHttpRequestBase.getMethod() + " " + localHttpRequestBase.getURI());
        l1 = System.currentTimeMillis();
        try
        {
          localHttpResponse = localHttpClient.execute(localHttpRequestBase);
          StatusLine localStatusLine = localHttpResponse.getStatusLine();
          i3 = localStatusLine.getStatusCode();
          str2 = localStatusLine.getReasonPhrase();
          if (g)
          {
            Log.d("HttpOperation", i3 + "/" + str2 + " [" + localHttpRequestBase.getURI() + "]");
            break label757;
            while (true)
            {
              if (i1 > 0)
                break label588;
              localHeader2 = localHttpResponse.getFirstHeader("X-RateLimit-Limit");
              if (localHeader2 == null)
                break label570;
              i4 = Integer.valueOf(localHeader2.getValue()).intValue();
              localHeader3 = localHttpResponse.getFirstHeader("X-RateLimit-Remaining");
              if (localHeader3 == null)
                break label576;
              i5 = Integer.valueOf(localHeader3.getValue()).intValue();
              localHeader4 = localHttpResponse.getFirstHeader("X-RateLimit-Reset");
              if (localHeader4 == null)
                break label582;
              localao = new ao(i5, i4, 1000L * Long.valueOf(localHeader4.getValue()).longValue());
              this.f = localao;
              a(localHttpResponse, localOutputStream);
              System.currentTimeMillis();
              localObject3 = str2;
              i2 = i3;
              if (localSingleClientConnManager != null)
                localSingleClientConnManager.shutdown();
              this.c = i2;
              this.d = ((String)localObject3);
              this.e = localObject1;
              this.p = new aq[localArrayList.size()];
              return this;
              localHttpClient = this.l;
              localSingleClientConnManager = null;
              break;
              localHeader1 = localHttpResponse.getLastHeader("Date");
              if (localHeader1 != null)
              {
                l2 = h.parse(localHeader1.getValue()).getTime();
                l3 = System.currentTimeMillis();
                i.set(l2 - l3);
              }
            }
          }
        }
        catch (af localaf)
        {
          while (true)
          {
            HttpResponse localHttpResponse;
            String str2;
            if (g)
              Log.d("HttpOperation", localaf.getClass() + " " + localaf.getMessage() + " [" + localHttpRequestBase.getURI() + "]");
            localHttpRequestBase.abort();
            str1 = localaf.getMessage();
            System.currentTimeMillis();
            i2 = 417;
            localObject3 = str1;
            localObject1 = null;
            continue;
            localao = null;
            continue;
            localao = null;
            continue;
            localao = null;
            continue;
            a(localHttpResponse, null);
            l4 = System.currentTimeMillis() - l1;
            localaq = new aq(i3, str2);
            localaq.b = null;
            localaq.c = l4;
            localArrayList.add(new aq(i3, str2));
            i1--;
            if (i1 >= 0)
              break;
            localObject3 = str2;
            i2 = i3;
            localObject1 = null;
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            if (g)
              Log.d("HttpOperation", localException.getClass() + " " + localException.getMessage() + " [" + localHttpRequestBase.getURI() + "]");
            localHttpRequestBase.abort();
            System.currentTimeMillis();
            localObject3 = null;
            i2 = 0;
          }
        }
        finally
        {
          System.currentTimeMillis();
        }
      }
    }
    while (true)
    {
      Header localHeader2;
      int i4;
      Header localHeader3;
      int i5;
      Header localHeader4;
      ao localao;
      Object localObject3;
      int i2;
      Header localHeader1;
      long l2;
      long l3;
      String str1;
      label570: label576: label582: label588: long l4;
      aq localaq;
      label757: switch (i3)
      {
      case 500:
      case 502:
      case 503:
      case 401:
      }
      i1 = 0;
    }
  }

  protected void a(long paramLong)
  {
  }

  public final boolean b()
  {
    return this.c == 200;
  }

  public final aq[] c()
  {
    if (this.p == null)
      return j;
    return this.p;
  }

  public final HttpRequestBase d()
  {
    return this.k;
  }
}

/* Location:
 * Qualified Name:     n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
