package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Field;

public abstract class t
  implements SafeParcelable
{
  private static final Object a = new Object();
  private static ClassLoader b = null;
  private static Integer c = null;
  private boolean d = false;

  public t()
  {
  }

  private static ClassLoader a()
  {
    synchronized (a)
    {
      ClassLoader localClassLoader = b;
      return localClassLoader;
    }
  }

  private static boolean a(Class<?> paramClass)
  {
    try
    {
      boolean bool = "SAFE_PARCELABLE_NULL_STRING".equals(paramClass.getField("NULL").get(null));
      return bool;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      return false;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
    }
    return false;
  }

  protected static boolean b(String paramString)
  {
    ClassLoader localClassLoader = a();
    if (localClassLoader == null)
      return true;
    try
    {
      boolean bool = a(localClassLoader.loadClass(paramString));
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  protected static Integer s()
  {
    synchronized (a)
    {
      Integer localInteger = c;
      return localInteger;
    }
  }

  protected final boolean t()
  {
    return this.d;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
