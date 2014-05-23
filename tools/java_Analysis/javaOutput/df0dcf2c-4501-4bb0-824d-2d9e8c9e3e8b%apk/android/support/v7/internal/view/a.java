package android.support.v7.internal.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.a.c;
import android.support.v7.a.d;
import android.support.v7.a.e;
import android.support.v7.a.g;
import android.support.v7.a.k;
import android.util.DisplayMetrics;

public final class a
{
  private Context a;

  private a(Context paramContext)
  {
    this.a = paramContext;
  }

  public static a a(Context paramContext)
  {
    return new a(paramContext);
  }

  public final int a()
  {
    return this.a.getResources().getInteger(g.a);
  }

  public final int b()
  {
    return this.a.getResources().getDisplayMetrics().widthPixels / 2;
  }

  public final boolean c()
  {
    return this.a.getResources().getBoolean(d.a);
  }

  public final int d()
  {
    TypedArray localTypedArray = this.a.obtainStyledAttributes(null, k.a, c.b, 0);
    int i = localTypedArray.getLayoutDimension(0, 0);
    Resources localResources = this.a.getResources();
    if (!c())
      i = Math.min(i, localResources.getDimensionPixelSize(e.a));
    localTypedArray.recycle();
    return i;
  }

  public final boolean e()
  {
    return this.a.getApplicationInfo().targetSdkVersion < 14;
  }

  public final int f()
  {
    return this.a.getResources().getDimensionPixelSize(e.b);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
