package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.LinearLayout;

public final class i
{
  public static View a(Context paramContext)
  {
    return LayoutInflater.from(paramContext).inflate(2130903165, null, false);
  }

  public static ViewGroup b(Context paramContext)
  {
    return (ViewGroup)LayoutInflater.from(paramContext).inflate(2130903168, null, false);
  }

  public static ViewGroup c(Context paramContext)
  {
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setOrientation(1);
    localLinearLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
    return localLinearLayout;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
