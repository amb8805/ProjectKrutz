package com.google.common.base;

public final class e
{
  public static f a(Object paramObject)
  {
    String str = paramObject.getClass().getName().replaceAll("\\$[0-9]+", "\\$");
    int i = str.lastIndexOf('$');
    if (i == -1)
      i = str.lastIndexOf('.');
    return new f(str.substring(i + 1), (byte)0);
  }

  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }

  public static <T> T b(T paramT1, T paramT2)
  {
    if (paramT1 != null)
      return paramT1;
    return i.a(paramT2);
  }
}

/* Location:
 * Qualified Name:     com.google.common.base.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
