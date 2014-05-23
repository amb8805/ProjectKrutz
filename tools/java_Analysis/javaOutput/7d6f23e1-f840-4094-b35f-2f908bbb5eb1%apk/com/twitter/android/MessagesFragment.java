package com.twitter.android;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.view.View;
import android.widget.ListView;
import com.twitter.android.client.g;
import com.twitter.android.platform.TwitterDataSyncService;
import com.twitter.android.provider.as;
import com.twitter.android.provider.l;
import com.twitter.android.service.j;

public class MessagesFragment extends BaseListFragment
{
  private long a;

  public MessagesFragment()
  {
  }

  private boolean b(int paramInt)
  {
    a(this.j.b(0L, 0L, 0), paramInt);
    a(this.j.c(0L, 0L, 0), paramInt);
    f(paramInt);
    return true;
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
    {
      b(4);
      return;
    }
    c(3);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    startActivity((Intent)paramListView.getItemAtPosition(paramInt));
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
    b(3);
  }

  public final void a_()
  {
    b(2);
  }

  protected final int d()
  {
    return 13;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (this.l == null)
      this.l = new dv(getActivity(), 2, this.j);
    this.p.setAdapter(this.l);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.k = new fz(this, null);
    if (paramBundle != null)
      this.a = paramBundle.getLong("state_msg_id");
    a(1, this);
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    String str = String.valueOf(this.o);
    return new dc(getActivity(), l.a.buildUpon().appendEncodedPath(str).appendQueryParameter("ownerId", str).build(), as.a, null, null, null);
  }

  public void onDestroy()
  {
    super.onDestroy();
    b(1, this);
  }

  public void onResume()
  {
    super.onResume();
    a(false);
    Bundle localBundle = getArguments();
    if (localBundle.containsKey("ref_event"))
    {
      this.j.a(this.o, j.f, (j)localBundle.getSerializable("ref_event"));
      localBundle.remove("ref_event");
      return;
    }
    this.j.a(this.o, j.f);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putLong("state_msg_id", this.a);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.MessagesFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
