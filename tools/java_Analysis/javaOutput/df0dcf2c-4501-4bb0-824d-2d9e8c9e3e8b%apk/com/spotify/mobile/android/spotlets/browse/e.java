package com.spotify.mobile.android.spotlets.browse;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.m;
import android.support.v4.app.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.datasource.a;
import com.spotify.mobile.android.spotlets.browse.datasource.a.f;
import com.spotify.mobile.android.spotlets.browse.model.Artist;
import com.spotify.mobile.android.ui.activity.l;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;
import com.spotify.mobile.android.util.by;
import com.spotify.mobile.android.util.bz;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.tracking.h;
import com.spotify.mobile.android.util.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class e extends m
  implements AbsListView.OnScrollListener, a<Artist>, com.spotify.mobile.android.ui.fragments.g, ab, bz
{
  private View Y;
  private View Z;
  private ViewGroup aa;
  private String ab;
  private by ac;
  private aa ad;
  private dt ae;
  private boolean af = false;
  private boolean ag = false;
  private h ah;
  private f ai;
  private com.spotify.mobile.android.spotlets.browse.a.g i;

  public e()
  {
  }

  private void D()
  {
    try
    {
      int j = this.i.a();
      if ((j > 0) && (j < 10))
        return;
      if (this.af)
        return;
    }
    finally
    {
    }
    this.af = true;
    this.Z.setVisibility(0);
    this.ai.b(this.i.a() / 10, 10);
  }

  public static e a(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("title", paramString1);
    localBundle.putString("country", paramString2);
    e locale = new e();
    locale.b_(localBundle);
    return locale;
  }

  public final Fragment C()
  {
    return this;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.aa = ((ViewGroup)paramLayoutInflater.inflate(2130903129, paramViewGroup, false));
    ((l)i()).a(this, this.ab);
    return this.aa;
  }

  public final String a(Context paramContext)
  {
    if (this.ab != null)
      return this.ab;
    return paramContext.getString(2131689645);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ab = g().getString("title");
    this.ad = new aa(i(), this);
    this.ac = new by(i(), this);
    this.ah = new h(i(), "spotify:app:browse:trending_artists");
    this.ah.b(paramBundle);
    this.ah.a();
    this.ae = dv.a(i(), ViewUri.m);
    this.i = new com.spotify.mobile.android.spotlets.browse.a.g(i().getResources().getInteger(2131558407), this.ac);
    this.ai = new f(this, g().getString("country"));
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.Z = LayoutInflater.from(i()).inflate(2130903124, null);
    ListView localListView = b();
    localListView.setOnScrollListener(this);
    this.Y = u.a(this.aa);
    localListView.addFooterView(this.Z);
    if (paramBundle != null)
    {
      ArrayList localArrayList = paramBundle.getParcelableArrayList("trending_artists");
      a(localArrayList, null, localArrayList.size(), false, RequestType.f);
      Parcelable localParcelable = paramBundle.getParcelable("list");
      if (localParcelable != null)
        b().onRestoreInstanceState(localParcelable);
    }
    while (true)
    {
      ((l)i()).a(this, this.ab);
      t().a(2131362091, null, this.ac);
      t().a(2131362090, null, this.ad);
      a(this.i);
      return;
      D();
    }
  }

  public final void a(List<Artist> paramList, Map<String, ? extends Object> paramMap, int paramInt, boolean paramBoolean, RequestType paramRequestType)
  {
    this.af = false;
    if (!n_());
    do
    {
      do
        return;
      while (paramInt < this.i.a());
      this.ag = paramBoolean;
      if (!this.ah.d())
        this.ah.b();
      this.Z.setVisibility(8);
    }
    while (paramList == null);
    this.i.a(paramList);
    this.i.notifyDataSetChanged();
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.Y.setVisibility(8);
      b().setVisibility(0);
      D();
      return;
    }
    this.Y.setVisibility(0);
    b().setVisibility(8);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < this.i.a(); j++)
      localArrayList.add(this.i.a(j));
    paramBundle.putParcelableArrayList("trending_artists", localArrayList);
    paramBundle.putParcelable("list", b().onSaveInstanceState());
    this.ah.a(paramBundle);
  }

  public final void e_()
  {
    this.i.a(this.ac.a(), this.ac.b());
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 + paramInt2 >= 1 + (paramInt3 - 5));
    for (int j = 1; ; j = 0)
    {
      if ((j != 0) && (!this.ag))
        D();
      return;
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
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
    this.ae.a();
  }

  public final void x()
  {
    super.x();
    this.ae.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
