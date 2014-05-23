package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.spotify.mobile.android.util.Assertion;

public final class d
  implements j
{
  private View a;
  private Context b;

  public d(Context paramContext, View paramView)
  {
    Assertion.a(paramContext, "Don't pass null context to constructor");
    Assertion.a(paramView, "Don't pass null views to constructor");
    this.b = paramContext;
    this.a = paramView;
  }

  public final void a()
  {
    this.a.setVisibility(0);
  }

  public final long b()
  {
    return this.b.getResources().getInteger(2131558412);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject != null)
    {
      boolean bool2 = paramObject instanceof d;
      bool1 = false;
      if (bool2)
      {
        View localView1 = ((d)paramObject).a;
        View localView2 = this.a;
        bool1 = false;
        if (localView1 == localView2)
          bool1 = true;
      }
    }
    return bool1;
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
