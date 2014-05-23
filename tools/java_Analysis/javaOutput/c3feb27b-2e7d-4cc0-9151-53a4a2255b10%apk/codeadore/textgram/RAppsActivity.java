package codeadore.textgram;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;

public class RAppsActivity extends el7rActivity
{
  String TAG = "RAppsActivity";
  WebView r_apps_wv;

  public RAppsActivity()
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
    setContentView(2130903071);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    AdUtilities.installAd(this, findViewById(2131099749));
    AdUtilities.installFullScreenAd(this.thisActivity, findViewById(2131099750));
    this.tracker.trackPageView("/RAppsActivity");
    this.r_apps_wv = ((WebView)findViewById(2131099747));
    this.r_apps_wv.setScrollBarStyle(33554432);
    this.r_apps_wv.setBackgroundColor(0);
    this.r_apps_wv.getSettings().setJavaScriptEnabled(true);
    this.r_apps_wv.clearCache(true);
    this.r_apps_wv.setWebViewClient(new RAppsActivity.1(this));
    if (Utilities.isOnline(this))
    {
      this.r_apps_wv.loadUrl("http://www.the-ghost.com/extras/textgram/r_apps/?version=2.1.51&build=" + Settings.buildFor);
      this.r_apps_wv.refreshDrawableState();
      return;
    }
    String str = "<div style='text-align:center;margin-top:100px;color:red'>" + getString(2131427387) + "</div>";
    this.r_apps_wv.loadDataWithBaseURL("", str, "text/html", "utf-8", "");
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.RAppsActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
