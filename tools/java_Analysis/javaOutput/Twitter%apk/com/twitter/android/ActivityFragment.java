package com.twitter.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.view.View;
import android.widget.ListView;
import be;
import com.twitter.android.client.g;
import com.twitter.android.platform.TwitterDataSyncService;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.ax;
import com.twitter.android.provider.u;
import com.twitter.android.service.j;
import com.twitter.android.widget.c;
import com.twitter.android.widget.r;
import dz;
import java.util.HashMap;

public class ActivityFragment extends BaseListFragment
  implements c
{
  private int a;
  private SharedPreferences b;
  private int c;
  private long d;

  public ActivityFragment()
  {
  }

  private void b(int paramInt)
  {
    if (e(paramInt))
      return;
    int i;
    switch (paramInt)
    {
    default:
      i = 20;
    case 2:
    case 4:
    case 3:
    }
    g localg;
    int j;
    while (true)
    {
      localg = this.j;
      j = this.a;
      switch (paramInt)
      {
      default:
        throw new IllegalArgumentException("Invalid fetch type: " + paramInt);
        i = 20;
        continue;
        i = 0;
      case 2:
      case 4:
      case 1:
      case 3:
      }
    }
    Cursor localCursor2 = this.l.getCursor();
    long l1;
    if ((localCursor2 != null) && (localCursor2.moveToFirst()))
      l1 = localCursor2.getLong(12);
    while (true)
      switch (paramInt)
      {
      default:
        throw new IllegalArgumentException("Invalid fetch type: " + paramInt);
        l1 = 0L;
        continue;
        l1 = 0L;
      case 2:
      case 3:
      case 4:
      case 1:
      }
    long l2 = 0L;
    while (true)
    {
      a(localg.b(j, l1, l2, i), paramInt);
      f(paramInt);
      return;
      Cursor localCursor1 = this.l.getCursor();
      if ((localCursor1 != null) && (localCursor1.moveToLast()))
        l2 = localCursor1.getLong(13);
      else
        l2 = 0L;
    }
  }

  public final Bitmap a(ax paramax)
  {
    this.n = true;
    if (this.m != 2)
      return this.j.a(paramax.t, paramax.n, paramax.k);
    return this.j.a(paramax.t, paramax.n);
  }

  protected final void a(Cursor paramCursor)
  {
    if ((paramCursor.getInt(14) == 0) && (paramCursor.getCount() < 400))
      b(1);
  }

  public final void a(Loader paramLoader, Cursor paramCursor)
  {
    super.a(paramLoader, paramCursor);
    if (this.l.isEmpty())
    {
      b(3);
      return;
    }
    if (TwitterDataSyncService.a(getActivity()))
      b(4);
    while (true)
    {
      a(new r(0, this.d, this.c), true);
      return;
      c(3);
    }
  }

  protected final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    Cursor localCursor = (Cursor)paramListView.getItemAtPosition(paramInt);
    if (localCursor != null)
    {
      Intent localIntent = ((cw)this.l).a(getActivity(), paramView, localCursor);
      if (localIntent != null)
        startActivity(localIntent);
    }
  }

  protected final void a(r paramr)
  {
    SharedPreferences.Editor localEditor = this.b.edit();
    String str = this.j.d();
    localEditor.putLong("activity_" + this.a + str, paramr.b);
    localEditor.putInt("off_" + this.a + str, paramr.c);
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

  public final void a(dz paramdz, HashMap paramHashMap)
  {
    if (this.m == 2)
    {
      this.n = true;
      return;
    }
    if (this.l != null)
      ((cw)this.l).a(paramdz, paramHashMap);
    this.n = false;
  }

  protected final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    cw localcw = (cw)this.l;
    if (paramBoolean)
    {
      f(3);
      i();
    }
    do
    {
      return;
      if (localcw.getCursor() == null)
      {
        f(3);
        f();
        return;
      }
    }
    while (!localcw.isEmpty());
    b(3);
  }

  protected final void a_()
  {
    b(2);
  }

  public final be b(ax paramax)
  {
    return this.j.b(paramax);
  }

  protected final void c_()
  {
    String str = this.j.d();
    this.d = this.b.getLong("activity_" + this.a + str, 0L);
    this.c = this.b.getInt("off_" + this.a + str, 0);
    a(new r(0, this.d, this.c), false);
  }

  protected final int d()
  {
    return 0;
  }

  public final long e()
  {
    return this.j.j();
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    ListView localListView = this.p;
    FragmentActivity localFragmentActivity;
    if (this.l == null)
    {
      localFragmentActivity = getActivity();
      if (this.a != 0)
        break label56;
    }
    label56: for (this.l = new b(localFragmentActivity, 2, this.j, this); ; this.l = new av(localFragmentActivity, 2, this.j))
    {
      localListView.setAdapter(this.l);
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.k = new ev(this, null);
    this.a = getArguments().getInt("activity_type", 0);
    this.b = getActivity().getPreferences(0);
    a(1, this);
    a(2, this);
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    FragmentActivity localFragmentActivity = getActivity();
    Uri localUri = aa.a(u.a, this.j.j());
    String[] arrayOfString1 = dx.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = String.valueOf(this.a);
    return new dc(localFragmentActivity, localUri, arrayOfString1, "type=?", arrayOfString2, null);
  }

  public void onDestroy()
  {
    super.onDestroy();
    b(1, this);
    b(2, this);
  }

  public void onResume()
  {
    super.onResume();
    a(false);
    if (this.a == 0)
      this.j.a(this.j.e(), j.D, null);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ActivityFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
