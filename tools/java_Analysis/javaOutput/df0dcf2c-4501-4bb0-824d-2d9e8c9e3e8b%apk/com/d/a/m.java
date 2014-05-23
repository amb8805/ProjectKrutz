package com.d.a;

import android.util.Log;
import com.d.b.a;
import com.d.b.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class m extends l
{
  e h;
  float i;
  private a j;

  public m(c paramc, float[] paramArrayOfFloat)
  {
    super(paramc, (byte)0);
    a(paramArrayOfFloat);
    if ((paramc instanceof a))
      this.j = ((a)this.b);
  }

  public m(String paramString, float[] paramArrayOfFloat)
  {
    super(paramString, (byte)0);
    a(paramArrayOfFloat);
  }

  private m d()
  {
    m localm = (m)super.a();
    localm.h = ((e)localm.e);
    return localm;
  }

  final void a(float paramFloat)
  {
    this.i = this.h.b(paramFloat);
  }

  final void a(Class paramClass)
  {
    if (this.b != null)
      return;
    super.a(paramClass);
  }

  public final void a(float[] paramArrayOfFloat)
  {
    super.a(paramArrayOfFloat);
    this.h = ((e)this.e);
  }

  final void b(Object paramObject)
  {
    if (this.j != null)
      this.j.a(paramObject, this.i);
    do
    {
      return;
      if (this.b != null)
      {
        this.b.a(paramObject, Float.valueOf(this.i));
        return;
      }
    }
    while (this.c == null);
    try
    {
      this.g[0] = Float.valueOf(this.i);
      this.c.invoke(paramObject, this.g);
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Log.e("PropertyValuesHolder", localInvocationTargetException.toString());
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.e("PropertyValuesHolder", localIllegalAccessException.toString());
    }
  }

  final Object c()
  {
    return Float.valueOf(this.i);
  }
}

/* Location:
 * Qualified Name:     com.d.a.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
