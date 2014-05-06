package com.twitter.android;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;

public class WebViewActivity extends Activity
{
  public WebViewActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Uri localUri = getIntent().getData();
    WebView localWebView = new WebView(this);
    setContentView(localWebView, new ViewGroup.LayoutParams(-1, -1));
    localWebView.loadUrl(localUri.toString());
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.WebViewActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
