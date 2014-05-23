package com.spotify.mobile.android.ui.prettylist;

import android.content.Context;
import android.support.v4.view.ah;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import com.spotify.android.paste.widget.HeaderView;

public final class f extends FrameLayout
  implements c
{
  private final StickyListView a;
  private a b;

  f(Context paramContext)
  {
    super(paramContext);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.a = new StickyListView(paramContext);
    this.a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    addView(this.a);
  }

  public final StickyListView a()
  {
    return this.a;
  }

  public final void a(int paramInt)
  {
    this.a.a(paramInt);
  }

  public final void a(ah paramah)
  {
  }

  public final void a(View paramView)
  {
  }

  public final void a(a parama)
  {
    this.b = parama;
  }

  public final void a(String paramString)
  {
    if (this.b != null)
      this.b.a(paramString);
  }

  public final void a(boolean paramBoolean)
  {
  }

  public final PrettyHeaderView b()
  {
    return null;
  }

  public final void b(View paramView)
  {
  }

  public final ListView c()
  {
    return this.a.a();
  }

  public final void c(View paramView)
  {
    this.a.a(paramView);
    this.a.b(paramView);
  }

  public final ImageView d()
  {
    return null;
  }

  public final ImageView e()
  {
    return null;
  }

  public final HeaderView f()
  {
    return null;
  }

  public final void g()
  {
    this.a.a(true);
  }

  public final void h()
  {
    this.a.a(false);
  }

  public final View i()
  {
    return this;
  }

  public final void j()
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.prettylist.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
