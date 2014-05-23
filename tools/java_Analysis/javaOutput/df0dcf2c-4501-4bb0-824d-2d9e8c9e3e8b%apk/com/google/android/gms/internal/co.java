package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class co extends Drawable.ConstantState
{
  int a;
  int b;

  co(co paramco)
  {
    if (paramco != null)
    {
      this.a = paramco.a;
      this.b = paramco.b;
    }
  }

  public final int getChangingConfigurations()
  {
    return this.a;
  }

  public final Drawable newDrawable()
  {
    return new ck(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.co
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
