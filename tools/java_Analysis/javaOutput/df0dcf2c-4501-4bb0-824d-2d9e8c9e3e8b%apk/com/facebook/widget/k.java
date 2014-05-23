package com.facebook.widget;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.a.i;
import com.facebook.internal.ad;

final class k extends WebViewClient
{
  private k(h paramh)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    if (!h.b(this.a))
      h.c(this.a).dismiss();
    h.d(this.a).setBackgroundColor(0);
    h.e(this.a).setVisibility(0);
    h.f(this.a).setVisibility(0);
  }

  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    ad.b();
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    if (!h.b(this.a))
      h.c(this.a).show();
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    h.a(this.a, new FacebookDialogException(paramString1, paramInt, paramString2));
    this.a.dismiss();
  }

  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
    h.a(this.a, new FacebookDialogException(null, -11, null));
    paramSslErrorHandler.cancel();
    this.a.dismiss();
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    ad.b();
    Bundle localBundle;
    String str1;
    String str2;
    if (paramString.startsWith("fbconnect://success"))
    {
      localBundle = i.a(paramString);
      str1 = localBundle.getString("error");
      if (str1 == null)
        str1 = localBundle.getString("error_type");
      str2 = localBundle.getString("error_msg");
      if (str2 == null)
        str2 = localBundle.getString("error_description");
      String str3 = localBundle.getString("error_code");
      if (ad.a(str3))
        break label265;
      try
      {
        int j = Integer.parseInt(str3);
        i = j;
        if ((ad.a(str1)) && (ad.a(str2)) && (i == -1))
        {
          h.a(this.a, localBundle);
          this.a.dismiss();
          return true;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        while (true)
        {
          i = -1;
          continue;
          if ((str1 != null) && ((str1.equals("access_denied")) || (str1.equals("OAuthAccessDeniedException"))))
          {
            h.a(this.a);
          }
          else
          {
            localFacebookRequestError = new FacebookRequestError(i, str1, str2);
            h.a(this.a, new FacebookServiceException(localFacebookRequestError, str2));
          }
        }
      }
    }
    while (true)
    {
      FacebookRequestError localFacebookRequestError;
      if (paramString.startsWith("fbconnect://cancel"))
      {
        h.a(this.a);
        this.a.dismiss();
        return true;
      }
      if (paramString.contains("touch"))
        return false;
      this.a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
      return true;
      label265: int i = -1;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.widget.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
