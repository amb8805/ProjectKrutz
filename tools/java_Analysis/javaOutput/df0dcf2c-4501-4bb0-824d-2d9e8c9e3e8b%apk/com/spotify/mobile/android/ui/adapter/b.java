package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.a;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.util.Assertion;

public abstract class b extends a
{
  protected final int j;
  protected c k;

  public b(Context paramContext, int paramInt, c paramc)
  {
    super(paramContext);
    if (paramInt > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assertion.a(bool, "Each row should have at least one item");
      this.j = paramInt;
      this.k = paramc;
      return;
    }
  }

  public abstract View a(ViewGroup paramViewGroup);

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    Assertion.a(paramView instanceof d, "View must be of type Row.");
    ((d)paramView).a(paramCursor, paramCursor.getPosition() * this.j);
  }

  public abstract void a(View paramView, Cursor paramCursor);

  public int getCount()
  {
    if (a() == null)
      return 0;
    return (int)Math.ceil(a().getCount() / this.j);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
