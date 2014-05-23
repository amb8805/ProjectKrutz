package com.spotify.mobile.android.ui.stuff;

import android.content.Context;
import android.view.View;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.cc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public final class ContentViewManager
{
  private final Map<ContentViewManager.ContentState, d> a = new HashMap(ContentViewManager.ContentState.values().length);
  private final PriorityQueue<d> b = new PriorityQueue(ContentViewManager.ContentState.values().length, new e((byte)0));
  private final EmptyView c;
  private final View d;
  private final Context e;
  private final c f;
  private LoadingView g;
  private d h = null;

  private ContentViewManager(Context paramContext, EmptyView paramEmptyView, View paramView, c paramc)
  {
    this.e = paramContext;
    this.c = paramEmptyView;
    this.d = paramView;
    this.f = paramc;
    this.c.setVisibility(8);
    this.d.setVisibility(8);
  }

  private View a()
  {
    if (this.c.getVisibility() == 0)
      return this.c;
    if (this.d.getVisibility() == 0)
      return this.d;
    return null;
  }

  private d a(ContentViewManager.ContentState paramContentState)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (locald.a == paramContentState)
        return locald;
    }
    return null;
  }

  private void a(ContentViewManager.ContentState paramContentState, boolean paramBoolean)
  {
    cc.b();
    Assertion.a(this.a.containsKey(paramContentState), "You can not set to a state you have not configured!");
    if (paramBoolean)
    {
      if (a(paramContentState) == null)
        this.b.add(this.a.get(paramContentState));
      this.h = ((d)this.b.peek());
      if (this.h != null)
        break label188;
      this.c.setVisibility(8);
      this.d.setVisibility(0);
    }
    while (true)
    {
      if (this.g != null)
      {
        if (this.g.d())
        {
          View localView = a();
          if (localView != null)
          {
            localView.setVisibility(8);
            this.g.a(new com.spotify.mobile.android.ui.view.d(this.g.getContext(), localView));
          }
          this.g.a(localView);
          this.g.b();
        }
        this.g = null;
      }
      return;
      d locald = a(paramContentState);
      if (locald == null)
        break;
      this.b.remove(locald);
      break;
      label188: this.c.a(this.h.a(this.e));
      this.c.a(this.e.getText(this.h.b));
      this.c.b(this.e.getText(this.h.c));
      this.c.setVisibility(0);
      this.d.setVisibility(8);
      if (this.f == null);
    }
  }

  public final void a(LoadingView paramLoadingView)
  {
    cc.b();
    this.g = paramLoadingView;
    this.g.c();
    this.g.a(a());
    this.g.a();
  }

  public final void a(boolean paramBoolean)
  {
    a(ContentViewManager.ContentState.a, paramBoolean);
  }

  public final void b(boolean paramBoolean)
  {
    a(ContentViewManager.ContentState.b, paramBoolean);
  }

  public final void c(boolean paramBoolean)
  {
    a(ContentViewManager.ContentState.c, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.stuff.ContentViewManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
