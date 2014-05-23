package com.spotify.mobile.android.ui.menus;

import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.ContextMenu;
import android.view.MenuItem;
import com.spotify.android.paste.widget.g;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.provider.Metadata.OfflineSync;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.Collection.State;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import java.lang.reflect.Field;

public class d
  implements com.spotify.mobile.android.c.a
{
  private com.spotify.mobile.android.ui.actions.a a = (com.spotify.mobile.android.ui.actions.a)c.a(com.spotify.mobile.android.ui.actions.a.class);
  private com.spotify.mobile.android.ui.actions.d b = (com.spotify.mobile.android.ui.actions.d)c.a(com.spotify.mobile.android.ui.actions.d.class);

  public d()
  {
  }

  private static MenuItem a(Context paramContext, ContextMenu paramContextMenu, int paramInt1, int paramInt2)
  {
    return a(paramContext, paramContextMenu.add(0, paramInt1, 0, paramInt2));
  }

  public static MenuItem a(Context paramContext, ContextMenu paramContextMenu, int paramInt1, int paramInt2, CharSequence paramCharSequence)
  {
    return a(paramContext, paramContextMenu.add(0, paramInt1, paramInt2, paramCharSequence));
  }

  private static MenuItem a(Context paramContext, MenuItem paramMenuItem)
  {
    i = 0;
    if (Build.VERSION.SDK_INT < 11)
    {
      String[] arrayOfString = { "mTextColor", "mTextSecondaryColor" };
      localColorStateList = g.b(paramContext, 2130772382);
      while (true)
        if (i < 2)
        {
          String str = arrayOfString[i];
          try
          {
            Field localField = paramMenuItem.getClass().getDeclaredField(str);
            if (localField != null)
            {
              localField.setAccessible(true);
              localField.set(paramMenuItem, localColorStateList);
            }
            i++;
            continue;
            return paramMenuItem;
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            break label73;
          }
          catch (NoSuchFieldException localNoSuchFieldException)
          {
            break label73;
          }
        }
    }
  }

  public static void a(Context paramContext, ContextMenu paramContextMenu)
  {
    a(paramContext, paramContextMenu, 2131362063, 2131689772).setEnabled(false);
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, long paramLong)
  {
    a(paramContext, paramContextMenu, 2131362067, 2131689778).setIcon(2130838076).setOnMenuItemClickListener(new d.16(this, paramContext, paramLong));
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, long paramLong, boolean paramBoolean)
  {
    ViewUri.SubView localSubView = ViewUri.SubView.a;
    if (paramBoolean);
    for (int i = 2131689771; ; i = 2131689770)
    {
      a(paramContext, paramContextMenu, 2131362075, i).setOnMenuItemClickListener(new d.8(this, paramContext, paramVerified, localSubView, paramBoolean, paramLong));
      return;
    }
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, long paramLong)
  {
    a(paramContext, paramContextMenu, 2131362061, 2131689768).setIcon(2130838076).setOnMenuItemClickListener(new d.5(this, paramContext, paramVerified, paramSubView, paramLong));
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, Uri paramUri, SpotifyLink.LinkType paramLinkType, int paramInt1, int paramInt2)
  {
    if (Metadata.OfflineSync.b(paramInt1, paramInt2))
      a(paramContext, paramContextMenu, 2131362062, 2131689785).setIcon(2130838087).setOnMenuItemClickListener(new d.1(this, paramContext, paramVerified, paramSubView, paramUri, paramLinkType));
    do
    {
      return;
      if ((Metadata.OfflineSync.c(paramInt1)) || (Metadata.OfflineSync.a(paramInt1, paramInt2)))
      {
        a(paramContext, paramContextMenu, 2131362062, 2131689762).setIcon(2130838087).setOnMenuItemClickListener(new d.12(this, paramContext, paramVerified, paramSubView, paramUri));
        return;
      }
    }
    while (!Metadata.OfflineSync.a(paramInt1));
    a(paramContext, paramContextMenu, 2131362062, 2131689769).setIcon(2130838077).setOnMenuItemClickListener(new d.19(this, paramContext, paramVerified, paramSubView, paramUri));
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, Collection.State paramState, boolean paramBoolean, String paramString)
  {
    if (new SpotifyLink(paramString).a() == SpotifyLink.LinkType.ag)
      Assertion.b(paramState, Collection.State.b);
    switch (d.18.b[paramState.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    do
    {
      return;
      MenuItem localMenuItem3 = a(paramContext, paramContextMenu, 2131362055, 2131689757);
      localMenuItem3.setIcon(2130838013);
      localMenuItem3.setOnMenuItemClickListener(new d.11(this, paramContext, paramVerified, paramSubView, paramString));
      return;
      if (paramState == Collection.State.b)
      {
        MenuItem localMenuItem2 = a(paramContext, paramContextMenu, 2131362055, 2131689764);
        localMenuItem2.setIcon(2130838013);
        localMenuItem2.setOnMenuItemClickListener(new d.13(this, paramContext, paramVerified, paramSubView, paramString));
      }
    }
    while (!paramBoolean);
    MenuItem localMenuItem1 = a(paramContext, paramContextMenu, 2131362066, 2131689777);
    localMenuItem1.setIcon(2130838095);
    localMenuItem1.setOnMenuItemClickListener(new d.14(this, paramContext, paramVerified, paramSubView, paramString));
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString)
  {
    a(paramContext, paramContextMenu, 2131362064, 2131689773).setOnMenuItemClickListener(new d.22(this, paramContext, paramVerified, paramSubView, paramString));
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString, long paramLong)
  {
    a(paramContext, paramContextMenu, 2131362068, 2131689779).setIcon(2130838076).setOnMenuItemClickListener(new d.3(this, paramContext, paramVerified, paramSubView, paramString, paramLong));
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString1, Uri paramUri, long paramLong, String paramString2)
  {
    SpotifyLink localSpotifyLink = new SpotifyLink(paramString2);
    int i;
    switch (d.18.a[localSpotifyLink.a().ordinal()])
    {
    default:
      Assertion.a("Trying to add 'Remove Playlist or Folder' for other link type: " + localSpotifyLink.a());
      i = -1;
      if (i < 0);
    case 1:
    case 2:
    case 3:
    }
    for (boolean bool = true; ; bool = false)
    {
      Assertion.a(bool, "Unsupported uri type.");
      a(paramContext, paramContextMenu, 2131362060, i).setIcon(2130838076).setOnMenuItemClickListener(new d.2(this, paramContext, paramVerified, paramSubView, paramString1, paramUri, paramLong, paramString2));
      return;
      i = 2131689765;
      break;
      i = 2131689766;
      break;
    }
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString1, String paramString2)
  {
    a(paramContext, paramContextMenu, 2131362057, 2131689759).setIcon(2130838074).setOnMenuItemClickListener(new d.21(this, paramContext, paramVerified, paramSubView, paramString1, paramString2));
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString1, String paramString2, String paramString3)
  {
    a(paramContext, paramContextMenu, 2131362070, 2131689781).setIcon(2130838085).setOnMenuItemClickListener(new d.7(this, paramContext, paramVerified, paramSubView, paramString1, paramString2, paramString3));
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString, boolean paramBoolean)
  {
    int i;
    MenuItem localMenuItem;
    if (paramBoolean)
    {
      i = 2131689787;
      localMenuItem = a(paramContext, paramContextMenu, 2131362072, i);
      if (!paramBoolean)
        break label71;
    }
    label71: for (int j = 2130838076; ; j = 2130838071)
    {
      localMenuItem.setIcon(j).setOnMenuItemClickListener(new d.20(this, paramContext, paramVerified, paramSubView, paramBoolean, paramString));
      return;
      i = 2131689783;
      break;
    }
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    if (paramBoolean1);
    for (Collection.State localState = Collection.State.a; ; localState = Collection.State.c)
    {
      a(paramContext, paramContextMenu, paramVerified, paramSubView, localState, paramBoolean2, paramString);
      return;
    }
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, String paramString)
  {
    d(paramContext, paramContextMenu, paramVerified, ViewUri.SubView.a, paramString);
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, String paramString1, String paramString2)
  {
    a(paramContext, paramContextMenu, paramVerified, ViewUri.SubView.a, paramString1, paramString2);
  }

  public final void a(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, String paramString1, String paramString2, String paramString3)
  {
    a(paramContext, paramContextMenu, paramVerified, ViewUri.SubView.a, paramString1, paramString2, paramString3);
  }

  public final void b(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString)
  {
    a(paramContext, paramContextMenu, 2131362054, 2131689756).setIcon(2130838071).setOnMenuItemClickListener(new d.24(this, paramContext, paramVerified, paramSubView, paramString));
  }

  public final void b(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString1, String paramString2)
  {
    a(paramContext, paramContextMenu, 2131362058, 2131689760).setIcon(2130838075).setOnMenuItemClickListener(new d.23(this, paramContext, paramVerified, paramSubView, paramString1, paramString2));
  }

  public final void b(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString, boolean paramBoolean)
  {
    int i;
    MenuItem localMenuItem;
    if (paramBoolean)
    {
      i = 2131689784;
      localMenuItem = a(paramContext, paramContextMenu, 2131362073, i);
      if (!paramBoolean)
        break label72;
    }
    label72: for (int j = 2130838079; ; j = 2130838078)
    {
      localMenuItem.setIcon(j).setOnMenuItemClickListener(new d.15(this, paramContext, paramVerified, paramSubView, paramBoolean, paramString));
      return;
      i = 2131689763;
      break;
    }
  }

  public final void b(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, String paramString)
  {
    e(paramContext, paramContextMenu, paramVerified, ViewUri.SubView.a, paramString);
  }

  public final void b(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, String paramString1, String paramString2)
  {
    b(paramContext, paramContextMenu, paramVerified, ViewUri.SubView.a, paramString1, paramString2);
  }

  public final void c(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString)
  {
    a(paramContext, paramContextMenu, 2131362069, 2131689780).setIcon(2130838084).setOnMenuItemClickListener(new d.25(this, paramContext, paramVerified, paramSubView, paramString));
  }

  public final void c(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString, boolean paramBoolean)
  {
    int i;
    MenuItem localMenuItem;
    if (paramBoolean)
    {
      i = 2131689786;
      localMenuItem = a(paramContext, paramContextMenu, 2131362074, i);
      if (!paramBoolean)
        break label72;
    }
    label72: for (int j = 2130838088; ; j = 2130838081)
    {
      localMenuItem.setIcon(j).setOnMenuItemClickListener(new d.17(this, paramContext, paramVerified, paramSubView, paramBoolean, paramString));
      return;
      i = 2131689774;
      break;
    }
  }

  public final void c(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, String paramString)
  {
    f(paramContext, paramContextMenu, paramVerified, ViewUri.SubView.a, paramString);
  }

  public final void c(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, String paramString1, String paramString2)
  {
    ViewUri.SubView localSubView = ViewUri.SubView.a;
    a(paramContext, paramContextMenu, 2131362059, 2131689761).setOnMenuItemClickListener(new d.9(this, paramContext, paramVerified, localSubView, paramString1, paramString2));
  }

  public final void d(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString)
  {
    a(paramContext, paramContextMenu, 2131362065, 2131689775).setIcon(2130838082).setOnMenuItemClickListener(new d.4(this, paramContext, paramVerified, paramSubView, paramString));
  }

  public final void e(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString)
  {
    a(paramContext, paramContextMenu, 2131362056, 2131689758).setIcon(2130838014).setOnMenuItemClickListener(new d.6(this, paramContext, paramVerified, paramSubView, paramString));
  }

  public final void f(Context paramContext, ContextMenu paramContextMenu, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, String paramString)
  {
    a(paramContext, paramContextMenu, 2131362071, 2131689776).setIcon(2130838083).setOnMenuItemClickListener(new d.10(this, paramContext, paramVerified, paramSubView, paramString));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.menus.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
