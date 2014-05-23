package com.spotify.mobile.android.spotlets.common.adapter;

import android.view.View;
import android.view.ViewGroup;

public abstract interface f<V extends View, D>
{
  public abstract V a(int paramInt, ViewGroup paramViewGroup);

  public abstract Class<V> a();

  public abstract void a(int paramInt, V paramV, D paramD, ViewGroup paramViewGroup);

  public abstract Class<D> b();
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.adapter.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
