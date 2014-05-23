package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.d.a.b;
import com.d.a.o;
import com.d.a.q;
import com.spotify.mobile.android.ui.m;

public class ConnectIconView extends View
{
  b a = new ConnectIconView.1(this);
  private ConnectIconView.Aspect b = ConnectIconView.Aspect.a;
  private Path c;
  private Path d;
  private Path e;
  private Path f;
  private Path g;
  private Paint h;
  private Paint i;
  private Paint j;
  private Paint k;
  private Paint l;
  private int m = 0;
  private int n = 0;
  private long o;
  private int p;
  private int q;
  private int r;
  private o s;
  private o t;
  private float u;
  private float v;
  private boolean w = false;
  private SparseArray<DashPathEffect> x = new SparseArray();
  private c y;

  public ConnectIconView(Context paramContext)
  {
    super(paramContext);
  }

  public ConnectIconView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public ConnectIconView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = 1.0F;
    if (paramFloat4 < paramFloat1);
    while (true)
    {
      return f1;
      if (paramFloat3 <= paramFloat2)
      {
        if (paramFloat3 < paramFloat1)
          paramFloat3 = paramFloat1;
        if (paramFloat4 > paramFloat2)
          paramFloat4 = paramFloat2;
        f1 -= (paramFloat4 - paramFloat3) / (paramFloat2 - paramFloat1);
      }
    }
  }

  private DashPathEffect a(float paramFloat)
  {
    try
    {
      DashPathEffect localDashPathEffect = new DashPathEffect(new float[] { paramFloat, (this.u - paramFloat) / 2.0F }, paramFloat);
      return localDashPathEffect;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void a(int paramInt)
  {
    try
    {
      this.p = paramInt;
      this.h.setColor(paramInt);
      this.i.setColor(paramInt);
      this.j.setColor(paramInt);
      this.k.setColor(paramInt);
      this.l.setColor(paramInt);
      invalidate();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, m.o);
    this.b = ConnectIconView.Aspect.values()[localTypedArray.getInt(0, ConnectIconView.Aspect.a.ordinal())];
    localTypedArray.recycle();
  }

  private void a(boolean paramBoolean, q paramq, b paramb)
  {
    if (paramBoolean)
      try
      {
        float[] arrayOfFloat2 = new float[2];
        arrayOfFloat2[0] = this.v;
        arrayOfFloat2[1] = 0.0F;
        this.s = o.b(arrayOfFloat2);
        long l2 = ()(500.0F * this.v / this.u);
        this.s.b(l2);
        while (true)
        {
          this.s.a(new ConnectIconView.2(this));
          if (paramq != null)
            this.s.a(paramq);
          if (paramb != null)
            this.s.a(paramb);
          this.s.a();
          return;
          float[] arrayOfFloat1 = new float[2];
          arrayOfFloat1[0] = this.v;
          arrayOfFloat1[1] = this.u;
          this.s = o.b(arrayOfFloat1);
          long l1 = ()(500.0F * (this.u - this.v) / this.u);
          this.s.b(l1);
        }
      }
      finally
      {
      }
  }

  private void b(float paramFloat)
  {
    try
    {
      this.v = paramFloat;
      int i1 = Math.round(paramFloat);
      if (this.x.get(i1) == null)
        this.x.put(i1, a(paramFloat));
      this.l.setPathEffect((PathEffect)this.x.get(i1));
      invalidate();
      return;
    }
    finally
    {
    }
  }

  private void b(ConnectIconView.Aspect paramAspect)
  {
    try
    {
      switch (ConnectIconView.6.a[paramAspect.ordinal()])
      {
      default:
        a(this.r);
        b(0.0F);
      case 1:
        while (true)
        {
          this.o = SystemClock.elapsedRealtime();
          this.b = paramAspect;
          return;
          a(this.r);
          b(this.u);
        }
      case 2:
      }
    }
    finally
    {
    }
    while (true)
    {
      a(this.q);
      b(this.u);
    }
  }

  private void c()
  {
    try
    {
      if (this.s != null)
      {
        this.s.b();
        this.s.d();
        this.s.j();
        this.s = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void c(float paramFloat)
  {
    try
    {
      boolean bool = this.w;
      if (!bool);
      while (true)
      {
        return;
        float f1 = paramFloat - 1.0F;
        float f2 = 1.0F + paramFloat;
        this.i.setAlpha((int)(255.0F * a(0.0F, 1.0F, f1, f2)));
        this.j.setAlpha((int)(255.0F * a(1.0F, 2.0F, f1, f2)));
        this.k.setAlpha((int)(255.0F * a(2.0F, 3.0F, f1, f2)));
        invalidate();
      }
    }
    finally
    {
    }
  }

  private void d()
  {
    try
    {
      if (this.t != null)
      {
        this.t.c();
        this.t.d();
        this.t.j();
        this.t = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final ConnectIconView.Aspect a()
  {
    try
    {
      ConnectIconView.Aspect localAspect = this.b;
      return localAspect;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(int paramInt, b paramb)
  {
    try
    {
      this.t = o.b(new float[] { -2.0F, 5.0F });
      if (paramb != null)
        this.t.a(paramb);
      this.t.a(new ConnectIconView.3(this));
      this.t.b(600L);
      this.t.i();
      this.t.a(paramInt);
      this.t.a();
      return;
    }
    finally
    {
    }
  }

  public final void a(ConnectIconView.Aspect paramAspect)
  {
    int i1 = 1;
    try
    {
      if (!this.w)
      {
        this.b = paramAspect;
        invalidate();
      }
      while (true)
      {
        return;
        if ((paramAspect != ConnectIconView.Aspect.d) || (this.b == ConnectIconView.Aspect.d))
          break;
        c();
        d();
        b(ConnectIconView.Aspect.c);
        a(-1, null);
        if (i1 != 0)
          this.o = SystemClock.elapsedRealtime();
        this.b = paramAspect;
      }
    }
    finally
    {
    }
    while (true)
      switch (ConnectIconView.6.a[this.b.ordinal()])
      {
      case 3:
        switch (ConnectIconView.6.a[paramAspect.ordinal()])
        {
        case 1:
          c();
          d();
          a(false, new ConnectIconView.4(this), null);
          break;
        case 2:
          c();
          d();
          a(this.q);
          a(false, new ConnectIconView.5(this), null);
        }
        break;
      case 1:
        switch (ConnectIconView.6.a[paramAspect.ordinal()])
        {
        case 3:
          c();
          a(true, null, this.a);
          break;
        case 2:
          d();
          a(this.q);
          a(1, this.a);
        }
        break;
      case 2:
        switch (ConnectIconView.6.a[paramAspect.ordinal()])
        {
        case 3:
          c();
          a(this.r);
          a(true, null, this.a);
          break;
        case 1:
          a(this.r);
          if (this.y != null)
            this.y.a(paramAspect);
        case 2:
        }
        break;
      case 4:
        switch (ConnectIconView.6.a[paramAspect.ordinal()])
        {
        case 1:
          d();
          a(this.r);
          if (this.y != null)
            this.y.a(paramAspect);
          break;
        case 3:
          d();
          a(this.r);
          a(true, null, this.a);
          break;
        case 2:
          d();
        }
        break;
      }
    while (true)
    {
      i1 = 0;
      break;
      i1 = 0;
      break;
      i1 = 0;
      break;
      i1 = 0;
      break;
    }
  }

  public final void a(c paramc)
  {
    try
    {
      this.y = paramc;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long b()
  {
    return this.o;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.m != getWidth()) || (this.n != getHeight()));
    for (int i1 = 1; i1 != 0; i1 = 0)
    {
      this.w = false;
      int i2 = getWidth();
      int i3 = getHeight();
      this.m = i2;
      this.n = i3;
      int i4 = Math.min(i2 - getPaddingLeft() - getPaddingRight(), i3 - getPaddingTop() - getPaddingBottom());
      int i5 = (this.n - i4) / 2 + (getPaddingTop() - getPaddingBottom());
      int i6 = (this.m - i4) / 2 + (getPaddingLeft() - getPaddingRight());
      this.q = getResources().getColor(2131296456);
      this.r = getResources().getColor(2131296457);
      this.p = this.r;
      float f1 = i4 / 46.060001F;
      float f2 = 3.0F * f1;
      Path localPath1 = new Path();
      localPath1.moveTo(27.0F, 11.48F);
      localPath1.cubicTo(27.0F, 11.0F, 26.73F, 10.57F, 26.299999F, 10.37F);
      localPath1.cubicTo(25.870001F, 10.17F, 25.360001F, 10.23F, 25.0F, 10.52F);
      localPath1.cubicTo(23.07F, 12.09F, 17.379999F, 16.25F, 14.31F, 16.68F);
      localPath1.cubicTo(14.3F, 16.690001F, 14.28F, 16.690001F, 14.27F, 16.690001F);
      localPath1.cubicTo(13.05F, 16.91F, 9.96F, 17.35F, 9.93F, 17.360001F);
      localPath1.cubicTo(9.33F, 17.450001F, 8.88F, 17.959999F, 8.88F, 18.57F);
      localPath1.lineTo(8.88F, 22.9F);
      localPath1.cubicTo(8.88F, 22.92F, 8.88F, 22.940001F, 8.88F, 22.959999F);
      localPath1.cubicTo(8.88F, 22.98F, 8.88F, 23.0F, 8.88F, 23.02F);
      localPath1.lineTo(8.88F, 27.34F);
      localPath1.cubicTo(8.88F, 27.950001F, 9.33F, 28.469999F, 9.93F, 28.559999F);
      localPath1.cubicTo(9.96F, 28.559999F, 13.05F, 29.01F, 14.27F, 29.23F);
      localPath1.cubicTo(14.28F, 29.23F, 14.3F, 29.23F, 14.31F, 29.23F);
      localPath1.cubicTo(17.379999F, 29.66F, 23.059999F, 33.82F, 25.0F, 35.389999F);
      localPath1.cubicTo(25.219999F, 35.57F, 25.5F, 35.669998F, 25.77F, 35.669998F);
      localPath1.cubicTo(25.950001F, 35.669998F, 26.129999F, 35.630001F, 26.299999F, 35.549999F);
      localPath1.cubicTo(26.73F, 35.349998F, 27.0F, 34.91F, 27.0F, 34.439999F);
      localPath1.lineTo(27.0F, 23.02F);
      localPath1.cubicTo(27.0F, 23.0F, 27.0F, 22.98F, 27.0F, 22.959999F);
      localPath1.cubicTo(27.0F, 22.940001F, 27.0F, 22.92F, 27.0F, 22.9F);
      localPath1.lineTo(27.0F, 11.48F);
      localPath1.close();
      this.c = localPath1;
      Path localPath2 = new Path();
      localPath2.moveTo(30.370001F, 18.780001F);
      localPath2.cubicTo(31.09F, 20.02F, 31.51F, 21.469999F, 31.51F, 23.01F);
      localPath2.cubicTo(31.51F, 24.530001F, 31.1F, 25.959999F, 30.4F, 27.190001F);
      this.d = localPath2;
      Path localPath3 = new Path();
      localPath3.moveTo(34.98F, 15.33F);
      localPath3.cubicTo(36.419998F, 17.540001F, 37.25F, 20.18F, 37.25F, 23.01F);
      localPath3.cubicTo(37.25F, 25.799999F, 36.439999F, 28.41F, 35.040001F, 30.610001F);
      this.e = localPath3;
      Path localPath4 = new Path();
      localPath4.moveTo(39.580002F, 11.88F);
      localPath4.cubicTo(41.73F, 15.06F, 42.990002F, 18.889999F, 42.990002F, 23.01F);
      localPath4.cubicTo(42.990002F, 27.08F, 41.77F, 30.860001F, 39.66F, 34.009998F);
      this.f = localPath4;
      Path localPath5 = new Path();
      localPath5.moveTo(36.41F, 37.779999F);
      localPath5.cubicTo(32.869999F, 40.970001F, 28.18F, 42.91F, 23.030001F, 42.91F);
      localPath5.cubicTo(12.0F, 42.91F, 3.07F, 34.0F, 3.07F, 23.01F);
      localPath5.cubicTo(3.07F, 12.02F, 12.0F, 3.11F, 23.030001F, 3.11F);
      localPath5.cubicTo(28.15F, 3.11F, 32.830002F, 5.04F, 36.369999F, 8.2F);
      this.g = localPath5;
      Matrix localMatrix = new Matrix();
      localMatrix.setScale(f1, f1);
      localMatrix.postTranslate(i6, i5);
      this.c.transform(localMatrix);
      this.d.transform(localMatrix);
      this.e.transform(localMatrix);
      this.f.transform(localMatrix);
      this.g.transform(localMatrix);
      Paint localPaint1 = new Paint(1);
      localPaint1.setStyle(Paint.Style.FILL);
      localPaint1.setColor(this.p);
      this.h = localPaint1;
      Paint localPaint2 = new Paint(1);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint2.setStrokeWidth(f2);
      localPaint2.setColor(this.p);
      localPaint2.setStrokeCap(Paint.Cap.ROUND);
      localPaint2.setStrokeJoin(Paint.Join.ROUND);
      localPaint2.setAlpha(255);
      this.i = localPaint2;
      Paint localPaint3 = new Paint(1);
      localPaint3.setStyle(Paint.Style.STROKE);
      localPaint3.setStrokeWidth(f2);
      localPaint3.setColor(this.p);
      localPaint3.setStrokeCap(Paint.Cap.ROUND);
      localPaint3.setStrokeJoin(Paint.Join.ROUND);
      localPaint3.setAlpha(255);
      this.j = localPaint3;
      Paint localPaint4 = new Paint(1);
      localPaint4.setStyle(Paint.Style.STROKE);
      localPaint4.setStrokeWidth(f2);
      localPaint4.setColor(this.p);
      localPaint4.setStrokeCap(Paint.Cap.ROUND);
      localPaint4.setStrokeJoin(Paint.Join.ROUND);
      localPaint4.setAlpha(255);
      this.k = localPaint4;
      Paint localPaint5 = new Paint(1);
      localPaint5.setStyle(Paint.Style.STROKE);
      localPaint5.setStrokeWidth(f2);
      localPaint5.setColor(this.p);
      localPaint5.setStrokeCap(Paint.Cap.ROUND);
      localPaint5.setStrokeJoin(Paint.Join.ROUND);
      localPaint5.setPathEffect(a(0.0F));
      this.l = localPaint5;
      PathMeasure localPathMeasure = new PathMeasure(this.g, false);
      this.v = 0.0F;
      this.u = localPathMeasure.getLength();
      this.l.setPathEffect(null);
      this.i.setAlpha(255);
      this.j.setAlpha(255);
      this.k.setAlpha(255);
      this.x.put(0, a(0.0F));
      b(this.b);
      this.w = true;
      return;
    }
    paramCanvas.drawPath(this.c, this.h);
    paramCanvas.drawPath(this.d, this.i);
    paramCanvas.drawPath(this.e, this.j);
    paramCanvas.drawPath(this.f, this.k);
    paramCanvas.drawPath(this.g, this.l);
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    try
    {
      ConnectIconView.SavedState localSavedState = (ConnectIconView.SavedState)paramParcelable;
      super.onRestoreInstanceState(localSavedState.getSuperState());
      this.b = localSavedState.a;
      this.o = localSavedState.b;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    try
    {
      ConnectIconView.SavedState localSavedState = new ConnectIconView.SavedState(super.onSaveInstanceState(), this.b, this.o);
      return localSavedState;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.ConnectIconView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
