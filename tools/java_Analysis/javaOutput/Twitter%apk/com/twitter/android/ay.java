package com.twitter.android;

import ad;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.android.client.g;
import com.twitter.android.provider.aa;

final class ay extends eq
{
  private final Context b;
  private final g c;
  private final el d;
  private ad e;

  public ay(Context paramContext, int paramInt, g paramg)
  {
    super(new eh(paramContext, 0, false, paramg, paramg), 15);
    this.b = paramContext;
    this.c = paramg;
    this.d = new el(paramContext.getString(2131427411), 0, null);
  }

  protected final View a(View paramView, ViewGroup paramViewGroup)
  {
    return a(paramView, paramViewGroup, this.b.getString(2131427363));
  }

  protected final Object a()
  {
    if (this.e == null)
      return null;
    return new Intent(this.b, TimelineActivity.class).putExtra("owner_id", this.e.a).putExtra("type", 1);
  }

  protected final Object a(int paramInt)
  {
    return new Intent(this.b, TweetActivity.class).setData(aa.a(((eh)this.a).getItemId(paramInt), this.c.e()));
  }

  public final void a(ad paramad)
  {
    if ((this.e != null) && (this.e.equals(paramad)))
      return;
    if (paramad != null)
      ((eh)this.a).a(paramad.g);
    this.e = paramad;
    notifyDataSetChanged();
  }

  protected final View b(View paramView, ViewGroup paramViewGroup)
  {
    return ft.a(paramView, paramViewGroup, this.d);
  }

  protected final boolean b()
  {
    if ((((eh)this.a).d()) || (((eh)this.a).e()))
      return false;
    return super.b();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
