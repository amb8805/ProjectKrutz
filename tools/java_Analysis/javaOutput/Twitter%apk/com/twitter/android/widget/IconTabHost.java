package com.twitter.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TabHost;

public class IconTabHost extends TabHost
{
  private n a;

  public IconTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(n paramn)
  {
    this.a = paramn;
  }

  public void dispatchWindowFocusChanged(boolean paramBoolean)
  {
    if (getCurrentView() != null)
      super.dispatchWindowFocusChanged(paramBoolean);
  }

  public void setCurrentTab(int paramInt)
  {
    if (paramInt == getCurrentTab())
    {
      if (this.a != null)
        this.a.a();
      return;
    }
    super.setCurrentTab(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.IconTabHost
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
