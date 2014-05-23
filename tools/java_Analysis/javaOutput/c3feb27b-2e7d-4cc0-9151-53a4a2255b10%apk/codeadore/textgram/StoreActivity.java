package codeadore.textgram;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;
import codeadore.textgram.adapters.StorePagerAdapter;
import codeadore.textgram.custom_widgets.NoScrollViewPager;
import codeadore.textgram.custom_widgets.el7rTabPageIndicator;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;

public class StoreActivity extends el7rFragmentActivity
{
  static String TAG = "StoreActivity";
  public static Handler UIHandler;
  static StorePagerAdapter adapter;
  public static Activity c;
  static FragmentManager fragmentManager;
  static el7rTabPageIndicator titleIndicator;
  public static NoScrollViewPager viewPager;

  public StoreActivity()
  {
  }

  public static void reset()
  {
    try
    {
      StorePagerAdapter.destoryOn = Boolean.valueOf(true);
      int i = viewPager.getCurrentItem();
      adapter = new StorePagerAdapter(fragmentManager);
      viewPager.setAdapter(adapter);
      titleIndicator.setViewPager(viewPager);
      viewPager.setCurrentItem(i);
      titleIndicator.setCurrentItem(i);
      StorePagerAdapter.destoryOn = Boolean.valueOf(false);
      Utilities.updateLists(MainActivity.c);
      try
      {
        StylingActivity.resetItems();
        return;
      }
      catch (Exception localException2)
      {
        Log.e(TAG, "in StoreActivity.reset -> StylingActivity.resetItems() call, : " + localException2.toString());
        return;
      }
    }
    catch (Exception localException1)
    {
      Log.e(TAG, "in StoreActivity.reload(): " + localException1.toString());
    }
  }

  public static void viewItem(String paramString)
  {
    Intent localIntent = new Intent(c, StoreItemActivity.class);
    localIntent.putExtra("unique_id", paramString);
    c.startActivity(localIntent);
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
    setContentView(2130903073);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    setTitle(getString(2131427391));
    this.tracker.trackPageView("/StoreActivity");
    UIHandler = new Handler();
    c = this;
    NoScrollViewPager localNoScrollViewPager = (NoScrollViewPager)findViewById(2131099759);
    viewPager = localNoScrollViewPager;
    if (Build.VERSION.SDK_INT >= 14)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      if (Math.sqrt(Math.pow(localDisplayMetrics.widthPixels / localDisplayMetrics.xdpi, 2.0D) + Math.pow(localDisplayMetrics.heightPixels / localDisplayMetrics.ydpi, 2.0D)) > 4.5D)
        viewPager.setEnable3D(true);
    }
    localNoScrollViewPager.enableScroll();
    fragmentManager = getSupportFragmentManager();
    adapter = new StorePagerAdapter(getSupportFragmentManager());
    localNoScrollViewPager.setAdapter(adapter);
    String[] arrayOfString = new String[7];
    arrayOfString[0] = getString(2131427388);
    arrayOfString[1] = getString(2131427352);
    arrayOfString[2] = getString(2131427353);
    arrayOfString[3] = getString(2131427355);
    arrayOfString[4] = getString(2131427354);
    arrayOfString[5] = getString(2131427357);
    arrayOfString[6] = getString(2131427358);
    StorePagerAdapter.titles_strings = arrayOfString;
    titleIndicator = (el7rTabPageIndicator)findViewById(2131099758);
    titleIndicator.setViewPager(localNoScrollViewPager);
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131558400, paramMenu);
    paramMenu.findItem(2131099874).setVisible(false);
    return true;
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.StoreActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
