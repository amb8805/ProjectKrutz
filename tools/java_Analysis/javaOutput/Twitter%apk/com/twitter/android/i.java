package com.twitter.android;

import android.content.Context;
import android.view.View;
import android.widget.TabHost.TabContentFactory;

final class i
  implements TabHost.TabContentFactory
{
  private final Context a;

  public i(Context paramContext)
  {
    this.a = paramContext;
  }

  public final View createTabContent(String paramString)
  {
    View localView = new View(this.a);
    localView.setMinimumWidth(0);
    localView.setMinimumHeight(0);
    return localView;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
