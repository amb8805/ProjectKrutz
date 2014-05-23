package com.spotify.mobile.android.ui.menus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;;
import android.net.Uri;
import android.support.v4.view.x;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.graphics.e;
import com.spotify.android.paste.widget.f;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ViewUri.Verified;
import java.util.Locale;

public final class a
{
  private static boolean a;

  private static View a(Context paramContext, Menu paramMenu, int paramInt1, int paramInt2, SpotifyIcon paramSpotifyIcon, View.OnClickListener paramOnClickListener)
  {
    if (a(paramContext))
      return null;
    String str = paramContext.getString(paramInt1);
    MenuItem localMenuItem = paramMenu.add(0, paramInt2, 0, str);
    x.a(localMenuItem, 2);
    Resources localResources = paramContext.getResources();
    Button localButton = h.d(paramContext);
    e locale = new e(paramContext, paramSpotifyIcon);
    locale.a(localButton.getTextColors());
    locale.a(localResources.getDimensionPixelSize(2131427349));
    localButton.setPadding(localResources.getDimensionPixelSize(2131427350), 0, localResources.getDimensionPixelSize(2131427351), 0);
    localButton.setCompoundDrawablesWithIntrinsicBounds(locale, null, null, null);
    localButton.setCompoundDrawablePadding(localResources.getDimensionPixelOffset(2131427348));
    localButton.setText(str.toUpperCase(Locale.getDefault()));
    localButton.setOnClickListener(paramOnClickListener);
    FrameLayout localFrameLayout = new FrameLayout(paramContext);
    localFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    int i = localResources.getDimensionPixelSize(2131427347);
    localLayoutParams.setMargins(i, 0, i, 0);
    localButton.setLayoutParams(localLayoutParams);
    localFrameLayout.addView(localButton);
    x.a(localMenuItem, localFrameLayout);
    return localButton;
  }

  public static View a(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, Uri paramUri)
  {
    a.6 local6 = new a.6(paramContext, paramVerified, paramUri);
    return a(paramContext, paramMenu, 2131689489, 2131362044, SpotifyIcon.W, local6);
  }

  public static void a(Context paramContext, Menu paramMenu)
  {
    if (a(paramContext))
      return;
    Object localObject;
    if (f.a(paramContext))
      localObject = paramContext.getResources().getDrawable(2130838031);
    while (true)
    {
      x.a(paramMenu.add(0, 2131362041, 0, paramContext.getString(2131689961)).setIcon((android.graphics.drawable.Drawable)localObject).setOnMenuItemClickListener(new a.2(paramContext)), 1);
      return;
      localObject = new e(paramContext, SpotifyIcon.F);
      ((e)localObject).a(d.b(24.0F, paramContext.getResources()));
    }
  }

  public static void a(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified)
  {
    if (a(paramContext))
      return;
    a(paramContext, paramMenu, paramVerified, null);
  }

  public static void a(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, String paramString)
  {
    if (a(paramContext))
      return;
    Object localObject;
    if (f.a(paramContext))
      localObject = paramContext.getResources().getDrawable(2130838068);
    while (true)
    {
      x.a(paramMenu.add(0, 2131362039, 0, paramContext.getString(2131689485)).setIcon((android.graphics.drawable.Drawable)localObject).setOnMenuItemClickListener(new a.1(paramContext, paramVerified, paramString)), 1);
      return;
      localObject = new e(paramContext, SpotifyIcon.aR);
      ((e)localObject).a(d.b(24.0F, paramContext.getResources()));
    }
  }

  public static void a(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, String paramString1, String paramString2, String paramString3)
  {
    if (a(paramContext))
      return;
    x.a(paramMenu.add(0, 2131362043, 0, paramContext.getString(2131689488)).setIcon(2130838097).setOnMenuItemClickListener(new a.3(paramContext, paramVerified, paramString1, paramString2, paramString3)), 0);
  }

  private static boolean a(Context paramContext)
  {
    if (paramContext == null)
    {
      if (!a)
      {
        Assertion.b("ActionbarMenuHelper.* called with a null context");
        a = true;
      }
      return true;
    }
    return false;
  }

  public static View b(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, Uri paramUri)
  {
    a.7 local7 = new a.7(paramContext, paramVerified, paramUri);
    return a(paramContext, paramMenu, 2131689490, 2131362045, SpotifyIcon.ag, local7);
  }

  public static void b(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified)
  {
    if (a(paramContext))
      return;
    x.a(paramMenu.add(0, 2131362040, 0, paramContext.getString(2131689994)).setIcon(new e(paramContext, SpotifyIcon.cQ)).setOnMenuItemClickListener(new a.5(paramContext, paramVerified)), 1);
  }

  public static void b(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, String paramString)
  {
    if (a(paramContext))
      return;
    x.a(paramMenu.add(0, 2131362042, 0, paramContext.getString(2131689486)).setIcon(2130838090).setOnMenuItemClickListener(new a.4(paramContext, paramVerified, paramString)), 0);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.menus.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
