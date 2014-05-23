package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.l;
import android.support.v4.view.x;
import android.support.v7.a.k;
import android.support.v7.internal.view.menu.r;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

final class e
{
  private Menu b;
  private int c;
  private int d;
  private int e;
  private int f;
  private boolean g;
  private boolean h;
  private boolean i;
  private int j;
  private int k;
  private CharSequence l;
  private CharSequence m;
  private int n;
  private char o;
  private char p;
  private int q;
  private boolean r;
  private boolean s;
  private boolean t;
  private int u;
  private int v;
  private String w;
  private String x;
  private String y;
  private l z;

  public e(c paramc, Menu paramMenu)
  {
    this.b = paramMenu;
    a();
  }

  private static char a(String paramString)
  {
    if (paramString == null)
      return '\000';
    return paramString.charAt(0);
  }

  private <T> T a(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      Object localObject = c.a(this.a).getClassLoader().loadClass(paramString).getConstructor(paramArrayOfClass).newInstance(paramArrayOfObject);
      return localObject;
    }
    catch (Exception localException)
    {
      Log.w("SupportMenuInflater", "Cannot instantiate class: " + paramString, localException);
    }
    return null;
  }

  private void a(MenuItem paramMenuItem)
  {
    boolean bool1 = true;
    MenuItem localMenuItem = paramMenuItem.setChecked(this.r).setVisible(this.s).setEnabled(this.t);
    if (this.q > 0);
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      localMenuItem.setCheckable(bool2).setTitleCondensed(this.m).setIcon(this.n).setAlphabeticShortcut(this.o).setNumericShortcut(this.p);
      if (this.u >= 0)
        x.a(paramMenuItem, this.u);
      if (this.y == null)
        break label162;
      if (!c.a(this.a).isRestricted())
        break;
      throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
    }
    paramMenuItem.setOnMenuItemClickListener(new d(c.c(this.a), this.y));
    label162: r localr;
    if ((paramMenuItem instanceof r))
    {
      localr = (r)paramMenuItem;
      if ((localr != null) && (this.q >= 2))
        localr.a(bool1);
      if (this.w == null)
        break label281;
      x.a(paramMenuItem, (View)a(this.w, c.b(), c.d(this.a)));
    }
    while (true)
    {
      if (this.v > 0)
      {
        if (bool1)
          break label270;
        x.b(paramMenuItem, this.v);
      }
      while (true)
      {
        if (this.z != null)
          x.a(paramMenuItem, this.z);
        return;
        localr = null;
        break;
        label270: Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
      }
      label281: bool1 = false;
    }
  }

  public final void a()
  {
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = 0;
    this.g = true;
    this.h = true;
  }

  public final void a(AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = c.a(this.a).obtainStyledAttributes(paramAttributeSet, k.j);
    this.c = localTypedArray.getResourceId(1, 0);
    this.d = localTypedArray.getInt(3, 0);
    this.e = localTypedArray.getInt(4, 0);
    this.f = localTypedArray.getInt(5, 0);
    this.g = localTypedArray.getBoolean(2, true);
    this.h = localTypedArray.getBoolean(0, true);
    localTypedArray.recycle();
  }

  public final void b()
  {
    this.i = true;
    a(this.b.add(this.c, this.j, this.k, this.l));
  }

  public final void b(AttributeSet paramAttributeSet)
  {
    int i1 = 1;
    TypedArray localTypedArray = c.a(this.a).obtainStyledAttributes(paramAttributeSet, k.k);
    this.j = localTypedArray.getResourceId(2, 0);
    int i2 = localTypedArray.getInt(5, this.d);
    int i3 = localTypedArray.getInt(6, this.e);
    this.k = (i2 & 0xFFFF0000 | i3 & 0xFFFF);
    this.l = localTypedArray.getText(7);
    this.m = localTypedArray.getText(8);
    this.n = localTypedArray.getResourceId(0, 0);
    this.o = a(localTypedArray.getString(9));
    this.p = a(localTypedArray.getString(10));
    int i4;
    if (localTypedArray.hasValue(11))
      if (localTypedArray.getBoolean(11, false))
      {
        i4 = i1;
        this.q = i4;
        label151: this.r = localTypedArray.getBoolean(3, false);
        this.s = localTypedArray.getBoolean(4, this.g);
        this.t = localTypedArray.getBoolean(i1, this.h);
        this.u = localTypedArray.getInt(13, -1);
        this.y = localTypedArray.getString(12);
        this.v = localTypedArray.getResourceId(14, 0);
        this.w = localTypedArray.getString(15);
        this.x = localTypedArray.getString(16);
        if (this.x == null)
          break label316;
        label246: if ((i1 == 0) || (this.v != 0) || (this.w != null))
          break label321;
      }
    for (this.z = ((l)a(this.x, c.a(), c.b(this.a))); ; this.z = null)
    {
      localTypedArray.recycle();
      this.i = false;
      return;
      i4 = 0;
      break;
      this.q = this.f;
      break label151;
      label316: i1 = 0;
      break label246;
      label321: if (i1 != 0)
        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
    }
  }

  public final SubMenu c()
  {
    this.i = true;
    SubMenu localSubMenu = this.b.addSubMenu(this.c, this.j, this.k, this.l);
    a(localSubMenu.getItem());
    return localSubMenu;
  }

  public final boolean d()
  {
    return this.i;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
