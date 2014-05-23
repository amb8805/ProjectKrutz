package com.applovin.impl.adview;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinLogger;
import com.applovin.sdk.AppLovinSdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class y extends WebViewClient
{
  private final AppLovinSdk a;
  private final AppLovinLogger b;
  private AdViewControllerImpl c;

  public y(AdViewControllerImpl paramAdViewControllerImpl, AppLovinSdk paramAppLovinSdk)
  {
    this.a = paramAppLovinSdk;
    this.b = paramAppLovinSdk.getLogger();
    this.c = paramAdViewControllerImpl;
  }

  private Set a(Uri paramUri)
  {
    if (paramUri.isOpaque())
      throw new UnsupportedOperationException("This isn't a hierarchical URI.");
    String str = paramUri.getEncodedQuery();
    if (str == null)
      return Collections.emptySet();
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    int i = 0;
    do
    {
      int j = str.indexOf('&', i);
      if (j == -1)
        j = str.length();
      int k = str.indexOf('=', i);
      if ((k > j) || (k == -1))
        k = j;
      localLinkedHashSet.add(Uri.decode(str.substring(i, k)));
      i = j + 1;
    }
    while (i < str.length());
    return Collections.unmodifiableSet(localLinkedHashSet);
  }

  private void a(Uri paramUri, v paramv)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW", paramUri);
      paramv.getContext().startActivity(localIntent);
      return;
    }
    catch (Throwable localThrowable)
    {
      this.b.e("AdWebViewClient", "Unable to show \"" + paramUri + "\".", localThrowable);
    }
  }

  private void d(v paramv)
  {
    AppLovinAd localAppLovinAd = paramv.a();
    if (localAppLovinAd != null)
      this.c.a(localAppLovinAd);
  }

  void a(WebView paramWebView, String paramString)
  {
    this.b.d("AdWebViewClient", "Processing click on ad URL \"" + paramString + "\"");
    Uri localUri;
    v localv;
    String str3;
    if ((paramString != null) && ((paramWebView instanceof v)))
    {
      localUri = Uri.parse(paramString);
      localv = (v)paramWebView;
      String str1 = localUri.getScheme();
      String str2 = localUri.getHost();
      str3 = localUri.getPath();
      if ((!"applovin".equals(str1)) || (!"com.applovin.sdk".equals(str2)))
        break label544;
      if (!"/adservice/track_click".equals(str3))
        break label112;
      c(localv);
    }
    label112: List localList1;
    do
    {
      do
      {
        List localList2;
        do
        {
          return;
          if ("/adservice/next_ad".equals(str3))
          {
            a(localv);
            return;
          }
          if ("/adservice/close_ad".equals(str3))
          {
            b(localv);
            return;
          }
          if (!str3.startsWith("/launch/"))
            break;
          localList2 = localUri.getPathSegments();
        }
        while (localList2.size() <= 1);
        String str7 = (String)localList2.get(-1 + localList2.size());
        try
        {
          Context localContext = paramWebView.getContext();
          localContext.startActivity(localContext.getPackageManager().getLaunchIntentForPackage(str7));
          d(localv);
          return;
        }
        catch (Exception localException)
        {
          this.b.e("AdWebViewClient", "Threw Exception Trying to Launch App for Package: " + str7, localException);
          return;
        }
        if (!str3.contains("/openurl"))
          break;
      }
      while (localUri.getPathSegments().size() <= 0);
      String str6 = localUri.getQueryParameter("url");
      if ((paramString != null) && (URLUtil.isValidUrl(str6)))
      {
        Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
        paramWebView.getContext().startActivity(localIntent);
        return;
      }
      this.b.e("AdWebViewClient", "SDK was asked to launch invalid URL externally:" + str6);
      return;
      if (!str3.contains("/function/"))
        break;
      localList1 = localUri.getPathSegments();
    }
    while (localList1.size() <= 1);
    String str4 = (String)localList1.get(-1 + localList1.size());
    HashMap localHashMap = new HashMap();
    Iterator localIterator = a(localUri).iterator();
    while (localIterator.hasNext())
    {
      String str5 = (String)localIterator.next();
      localHashMap.put(str5, localUri.getQueryParameter(str5));
    }
    this.c.handleCommandInvocation(str4, localHashMap);
    return;
    this.b.e("AdWebViewClient", "Unknown URL: " + paramString);
    this.b.e("AdWebViewClient", "Path: " + str3);
    return;
    label544: d(localv);
    a(localUri, localv);
  }

  protected void a(v paramv)
  {
    ViewParent localViewParent = paramv.getParent();
    if ((localViewParent instanceof AppLovinAdView))
      ((AppLovinAdView)localViewParent).loadNextAd();
  }

  protected void b(v paramv)
  {
    this.c.a(paramv);
  }

  @Deprecated
  protected void c(v paramv)
  {
    AppLovinAd localAppLovinAd = paramv.a();
    if (localAppLovinAd != null)
      a(paramv, (String)localAppLovinAd.getDestinationUrls().get(0));
  }

  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    this.c.onAdHtmlLoaded(paramWebView);
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    a(paramWebView, paramString);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
