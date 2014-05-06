package com.twitter.android.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.view.View;
import android.view.View.MeasureSpec;
import be;
import com.twitter.android.fq;
import com.twitter.android.provider.ax;
import cr;
import dl;
import java.util.ArrayList;
import java.util.Iterator;

public class TweetView extends View
{
  private static final int[] a = { 2130771990 };
  private static Drawable b;
  private static Drawable c;
  private static final TextPaint l = new TextPaint(1);
  private final int A;
  private final int B;
  private final int C;
  private final int D;
  private final int E;
  private final int F;
  private final int G;
  private Drawable H;
  private Drawable I;
  private Drawable J;
  private Drawable K;
  private Drawable L;
  private String M;
  private boolean N;
  private boolean O;
  private long P;
  private ax d;
  private c e;
  private StaticLayout f;
  private StaticLayout g;
  private StaticLayout h;
  private StaticLayout i;
  private StaticLayout j;
  private StaticLayout k;
  private final ColorStateList m;
  private float n;
  private int o;
  private String p;
  private float q;
  private final ColorStateList r;
  private int s;
  private String t;
  private final float u;
  private final int v;
  private final int w;
  private final int x;
  private final int y;
  private final int z;

  public TweetView(Context paramContext)
  {
    this(paramContext, null);
  }

  public TweetView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130771978);
  }

  public TweetView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, fq.TweetView, paramInt, 0);
    this.m = localTypedArray.getColorStateList(3);
    this.n = localTypedArray.getDimension(2, 14.0F);
    this.u = localTypedArray.getFloat(0, 1.0F);
    this.v = localTypedArray.getDimensionPixelSize(1, 0);
    this.q = localTypedArray.getDimension(4, 12.0F);
    this.r = localTypedArray.getColorStateList(5);
    this.G = localTypedArray.getDimensionPixelOffset(18, 0);
    this.w = localTypedArray.getDimensionPixelSize(6, 4);
    if (b == null)
    {
      Drawable localDrawable2 = localTypedArray.getDrawable(7);
      localDrawable2.setBounds(0, 0, localDrawable2.getIntrinsicWidth(), localDrawable2.getIntrinsicHeight());
      b = localDrawable2;
    }
    if (c == null)
    {
      Drawable localDrawable1 = localTypedArray.getDrawable(8);
      localDrawable1.setBounds(0, 0, localDrawable1.getIntrinsicWidth(), localDrawable1.getIntrinsicHeight());
      c = localDrawable1;
    }
    this.x = localTypedArray.getResourceId(9, 0);
    this.y = localTypedArray.getResourceId(10, 0);
    this.z = localTypedArray.getResourceId(11, 0);
    this.A = localTypedArray.getResourceId(12, 0);
    this.B = localTypedArray.getResourceId(13, 0);
    this.C = localTypedArray.getResourceId(14, 0);
    this.D = localTypedArray.getResourceId(15, 0);
    this.E = localTypedArray.getResourceId(16, 0);
    this.F = localTypedArray.getResourceId(17, 0);
    c();
    localTypedArray.recycle();
  }

  private static int a(String paramString, TextPaint paramTextPaint)
  {
    return (int)FloatMath.ceil(Layout.getDesiredWidth(paramString, paramTextPaint));
  }

  private static Drawable a(Resources paramResources, int paramInt)
  {
    Drawable localDrawable = paramResources.getDrawable(paramInt);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    return localDrawable;
  }

  private void c()
  {
    int[] arrayOfInt = getDrawableState();
    if (this.m != null)
      this.o = this.m.getColorForState(arrayOfInt, 0);
    if (this.r != null)
      this.s = this.r.getColorForState(arrayOfInt, 0);
    Drawable localDrawable1 = this.L;
    if ((localDrawable1 != null) && (localDrawable1.isStateful()))
      localDrawable1.setState(arrayOfInt);
    Drawable localDrawable2 = this.I;
    if ((localDrawable2 != null) && (localDrawable2.isStateful()))
      localDrawable2.setState(arrayOfInt);
  }

  public final ax a()
  {
    return this.d;
  }

  public final void a(float paramFloat)
  {
    DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
    this.n = (paramFloat * localDisplayMetrics.scaledDensity);
    this.q = ((paramFloat - 2.0F) * localDisplayMetrics.scaledDensity);
  }

  public final void a(ax paramax)
  {
    if (this.e == null)
      throw new IllegalArgumentException("You must call setProvider before calling setTweet");
    Context localContext = getContext();
    Resources localResources;
    long l1;
    boolean bool1;
    if (!paramax.equals(this.d))
    {
      this.h = null;
      this.g = null;
      this.f = null;
      this.i = null;
      this.j = null;
      this.L = null;
      this.k = null;
      this.d = paramax;
      this.H = null;
      localResources = localContext.getResources();
      l1 = this.P;
      bool1 = paramax.a(l1);
      if (paramax.h > 0L)
        break label296;
      this.t = null;
      if ((l1 == paramax.q) || (!paramax.r))
        break label312;
      this.I = a(localResources, this.x);
      label140: if ((!bool1) || (!paramax.l))
        break label320;
      this.J = a(localResources, this.y);
    }
    be localbe;
    boolean bool2;
    while (true)
    {
      localbe = this.e.b(paramax);
      if ((localbe != null) && (localbe.a != null))
        break label370;
      this.p = paramax.d;
      if (this.N)
      {
        if ((localbe == null) || (!localbe.a(l1)))
          break label515;
        bool2 = true;
        label222: this.O = bool2;
        refreshDrawableState();
      }
      if (!paramax.y)
        break label521;
      this.M = localResources.getString(2131427528);
      this.K = localResources.getDrawable(this.B);
      label262: if ((localbe == null) || (!localbe.b()))
        break label584;
      this.L = a(localResources, this.E);
      label287: requestLayout();
      b();
      return;
      label296: this.t = cr.a(localResources, paramax.h, true);
      break;
      label312: this.I = null;
      break label140;
      label320: if (bool1)
        this.J = a(localResources, this.z);
      else if (paramax.l)
        this.J = a(localResources, this.A);
      else
        this.J = null;
    }
    label370: StringBuilder localStringBuilder = new StringBuilder(paramax.d);
    Iterator localIterator = localbe.a.iterator();
    int i1 = 0;
    label396: int i2;
    int i3;
    String str;
    if (localIterator.hasNext())
    {
      dl localdl = (dl)localIterator.next();
      i2 = localdl.a - i1;
      i3 = localdl.b - i1;
      if ((i2 < 0) || (i3 > localStringBuilder.length()))
        break label630;
      str = localdl.e;
      if (TextUtils.isEmpty(str))
        break label630;
      localStringBuilder.replace(i2, i3, str);
    }
    label515: label521: label584: label630: for (int i4 = i1 + (i3 - (i2 + str.length())); ; i4 = i1)
    {
      i1 = i4;
      break label396;
      this.p = localStringBuilder.toString();
      break;
      bool2 = false;
      break label222;
      if (ax.a(localbe))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = paramax.g;
        this.M = localResources.getString(2131427529, arrayOfObject);
        this.K = localResources.getDrawable(this.C);
        break label262;
      }
      this.M = null;
      this.K = null;
      break label262;
      if (paramax.j > 0L)
      {
        this.L = a(localResources, this.F);
        break label287;
      }
      if (!paramax.c())
        break label287;
      this.L = a(localResources, this.D);
      break label287;
    }
  }

  public final void a(c paramc)
  {
    this.e = paramc;
    this.P = paramc.e();
  }

  public final void a(boolean paramBoolean)
  {
    this.N = paramBoolean;
  }

  public final void b()
  {
    ax localax = this.d;
    if ((localax == null) || (this.H != null))
      return;
    Context localContext = getContext();
    if (localax.k != null);
    for (Bitmap localBitmap = this.e.a(localax); ; localBitmap = null)
    {
      BitmapDrawable localBitmapDrawable1;
      if (localBitmap != null)
      {
        localBitmapDrawable1 = new BitmapDrawable(localContext.getResources(), localBitmap);
        localBitmapDrawable1.setBounds(0, 0, localBitmapDrawable1.getIntrinsicWidth(), localBitmapDrawable1.getIntrinsicHeight());
      }
      for (BitmapDrawable localBitmapDrawable2 = localBitmapDrawable1; ; localBitmapDrawable2 = null)
      {
        this.H = localBitmapDrawable2;
        invalidate();
        return;
      }
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    c();
  }

  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (this.O)
      mergeDrawableStates(arrayOfInt, a);
    return arrayOfInt;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.d == null)
      return;
    int i1 = getWidth();
    int i2 = getScrollX();
    int i3 = getScrollY() + getPaddingTop();
    int i4 = i2 + getPaddingLeft();
    int i5 = i2 + i1 - getPaddingRight();
    Drawable localDrawable1 = c;
    int i6 = localDrawable1.getIntrinsicWidth();
    paramCanvas.save();
    paramCanvas.translate(i4, i3 + this.G);
    Drawable localDrawable2;
    label96: int i7;
    int i8;
    label173: TextPaint localTextPaint;
    float f1;
    int i9;
    float f2;
    if (this.H == null)
    {
      localDrawable2 = b;
      localDrawable2.draw(paramCanvas);
      localDrawable1.draw(paramCanvas);
      paramCanvas.restore();
      i7 = i4 + (i6 + getPaddingLeft());
      if (this.J == null)
        break label761;
      int i13 = this.J.getIntrinsicWidth();
      paramCanvas.save();
      paramCanvas.translate(i1 - i13, 0.0F);
      this.J.draw(paramCanvas);
      paramCanvas.restore();
      i8 = i13 / 2;
      localTextPaint = l;
      f1 = this.n;
      StaticLayout localStaticLayout1 = this.g;
      if (localStaticLayout1 == null)
        break label767;
      paramCanvas.save();
      paramCanvas.translate(i7, i3);
      localTextPaint.setTextSize(f1);
      localTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
      localTextPaint.setColor(this.o);
      localStaticLayout1.draw(paramCanvas);
      paramCanvas.restore();
      float f3 = localStaticLayout1.getHeight();
      i9 = localStaticLayout1.getWidth();
      f2 = f3;
    }
    while (true)
    {
      localTextPaint.setTypeface(Typeface.DEFAULT);
      if (this.f != null)
      {
        paramCanvas.save();
        paramCanvas.translate(i9 + i7 + this.w, i3 + this.G);
        localTextPaint.setTextSize(this.q);
        localTextPaint.setColor(this.s);
        this.f.draw(paramCanvas);
        paramCanvas.restore();
      }
      StaticLayout localStaticLayout2 = this.i;
      if (localStaticLayout2 != null)
      {
        paramCanvas.save();
        paramCanvas.translate(i5 - i8 - localStaticLayout2.getWidth(), i3 + this.G);
        localTextPaint.setTextSize(this.q);
        localTextPaint.setColor(this.s);
        localStaticLayout2.draw(paramCanvas);
        Drawable localDrawable3 = this.L;
        if (localDrawable3 != null)
        {
          paramCanvas.translate(-(this.w + localDrawable3.getIntrinsicWidth()), (localStaticLayout2.getHeight() - localDrawable3.getIntrinsicHeight()) / 2);
          localDrawable3.draw(paramCanvas);
        }
        paramCanvas.restore();
      }
      int i10 = (int)(f2 + i3);
      if (this.h != null)
      {
        paramCanvas.save();
        paramCanvas.translate(i7, i10);
        localTextPaint.setTextSize(f1);
        localTextPaint.setColor(this.o);
        this.h.draw(paramCanvas);
        paramCanvas.restore();
        i10 += this.h.getHeight();
      }
      if (this.K != null)
      {
        paramCanvas.save();
        paramCanvas.translate(i7, i10);
        this.K.draw(paramCanvas);
        Rect localRect2 = this.K.getBounds();
        paramCanvas.translate(localRect2.width() + this.w, (localRect2.height() - this.k.getHeight()) / 2);
        localTextPaint.setTextSize(this.q);
        localTextPaint.setColor(this.s);
        this.k.draw(paramCanvas);
        localTextPaint.clearShadowLayer();
        paramCanvas.restore();
        i10 += localRect2.height();
      }
      if (this.j == null)
        break;
      paramCanvas.save();
      int i11 = this.j.getHeight();
      Rect localRect1 = this.I.getBounds();
      int i12 = (i11 - localRect1.height()) / 2;
      paramCanvas.translate(i7, i10 + i12);
      this.I.draw(paramCanvas);
      paramCanvas.translate(localRect1.width() + this.w, -i12);
      localTextPaint.setTextSize(this.q);
      localTextPaint.setColor(this.s);
      this.j.draw(paramCanvas);
      paramCanvas.restore();
      return;
      localDrawable2 = this.H;
      break label96;
      label761: i8 = 0;
      break label173;
      label767: f2 = f1;
      i9 = 0;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    int i6;
    if (i1 == 1073741824)
      i6 = i2;
    while (true)
    {
      ax localax = this.d;
      int i7 = 0;
      TextPaint localTextPaint;
      int i12;
      int i13;
      if (localax != null)
      {
        int i10 = i6 - getPaddingLeft() - getPaddingRight();
        localTextPaint = l;
        Drawable localDrawable = c;
        int i11 = localDrawable.getIntrinsicWidth();
        i12 = getPaddingTop() + localDrawable.getIntrinsicHeight() + getPaddingBottom();
        i13 = i10 - (i11 + getPaddingLeft());
        if ((this.i != null) || (this.t == null))
          break label871;
        localTextPaint.setTextSize(this.q);
        localTextPaint.setTypeface(Typeface.DEFAULT);
        this.i = new StaticLayout(this.t, localTextPaint, a(this.t, localTextPaint), Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
      }
      label356: int i5;
      label536: label582: label738: label871: for (int i14 = i13 - (this.i.getWidth() + this.w); ; i14 = i13)
      {
        if (this.L != null);
        for (int i15 = i14 - (this.L.getIntrinsicWidth() + this.w); ; i15 = i14)
        {
          String str4;
          if (this.g == null)
          {
            localTextPaint.setTextSize(this.n);
            localTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
            String str3 = localax.a();
            if (str3 != null)
            {
              this.g = new StaticLayout(str3, 0, str3.length(), localTextPaint, a(str3, localTextPaint), Layout.Alignment.ALIGN_NORMAL, this.u, this.v, false, TextUtils.TruncateAt.END, i15);
              i15 -= this.g.getWidth() + this.w;
            }
            if ((this.f == null) && (i15 > 0))
            {
              localTextPaint.setTextSize(this.q);
              localTextPaint.setTypeface(Typeface.DEFAULT);
              if (localax.p != null)
                break label582;
              str4 = "";
              this.f = new StaticLayout(str4, 0, str4.length(), localTextPaint, a(str4, localTextPaint), Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false, TextUtils.TruncateAt.END, i15);
            }
          }
          if ((this.h == null) && (this.p != null))
          {
            localTextPaint.setTextSize(this.n);
            localTextPaint.setTypeface(Typeface.DEFAULT);
            this.h = new StaticLayout(this.p, localTextPaint, i13, Layout.Alignment.ALIGN_NORMAL, this.u, this.v, false);
          }
          int i9;
          if (this.K != null)
          {
            localTextPaint.setTextSize(this.q);
            String str2 = this.M;
            this.k = new StaticLayout(str2, localTextPaint, a(str2, localTextPaint), Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
            this.K.setBounds(0, 0, this.K.getIntrinsicWidth(), this.K.getIntrinsicHeight());
            i7 = i12;
            if (i3 != 1073741824)
              break label738;
            i9 = i4;
          }
          while (true)
          {
            setMeasuredDimension(i6, i9);
            return;
            i5 = getSuggestedMinimumWidth();
            if (i1 != -2147483648)
              break label878;
            i6 = Math.min(i5, i2);
            break;
            str4 = "@" + localax.p;
            break label356;
            Resources localResources = getContext().getResources();
            if ((this.I != null) && (this.j == null) && (this.P != localax.q))
            {
              Object[] arrayOfObject = new Object[1];
              arrayOfObject[0] = localax.b();
              String str1 = localResources.getString(2131427385, arrayOfObject);
              localTextPaint.setTextSize(this.q);
              localTextPaint.setTypeface(Typeface.DEFAULT);
              this.j = new StaticLayout(str1, 0, str1.length(), localTextPaint, a(str1, localTextPaint), Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false, TextUtils.TruncateAt.END, i13);
            }
            i7 = i12;
            break label536;
            int i8 = getPaddingTop() + getPaddingBottom();
            if (this.g != null)
              i8 += this.g.getHeight();
            if (this.h != null)
              i8 += this.h.getHeight();
            if (this.K != null)
              i8 += this.K.getBounds().height();
            if (this.j != null)
              i8 += this.j.getHeight();
            i9 = Math.max(i7, Math.max(i8, getSuggestedMinimumHeight()));
            if (i3 == -2147483648)
              i9 = Math.min(i4, i9);
          }
        }
      }
      label878: i6 = i5;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.TweetView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
