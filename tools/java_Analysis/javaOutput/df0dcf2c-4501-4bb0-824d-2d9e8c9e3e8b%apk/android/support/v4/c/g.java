package android.support.v4.c;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

abstract class g<K, V>
{
  g<K, V>.i b;
  g<K, V>.j c;
  g<K, V>.l d;

  g()
  {
  }

  public static <T> boolean a(Set<T> paramSet, Object paramObject)
  {
    if (paramSet == paramObject);
    while (true)
    {
      return true;
      if ((paramObject instanceof Set))
      {
        Set localSet = (Set)paramObject;
        try
        {
          if (paramSet.size() == localSet.size())
          {
            boolean bool = paramSet.containsAll(localSet);
            if (bool);
          }
          else
          {
            return false;
          }
        }
        catch (NullPointerException localNullPointerException)
        {
          return false;
        }
        catch (ClassCastException localClassCastException)
        {
          return false;
        }
      }
    }
    return false;
  }

  protected abstract int a();

  protected abstract int a(Object paramObject);

  protected abstract Object a(int paramInt1, int paramInt2);

  protected abstract V a(int paramInt, V paramV);

  protected abstract void a(int paramInt);

  protected abstract void a(K paramK, V paramV);

  public final <T> T[] a(T[] paramArrayOfT, int paramInt)
  {
    int i = a();
    if (paramArrayOfT.length < i);
    for (Object localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i); ; localObject = paramArrayOfT)
    {
      for (int j = 0; j < i; j++)
        localObject[j] = a(j, paramInt);
      if (localObject.length > i)
        localObject[i] = null;
      return localObject;
    }
  }

  protected abstract int b(Object paramObject);

  protected abstract Map<K, V> b();

  public final Object[] b(int paramInt)
  {
    int i = a();
    Object[] arrayOfObject = new Object[i];
    for (int j = 0; j < i; j++)
      arrayOfObject[j] = a(j, paramInt);
    return arrayOfObject;
  }

  protected abstract void c();
}

/* Location:
 * Qualified Name:     android.support.v4.c.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
