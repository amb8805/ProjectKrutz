package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.m;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.model.j;
import com.spotify.mobile.android.provider.f;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.activity.l;
import com.spotify.mobile.android.ui.menus.PlaylistMenuDelegate;
import com.spotify.mobile.android.ui.menus.PlaylistMenuDelegate.CanDownload;
import com.spotify.mobile.android.ui.menus.PlaylistMenuDelegate.CanRemovePlaylist;
import com.spotify.mobile.android.ui.menus.a;
import com.spotify.mobile.android.ui.p;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.cv;
import com.spotify.mobile.android.util.dm;
import com.spotify.mobile.android.util.ds;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.dx;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class e extends m
  implements g, com.spotify.mobile.android.ui.o, p
{
  private static final String[] Y = { "name", "folder_all_tracks_uri" };
  private static final List<cv> Z;
  private static final cv aa = new cv("", 2131690299, false);
  private String ab;
  private String ac;
  private String ad;
  private boolean ae;
  private ListView af;
  private Parcelable ag;
  private ListItemView ah;
  private FilterHeaderView ai;
  private LoadingView aj;
  private com.spotify.mobile.android.ui.adapter.o ak;
  private EmptyView al;
  private String am;
  private cv an = aa;
  private int ao = -1;
  private dt ap;
  private PlaylistMenuDelegate aq;
  private com.spotify.mobile.android.ui.view.h ar = new e.3(this);
  private android.support.v4.app.o<Cursor> as = new e.4(this);
  private android.support.v4.app.o<Cursor> at = new e.5(this);
  com.spotify.mobile.android.ui.n i;

  static
  {
    ArrayList localArrayList = new ArrayList();
    Z = localArrayList;
    localArrayList.add(new cv("name", 2131690296));
    Z.add(aa);
  }

  public e()
  {
  }

  private void E()
  {
    boolean bool1 = this.ae;
    String str1 = null;
    if (!bool1)
    {
      boolean bool2 = this.i.b();
      str1 = null;
      if (bool2)
        str1 = this.i.a();
    }
    if (TextUtils.isEmpty(str1));
    for (String str2 = a(i()); ; str2 = str1)
    {
      ((l)i()).a(this, str2);
      ((l)i()).h();
      return;
    }
  }

  private static Intent a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    Intent localIntent = MainActivity.a(paramContext, paramString1, paramString2);
    localIntent.putExtra("folder_uri", paramString1);
    localIntent.putExtra("title", paramString2);
    localIntent.putExtra("selected_index", paramInt);
    localIntent.putExtra("sub_fragment_uri", paramString3);
    localIntent.putExtra("sub_fragment_name", paramString4);
    return localIntent;
  }

  public static e a(String paramString1, String paramString2, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("folder_uri", paramString1);
    localBundle.putString("title", paramString2);
    localBundle.putBoolean("is_sub_fragment", paramBoolean);
    e locale = new e();
    locale.b_(localBundle);
    return locale;
  }

  public static boolean b(Intent paramIntent)
  {
    return paramIntent.hasExtra("folder_uri");
  }

  public final Fragment C()
  {
    return this;
  }

  public final Fragment a(String paramString1, String paramString2)
  {
    return MainActivity.a(new SpotifyLink(paramString1), paramString2);
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    ViewGroup localViewGroup1 = (ViewGroup)paramLayoutInflater.inflate(2130903186, paramViewGroup, false);
    this.af = ((ListView)localViewGroup1.findViewById(16908298));
    ViewGroup localViewGroup2 = (ViewGroup)this.af.getParent();
    this.af.setFastScrollEnabled(true);
    this.af.setVisibility(4);
    this.ak = new com.spotify.mobile.android.ui.adapter.o(i());
    this.ah = com.spotify.android.paste.widget.h.h(i(), this.af);
    this.ah.a(a(2131689980));
    ImageView localImageView = this.ah.a();
    localImageView.setScaleType(ImageView.ScaleType.CENTER);
    com.spotify.android.paste.graphics.e locale1 = new com.spotify.android.paste.graphics.e(i(), SpotifyIcon.aH);
    locale1.a(com.spotify.android.paste.widget.g.a(i(), 2130772374));
    localImageView.setImageDrawable(locale1);
    i();
    this.ai = FilterHeaderView.a(paramLayoutInflater, this.am, Z, this.an, this.ar, this.af);
    this.ai.setBackgroundColor(j().getColor(2131296272));
    this.af.addHeaderView(this.ah);
    a(this.ak);
    this.aj = LoadingView.a(LayoutInflater.from(i()));
    localViewGroup2.addView(this.aj);
    this.al = new EmptyView(i());
    this.al.b().setSingleLine(false);
    this.al.b().setEllipsize(null);
    this.al.a(i().getString(2131690126));
    if (!ds.b(i()))
    {
      com.spotify.android.paste.graphics.e locale2 = new com.spotify.android.paste.graphics.e(i(), SpotifyIcon.ab, i().getResources().getDimensionPixelSize(2131427413));
      locale2.a(com.spotify.android.paste.widget.g.a(i(), 2130772376));
      this.al.a(locale2);
    }
    Button localButton = com.spotify.android.paste.widget.h.b(i(), localViewGroup1);
    localButton.setId(2131362050);
    localButton.setText(j().getString(2131690125).toUpperCase(Locale.getDefault()));
    localButton.setSingleLine(true);
    this.al.a(localButton);
    localButton.setOnClickListener(new e.2(this));
    this.al.setVisibility(8);
    localViewGroup2.addView(this.al);
    return localViewGroup1;
  }

  public final String a(Context paramContext)
  {
    if (g().getString("title") == null)
      return paramContext.getString(2131689956);
    return g().getString("title");
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = g();
    this.ab = localBundle.getString("folder_uri");
    this.ad = localBundle.getString("title");
    this.ae = localBundle.getBoolean("is_sub_fragment");
    this.ao = localBundle.getInt("selected_index", -1);
    if (paramBundle != null)
    {
      this.an = cv.a(paramBundle.getString("sort_order"), Z);
      this.am = paramBundle.getString("filter");
      this.ag = paramBundle.getParcelable("list");
    }
    if (this.am == null)
      this.am = "";
    if (this.an == null)
      this.an = aa;
    this.aq = new PlaylistMenuDelegate(f.b(this.ab), PlaylistMenuDelegate.CanDownload.a, PlaylistMenuDelegate.CanRemovePlaylist.a, new e.1(this));
    if (!this.ae);
    for (boolean bool = true; ; bool = false)
    {
      a_(bool);
      ViewUri.Verified localVerified = ViewUri.C.a(this.ab);
      this.ap = dv.a(i(), localVerified);
      return;
    }
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
    c(paramMenu);
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    b().setOnCreateContextMenuListener(this);
    if (!this.ae)
    {
      this.i = new com.spotify.mobile.android.ui.n(this, this);
      this.i.a(paramBundle);
    }
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    if (ds.a(paramView, this.ah))
      if (this.ac != null)
      {
        if (!this.ae)
          break label54;
        a(a(i(), this.ab, this.ad, this.ac, this.ad, -1));
      }
    label54: Object localObject;
    do
    {
      do
      {
        return;
        if (this.i.b())
        {
          this.i.a(this.ac, this.ad);
          return;
        }
        a(MainActivity.a(i(), this.ac, this.ad));
        return;
      }
      while (ds.a(paramView, this.ai));
      localObject = paramView.getTag();
    }
    while (!(localObject instanceof j));
    j localj = (j)localObject;
    if ((localj.s()) && (!TextUtils.isEmpty(localj.s_())))
    {
      if (this.ae)
      {
        a(a(i(), this.ab, this.ad, localj.s_(), localj.a(i()), paramInt));
        return;
      }
      if (this.i.b())
      {
        this.i.a(localj.s_(), localj.a(i()));
        return;
      }
      a(MainActivity.a(i(), localj.s_(), localj.a(i())));
      return;
    }
    dm.h(i());
  }

  public final void a(String paramString)
  {
    if (paramString != null)
      if (new SpotifyLink(paramString).a() == SpotifyLink.LinkType.F)
      {
        this.ah.setActivated(true);
        this.ak.a(null);
      }
    while (true)
    {
      E();
      return;
      this.ah.setActivated(false);
      this.ak.a(paramString);
      continue;
      this.ah.setActivated(false);
      this.ak.a(null);
    }
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.aj.a();
    t().a(2131362118, null, this.as);
    t().a(2131362119, null, this.at);
  }

  public final void c(Menu paramMenu)
  {
    if (!this.ae)
      a.a(i(), paramMenu, ViewUri.C.a(this.ab), this.ab);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("sort_order", this.an.b());
    paramBundle.putString("filter", this.am);
    if (this.af != null)
      paramBundle.putParcelable("list", this.af.onSaveInstanceState());
    if (this.i != null)
      this.i.b(paramBundle);
  }

  public final void e()
  {
    FilterHeaderView.a(this.ai);
    super.e();
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    Object localObject = ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView.getTag();
    if ((localObject instanceof j))
      this.aq.a(paramContextMenu, (j)localObject);
  }

  public final void w()
  {
    super.w();
    this.ap.a();
  }

  public final void x()
  {
    super.x();
    this.ap.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
