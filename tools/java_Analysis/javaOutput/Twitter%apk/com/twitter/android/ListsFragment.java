package com.twitter.android;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.view.View;
import android.widget.ListView;
import com.twitter.android.client.g;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.aq;

public class ListsFragment extends BaseListFragment
{
  int a;
  private dn b;

  public ListsFragment()
  {
  }

  private void d(int paramInt)
  {
    if (this.a == -1)
      a(this.j.b(this.o, 0, b(paramInt)), paramInt);
    while (true)
    {
      f(paramInt);
      return;
      a(this.j.b(this.o, this.a, b(paramInt)), paramInt);
    }
  }

  protected final void a(Cursor paramCursor)
  {
    if (paramCursor.getInt(7) == 0)
      d(1);
  }

  public final void a(Loader paramLoader, Cursor paramCursor)
  {
    super.a(paramLoader, paramCursor);
    if (paramCursor.getCount() == 0)
    {
      d(3);
      return;
    }
    c(3);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    if (paramView.getId() == 2131165252)
      startActivity(new Intent(getActivity(), ListCreateEditActivity.class));
    do
    {
      return;
      switch (paramListView.getChoiceMode())
      {
      default:
        startActivity((Intent)paramListView.getItemAtPosition(paramInt));
        return;
      case 1:
      }
    }
    while (this.b == null);
    Cursor localCursor = (Cursor)paramListView.getItemAtPosition(paramInt);
    this.b.a(localCursor.getLong(1), localCursor.getString(2));
  }

  final void a(dn paramdn)
  {
    this.b = paramdn;
  }

  protected final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    if (paramBoolean)
    {
      f(3);
      i();
    }
    do
    {
      return;
      if (this.l.getCursor() == null)
      {
        f(3);
        f();
        return;
      }
    }
    while (!this.l.isEmpty());
    d(3);
  }

  public final void a_()
  {
    d(2);
  }

  final int b(int paramInt)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Invalid fetch type: " + paramInt);
    case 2:
    case 3:
      return 0;
    case 1:
    }
    Cursor localCursor = this.l.getCursor();
    if (localCursor != null)
    {
      if (localCursor.getCount() > 0)
        return 1;
      return 0;
    }
    return 0;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    FragmentActivity localFragmentActivity;
    boolean bool1;
    if (this.l == null)
    {
      localFragmentActivity = getActivity();
      if (this.q != 0)
        break label72;
      bool1 = true;
      if (this.o != this.j.j())
        break label77;
    }
    label72: label77: for (boolean bool2 = true; ; bool2 = false)
    {
      this.l = new dq(localFragmentActivity, 2, bool1, bool2);
      this.p.setAdapter(this.l);
      return;
      bool1 = false;
      break;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.k = new bs(this, null);
    Bundle localBundle = getArguments();
    if (localBundle != null)
    {
      this.a = localBundle.getInt("type", -1);
      return;
    }
    this.a = -1;
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    Uri localUri = aa.a(aq.a, this.j.j());
    if (this.a == -1)
    {
      FragmentActivity localFragmentActivity2 = getActivity();
      String[] arrayOfString3 = ci.a;
      String[] arrayOfString4 = new String[1];
      arrayOfString4[0] = Long.toString(this.o);
      return new dc(localFragmentActivity2, localUri, arrayOfString3, "owner_id=? AND type IN (0,2)", arrayOfString4, null);
    }
    FragmentActivity localFragmentActivity1 = getActivity();
    String[] arrayOfString1 = ci.a;
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = Long.toString(this.o);
    arrayOfString2[1] = Integer.toString(this.a);
    return new dc(localFragmentActivity1, localUri, arrayOfString1, "owner_id=? AND type=?", arrayOfString2, null);
  }

  public void onResume()
  {
    super.onResume();
    a(false);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ListsFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
