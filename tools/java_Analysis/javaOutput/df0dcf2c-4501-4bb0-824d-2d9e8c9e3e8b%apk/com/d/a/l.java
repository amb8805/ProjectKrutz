package com.d.a;

import android.util.Log;
import com.d.b.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class l
  implements Cloneable
{
  private static final n i = new f();
  private static final n j = new d();
  private static Class[] k;
  private static Class[] l;
  private static Class[] m = arrayOfClass3;
  private static final HashMap<Class, HashMap<String, Method>> n = new HashMap();
  private static final HashMap<Class, HashMap<String, Method>> o = new HashMap();
  String a;
  protected c b;
  Method c = null;
  Class d;
  i e = null;
  final ReentrantReadWriteLock f = new ReentrantReadWriteLock();
  final Object[] g = new Object[1];
  private Method h = null;
  private n p;
  private Object q;

  static
  {
    Class[] arrayOfClass1 = new Class[6];
    arrayOfClass1[0] = Float.TYPE;
    arrayOfClass1[1] = Float.class;
    arrayOfClass1[2] = Double.TYPE;
    arrayOfClass1[3] = Integer.TYPE;
    arrayOfClass1[4] = Double.class;
    arrayOfClass1[5] = Integer.class;
    k = arrayOfClass1;
    Class[] arrayOfClass2 = new Class[6];
    arrayOfClass2[0] = Integer.TYPE;
    arrayOfClass2[1] = Integer.class;
    arrayOfClass2[2] = Float.TYPE;
    arrayOfClass2[3] = Double.TYPE;
    arrayOfClass2[4] = Float.class;
    arrayOfClass2[5] = Double.class;
    l = arrayOfClass2;
    Class[] arrayOfClass3 = new Class[6];
    arrayOfClass3[0] = Double.TYPE;
    arrayOfClass3[1] = Double.class;
    arrayOfClass3[2] = Float.TYPE;
    arrayOfClass3[3] = Integer.TYPE;
    arrayOfClass3[4] = Float.class;
    arrayOfClass3[5] = Integer.class;
  }

  private l(c paramc)
  {
    this.b = paramc;
    if (paramc != null)
      this.a = paramc.a();
  }

  private l(String paramString)
  {
    this.a = paramString;
  }

  public static l a(c<?, Float> paramc, float[] paramArrayOfFloat)
  {
    return new m(paramc, paramArrayOfFloat);
  }

  public static l a(String paramString, float[] paramArrayOfFloat)
  {
    return new m(paramString, paramArrayOfFloat);
  }

  private Method a(Class paramClass1, String paramString, Class paramClass2)
  {
    localMethod1 = null;
    str1 = this.a;
    if ((str1 == null) || (str1.length() == 0))
      while (true)
        if (paramClass2 == null)
          try
          {
            Method localMethod4 = paramClass1.getMethod(paramString, null);
            return localMethod4;
            char c1 = Character.toUpperCase(str1.charAt(0));
            String str2 = str1.substring(1);
            paramString = paramString + c1 + str2;
          }
          catch (NoSuchMethodException localNoSuchMethodException3)
          {
            try
            {
              Method localMethod3 = paramClass1.getDeclaredMethod(paramString, null);
              localMethod2 = localMethod3;
              try
              {
                localMethod2.setAccessible(true);
                return localMethod2;
              }
              catch (NoSuchMethodException localNoSuchMethodException5)
              {
              }
              Log.e("PropertyValuesHolder", "Couldn't find no-arg method for property " + this.a + ": " + localNoSuchMethodException3);
              return localMethod2;
              Class[] arrayOfClass1 = new Class[1];
              Class[] arrayOfClass2;
              int i1;
              int i2;
              if (this.d.equals(Float.class))
              {
                arrayOfClass2 = k;
                i1 = arrayOfClass2.length;
                i2 = 0;
              }
              Class localClass;
              while (true)
                while (true)
                {
                  if (i2 >= i1)
                    break label307;
                  localClass = arrayOfClass2[i2];
                  arrayOfClass1[0] = localClass;
                  try
                  {
                    localMethod1 = paramClass1.getMethod(paramString, arrayOfClass1);
                    this.d = localClass;
                    return localMethod1;
                    if (this.d.equals(Integer.class))
                    {
                      arrayOfClass2 = l;
                      break;
                    }
                    if (this.d.equals(Double.class))
                    {
                      arrayOfClass2 = m;
                      break;
                    }
                    arrayOfClass2 = new Class[1];
                    arrayOfClass2[0] = this.d;
                  }
                  catch (NoSuchMethodException localNoSuchMethodException1)
                  {
                    try
                    {
                      localMethod1 = paramClass1.getDeclaredMethod(paramString, arrayOfClass1);
                      localMethod1.setAccessible(true);
                      this.d = localClass;
                      return localMethod1;
                    }
                    catch (NoSuchMethodException localNoSuchMethodException2)
                    {
                      i2++;
                    }
                  }
                }
              Log.e("PropertyValuesHolder", "Couldn't find setter/getter for property " + this.a + " with value type " + this.d);
              return localMethod1;
            }
            catch (NoSuchMethodException localNoSuchMethodException4)
            {
              while (true)
                Method localMethod2 = null;
            }
          }
  }

  private Method a(Class paramClass1, HashMap<Class, HashMap<String, Method>> paramHashMap, String paramString, Class paramClass2)
  {
    try
    {
      this.f.writeLock().lock();
      HashMap localHashMap = (HashMap)paramHashMap.get(paramClass1);
      Method localMethod1 = null;
      if (localHashMap != null)
        localMethod1 = (Method)localHashMap.get(this.a);
      if (localMethod1 == null)
      {
        localMethod1 = a(paramClass1, paramString, paramClass2);
        if (localHashMap == null)
        {
          localHashMap = new HashMap();
          paramHashMap.put(paramClass1, localHashMap);
        }
        localHashMap.put(this.a, localMethod1);
      }
      Method localMethod2 = localMethod1;
      return localMethod2;
    }
    finally
    {
      this.f.writeLock().unlock();
    }
  }

  public l a()
  {
    try
    {
      l locall = (l)super.clone();
      locall.a = this.a;
      locall.b = this.b;
      locall.e = this.e.a();
      locall.p = this.p;
      return locall;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    return null;
  }

  void a(float paramFloat)
  {
    this.q = this.e.a(paramFloat);
  }

  public final void a(c paramc)
  {
    this.b = paramc;
  }

  void a(Class paramClass)
  {
    this.c = a(paramClass, n, "set", this.d);
  }

  final void a(Object paramObject)
  {
    if (this.b != null)
    {
      try
      {
        this.b.a(paramObject);
        Iterator localIterator2 = this.e.e.iterator();
        while (localIterator2.hasNext())
        {
          g localg2 = (g)localIterator2.next();
          if (!localg2.c)
            localg2.a(this.b.a(paramObject));
        }
      }
      catch (ClassCastException localClassCastException)
      {
        Log.e("PropertyValuesHolder", "No such property (" + this.b.a() + ") on target object " + paramObject + ". Trying reflection instead");
        this.b = null;
      }
    }
    else
    {
      Class localClass = paramObject.getClass();
      if (this.c == null)
        a(localClass);
      Iterator localIterator1 = this.e.e.iterator();
      while (localIterator1.hasNext())
      {
        g localg1 = (g)localIterator1.next();
        if (!localg1.c)
        {
          if (this.h == null)
            this.h = a(localClass, o, "get", null);
          try
          {
            localg1.a(this.h.invoke(paramObject, new Object[0]));
          }
          catch (InvocationTargetException localInvocationTargetException)
          {
            Log.e("PropertyValuesHolder", localInvocationTargetException.toString());
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            Log.e("PropertyValuesHolder", localIllegalAccessException.toString());
          }
        }
      }
    }
  }

  public void a(float[] paramArrayOfFloat)
  {
    int i1 = 1;
    this.d = Float.TYPE;
    int i2 = paramArrayOfFloat.length;
    h[] arrayOfh = new h[Math.max(i2, 2)];
    if (i2 == i1)
    {
      arrayOfh[0] = ((h)new h());
      arrayOfh[i1] = ((h)g.a(1.0F, paramArrayOfFloat[0]));
    }
    while (true)
    {
      this.e = new e(arrayOfh);
      return;
      arrayOfh[0] = ((h)g.a(0.0F, paramArrayOfFloat[0]));
      while (i1 < i2)
      {
        arrayOfh[i1] = ((h)g.a(i1 / i2 - 1, paramArrayOfFloat[i1]));
        i1++;
      }
    }
  }

  final void b()
  {
    n localn;
    if (this.p == null)
    {
      if (this.d != Integer.class)
        break label44;
      localn = i;
    }
    while (true)
    {
      this.p = localn;
      if (this.p != null)
        this.e.f = this.p;
      return;
      label44: if (this.d == Float.class)
        localn = j;
      else
        localn = null;
    }
  }

  void b(Object paramObject)
  {
    if (this.b != null)
      this.b.a(paramObject, c());
    if (this.c != null);
    try
    {
      this.g[0] = c();
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

  Object c()
  {
    return this.q;
  }

  public String toString()
  {
    return this.a + ": " + this.e.toString();
  }
}

/* Location:
 * Qualified Name:     com.d.a.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
