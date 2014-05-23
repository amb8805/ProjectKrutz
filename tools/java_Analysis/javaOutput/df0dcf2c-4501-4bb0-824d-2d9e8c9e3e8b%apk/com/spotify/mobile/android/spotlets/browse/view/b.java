package com.spotify.mobile.android.spotlets.browse.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.mobile.android.spotlets.browse.b.e;
import com.spotify.mobile.android.ui.view.AspectRatioFrameLayout;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;

public final class b extends LinearLayout
{
  private final com.spotify.mobile.android.spotlets.browse.b.f a = new com.spotify.mobile.android.spotlets.browse.b.f(new e(ClientEvent.SubEvent.R, ViewUri.k, ViewUri.SubView.g));
  private final com.spotify.mobile.android.spotlets.browse.b.a b = new com.spotify.mobile.android.spotlets.browse.b.a(new e(ClientEvent.SubEvent.U, ViewUri.k, ViewUri.SubView.g));

  public b(Context paramContext)
  {
    super(paramContext);
    setOrientation(0);
    setBackgroundResource(2130838194);
  }

  public final GenesisMenuLayoutCell a(Context paramContext, ViewGroup paramViewGroup, int paramInt1, int paramInt2, int paramInt3)
  {
    if (com.spotify.android.paste.widget.f.a(getContext()))
    {
      GenesisMenuLayoutCell localGenesisMenuLayoutCell = GenesisMenuLayoutCell.a(paramContext, paramViewGroup);
      ((AspectRatioFrameLayout)localGenesisMenuLayoutCell.findViewById(2131362281)).a(1.0F);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0F);
      localLayoutParams.setMargins(paramInt1, paramInt2, paramInt3, 0);
      addView(localGenesisMenuLayoutCell, localLayoutParams);
      return localGenesisMenuLayoutCell;
    }
    addView(com.spotify.mobile.android.spotlets.browse.util.a.a(getContext()));
    return null;
  }

  public final GenesisMenuLayoutHeaderCell a(Context paramContext, ViewGroup paramViewGroup, int paramInt)
  {
    if (com.spotify.android.paste.widget.f.a(getContext()))
    {
      GenesisMenuLayoutHeaderCell localGenesisMenuLayoutHeaderCell = GenesisMenuLayoutHeaderCell.a(paramContext, paramViewGroup);
      ((AspectRatioFrameLayout)localGenesisMenuLayoutHeaderCell.findViewById(2131362281)).a(2.5F);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0F);
      localLayoutParams.setMargins(0, paramInt, 0, 0);
      addView(localGenesisMenuLayoutHeaderCell, localLayoutParams);
      return localGenesisMenuLayoutHeaderCell;
    }
    addView(com.spotify.mobile.android.spotlets.browse.util.a.a(getContext()));
    return null;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
