package com.d.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;

final class e extends i
{
  private float g;
  private float h;
  private float i;
  private boolean j = true;

  public e(h[] paramArrayOfh)
  {
    super(paramArrayOfh);
  }

  private e b()
  {
    ArrayList localArrayList = this.e;
    int k = this.e.size();
    h[] arrayOfh = new h[k];
    for (int m = 0; m < k; m++)
      arrayOfh[m] = ((h)((g)localArrayList.get(m)).c());
    return new e(arrayOfh);
  }

  public final Object a(float paramFloat)
  {
    return Float.valueOf(b(paramFloat));
  }

  public final float b(float paramFloat)
  {
    int k = 1;
    if (this.a == 2)
    {
      if (this.j)
      {
        this.j = false;
        this.g = ((h)this.e.get(0)).d;
        this.h = ((h)this.e.get(k)).d;
        this.i = (this.h - this.g);
      }
      if (this.d != null)
        paramFloat = this.d.getInterpolation(paramFloat);
      if (this.f == null)
        return this.g + paramFloat * this.i;
      return ((Number)this.f.a(paramFloat, Float.valueOf(this.g), Float.valueOf(this.h))).floatValue();
    }
    if (paramFloat <= 0.0F)
    {
      h localh4 = (h)this.e.get(0);
      h localh5 = (h)this.e.get(k);
      float f9 = localh4.d;
      float f10 = localh5.d;
      float f11 = localh4.a;
      float f12 = localh5.a;
      Interpolator localInterpolator3 = localh5.b();
      if (localInterpolator3 != null)
        paramFloat = localInterpolator3.getInterpolation(paramFloat);
      float f13 = (paramFloat - f11) / (f12 - f11);
      if (this.f == null)
        return f9 + f13 * (f10 - f9);
      return ((Number)this.f.a(f13, Float.valueOf(f9), Float.valueOf(f10))).floatValue();
    }
    if (paramFloat >= 1.0F)
    {
      h localh2 = (h)this.e.get(-2 + this.a);
      h localh3 = (h)this.e.get(-1 + this.a);
      float f4 = localh2.d;
      float f5 = localh3.d;
      float f6 = localh2.a;
      float f7 = localh3.a;
      Interpolator localInterpolator2 = localh3.b();
      if (localInterpolator2 != null)
        paramFloat = localInterpolator2.getInterpolation(paramFloat);
      float f8 = (paramFloat - f6) / (f7 - f6);
      if (this.f == null)
        return f4 + f8 * (f5 - f4);
      return ((Number)this.f.a(f8, Float.valueOf(f4), Float.valueOf(f5))).floatValue();
    }
    h localh1;
    for (Object localObject = (h)this.e.get(0); k < this.a; localObject = localh1)
    {
      localh1 = (h)this.e.get(k);
      if (paramFloat < localh1.a)
      {
        Interpolator localInterpolator1 = localh1.b();
        if (localInterpolator1 != null)
          paramFloat = localInterpolator1.getInterpolation(paramFloat);
        float f1 = (paramFloat - ((g)localObject).a) / (localh1.a - ((g)localObject).a);
        float f2 = ((h)localObject).d;
        float f3 = localh1.d;
        if (this.f == null)
          return f2 + f1 * (f3 - f2);
        return ((Number)this.f.a(f1, Float.valueOf(f2), Float.valueOf(f3))).floatValue();
      }
      k++;
    }
    return ((Number)((g)this.e.get(-1 + this.a)).a()).floatValue();
  }
}

/* Location:
 * Qualified Name:     com.d.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
