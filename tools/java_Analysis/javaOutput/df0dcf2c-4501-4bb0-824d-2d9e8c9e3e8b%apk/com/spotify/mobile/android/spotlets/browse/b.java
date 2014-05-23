package com.spotify.mobile.android.spotlets.browse;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.m;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.devsmart.android.ui.HorizontalListView;
import com.spotify.mobile.android.model.Story;
import com.spotify.mobile.android.spotlets.browse.b.e;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.model.Genre;
import com.spotify.mobile.android.spotlets.browse.model.NewRelease;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.spotlets.browse.view.GenesisMenuLayoutCell;
import com.spotify.mobile.android.spotlets.browse.view.GenesisMenuLayoutHeaderCell;
import com.spotify.mobile.android.spotlets.browse.view.GenesisSectionLink;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.NavigationItem.NavigationGroup;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.fragments.g;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;
import com.spotify.mobile.android.util.by;
import com.spotify.mobile.android.util.bz;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.dy;
import com.spotify.mobile.android.util.tracking.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class b extends m
  implements com.spotify.mobile.android.spotlets.browse.datasource.a, NavigationItem, g, ab, bz
{
  private static final String[] i = { "name", "image_large_uri" };
  private View Y;
  private ListView Z;
  private by aA;
  private dt aB;
  private final com.spotify.mobile.android.spotlets.browse.b.f aC = new com.spotify.mobile.android.spotlets.browse.b.f(new e(ClientEvent.SubEvent.S, ViewUri.j, ViewUri.SubView.g));
  private final com.spotify.mobile.android.spotlets.browse.b.f aD = new com.spotify.mobile.android.spotlets.browse.b.f(new e(ClientEvent.SubEvent.T, ViewUri.j, ViewUri.SubView.g));
  private final com.spotify.mobile.android.spotlets.browse.b.c aE = new com.spotify.mobile.android.spotlets.browse.b.c(new e(ClientEvent.SubEvent.N, ViewUri.j, ViewUri.SubView.g), false);
  private final com.spotify.mobile.android.spotlets.browse.b.b aF = new com.spotify.mobile.android.spotlets.browse.b.b(new e(ClientEvent.SubEvent.N, ViewUri.j, ViewUri.SubView.g));
  private final com.spotify.mobile.android.spotlets.browse.b.d aG = new com.spotify.mobile.android.spotlets.browse.b.d(new e(ClientEvent.SubEvent.N, ViewUri.j, ViewUri.SubView.g));
  private h aH;
  private boolean aI;
  private boolean aJ;
  private com.spotify.mobile.android.ui.actions.a aK = (com.spotify.mobile.android.ui.actions.a)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
  private o<Cursor> aL = new b.5(this);
  private o<Cursor> aM = new b.6(this);
  private q aa;
  private HorizontalListView ab;
  private HorizontalListView ac;
  private TextView ad;
  private GenesisMenuLayoutHeaderCell ae;
  private GenesisMenuLayoutCell af;
  private GenesisMenuLayoutCell ag;
  private GenesisMenuLayoutHeaderCell ah;
  private GenesisMenuLayoutCell ai;
  private GenesisMenuLayoutCell aj;
  private ArrayList<Playlist> ak;
  private ArrayList<NewRelease> al;
  private Story am;
  private com.spotify.mobile.android.spotlets.browse.a.f an;
  private com.spotify.mobile.android.spotlets.browse.a.f ao;
  private com.spotify.mobile.android.spotlets.browse.a.b ap;
  private com.spotify.mobile.android.spotlets.browse.datasource.hermes.a aq;
  private String ar;
  private String as;
  private String at;
  private String au;
  private String av;
  private String aw;
  private String ax;
  private String ay;
  private String az;

  public b()
  {
  }

  private void F()
  {
    new com.spotify.mobile.android.spotlets.browse.datasource.a.a(this, this.az).b(0, 10);
    new com.spotify.mobile.android.spotlets.browse.datasource.a.b(this, this.az, j()).b(0, 500);
    new com.spotify.mobile.android.spotlets.browse.datasource.a.c(this, this.az).b(0, 10);
    new com.spotify.mobile.android.spotlets.browse.datasource.a.d(this, this.az, "toplists", "toplists", RequestType.g).b(0, 10);
    if (FeatureFragment.c.a())
      t().a(2131362117, null, new b.4(this));
    this.aq.a();
  }

  private void G()
  {
    if (i() != null)
    {
      String str1 = i().getString(2131689919).toUpperCase(Locale.getDefault());
      String str2 = this.am.h();
      String str3 = this.am.c();
      this.ai.a(str1, str2, com.spotify.mobile.android.provider.i.a(str3));
    }
  }

  private TextView a(ViewGroup paramViewGroup, String paramString)
  {
    LinearLayout localLinearLayout = (LinearLayout)LayoutInflater.from(i()).inflate(2130903179, paramViewGroup, false);
    TextView localTextView = (TextView)localLinearLayout.findViewById(2131362227);
    localTextView.setText(paramString);
    paramViewGroup.addView(localLinearLayout);
    return localTextView;
  }

  public static b a(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("title", paramString2);
    localBundle.putString("countryCode", paramString1);
    b localb = new b();
    localb.b_(localBundle);
    return localb;
  }

  private HorizontalListView b(int paramInt)
  {
    HorizontalListView localHorizontalListView = new HorizontalListView(i(), null);
    localHorizontalListView.setLayoutParams(new AbsListView.LayoutParams(-1, paramInt));
    return localHorizontalListView;
  }

  public final Fragment C()
  {
    return this;
  }

  public final NavigationItem.NavigationGroup D()
  {
    return NavigationItem.NavigationGroup.o;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903129, paramViewGroup, false);
    this.aA = new by(i(), this);
    this.aa = new q(i());
    this.Z = ((ListView)localView.findViewById(16908298));
    this.an = new com.spotify.mobile.android.spotlets.browse.a.f(this.aA);
    this.ao = new com.spotify.mobile.android.spotlets.browse.a.f(this.aA);
    this.ap = new com.spotify.mobile.android.spotlets.browse.a.b(i().getResources().getInteger(2131558407), this.aA);
    this.aa.a(this.ap, i().getString(2131689639).toUpperCase(Locale.getDefault()), 0);
    this.aa.b(new int[] { 0 });
    ViewGroup localViewGroup;
    if (FeatureFragment.c.a())
    {
      FragmentActivity localFragmentActivity2 = i();
      localViewGroup = com.spotify.mobile.android.ui.view.i.b(i());
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -1, 1.0F);
      int j = localFragmentActivity2.getResources().getDimensionPixelSize(2131427420);
      com.spotify.mobile.android.spotlets.browse.view.b localb1 = new com.spotify.mobile.android.spotlets.browse.view.b(localFragmentActivity2);
      this.ae = localb1.a(localFragmentActivity2, localViewGroup, 0);
      this.ae.setOnClickListener(new b.11(this, localFragmentActivity2));
      this.ae.setVisibility(8);
      localViewGroup.addView(localb1, localLayoutParams2);
      com.spotify.mobile.android.spotlets.browse.view.b localb2 = new com.spotify.mobile.android.spotlets.browse.view.b(localFragmentActivity2);
      this.af = localb2.a(localFragmentActivity2, localViewGroup, 0, j, j / 2);
      this.af.setOnClickListener(new b.12(this, localFragmentActivity2));
      this.ag = localb2.a(localFragmentActivity2, localViewGroup, j / 2, j, 0);
      this.ag.setOnClickListener(new b.13(this, localFragmentActivity2));
      localViewGroup.addView(localb2, localLayoutParams2);
      com.spotify.mobile.android.spotlets.browse.view.b localb3 = new com.spotify.mobile.android.spotlets.browse.view.b(localFragmentActivity2);
      this.ah = localb3.a(localFragmentActivity2, localViewGroup, j);
      this.ah.setOnClickListener(new b.14(this, localFragmentActivity2));
      localViewGroup.addView(localb3, localLayoutParams2);
      com.spotify.mobile.android.spotlets.browse.view.b localb4 = new com.spotify.mobile.android.spotlets.browse.view.b(localFragmentActivity2);
      this.ai = localb4.a(localFragmentActivity2, localViewGroup, 0, j, j / 2);
      this.ai.setOnClickListener(new b.2(this, localFragmentActivity2));
      this.aj = localb4.a(localFragmentActivity2, localViewGroup, j / 2, j, 0);
      this.aj.setOnClickListener(new b.3(this, localFragmentActivity2));
      localViewGroup.addView(localb4, localLayoutParams2);
    }
    while (true)
    {
      this.Z.addHeaderView(localViewGroup, null, false);
      a(this.aa);
      return localView;
      FragmentActivity localFragmentActivity1 = i();
      localViewGroup = com.spotify.mobile.android.ui.view.i.b(i());
      this.ab = b(j().getDimensionPixelOffset(2131427418));
      this.ab.a(this.an);
      a(localViewGroup, localFragmentActivity1.getString(2131689521).toUpperCase(Locale.getDefault()));
      this.ab.setVisibility(8);
      localViewGroup.addView(this.ab);
      TextView localTextView = a(localViewGroup, " ");
      localTextView.setPadding(localTextView.getPaddingLeft(), 10, localTextView.getPaddingRight(), localTextView.getPaddingBottom());
      LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -1, 1.0F);
      GenesisSectionLink localGenesisSectionLink1 = GenesisSectionLink.a(localFragmentActivity1, localViewGroup);
      String str1 = localFragmentActivity1.getString(2131689644);
      localGenesisSectionLink1.a(str1.toUpperCase(Locale.getDefault()), 2130838002, new b.1(this, localFragmentActivity1, str1));
      localViewGroup.addView(localGenesisSectionLink1, localLayoutParams1);
      GenesisSectionLink localGenesisSectionLink2 = GenesisSectionLink.a(localFragmentActivity1, localViewGroup);
      String str2 = localFragmentActivity1.getString(2131689643);
      localGenesisSectionLink2.a(str2.toUpperCase(Locale.getDefault()), 2130838000, new b.7(this, localFragmentActivity1, str2));
      localViewGroup.addView(localGenesisSectionLink2, localLayoutParams1);
      GenesisSectionLink localGenesisSectionLink3 = GenesisSectionLink.a(localFragmentActivity1, localViewGroup);
      localGenesisSectionLink3.a(localFragmentActivity1.getString(2131689919).toUpperCase(Locale.getDefault()), 2130838001, new b.8(this, localFragmentActivity1));
      localViewGroup.addView(localGenesisSectionLink3, localLayoutParams1);
      this.ac = b(j().getDimensionPixelOffset(2131427418));
      this.ac.a(this.ao);
      this.ad = a(localViewGroup, localFragmentActivity1.getString(2131689642).toUpperCase(Locale.getDefault()));
      this.ad.setMinLines(1);
      this.ad.setMaxLines(2);
      localViewGroup.addView(this.ac);
      this.ab.setOnItemClickListener(new b.9(this));
      this.ac.setOnItemClickListener(new b.10(this));
    }
  }

  public final String a(Context paramContext)
  {
    if (this.ay == null)
      return paramContext.getString(2131689964);
    return this.ay;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    com.spotify.mobile.android.spotlets.browse.util.d.a(i().getResources(), true);
    this.ay = g().getString("title");
    this.az = g().getString("countryCode");
    a_(true);
    this.aB = dv.a(i(), ViewUri.j);
    this.aH = new h(i(), "spotify:app:genesis");
    this.aH.b(paramBundle);
    this.aq = new com.spotify.mobile.android.spotlets.browse.datasource.hermes.a(this);
    this.aq.a(i());
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.Y = dy.a(paramView, Integer.valueOf(2130838016), Integer.valueOf(2131689641), Integer.valueOf(2131689640));
    b().setOnCreateContextMenuListener(this);
    if (paramBundle != null)
    {
      ArrayList localArrayList1 = paramBundle.getParcelableArrayList("collectionFavorites");
      ArrayList localArrayList2 = paramBundle.getParcelableArrayList("featuredPlaylists");
      this.ax = paramBundle.getString("featuredPlaylistsLabel");
      if (FeatureFragment.c.a())
      {
        this.ak = paramBundle.getParcelableArrayList("topLists");
        this.al = paramBundle.getParcelableArrayList("newReleases");
        this.am = ((Story)paramBundle.getParcelable("discoverStory"));
      }
      int j = 1;
      if ((this.ax == null) || (localArrayList1 == null) || (localArrayList2 == null))
        j = 0;
      if ((FeatureFragment.c.a()) && ((this.ak == null) || (this.al == null) || (this.am == null)))
        j = 0;
      if (j != 0)
      {
        if (FeatureFragment.c.a())
        {
          a(this.ak, null, this.ak.size(), false, RequestType.g);
          a(this.al, null, this.al.size(), false, RequestType.e);
          G();
        }
        a(localArrayList1, null, localArrayList1.size(), false, RequestType.d);
        Parcelable localParcelable = paramBundle.getParcelable("list");
        if (localParcelable != null)
          b().onRestoreInstanceState(localParcelable);
        a(null, null, -1, false, RequestType.b);
        HashMap localHashMap = new HashMap();
        localHashMap.put("label", this.ax);
        a(localArrayList2, localHashMap, localArrayList2.size(), false, RequestType.a);
      }
    }
    while (true)
    {
      t().a(2131362091, null, this.aA);
      t().a(2131362090, null, new aa(i(), this));
      return;
      F();
      continue;
      F();
    }
  }

  public final void a(List paramList, Map paramMap, int paramInt, boolean paramBoolean, RequestType paramRequestType)
  {
    if (!n_());
    label308: label724: label726: label859: 
    while (true)
    {
      return;
      if ((paramList != null) && (!paramList.isEmpty()))
      {
        if (!FeatureFragment.c.a())
          break label726;
        if (paramRequestType != RequestType.a)
          break label308;
        this.ao.a(paramList);
        this.ao.notifyDataSetChanged();
        Playlist localPlaylist5 = this.ao.a(0);
        this.ax = i().getString(2131689642).toUpperCase(Locale.getDefault());
        if (paramMap != null)
          this.ax = ((String)paramMap.get("label")).toUpperCase(Locale.getDefault());
        String str11 = localPlaylist5.c();
        this.ah.a(null, null, str11, this.ax, null, null, null);
        this.aI = true;
        if (paramRequestType == RequestType.b)
          com.spotify.mobile.android.spotlets.browse.util.d.a(paramList, true);
      }
      int j;
      if (paramRequestType == RequestType.b)
      {
        this.ap.a();
        this.ap.a(com.spotify.mobile.android.spotlets.browse.util.d.a(j(), true));
        this.ap.notifyDataSetChanged();
        if (!FeatureFragment.c.a())
          break label849;
        Genre localGenre = this.ap.a(0);
        if ((localGenre == null) || (localGenre.d() == null) || (localGenre.i() == null))
          break label843;
        j = 1;
        label232: if (j != 0)
        {
          String str1 = i().getString(2131689639).toUpperCase(Locale.getDefault());
          String str2 = localGenre.i();
          this.aj.a(str1, "", str2);
        }
      }
      while (true)
      {
        if ((!this.aI) || (!this.aJ) || (this.aH.d()))
          break label859;
        this.aH.b();
        return;
        if (paramRequestType == RequestType.d)
        {
          this.an.a(paramList);
          this.an.notifyDataSetChanged();
          Playlist localPlaylist2 = this.an.a(0);
          String str6 = i().getString(2131689521).toUpperCase(Locale.getDefault());
          String str7 = localPlaylist2.b();
          String str8 = localPlaylist2.c();
          int m = this.an.getCount();
          String str9 = null;
          String str10 = null;
          if (m >= 3)
          {
            Playlist localPlaylist3 = this.an.a(1);
            Playlist localPlaylist4 = this.an.a(2);
            str7 = str7 + ", " + localPlaylist3.b() + ", " + localPlaylist4.b();
            str9 = localPlaylist3.c();
            str10 = localPlaylist4.c();
          }
          this.ae.a(str6, str7, str8, null, str9, str8, str10);
          if (paramList.size() >= 3)
            this.ae.setVisibility(0);
          this.aJ = true;
          break;
        }
        if (paramRequestType == RequestType.g)
        {
          this.ak = ((ArrayList)paramList);
          Playlist localPlaylist1 = (Playlist)this.ak.get(0);
          this.ar = i().getString(2131689622).toUpperCase(Locale.getDefault());
          this.as = localPlaylist1.b();
          this.at = localPlaylist1.c();
          this.av = localPlaylist1.d();
          t().a(2131362123, null, this.aL);
          break;
        }
        if (paramRequestType != RequestType.e)
          break;
        this.al = ((ArrayList)paramList);
        NewRelease localNewRelease = (NewRelease)this.al.get(0);
        if ((localNewRelease != null) && (localNewRelease.a() != null) && (localNewRelease.b() != null));
        for (int k = 1; ; k = 0)
        {
          if (k == 0)
            break label724;
          String str3 = i().getString(2131689585).toUpperCase(Locale.getDefault());
          String str4 = localNewRelease.a();
          String str5 = localNewRelease.b();
          this.ag.a(str3, str4, str5);
          break;
        }
        break;
        if (paramRequestType == RequestType.a)
        {
          this.ao.a(paramList);
          this.ao.notifyDataSetChanged();
          if (paramMap != null)
          {
            this.ax = ((String)paramMap.get("label")).toUpperCase(Locale.getDefault());
            this.ad.setText(this.ax);
          }
          this.aI = true;
          break;
        }
        if (paramRequestType != RequestType.d)
          break;
        this.an.a(paramList);
        this.an.notifyDataSetChanged();
        this.aJ = true;
        if (paramList.size() < 3)
          break;
        this.ab.setVisibility(0);
        break;
        j = 0;
        break label232;
        this.aa.d(0);
      }
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.Y.setVisibility(8);
      this.Z.setVisibility(0);
      return;
    }
    this.Y.setVisibility(0);
    this.Z.setVisibility(8);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putParcelableArrayList("collectionFavorites", this.an.a());
    paramBundle.putParcelableArrayList("featuredPlaylists", this.ao.a());
    paramBundle.putParcelable("list", b().onSaveInstanceState());
    if (FeatureFragment.c.a())
    {
      if (this.ak != null)
        paramBundle.putParcelableArrayList("topLists", this.ak);
      if (this.al != null)
        paramBundle.putParcelableArrayList("newReleases", this.al);
      if (this.am != null)
        paramBundle.putParcelable("discoverStory", this.am);
    }
    paramBundle.putString("featuredPlaylistsLabel", this.ax);
    this.aH.a(paramBundle);
  }

  public final void e_()
  {
    if (this.ao != null)
      this.ao.a(this.aA.a(), this.aA.b());
  }

  public final void p_()
  {
    super.p_();
    this.aH.a();
  }

  public final void q_()
  {
    super.q_();
    this.aH.c();
  }

  public final void w()
  {
    super.w();
    this.aB.a();
  }

  public final void x()
  {
    super.x();
    this.aB.b();
  }

  public final void y()
  {
    super.y();
    this.aq.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
