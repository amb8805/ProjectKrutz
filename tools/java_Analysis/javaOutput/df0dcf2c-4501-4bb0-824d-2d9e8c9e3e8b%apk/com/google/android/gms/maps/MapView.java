package com.google.android.gms.maps;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class MapView extends FrameLayout
{
  private final b a;

  public MapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = new b(this, paramContext, GoogleMapOptions.a(paramContext, paramAttributeSet));
  }

  public MapView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = new b(this, paramContext, GoogleMapOptions.a(paramContext, paramAttributeSet));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.MapView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
