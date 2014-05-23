package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.AdapterContextMenuInfo;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.model.Story;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.NavigationItem.NavigationGroup;
import com.spotify.mobile.android.ui.activity.l;
import com.spotify.mobile.android.ui.adapter.f;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.ui.view.TouchInterceptableListView;
import com.spotify.mobile.android.ui.view.u;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;
import com.spotify.mobile.android.util.at;
import com.spotify.mobile.android.util.by;
import com.spotify.mobile.android.util.bz;
import com.spotify.mobile.android.util.de;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.tracking.h;
import java.util.Collections;
import java.util.HashSet;

public final class d extends m
  implements AbsListView.OnScrollListener, NavigationItem, g, ab, bz
{
  private int Y = 200;
  private String Z;
  private f aa;
  private dt ab;
  private LoadingView ac;
  private View ad;
  private TouchInterceptableListView ae;
  private int af = 0;
  private int ag;
  private int ah;
  private int ai;
  private by aj;
  private aa ak;
  private ContentViewManager al;
  private long am = 0L;
  private int an;
  private HashSet<String> ao;
  private de ap;
  private boolean aq = true;
  private h ar;
  private u as;
  private at at;
  private int i;

  public d()
  {
  }

  private o<Cursor> a(int paramInt1, int paramInt2)
  {
    return new d.4(this, paramInt1, paramInt2);
  }

  public static d a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("title", paramString);
    d locald = new d();
    locald.b_(localBundle);
    return locald;
  }

  public final Fragment C()
  {
    return this;
  }

  public final NavigationItem.NavigationGroup D()
  {
    return NavigationItem.NavigationGroup.d;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130903182, paramViewGroup, false);
  }

  public final String a(Context paramContext)
  {
    if (!TextUtils.isEmpty(this.Z))
      return this.Z;
    return paramContext.getString(2131689919);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.Z = g().getString("title");
    this.i = j().getInteger(2131558405);
    if (paramBundle != null)
    {
      this.ag = (paramBundle.getInt("discover_story_position") / this.i);
      this.ah = paramBundle.getInt("discover_story_position_offset");
    }
    for (this.ai = paramBundle.getInt("KEY_LOADED_STORIES_COUNT"); ; this.ai = 20)
    {
      this.ap = new de(i());
      a_(true);
      this.ab = dv.a(i(), ViewUri.g);
      this.ar = new h(i(), "spotify:internal:discover");
      this.ar.b(paramBundle);
      return;
      this.ag = 0;
      this.ah = 0;
    }
  }

  public final void a(Menu paramMenu)
  {
    com.spotify.mobile.android.ui.menus.a.a(i(), paramMenu);
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    if (!(paramView instanceof ViewGroup))
      throw new IllegalArgumentException("view must be a " + ViewGroup.class.getSimpleName());
    this.ae = ((TouchInterceptableListView)b());
    EmptyView localEmptyView = (EmptyView)paramView.findViewById(2131362360);
    this.al = new com.spotify.mobile.android.ui.stuff.b(i(), localEmptyView, this.ae).a(2131689914).a().b();
    this.aj = new by(i(), this);
    this.as = new d.1(this);
    TouchInterceptableListView localTouchInterceptableListView = this.ae;
    u localu = this.as;
    Integer[] arrayOfInteger = new Integer[2];
    arrayOfInteger[0] = Integer.valueOf(3);
    arrayOfInteger[1] = Integer.valueOf(1);
    localTouchInterceptableListView.a(localu, arrayOfInteger);
    this.ad = LayoutInflater.from(i()).inflate(2130903124, null);
    this.ae.addFooterView(this.ad);
    this.at = new at();
    this.at.a();
    this.at.b();
    this.ae.setOnScrollListener(this);
    d.2 local2 = new d.2(this);
    f localf = new f(i(), this.i, this.aj, this.ap);
    localf.registerDataSetObserver(local2);
    this.aa = localf;
    this.ae.getViewTreeObserver().addOnGlobalLayoutListener(new d.3(this));
    a(this.aa);
    t().a(2131362116, null, this.aj);
    this.ao = new HashSet();
    this.an = j().getConfiguration().orientation;
    if (paramBundle != null)
    {
      int j = paramBundle.getInt("previous_orientation_state");
      String[] arrayOfString = paramBundle.getStringArray("discover_logged_story_impressions");
      if ((j != 0) && (this.an != j) && (arrayOfString != null))
        Collections.addAll(this.ao, arrayOfString);
    }
    this.ae.setOnCreateContextMenuListener(this);
    this.ak = new aa(i(), this);
    t().a(2131362115, null, this.ak);
    ((l)i()).a(this, a(i()));
  }

  public final void a(boolean paramBoolean)
  {
    this.aq = paramBoolean;
    if (!paramBoolean)
    {
      if (this.aa.isEmpty())
        this.al.a(true);
      this.ad.setVisibility(8);
      return;
    }
    this.al.a(false);
    int j = this.ai;
    if (this.ac == null)
    {
      this.ac = LoadingView.a(LayoutInflater.from(i()));
      ((ViewGroup)v()).addView(this.ac);
    }
    this.al.b(false);
    this.al.a(this.ac);
    t().a(2131362117, null, a(this.af, j));
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    int j = this.ae.getFirstVisiblePosition();
    View localView = this.ae.getChildAt(0);
    if (localView == null);
    for (int k = 0; ; k = localView.getTop())
    {
      paramBundle.putInt("discover_story_position", j * this.i);
      paramBundle.putInt("discover_story_position_offset", k);
      f localf = this.aa;
      int m = 0;
      if (localf != null)
        m = this.aa.a();
      paramBundle.putInt("KEY_LOADED_STORIES_COUNT", Math.max(m, 20));
      paramBundle.putInt("previous_orientation_state", this.an);
      String[] arrayOfString = new String[this.ao.size()];
      this.ao.toArray(arrayOfString);
      paramBundle.putStringArray("discover_logged_story_impressions", arrayOfString);
      this.ar.a(paramBundle);
      return;
    }
  }

  public final void e_()
  {
    this.aa.a(this.aj.a(), this.aj.b(), this.aj.c());
    for (int j = 0; j < this.ae.getChildCount(); j++)
      if (j + this.ae.getFirstVisiblePosition() < this.aa.getCount())
      {
        View localView = this.ae.getChildAt(j);
        if ((localView instanceof com.spotify.mobile.android.ui.cell.b))
          ((com.spotify.mobile.android.ui.cell.b)localView).a();
      }
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    View localView = ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView;
    if (!(localView instanceof View.OnCreateContextMenuListener))
      return;
    ((View.OnCreateContextMenuListener)localView).onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.at.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    if (paramAbsListView.getChildCount() == 0);
    int j;
    int k;
    do
    {
      return;
      j = paramInt3 - this.ae.getFooterViewsCount();
      if (paramInt1 + paramInt2 < 1 + (j - 10 / this.i))
        break;
      k = 1;
      if ((k != 0) && (j > 0) && (j * this.i < this.Y))
      {
        this.af = (j * this.i);
        if (this.aq)
        {
          t().b(2131362117, null, a(this.af, 20));
          this.ad.setVisibility(0);
        }
      }
    }
    while (j == 0);
    int m = paramAbsListView.getHeight();
    int n = 0;
    label139: int i1;
    int i2;
    int i3;
    if (n < this.ae.getChildCount())
    {
      View localView = this.ae.getChildAt(n);
      i1 = localView.getHeight();
      if (i1 != 0)
      {
        i2 = localView.getTop();
        i3 = localView.getBottom();
        if (i2 >= 0)
          break label338;
      }
    }
    label338: for (int i4 = i1 + i2; ; i4 = i1)
    {
      if (i3 > m)
        i4 -= i3 - m;
      if (i4 / i1 > 0.75F)
      {
        int i5 = 0;
        while (true)
          if (i5 < this.i)
          {
            int i6 = i5 + (n + paramInt1) * this.i;
            if (i6 < this.aa.a())
            {
              Story localStory = (Story)this.aa.getItem(i6);
              if (!this.ao.contains(localStory.e()))
              {
                this.ao.add(localStory.e());
                this.ap.a(localStory);
              }
            }
            i5++;
            continue;
            k = 0;
            break;
          }
      }
      n++;
      break label139;
      break;
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    this.at.onScrollStateChanged(paramAbsListView, paramInt);
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
    this.ab.a();
  }

  public final void x()
  {
    super.x();
    com.spotify.mobile.android.a.a.a.a();
    this.ab.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
