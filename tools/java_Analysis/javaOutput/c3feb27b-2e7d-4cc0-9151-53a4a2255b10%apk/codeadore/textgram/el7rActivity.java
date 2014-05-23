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
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;

public class el7rActivity extends ActionBarActivity
{
  static MenuItem progressItem;
  private TextView actionBarTV;
  SubMenu menu_main;
  Menu theMenu;
  String thisActityName;
  el7rActivity thisActivity;
  GoogleAnalyticsTracker tracker;

  public el7rActivity()
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
    this.thisActivity = this;
    ActionBar localActionBar = getSupportActionBar();
    View localView = getLayoutInflater().inflate(2130903042, null);
    localActionBar.setCustomView(localView);
    localActionBar.setDisplayShowTitleEnabled(false);
    localActionBar.setDisplayShowCustomEnabled(true);
    this.actionBarTV = ((TextView)localView.findViewById(2131099677));
    this.tracker = GoogleAnalyticsTracker.getInstance();
    this.tracker.startNewSession(Settings.googleAnalyticsKey, 20, this);
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131558400, paramMenu);
    this.theMenu = paramMenu;
    LayoutInflater localLayoutInflater = (LayoutInflater)getBaseContext().getSystemService("layout_inflater");
    View localView1 = localLayoutInflater.inflate(2130903040, null);
    Button localButton = (Button)localView1.findViewById(2131099676);
    localButton.setText(getString(2131427348));
    localButton.setOnClickListener(new el7rActivity.1(this));
    MenuItemCompat.setActionView(paramMenu.findItem(2131099872), localView1);
    progressItem = paramMenu.findItem(2131099871);
    View localView2 = localLayoutInflater.inflate(2130903041, null);
    MenuItemCompat.setActionView(progressItem, localView2);
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
 * Qualified Name:     codeadore.textgram.el7rActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
