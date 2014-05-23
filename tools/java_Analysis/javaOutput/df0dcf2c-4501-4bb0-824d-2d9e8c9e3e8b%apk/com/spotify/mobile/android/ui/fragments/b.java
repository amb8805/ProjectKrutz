package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

public final class b extends m
  implements g
{
  private com.spotify.mobile.android.ui.adapter.g i;

  public b()
  {
  }

  public final Fragment C()
  {
    return this;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.i = new com.spotify.mobile.android.ui.adapter.g(i());
    a(this.i);
    return paramLayoutInflater.inflate(2130903181, paramViewGroup, false);
  }

  public final String a(Context paramContext)
  {
    return "Debug";
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    a_(true);
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    b().setOnCreateContextMenuListener(this);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
