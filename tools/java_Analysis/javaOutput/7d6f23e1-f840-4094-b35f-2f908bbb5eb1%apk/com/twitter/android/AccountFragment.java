package com.twitter.android;

import ad;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;
import ar;
import bl;
import com.twitter.android.client.g;
import com.twitter.android.provider.i;
import com.twitter.android.provider.k;
import com.twitter.android.service.j;
import dz;
import java.util.HashMap;

public class AccountFragment extends BaseListFragment
  implements ar, bf
{
  private be a;
  private bj b;
  private bv c;
  private aw d;
  private ad e;
  private String f;
  private boolean[] g;

  public AccountFragment()
  {
  }

  public final void a(Loader paramLoader, Cursor paramCursor)
  {
    boolean[] arrayOfBoolean;
    if ((paramCursor != null) && (paramCursor.moveToFirst()))
    {
      arrayOfBoolean = this.g;
      if (paramCursor.getInt(3) != 1)
        break label45;
    }
    label45: for (int i = 1; ; i = 0)
    {
      arrayOfBoolean[0] = i;
      this.b.notifyDataSetChanged();
      return;
    }
  }

  protected final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    Intent localIntent = (Intent)paramListView.getItemAtPosition(paramInt);
    if (localIntent != null)
      startActivity(localIntent);
  }

  public final void a(dz paramdz, HashMap paramHashMap)
  {
    if (this.a != null)
    {
      bl localbl = (bl)paramHashMap.get(Long.valueOf(this.o));
      if ((localbl != null) && (this.e != null) && (localbl.a.equals(this.e.c)))
        this.a.notifyDataSetChanged();
    }
  }

  public final void b(ad paramad)
  {
    if (paramad != null)
      if (!paramad.equals(this.e))
      {
        this.e = paramad;
        this.a.a(paramad);
      }
    while (this.o == 0L)
      return;
    this.j.a(null, this.o);
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    FragmentActivity localFragmentActivity = getActivity();
    g localg = this.j;
    if (this.c == null)
    {
      this.a = new be(localFragmentActivity, localg);
      this.g = new boolean[] { false };
      int[] arrayOfInt = { 2131427359 };
      boolean[] arrayOfBoolean = this.g;
      Intent[] arrayOfIntent = new Intent[1];
      arrayOfIntent[0] = new Intent(localFragmentActivity, MessagesActivity.class);
      this.b = new bj(localFragmentActivity, arrayOfInt, arrayOfBoolean, arrayOfIntent);
      BaseAdapter[] arrayOfBaseAdapter = new BaseAdapter[4];
      arrayOfBaseAdapter[0] = this.a;
      arrayOfBaseAdapter[1] = this.b;
      el[] arrayOfel1 = new el[3];
      arrayOfel1[0] = new el(getString(2131427537), 0, new Intent(localFragmentActivity, DraftsActivity.class).putExtra("return_to_drafts", true));
      arrayOfel1[1] = new el(getString(2131427364), 0, new Intent(localFragmentActivity, ListsActivity.class));
      arrayOfel1[2] = new el(getString(2131427683), 0, new Intent(localFragmentActivity, SearchQueriesActivity.class).putExtra("q_type", 6));
      arrayOfBaseAdapter[2] = new er(arrayOfel1);
      el[] arrayOfel2 = new el[2];
      arrayOfel2[0] = new el(getString(2131427635), 0, new Intent(localFragmentActivity, AccountsActivity.class).putExtra("title", 2131427635));
      arrayOfel2[1] = new el(getString(2131427464), 0, new Intent(localFragmentActivity, SettingsActivity.class));
      arrayOfBaseAdapter[3] = new er(arrayOfel2);
      this.c = new bv(arrayOfBaseAdapter);
    }
    this.p.setAdapter(this.c);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.o = this.j.e();
    a(1, this);
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return new CursorLoader(getActivity(), Uri.withAppendedPath(k.a, this.f), i.a, null, null, null);
  }

  public void onDestroy()
  {
    super.onDestroy();
    b(1, this);
  }

  public void onLoaderReset(Loader paramLoader)
  {
  }

  public void onResume()
  {
    super.onResume();
    g localg = this.j;
    String str = localg.d();
    if ((str != null) && (!str.equals(this.f)))
    {
      this.o = localg.e();
      this.f = str;
      this.a.a(localg.b());
      if (this.d != null)
        break label123;
      LoaderManager localLoaderManager = getLoaderManager();
      this.d = new aw(getActivity(), localLoaderManager, this, 1);
      this.d.a(this.o, null, this.o);
      localLoaderManager.initLoader(2, null, this);
    }
    while (true)
    {
      localg.a(this.o, j.E, null);
      return;
      label123: this.d.b(this.o, null, this.o);
      this.g[0] = false;
      this.b.notifyDataSetChanged();
      getLoaderManager().restartLoader(2, null, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.AccountFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
