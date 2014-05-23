package com.spotify.mobile.android.ui.cell;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NavigationCell extends LinearLayout
{
  private TextView a;
  private ImageView b;

  public NavigationCell(Context paramContext)
  {
    super(paramContext);
  }

  public NavigationCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public boolean hasFocusable()
  {
    return false;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131362227));
    this.b = ((ImageView)findViewById(2131362223));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.NavigationCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
