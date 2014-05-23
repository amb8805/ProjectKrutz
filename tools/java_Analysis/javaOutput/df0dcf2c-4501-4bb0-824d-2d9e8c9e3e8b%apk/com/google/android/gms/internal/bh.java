package com.google.android.gms.internal;

import android.content.Context;
import android.widget.CompoundButton;

final class bh extends CompoundButton
{
  public bh(el paramel, Context paramContext)
  {
    super(paramContext);
  }

  public final void toggle()
  {
    if (this.a.a)
    {
      super.toggle();
      return;
    }
    this.a.a = true;
    this.a.b();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
