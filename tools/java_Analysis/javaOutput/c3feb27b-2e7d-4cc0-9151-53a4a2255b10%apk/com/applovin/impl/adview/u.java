package com.applovin.impl.adview;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinLogger;
import com.applovin.sdk.AppLovinSdk;

class u extends WebChromeClient
{
  private final AppLovinLogger a;

  public u(AppLovinSdk paramAppLovinSdk)
  {
    this.a = paramAppLovinSdk.getLogger();
  }

  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    String str = paramConsoleMessage.sourceId() + ": " + paramConsoleMessage.lineNumber() + ": " + paramConsoleMessage.message();
    this.a.d("AdWebView", str);
    return true;
  }

  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    this.a.w("AdWebView", "Alert reported: " + paramString2);
    return super.onJsAlert(paramWebView, paramString1, paramString2, paramJsResult);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
