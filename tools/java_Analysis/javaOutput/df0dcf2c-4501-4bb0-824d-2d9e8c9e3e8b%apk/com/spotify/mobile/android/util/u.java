package com.spotify.mobile.android.util;

import android.content.res.Resources;
import android.view.View;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.stuff.h;

public final class u
{
  public static View a(View paramView)
  {
    EmptyView localEmptyView = (EmptyView)paramView.findViewById(2131362360);
    h.a(paramView.getContext(), localEmptyView, paramView.getResources().getString(2131689640));
    return localEmptyView;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
