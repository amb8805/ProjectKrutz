package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Rect;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinLogger;
import com.applovin.sdk.AppLovinSdk;

class v extends WebView
{
  private final AppLovinLogger a;
  private AppLovinAd b = null;
  private boolean c = false;

  v(AppLovinAdSize paramAppLovinAdSize, y paramy, AppLovinSdk paramAppLovinSdk, Context paramContext)
  {
    super(paramContext);
    this.a = paramAppLovinSdk.getLogger();
    setBackgroundColor(0);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setSupportMultipleWindows(false);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setSavePassword(false);
    setWebViewClient(paramy);
    setWebChromeClient(new u(paramAppLovinSdk));
    setVerticalScrollBarEnabled(false);
    setHorizontalScrollBarEnabled(false);
    setScrollBarStyle(33554432);
    setOnTouchListener(new w(this));
    setOnLongClickListener(new x(this));
  }

  AppLovinAd a()
  {
    return this.b;
  }

  public void a(AppLovinAd paramAppLovinAd)
  {
    if (!this.c)
    {
      this.b = paramAppLovinAd;
      try
      {
        loadDataWithBaseURL("/", paramAppLovinAd.getHtml(), "text/html", null, "");
        this.a.d("AdWebView", "AppLovinAd rendered");
        return;
        this.a.userError("AdWebView", "Ad can not be loaded in a destroyed web view");
        return;
      }
      catch (Exception localException)
      {
      }
    }
  }

  public void destroy()
  {
    this.c = true;
    try
    {
      super.destroy();
      this.a.d("AdWebView", "Web view destroyed");
      return;
    }
    catch (Throwable localThrowable)
    {
      while (this.a == null);
      this.a.e("AdWebView", "destroy() threw exception", localThrowable);
    }
  }

  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    try
    {
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
      return;
    }
    catch (Exception localException)
    {
      this.a.e("AdWebView", "onFocusChanged() threw exception", localException);
    }
  }

  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    try
    {
      super.onWindowFocusChanged(paramBoolean);
      return;
    }
    catch (Exception localException)
    {
      this.a.e("AdWebView", "onWindowFocusChanged() threw exception", localException);
    }
  }

  protected void onWindowVisibilityChanged(int paramInt)
  {
    try
    {
      super.onWindowVisibilityChanged(paramInt);
      return;
    }
    catch (Exception localException)
    {
      this.a.e("AdWebView", "onWindowVisibilityChanged() threw exception", localException);
    }
  }

  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    try
    {
      boolean bool = super.requestFocus(paramInt, paramRect);
      return bool;
    }
    catch (Exception localException)
    {
      this.a.e("AdWebView", "requestFocus() threw exception", localException);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
