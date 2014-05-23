package com.spotify.mobile.android.ui.page.a;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;

public final class g extends f
{
  private String b;

  public g(Context paramContext, ViewGroup paramViewGroup, String paramString)
  {
    super(paramContext, paramViewGroup);
    b(2130903224);
    ((TextView)c(2131362256)).setText(paramString);
    this.b = paramString;
  }

  protected final String c()
  {
    return "progress:" + this.b;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
