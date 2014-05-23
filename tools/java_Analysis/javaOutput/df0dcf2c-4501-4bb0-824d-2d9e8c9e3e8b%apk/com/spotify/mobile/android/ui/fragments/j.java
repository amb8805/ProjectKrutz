package com.spotify.mobile.android.ui.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.webkit.WebView;
import com.spotify.mobile.android.service.gcm.d;
import com.spotify.mobile.android.service.gcm.e;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.br;
import com.spotify.mobile.android.util.ed;
import com.spotify.mobile.android.util.eg;

public final class j extends aa
  implements eg
{
  private ed a;

  public j()
  {
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    r();
  }

  protected final boolean a(Uri paramUri)
  {
    if (SpotifyLink.b(paramUri.toString()))
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.addCategory("android.intent.category.BROWSABLE");
      localIntent.setData(paramUri);
      a(localIntent);
      return true;
    }
    return false;
  }

  public final void a_(Uri paramUri)
  {
    if (this.a != null)
    {
      this.a.b();
      this.a = null;
    }
    if (paramUri == null)
    {
      bp.c("Not ready to load web, web token null", new Object[0]);
      return;
    }
    b(paramUri.toString());
  }

  protected final void b()
  {
    FragmentActivity localFragmentActivity = i();
    Uri localUri1 = localFragmentActivity.getIntent().getData();
    int i = 0;
    if (localUri1 == null);
    while (i == 0)
    {
      Assertion.b("Initial uri is not deemed secure, aborting. " + localUri1);
      localFragmentActivity.finish();
      return;
      boolean bool1 = "https".equals(localUri1.getScheme());
      i = 0;
      if (bool1)
      {
        String str = localUri1.getHost();
        i = 0;
        if (str != null)
          if (!"spotify.com".equals(str))
          {
            boolean bool2 = str.endsWith(".spotify.com");
            i = 0;
            if (!bool2);
          }
          else
          {
            i = 1;
          }
      }
    }
    D().addJavascriptInterface(new br(localFragmentActivity), "spotify");
    e locale = d.a(localUri1);
    Uri localUri2 = locale.b;
    if (locale.a)
    {
      this.a = ed.a(localFragmentActivity, localFragmentActivity.d());
      this.a.a(localUri2.toString(), this);
      return;
    }
    b(localUri2.toString());
  }

  public final void y()
  {
    super.y();
    if (this.a != null)
    {
      this.a.b();
      this.a = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
