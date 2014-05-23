package com.spotify.mobile.android.ui.page.a;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;

public final class e extends f
{
  public e(Context paramContext, ViewGroup paramViewGroup)
  {
    super(paramContext, paramViewGroup);
    b(2130903223);
    TextView localTextView = (TextView)c(2131362256);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext.getString(2131690138);
    localTextView.setText(String.format("\"%s\"", arrayOfObject));
  }

  protected final String c()
  {
    return "liked";
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
