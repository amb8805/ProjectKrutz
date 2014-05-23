package com.spotify.mobile.android.spotlets.search.model;

import com.google.common.base.i;
import java.lang.ref.WeakReference;

public class d<T extends g>
{
  private final WeakReference<T> a;

  protected d(T paramT)
  {
    this.a = new WeakReference(i.a(paramT));
  }

  public final String s_()
  {
    return t().getUri();
  }

  protected final T t()
  {
    g localg = (g)this.a.get();
    if (localg == null)
      throw new IllegalStateException("Trying to use a destroyed search result");
    return localg;
  }

  public final String t_()
  {
    return t().getName();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.model.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
