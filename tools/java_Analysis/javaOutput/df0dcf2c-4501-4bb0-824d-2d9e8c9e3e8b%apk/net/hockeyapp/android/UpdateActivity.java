package net.hockeyapp.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import net.hockeyapp.android.c.b;
import net.hockeyapp.android.d.i;
import net.hockeyapp.android.objects.ErrorObject;
import net.hockeyapp.android.views.UpdateView;

public class UpdateActivity extends Activity
  implements View.OnClickListener, g
{
  protected b a;
  protected i b;
  private final int c = 0;
  private ErrorObject d;
  private Context e;

  public UpdateActivity()
  {
  }

  private String c()
  {
    try
    {
      PackageManager localPackageManager = getPackageManager();
      String str = localPackageManager.getApplicationLabel(localPackageManager.getApplicationInfo(getPackageName(), 0)).toString();
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return "";
  }

  protected final void a()
  {
    this.a = new b(this, getIntent().getStringExtra("url"), new UpdateActivity.1(this));
    this.a.execute(new String[0]);
  }

  public final void b()
  {
    findViewById(4100).setEnabled(true);
  }

  public int getCurrentVersionCode()
  {
    try
    {
      int i = getPackageManager().getPackageInfo(getPackageName(), 128).versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return -1;
  }

  public void onClick(View paramView)
  {
    if (this.e.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0);
    for (int i = 1; i == 0; i = 0)
    {
      this.d = new ErrorObject();
      this.d.a("The permission to access the external storage permission is not set. Please contact the developer.");
      runOnUiThread(new UpdateActivity.2(this));
      return;
    }
    String[] arrayOfString1 = { "value" };
    Cursor localCursor;
    if (Build.VERSION.SDK_INT >= 17)
    {
      String[] arrayOfString2 = { "install_non_market_apps", "1" };
      localCursor = getContentResolver().query(Settings.Global.CONTENT_URI, arrayOfString1, "name = ? AND value = ?", arrayOfString2, null);
      if (localCursor.getCount() != 1)
        break label197;
    }
    label197: for (int j = 1; ; j = 0)
    {
      if (j != 0)
        break label203;
      this.d = new ErrorObject();
      this.d.a("The installation from unknown sources is not enabled. Please check the device settings.");
      runOnUiThread(new UpdateActivity.3(this));
      return;
      String[] arrayOfString3 = { "install_non_market_apps", "1" };
      localCursor = getContentResolver().query(Settings.Secure.CONTENT_URI, arrayOfString1, "name = ? AND value = ?", arrayOfString3, null);
      break;
    }
    label203: a();
    paramView.setEnabled(false);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setTitle("App Update");
    setContentView(new UpdateView(this));
    this.e = this;
    this.b = new i(getIntent().getStringExtra("json"), this);
    ((TextView)findViewById(4098)).setText(c());
    ((TextView)findViewById(4099)).setText("Version " + this.b.a() + "\n" + this.b.b());
    ((Button)findViewById(4100)).setOnClickListener(this);
    WebView localWebView = (WebView)findViewById(4101);
    localWebView.clearCache(true);
    localWebView.destroyDrawingCache();
    localWebView.loadDataWithBaseURL("https://sdk.hockeyapp.net/", this.b.c(), "text/html", "utf-8", null);
    this.a = ((b)getLastNonConfigurationInstance());
    if (this.a != null)
      this.a.a(this);
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 0:
    }
    return new AlertDialog.Builder(this).setMessage("An error has occured").setCancelable(false).setTitle("Error").setIcon(17301543).setPositiveButton("OK", new UpdateActivity.4(this)).create();
  }

  protected void onPrepareDialog(int paramInt, Dialog paramDialog)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
    }
    AlertDialog localAlertDialog = (AlertDialog)paramDialog;
    if (this.d != null)
    {
      localAlertDialog.setMessage(this.d.a());
      return;
    }
    localAlertDialog.setMessage("An unknown error has occured.");
  }

  public Object onRetainNonConfigurationInstance()
  {
    if (this.a != null)
      this.a.a();
    return this.a;
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.UpdateActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
