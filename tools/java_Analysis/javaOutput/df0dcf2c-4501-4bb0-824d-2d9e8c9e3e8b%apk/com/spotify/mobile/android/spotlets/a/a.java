package com.spotify.mobile.android.spotlets.a;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.NavigationItem.NavigationGroup;
import com.spotify.mobile.android.ui.fragments.g;
import com.spotify.mobile.android.ui.stuff.i;

public final class a extends m
  implements NavigationItem, g
{
  private EmptyView i;

  public a()
  {
  }

  public final Fragment C()
  {
    return this;
  }

  public final NavigationItem.NavigationGroup D()
  {
    return NavigationItem.NavigationGroup.f;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    ViewGroup localViewGroup = (ViewGroup)paramLayoutInflater.inflate(2130903126, paramViewGroup, false);
    this.i = ((EmptyView)localViewGroup.findViewById(2131362355));
    this.i.a(i.b(i(), SpotifyIcon.D));
    Button localButton = h.b(i(), null);
    localButton.setId(2131362050);
    localButton.setText(2131689493);
    localButton.setSingleLine(true);
    localButton.setOnClickListener(new a.1(this));
    this.i.a(localButton);
    return localViewGroup;
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131689495);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
