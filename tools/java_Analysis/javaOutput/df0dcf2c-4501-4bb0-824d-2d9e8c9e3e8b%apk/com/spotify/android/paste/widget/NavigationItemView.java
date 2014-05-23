package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.android.paste.b;
import com.spotify.android.paste.graphics.SpotifyIcon;

public class NavigationItemView extends LinearLayout
{
  private static final int[] d = { 16842914 };
  private TextView a;
  private boolean b;
  private com.spotify.android.paste.graphics.e c;

  public NavigationItemView(Context paramContext)
  {
    this(paramContext, null);
  }

  public NavigationItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.q);
  }

  public NavigationItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    f.a(NavigationItemView.class, this);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, com.spotify.android.paste.e.q, paramInt, 0);
    Drawable localDrawable = localTypedArray.getDrawable(0);
    int i = localTypedArray.getDimensionPixelSize(1, 0);
    int j = localTypedArray.getDimensionPixelOffset(5, 0);
    int k = localTypedArray.getDimensionPixelSize(2, 0);
    int m = localTypedArray.getDimensionPixelSize(3, -1);
    ColorStateList localColorStateList = localTypedArray.getColorStateList(4);
    int n = localTypedArray.getResourceId(6, 0);
    localTypedArray.recycle();
    setGravity(16);
    g.a(this, localDrawable);
    setMinimumHeight(i);
    setPadding(j, 0, j, 0);
    this.a = new TextView(paramContext);
    g.a(paramContext, this.a, n);
    this.a.setCompoundDrawablePadding(k);
    this.a.setDuplicateParentStateEnabled(true);
    this.a.setGravity(17);
    this.a.setSingleLine();
    this.a.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    addView(this.a);
    if (m < 0);
    for (this.c = new com.spotify.android.paste.graphics.e(paramContext, SpotifyIcon.b); ; this.c = new com.spotify.android.paste.graphics.e(paramContext, SpotifyIcon.b, m))
    {
      this.c.a(localColorStateList);
      return;
    }
  }

  public final void a()
  {
    a(null);
    a(null);
    a(false);
  }

  public final void a(SpotifyIcon paramSpotifyIcon)
  {
    if (paramSpotifyIcon == null)
    {
      this.a.setCompoundDrawables(null, null, null, null);
      return;
    }
    this.c.a(paramSpotifyIcon);
    this.a.setCompoundDrawablesWithIntrinsicBounds(this.c, null, null, null);
  }

  public final void a(String paramString)
  {
    this.a.setText(paramString);
  }

  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
    refreshDrawableState();
  }

  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (this.b)
      mergeDrawableStates(arrayOfInt, d);
    return arrayOfInt;
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.NavigationItemView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
