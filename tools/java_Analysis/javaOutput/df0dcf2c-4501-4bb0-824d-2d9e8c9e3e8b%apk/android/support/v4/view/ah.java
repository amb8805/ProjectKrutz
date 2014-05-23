package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class ah
{
  private DataSetObservable a = new DataSetObservable();

  public ah()
  {
  }

  public int a(Object paramObject)
  {
    return -1;
  }

  public Parcelable a()
  {
    return null;
  }

  public Object a(ViewGroup paramViewGroup, int paramInt)
  {
    throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
  }

  public final void a(DataSetObserver paramDataSetObserver)
  {
    this.a.registerObserver(paramDataSetObserver);
  }

  public void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
  }

  public void a(ViewGroup paramViewGroup)
  {
  }

  public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException("Required method destroyItem was not overridden");
  }

  public abstract boolean a(View paramView, Object paramObject);

  public abstract int b();

  public CharSequence b(int paramInt)
  {
    return null;
  }

  public final void b(DataSetObserver paramDataSetObserver)
  {
    this.a.unregisterObserver(paramDataSetObserver);
  }

  public void b(ViewGroup paramViewGroup)
  {
  }

  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
  }

  public float c(int paramInt)
  {
    return 1.0F;
  }

  public final void c()
  {
    this.a.notifyChanged();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.ah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
