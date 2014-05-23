package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v4.view.at;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;

public class SpotifyIconView extends ImageView
{
  private static final int[] c = { 16843105, 16843106, 16843107, 16843108 };
  private SpotifyIcon a = SpotifyIcon.b;
  private com.spotify.android.paste.graphics.e b;

  public SpotifyIconView(Context paramContext)
  {
    this(paramContext, null);
  }

  public SpotifyIconView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SpotifyIconView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    f.a(SpotifyIconView.class, this);
    TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, com.spotify.android.paste.e.u, paramInt, 0);
    int i = localTypedArray1.getInt(1, -1);
    if (i != -1)
      this.a = SpotifyIcon.values()[i];
    ColorStateList localColorStateList = localTypedArray1.getColorStateList(0);
    localTypedArray1.recycle();
    TypedArray localTypedArray2 = paramContext.obtainStyledAttributes(paramAttributeSet, c, paramInt, 0);
    float f1 = localTypedArray2.getFloat(3, 0.0F);
    float f2 = localTypedArray2.getFloat(1, 0.0F);
    float f3 = localTypedArray2.getFloat(2, 0.0F);
    int j = localTypedArray2.getColor(0, 0);
    localTypedArray2.recycle();
    this.b = new com.spotify.android.paste.graphics.e(getContext(), this.a);
    com.spotify.android.paste.graphics.e locale = this.b;
    if (localColorStateList != null);
    while (true)
    {
      locale.a(localColorStateList);
      setImageDrawable(this.b);
      this.b.a(f1, f2, f3, j);
      return;
      localColorStateList = ColorStateList.valueOf(-1);
    }
  }

  public final void a(int paramInt)
  {
    this.b.a(paramInt);
  }

  public final void a(SpotifyIcon paramSpotifyIcon)
  {
    this.a = paramSpotifyIcon;
    this.b.a(this.a);
    at.b(this);
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    throw new UnsupportedOperationException("Cannot call this method in SpotifyIconView");
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    if (!(paramDrawable instanceof com.spotify.android.paste.graphics.e))
      throw new UnsupportedOperationException("Drawable must be instance of SpotifyIconDrawable");
    super.setImageDrawable(paramDrawable);
  }

  public void setImageResource(int paramInt)
  {
    throw new UnsupportedOperationException("Cannot call this method in SpotifyIconView");
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.SpotifyIconView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
