package com.twitter.android;

import android.app.Activity;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import ar;
import be;
import com.twitter.android.client.g;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.au;
import com.twitter.android.provider.ax;
import com.twitter.android.widget.c;
import dz;
import java.util.HashMap;

public class StoriesFragment extends BaseListFragment
  implements ar, c
{
  cz a;

  public StoriesFragment()
  {
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
    this.a.swapCursor(paramCursor);
    c(3);
  }

  protected final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    this.a.a(paramView);
  }

  public final void a(dz paramdz, HashMap paramHashMap)
  {
    if (this.m == 2)
    {
      this.n = true;
      return;
    }
    if (this.a != null)
      this.a.a();
    this.n = false;
  }

  public final be b(ax paramax)
  {
    return this.j.b(paramax);
  }

  public final long e()
  {
    return this.j.e();
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    FragmentActivity localFragmentActivity = getActivity();
    if (this.a == null)
      this.a = new cz(localFragmentActivity, 0, this.j, this, null, 1, null, localFragmentActivity.getWindowManager().getDefaultDisplay().getWidth());
    this.p.setAdapter(this.a);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.k = new eo(this);
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return new dc(getActivity(), aa.a(au.a, this.j.j()), cz.a, "query is null ", null, "_id ASC ");
  }

  public void onLoaderReset(Loader paramLoader)
  {
    this.a.swapCursor(null);
  }

  public void onResume()
  {
    super.onResume();
    if (this.a.getCursor() == null)
    {
      getLoaderManager().initLoader(0, null, this);
      f(3);
    }
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.p.setDivider(null);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.StoriesFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
