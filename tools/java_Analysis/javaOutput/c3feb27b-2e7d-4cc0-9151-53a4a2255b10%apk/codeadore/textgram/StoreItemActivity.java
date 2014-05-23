package codeadore.textgram;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import codeadore.textgram.lazylist.ImageLoader;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;

public class StoreItemActivity extends el7rActivity
{
  static LinearLayout LayoutMainLL;
  static Context c;
  static LinearLayout layoutLoadingLL;
  static Runnable loadItem;
  static String packageTitle = "Package";
  static String packageURL = "";
  String TAG = "StoreItemActivity";
  ImageLoader imageLoader;
  String unique_id;

  public StoreItemActivity()
  {
  }

  public static void reset()
  {
    layoutLoadingLL.setVisibility(0);
    LayoutMainLL.setVisibility(8);
    new Thread(loadItem).start();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903087);
    this.imageLoader = new ImageLoader(getApplicationContext());
    this.tracker.trackPageView("/StoreItemActivity");
    this.unique_id = getIntent().getExtras().getString("unique_id");
    Handler localHandler = new Handler();
    c = this;
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    setTitle(getString(2131427391));
    layoutLoadingLL = (LinearLayout)findViewById(2131099807);
    LayoutMainLL = (LinearLayout)findViewById(2131099809);
    loadItem = new StoreItemActivity.1(this, localHandler, (ImageView)findViewById(2131099810), (TextView)findViewById(2131099811), (TextView)findViewById(2131099812), (TextView)findViewById(2131099814), (TextView)findViewById(2131099815), (Button)findViewById(2131099816));
    new Thread(loadItem).start();
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.StoreItemActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
