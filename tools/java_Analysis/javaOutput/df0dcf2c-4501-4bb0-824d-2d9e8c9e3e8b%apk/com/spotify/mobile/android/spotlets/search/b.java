package com.spotify.mobile.android.spotlets.search;

import android.content.Context;
import android.content.res.Resources;
import android.database.Observable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.router.Cosmos;
import com.spotify.mobile.android.provider.r;
import com.spotify.mobile.android.spotlets.search.loader.SearchLoader;
import com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType;
import com.spotify.mobile.android.spotlets.search.model.SearchResults;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.ResultList;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Track;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.NavigationItem.NavigationGroup;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.activity.m;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.p;
import com.spotify.mobile.android.ui.k;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.dx;
import com.spotify.mobile.android.util.ui.ScrollPosition;
import java.util.List;

public final class b extends Fragment
  implements com.spotify.mobile.android.model.l, com.spotify.mobile.android.spotlets.common.persistence.d, a, com.spotify.mobile.android.spotlets.search.e.g, com.spotify.mobile.android.spotlets.search.loader.c, NavigationItem, m, com.spotify.mobile.android.ui.fragments.g, k
{
  private static final Object ah = new Object();
  boolean Y;
  boolean Z;
  com.spotify.mobile.android.spotlets.search.c.b a;
  boolean aa;
  boolean ab;
  int ac;
  com.spotify.mobile.android.spotlets.search.e.a ad;
  com.spotify.mobile.android.spotlets.search.e.f ae;
  private SearchResults af;
  private ObjectMapper ag = new ObjectMapper();
  private Resolver ai;
  private SearchLoader aj;
  private com.spotify.mobile.android.spotlets.search.player.a ak;
  private com.spotify.mobile.android.spotlets.common.b.a.c al;
  private dt am;
  private ViewUri.Verified an;
  private boolean ao;
  private boolean ap;
  private boolean aq;
  private boolean ar;
  private boolean as;
  private SearchResults at;
  private int au;
  private ScrollPosition av;
  private com.spotify.mobile.android.spotlets.search.b.g aw;
  private final com.spotify.mobile.android.ui.actions.d ax = (com.spotify.mobile.android.ui.actions.d)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.d.class);
  private com.spotify.mobile.android.spotlets.search.e.e ay = new b.1(this);
  private Runnable az = new b.2(this);
  String b;
  String c;
  int d;
  int e;
  boolean f;
  SearchLoader.SearchType g;
  Handler h;
  int i;

  public b()
  {
  }

  private void M()
  {
    if (!this.aq)
      return;
    K();
    Object[] arrayOfObject = new Object[1];
    Integer.valueOf(this.e);
    arrayOfObject[0] = null;
    bp.a("updateResults with results for %s", arrayOfObject);
    if (this.af != null)
    {
      this.ae.a(this.af, this.g, this.c);
      if (this.ae.b())
        this.ac = Math.max(this.ac, this.ae.i());
    }
    N();
  }

  private void N()
  {
    Object[] arrayOfObject = new Object[1];
    Integer.valueOf(this.e);
    arrayOfObject[0] = null;
    bp.a("updateInfoViews with results for %s", arrayOfObject);
    boolean bool = TextUtils.isEmpty(this.b);
    int k;
    int j;
    if (this.aa)
    {
      this.ae.o();
      k = 0;
      j = 1;
    }
    while (true)
    {
      if (j != 0)
        f(false);
      if (k != 0)
        f(true);
      return;
      if ((this.Z) && ((bool) || (!P())))
      {
        this.ae.p();
        j = 1;
        k = 0;
      }
      else
      {
        if (this.ae.b())
        {
          this.ae.q();
          if (!O());
          for (k = 1; ; k = 0)
          {
            j = 1;
            break;
          }
        }
        if (!bool)
        {
          if (P())
          {
            this.ae.r();
            j = 1;
            k = 0;
          }
          else
          {
            k = 0;
            j = 0;
          }
        }
        else if (this.ae.c())
        {
          this.ae.s();
          j = 1;
          k = 0;
        }
        else
        {
          this.ae.t();
          j = 1;
          k = 0;
        }
      }
    }
  }

  private boolean O()
  {
    return this.d == this.e;
  }

  private boolean P()
  {
    return TextUtils.equals(this.b, this.c);
  }

  public static b a(String paramString1, boolean paramBoolean1, boolean paramBoolean2, String paramString2)
  {
    b localb = new b();
    Bundle localBundle = new Bundle();
    localBundle.putString("search_query", paramString1);
    localBundle.putString("username", paramString2);
    localBundle.putBoolean("start_playback", paramBoolean1);
    localBundle.putBoolean("start_radio", paramBoolean2);
    localb.b_(localBundle);
    return localb;
  }

  private void a(SearchResults.Track paramTrack)
  {
    if (FeatureFragment.h.a())
    {
      Assertion.a("Can't play track in MFT");
      return;
    }
    this.ak.a(this.af.tracks.results, paramTrack, f_().toString());
  }

  private void c(String paramString)
  {
    this.ad.a(paramString);
    this.ad.a(true);
  }

  private void e(boolean paramBoolean)
  {
    this.ab = true;
    MainActivity localMainActivity = (MainActivity)i();
    if (paramBoolean)
    {
      c(this.b);
      localMainActivity.a(this);
      K();
      if ((this.g == SearchLoader.SearchType.a) && (TextUtils.isEmpty(this.b)))
        this.ad.d();
    }
    while (true)
    {
      this.as = paramBoolean;
      this.ab = false;
      return;
      this.ad.a(false);
      localMainActivity.a(null);
    }
  }

  private void f(boolean paramBoolean)
  {
    boolean bool1 = true;
    com.spotify.mobile.android.spotlets.search.e.f localf1 = this.ae;
    boolean bool2;
    com.spotify.mobile.android.spotlets.search.e.f localf2;
    if ((paramBoolean) && (!this.Y))
    {
      bool2 = bool1;
      localf1.b(bool2);
      localf2 = this.ae;
      if ((!paramBoolean) || (!this.Y))
        break label57;
    }
    while (true)
    {
      localf2.a(bool1);
      return;
      bool2 = false;
      break;
      label57: bool1 = false;
    }
  }

  public final Fragment C()
  {
    return this;
  }

  public final NavigationItem.NavigationGroup D()
  {
    return NavigationItem.NavigationGroup.b;
  }

  public final void E()
  {
    if (((MainActivity)i()).f().b() == this);
    for (boolean bool = true; ; bool = false)
    {
      e(bool);
      return;
    }
  }

  public final boolean F()
  {
    if (this.g != SearchLoader.SearchType.a)
    {
      this.h.removeCallbacksAndMessages(ah);
      this.g = SearchLoader.SearchType.a;
      if (this.ar)
        this.ar = false;
      while (true)
      {
        this.d = this.e;
        M();
        if (this.av != null)
        {
          this.ae.a(this.av);
          this.av = null;
        }
        c(this.c);
        return true;
        this.af = this.at;
        this.e = this.au;
        this.at = null;
        this.au = 0;
        this.Y = false;
      }
    }
    if (!TextUtils.isEmpty(this.b))
    {
      c(null);
      return true;
    }
    return false;
  }

  final void G()
  {
    boolean bool1 = p.b();
    if (bool1 == this.Z)
      if (bool1)
        break label28;
    label28: for (boolean bool2 = true; ; bool2 = false)
    {
      this.Z = bool2;
      N();
      return;
    }
  }

  public final void H()
  {
    this.ae.n();
    this.a.a();
    N();
  }

  public final void I()
  {
    if ((this.ae.k()) && (this.Y))
    {
      a(null, this.ae.e().loadMoreURI, true);
      return;
    }
    a(this.g, this.b, true);
  }

  public final boolean J()
  {
    return (this.ao) || (!FeatureFragment.h.a());
  }

  final void K()
  {
    if (this.g == null)
      return;
    String str = com.spotify.mobile.android.spotlets.search.d.e.a(i(), this.g, this.c);
    ((com.spotify.mobile.android.ui.activity.l)i()).a(this, str);
    com.spotify.mobile.android.spotlets.search.e.a locala = this.ad;
    if ((this.as) && (this.g == SearchLoader.SearchType.a));
    for (boolean bool = true; ; bool = false)
    {
      locala.a(bool);
      return;
    }
  }

  final void L()
  {
    if (this.g == null)
      this.g = SearchLoader.SearchType.a;
    this.Y = false;
    a(this.g, this.b, true);
  }

  public final Uri a()
  {
    return Uri.parse(f_().toString());
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.ad = new com.spotify.mobile.android.spotlets.search.e.a((ActionBarActivity)i(), this.ao);
    this.ad.a(this.ay);
    return this.ae.a(paramLayoutInflater, paramViewGroup);
  }

  public final CharSequence a(String paramString)
  {
    return this.ae.g().b(paramString);
  }

  public final String a(Context paramContext)
  {
    if (this.b != null);
    for (String str = this.b; g().getBoolean("start_radio", false); str = "")
      return paramContext.getString(2131690187, new Object[] { str });
    return paramContext.getString(2131690194, new Object[] { str });
  }

  public final void a(int paramInt1, int paramInt2)
  {
    d(true);
    this.b = this.c;
    SearchLoader.SearchType localSearchType;
    switch (paramInt1)
    {
    default:
      Assertion.a("Unrecognized section: " + paramInt1);
      localSearchType = null;
    case 2:
    case 1:
    case 4:
    case 5:
    case 3:
    }
    while (true)
    {
      this.g = localSearchType;
      K();
      this.a.a(this.g, paramInt2);
      this.ar = true;
      L();
      return;
      localSearchType = SearchLoader.SearchType.c;
      continue;
      localSearchType = SearchLoader.SearchType.b;
      continue;
      localSearchType = SearchLoader.SearchType.d;
      continue;
      localSearchType = SearchLoader.SearchType.e;
      continue;
      localSearchType = SearchLoader.SearchType.f;
    }
  }

  public final void a(int paramInt, String paramString, SearchLoader.SearchType paramSearchType)
  {
    if ((paramInt == this.d) && (paramInt != this.e));
    for (int j = 1; j == 0; j = 0)
      return;
    Integer localInteger = Integer.valueOf(paramInt);
    StringBuilder localStringBuilder1 = new StringBuilder();
    String str;
    StringBuilder localStringBuilder2;
    if (localInteger != null)
    {
      str = "Req#" + localInteger;
      localStringBuilder2 = localStringBuilder1.append(str).append(" (");
      if (paramSearchType == null)
        break label142;
    }
    while (true)
    {
      com.spotify.mobile.android.spotlets.search.d.c.a(paramString + ')');
      this.c = null;
      this.af = SearchResults.NO_RESULTS;
      this.aa = true;
      this.f = false;
      M();
      return;
      str = "Req";
      break;
      label142: paramString = "raw";
    }
  }

  public final void a(int paramInt, String paramString, SearchLoader.SearchType paramSearchType, SearchResults paramSearchResults)
  {
    int j = 1;
    if (paramInt == 0);
    while (j == 0)
    {
      return;
      if ((this.e != this.d) && ((paramSearchType == null) || (paramSearchType == this.g)) && ((paramSearchType != null) || (this.Y)) && (this.e != paramInt))
      {
        if (this.d != paramInt)
          if ((this.b != null) && ((this.b.startsWith(paramString)) || (paramString.startsWith(this.b))))
          {
            if ((TextUtils.isEmpty(this.c)) || ((!this.b.startsWith(this.c)) && (!this.c.startsWith(this.b))))
              continue;
            int k = Math.abs(this.b.length() - paramString.length());
            int m = Math.abs(this.b.length() - this.c.length());
            Object[] arrayOfObject = new Object[2];
            arrayOfObject[0] = Integer.valueOf(k);
            arrayOfObject[j] = Integer.valueOf(m);
            bp.a("Delta: %d (was: %d)", arrayOfObject);
            if (k < m)
              continue;
            j = 0;
          }
      }
      else
        j = 0;
    }
    if ((paramSearchType != null) || (paramInt == 0))
      this.c = paramString;
    if (this.ar)
    {
      if ((this.ae.l()) && (this.ae.i() > 0))
        this.av = this.ae.h();
      this.at = this.af;
      this.au = this.e;
    }
    if ((paramSearchType == null) && (this.Y) && (this.af != null));
    for (this.af = this.af.append(paramSearchResults); ; this.af = paramSearchResults)
    {
      this.e = paramInt;
      this.aa = false;
      this.f = false;
      M();
      if (this.ap)
      {
        this.ap = false;
        g().putBoolean("start_playback", false);
        if ((!FeatureFragment.h.a()) && (!this.ao) && (this.af != null) && (this.af.hasResults()) && (this.af.tracks.results.size() > 0))
          a((SearchResults.Track)this.af.tracks.results.get(0));
      }
      if (!this.ar)
        break;
      this.ar = false;
      this.ae.f();
      return;
    }
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.aw = new com.spotify.mobile.android.spotlets.search.b.g(this);
    this.a = new com.spotify.mobile.android.spotlets.search.c.c(this);
    this.h = new Handler();
    this.ao = g().getBoolean("start_radio", false);
    this.ap = g().getBoolean("start_playback", false);
    this.b = g().getString("search_query");
    this.g = SearchLoader.SearchType.a;
    if (this.b == null)
      this.b = "";
    a_(true);
    this.an = f_();
    this.i = j().getInteger(2131558404);
    this.ai = Cosmos.getResolver("com.spotify.feature.search", i());
    this.ai.connect();
    this.ak = new com.spotify.mobile.android.spotlets.search.player.c(this, this.h);
    this.ak.b().registerObserver(new b.3(this));
    this.al = new com.spotify.mobile.android.spotlets.common.b.a.a(i(), i().d());
    this.aj = new SearchLoader(this, this);
    this.ae = new com.spotify.mobile.android.spotlets.search.e.f(this, this);
    String str = g().getString("username");
    if (!TextUtils.isEmpty(str))
    {
      b(str);
      return;
    }
    this.al.a(new b.4(this));
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    String str2;
    if (paramBundle != null)
    {
      this.b = paramBundle.getString("search_query");
      this.d = paramBundle.getInt("requested_search_id");
      if (paramBundle.getBoolean("loading_indicator", false))
      {
        this.ae.a(true, false);
        while (true)
        {
          this.ar = paramBundle.getBoolean("show_all_results_clicked", false);
          this.g = ((SearchLoader.SearchType)paramBundle.getSerializable("search_type"));
          String str1 = paramBundle.getString("current_results");
          str2 = paramBundle.getString("previous_results");
          if (str1 != null);
          try
          {
            this.af = ((SearchResults)this.ag.readValue(str1, SearchResults.class));
            this.c = paramBundle.getString("current_results_query");
            this.e = paramBundle.getInt("current_results_id");
            if (str2 != null)
            {
              this.at = ((SearchResults)this.ag.readValue(str2, SearchResults.class));
              this.au = paramBundle.getInt("previous_results_id");
              this.av = ((ScrollPosition)paramBundle.getParcelable("scroll_pos"));
            }
            this.aq = true;
            this.ae.a(new b.5(this));
            return;
            this.ae.b(false);
          }
          catch (Exception localException)
          {
            while (true)
              Assertion.a(localException);
          }
        }
      }
    }
    while (true)
      this.b = g().getString("search_query");
  }

  final void a(SearchLoader.SearchType paramSearchType, String paramString, boolean paramBoolean)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    G();
    if ((this.Z) && (!bool))
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = null;
      arrayOfObject2[1] = Integer.valueOf(this.i);
      bp.c("No connection: %s not performed. Trying again after %d ms", arrayOfObject2);
      this.h.removeCallbacksAndMessages(ah);
      this.h.postAtTime(new b.6(this, paramSearchType, paramString, paramBoolean), ah, SystemClock.uptimeMillis() + this.i);
      return;
    }
    if ((paramBoolean) && (!bool))
      f(true);
    this.h.removeCallbacksAndMessages(ah);
    this.f = true;
    this.d = this.aj.a(paramSearchType, paramString, this.ac, this.ae.a(paramSearchType));
    Object[] arrayOfObject1 = new Object[1];
    Integer.valueOf(this.d);
    arrayOfObject1[0] = null;
    bp.b("Performing %s", arrayOfObject1);
  }

  public final void a(com.spotify.mobile.android.spotlets.search.model.g paramg, int paramInt1, int paramInt2, int paramInt3)
  {
    ViewUri.SubView localSubView;
    switch (paramInt1)
    {
    case 6:
    default:
      Assertion.a("Unrecognized section " + paramInt1);
      localSubView = ViewUri.SubView.a;
    case 7:
    case 0:
    case 1:
    case 3:
    case 2:
    case 4:
    case 5:
    }
    while (true)
    {
      String str = localSubView.toString();
      this.a.a(str, paramInt2, paramInt3, paramg);
      if (this.ae.j())
        d(true);
      if (!this.ao)
        break;
      com.spotify.mobile.android.ui.actions.d.a(i(), f_(), r.a(paramg.getUri()), true);
      return;
      localSubView = ViewUri.SubView.s;
      continue;
      localSubView = ViewUri.SubView.t;
      continue;
      localSubView = ViewUri.SubView.y;
      continue;
      localSubView = ViewUri.SubView.u;
      continue;
      localSubView = ViewUri.SubView.w;
      continue;
      localSubView = ViewUri.SubView.v;
      continue;
      localSubView = ViewUri.SubView.x;
    }
    if ((paramg instanceof SearchResults.Track))
    {
      a((SearchResults.Track)paramg);
      return;
    }
    a(MainActivity.a(i(), paramg.getUri(), paramg.getName()));
  }

  public final void a(String paramString, int paramInt)
  {
    d(false);
    c(paramString);
    this.a.a(paramString, paramInt);
  }

  public final void a_(Bundle paramBundle)
  {
    String[] arrayOfString = paramBundle.getStringArray("recent_searches");
    if (arrayOfString != null)
    {
      this.ae.a(arrayOfString);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(arrayOfString.length);
      bp.a("Loaded %d recent searches", arrayOfObject);
    }
    N();
  }

  public final void b()
  {
    com.spotify.mobile.android.spotlets.search.d.c.a("feature state load");
  }

  final void b(String paramString)
  {
    ((com.spotify.mobile.android.spotlets.common.persistence.g)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.spotlets.common.persistence.g.class)).a(this, paramString, "search");
  }

  public final void c()
  {
    com.spotify.mobile.android.spotlets.search.d.c.a("feature state save");
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    ((MainActivity)i()).f().a(this);
  }

  public final Context d()
  {
    return i();
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("search_query", this.b);
    paramBundle.putString("current_results_query", this.c);
    paramBundle.putParcelable("scroll_pos", this.av);
    paramBundle.putInt("requested_search_id", this.d);
    paramBundle.putBoolean("loading_indicator", this.ae.m());
    paramBundle.putBoolean("show_all_results_clicked", this.ar);
    paramBundle.putSerializable("search_type", this.g);
    try
    {
      if (this.af != null)
      {
        paramBundle.putString("current_results", this.ag.writeValueAsString(this.af));
        paramBundle.putInt("current_results_id", this.e);
      }
      if (this.at != null)
      {
        paramBundle.putString("previous_results", this.ag.writeValueAsString(this.at));
        paramBundle.putInt("previous_results_id", this.au);
      }
      return;
    }
    catch (JsonProcessingException localJsonProcessingException)
    {
      localJsonProcessingException.printStackTrace();
    }
  }

  final void d(boolean paramBoolean)
  {
    View localView = v();
    ((InputMethodManager)localView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(localView.getWindowToken(), 0);
    if ((paramBoolean) && (!TextUtils.isEmpty(this.b)))
      this.ae.a(this.b);
  }

  public final void e()
  {
    super.e();
    this.aq = false;
    this.ad.b(this.ay);
    this.ad.e();
    this.ae.u();
  }

  public final void e(Bundle paramBundle)
  {
    paramBundle.putStringArray("recent_searches", this.ae.d());
  }

  public final com.spotify.mobile.android.spotlets.search.e.d f()
  {
    return this.ad;
  }

  public final ViewUri.Verified f_()
  {
    if (this.c != null);
    for (String str = Uri.encode(this.c); this.ao; str = "")
      return ViewUri.z.a("spotify:radio:create_station:" + str);
    return ViewUri.x.a("spotify:search:" + str);
  }

  public final boolean g_()
  {
    return FeatureFragment.h.a();
  }

  public final com.spotify.mobile.android.spotlets.common.b.a.c h()
  {
    return this.al;
  }

  public final boolean h_()
  {
    return this.ao;
  }

  public final ViewUri.SubView i_()
  {
    if (this.g != null);
    for (SearchLoader.SearchType localSearchType = this.g; ; localSearchType = SearchLoader.SearchType.a)
      return com.spotify.mobile.android.spotlets.search.c.c.a(localSearchType);
  }

  public final Resolver j_()
  {
    return this.ai;
  }

  public final String k()
  {
    return this.c;
  }

  public final com.spotify.mobile.android.spotlets.search.player.a n()
  {
    return this.ak;
  }

  public final com.spotify.mobile.android.spotlets.search.b.e o()
  {
    return this.aw;
  }

  public final void w()
  {
    super.w();
    if (this.am == null)
      this.am = dv.a(i(), this.an);
    this.am.a();
    this.a.c();
    e(true);
    M();
    if ((!P()) && (O()))
      L();
    K();
    this.h.postDelayed(this.az, this.i);
  }

  public final void x()
  {
    e(false);
    super.x();
    this.h.removeCallbacksAndMessages(ah);
    this.h.removeCallbacks(this.az);
    this.am.b();
    this.a.d();
  }

  public final void y()
  {
    super.y();
    ((MainActivity)i()).f().b(this);
    this.h.removeCallbacksAndMessages(null);
    this.aj.a();
    this.aw.a();
    this.ai.destroy();
    this.ak.c();
    this.al.a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
