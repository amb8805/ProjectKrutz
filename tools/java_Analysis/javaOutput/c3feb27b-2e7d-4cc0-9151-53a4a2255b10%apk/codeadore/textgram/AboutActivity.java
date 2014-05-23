package codeadore.textgram;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.webkit.WebView;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;

@SuppressLint({"NewApi"})
public class AboutActivity extends el7rActivity
{
  String TAG = "AboutActivity";
  String filename = "about.html";

  public AboutActivity()
  {
  }

  public void onBackPressed()
  {
    super.onBackPressed();
    overridePendingTransition(2130968589, 2130968583);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    overridePendingTransition(2130968588, 2130968582);
    setContentView(2130903067);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    AdUtilities.installAd(this, findViewById(2131099721));
    this.tracker.trackPageView("/AboutActivity");
    WebView localWebView = (WebView)findViewById(2131099720);
    localWebView.setBackgroundColor(0);
    localWebView.setWebViewClient(new AboutActivity.1(this, localWebView));
    localWebView.loadUrl("file:///android_asset/data/about/" + this.filename);
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.AboutActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
