package com.spotify.mobile.android.ui.prettylist;

import android.content.Context;
import android.support.v4.view.ah;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.widget.HeaderView;

public final class b extends LinearLayout
  implements c
{
  private final StickyListView a;
  private final PrettyHeaderView b;
  private a c;

  b(Context paramContext)
  {
    super(paramContext);
    setOrientation(0);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    setWeightSum(3.0F);
    this.b = new PrettyHeaderView(paramContext);
    this.a = new StickyListView(paramContext);
    this.b.setLayoutParams(new LinearLayout.LayoutParams(1, -1, 1.0F));
    this.a.setLayoutParams(new LinearLayout.LayoutParams(1, -1, 2.0F));
    this.a.setPadding(0, d.b(1.0F, paramContext.getResources()), 0, 0);
    addView(this.b);
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
    this.b.b().a(paramah);
  }

  public final void a(View paramView)
  {
    this.b.b().a(paramView);
  }

  public final void a(a parama)
  {
    this.c = parama;
  }

  public final void a(String paramString)
  {
    if (this.c != null)
      this.c.a(paramString);
  }

  public final void a(boolean paramBoolean)
  {
  }

  public final PrettyHeaderView b()
  {
    return this.b;
  }

  public final void b(View paramView)
  {
    this.b.a(paramView);
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
    return this.b.a();
  }

  public final ImageView e()
  {
    return this.b.b().a();
  }

  public final HeaderView f()
  {
    return this.b.b();
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
 * Qualified Name:     com.spotify.mobile.android.ui.prettylist.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
