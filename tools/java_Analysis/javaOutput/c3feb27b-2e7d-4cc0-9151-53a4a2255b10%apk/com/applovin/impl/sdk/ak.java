package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinLogger;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
class ak extends ar
{
  private final Socket a;

  ak(Socket paramSocket, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    super("HandleWebRequest", paramAppLovinSdkImpl);
    if (paramSocket == null)
      throw new IllegalArgumentException("No clientspecified");
    this.a = paramSocket;
  }

  private void a(String paramString)
  {
    int i = paramString.indexOf(' ');
    int j = paramString.indexOf(' ', i + 2);
    String str;
    if ((i > 0) && (j > i))
    {
      str = paramString.substring(i + 1, j);
      try
      {
        while (true)
        {
          List localList2 = URLEncodedUtils.parse(new URI(str), "utf-8");
          localList1 = localList2;
          this.f.d(this.d, "Handling request: " + str);
          if (!str.startsWith("/ad"))
            break;
          a(localList1);
          return;
          str = "";
        }
      }
      catch (Exception localException)
      {
        List localList1;
        while (true)
        {
          this.f.e(this.d, "Unable to parse query string", localException);
          localList1 = Collections.emptyList();
        }
        if (str.startsWith("/conv"))
        {
          b(localList1);
          return;
        }
        if (str.startsWith("/test.js"))
        {
          b();
          return;
        }
        a(new an(404, this.e, this.a), aq.a);
      }
    }
  }

  private void a(List paramList)
  {
    a(new al(this, AppLovinAdSize.fromString(b("size", paramList)), new am(this, paramList), this.e, paramList), aq.a);
  }

  private static String b(String paramString, List paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      NameValuePair localNameValuePair = (NameValuePair)localIterator.next();
      if (paramString.equals(localNameValuePair.getName()))
        return localNameValuePair.getValue();
    }
    return null;
  }

  private void b()
  {
    a(new an(200, "applovin_serverTest = '5.2.2';", "application/javascript", this.e, this.a), aq.a);
  }

  private void b(List paramList)
  {
    new bb(b("advertiser_id", paramList), this.e).run();
    a(new an(200, this.e, this.a), aq.a);
  }

  private static byte[] b(int paramInt1, int paramInt2, String paramString)
  {
    return ("HTTP/1.1 " + paramInt1 + " OK\r\n" + "Content-Type: " + paramString + "; charset=utf-8\r\n" + "Content-Length: " + paramInt2 + "\r\n" + "\r\n").getBytes();
  }

  private static byte[] b(int paramInt, String paramString)
  {
    return b(paramInt, 0, paramString);
  }

  private static String c(AppLovinAd paramAppLovinAd)
  {
    return paramAppLovinAd.getHtml().replace("applovin://com.applovin.sdk/adservice/track_click", paramAppLovinAd.getClickTrackerUrl());
  }

  private static String d(AppLovinAd paramAppLovinAd)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("html", paramAppLovinAd.getHtml());
      localJSONObject.put("redirect_urls", paramAppLovinAd.getDestinationUrls());
      localJSONObject.put("click_url", paramAppLovinAd.getClickTrackerUrl());
      String str = localJSONObject.toString();
      return str;
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException("Programming error: unable to create JSON message", localJSONException);
    }
  }

  public void run()
  {
    byte[] arrayOfByte = new byte[2048];
    try
    {
      int i = new BufferedInputStream(this.a.getInputStream(), 2048).read(arrayOfByte);
      if (i > 0);
      for (String str = new String(arrayOfByte, 0, i); ; str = "")
      {
        a(str);
        return;
      }
    }
    catch (IOException localIOException)
    {
      this.f.e(this.d, "Unable to communicate with the client", localIOException);
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
