package codeadore.textgram;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import java.lang.reflect.Field;

public class el7rFragmentActivity extends ActionBarActivity
{
  static MenuItem progressItem;
  TextView actionBarTV;
  SubMenu menu_main;
  Menu theMenu;
  el7rFragmentActivity thisActivity;
  GoogleAnalyticsTracker tracker;

  public el7rFragmentActivity()
  {
  }

  public void onBackPressed()
  {
    super.onBackPressed();
    overridePendingTransition(2130968584, 2130968587);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    overridePendingTransition(2130968585, 2130968586);
    try
    {
      ViewConfiguration localViewConfiguration = ViewConfiguration.get(this);
      Field localField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
      if (localField != null)
      {
        localField.setAccessible(true);
        localField.setBoolean(localViewConfiguration, false);
      }
      this.thisActivity = this;
      ActionBar localActionBar = getSupportActionBar();
      View localView = getLayoutInflater().inflate(2130903042, null);
      localActionBar.setCustomView(localView);
      localActionBar.setDisplayShowTitleEnabled(false);
      localActionBar.setDisplayShowCustomEnabled(true);
      this.actionBarTV = ((TextView)localView.findViewById(2131099677));
      this.tracker = GoogleAnalyticsTracker.getInstance();
      this.tracker.startNewSession(Settings.googleAnalyticsKey, 20, this);
      return;
    }
    catch (Exception localException)
    {
      break label47;
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131558400, paramMenu);
    View localView = ((LayoutInflater)getBaseContext().getSystemService("layout_inflater")).inflate(2130903040, null);
    Button localButton = (Button)localView.findViewById(2131099676);
    localButton.setText(getString(2131427348));
    localButton.setOnClickListener(new el7rFragmentActivity.1(this));
    MenuItemCompat.setActionView(paramMenu.findItem(2131099872), localView);
    progressItem = paramMenu.findItem(2131099871);
    ProgressBar localProgressBar = new ProgressBar(this);
    MenuItemCompat.setActionView(progressItem, localProgressBar);
    return true;
  }

  protected void onDestroy()
  {
    try
    {
      this.tracker.dispatch();
      this.tracker.stopSession();
      super.onDestroy();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        Log.e("GoogleAnalytics", "in dispatching and stopping");
    }
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 82)
    {
      if (this.theMenu != null)
        this.theMenu.performIdentifierAction(2131099873, 0);
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    Utilities.optionsMenuAction(paramMenuItem, this.thisActivity, "MainActivity");
    return true;
  }

  public void setTitle(String paramString)
  {
    this.actionBarTV.setText(paramString);
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.el7rFragmentActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
