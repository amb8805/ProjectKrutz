package com.spotify.mobile.android.ui.page.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;

public final class h extends f
{
  private int b;

  public h(Context paramContext, ViewGroup paramViewGroup, int paramInt)
  {
    super(paramContext, paramViewGroup);
    b(2130903225);
    this.b = paramInt;
    TextView localTextView1 = (TextView)c(2131362591);
    TextView localTextView2 = (TextView)c(2131362031);
    localTextView1.setText(String.valueOf(paramInt));
    if (paramInt > 0);
    for (int i = 0; ; i = 8)
    {
      localTextView1.setVisibility(i);
      if (paramInt > 0)
        break;
      localTextView2.setText(2131690141);
      return;
    }
    localTextView2.setText(paramContext.getResources().getQuantityString(2131623952, paramInt));
  }

  protected final String c()
  {
    return "skips:" + this.b;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.a.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
