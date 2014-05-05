package com.twitter.android;

import android.content.ActivityNotFoundException;
import android.content.ContentUris;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.location.Location;
import android.location.Location;;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import ap;
import be;
import com.twitter.android.client.g;
import com.twitter.android.platform.f;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.au;
import com.twitter.android.provider.ax;
import com.twitter.android.provider.az;
import com.twitter.android.widget.r;
import cr;
import do;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s;

public class SearchTweetsFragment extends TweetListFragment
  implements LocationListener
{
  int a;
  int b;
  String c;
  ImageView d;
  String e;
  cz f;
  private bv r;
  private String s;
  private BaseAdapter[] t;
  private boolean u;
  private Location v;
  private ap w;

  public SearchTweetsFragment()
  {
  }

  private void a(Location paramLocation, ap paramap)
  {
    Resources localResources = getResources();
    StringBuilder localStringBuilder = new StringBuilder(s.a(localResources.getDisplayMetrics().widthPixels, localResources.getDimensionPixelSize(2131492874)));
    if (paramLocation != null)
      localStringBuilder.append(paramLocation.getLatitude()).append((char)',').append(paramLocation.getLongitude());
    while (true)
    {
      if (this.d != null)
        this.d.setImageBitmap(this.j.g(localStringBuilder.toString()));
      do
        return;
      while (paramap == null);
      localStringBuilder.append(cr.a(paramap.b));
      if (paramap.c != null)
      {
        localStringBuilder.append("&path=color:0x00000000%7Cfillcolor:0xAA000033");
        ArrayList localArrayList = do.a(paramap.c);
        if (localArrayList != null)
        {
          Iterator localIterator = localArrayList.iterator();
          while (localIterator.hasNext())
          {
            Pair localPair = (Pair)localIterator.next();
            localStringBuilder.append("%7C").append(localPair.first).append((char)',').append(localPair.second);
          }
        }
      }
    }
  }

  private void h()
  {
    if (this.u)
    {
      ((LocationManager)getActivity().getSystemService("location")).removeUpdates(this);
      this.u = false;
    }
  }

  private void k()
  {
    if (this.d == null)
    {
      ListView localListView = this.p;
      ImageView localImageView = (ImageView)LayoutInflater.from(getActivity()).inflate(2130903079, localListView, false);
      localListView.addHeaderView(localImageView, null, true);
      this.d = localImageView;
    }
  }

  protected final void a(Cursor paramCursor)
  {
    if ((paramCursor.getInt(18) == 0) && (paramCursor.getCount() < 400))
      d(1);
  }

  public final void a(Loader paramLoader, Cursor paramCursor)
  {
    switch (paramLoader.getId())
    {
    default:
      super.a(paramLoader, paramCursor);
      c(3);
      return;
    case 1:
    }
    this.f.changeCursor(paramCursor);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    if (this.r == null)
      return;
    if (paramView.equals(this.d))
    {
      StringBuilder localStringBuilder;
      if (this.v != null)
      {
        localStringBuilder = new StringBuilder("geo:0,0?z=18&q=").append(this.v.getLatitude()).append((char)',').append(this.v.getLongitude());
        if ((this.w != null) && (this.w.b != null))
          localStringBuilder.append((char)'(').append(this.w.b).append((char)')');
      }
      for (Uri localUri = Uri.parse(localStringBuilder.toString()); ; localUri = Uri.parse("geo:0,0?q=" + Uri.encode(this.w.b)))
      {
        Intent localIntent = new Intent("android.intent.action.VIEW");
        localIntent.setData(localUri);
        try
        {
          startActivity(localIntent);
          return;
        }
        catch (ActivityNotFoundException localActivityNotFoundException)
        {
          return;
        }
        if (this.w == null)
          break;
      }
    }
    switch (this.r.a(paramInt - this.p.getHeaderViewsCount()))
    {
    default:
      startActivity(new Intent(getActivity(), TweetActivity.class).setData(aa.a(paramLong, this.j.e())));
      return;
    case 0:
      startActivity((Intent)paramListView.getItemAtPosition(paramInt));
      return;
    case 1:
    }
    this.f.a(paramView);
  }

  protected final void a_()
  {
    d(2);
  }

  public final int b(long paramLong)
  {
    return super.b(paramLong) + this.r.b(this.t.length - 1);
  }

  protected final ax b(int paramInt)
  {
    return new ax((Cursor)this.p.getItemAtPosition(paramInt));
  }

  protected final void b_()
  {
    ((eh)this.l).a();
    this.f.a();
  }

  protected final int d()
  {
    return 1;
  }

  final void d(int paramInt)
  {
    if (e(paramInt));
    while ((this.u) && (this.v == null))
      return;
    StringBuilder localStringBuilder;
    if ((this.w == null) && (this.v != null))
    {
      localStringBuilder = new StringBuilder(32);
      localStringBuilder.append(this.v.getLatitude());
      localStringBuilder.append((char)',');
      localStringBuilder.append(this.v.getLongitude());
      localStringBuilder.append((char)',');
      localStringBuilder.append("5mi");
    }
    String str2;
    for (String str1 = localStringBuilder.toString(); ; str1 = null)
    {
      str2 = this.s;
      switch (paramInt)
      {
      default:
        throw new IllegalArgumentException("Invalid fetch type: " + paramInt);
      case 3:
      case 2:
      case 1:
      }
    }
    int i = 1;
    g localg;
    while (true)
    {
      f(paramInt);
      localg = this.j;
      switch (paramInt)
      {
      default:
        throw new IllegalArgumentException("Invalid fetch type: " + paramInt);
        i = 0;
        continue;
        i = this.a;
      case 3:
      case 2:
      case 1:
      }
    }
    long l1 = 0L;
    while (true)
      switch (paramInt)
      {
      default:
        throw new IllegalArgumentException("Invalid fetch type: " + paramInt);
        Cursor localCursor2 = this.l.getCursor();
        if (localCursor2 != null)
        {
          if (localCursor2.moveToFirst())
            l1 = localCursor2.getLong(1);
          else
            l1 = 0L;
        }
        else
        {
          l1 = 0L;
          continue;
          l1 = 0L;
        }
      case 3:
      case 2:
      case 1:
      }
    long l2 = 0L;
    while (true)
    {
      a(localg.a(str2, str2, l1, 100, l2, false, str1, this.c, i, null, null, this.b), paramInt);
      return;
      l2 = 0L;
      continue;
      Cursor localCursor1 = this.l.getCursor();
      if (localCursor1 != null)
      {
        if (localCursor1.moveToLast())
          l2 = localCursor1.getLong(1);
        else
          l2 = 0L;
      }
      else
        l2 = 0L;
    }
  }

  protected final void f()
  {
    super.f();
    getLoaderManager().initLoader(1, null, this);
  }

  public final r g()
  {
    ListView localListView = this.p;
    int i = localListView.getFirstVisiblePosition();
    int j = this.r.b(this.t.length - 1);
    int k = j + localListView.getHeaderViewsCount();
    if (this.i)
      k++;
    int m;
    Cursor localCursor;
    label85: int i1;
    label115: View localView;
    long l;
    if (i < k)
    {
      m = k;
      localCursor = this.l.getCursor();
      int n = m - j;
      if ((localCursor == null) || (!localCursor.moveToPosition(n)))
        break label175;
      if (ax.a(be.a(localCursor.getBlob(20))))
        break label165;
      i1 = k + localCursor.getPosition();
      localView = localListView.getChildAt(i1 - i);
      l = localListView.getItemIdAtPosition(i1);
      if (localView == null)
        break label182;
    }
    label165: label175: label182: for (int i2 = localView.getTop(); ; i2 = 0)
    {
      return new r(i1, l, i2);
      m = i;
      break;
      if (localCursor.moveToNext())
        break label85;
      i1 = m;
      break label115;
    }
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    FragmentActivity localFragmentActivity = getActivity();
    Bundle localBundle = getArguments();
    String str1 = localBundle.getString("query");
    Object localObject2;
    Object localObject3;
    label63: el[] arrayOfel;
    label180: Uri localUri;
    ap localap2;
    Location localLocation3;
    String str2;
    Object localObject1;
    ap localap1;
    if (this.u)
    {
      f.a((LocationManager)localFragmentActivity.getSystemService("location"), this);
      k();
      localObject2 = str1;
      if (localObject2 != null)
        break label516;
      localObject3 = "";
      this.s = ((String)localObject3);
      if (this.r == null)
      {
        this.l = new eh(localFragmentActivity, 2, false, this, this.j);
        this.f = new cz(localFragmentActivity, 0, this.j, this, (String)localObject3, 2, null, 0);
        if (localBundle.getBoolean("view_people", true))
        {
          arrayOfel = new el[1];
          arrayOfel[0] = new el(getString(2131427685), 0, new Intent(localFragmentActivity, SearchUsersActivity.class).putExtra("query", (String)localObject3).putExtra("view_tweets", false));
          BaseAdapter[] arrayOfBaseAdapter = new BaseAdapter[3];
          arrayOfBaseAdapter[0] = new er(arrayOfel);
          arrayOfBaseAdapter[1] = this.f;
          arrayOfBaseAdapter[2] = this.l;
          this.t = arrayOfBaseAdapter;
          this.r = new bv(this.t);
        }
      }
      else
      {
        this.p.setAdapter(this.r);
      }
    }
    else
    {
      localUri = (Uri)localBundle.getParcelable("data");
      if (localBundle.containsKey("place"))
      {
        localap2 = (ap)localBundle.getParcelable("place");
        this.w = localap2;
        localLocation3 = (Location)localBundle.getParcelable("loc");
        if (localap2.d == null)
          break label523;
        str2 = "place:" + localap2.d;
        localObject1 = localLocation3;
        localap1 = localap2;
      }
    }
    while (true)
    {
      if ((localap1 != null) || (localObject1 != null))
      {
        this.v = ((Location)localObject1);
        k();
        a((Location)localObject1, localap1);
      }
      localObject2 = str2;
      break;
      if (localUri != null)
      {
        String str3 = localUri.getQueryParameter("latitude");
        String str4 = localUri.getQueryParameter("longitude");
        Location localLocation2 = null;
        if (str3 != null)
        {
          localLocation2 = null;
          if (str4 != null)
          {
            localLocation2 = new Location("gps");
            localLocation2.setLatitude(Double.valueOf(str3).doubleValue());
            localLocation2.setLongitude(Double.valueOf(str4).doubleValue());
            this.c = localUri.getQueryParameter("location");
          }
        }
        str2 = str1;
        localObject1 = localLocation2;
        localap1 = null;
      }
      else
      {
        Location localLocation1 = (Location)localBundle.getParcelable("loc");
        str2 = str1;
        localObject1 = localLocation1;
        localap1 = null;
        continue;
        arrayOfel = new el[0];
        break label180;
        label516: localObject3 = localObject2;
        break label63;
        label523: str2 = str1;
        localObject1 = localLocation3;
        localap1 = localap2;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
      this.e = paramBundle.getString("state_search_id");
    this.k = new dk(this, getActivity());
    Bundle localBundle = getArguments();
    this.b = localBundle.getInt("type", 0);
    this.u = localBundle.getBoolean("nearby", false);
    a(1, this);
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default:
      return new dc(getActivity(), aa.a(ContentUris.withAppendedId(az.o, this.o), this.j.j()), ax.b, null, null, "tag DESC, updated_at DESC");
    case 1:
    }
    FragmentActivity localFragmentActivity = getActivity();
    Uri localUri = aa.a(au.a, this.o);
    String[] arrayOfString1 = cz.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = this.s;
    return new CursorLoader(localFragmentActivity, localUri, arrayOfString1, "query=?", arrayOfString2, null);
  }

  public void onDestroy()
  {
    super.onDestroy();
    h();
    b(1, this);
  }

  public void onLocationChanged(Location paramLocation)
  {
    if (this.v == null)
    {
      this.v = paramLocation;
      h();
      if (!paramLocation.hasAccuracy())
        break label58;
    }
    label58: for (String str = Float.toString(paramLocation.getAccuracy()); ; str = null)
    {
      a(paramLocation, null);
      b(this.j.a(paramLocation.getLatitude(), paramLocation.getLongitude(), str));
      return;
    }
  }

  public void onPause()
  {
    super.onPause();
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
    if (this.e == null)
    {
      d(3);
      return;
    }
    f();
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putString("state_search_id", this.e);
  }

  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.SearchTweetsFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
