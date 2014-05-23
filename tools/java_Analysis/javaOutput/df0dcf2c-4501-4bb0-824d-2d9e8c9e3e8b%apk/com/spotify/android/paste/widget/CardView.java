package com.spotify.android.paste.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.e;

public class CardView extends ViewGroup
{
  private static final int[] a = { 16842914 };
  private ImageView b;
  private TextView c;
  private TextView d;
  private TextView e;
  private int f;
  private float g;
  private boolean h;
  private b i;
  private ViewGroup j;
  private com.spotify.android.paste.widget.internal.a k;
  private int l;
  private Drawable m;

  public CardView(Context paramContext)
  {
    this(paramContext, null);
  }

  public CardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    f.a(CardView.class, this);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e.h, com.spotify.android.paste.b.j, 0);
    Drawable localDrawable1 = localTypedArray.getDrawable(4);
    Drawable localDrawable2 = localTypedArray.getDrawable(1);
    int n = localTypedArray.getColor(9, -7829368);
    int i1 = localTypedArray.getInt(8, 0);
    int i2 = localTypedArray.getResourceId(10, 0);
    int i3 = localTypedArray.getResourceId(11, 0);
    int i4 = localTypedArray.getResourceId(12, 0);
    String str1 = localTypedArray.getString(6);
    String str2 = localTypedArray.getString(7);
    String str3 = localTypedArray.getString(14);
    boolean bool1 = localTypedArray.getBoolean(0, true);
    boolean bool2 = localTypedArray.getBoolean(2, true);
    boolean bool3 = localTypedArray.getBoolean(3, true);
    Drawable localDrawable3 = localTypedArray.getDrawable(5);
    this.f = localTypedArray.getDimensionPixelOffset(13, 0);
    localTypedArray.recycle();
    this.b = new ImageView(paramContext);
    this.c = new TextView(paramContext);
    this.d = new TextView(paramContext);
    this.e = new TextView(paramContext);
    this.c.setText(str1);
    this.d.setText(str2);
    this.e.setText(str3);
    this.c.setDuplicateParentStateEnabled(true);
    this.d.setDuplicateParentStateEnabled(true);
    this.e.setDuplicateParentStateEnabled(true);
    if (localDrawable2 == null)
    {
      setBackgroundColor(-3355444);
      this.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
      this.b.setBackgroundColor(n);
      if (localDrawable3 != null)
        this.b.setImageDrawable(localDrawable3);
      if (i1 != 0)
        break label624;
    }
    label624: for (Object localObject = new c(this, (byte)0); ; localObject = new a(this, (byte)0))
    {
      this.i = ((b)localObject);
      if (i2 != 0)
        g.a(paramContext, this.c, i2);
      if (i3 != 0)
        g.a(paramContext, this.d, i3);
      if (i4 != 0)
        g.a(paramContext, this.e, i4);
      this.c.setMaxLines(2);
      this.d.setMaxLines(1);
      this.e.setMaxLines(1);
      this.c.setEllipsize(TextUtils.TruncateAt.END);
      this.d.setEllipsize(TextUtils.TruncateAt.END);
      this.e.setEllipsize(TextUtils.TruncateAt.END);
      this.j = new LinearLayout(paramContext);
      this.j.setDuplicateParentStateEnabled(true);
      this.j.setClipChildren(false);
      this.k = new com.spotify.android.paste.widget.internal.a(this.j);
      addView(this.b);
      addView(this.c);
      addView(this.d);
      addView(this.e);
      addView(this.j);
      setClickable(bool3);
      setFocusable(bool2);
      setEnabled(bool1);
      setClipChildren(false);
      if (this.m != localDrawable1)
      {
        if (this.m != null)
        {
          this.m.setCallback(null);
          unscheduleDrawable(this.m);
        }
        this.m = localDrawable1;
        if (localDrawable1 != null)
        {
          localDrawable1.setCallback(this);
          if (localDrawable1.isStateful())
            localDrawable1.setState(getDrawableState());
        }
        invalidate();
      }
      return;
      setBackgroundDrawable(localDrawable2);
      break;
    }
  }

  public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = paramInt1 / paramInt4 + (paramInt2 - paramInt3);
    float f2 = f1 - (int)f1;
    if (f2 < 0.2F)
      f1 = 0.2F + (int)f1;
    while (true)
    {
      float f3 = Math.max(f1, 2.2F);
      return paramInt3 + ((int)(paramInt1 / f3) - paramInt4);
      if (f2 > 0.8F)
        f1 = 0.2F + (int)(f1 + 1.0F);
    }
  }

  private static int a(TextView paramTextView, int paramInt)
  {
    Paint.FontMetricsInt localFontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
    return paramInt * (localFontMetricsInt.bottom - localFontMetricsInt.top + localFontMetricsInt.leading);
  }

  protected final int a()
  {
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    if (!TextUtils.isEmpty(this.d.getText()))
    {
      n = 1;
      boolean bool = TextUtils.isEmpty(this.e.getText());
      i1 = 0;
      if (!bool)
        i1 = 1;
      i2 = a(this.c, 2);
      i3 = a(this.d, 1);
      i4 = a(this.e, 1);
      if (n == 0)
        break label108;
    }
    label108: for (int i5 = i2 + i3; ; i5 = i2)
    {
      int i6 = i5 + i3;
      if (i1 != 0)
        i6 += i4;
      return i6 + 2 * this.f;
      n = 0;
      break;
    }
  }

  public final void a(int paramInt)
  {
    this.l = paramInt;
  }

  public final void a(View paramView)
  {
    this.k.a(paramView);
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.c.setText(paramCharSequence);
  }

  public final void a(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.k.c();
      this.l = 0;
    }
    this.b.setImageResource(0);
    a("");
    b("");
    c("");
    b(false);
  }

  public final void b()
  {
    a(false);
  }

  public final void b(CharSequence paramCharSequence)
  {
    this.d.setText(paramCharSequence);
  }

  public final void b(boolean paramBoolean)
  {
    this.h = paramBoolean;
    refreshDrawableState();
  }

  public final ImageView c()
  {
    return this.b;
  }

  public final void c(CharSequence paramCharSequence)
  {
    this.e.setText(paramCharSequence);
  }

  public final View d()
  {
    return this.k.b();
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (this.m != null)
    {
      int n = getRight() - getLeft();
      int i1 = getBottom() - getTop();
      this.m.setBounds(0, 0, n, i1);
      this.m.draw(paramCanvas);
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.m != null) && (this.m.isStateful()))
      this.m.setState(getDrawableState());
  }

  public boolean hasFocusable()
  {
    return false;
  }

  @TargetApi(11)
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    if (this.m != null)
      this.m.jumpToCurrentState();
  }

  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (this.h)
      mergeDrawableStates(arrayOfInt, a);
    return arrayOfInt;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.i.a(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.k.a();
    this.i.a(paramInt1, paramInt2);
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.m);
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.CardView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
