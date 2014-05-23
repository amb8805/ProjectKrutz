package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.Button;
import android.widget.ListView;
import com.spotify.android.paste.widget.CardView;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.provider.r;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.NavigationItem.NavigationGroup;
import com.spotify.mobile.android.ui.adapter.e;
import com.spotify.mobile.android.ui.adapter.k;
import com.spotify.mobile.android.ui.adapter.p;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.ap;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;

public final class v extends m
  implements NavigationItem, g
{
  private View Y;
  private EmptyView Z;
  private ListView aa;
  private q ab;
  private x ac;
  private x ad;
  private w ae;
  private p af;
  private p ag;
  private android.support.v4.widget.a ah;
  private String ai;
  private boolean aj;
  private boolean ak;
  private String al;
  private ClientInfo am;
  private dt an;
  private Cursor ao = null;
  private com.spotify.mobile.android.ui.actions.d ap = (com.spotify.mobile.android.ui.actions.d)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.d.class);
  private com.spotify.mobile.android.ui.actions.c aq = (com.spotify.mobile.android.ui.actions.c)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.c.class);
  private com.spotify.mobile.android.util.tracking.h ar;
  private o<Cursor> as = new v.9(this);
  private o<Cursor> at = new v.10(this);
  private o<Cursor> au = new v.11(this);
  private o<Cursor> av = new v.12(this);
  private o<Cursor> aw = new v.2(this);
  private o<Cursor> ax = new v.3(this);
  private View i;

  public v()
  {
  }

  private x E()
  {
    int j = ((ap)com.spotify.mobile.android.c.c.a(ap.class)).b();
    int k = com.spotify.android.paste.graphics.d.b(64.0F, j());
    int m;
    if (f.a(i()))
      m = j().getDimensionPixelSize(2131427473);
    for (int n = 0; ; n = j().getDimensionPixelOffset(2131427474))
    {
      int i1 = CardView.a(j, m, k, n);
      x localx = new x(this, i());
      localx.setLayoutParams(new AbsListView.LayoutParams(-1, i1));
      return localx;
      m = j().getDimensionPixelSize(2131427472);
    }
  }

  public static v a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("title", paramString);
    v localv = new v();
    localv.b_(localBundle);
    return localv;
  }

  public final Fragment C()
  {
    return this;
  }

  public final NavigationItem.NavigationGroup D()
  {
    return NavigationItem.NavigationGroup.h;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903145, paramViewGroup, false);
    this.i = ((ViewGroup)LayoutInflater.from(i()).inflate(2130903176, null, false));
    boolean bool = f.a(i());
    if (bool)
    {
      this.i.setBackgroundColor(j().getColor(2131296567));
      this.i.findViewById(2131362495).setOnClickListener(new v.1(this));
    }
    while (true)
    {
      this.ab = new q(i());
      this.ab.a(new v.5(this));
      this.aa = ((ListView)localView.findViewById(16908298));
      this.Z = ((EmptyView)localView.findViewById(2131362408));
      Button localButton = com.spotify.android.paste.widget.h.b(i(), null);
      localButton.setText(2131689995);
      this.Z.a(localButton);
      localButton.setOnClickListener(new v.6(this));
      this.af = new p(i());
      this.ac = E();
      this.ac.a(this.af);
      this.ag = new p(i());
      this.ad = E();
      this.ad.a(this.ag);
      int j = j().getInteger(2131558406);
      com.spotify.mobile.android.ui.adapter.c localc = com.spotify.mobile.android.util.w.a(this.ab, this);
      this.ah = new e(i(), j, localc);
      this.ab.a(new k(this.ac), a(2131690181), 0);
      this.ab.a(new k(this.ad), a(2131690180), 1);
      this.ab.a(this.ah, a(2131690179), 2);
      this.ab.b(new int[] { 0, 1, 2 });
      this.ac.setOnItemClickListener(new v.7(this));
      this.ad.setOnItemClickListener(new v.8(this));
      this.ae = new w(this, (byte)0);
      this.ac.setOnItemLongClickListener(this.ae);
      this.ac.setOnCreateContextMenuListener(this.ae);
      this.aa.addHeaderView(this.i, null, false);
      a(this.ab);
      this.Y = this.i.findViewById(2131362496);
      if (!bool)
        this.Y.setVisibility(8);
      return localView;
      this.i.findViewById(2131362495).setVisibility(8);
    }
  }

  public final String a(Context paramContext)
  {
    if (this.ai == null)
      return paramContext.getString(2131690182);
    return this.ai;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ai = g().getString("title");
    com.spotify.mobile.android.util.tracking.c localc = new com.spotify.mobile.android.util.tracking.c();
    if (f.a(i()))
      t().a(2131362161, null, localc.a(this.au));
    t().a(2131362163, null, localc.a(this.as));
    t().a(2131362162, null, localc.a(this.at));
    t().a(2131362158, null, localc.a(this.av));
    t().a(2131362160, null, localc.a(this.aw));
    t().a(2131362159, null, localc.a(this.ax));
    a_(true);
    this.am = ((ClientInfo)com.spotify.mobile.android.c.c.a(ClientInfo.class));
    this.an = dv.a(i(), ViewUri.e);
    this.ar = new com.spotify.mobile.android.util.tracking.h(i(), "spotify:internal:radio");
    this.ar.b(paramBundle);
    localc.a(this.ar);
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
    if (!f.a(i()))
    {
      ViewUri.Verified localVerified = ViewUri.e;
      com.spotify.mobile.android.ui.menus.a.b(i(), paramMenu, localVerified);
    }
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    b().setOnCreateContextMenuListener(this);
    ((SectionHeaderView)this.i.findViewById(2131362497)).a(a(2131690178));
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    int j = paramInt - b().getHeaderViewsCount();
    switch (this.ab.b(j))
    {
    default:
    case 2:
    }
    do
      return;
    while (!(paramView.getTag() instanceof String));
    String str = (String)paramView.getTag();
    com.spotify.mobile.android.ui.actions.d.a(i(), ViewUri.e, ViewUri.SubView.d, r.a(str), true);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    this.ar.a(paramBundle);
  }

  public final void p_()
  {
    super.p_();
    this.ar.a();
  }

  public final void q_()
  {
    super.q_();
    this.ar.c();
  }

  public final void w()
  {
    super.w();
    this.an.a();
  }

  public final void x()
  {
    super.x();
    this.an.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
