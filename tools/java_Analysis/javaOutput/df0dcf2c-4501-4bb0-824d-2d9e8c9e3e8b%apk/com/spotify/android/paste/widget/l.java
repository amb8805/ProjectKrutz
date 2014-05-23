package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.android.paste.e;

final class l extends LinearLayout
{
  private final int a;
  private final Paint b;
  private final int c;
  private final Paint d;
  private final boolean e;
  private final int f;
  private final Paint g;
  private final float h;
  private int i;
  private float j;
  private k k;
  private final m l;

  l(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    setWillNotDraw(false);
    setId(0);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e.s, paramInt, 0);
    int n = localTypedArray.getColor(0, -16777216);
    int i1 = localTypedArray.getDimensionPixelSize(m, 0);
    int i2 = localTypedArray.getDimensionPixelSize(2, 0);
    int i3 = localTypedArray.getColor(3, -1);
    int i4 = localTypedArray.getColor(4, -16711936);
    int i5 = localTypedArray.getDimensionPixelSize(5, 2);
    localTypedArray.recycle();
    this.f = a(i3, (byte)38);
    this.l = new m((byte)0);
    m localm1 = this.l;
    int[] arrayOfInt1 = new int[m];
    arrayOfInt1[0] = i4;
    localm1.a(arrayOfInt1);
    m localm2 = this.l;
    int[] arrayOfInt2 = new int[m];
    arrayOfInt2[0] = a(i3, 32);
    localm2.b(arrayOfInt2);
    this.a = i1;
    this.b = new Paint();
    this.b.setColor(this.f);
    this.c = i5;
    this.d = new Paint();
    if (!f.a(paramContext));
    while (true)
    {
      this.e = m;
      this.h = 0.5F;
      this.g = new Paint();
      this.g.setStrokeWidth(i2);
      setBackgroundColor(n);
      return;
      m = 0;
    }
  }

  private static int a(int paramInt, byte paramByte)
  {
    return Color.argb(paramByte, Color.red(paramInt), Color.green(paramInt), Color.blue(paramInt));
  }

  final void a(int paramInt, float paramFloat)
  {
    getChildAt(this.i).setSelected(false);
    this.i = paramInt;
    this.j = paramFloat;
    getChildAt(this.i).setSelected(true);
    invalidate();
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    int m = getHeight();
    int n = getChildCount();
    int i1 = (int)(Math.min(Math.max(0.0F, this.h), 1.0F) * m);
    Object localObject;
    int i5;
    label76: int i6;
    int i8;
    label104: int i9;
    int i10;
    int i15;
    label296: int i18;
    label346: int i19;
    int i11;
    if (this.k != null)
    {
      localObject = this.k;
      if (n > 0)
      {
        View localView2 = getChildAt(this.i);
        int i4 = localView2.getLeft();
        if (!this.e)
          break label538;
        i5 = localView2.getPaddingLeft();
        i6 = i4 + i5;
        int i7 = localView2.getRight();
        if (!this.e)
          break label544;
        i8 = localView2.getPaddingRight();
        i9 = i7 - i8;
        i10 = ((k)localObject).a(this.i);
        if ((this.j <= 0.0F) || (this.i >= -1 + getChildCount()))
          break label563;
        int i13 = ((k)localObject).a(1 + this.i);
        if (i10 != i13)
        {
          float f3 = this.j;
          float f4 = 1.0F - f3;
          float f5 = f3 * Color.red(i13) + f4 * Color.red(i10);
          float f6 = f3 * Color.green(i13) + f4 * Color.green(i10);
          float f7 = f3 * Color.blue(i13) + f4 * Color.blue(i10);
          i10 = Color.rgb((int)f5, (int)f6, (int)f7);
        }
        View localView3 = getChildAt(1 + this.i);
        float f1 = this.j;
        int i14 = localView3.getLeft();
        if (!this.e)
          break label550;
        i15 = localView3.getPaddingLeft();
        int i16 = (int)(f1 * i15 + i14 + (1.0F - this.j) * i6);
        float f2 = this.j;
        int i17 = localView3.getRight();
        if (!this.e)
          break label556;
        i18 = localView3.getPaddingRight();
        i19 = (int)(f2 * i17 - i18 + (1.0F - this.j) * i9);
        i11 = i16;
      }
    }
    for (int i12 = i19; ; i12 = i9)
    {
      this.d.setColor(i10);
      paramCanvas.drawRect(i11, m - this.c, i12, m, this.d);
      if (this.a > 0)
        paramCanvas.drawRect(0.0F, m - this.a, getWidth(), m, this.b);
      if (this.g.getStrokeWidth() > 0.0F)
      {
        int i2 = (m - i1) / 2;
        int i3 = 0;
        while (true)
          if (i3 < n - 1)
          {
            View localView1 = getChildAt(i3);
            this.g.setColor(((k)localObject).b(i3));
            paramCanvas.drawLine(localView1.getRight(), i2, localView1.getRight(), i2 + i1, this.g);
            i3++;
            continue;
            localObject = this.l;
            break;
            label538: i5 = 0;
            break label76;
            label544: i8 = 0;
            break label104;
            label550: i15 = 0;
            break label296;
            label556: i18 = 0;
            break label346;
          }
      }
      return;
      label563: i11 = i6;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
