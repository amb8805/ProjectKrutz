package com.spotify.android.paste.widget.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public final class b
{
  private Drawable a;

  public b(Context paramContext)
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = com.spotify.android.paste.b.g;
    arrayOfInt[1] = 16843050;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(arrayOfInt);
    this.a = localTypedArray.getDrawable(0);
    localTypedArray.recycle();
  }

  public final void a(Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    this.a.setBounds(0, paramInt2 - this.a.getIntrinsicHeight(), paramInt1, paramInt2);
    this.a.draw(paramCanvas);
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.internal.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
