package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class cm extends Drawable.ConstantState
{
  private cm()
  {
  }

  public final int getChangingConfigurations()
  {
    return 0;
  }

  public final Drawable newDrawable()
  {
    return cl.a();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.cm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
