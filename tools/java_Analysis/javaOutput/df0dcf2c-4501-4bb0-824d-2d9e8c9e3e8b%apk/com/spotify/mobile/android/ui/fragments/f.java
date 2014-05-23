package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.actions.d;
import com.spotify.mobile.android.ui.adapter.aa;
import com.spotify.mobile.android.ui.adapter.ab;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseAlbum;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseArtist;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveTrack;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.ui.view.h;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.cv;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import java.util.ArrayList;
import java.util.List;

public final class f extends android.support.v4.app.m
  implements g
{
  private static final List<cv> Y;
  private static final cv Z;
  private static final ab an = new f.2();
  private static final String[] i = { "name" };
  private ListView aa;
  private Parcelable ab;
  private ShufflePlayHeaderView ac;
  private String ad;
  private String ae;
  private String af;
  private cv ag = Z;
  private FilterHeaderView ah;
  private aa ai;
  private dt aj;
  private d ak = (d)c.a(d.class);
  private a al = (a)c.a(a.class);
  private TrackMenuDelegate am = new TrackMenuDelegate(TrackMenuDelegate.CanBrowseAlbum.a, TrackMenuDelegate.CanBrowseArtist.a, TrackMenuDelegate.CanRemoveFromCollection.b, TrackMenuDelegate.CanRemoveTrack.b, new f.1(this));
  private h ao = new f.3(this);
  private o<Cursor> ap = new f.4(this);
  private o<Cursor> aq = new f.5(this);
  private View.OnClickListener ar = new f.6(this);

  static
  {
    Z = new cv("name", 2131690296);
    ArrayList localArrayList = new ArrayList();
    Y = localArrayList;
    localArrayList.add(Z);
  }

  public f()
  {
  }

  public static f a(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("folder_uri", paramString1);
    localBundle.putString("title", paramString2);
    f localf = new f();
    localf.b_(localBundle);
    return localf;
  }

  public final Fragment C()
  {
    return this;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903186, paramViewGroup, false);
    this.aa = ((ListView)localView.findViewById(16908298));
    this.aa.setFastScrollEnabled(true);
    this.ai = new aa(i(), an);
    a(this.ai);
    i();
    this.ah = FilterHeaderView.a(paramLayoutInflater, this.af, Y, this.ag, this.ao, this.aa);
    this.ah.setBackgroundColor(j().getColor(2131296272));
    this.ac = ShufflePlayHeaderView.a(i(), this.aa, this.ar);
    this.aa.addHeaderView(this.ac.c());
    return localView;
  }

  public final String a(Context paramContext)
  {
    if (this.ae == null)
      return paramContext.getString(2131689957);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.ae;
    return paramContext.getString(2131689958, arrayOfObject);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ad = g().getString("folder_uri");
    this.ae = g().getString("title");
    this.af = "";
    if (paramBundle != null)
    {
      this.ag = cv.a(paramBundle.getString("sort_order"), Y);
      this.af = paramBundle.getString("filter");
      this.ab = paramBundle.getParcelable("list");
    }
    if (this.af == null)
      this.af = "";
    if (this.ag == null)
      this.ag = Z;
    t().a(2131362118, null, this.ap);
    t().a(2131362120, null, this.aq);
    a_(true);
    this.aj = dv.a(i(), ViewUri.D);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    Uri localUri = com.spotify.mobile.android.provider.g.a(this.ad);
    ViewUri.Verified localVerified = ViewUri.D;
    if (FeatureFragment.h.a())
    {
      ClientEvent localClientEvent2 = ClientEvent.b(localUri, paramLong);
      a.a(i(), localVerified, ViewUri.SubView.a, localClientEvent2);
      this.ac.b();
      return;
    }
    ClientEvent localClientEvent1 = ClientEvent.a(localUri, paramLong);
    a.a(i(), localVerified, ViewUri.SubView.a, localClientEvent1);
    d.a(i(), ViewUri.D, localUri, paramLong);
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    b().setOnCreateContextMenuListener(this);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("sort_order", this.ag.b());
    paramBundle.putString("filter", this.af);
    if (this.aa != null)
      paramBundle.putParcelable("list", this.aa.onSaveInstanceState());
  }

  public final void e()
  {
    FilterHeaderView.a(this.ah);
    super.e();
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    View localView = ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView;
    if (!(localView.getTag() instanceof com.spotify.mobile.android.model.m))
      return;
    this.am.a(paramContextMenu, (com.spotify.mobile.android.model.m)localView.getTag());
  }

  public final void w()
  {
    super.w();
    this.aj.a();
  }

  public final void x()
  {
    super.x();
    this.aj.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
