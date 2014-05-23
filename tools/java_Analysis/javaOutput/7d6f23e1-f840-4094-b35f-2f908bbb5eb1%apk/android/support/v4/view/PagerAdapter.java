package android.support.v4.view;

import android.os.Parcelable;
import android.view.View;

public abstract class PagerAdapter
{
  public static final int POSITION_NONE = -2;
  public static final int POSITION_UNCHANGED = -1;
  private PagerAdapter.DataSetObserver mObserver;

  public PagerAdapter()
  {
  }

  public abstract void destroyItem(View paramView, int paramInt, Object paramObject);

  public abstract void finishUpdate(View paramView);

  public abstract int getCount();

  public int getItemPosition(Object paramObject)
  {
    return -1;
  }

  public abstract Object instantiateItem(View paramView, int paramInt);

  public abstract boolean isViewFromObject(View paramView, Object paramObject);

  public void notifyDataSetChanged()
  {
    if (this.mObserver != null)
      this.mObserver.onDataSetChanged();
  }

  public abstract void restoreState(Parcelable paramParcelable, ClassLoader paramClassLoader);

  public abstract Parcelable saveState();

  void setDataSetObserver(PagerAdapter.DataSetObserver paramDataSetObserver)
  {
    this.mObserver = paramDataSetObserver;
  }

  public abstract void startUpdate(View paramView);
}

/* Location:
 * Qualified Name:     android.support.v4.view.PagerAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
