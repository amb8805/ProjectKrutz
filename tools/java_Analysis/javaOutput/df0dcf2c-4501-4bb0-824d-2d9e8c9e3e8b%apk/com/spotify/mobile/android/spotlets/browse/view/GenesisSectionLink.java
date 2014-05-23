package com.spotify.mobile.android.spotlets.browse.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GenesisSectionLink extends LinearLayout
{
  public GenesisSectionLink(Context paramContext)
  {
    super(paramContext);
  }

  public GenesisSectionLink(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static GenesisSectionLink a(Context paramContext, ViewGroup paramViewGroup)
  {
    return (GenesisSectionLink)LayoutInflater.from(paramContext).inflate(2130903157, paramViewGroup, false);
  }

  public final void a(String paramString, int paramInt, View.OnClickListener paramOnClickListener)
  {
    ((TextView)findViewById(2131362227)).setText(paramString);
    ((ImageView)findViewById(2131362223)).setImageResource(paramInt);
    findViewById(2131362447).setOnClickListener(paramOnClickListener);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.GenesisSectionLink
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
