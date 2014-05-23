package com.spotify.mobile.android.service.flow.a;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.app.g;
import android.support.v4.app.l;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;

public class d extends com.spotify.mobile.android.service.flow.login.d
{
  private String a;
  private dt b;

  public d()
  {
  }

  public static com.spotify.mobile.android.service.flow.a a(c paramc, String paramString1, String paramString2)
  {
    cc.a(paramString1, "URL can't be empty");
    Bundle localBundle = new Bundle();
    localBundle.putString("url", paramString1);
    localBundle.putString("email", paramString2);
    d locald = new d();
    locald.a(paramc);
    locald.b_(localBundle);
    return locald;
  }

  public final e C()
  {
    return (e)((a)l_()).a(this);
  }

  public final String D()
  {
    return this.a;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FrameLayout localFrameLayout = new FrameLayout(i());
    localFrameLayout.setId(2131362078);
    if (paramBundle == null)
      l().a().a(2131362078, new f()).b();
    return localFrameLayout;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.a = g().getString("url");
    String str = g().getString("email");
    if (!TextUtils.isEmpty(str))
      this.a = Uri.parse(this.a).buildUpon().appendQueryParameter("email", str).build().toString();
    this.b = dv.b(i(), ViewUri.Q);
  }

  public final boolean b()
  {
    f localf = (f)l().a(2131362078);
    if (localf != null)
      return localf.C();
    return super.b();
  }

  public final void w()
  {
    super.w();
    this.b.a();
  }

  public final void x()
  {
    super.x();
    this.b.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
