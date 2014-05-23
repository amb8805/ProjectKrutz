package com.spotify.mobile.android.spotlets.browse;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.n;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.devsmart.android.ui.HorizontalListView;
import com.spotify.android.paste.widget.CardView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.mobile.android.spotlets.browse.b.e;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.NavigationItem.NavigationGroup;
import com.spotify.mobile.android.ui.activity.l;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;
import com.spotify.mobile.android.util.ap;
import com.spotify.mobile.android.util.by;
import com.spotify.mobile.android.util.bz;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class a extends Fragment
  implements com.spotify.mobile.android.spotlets.browse.datasource.a, NavigationItem, com.spotify.mobile.android.ui.fragments.g, ab, bz
{
  private boolean Y;
  private com.spotify.mobile.android.spotlets.browse.a.a Z;
  private com.spotify.mobile.android.spotlets.browse.a.b a;
  private String aa;
  private TextView ab;
  private final com.spotify.mobile.android.spotlets.browse.b.f ac = new com.spotify.mobile.android.spotlets.browse.b.f(new e(ClientEvent.SubEvent.T, ViewUri.k, ViewUri.SubView.g));
  private final com.spotify.mobile.android.spotlets.browse.b.c ad = new com.spotify.mobile.android.spotlets.browse.b.c(new e(ClientEvent.SubEvent.N, ViewUri.k, ViewUri.SubView.g), false);
  private ViewGroup b;
  private dt c;
  private View d;
  private String e;
  private String f;
  private com.spotify.mobile.android.util.tracking.h g;
  private ListView h;
  private by i;

  public a()
  {
  }

  private void E()
  {
    if (!this.Y)
      new com.spotify.mobile.android.spotlets.browse.datasource.a.a(this, this.f).b(0, 10);
    new com.spotify.mobile.android.spotlets.browse.datasource.a.b(this, this.f, j()).b(0, 100);
  }

  private ListItemView a(String paramString, int paramInt, View.OnClickListener paramOnClickListener)
  {
    TypedArray localTypedArray = i().obtainStyledAttributes(new int[] { 2130772344 });
    Drawable localDrawable = localTypedArray.getDrawable(0);
    ListItemView localListItemView = com.spotify.android.paste.widget.h.j(i(), null);
    com.spotify.android.paste.widget.g.a(localListItemView, localDrawable);
    localListItemView.a(paramString);
    localListItemView.a().setImageResource(paramInt);
    localListItemView.setOnClickListener(paramOnClickListener);
    localTypedArray.recycle();
    return localListItemView;
  }

  public static a a(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("title", paramString1);
    localBundle.putString("country", paramString2);
    a locala = new a();
    locala.b_(localBundle);
    return locala;
  }

  public final Fragment C()
  {
    return this;
  }

  public final NavigationItem.NavigationGroup D()
  {
    return NavigationItem.NavigationGroup.c;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.Z = new com.spotify.mobile.android.spotlets.browse.a.a(this.i);
    this.b = ((ViewGroup)paramLayoutInflater.inflate(2130903129, paramViewGroup, false));
    ListView localListView;
    LinearLayout localLinearLayout;
    FragmentActivity localFragmentActivity;
    int j;
    int k;
    int m;
    if (!this.Y)
    {
      localListView = (ListView)this.b.findViewById(16908298);
      localLinearLayout = new LinearLayout(i());
      localLinearLayout.setOrientation(1);
      localFragmentActivity = i();
      String str1 = localFragmentActivity.getString(2131689642);
      TextView localTextView = (TextView)LayoutInflater.from(i()).inflate(2130903131, localLinearLayout, false);
      localTextView.setText(str1);
      localLinearLayout.addView(localTextView);
      this.ab = localTextView;
      j = ((ap)com.spotify.mobile.android.c.c.a(ap.class)).b();
      k = com.spotify.android.paste.graphics.d.b(56.0F, j());
      if (!com.spotify.android.paste.widget.f.a(i()))
        break label445;
      m = j().getDimensionPixelSize(2131427473);
    }
    for (int n = 0; ; n = j().getDimensionPixelOffset(2131427474))
    {
      int i1 = CardView.a(j, m, k, n);
      HorizontalListView localHorizontalListView = new HorizontalListView(i(), null);
      localHorizontalListView.setLayoutParams(new AbsListView.LayoutParams(-1, i1));
      localHorizontalListView.setId(2131362047);
      localHorizontalListView.a(this.Z);
      localLinearLayout.addView(localHorizontalListView);
      localHorizontalListView.setOnItemClickListener(new a.1(this));
      SectionHeaderView localSectionHeaderView1 = new SectionHeaderView(i());
      localSectionHeaderView1.a("");
      localSectionHeaderView1.b().setTextSize(0.0F);
      localLinearLayout.addView(localSectionHeaderView1);
      String str2 = localFragmentActivity.getString(2131689644);
      ListItemView localListItemView1 = a(str2, 2130838002, new a.2(this, localFragmentActivity, str2));
      localListItemView1.setId(2131362049);
      localLinearLayout.addView(localListItemView1);
      String str3 = localFragmentActivity.getString(2131689643);
      ListItemView localListItemView2 = a(str3, 2130838000, new a.3(this, localFragmentActivity, str3));
      localListItemView2.setId(2131362048);
      localLinearLayout.addView(localListItemView2);
      SectionHeaderView localSectionHeaderView2 = new SectionHeaderView(i());
      localSectionHeaderView2.a(i().getString(2131689639).toUpperCase(Locale.getDefault()));
      localSectionHeaderView2.a(false);
      localLinearLayout.addView(localSectionHeaderView2);
      localListView.addHeaderView(localLinearLayout);
      return this.b;
      label445: m = j().getDimensionPixelSize(2131427472);
    }
  }

  public final String a(Context paramContext)
  {
    if (this.e != null)
      return this.e;
    return "Browse";
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    FragmentActivity localFragmentActivity = i();
    this.Y = com.spotify.android.paste.widget.f.a(i());
    this.e = g().getString("title");
    this.f = g().getString("country");
    this.i = new by(i(), this);
    this.a = new com.spotify.mobile.android.spotlets.browse.a.b(i().getResources().getInteger(2131558407), this.i);
    this.a.a(com.spotify.mobile.android.spotlets.browse.util.d.a(i().getResources(), this.Y));
    this.g = new com.spotify.mobile.android.util.tracking.h(localFragmentActivity, "spotify:app:browse");
    this.g.b(paramBundle);
    this.g.a();
    this.c = dv.a(localFragmentActivity, ViewUri.k);
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.h = ((ListView)paramView.findViewById(16908298));
    this.d = u.a(this.b);
    if (!this.Y)
    {
      View localView = new View(i());
      localView.setLayoutParams(new AbsListView.LayoutParams(0, j().getDimensionPixelSize(2131427361)));
      this.h.addHeaderView(localView);
    }
    if (paramBundle != null)
    {
      ArrayList localArrayList = paramBundle.getParcelableArrayList("genres");
      a(localArrayList, null, localArrayList.size(), false, RequestType.c);
      this.aa = paramBundle.getString("featuredPlaylistsLabel");
      if (!TextUtils.isEmpty(this.aa))
        this.ab.setText(this.aa);
      Parcelable localParcelable = paramBundle.getParcelable("list");
      if (localParcelable != null)
        this.h.onRestoreInstanceState(localParcelable);
    }
    while (true)
    {
      ((l)i()).a(this, a(i()));
      ((l)i()).h();
      t().a(2131362091, null, this.i);
      t().a(2131362090, null, new aa(i(), this));
      this.h.setAdapter(this.a);
      return;
      E();
    }
  }

  public final void a(List paramList, Map paramMap, int paramInt, boolean paramBoolean, RequestType paramRequestType)
  {
    if (!this.g.d())
      this.g.b();
    if (!n_());
    do
    {
      do
      {
        do
        {
          return;
          if (paramRequestType == RequestType.b)
          {
            this.a.a();
            if (paramList != null)
              com.spotify.mobile.android.spotlets.browse.util.d.a(paramList, this.Y);
            this.a.a(com.spotify.mobile.android.spotlets.browse.util.d.a(j(), this.Y));
            this.a.notifyDataSetChanged();
            return;
          }
        }
        while ((paramRequestType != RequestType.a) || (this.Y));
        this.Z.a();
        if (paramList != null)
          this.Z.a(paramList);
        this.Z.notifyDataSetChanged();
      }
      while (paramMap == null);
      this.aa = ((String)paramMap.get("label"));
    }
    while (TextUtils.isEmpty(this.aa));
    this.ab.setText(this.aa);
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.d.setVisibility(8);
      this.h.setVisibility(0);
      E();
      return;
    }
    this.d.setVisibility(0);
    this.h.setVisibility(8);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putParcelableArrayList("genres", this.a.b());
    paramBundle.putParcelable("list", this.h.onSaveInstanceState());
    paramBundle.putString("featuredPlaylistsLabel", this.aa);
    this.g.a(paramBundle);
  }

  public final void e_()
  {
    if (this.Z != null)
      this.Z.a(this.i.a(), this.i.b());
  }

  public final void q_()
  {
    super.q_();
    this.g.c();
  }

  public final void w()
  {
    super.w();
    this.c.a();
  }

  public final void x()
  {
    super.x();
    this.c.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
