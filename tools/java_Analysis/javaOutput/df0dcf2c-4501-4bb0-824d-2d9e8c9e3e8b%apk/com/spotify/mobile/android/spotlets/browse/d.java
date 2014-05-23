package com.spotify.mobile.android.spotlets.browse;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.o;
import android.support.v4.view.x;
import android.support.v7.app.b;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.model.Genre;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.activity.l;
import com.spotify.mobile.android.ui.adapter.y;
import com.spotify.mobile.android.ui.fragments.g;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.a.d;;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;
import com.spotify.mobile.android.util.by;
import com.spotify.mobile.android.util.bz;
import com.spotify.mobile.android.util.dd;
import com.spotify.mobile.android.util.ds;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.dx;
import com.spotify.mobile.android.util.u;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class d extends Fragment
  implements b, AbsListView.OnScrollListener, com.spotify.mobile.android.spotlets.browse.datasource.a, g, ab, bz
{
  static final String[] a = { "subscriber_count", "name" };
  private String Y;
  private boolean Z;
  private String aa;
  private by ab;
  private dt ac;
  private boolean ad = false;
  private boolean ae = false;
  private com.spotify.mobile.android.spotlets.browse.datasource.a.d af;
  private com.spotify.mobile.android.spotlets.browse.datasource.hermes.a ag;
  private com.spotify.mobile.android.util.tracking.h ah;
  private com.spotify.mobile.android.ui.actions.d ai = (com.spotify.mobile.android.ui.actions.d)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.d.class);
  private final com.spotify.mobile.android.spotlets.browse.b.a aj = new com.spotify.mobile.android.spotlets.browse.b.a(new com.spotify.mobile.android.spotlets.browse.b.e(ClientEvent.SubEvent.U, ViewUri.k, ViewUri.SubView.g));
  private ListView ak;
  private Button al;
  private com.spotify.mobile.android.ui.prettylist.c am;
  private boolean an;
  private com.spotify.mobile.android.ui.view.n ao = new d.4(this);
  private o<Cursor> ap = new d.5(this);
  private com.spotify.mobile.android.spotlets.browse.a.e b;
  private com.spotify.mobile.android.spotlets.browse.view.f c;
  private View d;
  private View e;
  private ViewGroup f;
  private com.spotify.mobile.android.util.a.d g;
  private ViewUri.Verified h;
  private String i;

  public d()
  {
  }

  private void E()
  {
    try
    {
      int j = this.b.a();
      if ((j > 0) && (j < 12))
        return;
      if (this.ad)
        return;
    }
    finally
    {
    }
    this.ad = true;
    if (this.Y.equals("collection-favorites"))
    {
      this.e.setVisibility(0);
      this.ag.a();
      return;
    }
    if ((this.Z) || (this.b.a() == 0))
    {
      this.e.setVisibility(0);
      this.af.b(this.b.a() / 12, 12);
    }
  }

  private boolean F()
  {
    Genre localGenre = com.spotify.mobile.android.spotlets.browse.util.d.a(this.Y, j(), com.spotify.android.paste.widget.f.a(i()));
    return (localGenre != null) && ((localGenre.f() > 0) || (!TextUtils.isEmpty(localGenre.j())));
  }

  private List<Genre> G()
  {
    return com.spotify.mobile.android.spotlets.browse.util.d.c(this.Y, i().getResources(), this.an);
  }

  public static d a(String paramString1, String paramString2, Intent paramIntent)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("title", paramString1);
    localBundle.putString("genre", paramIntent.getStringExtra("genre"));
    localBundle.putBoolean("eternalScroll", paramIntent.getBooleanExtra("eternalScroll", true));
    localBundle.putString("country", paramString2);
    d locald = new d();
    locald.b_(localBundle);
    return locald;
  }

  public static String a(String paramString)
  {
    return "spotify:app:browse:" + paramString;
  }

  private void a(Genre paramGenre)
  {
    String str = a(paramGenre.b());
    Genre localGenre = com.spotify.mobile.android.spotlets.browse.util.d.b(this.Y, i().getResources(), this.an);
    Intent localIntent = MainActivity.a(i(), str, localGenre.d() + " — " + paramGenre.d());
    localIntent.putExtra("genre", paramGenre.b());
    i().startActivity(localIntent);
  }

  public final Fragment C()
  {
    return this;
  }

  public final void D()
  {
    View localView = LayoutInflater.from(i()).inflate(2130903245, null);
    PopupWindow localPopupWindow = new PopupWindow(localView, -2, -2);
    localPopupWindow.setOutsideTouchable(true);
    localPopupWindow.setFocusable(true);
    localPopupWindow.setBackgroundDrawable(new BitmapDrawable(i().getResources()));
    List localList = G();
    ListView localListView = (ListView)localView.findViewById(2131362356);
    localListView.setOnItemClickListener(new d.3(this, localList, localPopupWindow));
    localListView.setAdapter(new y(i(), localList));
    localPopupWindow.showAtLocation(this.f, 17, 0, 0);
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (com.spotify.android.paste.widget.f.a(i()))
    {
      this.f = ((ViewGroup)paramLayoutInflater.inflate(2130903129, paramViewGroup, false));
      ((l)i()).a(this, this.i);
      return this.f;
    }
    this.f = ((ViewGroup)paramLayoutInflater.inflate(2130903130, paramViewGroup, false));
    label88: com.spotify.mobile.android.ui.prettylist.c localc;
    Genre localGenre;
    if (ds.b(i()))
    {
      this.am = com.spotify.mobile.android.ui.prettylist.e.b((MainActivity)i());
      localc = this.am;
      this.al = com.spotify.android.paste.widget.h.c(i(), null);
      localGenre = com.spotify.mobile.android.spotlets.browse.util.d.a(this.Y, j(), com.spotify.android.paste.widget.f.a(i()));
      if (!localGenre.e())
        break label356;
      this.al.setText(i().getString(2131689638));
    }
    while (true)
    {
      this.al.setOnCreateContextMenuListener(this);
      com.spotify.android.paste.graphics.e locale = new com.spotify.android.paste.graphics.e(i(), SpotifyIcon.m);
      locale.a((int)(8.0F * j().getDisplayMetrics().scaledDensity));
      locale.a(this.al.getTextColors());
      this.al.setCompoundDrawablesWithIntrinsicBounds(null, null, locale, null);
      this.al.setCompoundDrawablePadding(j().getDimensionPixelSize(2131427480));
      this.al.setOnClickListener(new d.1(this));
      localc.a(this.al);
      this.ak = this.am.c();
      this.am.a(com.spotify.mobile.android.spotlets.browse.util.d.b(this.Y, j(), com.spotify.android.paste.widget.f.a(i())).d());
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
      this.f.addView(this.am.i(), 0, localLayoutParams);
      break;
      this.am = com.spotify.mobile.android.ui.prettylist.e.a((MainActivity)i());
      break label88;
      label356: this.al.setText(localGenre.d());
    }
  }

  public final String a(Context paramContext)
  {
    if (this.i != null)
      return this.i;
    return "Playlist Browse";
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    FragmentActivity localFragmentActivity = i();
    this.an = com.spotify.android.paste.widget.f.a(i());
    this.i = g().getString("title");
    this.Y = g().getString("genre");
    this.Z = g().getBoolean("eternalScroll");
    this.h = ViewUri.n.a(a(this.Y));
    this.ab = new by(localFragmentActivity, this);
    this.ah = new com.spotify.mobile.android.util.tracking.h(localFragmentActivity, a(this.Y));
    this.ah.b(paramBundle);
    this.ah.a();
    a_(com.spotify.android.paste.widget.f.a(i()));
    this.ac = dv.a(localFragmentActivity, this.h);
    if (com.spotify.android.paste.widget.f.a(localFragmentActivity));
    String str2;
    String str3;
    for (int j = localFragmentActivity.getResources().getInteger(2131558407); ; j = localFragmentActivity.getResources().getInteger(2131558408))
    {
      this.b = new com.spotify.mobile.android.spotlets.browse.a.e(j, this.ab);
      String str1 = this.Y;
      Genre localGenre = com.spotify.mobile.android.spotlets.browse.util.d.a(this.Y, j(), com.spotify.android.paste.widget.f.a(i()));
      if (localGenre != null)
      {
        if (!localGenre.e())
          str1 = com.spotify.mobile.android.spotlets.browse.util.d.a(this.Y, j(), com.spotify.android.paste.widget.f.a(i())).c();
        this.aa = localGenre.k();
      }
      str2 = str1;
      str3 = g().getString("country");
      if (!this.Y.equals("collection-favorites"))
        break;
      this.ag = new com.spotify.mobile.android.spotlets.browse.datasource.hermes.a(this);
      this.ag.a(localFragmentActivity);
      return;
    }
    this.af = new com.spotify.mobile.android.spotlets.browse.datasource.a.d(this, str3, this.Y, str2, RequestType.c);
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
    if (G().size() > 0)
      x.a(paramMenu.add(0, 2131362046, 0, i().getString(2131689491)).setIcon(2130837784).setOnMenuItemClickListener(new d.2(this)), 1);
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.e = LayoutInflater.from(i()).inflate(2130903124, null);
    this.ak = ((ListView)paramView.findViewById(16908298));
    this.ak.setOnScrollListener(this);
    this.d = u.a(this.f);
    this.ak.addFooterView(this.e);
    boolean bool;
    Genre localGenre2;
    if (!com.spotify.android.paste.widget.f.a(i()))
    {
      bool = com.spotify.android.paste.widget.f.a(i());
      localGenre2 = com.spotify.mobile.android.spotlets.browse.util.d.a(this.Y, j(), bool);
      if (localGenre2.e())
        break label614;
    }
    label484: label614: for (Genre localGenre3 = com.spotify.mobile.android.spotlets.browse.util.d.a(com.spotify.mobile.android.spotlets.browse.util.d.a(this.Y, j(), bool).c(), j(), bool); ; localGenre3 = localGenre2)
    {
      String str3 = localGenre3.j();
      Picasso localPicasso = ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a();
      if (!TextUtils.isEmpty(str3))
      {
        localPicasso.a(Uri.parse(str3)).a(this.am.d());
        View localView = new View(i());
        localView.setLayoutParams(new AbsListView.LayoutParams(0, j().getDimensionPixelSize(2131427361)));
        this.ak.addHeaderView(localView);
        label233: if (paramBundle == null)
          break label607;
        ArrayList localArrayList = paramBundle.getParcelableArrayList("playlists");
        a(localArrayList, null, localArrayList.size(), false, RequestType.c);
        Parcelable localParcelable = paramBundle.getParcelable("list");
        if (localParcelable != null)
          this.ak.onRestoreInstanceState(localParcelable);
      }
      while (true)
      {
        ((l)i()).a(this, this.i);
        t().a(2131362091, null, this.ab);
        t().a(2131362090, null, new aa(i(), this));
        this.ak.setAdapter(this.b);
        return;
        localPicasso.a(localGenre3.f()).a(this.am.d());
        break;
        if (!F())
          break label233;
        FragmentActivity localFragmentActivity = i();
        String str1 = this.Y;
        this.c = new com.spotify.mobile.android.spotlets.browse.view.f(localFragmentActivity, str1);
        this.c.a(this.ao);
        Genre localGenre1 = com.spotify.mobile.android.spotlets.browse.util.d.a(this.Y, j(), com.spotify.android.paste.widget.f.a(i()));
        String str2 = localGenre1.j();
        View[] arrayOfView;
        if (!TextUtils.isEmpty(str2))
        {
          this.c.b(2130838182);
          this.c.a(Uri.parse(str2));
          this.ak.addHeaderView(this.c);
          if (!ds.a(i()))
            break label599;
          arrayOfView = new View[3];
          arrayOfView[0] = this.c.b();
          arrayOfView[1] = this.c.a();
          arrayOfView[2] = this.c.c();
          if (Build.VERSION.SDK_INT < 11)
            break label587;
        }
        for (Object localObject = new com.spotify.mobile.android.util.a.f(arrayOfView); ; localObject = new com.spotify.mobile.android.util.a.e())
        {
          this.g = ((com.spotify.mobile.android.util.a.d)localObject);
          break;
          this.c.a(localGenre1.f());
          break label484;
        }
        this.g = null;
        break label233;
        E();
      }
    }
  }

  public final void a(List<Playlist> paramList, Map<String, ? extends Object> paramMap, int paramInt, boolean paramBoolean, RequestType paramRequestType)
  {
    this.ad = false;
    if (!n_());
    do
    {
      do
      {
        return;
        this.e.setVisibility(8);
      }
      while (paramInt < this.b.a());
      this.ae = paramBoolean;
      if (!this.ah.d())
        this.ah.b();
    }
    while (paramList == null);
    this.b.a(paramList);
    if (F())
    {
      if ((this.b.getCount() > 0) && (TextUtils.isEmpty(this.aa)))
        this.aa = this.b.a(0).d();
      t().a(2131362141, null, this.ap);
      if (com.spotify.android.paste.widget.f.a(i()))
        this.c.a(t(), this.aa);
    }
    this.b.notifyDataSetChanged();
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.d.setVisibility(8);
      this.ak.setVisibility(0);
      E();
      return;
    }
    this.d.setVisibility(0);
    this.ak.setVisibility(8);
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    a((Genre)G().get(paramMenuItem.getItemId()));
    return true;
  }

  public final boolean a_(int paramInt)
  {
    Genre localGenre = (Genre)G().get(paramInt);
    Assertion.a(localGenre, "Subgenre can't be null!");
    if (!this.Y.equals(localGenre.b()))
    {
      a(localGenre);
      return true;
    }
    return false;
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < this.b.a(); j++)
      localArrayList.add(this.b.a(j));
    paramBundle.putParcelableArrayList("playlists", localArrayList);
    paramBundle.putParcelable("list", this.ak.onSaveInstanceState());
    this.ah.a(paramBundle);
  }

  public final void e_()
  {
    this.b.a(this.ab.a(), this.ab.b());
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    if (paramView == this.al)
    {
      List localList = G();
      for (int j = 0; j < localList.size(); j++)
        com.spotify.mobile.android.ui.menus.d.a(paramView.getContext(), paramContextMenu, j, j, ((Genre)localList.get(j)).d());
    }
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.g != null)
      this.g.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    if (paramInt1 + paramInt2 >= 1 + (paramInt3 - 6));
    for (int j = 1; ; j = 0)
    {
      if ((j != 0) && (!this.ae))
        E();
      return;
    }
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }

  public final void q_()
  {
    super.q_();
    this.ah.c();
  }

  public final void w()
  {
    super.w();
    this.ac.a();
  }

  public final void x()
  {
    super.x();
    this.ac.b();
  }

  public final void y()
  {
    super.y();
    if (this.ag != null)
      this.ag.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
