package com.spotify.mobile.android.ui.stuff;

import android.content.Context;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private List<d> a = new ArrayList();
  private Context b;
  private EmptyView c;
  private View d;
  private c e;

  public b(Context paramContext, EmptyView paramEmptyView, View paramView)
  {
    this.b = paramContext;
    this.c = paramEmptyView;
    this.d = paramView;
  }

  private void a(ContentViewManager.ContentState paramContentState)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      Assertion.b(paramContentState, ((d)localIterator.next()).a);
  }

  public final b a()
  {
    a(ContentViewManager.ContentState.b);
    this.a.add(new d(ContentViewManager.ContentState.b, SpotifyIcon.cm, 2131689916, 2131689915, (byte)0));
    return this;
  }

  public final b a(int paramInt)
  {
    a(ContentViewManager.ContentState.a);
    this.a.add(new d(ContentViewManager.ContentState.a, SpotifyIcon.cO, 2131689945, paramInt, (byte)0));
    return this;
  }

  public final b a(SpotifyIcon paramSpotifyIcon)
  {
    a(ContentViewManager.ContentState.c);
    this.a.add(new d(ContentViewManager.ContentState.c, paramSpotifyIcon, 2131690006, 2131690005, (byte)0));
    return this;
  }

  public final ContentViewManager b()
  {
    ContentViewManager localContentViewManager = new ContentViewManager(this.b, this.c, this.d, this.e, (byte)0);
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ContentViewManager.a(localContentViewManager, (d)localIterator.next());
    return localContentViewManager;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.stuff.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
