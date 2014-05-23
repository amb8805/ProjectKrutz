package com.twitter.android;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import be;
import cj;
import com.twitter.android.client.g;
import com.twitter.android.provider.ax;
import com.twitter.android.provider.az;
import com.twitter.android.service.TwitterService;
import com.twitter.android.widget.TweetDetailView;
import com.twitter.android.widget.d;
import com.twitter.android.widget.o;
import dh;
import dl;

public class TweetFragment extends TweetListFragment
  implements View.OnClickListener, o
{
  private static final LruCache r = new LruCache(100);
  private int A;
  private int B;
  com.twitter.android.client.j a;
  ax b;
  aa c;
  String d;
  TweetDetailView e;
  dh f;
  private de s;
  private de t;
  private bv u;
  private Intent v;
  private boolean w;
  private boolean x;
  private View y;
  private int z;

  public TweetFragment()
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("refresh", false);
    setArguments(localBundle);
  }

  private void a(Context paramContext, int paramInt)
  {
    if (this.d != null)
    {
      Intent localIntent = new Intent(paramContext, TwitterService.class);
      localIntent.setAction("LOG");
      localIntent.putExtra("auth", this.j.c());
      localIntent.putExtra("impression_id", this.d);
      localIntent.putExtra("log_ev", paramInt);
      paramContext.startService(localIntent);
    }
  }

  protected final Dialog a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return super.a(paramInt);
    case 1:
    }
    FragmentActivity localFragmentActivity = getActivity();
    return new AlertDialog.Builder(localFragmentActivity).setIcon(17301543).setTitle(2131427392).setMessage(2131427393).setPositiveButton(2131427505, new ex(this, localFragmentActivity)).setNegativeButton(2131427506, null).create();
  }

  public final void a(Loader paramLoader, Cursor paramCursor)
  {
    ax localax1;
    if (paramCursor.moveToFirst())
      localax1 = this.b;
    while (true)
    {
      ax localax2 = new ax(paramCursor);
      if (localax2.o != localax1.o)
      {
        if ((localax2.j != localax1.o) && (localax2.h <= localax1.h))
          break label150;
        this.t.add(localax2);
      }
      while (!paramCursor.moveToNext())
      {
        if ((this.w) || (this.n))
        {
          this.u.notifyDataSetChanged();
          g_();
          if (this.b.j != -1L)
            this.p.setSelectionFromTop(this.u.b(1), this.z + this.B);
          this.w = false;
        }
        return;
        label150: if (localax2.h < localax1.h)
          this.s.add(localax2);
      }
    }
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    if (this.u.a(paramInt) == 3)
    {
      fb localfb = (fb)paramListView.getItemAtPosition(paramInt);
      startActivity(new Intent(getActivity(), UsersActivity.class).setAction("com.twitter.android.intent.action.FOLLOW").putExtra("owner_id", this.a.g()).putExtra("tag", this.b.o).putExtra("type", localfb.d).putExtra("user_ids", localfb.c));
      return;
    }
    startActivity(new Intent(getActivity(), TweetActivity.class).setData(com.twitter.android.provider.aa.a(paramLong, this.a.g())));
  }

  final void a(ax paramax, com.twitter.android.client.j paramj)
  {
    this.a = paramj;
    this.b = paramax;
    g localg = this.j;
    be localbe = localg.b(paramax);
    ListView localListView = this.p;
    TweetDetailView localTweetDetailView = (TweetDetailView)LayoutInflater.from(localListView.getContext()).inflate(2130903114, localListView, false);
    this.e = localTweetDetailView;
    localTweetDetailView.a(1);
    localTweetDetailView.c.setOnClickListener(this);
    localTweetDetailView.b.setOnClickListener(this);
    localTweetDetailView.j.setOnClickListener(this);
    if (ax.a(localbe))
    {
      this.d = localbe.c.a;
      a(getActivity(), 6);
    }
    boolean bool = localg.h();
    Long localLong1;
    long l;
    if (bool)
    {
      this.v = localg.d(paramax.e, paramax.d);
      localTweetDetailView.e.setOnClickListener(this);
      localTweetDetailView.f.setOnClickListener(this);
      localTweetDetailView.g.setOnClickListener(this);
      localTweetDetailView.h.setOnClickListener(this);
      localTweetDetailView.i.setOnClickListener(this);
      localTweetDetailView.d.setVisibility(0);
      d.a(paramj, paramax, localTweetDetailView.i, localTweetDetailView.g, localTweetDetailView.f, localTweetDetailView.h);
      FragmentActivity localFragmentActivity = getActivity();
      this.s = new de(this, localFragmentActivity, this, 2130903088, false);
      this.t = new de(this, localFragmentActivity, this, 2130903089, true);
      this.c = new aa(null);
      BaseAdapter[] arrayOfBaseAdapter = new BaseAdapter[4];
      arrayOfBaseAdapter[0] = this.s;
      arrayOfBaseAdapter[1] = new by(this, null);
      arrayOfBaseAdapter[2] = this.t;
      arrayOfBaseAdapter[3] = this.c;
      this.u = new bv(arrayOfBaseAdapter);
      this.u.a = false;
      this.y = new View(localFragmentActivity);
      localListView.addFooterView(this.y);
      localListView.setAdapter(this.u);
      this.w = true;
      localLong1 = Long.valueOf(paramax.o);
      Long localLong2 = (Long)r.get(localLong1);
      l = System.currentTimeMillis();
      if ((!this.x) && ((localLong2 == null) || (l >= 300000L + localLong2.longValue())))
        break label486;
      getLoaderManager().initLoader(1, null, this);
      label446: if (this.f == null)
        break label528;
      this.c.a(getActivity(), this.f);
      g_();
    }
    label486: 
    while (!bool)
    {
      return;
      localTweetDetailView.d.setVisibility(8);
      break;
      this.x = true;
      b(this.j.a(paramj, paramax.o, paramax.j));
      r.put(localLong1, Long.valueOf(l));
      break label446;
    }
    label528: b(localg.j(paramax.o));
  }

  public final void a(dl paramdl)
  {
    FragmentActivity localFragmentActivity = getActivity();
    a(localFragmentActivity, 1);
    long l = this.a.g();
    this.j.a(l, com.twitter.android.service.j.u, com.twitter.android.service.j.q);
    BaseActivity.a(localFragmentActivity, paramdl, l);
  }

  public final void a(String paramString)
  {
    int i;
    FragmentActivity localFragmentActivity;
    if (paramString.length() > 1)
    {
      i = paramString.charAt(0);
      localFragmentActivity = getActivity();
      if (i != 35)
        break label54;
      a(localFragmentActivity, 4);
      startActivity(new Intent(localFragmentActivity, SearchTweetsActivity.class).putExtra("query", paramString));
    }
    label54: 
    while (i != 64)
      return;
    a(localFragmentActivity, 5);
    String str = paramString.substring(1);
    startActivity(new Intent(getActivity(), ProfileActivity.class).putExtra("screen_name", str));
  }

  protected final ax b(int paramInt)
  {
    return (ax)this.p.getItemAtPosition(paramInt);
  }

  protected final void b_()
  {
    f_();
  }

  public final void b_(long paramLong)
  {
    startActivity(new Intent(getActivity(), ProfileActivity.class).putExtra("user_id", paramLong));
  }

  public final void c(long paramLong)
  {
    Intent localIntent = new Intent(getActivity(), SearchTweetsActivity.class).putExtra("view_people", false);
    ax localax = this.b;
    if (localax.C != null)
      localIntent.putExtra("place", localax.C);
    if (localax.u)
    {
      Location localLocation = new Location("gps");
      localLocation.setLatitude(localax.v);
      localLocation.setLongitude(localax.w);
      localIntent.putExtra("loc", localLocation);
    }
    startActivity(localIntent);
  }

  public final void f_()
  {
    if (this.w)
      this.n = true;
    while (this.u == null)
      return;
    this.u.notifyDataSetChanged();
  }

  final void g_()
  {
    if (this.b.j == -1L)
      return;
    int i = this.B;
    int j = this.A;
    int k = this.p.getMeasuredHeight() - this.e.getMeasuredHeight();
    int m = this.t.getCount();
    if (m > 0)
      k -= m * j + i * 2;
    int n = this.c.getCount();
    if (n > 0);
    for (int i1 = k - (j * n + i * 2); ; i1 = k)
    {
      this.y.setLayoutParams(new AbsListView.LayoutParams(-1, i1));
      return;
    }
  }

  public void onClick(View paramView)
  {
    FragmentActivity localFragmentActivity = getActivity();
    switch (paramView.getId())
    {
    case 2131165350:
    case 2131165352:
    case 2131165353:
    case 2131165354:
    case 2131165357:
    case 2131165358:
    default:
      return;
    case 2131165346:
      Intent localIntent = new Intent(localFragmentActivity, PostActivity.class);
      ax[] arrayOfax = new ax[1];
      arrayOfax[0] = this.b;
      startActivity(localIntent.putExtra("reply_to_tweet", arrayOfax).putExtra("account_name", this.a.e()).setAction("com.twitter.android.post.reply"));
      this.j.a(this.a.g(), com.twitter.android.service.j.s, com.twitter.android.service.j.q);
      return;
    case 2131165349:
      ax localax2 = this.b;
      String str2;
      if (localax2.l)
      {
        str2 = this.j.c(this.a, this.b.o, this.d);
        localax2.l = false;
        this.e.i.setImageResource(2130837621);
      }
      String str1;
      for (Object localObject = str2; ; localObject = str1)
      {
        b((String)localObject);
        this.j.a(this.a.g(), com.twitter.android.service.j.v, com.twitter.android.service.j.q);
        return;
        str1 = this.j.b(this.a, this.b.o, this.d);
        localax2.l = true;
        this.e.i.setImageResource(2130837625);
      }
    case 2131165347:
      ax localax1 = this.b;
      g localg = this.j;
      long l = this.a.g();
      if ((localax1.q == l) && (localax1.r));
      for (boolean bool = true; ; bool = false)
      {
        g.a(localFragmentActivity, bool, new ey(this, bool, localg, localax1, l, localFragmentActivity)).show();
        return;
      }
    case 2131165348:
      h(1);
      return;
    case 2131165351:
      startActivity(this.v);
      this.j.a(this.a.g(), com.twitter.android.service.j.w, com.twitter.android.service.j.q);
      return;
    case 2131165355:
      a(localFragmentActivity, 3);
      b_(((Long)paramView.getTag()).longValue());
      return;
    case 2131165356:
      BaseActivity.a(localFragmentActivity, Uri.parse((String)paramView.getTag()));
      return;
    case 2131165359:
    }
    c(this.b.s);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.k = new da(this, null);
    this.j.a(1, this);
    if (paramBundle != null)
      this.f = ((dh)paramBundle.getParcelable("as"));
    Resources localResources = getResources();
    this.B = localResources.getDimensionPixelSize(2131492887);
    this.z = localResources.getDimensionPixelSize(2131492876);
    this.A = localResources.getDimensionPixelSize(2131492886);
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return new CursorLoader(getActivity(), az.n.buildUpon().appendEncodedPath(String.valueOf(this.b.o)).appendQueryParameter("ownerId", String.valueOf(this.a.g())).build(), ax.b, null, null, null);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return a(paramLayoutInflater, 2130903055, paramViewGroup);
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.j.b(1, this);
  }

  public void onLoaderReset(Loader paramLoader)
  {
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putParcelable("as", this.f);
    paramBundle.putBoolean("f", this.x);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.p.setScrollingCacheEnabled(false);
    this.p.setCacheColorHint(0);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.TweetFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
