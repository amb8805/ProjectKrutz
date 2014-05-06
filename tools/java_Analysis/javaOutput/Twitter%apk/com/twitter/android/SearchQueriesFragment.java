package com.twitter.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import cb;
import com.twitter.android.client.g;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.c;
import com.twitter.android.service.TwitterService;

public class SearchQueriesFragment extends BaseListFragment
{
  SharedPreferences a;
  private int b;

  public SearchQueriesFragment()
  {
  }

  public final void a(Loader paramLoader, Cursor paramCursor)
  {
    this.l.swapCursor(paramCursor);
    int i;
    if (System.currentTimeMillis() > 900000L + this.a.getLong("last", 0L))
      i = 1;
    while ((this.l.isEmpty()) || (i != 0))
      switch (this.b)
      {
      default:
        return;
        i = 0;
        break;
      case 1:
        long l = 1L;
        if (this.j.h())
        {
          cb localcb = this.j.f().j();
          if (localcb != null)
            l = localcb.b;
        }
        a(this.j.h(l), 3);
        return;
      case 6:
        a(this.j.k(), 3);
        return;
      }
    c(3);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    FragmentActivity localFragmentActivity = getActivity();
    Cursor localCursor = (Cursor)paramListView.getItemAtPosition(paramInt);
    if (localCursor == null)
      return;
    int i = localCursor.getInt(3);
    Intent localIntent = new Intent(localFragmentActivity, SearchTweetsActivity.class).putExtra("query", localCursor.getString(1)).putExtra("type", i);
    if (i == 1)
    {
      long l = localCursor.getLong(2);
      if (l > 0L)
      {
        localFragmentActivity.startService(new Intent(localFragmentActivity, TwitterService.class).setAction("LOG").putExtra("auth", this.j.c()).putExtra("trend_id", l).putExtra("log_ev", 8));
        localIntent.putExtra("type", 8);
      }
    }
    startActivity(localIntent);
  }

  protected final void f(int paramInt)
  {
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    ListView localListView = this.p;
    if (this.l == null)
      this.l = new j(getActivity());
    localListView.setAdapter(this.l);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = getActivity().getSharedPreferences("search_prefs", 0);
    this.k = new cp(this, null);
    Bundle localBundle = getArguments();
    if (localBundle != null)
      this.b = localBundle.getInt("q_type");
    if (this.b <= 0)
      throw new IllegalArgumentException("ARG_QUERY_TYPE must be non-zero.");
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    FragmentActivity localFragmentActivity = getActivity();
    Uri localUri = aa.a(c.a, this.j.e());
    String[] arrayOfString1 = k.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = String.valueOf(this.b);
    return new CursorLoader(localFragmentActivity, localUri, arrayOfString1, "type=? AND latitude IS NULL AND longitude IS NULL", arrayOfString2, "query_id DESC, time ASC");
  }

  public void onLoaderReset(Loader paramLoader)
  {
    this.l.swapCursor(null);
  }

  public void onResume()
  {
    super.onResume();
    if (this.l.getCursor() == null)
      getLoaderManager().initLoader(0, null, this);
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.SearchQueriesFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
