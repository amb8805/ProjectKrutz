package com.twitter.android;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ListView;
import ar;
import bc;
import be;
import com.twitter.android.client.g;
import com.twitter.android.platform.TwitterDataSyncService;
import com.twitter.android.provider.au;
import com.twitter.android.provider.ax;
import com.twitter.android.provider.p;
import com.twitter.android.provider.r;
import com.twitter.android.service.TwitterService;
import com.twitter.android.widget.UserView;
import com.twitter.android.widget.l;
import cr;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class DiscoverFragment extends BaseListFragment
  implements LocationListener, ar, bc, com.twitter.android.widget.c, l
{
  SharedPreferences a;
  HashSet b;
  f c;
  boolean d;
  private Handler e = new Handler();
  private dj f = new dj(this, null);
  private ab g;
  private cl h;
  private boolean r;
  private bv s;
  private boolean t;
  private LocationManager u;
  private ae v;
  private HashSet w;

  public DiscoverFragment()
  {
  }

  private void b(int paramInt)
  {
    g localg = this.j;
    this.r = true;
    localg.h(1L);
    localg.a(true, 0);
    Locale localLocale = getActivity().getResources().getConfiguration().locale;
    if (localLocale != null);
    for (String str = localLocale.getLanguage(); com.twitter.android.platform.f.a(this.u); str = null)
    {
      Location localLocation = com.twitter.android.platform.f.b((LocationManager)getActivity().getSystemService("location"));
      if (localLocation == null)
        break;
      double d1 = localLocation.getLatitude();
      double d2 = localLocation.getLongitude();
      if ((d1 == 0.0D) || (d2 == 0.0D))
        break;
      a(localg.a(localg.f(), 0L, 0L, 200, d1, d2, str), 3);
      return;
    }
    a(localg.a(localg.f(), 0L, 0L, 200, 0.0D, 0.0D, str), 3);
  }

  public final Bitmap a(ax paramax)
  {
    this.n = true;
    if (this.m != 2)
      return this.j.a(paramax.t, paramax.n, paramax.k);
    return this.j.a(paramax.t, paramax.n);
  }

  public final void a(Loader paramLoader, Cursor paramCursor)
  {
    switch (paramLoader.getId())
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    do
    {
      do
      {
        return;
        cz localcz = (cz)this.c.c();
        localcz.swapCursor(paramCursor);
        if ((!this.r) && (localcz.isEmpty()))
        {
          b(3);
          return;
        }
        this.s.notifyDataSetChanged();
        if (this.d)
        {
          this.p.setSelectionFromTop(0, 0);
          this.d = false;
        }
        c(3);
        return;
        ((j)this.g.c()).swapCursor(paramCursor);
      }
      while ((this.r) || (!((j)this.g.c()).isEmpty()));
      this.j.h(1L);
      return;
      ((cj)this.h.c()).swapCursor(paramCursor);
    }
    while ((this.r) || (!((cj)this.h.c()).isEmpty()));
    this.j.a(true, 0);
  }

  protected final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    int i = paramInt - paramListView.getHeaderViewsCount();
    int j = this.s.a(i);
    int k = i - this.s.b(j);
    switch (j)
    {
    default:
    case 0:
    case 1:
    case 2:
      cl localcl;
      do
      {
        ab localab;
        Cursor localCursor;
        do
        {
          return;
          f localf = this.c;
          if (k < localf.getCount() - 1)
          {
            ((cz)localf.c()).a(paramView);
            return;
          }
          startActivity((Intent)localf.getItem(k));
          return;
          localab = this.g;
          if (k >= localab.getCount() - 1)
            break;
          localCursor = (Cursor)localab.getItem(k);
        }
        while (localCursor == null);
        FragmentActivity localFragmentActivity = getActivity();
        int m = localCursor.getInt(3);
        Intent localIntent = new Intent(localFragmentActivity, SearchTweetsActivity.class).putExtra("query", localCursor.getString(1)).putExtra("type", m);
        if (m == 1)
        {
          long l = localCursor.getLong(2);
          if (l > 0L)
          {
            localFragmentActivity.startService(new Intent(localFragmentActivity, TwitterService.class).setAction("LOG").putExtra("auth", this.j.c()).putExtra("trend_id", l).putExtra("log_ev", 8));
            localIntent.putExtra("type", 8);
          }
        }
        startActivity(localIntent);
        return;
        startActivity((Intent)localab.getItem(k));
        return;
        localcl = this.h;
        if (k >= localcl.getCount() - 1)
          break;
      }
      while (paramLong <= 0L);
      startActivity(new Intent(getActivity(), ProfileActivity.class).putExtra("user_id", paramLong).putExtra("type", 9));
      return;
      startActivity((Intent)localcl.getItem(k));
      return;
    case 3:
    }
    startActivity((Intent)paramListView.getItemAtPosition(paramInt));
  }

  public final void a(UserView paramUserView, long paramLong)
  {
    if (paramUserView.isChecked())
    {
      if (!this.w.remove(Long.valueOf(paramLong)))
        this.j.c(paramLong);
      return;
    }
    this.w.add(Long.valueOf(paramLong));
  }

  public final void a(dz paramdz, HashMap paramHashMap)
  {
    if (this.m == 2)
    {
      this.n = true;
      return;
    }
    if (this.c != null)
      ((cz)this.c.c()).a();
    if (this.h != null)
      this.h.notifyDataSetChanged();
    this.n = false;
  }

  protected final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    this.r = false;
    LoaderManager localLoaderManager = getLoaderManager();
    if (paramBoolean)
    {
      f(3);
      localLoaderManager.restartLoader(0, null, this);
      localLoaderManager.restartLoader(1, null, this);
      localLoaderManager.restartLoader(2, null, this);
      return;
    }
    int i;
    if ((System.currentTimeMillis() > 300000L + this.a.getLong("last_refresh", 0L)) && (System.currentTimeMillis() - TwitterDataSyncService.b(getActivity()) > 300000L))
    {
      i = 1;
      label93: if (i == 0)
        break label161;
      f(3);
      b(3);
    }
    while (true)
    {
      if (((j)this.g.c()).getCursor() == null)
        localLoaderManager.initLoader(1, null, this);
      if (((cj)this.h.c()).getCursor() != null)
        break;
      localLoaderManager.initLoader(2, null, this);
      return;
      i = 0;
      break label93;
      label161: cz localcz = (cz)this.c.c();
      if (localcz.getCursor() == null)
      {
        f(3);
        localLoaderManager.initLoader(0, null, this);
      }
      else if (localcz.isEmpty())
      {
        f(3);
        b(3);
      }
    }
  }

  public final void a_(long paramLong)
  {
    if (!this.b.contains(Long.valueOf(paramLong)))
    {
      this.b.add(Long.valueOf(paramLong));
      this.e.removeCallbacks(this.f);
      this.e.postDelayed(this.f, 3000L);
    }
  }

  public final be b(ax paramax)
  {
    return this.j.b(paramax);
  }

  public final long e()
  {
    return this.j.e();
  }

  final void e_()
  {
    if (this.t)
    {
      this.u.removeUpdates(this);
      this.t = false;
      if (this.v != null)
        this.e.removeCallbacks(this.v);
    }
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    FragmentActivity localFragmentActivity = getActivity();
    if (this.s == null)
    {
      this.c = new f(localFragmentActivity, new cz(localFragmentActivity, 0, this.j, this, null, 0, this, localFragmentActivity.getWindowManager().getDefaultDisplay().getWidth()));
      this.g = new ab(localFragmentActivity, new j(localFragmentActivity));
      this.h = new cl(localFragmentActivity, new cj(localFragmentActivity, 0, this.j, false, 2130837573, this, this.w, 0, 0));
      BaseAdapter[] arrayOfBaseAdapter = new BaseAdapter[4];
      arrayOfBaseAdapter[0] = this.c;
      arrayOfBaseAdapter[1] = this.g;
      arrayOfBaseAdapter[2] = this.h;
      el[] arrayOfel = new el[2];
      arrayOfel[0] = new el(localFragmentActivity.getString(2131427595), 0, new Intent(localFragmentActivity, SULActivity.class));
      arrayOfel[1] = new el(localFragmentActivity.getString(2131427579), 0, new Intent(localFragmentActivity, UsersActivity.class).putExtra("type", 7).putExtra("follow_all_title", 2131427692).putExtra("follow_all_subtitle", 2131427693).setAction("com.twitter.android.intent.action.FOLLOW"));
      arrayOfBaseAdapter[3] = new er(arrayOfel, 1);
      this.s = new bv(arrayOfBaseAdapter);
      this.s.a = false;
    }
    this.b = new HashSet();
    this.p.setAdapter(this.s);
    this.a = localFragmentActivity.getSharedPreferences("discover_prefs", 0);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.k = new dz(this, null);
    this.u = ((LocationManager)getActivity().getSystemService("location"));
    if (!this.t)
    {
      this.t = com.twitter.android.platform.f.a(this.u, this);
      if (this.v == null)
        this.v = new ae(this, null);
      this.e.postDelayed(this.v, 5000L);
    }
    this.w = new HashSet();
    if (paramBundle != null)
    {
      long[] arrayOfLong = paramBundle.getLongArray("state_added_followers");
      if (arrayOfLong != null)
      {
        int i = arrayOfLong.length;
        for (int j = 0; j < i; j++)
        {
          long l = arrayOfLong[j];
          this.w.add(Long.valueOf(l));
        }
      }
    }
    a(1, this);
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 0:
      Uri.Builder localBuilder3 = au.a.buildUpon().appendQueryParameter("limit", String.valueOf(3)).appendQueryParameter("ownerId", String.valueOf(this.j.j()));
      return new dc(getActivity(), localBuilder3.build(), cz.a, "query is null ", null, "_id ASC ");
    case 1:
      Uri.Builder localBuilder2 = com.twitter.android.provider.c.a.buildUpon().appendQueryParameter("limit", String.valueOf(3)).appendQueryParameter("ownerId", String.valueOf(this.j.j()));
      FragmentActivity localFragmentActivity = getActivity();
      Uri localUri = localBuilder2.build();
      String[] arrayOfString3 = k.a;
      String[] arrayOfString4 = new String[1];
      arrayOfString4[0] = String.valueOf(1);
      return new CursorLoader(localFragmentActivity, localUri, arrayOfString3, "type=? AND latitude IS NULL AND longitude IS NULL", arrayOfString4, "query_id DESC, time ASC");
    case 2:
    }
    Uri.Builder localBuilder1 = r.a.buildUpon().appendQueryParameter("limit", String.valueOf(3)).appendQueryParameter("ownerId", String.valueOf(this.j.j()));
    String[] arrayOfString1;
    String str;
    if (this.w.isEmpty())
    {
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = Long.toString(this.j.j());
      arrayOfString1 = arrayOfString2;
      str = "friendship IS NULL OR friendship NOT IN (1,3) AND user_id!=?";
    }
    while (true)
    {
      return new CursorLoader(getActivity(), localBuilder1.build(), p.b, str, arrayOfString1, null);
      str = null;
      arrayOfString1 = null;
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    b(1, this);
  }

  public void onLoaderReset(Loader paramLoader)
  {
    switch (paramLoader.getId())
    {
    default:
      return;
    case 0:
      ((cz)this.c.c()).swapCursor(null);
      return;
    case 1:
      ((j)this.g.c()).swapCursor(null);
      return;
    case 2:
    }
    ((cj)this.h.c()).swapCursor(null);
  }

  public void onLocationChanged(Location paramLocation)
  {
    e_();
  }

  public void onPause()
  {
    super.onPause();
    this.e.removeCallbacks(this.f);
    this.f.run();
  }

  public void onProviderDisabled(String paramString)
  {
  }

  public void onProviderEnabled(String paramString)
  {
  }

  public void onResume()
  {
    super.onResume();
    a(false);
    this.j.a(this.j.e(), com.twitter.android.service.j.C, null);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    long[] arrayOfLong = cr.b(this.w);
    if (arrayOfLong != null)
      paramBundle.putLongArray("state_added_followers", arrayOfLong);
  }

  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
  }

  public void onStop()
  {
    long[] arrayOfLong = cr.b(this.w);
    if (arrayOfLong != null)
    {
      this.j.c(arrayOfLong);
      this.w.clear();
    }
    super.onStop();
    e_();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.p.setDivider(null);
    this.p.addFooterView(LayoutInflater.from(paramView.getContext()).inflate(2130903090, this.p, false), null, false);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.DiscoverFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
