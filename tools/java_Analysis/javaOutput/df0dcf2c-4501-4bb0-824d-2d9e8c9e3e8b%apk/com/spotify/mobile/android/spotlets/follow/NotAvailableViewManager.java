package com.spotify.mobile.android.spotlets.follow;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.stuff.h;
import com.spotify.mobile.android.ui.stuff.i;
import com.spotify.mobile.android.ui.view.LoadingView;

@Deprecated
public final class NotAvailableViewManager
{
  private final Context a;
  private final ViewGroup b;
  private LoadingView c;
  private NotAvailableViewManager.DataState d;
  private boolean e = true;
  private View f;
  private View g;
  private int h = -1;

  public NotAvailableViewManager(Context paramContext, LayoutInflater paramLayoutInflater, View paramView, ViewGroup paramViewGroup)
  {
    this.a = paramContext;
    this.b = paramViewGroup;
    this.c = LoadingView.a(paramLayoutInflater, paramContext, paramView);
    this.b.addView(this.c);
    paramView.setVisibility(4);
    a(NotAvailableViewManager.DataState.a);
  }

  private void b()
  {
    if (this.e)
      switch (NotAvailableViewManager.1.a[this.d.ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      }
    do
    {
      do
      {
        return;
        c();
        return;
        this.c.b();
        if (this.g == null)
        {
          Context localContext2 = this.a;
          ViewGroup localViewGroup2 = this.b;
          EmptyView localEmptyView2 = new EmptyView(localContext2);
          Resources localResources = localContext2.getResources();
          localEmptyView2.a(i.b(localContext2, SpotifyIcon.cm));
          localEmptyView2.a(localResources.getString(2131689934));
          localEmptyView2.b(localResources.getString(2131689933));
          localViewGroup2.addView(localEmptyView2);
          this.g = localEmptyView2;
        }
        this.g.setVisibility(0);
      }
      while (this.f == null);
      this.f.setVisibility(8);
      return;
      d();
      this.c.b();
      return;
      c();
      return;
      this.c.b();
      if (this.f == null)
      {
        Context localContext1 = this.a;
        ViewGroup localViewGroup1 = this.b;
        int i = this.h;
        if (i == -1)
          i = 2131689944;
        EmptyView localEmptyView1 = h.a(localContext1, localContext1.getString(i));
        localViewGroup1.addView(localEmptyView1);
        this.f = localEmptyView1;
      }
      this.f.setVisibility(0);
    }
    while (this.g == null);
    this.g.setVisibility(8);
  }

  private void c()
  {
    d();
    this.c.a();
  }

  private void d()
  {
    if (this.f != null)
      this.f.setVisibility(8);
    if (this.g != null)
      this.g.setVisibility(8);
  }

  public final Boolean a()
  {
    if ((this.d == NotAvailableViewManager.DataState.d) || (this.d == NotAvailableViewManager.DataState.b));
    for (boolean bool = true; ; bool = false)
      return Boolean.valueOf(bool);
  }

  public final void a(int paramInt)
  {
    this.h = paramInt;
  }

  public final void a(NotAvailableViewManager.DataState paramDataState)
  {
    if (this.d != paramDataState)
    {
      this.d = paramDataState;
      b();
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (this.e != paramBoolean)
    {
      this.e = paramBoolean;
      b();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
