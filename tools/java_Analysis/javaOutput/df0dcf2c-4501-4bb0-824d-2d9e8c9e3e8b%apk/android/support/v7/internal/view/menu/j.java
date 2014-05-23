package android.support.v7.internal.view.menu;

import android.os.Build.VERSION;
import android.support.v4.a.a.b;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

abstract class j<T> extends k<T>
{
  private HashMap<MenuItem, b> b;
  private HashMap<SubMenu, SubMenu> c;

  j(T paramT)
  {
    super(paramT);
  }

  final b a(MenuItem paramMenuItem)
  {
    if (paramMenuItem != null)
    {
      if (this.b == null)
        this.b = new HashMap();
      Object localObject = (b)this.b.get(paramMenuItem);
      if (localObject == null)
        if (Build.VERSION.SDK_INT < 16)
          break label67;
      for (localObject = new w(paramMenuItem); ; localObject = new s(paramMenuItem))
      {
        this.b.put(paramMenuItem, localObject);
        return localObject;
        label67: if (Build.VERSION.SDK_INT < 14)
          break;
      }
      throw new UnsupportedOperationException();
    }
    return null;
  }

  final SubMenu a(SubMenu paramSubMenu)
  {
    if (paramSubMenu != null)
    {
      if (this.c == null)
        this.c = new HashMap();
      Object localObject = (SubMenu)this.c.get(paramSubMenu);
      if (localObject == null)
      {
        if (Build.VERSION.SDK_INT >= 14)
        {
          localObject = new ah(paramSubMenu);
          this.c.put(paramSubMenu, localObject);
        }
      }
      else
        return localObject;
      throw new UnsupportedOperationException();
    }
    return null;
  }

  final void a()
  {
    if (this.b != null)
      this.b.clear();
    if (this.c != null)
      this.c.clear();
  }

  final void a(int paramInt)
  {
    if (this.b == null);
    while (true)
    {
      return;
      Iterator localIterator = this.b.keySet().iterator();
      while (localIterator.hasNext())
        if (paramInt == ((MenuItem)localIterator.next()).getGroupId())
          localIterator.remove();
    }
  }

  final void b(int paramInt)
  {
    if (this.b == null);
    Iterator localIterator;
    do
    {
      return;
      while (!localIterator.hasNext())
        localIterator = this.b.keySet().iterator();
    }
    while (paramInt != ((MenuItem)localIterator.next()).getItemId());
    localIterator.remove();
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */