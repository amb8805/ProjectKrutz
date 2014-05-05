import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.util.EntityUtils;

public final class cl
{
  public static final String a = a((byte)7, k);
  public static final String b = a((byte)7, j);
  private static final Random d = new Random();
  private static final ct e = new ct("-._~", false);
  private static byte[] f = { -29, -88, -64, -95, -61, -89, -44, -68, -88, -98, -32, -63, -30, -96, -100, -63, -98, -80, -31, -97 };
  private static byte[] g = { -44, -77, -93, -31, -35, -47, -48, -76, -76, -93, -78, -48, -32, -61, -86, -35, -56, -81, -33, -27, -93, -87, -81, -61, -94, -65, -47, -49, -97, -66, -66, -53, -61, -84, -67, -96, -58, -64, -94, -33, -91, -99, -93 };
  private static String h = a((byte)22, f);
  private static String i = a((byte)22, g);
  private static byte[] j = { -110, -93, -103, -108, -92, -42, -66, -58, -114, -77, -74, -103, -100, -99, -41, -68, -73, -95, -83, -95, -95, -91, -50, -110, -108, -83, -47, -83, -106, -79, -104, -81, -92, -93, -61, -44, -104, -113, -66, -79, -104 };
  private static byte[] k = { -102, -50, -74, -108, -107, -107, -102, -67, -104, -58, -71, -64, -75, -72, -58, -98, -71, -68, -90, -60, -49, -96 };
  public final ac c;
  private final int l;
  private final String m;
  private final String n;
  private final String o;

  public cl(ac paramac)
  {
    this(paramac, 1, null, h, i);
  }

  private cl(ac paramac, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.c = paramac;
    this.l = paramInt;
    this.m = paramString1;
    this.n = paramString2;
    this.o = paramString3;
  }

  public cl(ac paramac, String paramString)
  {
    this(paramac, 2, paramString, h, i);
  }

  public cl(ac paramac, String paramString1, String paramString2)
  {
    this(null, 1, null, paramString1, paramString2);
  }

  private static String a(byte paramByte, byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length);
    int i1 = paramArrayOfByte.length;
    for (int i2 = 0; i2 < i1; i2++)
      localStringBuilder.append((char)(paramByte - paramArrayOfByte[i2]));
    return localStringBuilder.toString();
  }

  public static String a(String paramString)
  {
    if (paramString == null)
      return "";
    return e.a(paramString);
  }

  private static String a(String paramString1, String paramString2, String paramString3)
  {
    if (paramString3 == null);
    for (String str1 = ""; ; str1 = paramString3)
      try
      {
        SecretKeySpec localSecretKeySpec = new SecretKeySpec((cr.a(paramString2) + "&" + cr.a(str1)).getBytes("UTF8"), "HmacSHA1");
        Mac localMac = Mac.getInstance("HmacSHA1");
        localMac.init(localSecretKeySpec);
        String str2 = cr.a(new String(ck.a(localMac.doFinal(paramString1.getBytes("UTF8"))), "UTF8"));
        return str2;
      }
      catch (InvalidKeyException localInvalidKeyException)
      {
        return "";
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        return "";
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        return "";
      }
  }

  private static String a(HttpRequestBase paramHttpRequestBase, ac paramac, long paramLong, String paramString1, String paramString2, HttpEntity paramHttpEntity)
  {
    String str2;
    String str1;
    if (paramac != null)
    {
      String str6 = paramac.b;
      str2 = paramac.a;
      str1 = str6;
    }
    String str3;
    String str4;
    String str5;
    while (true)
    {
      str3 = String.valueOf(System.nanoTime()) + String.valueOf(Math.abs(d.nextLong()));
      str4 = Long.toString((paramLong + System.currentTimeMillis()) / 1000L);
      str5 = a(a(paramHttpRequestBase, paramString1, str1, str3, str4, paramHttpEntity), paramString2, str2);
      if (str1 != null)
        break;
      return String.format("OAuth realm=\"%s\", oauth_version=\"%s\", oauth_nonce=\"%s\", oauth_timestamp=\"%s\", oauth_signature=\"%s\", oauth_consumer_key=\"%s\", oauth_signature_method=\"%s\"", new Object[] { "http://api.twitter.com/", "1.0", str3, str4, str5, paramString1, "HMAC-SHA1" });
      str1 = null;
      str2 = null;
    }
    return String.format("OAuth realm=\"%s\", oauth_version=\"%s\", oauth_token=\"%s\", oauth_nonce=\"%s\", oauth_timestamp=\"%s\", oauth_signature=\"%s\", oauth_consumer_key=\"%s\", oauth_signature_method=\"%s\"", new Object[] { "http://api.twitter.com/", "1.0", str1, str3, str4, str5, paramString1, "HMAC-SHA1" });
  }

  private static String a(HttpRequestBase paramHttpRequestBase, String paramString1, String paramString2, String paramString3, String paramString4, HttpEntity paramHttpEntity)
  {
    localURI = paramHttpRequestBase.getURI();
    String str1 = localURI.getRawQuery();
    localStringBuilder1 = new StringBuilder();
    if (str1 != null)
      localStringBuilder1.append(str1);
    if (paramHttpEntity != null)
    {
      Header localHeader = paramHttpEntity.getContentType();
      if ((localHeader != null) && ("application/x-www-form-urlencoded".equals(localHeader.getValue())))
        try
        {
          String str3 = EntityUtils.toString(paramHttpEntity);
          if (!TextUtils.isEmpty(localStringBuilder1))
            localStringBuilder1.append("&");
          localStringBuilder1.append(str3);
          TreeMap localTreeMap = a(localStringBuilder1.toString(), true);
          localTreeMap.put("oauth_consumer_key", paramString1);
          localTreeMap.put("oauth_nonce", paramString3);
          localTreeMap.put("oauth_signature_method", "HMAC-SHA1");
          localTreeMap.put("oauth_timestamp", paramString4);
          localTreeMap.put("oauth_version", "1.0");
          if (paramString2 != null)
            localTreeMap.put("oauth_token", paramString2);
          StringBuilder localStringBuilder2 = new StringBuilder(paramHttpRequestBase.getMethod());
          String str2 = localURI.getScheme() + "://" + localURI.getHost() + localURI.getPath();
          localStringBuilder2.append("&").append(a(str2)).append("&");
          int i1 = localTreeMap.size();
          Iterator localIterator = localTreeMap.entrySet().iterator();
          int i3;
          for (int i2 = 0; localIterator.hasNext(); i2 = i3)
          {
            Map.Entry localEntry = (Map.Entry)localIterator.next();
            localStringBuilder2.append(a(a((String)localEntry.getKey()))).append("%3D").append(a(a((String)localEntry.getValue())));
            i3 = i2 + 1;
            if (i3 < i1)
              localStringBuilder2.append("%26");
          }
          return localStringBuilder2.toString();
        }
        catch (IOException localIOException)
        {
          break label101;
        }
    }
  }

  public static TreeMap a(String paramString, boolean paramBoolean)
  {
    TreeMap localTreeMap = new TreeMap();
    if (paramString != null)
    {
      String[] arrayOfString1 = paramString.split("&");
      int i1 = arrayOfString1.length;
      int i2 = 0;
      if (i2 < i1)
      {
        String[] arrayOfString2 = arrayOfString1[i2].split("=");
        if (arrayOfString2.length == 2)
          localTreeMap.put(cr.b(arrayOfString2[0]), cr.b(arrayOfString2[1]));
        while (true)
        {
          i2++;
          break;
          if (!TextUtils.isEmpty(arrayOfString2[0]))
            localTreeMap.put(cr.b(arrayOfString2[0]), "");
        }
      }
    }
    return localTreeMap;
  }

  public final void a(HttpRequestBase paramHttpRequestBase, long paramLong, HttpEntity paramHttpEntity)
  {
    int i1 = this.l;
    ac localac = this.c;
    if (i1 == 1)
      paramHttpRequestBase.setHeader("Authorization", a(paramHttpRequestBase, localac, paramLong, this.n, this.o, paramHttpEntity));
    while (i1 != 2)
      return;
    String str1 = this.m;
    String str2 = a(new HttpGet(str1), localac, paramLong, this.n, this.o, paramHttpEntity);
    paramHttpRequestBase.setHeader("X-Auth-Service-Provider", str1);
    paramHttpRequestBase.setHeader("X-Verify-Credentials-Authorization", str2);
  }
}

/* Location:
 * Qualified Name:     cl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
