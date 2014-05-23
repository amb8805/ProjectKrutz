package com.spotify.mobile.android.spotlets.common.adapter;

import android.view.View;
import com.google.common.base.Optional;
import java.util.LinkedList;
import java.util.List;

public final class c<D>
{
  private final List<f<? extends View, ? extends D>> a = new LinkedList();
  private Optional<d<D>> b = Optional.d();
  private boolean c = false;

  public c()
  {
  }

  public final a<D> a()
  {
    return new a((d)this.b.c(), this.a, this.c);
  }

  public final c<D> a(d<D> paramd)
  {
    this.b = Optional.c(paramd);
    return this;
  }

  public final <T extends D> c<D> a(f<? extends View, T> paramf)
  {
    this.a.add(paramf);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.adapter.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
