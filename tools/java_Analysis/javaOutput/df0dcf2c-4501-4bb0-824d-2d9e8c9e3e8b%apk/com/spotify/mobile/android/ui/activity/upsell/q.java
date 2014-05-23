package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import com.spotify.mobile.android.ui.fragments.aa;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.ed;
import com.spotify.mobile.android.util.eg;

public final class q extends aa
  implements n, eg
{
  private ed a;
  private d b;
  private m c;
  private String d;
  private Uri e;

  public q()
  {
  }

  private void E()
  {
    if ((this.e == null) || (this.d == null))
    {
      Object[] arrayOfObject = new Object[2];
      if (this.e != null);
      for (boolean bool1 = true; ; bool1 = false)
      {
        arrayOfObject[0] = Boolean.valueOf(bool1);
        String str = this.d;
        boolean bool2 = false;
        if (str != null)
          bool2 = true;
        arrayOfObject[1] = Boolean.valueOf(bool2);
        bp.c("Not ready to load web, got web token uri: %s, got Google Play country: %s", arrayOfObject);
        return;
      }
    }
    Uri localUri = this.e.buildUpon().appendQueryParameter("iframe", "1").appendQueryParameter("app_version", Integer.toString(134742997)).build();
    b(this.c.a(localUri, this.d).toString());
  }

  public final boolean C()
  {
    WebView localWebView = D();
    if ((localWebView != null) && (localWebView.canGoBack()))
    {
      WebBackForwardList localWebBackForwardList = localWebView.copyBackForwardList();
      int i = localWebBackForwardList.getCurrentIndex();
      for (int j = i - 1; (j > 0) && (localWebBackForwardList.getItemAtIndex(j).getUrl().equals("about:blank")); j--);
      localWebView.goBackOrForward(j - i);
      return true;
    }
    return false;
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      switch (paramInt2)
      {
      default:
      case -1:
      case 0:
      }
      do
      {
        return;
        this.c.a(D(), paramIntent);
        return;
      }
      while (C());
      i().finish();
      return;
    }
    super.a(paramInt1, paramInt2, paramIntent);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    r();
    this.c = new m(i());
    this.c.a(this);
    if (!this.c.a())
      this.d = "";
  }

  protected final boolean a(Uri paramUri)
  {
    String str = paramUri.toString();
    if ((str.startsWith("https://www.paypal.com/cgi-bin/webscr")) || (str.startsWith("https://www.sandbox.paypal.com/cgi-bin/webscr")));
    for (int i = 1; i != 0; i = 0)
    {
      D().stopLoading();
      FragmentActivity localFragmentActivity = i();
      localFragmentActivity.startActivity(new Intent("android.intent.action.VIEW", paramUri));
      localFragmentActivity.finish();
      return true;
    }
    return (this.c != null) && (this.c.a((PremiumSignupActivity)i(), D(), paramUri));
  }

  public final void a_(Uri paramUri)
  {
    if (this.a != null)
    {
      this.a.b();
      this.a = null;
    }
    this.e = paramUri;
    E();
    if (this.b != null)
      this.b.c();
  }

  protected final void b()
  {
    FragmentActivity localFragmentActivity = i();
    Uri localUri = localFragmentActivity.getIntent().getData();
    if (localUri != null);
    for (String str = localUri.toString(); ; str = a(2131690164))
    {
      this.a = ed.a(localFragmentActivity, localFragmentActivity.d());
      this.a.a(str, this);
      return;
    }
  }

  public final void c()
  {
    this.b = new d(this.c, new q.1(this));
    this.b.a();
    if (this.e != null)
      this.b.c();
  }

  public final void y()
  {
    super.y();
    if (this.a != null)
    {
      this.a.b();
      this.a = null;
    }
    if (this.b != null)
    {
      this.b.b();
      this.b = null;
    }
    if (this.c != null)
    {
      this.c.b();
      this.c = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.upsell.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
