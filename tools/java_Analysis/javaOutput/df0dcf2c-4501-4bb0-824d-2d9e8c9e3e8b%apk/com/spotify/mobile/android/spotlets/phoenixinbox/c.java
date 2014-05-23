package com.spotify.mobile.android.spotlets.phoenixinbox;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.m;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.provider.j;
import com.spotify.mobile.android.spotlets.b.a;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.NavigationItem.NavigationGroup;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.fragments.g;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;
import com.spotify.mobile.android.util.dm;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.tracking.h;

public final class c extends m
  implements NavigationItem, g, ab
{
  private dt Y;
  private com.spotify.mobile.android.ui.actions.d Z = (com.spotify.mobile.android.ui.actions.d)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.d.class);
  private com.spotify.mobile.android.ui.actions.c aa = (com.spotify.mobile.android.ui.actions.c)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.c.class);
  private com.spotify.mobile.android.ui.menus.d ab = (com.spotify.mobile.android.ui.menus.d)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.menus.d.class);
  private h ac;
  private ContentViewManager ad;
  private aa ae;
  private o<Cursor> af = new c.1(this);
  private b i;

  public c()
  {
  }

  public final Fragment C()
  {
    return this;
  }

  public final NavigationItem.NavigationGroup D()
  {
    return NavigationItem.NavigationGroup.k;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FrameLayout localFrameLayout = (FrameLayout)paramLayoutInflater.inflate(2130903136, paramViewGroup, false);
    View localView = localFrameLayout.findViewById(16908298);
    ((ListView)localView).setFastScrollEnabled(true);
    this.i = new b(i());
    a(this.i);
    EmptyView localEmptyView = (EmptyView)localFrameLayout.findViewById(2131362355);
    this.ad = new com.spotify.mobile.android.ui.stuff.b(i(), localEmptyView, localView).a(SpotifyIcon.J).a(2131690007).b();
    return localFrameLayout;
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131690010);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    a_(true);
    t().a(2131362126, null, this.af);
    this.Y = dv.a(i(), ViewUri.o);
    this.ac = new h(i(), "spotify:internal:inbox");
    this.ac.b(paramBundle);
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    b().setOnCreateContextMenuListener(this);
    this.ae = new aa(i(), this);
    t().a(2131362125, null, this.ae);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    d locald = (d)paramView.getTag();
    com.spotify.mobile.android.ui.actions.c.a(i(), locald.a(), true);
    switch (locald.i())
    {
    default:
      return;
    case 0:
      if (FeatureFragment.h.a())
      {
        if (locald.r())
        {
          a(a.a(i(), locald.p(), locald.m(), locald.j()));
          return;
        }
        dm.b(i());
        return;
      }
      if (locald.r())
      {
        Uri localUri = j.c;
        com.spotify.mobile.android.ui.actions.d.a(i(), ViewUri.o, localUri, locald.a());
        return;
      }
      dm.c(i());
      return;
    case 1:
      if (locald.r())
      {
        a(MainActivity.a(i(), locald.j(), locald.a(j())));
        return;
      }
      dm.b(i());
      return;
    case 2:
      if (locald.r())
      {
        a(MainActivity.a(i(), locald.j(), locald.a(j())));
        return;
      }
      dm.a(i());
      return;
    case 3:
    }
    if (locald.r())
    {
      a(MainActivity.a(i(), locald.j(), locald.a(j())));
      return;
    }
    dm.h(i());
  }

  public final void a(boolean paramBoolean)
  {
    ContentViewManager localContentViewManager = this.ad;
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      localContentViewManager.a(bool);
      return;
    }
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    this.ac.a(paramBundle);
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    d locald = (d)((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView.getTag();
    switch (locald.i())
    {
    default:
      throw new RuntimeException("Inbox type not available " + locald.i());
    case 0:
      if (locald.t())
        this.ab.b(i(), paramContextMenu, ViewUri.o, locald.q(), locald.n());
      if (locald.s())
        this.ab.a(i(), paramContextMenu, ViewUri.o, locald.p(), locald.m());
      if (locald.u())
        this.ab.c(i(), paramContextMenu, ViewUri.o, locald.o());
      this.ab.b(i(), paramContextMenu, ViewUri.o, locald.o());
      if (locald.v())
        this.ab.a(i(), paramContextMenu, ViewUri.o, locald.o());
      com.spotify.mobile.android.ui.menus.d locald3 = this.ab;
      FragmentActivity localFragmentActivity3 = i();
      ViewUri.Verified localVerified3 = ViewUri.o;
      String str3 = locald.l();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = locald.n();
      locald3.a(localFragmentActivity3, paramContextMenu, localVerified3, str3, a(2131690251, arrayOfObject2), locald.o());
      if (locald.h())
        this.ab.c(i(), paramContextMenu, ViewUri.o, locald.f(), locald.e());
      this.ab.a(i(), paramContextMenu, ViewUri.o, locald.a(), locald.d());
      this.ab.a(i(), paramContextMenu, locald.a());
    case -1:
      return;
    case 1:
      if (locald.r())
        this.ab.a(i(), paramContextMenu, ViewUri.o, locald.p(), locald.m());
      if (locald.t())
        this.ab.b(i(), paramContextMenu, ViewUri.o, locald.q(), locald.n());
      if (locald.v())
        this.ab.a(i(), paramContextMenu, ViewUri.o, locald.p());
      if (locald.u())
        this.ab.c(i(), paramContextMenu, ViewUri.o, locald.p());
      com.spotify.mobile.android.ui.menus.d locald1 = this.ab;
      FragmentActivity localFragmentActivity1 = i();
      ViewUri.Verified localVerified1 = ViewUri.o;
      String str1 = locald.p();
      locald1.b(localFragmentActivity1, paramContextMenu, localVerified1, ViewUri.SubView.a, str1);
      com.spotify.mobile.android.ui.menus.d locald2 = this.ab;
      FragmentActivity localFragmentActivity2 = i();
      ViewUri.Verified localVerified2 = ViewUri.o;
      String str2 = locald.m();
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = locald.n();
      locald2.a(localFragmentActivity2, paramContextMenu, localVerified2, str2, a(2131690251, arrayOfObject1), locald.p());
      if (locald.h())
        this.ab.c(i(), paramContextMenu, ViewUri.o, locald.f(), locald.e());
      this.ab.a(i(), paramContextMenu, ViewUri.o, locald.a(), locald.d());
      this.ab.a(i(), paramContextMenu, locald.a());
      return;
    case 2:
      if (locald.r())
        this.ab.b(i(), paramContextMenu, ViewUri.o, locald.q(), locald.n());
      if (locald.u())
        this.ab.c(i(), paramContextMenu, ViewUri.o, locald.q());
      this.ab.a(i(), paramContextMenu, ViewUri.o, locald.n(), "", locald.q());
      if (locald.h())
        this.ab.c(i(), paramContextMenu, ViewUri.o, locald.f(), locald.e());
      this.ab.a(i(), paramContextMenu, ViewUri.o, locald.a(), locald.d());
      this.ab.a(i(), paramContextMenu, locald.a());
      return;
    case 3:
    }
    if (locald.u())
      this.ab.c(i(), paramContextMenu, ViewUri.o, locald.j());
    this.ab.a(i(), paramContextMenu, ViewUri.o, locald.a(), locald.d());
    this.ab.a(i(), paramContextMenu, ViewUri.o, locald.a(j()), "", locald.j());
    if (locald.h())
      this.ab.c(i(), paramContextMenu, ViewUri.o, locald.f(), locald.e());
    this.ab.a(i(), paramContextMenu, locald.a());
  }

  public final void p_()
  {
    super.p_();
    this.ac.a();
  }

  public final void q_()
  {
    super.q_();
    this.ac.c();
  }

  public final void w()
  {
    super.w();
    this.Y.a();
  }

  public final void x()
  {
    super.x();
    this.Y.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.phoenixinbox.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
