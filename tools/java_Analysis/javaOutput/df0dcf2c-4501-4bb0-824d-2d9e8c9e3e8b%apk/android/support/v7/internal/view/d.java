package android.support.v7.internal.view;

import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

final class d
  implements MenuItem.OnMenuItemClickListener
{
  private static final Class<?>[] a = { MenuItem.class };
  private Object b;
  private Method c;

  public d(Object paramObject, String paramString)
  {
    this.b = paramObject;
    localClass = paramObject.getClass();
    try
    {
      this.c = localClass.getMethod(paramString, a);
      return;
    }
    catch (Exception localException)
    {
      InflateException localInflateException = new InflateException("Couldn't resolve menu item onClick handler " + paramString + " in class " + localClass.getName());
      localInflateException.initCause(localException);
      throw localInflateException;
    }
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    try
    {
      if (this.c.getReturnType() == Boolean.TYPE)
        return ((Boolean)this.c.invoke(this.b, new Object[] { paramMenuItem })).booleanValue();
      this.c.invoke(this.b, new Object[] { paramMenuItem });
      return true;
    }
    catch (Exception localException)
    {
      throw new RuntimeException(localException);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
