package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;

public class TosTextActivity extends BaseFragmentActivity
{
  private String n;
  private boolean o;

  public TosTextActivity()
  {
  }

  public static Intent a(Context paramContext, String paramString, boolean paramBoolean)
  {
    Assertion.a(paramString, "Don't call with null valued license.");
    Intent localIntent = new Intent();
    localIntent.setClass(paramContext, TosTextActivity.class);
    localIntent.putExtra("license_url", paramString);
    localIntent.putExtra("log_external", paramBoolean);
    return localIntent;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903075);
    WebView localWebView = (WebView)findViewById(2131362256);
    Button localButton = (Button)findViewById(2131362273);
    this.n = getIntent().getStringExtra("license_url");
    this.o = getIntent().getBooleanExtra("log_external", false);
    if (paramBundle != null)
    {
      this.n = paramBundle.getString("license_url");
      this.o = paramBundle.getBoolean("log_external", false);
    }
    Resources localResources;
    String str;
    if (this.n == null)
    {
      this.o = true;
      localResources = getResources();
      str = getIntent().getDataString();
      if ("com.spotify.mobile.android.tos:spotify:internal:signup:tos".equals(str))
        this.n = localResources.getString(2131689674);
    }
    else
    {
      Assertion.a(this.n, "License url cannot be null.");
      Assertion.a(this.n, "License url cannot be empty.");
      localWebView.setWebViewClient(new TosTextActivity.1(this));
      localWebView.loadUrl(this.n);
      localButton.setOnClickListener(new TosTextActivity.2(this));
      if (!this.o)
        break label275;
    }
    label275: for (dt localdt = dv.b(this, ViewUri.L); ; localdt = dv.a(this, ViewUri.L))
    {
      a(localdt);
      return;
      if ("com.spotify.mobile.android.tos:spotify:internal:signup:mobiletos".equals(str))
      {
        this.n = localResources.getString(2131689671);
        break;
      }
      if ("com.spotify.mobile.android.tos:spotify:internal:signup:policy".equals(str))
      {
        this.n = localResources.getString(2131689672);
        break;
      }
      Assertion.b("License url not supported " + str);
      break;
    }
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putString("license_url", this.n);
    paramBundle.putBoolean("log_external", this.o);
    super.onSaveInstanceState(paramBundle);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.TosTextActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
