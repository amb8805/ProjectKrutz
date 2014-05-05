package com.twitter.android;

import ad;
import android.content.ContentUris;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.view.View;
import android.widget.ListView;
import com.twitter.android.client.g;
import com.twitter.android.platform.TwitterDataSyncService;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.af;
import com.twitter.android.provider.ax;
import com.twitter.android.provider.az;
import com.twitter.android.service.j;
import com.twitter.android.widget.r;
import java.util.ArrayList;
import java.util.Iterator;

public class TimelineFragment extends TweetListFragment
{
  private SharedPreferences a;
  private Uri b;
  private int c;
  private int d;
  private int e;
  private long f;
  private long r;
  private boolean s;

  public TimelineFragment()
  {
  }

  private void a(int paramInt, long paramLong)
  {
    if (e(paramInt))
      return;
    int i;
    g localg;
    String str;
    switch (paramInt)
    {
    default:
      i = 40;
      localg = this.j;
      switch (this.e)
      {
      case 4:
      default:
        return;
      case 0:
        str = localg.a(d(paramInt), i(paramInt), i);
        switch (paramInt)
        {
        case 3:
        case 4:
        default:
          label160: if ((paramInt == 5) && (paramLong != 0L))
          {
            ((eh)this.l).a(paramLong);
            this.l.notifyDataSetChanged();
          }
        case 2:
        case 5:
        case 1:
        }
        break;
      case 1:
      case 2:
      case 3:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      }
      break;
    case 2:
    case 4:
    case 3:
    }
    while (true)
    {
      a(str, paramInt);
      return;
      i = 100;
      break;
      i = 0;
      break;
      localg.a(localg.e(), j.m);
      break label160;
      localg.a(localg.e(), j.n);
      break label160;
      localg.a(localg.e(), j.o);
      break label160;
      str = localg.a(this.e, this.o, d(paramInt), i(paramInt), i);
      break label160;
      str = localg.a(this.o, 1 + this.l.getCount() / 20);
      break label160;
      str = localg.a(this.e, this.o, d(paramInt), i(paramInt), i);
      break label160;
      str = localg.a(this.e, this.o, d(paramInt), i(paramInt), i);
      break label160;
      str = localg.a(this.e, this.o, d(paramInt), i(paramInt), i);
      break label160;
      str = localg.a(this.e, this.o, d(paramInt), i(paramInt), i);
      break label160;
      str = localg.a(this.e, this.o, d(paramInt), i(paramInt), i);
      break label160;
      str = localg.a(this.o, this.r, d(paramInt), i(paramInt), i);
      break label160;
      super.f(paramInt);
    }
  }

  private long d(int paramInt)
  {
    int i = this.e;
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Invalid fetch type: " + paramInt);
    case 2:
    case 4:
      Cursor localCursor = this.l.getCursor();
      if (localCursor == null)
        return 0L;
      if (localCursor.moveToFirst())
      {
        long l = 0L;
        do
          if ((localCursor.getInt(21) == i) && (localCursor.getInt(19) == 1))
          {
            if (l != 0L)
              return localCursor.getLong(1);
            l = localCursor.getLong(1);
          }
        while (localCursor.moveToNext());
      }
      return 0L;
    case 1:
    case 3:
    case 5:
    }
    return 0L;
  }

  private boolean h()
  {
    return (this.l.isEmpty()) || ((this.e == 1) && (!this.s) && (this.l.getCount() < 20));
  }

  private long i(int paramInt)
  {
    int i = this.e;
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Invalid fetch type: " + paramInt);
    case 2:
    case 3:
    case 4:
      return 0L;
    case 1:
      Cursor localCursor2 = this.l.getCursor();
      if ((localCursor2 != null) && (localCursor2.moveToLast()))
        do
          if ((i == localCursor2.getInt(21)) && (localCursor2.getInt(19) == 1))
            return localCursor2.getLong(1);
        while (localCursor2.moveToPrevious());
      return 0L;
    case 5:
    }
    Cursor localCursor1 = this.l.getCursor();
    if ((localCursor1 != null) && (localCursor1.moveToPosition(this.c)))
    {
      this.c = 0;
      return localCursor1.getLong(25);
    }
    return 0L;
  }

  public final void a(long paramLong)
  {
    super.a(paramLong);
  }

  public final void a(ad paramad)
  {
    super.a(paramad.a);
    a(false);
  }

  protected final void a(Cursor paramCursor)
  {
    if ((paramCursor.getInt(18) == 0) && (paramCursor.getCount() < 400))
      a(1, 0L);
  }

  public final void a(Loader paramLoader, Cursor paramCursor)
  {
    super.a(paramLoader, paramCursor);
    if (h())
    {
      a(3, 0L);
      this.s = true;
      return;
    }
    if (((this.e == 0) || (this.e == 5)) && (TwitterDataSyncService.a(getActivity())))
      a(4, 0L);
    while (true)
    {
      a(new r(0, this.f, this.d), true);
      return;
      c(3);
    }
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    Cursor localCursor = (Cursor)paramListView.getItemAtPosition(paramInt);
    if ((localCursor != null) && (localCursor.getInt(22) == 2))
    {
      this.c = (paramInt - paramListView.getHeaderViewsCount());
      a(5, localCursor.getLong(1));
      return;
    }
    startActivity(new Intent(getActivity(), TweetActivity.class).setData(aa.a(paramLong, this.j.e())));
  }

  protected final void a(r paramr)
  {
    int i = this.e;
    switch (i)
    {
    default:
      return;
    case 0:
    case 5:
    }
    SharedPreferences.Editor localEditor = this.a.edit();
    String str = this.j.d();
    localEditor.putLong("tweet_" + i + str, paramr.b);
    localEditor.putInt("off_" + i + str, paramr.c);
    localEditor.commit();
  }

  protected final void a(r paramr, boolean paramBoolean)
  {
    long l = paramr.b;
    if (l > 0L)
    {
      int i = b(l);
      if ((i > this.p.getHeaderViewsCount()) || (!paramBoolean))
        this.p.setSelectionFromTop(i, paramr.c);
    }
  }

  protected final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    switch (this.e)
    {
    case 4:
    default:
      throw new IllegalArgumentException("Invalid status type: " + this.e);
    case 0:
      this.b = ContentUris.withAppendedId(az.i, this.o);
      if (this.b == null)
        break label355;
      if (paramBoolean)
      {
        f(3);
        i();
      }
    case 1:
    case 2:
    case 3:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    do
    {
      return;
      this.b = ContentUris.withAppendedId(af.b, this.o);
      break;
      this.b = ContentUris.withAppendedId(az.j, this.o);
      break;
      this.b = ContentUris.withAppendedId(az.h, this.o);
      break;
      if (getArguments().getBoolean("include_rts", false))
      {
        this.b = ContentUris.withAppendedId(az.m, this.o);
        break;
      }
      this.b = ContentUris.withAppendedId(az.g, this.o);
      break;
      this.b = ContentUris.withAppendedId(az.f, this.o);
      break;
      this.b = ContentUris.withAppendedId(az.e, this.o);
      break;
      this.b = ContentUris.withAppendedId(az.d, this.o);
      break;
      if ((this.o <= 0L) || (this.r <= 0L))
        break;
      this.b = ContentUris.withAppendedId(az.c, this.o);
      break;
      if (this.l.getCursor() == null)
      {
        f(3);
        f();
        return;
      }
    }
    while (!h());
    a(3, 0L);
    this.s = true;
    return;
    label355: c(3);
  }

  protected final void a_()
  {
    a(2, 0L);
  }

  protected final ax b(int paramInt)
  {
    return new ax((Cursor)this.p.getItemAtPosition(paramInt));
  }

  protected final void b_()
  {
    if (this.l != null)
      ((eh)this.l).a();
  }

  protected final void c(int paramInt)
  {
    switch (paramInt)
    {
    default:
      super.c(paramInt);
      return;
    case 5:
    }
    ((eh)this.l).c();
    this.l.notifyDataSetChanged();
  }

  protected final void c_()
  {
    int i = this.e;
    switch (i)
    {
    default:
      super.c_();
      return;
    case 0:
    case 5:
    }
    String str = this.j.d();
    this.f = this.a.getLong("tweet_" + i + str, 0L);
    this.d = this.a.getInt("off_" + i + str, 0);
    a(new r(0, this.f, this.d), false);
  }

  protected final int d()
  {
    return 1;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (this.l == null)
    {
      FragmentActivity localFragmentActivity = getActivity();
      if (this.e == 0);
      eh localeh;
      for (boolean bool = true; ; bool = false)
      {
        localeh = new eh(localFragmentActivity, 2, bool, this, this.j);
        if (paramBundle == null)
          break label102;
        long[] arrayOfLong = paramBundle.getLongArray("spinning_gap_ids");
        if (arrayOfLong == null)
          break label102;
        int i = arrayOfLong.length;
        for (int j = 0; j < i; j++)
          localeh.a(arrayOfLong[j]);
      }
      localeh.notifyDataSetChanged();
      label102: this.l = localeh;
    }
    this.p.setAdapter(this.l);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    FragmentActivity localFragmentActivity = getActivity();
    this.a = localFragmentActivity.getPreferences(0);
    this.k = new db(this, localFragmentActivity);
    Bundle localBundle = getArguments();
    this.e = localBundle.getInt("type", 0);
    this.r = localBundle.getLong("tag", -1L);
    a(1, this);
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    String str;
    String[] arrayOfString1;
    if (this.r > 0L)
    {
      String[] arrayOfString3 = new String[1];
      arrayOfString3[0] = Long.toString(this.r);
      str = "tag=?";
      arrayOfString1 = arrayOfString3;
      if (this.e != 1)
        break label89;
    }
    label89: for (String[] arrayOfString2 = ax.c; ; arrayOfString2 = ax.b)
    {
      return new dc(getActivity(), aa.a(this.b, this.j.j()), arrayOfString2, str, arrayOfString1, "updated_at DESC, _id ASC");
      str = null;
      arrayOfString1 = null;
      break;
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    b(1, this);
  }

  public void onResume()
  {
    super.onResume();
    if (this.o > 0L)
      a(false);
    long l = this.j.j();
    Bundle localBundle = getArguments();
    j localj;
    if (localBundle.containsKey("ref_event"))
    {
      localj = (j)localBundle.getSerializable("ref_event");
      localBundle.remove("ref_event");
    }
    while (true)
      switch (this.e)
      {
      case 3:
      case 4:
      default:
        return;
        localj = null;
      case 0:
      case 1:
      case 5:
      case 2:
      }
    this.j.a(l, j.a, localj);
    return;
    this.j.a(l, j.b, localj);
    return;
    this.j.a(l, j.d, localj);
    return;
    this.j.a(l, j.e, localj);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.l != null)
    {
      ArrayList localArrayList = ((eh)this.l).b();
      if (!localArrayList.isEmpty())
      {
        long[] arrayOfLong = new long[localArrayList.size()];
        int i = 0;
        Iterator localIterator = localArrayList.iterator();
        while (localIterator.hasNext())
        {
          arrayOfLong[i] = ((Long)localIterator.next()).longValue();
          i++;
        }
        paramBundle.putLongArray("spinning_gap_ids", arrayOfLong);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.TimelineFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
