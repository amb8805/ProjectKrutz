package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;

public final class h extends Fragment
  implements g
{
  private dt a;

  public h()
  {
  }

  public final Fragment C()
  {
    return this;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    WebView localWebView = (WebView)paramLayoutInflater.inflate(2130903147, paramViewGroup, false);
    localWebView.loadUrl("file:///android_asset/licenses.xhtml");
    return localWebView;
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131690020);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    a_(true);
    this.a = dv.a(i(), ViewUri.ar);
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
  }

  public final void w()
  {
    super.w();
    this.a.a();
  }

  public final void x()
  {
    super.x();
    this.a.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
