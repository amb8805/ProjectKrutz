package com.twitter.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.view.View;
import android.widget.ListView;
import com.twitter.android.client.g;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.ay;
import com.twitter.android.service.j;
import java.util.Locale;

public class SULFragment extends BaseListFragment
{
  private static String[] a = { "_id", "name", "query", "query_id", "user_id", "username", "image_url" };
  private SharedPreferences b;
  private boolean c;

  public SULFragment()
  {
  }

  private void b(int paramInt)
  {
    a(this.j.i(this.o), 3);
  }

  public final void a(Loader paramLoader, Cursor paramCursor)
  {
    super.a(paramLoader, paramCursor);
    if (this.l.isEmpty())
    {
      b(3);
      return;
    }
    c(3);
  }

  protected final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    startActivity((Intent)paramListView.getItemAtPosition(paramInt));
  }

  protected final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    String str = this.b.getString("loc", "");
    if (paramBoolean)
    {
      f(3);
      i();
    }
    do
    {
      return;
      if ((str.length() > 0) && (!str.equals(getResources().getConfiguration().locale.toString())))
      {
        f(3);
        b(3);
        return;
      }
    }
    while (this.l.getCursor() != null);
    f(3);
    f();
  }

  protected final void a_()
  {
    super.a_();
    b(3);
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (this.l == null)
      this.l = new aq(this, getActivity(), 2);
    this.p.setAdapter(this.l);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.b = getActivity().getPreferences(0);
    this.j.a(1, this);
    this.k = new cx(this, null);
    Bundle localBundle = getArguments();
    if (localBundle != null);
    for (this.c = localBundle.getBoolean("onboarding", false); ; this.c = false)
    {
      if (paramBundle == null)
        this.j.a(this.j.e(), j.k);
      return;
    }
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return new dc(getActivity(), aa.a(ay.a, this.o), a, null, null, null);
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.j.b(1, this);
  }

  public void onPause()
  {
    super.onPause();
    SharedPreferences.Editor localEditor = this.b.edit();
    localEditor.putString("loc", getResources().getConfiguration().locale.toString());
    localEditor.commit();
  }

  public void onResume()
  {
    super.onResume();
    a(false);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.SULFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
