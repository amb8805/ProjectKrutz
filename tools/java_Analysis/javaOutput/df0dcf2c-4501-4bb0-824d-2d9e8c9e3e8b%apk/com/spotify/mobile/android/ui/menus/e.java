package com.spotify.mobile.android.ui.menus;

import android.content.Context;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import com.spotify.mobile.android.provider.Metadata.OfflineSync;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.Collection.State;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;
import com.spotify.mobile.android.util.ViewUri.Verified;

public final class e
{
  private static boolean a;

  public static void a(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified)
  {
    if (a(paramContext))
      return;
    paramMenu.add(0, 2131362194, 0, 2131690092).setOnMenuItemClickListener(new e.11(paramContext, paramVerified));
  }

  private static void a(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, int paramInt1, int paramInt2, ClientEvent.Event paramEvent, String paramString1, String paramString2)
  {
    if (a(paramContext))
      return;
    paramMenu.add(0, paramInt1, 0, paramInt2).setOnMenuItemClickListener(new e.13(paramContext, paramVerified, paramEvent, paramString1, paramString2));
  }

  public static void a(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, Uri paramUri, SpotifyLink.LinkType paramLinkType, int paramInt1, int paramInt2)
  {
    if (a(paramContext));
    do
    {
      return;
      if (Metadata.OfflineSync.b(paramInt1, paramInt2))
      {
        paramMenu.add(0, 2131362196, 0, 2131690104).setOnMenuItemClickListener(new e.1(paramContext, paramVerified, paramUri, paramLinkType));
        return;
      }
      if ((Metadata.OfflineSync.c(paramInt1)) || (Metadata.OfflineSync.a(paramInt1, paramInt2)))
      {
        paramMenu.add(0, 2131362196, 0, 2131690091).setOnMenuItemClickListener(new e.9(paramContext, paramVerified, paramUri));
        return;
      }
    }
    while (!Metadata.OfflineSync.a(paramInt1));
    paramMenu.add(0, 2131362196, 0, 2131690095).setOnMenuItemClickListener(new e.10(paramContext, paramVerified, paramUri));
  }

  public static void a(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, Collection.State paramState, String paramString)
  {
    if (a(paramContext))
      return;
    SpotifyLink.LinkType localLinkType = new SpotifyLink(paramString).a();
    if ((localLinkType == SpotifyLink.LinkType.c) || (localLinkType == SpotifyLink.LinkType.q));
    for (boolean bool = true; ; bool = false)
    {
      Assertion.a(bool, "uri is not an album.");
      switch (e.8.a[paramState.ordinal()])
      {
      default:
        return;
      case 1:
        paramMenu.add(0, 2131362191, 0, 2131690088).setOnMenuItemClickListener(new e.4(paramContext, paramVerified, paramString));
        return;
      case 2:
      case 3:
      }
    }
    if (paramState == Collection.State.b)
      paramMenu.add(0, 2131362191, 0, 2131690094).setOnMenuItemClickListener(new e.5(paramContext, paramVerified, paramString));
    paramMenu.add(0, 2131362199, 0, 2131690100).setOnMenuItemClickListener(new e.6(paramContext, paramVerified, paramString));
  }

  public static void a(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, String paramString)
  {
    if (a(paramContext))
      return;
    paramMenu.add(0, 2131362190, 0, 2131690087).setOnMenuItemClickListener(new e.14(paramContext, paramVerified, paramString));
  }

  public static void a(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, String paramString1, String paramString2)
  {
    if (a(paramContext))
      return;
    a(paramContext, paramMenu, paramVerified, 2131362192, 2131690089, ClientEvent.Event.t, paramString1, paramString2);
  }

  public static void a(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, String paramString, boolean paramBoolean)
  {
    if (a(paramContext))
      return;
    if (paramBoolean);
    for (int i = 2131690106; ; i = 2131690102)
    {
      paramMenu.add(0, 2131362201, 0, i).setOnMenuItemClickListener(new e.12(paramContext, paramVerified, paramBoolean, paramString));
      return;
    }
  }

  private static boolean a(Context paramContext)
  {
    if (paramContext == null)
    {
      if (!a)
      {
        Assertion.b("OptionsMenuHelper.* called with a null context");
        a = true;
      }
      return true;
    }
    return false;
  }

  public static void b(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, String paramString)
  {
    if (a(paramContext))
      return;
    paramMenu.add(0, 2131362200, 0, 2131690101).setOnMenuItemClickListener(new e.15(paramContext, paramVerified, paramString));
  }

  public static void b(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, String paramString1, String paramString2)
  {
    if (a(paramContext))
      return;
    a(paramContext, paramMenu, paramVerified, 2131362193, 2131690090, ClientEvent.Event.u, paramString1, paramString2);
  }

  public static void b(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, String paramString, boolean paramBoolean)
  {
    if (a(paramContext))
      return;
    if (paramBoolean);
    for (int i = 2131690103; ; i = 2131690093)
    {
      paramMenu.add(0, 2131362201, 0, i).setOnMenuItemClickListener(new e.2(paramContext, paramVerified, paramBoolean, paramString));
      return;
    }
  }

  public static void c(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, String paramString)
  {
    if (a(paramContext))
      return;
    paramMenu.add(0, 2131362198, 0, 2131690099).setOnMenuItemClickListener(new e.16(paramContext, paramVerified, paramString));
  }

  public static void c(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, String paramString, boolean paramBoolean)
  {
    if (a(paramContext))
      return;
    if (paramBoolean);
    for (int i = 2131690105; ; i = 2131690098)
    {
      paramMenu.add(0, 2131362197, 0, i).setOnMenuItemClickListener(new e.3(paramContext, paramVerified, paramBoolean, paramString));
      return;
    }
  }

  public static void d(Context paramContext, Menu paramMenu, ViewUri.Verified paramVerified, String paramString, boolean paramBoolean)
  {
    if (a(paramContext))
      return;
    if (paramBoolean);
    for (int i = 2131690097; ; i = 2131690096)
    {
      paramMenu.add(0, 2131362197, 0, i).setOnMenuItemClickListener(new e.7(paramContext, paramVerified, paramBoolean, paramString));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.menus.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
