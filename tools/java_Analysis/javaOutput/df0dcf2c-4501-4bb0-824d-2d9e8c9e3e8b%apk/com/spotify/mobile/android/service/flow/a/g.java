package com.spotify.mobile.android.service.flow.a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import com.spotify.mobile.android.util.cy;

public final class g
{
  private static final cy a = cy.a("login_pli_added_to_queue");
  private static final cy b = cy.a("login_pli_added_to_queue_url");
  private static final cy c = cy.a("login_pli_added_to_queue_cookie");
  private final cw d;
  private final CookieManager e;

  public g(Context paramContext)
  {
    this.d = cw.a(paramContext);
    CookieSyncManager.createInstance(paramContext);
    this.e = CookieManager.getInstance();
  }

  public final h a()
  {
    boolean bool = this.d.a(a, false);
    String str1 = this.d.a(b, null);
    String str2 = this.d.a(c, null);
    if ((bool) && (!TextUtils.isEmpty(str1)) && (!TextUtils.isEmpty(str2)))
      return new h(true, str1, str2);
    return new h(false, null, null);
  }

  public final void a(h paramh)
  {
    this.e.removeAllCookie();
    String[] arrayOfString1;
    int i;
    if (paramh.a())
    {
      arrayOfString1 = paramh.c().split(";");
      i = arrayOfString1.length;
    }
    for (int j = 0; ; j++)
      if (j < i)
      {
        String[] arrayOfString2 = arrayOfString1[j].split("=");
        if (arrayOfString2.length == 2)
        {
          String str1 = arrayOfString2[0].trim();
          if (str1.equals("invite_request"))
          {
            String str2 = arrayOfString2[1].trim();
            this.e.setCookie(paramh.b(), str1 + "=" + str2 + "; Expires=Wed, 31 Dec 2025 23:59:59 GMT");
          }
        }
      }
      else
      {
        return;
      }
  }

  public final void a(String paramString)
  {
    String str = this.e.getCookie(paramString);
    this.d.a().a(a, true).a(b, paramString).a(c, str).b();
  }

  public final void b()
  {
    this.e.removeAllCookie();
    this.d.a().a(a).a(b).a(c).b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
