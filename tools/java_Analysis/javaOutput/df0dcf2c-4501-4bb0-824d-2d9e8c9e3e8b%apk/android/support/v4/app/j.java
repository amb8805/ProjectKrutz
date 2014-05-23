package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.ah;
import android.view.View;
import android.view.ViewGroup;

public abstract class j extends ah
{
  private final g a;
  private l b = null;
  private Fragment c = null;

  public j(g paramg)
  {
    this.a = paramg;
  }

  private static String a(int paramInt, long paramLong)
  {
    return "android:switcher:" + paramInt + ":" + paramLong;
  }

  public final Parcelable a()
  {
    return null;
  }

  public abstract Fragment a(int paramInt);

  public Object a(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.b == null)
      this.b = this.a.a();
    long l = paramInt;
    String str = a(paramViewGroup.getId(), l);
    Fragment localFragment = this.a.a(str);
    if (localFragment != null)
      this.b.c(localFragment);
    while (true)
    {
      if (localFragment != this.c)
      {
        localFragment.b(false);
        localFragment.c(false);
      }
      return localFragment;
      localFragment = a(paramInt);
      this.b.a(paramViewGroup.getId(), localFragment, a(paramViewGroup.getId(), l));
    }
  }

  public final void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
  }

  public final void a(ViewGroup paramViewGroup)
  {
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (this.b == null)
      this.b = this.a.a();
    this.b.b((Fragment)paramObject);
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).R == paramView;
  }

  public final void b(ViewGroup paramViewGroup)
  {
    if (this.b != null)
    {
      this.b.c();
      this.b = null;
      this.a.b();
    }
  }

  public final void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    Fragment localFragment = (Fragment)paramObject;
    if (localFragment != this.c)
    {
      if (this.c != null)
      {
        this.c.b(false);
        this.c.c(false);
      }
      if (localFragment != null)
      {
        localFragment.b(true);
        localFragment.c(true);
      }
      this.c = localFragment;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
