package com.d.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

class i
{
  int a;
  g b;
  g c;
  Interpolator d;
  ArrayList<g> e;
  n f;

  public i(g[] paramArrayOfg)
  {
    this.a = paramArrayOfg.length;
    this.e = new ArrayList();
    this.e.addAll(Arrays.asList(paramArrayOfg));
    this.b = ((g)this.e.get(0));
    this.c = ((g)this.e.get(-1 + this.a));
    this.d = this.c.b();
  }

  public i a()
  {
    ArrayList localArrayList = this.e;
    int i = this.e.size();
    g[] arrayOfg = new g[i];
    for (int j = 0; j < i; j++)
      arrayOfg[j] = ((g)localArrayList.get(j)).c();
    return new i(arrayOfg);
  }

  public Object a(float paramFloat)
  {
    if (this.a == 2)
    {
      if (this.d != null)
        paramFloat = this.d.getInterpolation(paramFloat);
      return this.f.a(paramFloat, this.b.a(), this.c.a());
    }
    if (paramFloat <= 0.0F)
    {
      g localg3 = (g)this.e.get(1);
      Interpolator localInterpolator3 = localg3.b();
      if (localInterpolator3 != null)
        paramFloat = localInterpolator3.getInterpolation(paramFloat);
      float f5 = this.b.a;
      float f6 = (paramFloat - f5) / (localg3.a - f5);
      return this.f.a(f6, this.b.a(), localg3.a());
    }
    if (paramFloat >= 1.0F)
    {
      g localg2 = (g)this.e.get(-2 + this.a);
      Interpolator localInterpolator2 = this.c.b();
      if (localInterpolator2 != null)
        paramFloat = localInterpolator2.getInterpolation(paramFloat);
      float f3 = localg2.a;
      float f4 = (paramFloat - f3) / (this.c.a - f3);
      return this.f.a(f4, localg2.a(), this.c.a());
    }
    Object localObject = this.b;
    int i = 1;
    while (i < this.a)
    {
      g localg1 = (g)this.e.get(i);
      if (paramFloat < localg1.a)
      {
        Interpolator localInterpolator1 = localg1.b();
        if (localInterpolator1 != null)
          paramFloat = localInterpolator1.getInterpolation(paramFloat);
        float f1 = ((g)localObject).a;
        float f2 = (paramFloat - f1) / (localg1.a - f1);
        return this.f.a(f2, ((g)localObject).a(), localg1.a());
      }
      i++;
      localObject = localg1;
    }
    return this.c.a();
  }

  public String toString()
  {
    Object localObject = " ";
    int i = 0;
    while (i < this.a)
    {
      String str = (String)localObject + ((g)this.e.get(i)).a() + "  ";
      i++;
      localObject = str;
    }
    return localObject;
  }
}

/* Location:
 * Qualified Name:     com.d.a.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
