package com.spotify.mobile.android.spotlets.collection.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.adapter.w;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.menus.ArtistMenuDelegate;
import com.spotify.mobile.android.ui.menus.ArtistMenuDelegate.CanDownload;
import com.spotify.mobile.android.ui.p;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.cv;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import com.spotify.mobile.android.util.cy;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import java.util.ArrayList;
import java.util.List;

public final class d extends Fragment
  implements g, com.spotify.mobile.android.ui.fragments.g, p
{
  public static final String a = ViewUri.aB.toString();
  private static final cy b = cy.a("artists_sort_order");
  private static final cy c = cy.a("artists_show_only_offlined_content");
  private static final List<cv> d;
  private static final cv e = new cv("name", 2131690296);
  private EmptyView Y;
  private EmptyView Z;
  private Parcelable aa;
  private com.spotify.mobile.android.spotlets.collection.a.b ab;
  private dt ac;
  private ViewUri.Verified ad;
  private cw ae;
  private com.spotify.mobile.android.spotlets.collection.adapter.b af;
  private q ag;
  private FilterHeaderView ah;
  private LoadingView ai;
  private com.spotify.mobile.android.ui.adapter.l aj;
  private com.spotify.mobile.android.ui.n ak;
  private com.spotify.mobile.android.ui.actions.a al = (com.spotify.mobile.android.ui.actions.a)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
  private com.spotify.mobile.android.util.tracking.h am;
  private ArtistMenuDelegate an = new ArtistMenuDelegate(ArtistMenuDelegate.CanDownload.a, new d.1(this));
  private com.spotify.mobile.android.spotlets.collection.a.c ao = new d.2(this);
  private View.OnClickListener ap = new d.3(this);
  private com.spotify.mobile.android.ui.view.h aq = new d.4(this);
  private View.OnCreateContextMenuListener ar = new d.5(this);
  private AdapterView.OnItemClickListener as = new d.6(this);
  private o<Cursor> at = new d.7(this);
  private String f;
  private cv g;
  private ListView h;
  private EmptyView i;

  static
  {
    ArrayList localArrayList = new ArrayList();
    d = localArrayList;
    localArrayList.add(e);
    d.add(new cv("time_added", 2131690297));
    d.add(new cv("most_played_rank", 2131690295, false));
  }

  public d()
  {
  }

  private void F()
  {
    Fragment localFragment = m();
    if ((localFragment != null) && ((localFragment instanceof CollectionFragment)))
    {
      boolean bool = this.ak.b();
      String str = null;
      if (bool)
        str = this.ak.a();
      ((CollectionFragment)localFragment).a(str);
      return;
    }
    ((com.spotify.mobile.android.ui.activity.l)i()).a(this, i().getString(2131689679));
    ((com.spotify.mobile.android.ui.activity.l)i()).h();
  }

  public static d b()
  {
    d locald = new d();
    locald.b_(new Bundle());
    return locald;
  }

  public final Fragment C()
  {
    return this;
  }

  public final void D()
  {
    this.ac.a();
    a_(true);
    F();
  }

  public final void E()
  {
    this.ac.b();
    a_(false);
    this.ah.a();
  }

  public final Fragment a(String paramString1, String paramString2)
  {
    return c.a(paramString1, paramString2, true);
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    ViewGroup localViewGroup1 = (ViewGroup)paramLayoutInflater.inflate(2130903186, paramViewGroup, false);
    this.af = new com.spotify.mobile.android.spotlets.collection.adapter.b(i());
    this.h = ((ListView)localViewGroup1.findViewById(16908298));
    ViewGroup localViewGroup2 = (ViewGroup)this.h.getParent();
    this.Y = com.spotify.mobile.android.spotlets.collection.a.a.c(i());
    this.Y.setVisibility(8);
    localViewGroup2.addView(this.Y);
    this.i = com.spotify.mobile.android.spotlets.collection.a.a.a(i(), this.ap);
    this.i.setVisibility(8);
    localViewGroup2.addView(this.i);
    this.Z = com.spotify.mobile.android.spotlets.collection.a.a.a(i(), "");
    View localView = paramLayoutInflater.inflate(2130903098, null, false);
    ((TextView)localView.findViewById(2131362315)).setText(2131689681);
    localView.findViewById(2131362316).setOnClickListener(this.ap);
    this.ag = new q(i());
    this.aj = new com.spotify.mobile.android.ui.adapter.l(i(), this.af, 14);
    com.spotify.mobile.android.ui.adapter.l locall = this.aj;
    if (("time_added".equals(this.g.a())) || ("most_played_rank".equals(this.g.a())));
    for (boolean bool = true; ; bool = false)
    {
      locall.a(bool);
      this.ag.a(this.aj, null, 0);
      this.ag.a(new w(this.Z, (byte)0), null, 1);
      this.ag.a(new w(localView, (byte)0), null, 2);
      this.ag.d(0);
      this.ag.b(new int[] { 1, 2 });
      i();
      this.ah = FilterHeaderView.a(paramLayoutInflater, this.f, d, this.g, this.ab.a(), this.aq, this.h);
      this.ah.setBackgroundColor(j().getColor(2131296272));
      this.ah.a(2131689976);
      this.ai = LoadingView.a(LayoutInflater.from(i()));
      localViewGroup2.addView(this.ai);
      this.h.setAdapter(this.ag);
      this.h.setChoiceMode(0);
      this.h.setFastScrollEnabled(true);
      this.h.setOnCreateContextMenuListener(this.ar);
      this.h.setOnItemClickListener(this.as);
      return localViewGroup1;
    }
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131689679);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.f = paramBundle.getString("filter");
      this.aa = paramBundle.getParcelable("list");
    }
    this.ae = cw.a(i());
    this.g = cv.a(this.ae, b, e, d);
    if (this.f == null)
      this.f = "";
    if (this.g == null)
      this.g = e;
    this.ad = ViewUri.aB;
    this.am = new com.spotify.mobile.android.util.tracking.h(i(), this.ad.toString());
    this.am.b(paramBundle);
    this.ac = dv.a(i(), this.ad);
    this.ab = new com.spotify.mobile.android.spotlets.collection.a.b(this.ad, "artists", FeatureFragment.h.a(), this.ae, c);
    this.ab.a(this.ao);
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
    this.ak.a(paramMenu);
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.ak = new com.spotify.mobile.android.ui.n(this, this);
    this.ak.a(paramBundle);
  }

  public final void a(String paramString)
  {
    this.af.a(paramString);
    F();
  }

  public final void b(boolean paramBoolean)
  {
    super.b(true);
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ai.a();
    t().a(2131362105, null, this.at);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("filter", this.f);
    if (this.h != null)
      paramBundle.putParcelable("list", this.h.onSaveInstanceState());
    this.ak.b(paramBundle);
    this.am.a(paramBundle);
  }

  public final void e()
  {
    FilterHeaderView.a(this.ah);
    super.e();
  }

  public final void p_()
  {
    super.p_();
    this.am.a();
  }

  public final void q_()
  {
    super.q_();
    this.am.c();
  }

  public final void x()
  {
    super.x();
    this.ah.a();
    this.ae.a().a(b, this.g.b()).b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.collection.fragments.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
